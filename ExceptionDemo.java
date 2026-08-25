package Unit_3;

import java.util.Scanner;
class ExceptionDemo
{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);

	int num1 = 0;
	int num2 = 0;
	try{
		num1 = Integer.parseInt(args[0]);
		num2 = Integer.parseInt(args[1]);	
		int ans = num1/num2;
	
		System.out.println("Answer is" + ans);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Error: "+ "Check number of input values");
		}

		catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}

		catch(NumberFormatException e){
		System.out.println(e.toString());
		}
		try {
		int ans = num1/num2;
		}
	}
}