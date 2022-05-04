public class Bicycle implements BicycleParts, BicycleOperations {


    int currentSpeed;
    @Override
    public void applyBrake(int decrement){
       currentSpeed=BicycleParts.speed-decrement;
       System.out.println("Current speed after brake"+currentSpeed);
    }

    @Override
    public void speedUp(int increment){
        currentSpeed=BicycleParts.speed+increment;
        System.out.println("Current Speed after speed up"+currentSpeed);
    }

   public void bicyleDesc()
   {
        System.out.println(gears);
        System.out.println(speed);
   }

}

interface BicycleParts{
Integer gears =Integer.valueOf(4);
Integer speed=Integer.valueOf(200);

 }

 interface BicycleOperations{
    void applyBrake(int decrement);
    void speedUp(int increment);

 }

 class mountainBike extends Bicycle{
    int seatHeight;
    mountainBike(int seatHeight)
    {

        seatHeight=0;
    }
    public void setHeight(int newvalue){
      seatHeight=newvalue;
    }

     @Override
     public void bicyleDesc() {
         super.bicyleDesc();
         System.out.println("Height"+seatHeight);
     }
 }

 class driver{
    public static void main( String[] args){
        mountainBike mB=new mountainBike(10);
        mB.bicyleDesc();
        mB.applyBrake(10);
        mB.speedUp(50);
        mB.bicyleDesc();
    }
 }