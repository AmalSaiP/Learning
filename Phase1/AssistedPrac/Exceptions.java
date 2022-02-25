package AssistedPracProj;

public class Exceptions extends Example{
	public static void main(String args[]) {
		try {
			System.out.println("Starting of try block");
			// I'm throwing the custom exception using throw
			throw new Exception("This is My error Message");
		} catch (Exception exp) {
			System.out.println("Catch Block");
			System.out.println(exp);
		}
	}

		
}
	 class Example {
		String str1;

		void Example(String str2) {
			str1 = str2;
		}

		public String toString() {
			return ("Exceptions Occurred: " + str1);
		}
	}
