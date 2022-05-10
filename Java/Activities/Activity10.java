import java.util.HashSet;
import java.util.Iterator;

public class Activity10 {

    public static void main(String[] args) {


        HashSet hs = new HashSet();
        hs.add("Hello");
        hs.add("thank u");
        hs.add("Welcome");
        hs.add("Thanks");
        hs.add("hi");

        System.out.println(hs.size());
        System.out.println(hs.remove("Hello"));
        System.out.println(hs.remove("Bye"));
        System.out.println(hs.contains("Welcome"));

        Iterator it=hs.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }



    }
}