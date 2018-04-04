import java.util.Scanner;
import java.util.*;


public class Exeptiondemo {

	
	public static void main(String[] args) {
		int a,b;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the value of a and b ");
	    a=s.nextInt();
	    b=s.nextInt();
	    try{
	    	int c=a/b;
	    	System.out.println(c);
	       }
	    catch(Exception e)
	    {
	    	System.out.println(e.getMessage());
	        e.printStackTrace();
	        System.out.println(e);
		
	}
 }
}
