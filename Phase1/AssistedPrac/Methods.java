package AssistedPracProj;

class callMethod {

	int val=150;

	int operation(int val) 
	{
		val =val*10/100;
		return(val);
	}
}
class overloadMethod {
	
	public void area(int b,int h)
    {
         System.out.println("Area of Triangle : "+(0.5*b*h));
    }
	public void area(int r) 
    {
         System.out.println("Area of Circle : "+(3.14*r*r));
    }
}

public class Methods {
	public int multipynumbers(int a,int b)
	{
		int z=a*b;
		return z;
	}
	public static void main(String[] args)
	{

		Methods a=new Methods();
		int ans= a.multipynumbers(20,4);
		System.out.println("Multipilcation is :"+ans);
		
		callMethod b=new callMethod();
		System.out.println("Before operation value of data is "+b.val);
		b.operation(50);
		System.out.println("After operation value of data is "+b.val);

		overloadMethod c=new overloadMethod();
	       c.area(20,4);
	       c.area(20);  

	}


}


