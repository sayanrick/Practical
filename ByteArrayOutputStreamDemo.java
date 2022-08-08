package File_IO;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamDemo {
	public static void main(String args[]) throws IOException{
		FileOutputStream obj1 = new FileOutputStream("G:\\File_IO\\New2.txt");
		FileOutputStream obj2 = new FileOutputStream("G:\\File_IO\\New3.txt");
		
		ByteArrayOutputStream temp = new ByteArrayOutputStream();
		temp.write(44);
		temp.writeTo(obj1);
		temp.writeTo(obj2);
		temp.close();
		System.out.println("Success...");
		
	}

}
