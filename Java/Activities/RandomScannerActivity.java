import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RandomScannerActivity {

    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        List<Integer> list=new ArrayList<Integer>();
        Random indexGen=new Random();
        System.out.print("Enter integers please ");
        System.out.println("(EOF or non-integer to terminate): ");

        while(scan.hasNextInt())
        {
           list.add(scan.nextInt());
        }

        Integer num[]=list.toArray(new Integer[0]);
        int index = indexGen.nextInt(num.length);
        System.out.println("Index value generated: " + index);
        System.out.println("Value in array at generated index: " + num[index]);

    }
}