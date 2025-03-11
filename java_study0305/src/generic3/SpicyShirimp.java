package generic3;

public class SpicyShirimp extends Snack {
	
	public SpicyShirimp(String snackName, int price) {
		super(snackName,price);
	}
	
	@Override 
	public String toString() {
		return snackName+" 박스 가격 : "+price+"원";
	}
	
	public void eat() {
		System.out.println("먹는다.");
	}
	
	
}
