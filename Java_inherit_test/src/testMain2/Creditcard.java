package testMain2;

public class Creditcard extends Payment{
	public Creditcard() {};
	public Creditcard(int amount,String paymentDay) {
		super(amount,paymentDay);
	}
	
	@Override
	public void processPay() {
		System.out.println("신용카드결제 금액 : "+amount+" 결제일 "+paymentDay);
	}


}
