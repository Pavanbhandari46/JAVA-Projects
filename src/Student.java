import java.util.*;
public class Student
{
       String Name,Usn,Branch;
	   long Ph;
	   void insert(String name,String usn,String branch,long ph )
	   {
		   Name=name;
		   Usn=usn;
		   Branch=branch;
		   Ph=ph;
	   }
	   void display()
	   {
		   System.out.println("NAME="+Name+"\nUSN="+Usn+"\nBRANCH="+Branch+"\nPHONE="+Ph);
	   }
public static void main(String[] args) 
{
	Scanner sc = new Scanner(System.in);
	System.out.println("ENTER THE NO OF STUDENTS");
	int n=sc.nextInt();
	int i;
	Student s[] = new Student [n];
	for(i=0;i<n;i++)
		s[i]=new Student();
	System.out.println("ENTER THE STUDENT INFO");
	for(i=0;i<n;i++)
	{
		String Name=sc.next();
		String Usn=sc.next();
		String Branch=sc.next();
		long Ph=sc.nextLong();
        s[i].insert(Name, Usn, Branch, Ph);
		
    }
	for(i=0;i<n;i++)
   s[i].display();
		
}

}
