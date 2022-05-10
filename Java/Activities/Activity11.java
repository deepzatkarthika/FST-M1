import java.util.HashMap;
import java.util.Map;

public class Activity11 {

    public static void main(String[] args){
        Map<Integer,String> colors= new HashMap<Integer,String>();
        colors.put(1,"Red");
        colors.put(2,"Blue");
        colors.put(3,"White");
        colors.put(4,"Black");
        colors.put(5,"yellow");

        System.out.println(colors);
        colors.remove(5);
        System.out.println(colors);
        System.out.println("Green is present in set (True/False) : "+colors.containsValue("Green"));
        System.out.println("Size is "+colors.size());

    }
}
