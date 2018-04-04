import java.util.Scanner;
import java.util.StringTokenizer;


public class Customer {

		String name;
		String dob;
		void read()
		{
			Scanner sc = new Scanner(System.in);
			name =sc.next();
			dob=sc.next();
		}
	void display()
	{
		System.out.println();
		String delims="/";
		StringTokenizer st= new StringTokenizer(dob,delims);
		while(st.hasMoreElements()){
			System.out.println(","+st.nextElement());
		}
		}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of customer");
		int n=sc.nextInt();
		Customer o[]=new Customer[n];
		for(int i=0;i<n;i++)
		{
		o[i].new Customer();
		o[i].read();
		}
		for(int i=0;i<n;i++)
		o[i].display();
	}

}
