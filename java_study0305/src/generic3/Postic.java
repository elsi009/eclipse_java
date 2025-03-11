package generic3;

public class Postic extends Snack{

	
	public Postic(String snackName, int price) {
		super(snackName,price);
	}
	
	@Override 
	public String toString() {
		return snackName+" 박스 가격 : "+price+"원";
	}
}
