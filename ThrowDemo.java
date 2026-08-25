package Unit_3;

public class ThrowDemo {
	public static void main(String args[])throws IllegalArgumentException , InterruptedException , NullPointerException{
		java.util.Scanner sc = new
		java.util.Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		if(age<0) {
			throw new IllegalArgumentException();
		}
		if(age>0 && age<18) {
			throw new NullPointerException();
		}
		try {
		Thread.sleep(2000);
		}
		finally {
			System.out.println("");
		}
	}
}
