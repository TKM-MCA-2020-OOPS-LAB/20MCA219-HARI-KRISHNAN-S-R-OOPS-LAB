import java.util.*;
public class co4_q17 {
		public static void main(String args[])
	    {
	       
	        Map<Integer, String> mp = new HashMap<>();
	        //Inserting elements..   
	        mp.put(1, "Amal");
	        mp.put(2, "Vinu");
	        mp.put(3, "Charu");
	        System.out.println("Initial Map:"+mp);
	        
	        mp.put( (2), "Nandana");
	        mp.put((4), "Ajith");
	        //Updating..
	        System.out.println("Updated Map:"+mp);
	  
	        //Removing..
	        mp.remove(4);
	  
	        // Final Map..
	        System.out.println("After Removing 4th entry, Final Map  is:"+mp);
	    
	    }
	}