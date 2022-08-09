package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListEg {
	public static void main(String args[]) {
		// Creating array list
		List<String> al = new ArrayList<String>();
		// adding object to array list
		al.add("Sayan");
		al.add("Sankhajit");
		al.add("Akash");
		al.add("Arnab");
		al.add("Owashim");
		al.add("Pritam");
		al.add("Saikat");
		al.add("Sagnik");
		al.add("Jaita");
		al.add("Uday");
		// printing array list objects
		System.out.println(al);
		System.out.println("Size of the array list is: " + al.size());
		
		// removing element from the array list
		al.remove(2);
		System.out.println(al);
		System.out.println("Size of the array list is: " + al.size());
		
		System.out.println("Traversing using For-loop");
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println("Traversing using ForEach-loop");
		for(String s : al) {
			System.out.println(s);
		}
		
		System.out.println("Traversing using Iterator:- ");
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		System.out.println("Forward-traversing using List Iterator:- ");
		ListIterator<String> itr1 = al.listIterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		System.out.println("Backward-traversing using List Iterator:- ");
		ListIterator<String> itr2 = al.listIterator(al.size());
		while(itr2.hasPrevious()) {
			System.out.println(itr2.previous());
		}
	}

}
