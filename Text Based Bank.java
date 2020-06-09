import java.util.Scanner;
public class RhymeBank1 {

	public static void main(String[] args) {
		System.out.println("Bank Admin Menu:");
		System.out.println("Please enter a menu option:");
		System.out.println("(1): Add customer to the bank");
		System.out.println("(2): change custimer name");
		System.out.println("(3): check account balance");
		System.out.println("(4): Modify account balance");
		System.out.println("(5): Summary of all accounts");
		System.out.println("(-1): Quit");
		Scanner sc = new Scanner(System.in);
		int userInput = sc.nextInt();
		int s = 0;
		double[] accountBalances = new double[200];
		String[] accountNames = new String[200];

		int index;
		switch(userInput) {
		case 1:
			System.out.println("Bank Add Customer Menu:");
			System.out.println("Please enter an account balance");
			double balance = sc.nextDouble();
			accountBalances[s] = balance;
			System.out.println("Please enter an account name");
			sc.hasNextLine();
			String name = sc.nextLine();
			accountNames[s] = name;
			System.out.println("Customer ID is: " + s);
			s++;
			break;
		case 2:
			System.out.println("Bank Change Name Menu");
			System.out.println("Please Enter a customer ID to change their name");
			index = sc.nextInt();
			System.out.println("What is the customer's new name?");
			sc.nextLine();
			accountNames[index] = sc.nextLine();
			break;
		case 3:
			System.out.println("Bank Check Balence Menu");
			System.out.println("Please Enter a customer ID to check their balence");
			index = sc.nextInt();
			double balence = accountBalances[index];
			System.out.println("This customer has $" + balence + " in their account");
			break;
		case 4:
			System.out.println("Bank Modify Balence Menu");
			System.out.println("Please Enter a customer ID to check their balence");
			index = sc.nextInt();
			System.out.println("What is the customer's new account balence");
			accountBalances[index] = sc.nextDouble();
			break;
		case 5:
			System.out.println("Bank Modify Balence Menu");
			System.out.println("Please Enter a customer ID to check their balence");
			index = sc.nextInt();
			System.out.println("What is the customer's new account balence");
			accountBalances[index] = sc.nextDouble();
			break;
		case -1:
			break;
		default:
			break;
		}
	}
}
