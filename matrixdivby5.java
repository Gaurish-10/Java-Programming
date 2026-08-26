package unit_1;

import java.util.Scanner;

public class matrixdivby5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int mat[][] = new int[3][3];

        // Taking input from user
        System.out.println("Enter the elements of the 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mat[i][j] = sc.nextInt();

                // Checking divisibility by 5
                if (mat[i][j] % 5 == 0) {
                    sum += mat[i][j];
                }
            }
        }

        System.out.println("Sum of elements divisible by 5 = " + sum);
        sc.close();
    }
}