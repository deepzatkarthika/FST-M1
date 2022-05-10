
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Activity9 {

    public static void main(String[] args) {
    List<String> myList = new LinkedList<String>();
    myList.add("reena");
    myList.add("seena");
    myList.add("teena");
    myList.add("heena");
    myList.add("leena");


    Iterator it = myList.iterator();

    while(it.hasNext())
    {
        System.out.println(it.next());
    }
    System.out.println(" Operations");
    System.out.println(myList.get(2));
    System.out.println(myList.contains("teena"));
    System.out.println(myList.size());
    System.out.println(myList.remove("leena"));
    System.out.println(myList.size());
    myList.add(4,"helen");
    myList.set(4,"Tom");
    System.out.println(myList.get(4));

    }

}
