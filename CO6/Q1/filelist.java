package Q1;
import java.io.File;

class filelist {
  public static void main(String[] args) {

    File file = new File("C:\\Users\\Hari Krishna\\Desktop\\Games");


    String[] fileList = file.list();

    for(String str : fileList) {
      System.out.println(str);
    }
  }
}