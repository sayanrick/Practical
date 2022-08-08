package File_IO;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamDemo {
	public static void main(String args[]) {
		byte [] arr = {65, 37, 70, 54, 88};
		ByteArrayInputStream obj = new ByteArrayInputStream(arr);
		
		int i = 0;
		while ((i = obj.read()) != -1) {
			char ch = ((char)i);
			System.out.println("ASCII Charecter " + i + " value is " + ch);
		}
	}
}
