package Q5;
import java.net.*;
import java.io.*;

class server {

	public static void main(String[] args) throws Exception {
		try {
			ServerSocket ss = new ServerSocket(2665);
			System.out.println("Server is waiting .....");
			Socket s = ss.accept();
			System.out.println("CONNECTION ESTABLISHED !!!");
			InputStreamReader isr = new InputStreamReader(s.getInputStream());
			BufferedReader br = new BufferedReader(isr);
			String str = br.readLine();
			System.out.println("Message from Client: "+str);
			
			//Server is responding through its OutputStream
			
			PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
			pw.println("Hi Client!!.");
			pw.close();
		}
		catch(Exception e) {
			System.out.println("An error occured.."+e);
		}
	}
}