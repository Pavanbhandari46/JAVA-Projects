import java.util.Random;
import java.util.Scanner;


public class Mergsort {
	static int max=10000;
 void sort(int a[],int l, int h)
	{
		if(l<h){
			int m=(l+h)/2;
			sort(a,l,m);
			sort(a,m+1,h);
			merg(a,l,m,h);
		}
		
    }
 void merg(int a[],int l,int m,int h)
{
int i=l;
int j=m+1;
int k=l;
int r[]=new int[max];
while(i<=m && j <= h)
{
	if(a[i]<a[j])
	{
     	r[k]=a[i];
	    i++;
	    k++;
	}
	else
	{
	   r[k]=a[j];
	   j++;
	   k++;
	}
}
while(i<=m)
{
	r[k]=a[i];
	 i++;
	   k++;
}
while(j<=i)
	r[k++]=a[j++];
for(int m1=l;m1<=h;m1++)
{
	a[m1]=r[m1];
}
}

	
public static void main(String[] args) {
		 int n;
	      Scanner s = new Scanner(System.in);
	      System.out.println("Enter the number");
	      n=s.nextInt();
	      Random r = new Random();
	      Mergsort q=new Mergsort();
	      int a[]=new int[n];
   	  System.out.println("array before sort");

	      for(int i=0;i<n;i++)
	      {
	    	  a[i]=r.nextInt(100);
	    	  System.out.println(a[i]);
	      }
	      long starttime=System.nanoTime();
	      
	 q.sort(a,0,(n-1));
     long endtime=System.nanoTime();
     double e=endtime-starttime;
     System.out.println("Time complexity= "+(e/1000000));
	  System.out.println("Array after sort");
	    for(int i=0;i<n;i++)
	        System.out.println(a[i]);
	}

}
