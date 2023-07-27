package core.java.Testoops;

public class TestAccount {
	public static void main(String[] args) {
		
		Account  a = new Account();
		
		a.setBalance(1000);
		
		System.out.println(a.getBalance());
		
		a.deposite(2000);
		
		System.out.println(a.getBalance());
	 
		a.withdraw(500);
		
		System.out.println(a.getBalance());
	}

	
}
