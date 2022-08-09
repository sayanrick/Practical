package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {
	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<>();
		// adding String object to array list
		al.add("Subrajit");
		al.add("Mamta");
		al.add("Monalisa");
		al.add("Anju");
		al.add("Samik");
		al.add("Pallabi");
		al.add("Khusbu");
		al.add("Bhaskar");
		al.add("Suruti");
		System.out.println("String sorted list:- ");
		// sorting array list
		Collections.sort(al);
		for(String s : al) {
			System.out.println(s);
		}
		System.out.println();
		ArrayList<Integer> al2 = new ArrayList<>();
		// adding Integer object to array list
		al2.add(22);
		al2.add(12);
		al2.add(5);
		al2.add(66);
		al2.add(24);
		al2.add(85);
		al2.add(53);
		al2.add(45);
		al2.add(-12);
		System.out.println("Integer sorted list:- ");
		// sorting array list
		Collections.sort(al2);
		for(Integer i : al2) {
			System.out.println(i);
		}
		
	}

}
