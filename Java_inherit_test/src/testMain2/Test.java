package testMain2;

public class Test {

	public static void main(String[] args) {
		Checkcard check = new Checkcard(45000,"2025.02.10");
		Creditcard cd = new Creditcard(150000,"2025.02.22");
		Cash cash = new Cash(9000,"2025.02.14");
		AccountTransfer at = new AccountTransfer(5000,"2025.02.15");
		
		check.processPay();
		cd.processPay();
		cash.processPay();
		at.processPay();

	}

}
