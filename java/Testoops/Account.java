package core.java.Testoops;

public class Account {
	
	private int balance;

	 public void setBalance(int b) {
		 
		 this.balance = b;
		  
	  }
	 public int getBalance() {
		 
		 return this.balance;
	 }
	 
	 public void deposite(int amount ) {
		 
		 int total = getBalance() + amount;
		 
		 setBalance(total);
	 } 
	 public void withdraw(int amt) {
		 
		 int total = getBalance() - amt;
		 
		 setBalance(total);
	 }
}
 
	
