import java.security.PublicKey;
import java.util.*;


class first extends Thread{
	Random r = new Random();
		
			public void run()
			{
				for(int i=0;i<5;i++){
				int n = r.nextInt(10);
				System.out.println(n);
				Second a =new Second(n);
				Thread t2 = new Thread(a);
				t2.start();
			


				Thread t3 = new Thread(new third(n));
				t3.start();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
				
			}
			
		}
	}
class Second extends Thread
 {
        int x;
        public Second(int x)
           {
             	this.x=x;
           }
      public void run(){
     	System.out.println("square ="+(x*x));
	
       }
}
class third extends Thread
{
       int x;
       public third(int x)
          {
            	this.x=x;
          }
     public void run(){
    	System.out.println("cube  ="+(x*x*x));
	
      }
}

public class Threaddemo {
	public static void main(String[] args) {
         first t1 =new first();
         t1.start();
	}

}
