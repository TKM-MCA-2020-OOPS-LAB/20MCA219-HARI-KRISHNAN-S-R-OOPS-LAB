package c04;
import java.util.LinkedHashSet; 


public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> linkedset = 
                new LinkedHashSet<String>();  

// Adding elements to LinkedHashSet  
linkedset.add("T");  
linkedset.add("I");  
linkedset.add("L");  
linkedset.add("E"); 

//T will not be added as new elements,because it already exists

linkedset.add("T"); 
linkedset.add("S");  

System.out.println("Size of LinkedHashSet = " +
                         linkedset.size());  
System.out.println("Original LinkedHashSet:" + linkedset);  
System.out.println("Removing E from LinkedHashSet: " +
                 linkedset.remove("E"));  
System.out.println("Trying to Remove Z which is not "+
                 "present: " + linkedset.remove("Z"));  
System.out.println("Checking if T is present=" + 
                 linkedset.contains("T"));
System.out.println("Updated LinkedHashSet: " + linkedset); 
	}

}