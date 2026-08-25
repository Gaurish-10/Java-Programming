package Unit_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListSortNSearch {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = sc.nextInt();
		
		ArrayList<String> list = new ArrayList<String>(n); 
		System.out.println("Enter the elements: ");
		System.out.println(sc.nextLine());
		for(int i = 0 ; i <= n ; i++) {
			String item = sc.nextLine();
			list.add(item);
		}
		Collections.sort(list);
		String search = sc.nextLine();
		int index = list.indexOf(search);
	}
}
