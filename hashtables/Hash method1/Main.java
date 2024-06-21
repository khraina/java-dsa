import java.util.*;

public class Main
{
	public static void main(String[] args) {
		HashTable myht=new HashTable();
		myht.printTable();
		System.out.println( myht.hash("paint",100));
        System.out.println( myht.hash("bolts",50));
        System.out.println( myht.hash("nails",80));
        System.out.println( myht.hash("stuff",200));
        System.out.println( myht.hash("lumber",140));
		

	}
}