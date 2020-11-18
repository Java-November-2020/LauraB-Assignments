
public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount acc = new BankAccount();
		System.out.println("\n------------DISPLAY BALANCES------------\n");
		acc.depositMoney(1000, "savings");
		acc.depositMoney(700, "checking");
		
		System.out.println(" AFTER DEPOSIT(S):");
		acc.displayAccountBalance();

		System.out.println("Balance for all accounts:   \t$" + BankAccount.allAccountBalances);
		acc.withdrawMoney(200, "savings");
		acc.withdrawMoney(2000, "checking");
		
		System.out.println("\nAFTER WITHDRAWAL(S):");

		acc.displayAccountBalance();

		System.out.println("Balance for all accounts:   \t$" + BankAccount.allAccountBalances);
	}
}
