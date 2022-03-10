package AssistedPracProj;

import java.util.*;

public class Maps {
	public static void main(String[] args) {
		
		
		HashMap<Integer,String> a=new HashMap<Integer,String>();      
	      a.put(1,"Abc");    
	      a.put(2,"Def");    
	      a.put(3,"Ghi");   
	       
	      System.out.println("\nHashmap are ");  
	      for(Map.Entry m:a.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	      
	    
	       
	      Hashtable<Integer,String> b=new Hashtable<Integer,String>();  
	      
	      b.put(1,"Jkl");  
	      b.put(2,"Mno");  
	      b.put(3,"Pqr");  
	       

	      System.out.println("\n HashTable are ");  
	      for(Map.Entry n:b.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      
	      //TreeMap
	      
	      TreeMap<Integer,String> c=new TreeMap<Integer,String>();    
	      c.put(1,"Vwx");    
	      c.put(2,"Yza");    
	      c.put(3,"Bcd");       
	      
	      System.out.println("\nTreeMap are ");  
	      for(Map.Entry l:c.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	   }  


}
