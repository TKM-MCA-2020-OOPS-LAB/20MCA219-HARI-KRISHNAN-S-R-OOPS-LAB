package myproj;
import java.util.*;
public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> obj= new ArrayList<String>();
		obj.add("Movies");
		obj.add("Series");
		obj.add("Documentaries");
		obj.add("Animes");
		//displaying array list
		System.out.println("\nDisplaying Arraylist:\n");
		for(String list:obj)
			System.out.println(list);
		//removing array elements from list
		System.out.println("\nlist after Removing elements:\n");
		obj.remove("Animes");
		for(String list:obj)
			System.out.println(list);
		//sorting array list
		System.out.println("\nSorting the list:\n");
		Collections.sort(obj);
		for(String list:obj)
			System.out.println(list);
		
		System.out.println("\nGetting object of list which is present at the specified index:\n");
		System.out.println(obj.get(1));
		
		//getting size of list
		System.out.println("\nSize of the list:"+obj.size());
		
		//clearing the array list
	    obj.clear();
	      
	    System.out.println("\nArrayList after clear method :"+obj);
		
	}

}