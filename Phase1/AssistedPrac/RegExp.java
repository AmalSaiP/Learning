package AssistedPracProj;

import java.util.regex.*;

public class RegExp {

	public static void main(String[] args) {

		String pattern = "[a-zA-Z]+";
		String check = "My Password contains @,# and All the numbers for 1 to 10";
		Pattern p = Pattern.compile(pattern);
		Matcher c = p.matcher(check);
		
		while (c.find())
	      	System.out.println( check.substring( c.start(), c.end() ) );
		}

}
