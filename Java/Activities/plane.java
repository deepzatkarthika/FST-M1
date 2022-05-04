import sun.invoke.empty.Empty;

import java.util.*;

public class plane {

        private List<String> passengers;
        private int maxPassengers;
        private Date lastTimeTookOf;
        private Date lastTimeLanded;
    plane(int max){
        maxPassengers=max;
        //passengers=null;

    }

    public void onboard(){

        Scanner input=new Scanner(System.in);
        passengers=new LinkedList<String>();

        System.out.println("Enter names of passengers");
        for(int i=0; i<maxPassengers;i++)
        {
            passengers.add(input.nextLine());
        }

    }

    public void takeOff(){
        lastTimeTookOf= new Date();
        System.out.println(lastTimeTookOf);

    }

    public void land(){
        lastTimeLanded=new Date();

        for(int i=0;i<passengers.size();i++) {
            passengers.remove(i);
        }
    }

   public Date getLastTimeLanded(){

        return lastTimeLanded;
}
  public void getPassengers(){
      for(int i=0; i<maxPassengers;i++)
      {
          System.out.println(passengers.get(i));
      }
  }

}
class Activity6{
    public static void main(String[] args) throws InterruptedException {
        plane p=new plane(10);
        p.onboard();
        p.takeOff();
        p.getPassengers();
        Thread.sleep(5000);
        p.land();
        System.out.println("landed at "+ p.getLastTimeLanded());
    }
}