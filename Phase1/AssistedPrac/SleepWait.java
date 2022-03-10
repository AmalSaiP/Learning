package AssistedPracProj;

public class SleepWait {
	public static final Object L=new Object();
	public static void main(String[] args)throws InterruptedException {
		System.out.println("Welcome");
		Thread.sleep(2000);
		System.out.println(Thread.currentThread().getName()+"");
		
		synchronized (L) {
			L.wait(3000);
			System.out.println("Lock" +L+" is release after 3 sec ");
			
		}
	}

}
