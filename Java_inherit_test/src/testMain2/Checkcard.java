package testMain2;

public class Checkcard extends Payment {
	
	public Checkcard() {};
	public Checkcard(int amount,String paymentDay) {
		super(amount,paymentDay);
	}
	
	@Override
	public void processPay() {
		System.out.println("체크카드결제 금액 : "+amount+" 결제일 "+paymentDay);
	}

}
