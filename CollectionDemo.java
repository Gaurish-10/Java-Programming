package Unit_2;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class CollectionDemo {
	public static void main(String args[ ] ) {
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("First");
		names.add("Second");
		names.add("Fourth");
		names.add(2 , "Third");
//		LinkedList<String> link = new LinkedList<String>();
//		dept = new LinkedList<>();
		List<String> dept = new ArrayList<>();
		System.out.println("ArrayList - " + names);
		System.out.println("Array List Size - " + names.size());
		System.out.println(names);
		System.out.println(names.size());
		names.remove(3);
		System.out.println(names.get(0));
		names.set(0, "jasndlk");
	}
}
