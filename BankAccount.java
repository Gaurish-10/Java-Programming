package unit_1;

public class BankAccount {
	
		private int accountnumber ;
		private double balance ;
		private String name ;
		private static int totalaccount ;
		
		BankAccount(int accountnumber , String name , double balance){
			this.accountnumber =accountnumber ;
			this.name  = name;
			this.balance = balance;
			totalaccount++;
		}
		
		int getAccnum() {
			return this.accountnumber;
		}
		
		void setAccnum() {
			this.accountnumber = accountnumber;
		}
		
		String getName() {
			return getName();
		}
		
		void setName(String name) {
			this.name = name;
		}
}
