package java_assignment;
 
import java.io.IOException;
		
	public class thread extends Thread{

		public void run(){		

			System.out.println("Thread :"+Thread.currentThread().getId() +" is Running");
		 }

			public static void main (String [] args){
				int n =20;
				for (int i=0; i < n;i++)
				{
								
					thread object = new thread() ;
					object.start();
					
				}
		}

}
