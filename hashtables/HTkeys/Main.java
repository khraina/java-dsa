import java.util.*;

public class Main{
    public static void main(String args[])
    {
        HashTable myht=new HashTable();

        myht.set("paint",20);
        myht.set("bolts",40); 
        myht.set("nails",100); 
        myht.set("tile",50); 
        myht.set("lumbar",80);

        System.out.println(myht.keys());
    }
}

/* output 
[paint, bolts, lumbar, nails, tile]
*/