import java.util.Random;
import java.util.Scanner;
class Arary{
	
	  int partition(int a[],int low, int high)
		{
			int p=a[low];
			int i=low+1;
			int j =high;
			while(low<high){
				while(a[i]<=p && i<high)
					i++;
				while (a[j]>p)
					j--;
				if(i<j){
				int t;
				t=a[i];
				a[i]=a[j];
				a[j]=t;}
				else
				{
					int t;
					t=a[low];
					a[low]=a[j];
					a[j]=t;
					return j;
				}
				
			}
			return j;
		}
		 void qsort(int a[],int low,int high){
			if(low<high){
				int s=partition(a,low,high);
				qsort(a,low,s-1);                              
				qsort(a,s+1,high);
			}
		}
		
	}


public class Quicksort {
	public static void main(String[] args) {
	      int n;
	      Scanner s = new Scanner(System.in);
	      System.out.println("Enter the number");
	      n=s.nextInt();
	      Arary q = new Arary();
	      Random r = new Random();
	      int b[]=new int[n];
    	  System.out.println("array before sort");

	      for(int i=0;i<n;i++)
	      {
	    	  b[i]=r.nextInt(100);
	    	  System.out.println(b[i]);
	      }
	      long starttime=System.nanoTime();
	      
	  q.qsort(b,0,(n-1));
      long endtime=System.nanoTime();
      double e=endtime-starttime;
      System.out.println("Time complexity= "+(e/1000000));
	  System.out.println("Array after sort");
	    for(int i=0;i<n;i++)
	        System.out.println(b[i]);
		}
}
	   