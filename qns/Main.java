public class Main
{
     static void towerofhanoi(int n,char fromrod,char torod, char auxrod)
     {
        if(n==1)
        {
            System.out.println("Move disk 1 from rod "+fromrod+" to rod "+torod);
            return;
        }

        towerofhanoi(n-1,fromrod,auxrod,torod);
        System.out.println("Move disk "+n+" from rod "+fromrod+" to rod "+torod);
        towerofhanoi(n-1,auxrod,torod,fromrod);
     }

     public static void main(String args[])
     {
        int n=3;
        towerofhanoi(n,'A','C','B');
     }
}


/* Move disk 1 from rod A to rod C
Move disk 2 from rod A to rod B
Move disk 1 from rod C to rod B
Move disk 3 from rod A to rod C
Move disk 1 from rod B to rod A
Move disk 2 from rod B to rod C
Move disk 1 from rod A to rod C  */
