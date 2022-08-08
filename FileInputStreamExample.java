package File_IO;
import java.io.FileInputStream;

public class FileInputStreamExample {	//main class
	
	

	public static void main(String[] args) { //main method
		try {
			FileInputStream obj = new FileInputStream("G:\\File_IO\\New.txt");
//			int i = obj.read();
//			System.out.println(((char)i));
			//while loop
			int j = 0;
			while((j=obj.read())!=-1) {
				System.out.print(((char)j));	
			}
			
			
			obj.close();			//closing the file
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
}
