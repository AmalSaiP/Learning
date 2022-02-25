package AssistedPracProj;

public class StringDemo {
	public static void main(String[] args) {
		//methods of strings
		System.out.println("Methods of Strings");
		
		String s=new String("Hi this is me and learning java from simplilearn");
		String s2=new String("Hi this is me and preparing java from simplilearn");
		System.out.println(s.length());

		//substring
		
		System.out.println(s.substring(2));

		//String Comparison
		
		System.out.println(s.compareTo(s2));

		//IsEmpty
		
		System.out.println(s.isEmpty());

		//toLowerCase
		
		System.out.println(s.toLowerCase());
		
		//replace
		
		String replace=s.replaceAll("and", "me");
		System.out.println(replace);

		//equals
		
		System.out.println(s.equals(s2));
 
		

		//replace method
		StringBuffer sb=new StringBuffer("ZXYYVMPOENRSDF");
		sb.replace(0, 2, "Abc");
		System.out.println(sb);

		//delete method
		sb.delete(0, 1);
		System.out.println(sb);
		
		            		
	}


}
