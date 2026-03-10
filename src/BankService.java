

	import java.util.ArrayList;

	public class BankService {

	    private ArrayList<Account> accounts = new ArrayList<>();

	    public void createAccount(int accNo, String name) {
	        Account account = new Account(accNo,name);
	        accounts.add(account);
	        System.out.println("Account created successfully!");
	    }

	    public Account findAcc(int accNo) {
	        for (Account acc : accounts) {
	            if (acc.getAccountNumber() == accNo) {
	                return acc;
	            }
	        }
	        return null;
	    }

	    public void deposit(int accNo,int amount) {
	        Account acc = findAcc(accNo);
	        if (acc != null) {
	            acc.deposit(amount);
	            System.out.println("Amount deposited successfully!");
	        } else {
	            System.out.println("Account not found!");
	        }
	    }

	    public void withdraw(int accNo,int amount) {
	        Account acc = findAcc(accNo);
	        if (acc != null) {
	            acc.withdraw(amount);
	             System.out.println("amount withdrawn successfully!!!!!!!!!!!!!!!!!!!!");
	            } 
	        else {
	        
	            System.out.println("Account not found!");
	        }
	    }

	    public void showBalance(int accNo) {
	        Account acc = findAcc(accNo);
	        if (acc != null) {
	            System.out.println("Balance: " + acc.getBalance());
	        } 
	        else {
	            System.out.println("Account not found!");
	        }
	    }

	    public void showAllAccounts() {
	        for (Account acc : accounts) {
	            System.out.println(
	                acc.getAccountNumber() + "  " +
	                acc.getAccountHolderName() + "  " +
	                acc.getBalance()
	            );
	        }
	    }
	}


