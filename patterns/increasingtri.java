/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    
	    int n=4,m=5;
		for(int i=1;i<=n;i++)   //rows-outer loop
		{
		    for(int j=1;j<=m;j++)  //coloumns-inner loop
		    {
		        if(i>=j)
		        System.out.print("*"); 
		        else
		        System.out.print(" "); //provide space in middle
		    }
		    
		    System.out.println();
		}
		
		//another method 
		
		for(int i=1;i<=n;i++)
		{
		    for(int j=1;j<=i;j++)
		    {
		        System.out.print("*");
		    }
		    System.out.println();
		}
	}
}

/*output  


*
**
***
****


*/
