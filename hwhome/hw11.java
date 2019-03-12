package hwhome;
import java.io.*;
public class hw11 {

	public static void main(String[] args) throws IOException {
	
		File org =new File("c://images.jpg");
		System.out.println(org.exists());
		System.out.println(org.getPath());
		
		FileInputStream fis = new FileInputStream(org);
		File des = new File("c://imagecopy.jpg");
		
		FileOutputStream fos= new FileOutputStream(des);
		byte[] orgsize= new byte[(int)org.length()];
		
		fis.read(orgsize);
		fos.write(orgsize);
		fis.close();
		fos.close();
	}
}
