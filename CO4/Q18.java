import java.util.*;
public class co4_q18 {
   public static void main(String args[]) {
      Map<String, String> map = new HashMap<>();
      map.put("1","kollam");
	  map.put("2","tvm");
	  map.put("3","alpy");
      
      System.out.println("HashMap:"+map);
      Map<String, String> treeMap = new TreeMap<>();
      treeMap.putAll(map);
      System.out.println("TreeMap:"+treeMap);
   }
}