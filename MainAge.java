package Unit_3;

import java.util.InputMismatchException;

public class MainAge {

	public static void main(String[] args) throws NegativeAgeException, InvalidAgeException {
		// TODO Auto-generated method stub
		AgeCheck a1 = new AgeCheck(43);
		try {
		
		a1.validate();
		}
		catch(NegativeAgeException e){
			System.out.println(e.getMessage());
		}
		catch(InputMismatchException e){
			System.out.println("Cant cast vote");
		}
		
		finally {
			System.out.println("Age is " + a1.getAge());
		}
	}
}
