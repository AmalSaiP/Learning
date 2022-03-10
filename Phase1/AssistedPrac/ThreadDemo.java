package Demo;

public class ThreadDemo extends Thread {

	public static void main(String[] args) {
		
		ThreadDemo td=new ThreadDemo();
		//System.out.println(td);
		td.setName("Child");
		td.setPriority(5);
		//System.out.println(td);
		
		ThreadDemo td1=new ThreadDemo();
		//System.out.println(td);
		td1.setName("Child111");
		td1.setPriority(10);
		td.start();
		td1.start();
	}
	

	@Override
	public void run() {
		// TODO Auto-generated method stub"
		System.out.println("Run method is executing");
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}
	
}
