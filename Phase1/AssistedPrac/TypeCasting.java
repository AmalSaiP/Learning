package Demo;

import java.util.Scanner;

public class TypeCasting {
	public static void main(String[ ] args) {

		char c = 'A';
		int a= c;
		System.out.println(a);
		
		
		
		Scanner s=new Scanner(System.in);
		int v= s.nextInt();
		char d=(char)v;
		System.out.println(d);
		}


}
