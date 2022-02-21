package PracticeProj;
import java.util.Scanner;
class Calc
{
	float Sum(float x,float y)
	{
		float sum=x+y;
		return sum ;
	}
	
	float Diff(float x,float y)
	{
		float diff=x-y;
		return diff;
	}
	
	float Mul(float x, float y)
	{
		float mul=x*y;
		return mul;
	}
	
	float Div(float x, float y)
	{
		float div=x/y;
		return div;
	}
}

public class Calculator {
	public static void main(String[] args)
	{
		float a,b,d;
		Calc c=new Calc();
		int n;
		Scanner sc= new Scanner(System.in);
		
		
		while(true)
		{
			
			System.out.println("press 1 for Addition\n"
					+ "press 2 for Sub\n"
					+ "press 3 for Mul\n"
					+ "press 4 for Div\n"
					+ "press 5 to Exit");
			n=sc.nextInt();
			
			
			
			if(n==1) 
			{
				System.out.println("Enter two number");
				a=sc.nextFloat();
				b=sc.nextFloat();
				d=c.Sum(a,b);
				System.out.println(d);
				
			}
			else if(n==2)
			{
				System.out.println("Enter two number");
				a=sc.nextFloat();
				b=sc.nextFloat();
				d=c.Diff(a,b);
				System.out.println(d);
				
			}
			else if(n==3)
			{
				System.out.println("Enter two number");
				a=sc.nextFloat();
				b=sc.nextFloat();
				d=c.Mul(a,b);
				System.out.println(d);
				
			}
			else if(n==4)
			{
				System.out.println("Enter two number");
				a=sc.nextFloat();
				b=sc.nextFloat();
				d=c.Div(a,b);
				System.out.println(d);
				
			}
			else if(n==5)
			{
				System.out.println("Exited");
				break;
			}
			else 
			{
				System.out.println("Choose any number from 1 to 5");
			}
			 
		} 
		sc.close();
	}
	
		
}



