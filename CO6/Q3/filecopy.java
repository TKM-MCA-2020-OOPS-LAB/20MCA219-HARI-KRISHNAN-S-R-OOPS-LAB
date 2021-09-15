package filecopy;
import java.io.*; 
class filecopy{ 
      public static void main(String args[])throws IOException { 
               FileInputStream fr =new FileInputStream("file.txt"); 
               FileOutputStream fw=new FileOutputStream("newfile.txt") ; 
               System.out.println("Task completed!"); 
               int c; 
               while((c=fr.read())!=-1) 
               fw.write((char)c); 
               fr.close(); 
               fw.close(); 
          } 
 } 