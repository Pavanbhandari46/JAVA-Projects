import java.util.*;
public class Stack
{
 int top=-1;
 public void push(int e,int c,int a[])
 {
	 if(top<c-1)
	 {
		 top++;
	     a[top]=e;
	 }
	 else 
		 System.out.println("OVERFLOW");
 }
 public void pop()
 {
	 if(top>-1)
		 top--;
	 else
		 System.out.println("UNDERFLOW");
 }
 public void display(int a[])
{
	for(int i=top;i>-1;i--)
		System.out.println(a[i]);
}
	public static void main(String[] args)
	{
	 	int ch,cap;
	 	Scanner s= new Scanner(System.in);
	 	Stack o= new Stack();
	    System.out.println("ENTER CAPACITY");
	 	cap=s.nextInt();
	 	int ar[]=new int[cap];
	 	while(true)
	 	{
	 		System.out.println("...MENU...\n1:PUSH\n2:POP\n3:DISPALY\n4:EXIT");
	 		System.out.println("ENTER YOUR CHOICE");
	 		ch=s.nextInt();
	 		switch(ch)
	 		{
	 		case 1:System.out.println("ENTER THE ELEMENT TO INSERT");
	 		       int ele=s.nextInt();
	 		       o.push(ele, cap, ar);
	 		       break;
	 		case 2:o.pop();
	 		       break;
	 		case 3:o.display(ar);
	 		       break;
	 		case 4:System.exit(0);
	 		
	 		
	 		}
	 	}
	}

}
