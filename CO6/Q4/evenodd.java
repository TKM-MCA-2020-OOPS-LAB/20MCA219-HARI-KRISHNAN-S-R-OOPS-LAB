package evenodd;
import java.io.*;

class evenodd
{
	 public static void main(String args[]) throws IOException { 
    FileInputStream fr = new FileInputStream("number.txt");
    FileOutputStream fw1 = new FileOutputStream("even.txt");
    FileOutputStream fw2 = new FileOutputStream("odd.txt");
    System.out.println("Task completed! Numbers are seperated "); 
    int i;
    while((i=fr.read()) != -1) 
   	  
    {
     if(i%2==0)
     fw1.write(i);
     else
     fw2.write(i);
    }
    
    fr.close();
    fw1.close();
    fw2.close();
    
}
}