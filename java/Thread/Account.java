package core.java.Thread;

public class Account {

	private int balance = 0;
	
	public int getBalance() {
		try {
			 
			Thread.sleep(200);
		}
		catch(InterruptedException e) {
			return balance;
			
		}
		return balance;
	}
	
	public void setBalance(int balance){
		try {
			
			Thread.sleep(200);
		}
		catch(InterruptedException e) {
			
			
		}
		
		this.balance = balance;
	}
	
	public  synchronized void deposit(String name , int amount ) {
		
		int  total  = getBalance() + amount;
		
		setBalance(total);
		System.out.println(name + "balance  = " + getBalance());
		
		
		///////// another way of synchronized /////////
		
/*		   synchronized (this) {

			int  total  = getBalance() + amount;
			
			setBalance(total);
			System.out.println(name + "balance  = " + getBalance());
				
			
		}  */
		
		
		

	}
	
	
}
