package testMain2;

public class Cash extends Payment{
	public Cash() {};
	public Cash(int amount,String paymentDay) {
		super(amount,paymentDay);
	}
	
	@Override
	public void processPay() {
		System.out.println("현금결제 금액 : "+amount+" 결제일 "+paymentDay);
	}


}
