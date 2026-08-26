package unit_1;

import java.util.Scanner;

public class foreachdemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;
		int sum = 0;

		System.out.println("Enter the number of elements in the array: ");
		n = sc.nextInt();

		int arr[] = new int[n];

		System.out.println("Enter the elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		//for each
		for (int element : arr) {
			if (element % 2 == 0) {
				sum += element;
			}
		}

		System.out.println("The array elements are:");
		for (int element : arr) {
			System.out.print(element + " ");
		}

		System.out.println("\nSum of even elements: " + sum);

		sc.close();
	}
}
