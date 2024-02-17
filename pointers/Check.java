
import java.util.HashMap;

public class Check {
    public static void main(String args[])
    {
        int n=11;
        int n2=n;  //without pointer, only during initalizing 

        n=22;    //further n is initalied n2 is same

        System.out.println("num1 "+n);
        System.out.println("num2 "+n2);

        HashMap<String, Integer> map1=new HashMap<>();  //hashmap are pointers
        HashMap<String, Integer> map2=new HashMap<>();

        // Adding elements to the Map
        // using standard put() method
        map1.put("value",11);
        map2=map1;
        map1.put("value",22); // overwrite value with new value 22
        System.out.println(map1);
        
        System.out.println(map2);  

    }
    
}
