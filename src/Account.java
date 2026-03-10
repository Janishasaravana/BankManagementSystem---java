
public class Account {
	

	    private int accountNo;
	    private String accountName;
	    private int balance;

	    public Account(int accNo, String accountName) {
	        this.accountNo = accNo;
	        this.accountName = accountName;
	        this.balance = 0;
	    }

	    public int getAccountNumber() {
	        return accountNo;
	    }

	    public String getAccountHolderName() {
	        return accountName;
	    }

	    public int getBalance() {
	        return balance;
	    }

	    public void deposit(int amount) {
	        balance = balance + amount;
	    }

	    public void withdraw(int amount) {
	        if (amount <= balance) {
	            balance = balance - amount;
	            System.out.println("success");
	        }
	        else {
	        	System.out.println("Insufficient");
	        }
	    }
	}


