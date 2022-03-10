package AssistedPracProj;

import java.util.Scanner;

public class InnerClass {
	private String msg;
	Scanner sc = new Scanner(System.in);

	class Inner {
		void hello() {
			System.out.println("Enter String");
			System.out.println(msg=sc.nextLine()+",It is an Inner Classes");
		}
	}

	public static void main(String[] args) {

		InnerClass obj = new InnerClass();
		InnerClass.Inner in = obj.new Inner();
		in.hello();
	}
}
