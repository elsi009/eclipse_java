package testMain2;

public class AccountTransfer extends Payment {
	public AccountTransfer() {};
	public AccountTransfer(int amount,String paymentDay) {
		super(amount,paymentDay);
	}
	
	@Override
	public void processPay() {
		System.out.println("계좌이체 금액 : "+amount+" 결제일 "+paymentDay);
	}

}
