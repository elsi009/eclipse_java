package testMain2;

public abstract class Payment {
	protected int amount;
	protected String paymentDay; 
	public Payment() {}

	public Payment(int amount,String paymentDay) {
		this.amount = amount;
		this.paymentDay = paymentDay;
	};
	
	public abstract void processPay();
}
