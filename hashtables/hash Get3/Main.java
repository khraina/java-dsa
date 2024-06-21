public class Main {

    public static void main(String[] args) {

        HashTable myHashTable = new HashTable();
        //set key=value-pair in dictionary
        myHashTable.set("nails", 100);
        myHashTable.set("tile", 50);
        myHashTable.set("lumber", 80);

        //get the value of the key
        System.out.println("Lumber:");
        System.out.println( myHashTable.get("lumber") );

        System.out.println("\nBolts:");
        System.out.println( myHashTable.get("bolts") );

    }
}


//output

/*

Lumber:
80

Bolts:
0
   
 */