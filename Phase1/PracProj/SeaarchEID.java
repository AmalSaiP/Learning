package PracticeProj;

import java.util.ArrayList;
import java.util.Scanner;
public class SeaarchEID
{
   public static void main(String[] args)
   {
      ArrayList <String> email = new ArrayList<String>();
     
      email.add("abcd@gmail.com");
      email.add("efgh@gmail.com");
      email.add("ijkl@gmail.com");
      email.add("mnop@gmail.com");
      email.add("qrst@gmail.com");
      email.add("uvwx@gmail.com");
      email.add("yzab@gmail.com");
      email.add("cdef@gmail.com");
      email.add("ghij@gmail.com");
      email.add("klmn@gmail.com");
      Scanner sc=new Scanner(System.in);
     
      System.out.println("Enter mailid ");
      String a= sc.nextLine();
      if (email.contains(a)) 
      {
    	    System.out.println(a+ " mailID found");
      }
      else 
      {
    	    System.out.println(a+" mailID doesnt exists");
      }
   }
}