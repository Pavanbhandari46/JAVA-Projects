import java.util.Scanner;
import java.util.*;


      class staff{
		String id;
		String  name;
		long ph;
		int salary;
		Scanner sc=new Scanner(System.in);
		void read()
		{
			id=sc.next();
			name=sc.next();
			ph=sc.nextLong();
			salary=sc.nextInt();
		}
		void dislay()
		{
			System.out.println(id+name+ph+salary);
		}
	}
		
		
		
		
		
	class teaching extends staff{
		String domain;
		int publication;
		void teachingread()
		{
			super.read();
			System.out.println("enter the domain");
			domain=sc.next();
			System.out.println("enter the publication");
			publication=sc.nextInt();
        }
	    void teachingdisplay()
	    {
	    	super.dislay();
	    	System.out.println(domain+publication);
	    }
	}
	
	
	
	
	
	
	
	
	
	
	class technical extends staff{
		String skill;
		void technicalread()
		{
			super.read();
			System.out.println("enter the skill");
			skill=sc.next();
		}
	    void technicaldisplay()
	    {
	    	super.dislay();
	    	System.out.println("+skill");
	    }
	   }
	
	
	
	
	
	
	
	
class contract extends staff{
	int period;
	void contractread()
	{
		super.read();
		System.out.println("enter the period");
		period =sc.nextInt();
	}
		
    void contractdisplay()
    {
    	super.dislay();
    	System.out.println("+period");
    }
}

	
	
	
	
	public class Inheritance{
		
	public static void main(String[] args) {
    System.out.println("enter the no of staff");
	Scanner sc=new Scanner(System.in);
    int n= sc.nextInt();
    teaching tg[]=new teaching[n];
    technical tc[]= new technical[n];
    contract  c[]=new contract[n];
    int q=1;
    while (q!=0)
    {
    	System.out.println("1:TEACHING\n2:TEACHING\n3:TECHNICAL\n4:EXIT");
    	System.out.println("enter your choice");
    	int ch=sc.nextInt();
    	switch(ch)
    	{
    	case 1:
    		System.out.println("teaching staff details");
    		for(int i=0;i<n;i++)
    		{
    			tg[i]=new teaching();
    			System.out.println("enter details");
    			tg[i].teachingread();
    			
    		}
    		for(int i=0;i<n;i++)
    			tg[i].teachingdisplay();
    		break;
    	case 2:
    		System.out.println("technical staff details");
    		for(int i=0;i<n;i++)
    		{
    			tc[i]=new technical();
    			System.out.println("enter details");
    			tc[i].technicalread();
    			
    		}
    		for(int i=0;i<n;i++)
    			tc[i].technicaldisplay();
    		break;
    	case 3:
    		System.out.println("contract staff details");
    		for(int i=0;i<n;i++)
    		{
    			c[i]=new contract();
    			System.out.println("enter details");
    			c[i].contractread();
    			
    		}
    		for(int i=0;i<n;i++)
    			c[i].contractdisplay();
    		break;
    	}
    }
	}
	}

