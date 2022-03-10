package AssistedPracProj;

class defAccessSpecifier
{ 
  void display() 
     { 
         System.out.println("You are using defalut access specifier"); 
     } 
} 

 class accessSpecifiers1 extends defAccessSpecifier {

	public static void main(String[] args) {
		
		System.out.println("Dafault Access Specifier");
		defAccessSpecifier obj = new defAccessSpecifier(); 		  
        obj.display(); 

	}
}



class priaccessspecifier 
{ 
   private void display() 
    { 
        System.out.println("You are using private access specifier"); 
    } 
} 

 class accessSpecifiers2 {

	public static void main(String[] args) {
		
		System.out.println("Private Access Specifier");
		priaccessspecifier  obj = new priaccessspecifier(); 
         
        //obj.display();

	}
}





 class proaccessspecifiers {

	protected void display() 
    { 
        System.out.println("This is protected access specifier"); 
    } 
}




class accessSpecifiers3 extends proaccessspecifiers {

	public static void main(String[] args) {
		accessSpecifiers3 obj = new accessSpecifiers3 ();   
	       obj.display();  
	}

}









class pubaccessspecifiers {

	public void display() 
    { 
        System.out.println("This is Public Access Specifiers"); 
        
    } 
}



public class AccessSpeci  {

	public static void main(String[] args) {
		
		pubaccessspecifiers obj = new pubaccessspecifiers();
		accessSpecifiers3 a=new accessSpecifiers3();
		accessSpecifiers1 b= new accessSpecifiers1();
        obj.display();  
        a.display();
        b.display();
		
	}
}



