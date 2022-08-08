package File_IO;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputExample {
	public static void main(String args[]) {
		try {
			ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("G:\\File_IO\\New4.txt"));
			obj.writeObject(new Student(1011, "Sayan", 4500));
			obj.close();
			System.out.println("Success...");
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
