package Q2;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;  
public class filewrite {  
    public static void main(String args[]) throws IOException{    
         try{    
           FileWriter fw=new FileWriter("filewrite.txt");    
           fw.write("Tony Stark \n");   
           fw.write("Steve Rogers");
           fw.close();    
          }catch(Exception e){System.out.println(e);}    
          System.out.println("Task Completed");  
          
          FileReader fr=new FileReader("filewrite.txt");    
          int i;    
          while((i=fr.read())!=-1)    
          System.out.print((char)i);    
          fr.close(); 
     }    
}  