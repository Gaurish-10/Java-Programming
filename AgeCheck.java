package Unit_3;

import java.util.InputMismatchException;

public class AgeCheck {
	private int age;
	AgeCheck(){
		this.age = -age;
	}
	
	AgeCheck(int age){
		return;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	void validate() throws NegativeAgeException , InvalidAgeException{
		if(this.age<0) 
			throw new NegativeAgeException(null);
		System.out.println("you are" + "eligible to cast vote");
	}
}
