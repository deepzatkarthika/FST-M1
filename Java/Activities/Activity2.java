import com.sun.deploy.security.SelectableSecurityManager;

public class Activity2 {


    public static void main(String[] args)
    {
      int[]  numArray={10,77,10,54,-11,10};
      int arrIndex=0;
      int sum=0;
      while(arrIndex < numArray.length)
      {
          if(numArray[arrIndex]==10){
              sum=sum+numArray[arrIndex];

          }
          arrIndex++;
      }
      if(sum==30)

          System.out.println("True");

      else
          System.out.println("False");
    }
}
