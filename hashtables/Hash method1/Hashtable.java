import java.util.*;


public class HashTable{
    
    private int size=7;
    private Node[] dataMap;
    
    class Node{
        String key;
        int value;
        Node next;
    
    
         Node(String key,int value) //constructor for node
        {
            this.key=key;
            this.value=value;
        }
    }
    
    public HashTable(){               //??
        dataMap=new Node[size];
    }
    
    public void printTable(){
        for(int i=0;i<dataMap.length;i++)
        {
            System.out.println(i+":");    //Index
            Node temp=dataMap[i];
            while(temp!=null)
            {
                System.out.println("\n {"+temp.key+"= "+temp.value+"}");
            
                temp=temp.next;
            }
        }
    }
    
    
    // HASH METHOD(computes hash/index) MUST BE PUBLIC FOR CODE IN MAIN TO WORK
    //output 2 4 6 5 6
    
    public int hash(String key){
        int hash=0;
        char[] keyChars=key.toCharArray();                //string to`
        for(int i=0;i<keyChars.length;i++)
        {
            int ascii=keyChars[i];
            hash=(hash+ascii*23)%dataMap.length;
        }
        return hash;
    }
    
    
}
