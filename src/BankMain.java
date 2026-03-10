

	import java.util.Scanner;

	public class BankMain {

	    public static void main(String[] args) {

	        BankService bank = new BankService();
	        Scanner sc = new Scanner(System.in);

	        while (true) {
	           
	            System.out.println("1. Create Account");
	            System.out.println("2. Deposit");
	            System.out.println("3. Withdraw");
	            System.out.println("4. Check Balance");
	            System.out.println("5. Show All Accounts");
                 System.out.println("6. thank you!!");
	            System.out.print("Enter choice: ");
	            int choice = sc.nextInt();

	            switch (choice) {

	                case 1:
	                    System.out.print("Enter Account Number: ");
	                    int accNo = sc.nextInt();
	                    sc.nextLine();
	                    System.out.print("Enter Name: ");
	                    String name = sc.nextLine();
	                    bank.createAccount(accNo, name);
	                    break;

	                case 2:
	                    System.out.print("Enter Account Number: ");
	                    accNo = sc.nextInt();
	                    System.out.print("Enter Amount: ");
	                    int amount = sc.nextInt();
	                    bank.deposit(accNo, amount);
	                    break;

	                case 3:
	                    System.out.print("Enter Account Number: ");
	                    accNo = sc.nextInt();
	                    System.out.print("Enter Amount: ");
	                    amount = sc.nextInt();
	                    bank.withdraw(accNo, amount);
	                    break;

	                case 4:
	                    System.out.print("Enter Account Number: ");
	                    accNo = sc.nextInt();
	                    bank.showBalance(accNo);
	                    break;

	                case 5:
	                    bank.showAllAccounts();
	                    break;

	                case 6:
	                    System.out.println("Thank you!");
	                    System.out.println("THANK YOU FOR BANKING SERVICE");

	                default:
	                    System.out.println("Invalid choice!");
	            }
	        }
	    }
	}

	

