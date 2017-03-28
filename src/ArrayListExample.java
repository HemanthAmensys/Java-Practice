import java.util.*;

public class ArrayListExample {
   public static void main(String args[]) {
      
	  ArrayList<String>obj = new ArrayList<String>();

	  obj.add("Hemanth");
	  obj.add("Harry");
	  obj.add("Chaitanya");
	  obj.add("Steve");
	  obj.add("Anuj");
	  
	  System.out.println("Currently the arraylist has elements are:"+obj);
	  
	  obj.add(0,"sri");
	  obj.add(1,"srinu");
	  obj.remove("Hemanth");
	  obj.remove("Steve");
	  
	  System.out.println("Currently the arraylist has elements are:"+obj);
	  obj.remove(1);
	  
	  System.out.println("Currently the arraylist has elements are:"+obj);
	  ArrayList<String>obj2=new ArrayList<String>(obj.subList(0,3));
	  
	  System.out.println("Currently the arraylist has elements are:"+obj2);
   }
}

