public class Main
{
	public static void main(String[] args) {
	    
	    int n=4,m=5;
		for(int i=1;i<=n;i++)   //rows-outer loop
		{
		    for(int j=1;j<=m;j++)  //coloumns-inner loop
		    {
		        if(i==1||j==1||i==n||j==m)
		        System.out.print("*");
		        else
		        System.out.print(" "); //provide space in middle
		    }
		    
		    System.out.println();
		}
	}
}


/*output   
*****
*   *
*   *
*****

*/


