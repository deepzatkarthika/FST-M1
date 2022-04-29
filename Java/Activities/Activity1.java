public class Activity1 {

    public static void main(String args[]){
        Car car1=new Car();
        car1.color="Black";
        car1.make=2014;
        car1.transmission="Manual";
        car1.displayCharacteristics();
        car1.accelerate();
        car1.brake();
    }
}

 class Car{
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;

     Car(){
        this.doors=4;
        this.tyres=4;
    }

    public void displayCharacteristics(){
        System.out.println("Color is " + color);
        System.out.println("Transmission is " + transmission);
        System.out.println("Make is " + make);
        System.out.println("Tyres is " + tyres);
        System.out.println("Doors is " + doors);

    }
    public void accelerate(){
        System.out.println("Car is moving forward");
    }

    public void brake(){
        System.out.println("Care has stopped");
    }

}
