package generic2;

public class Wine extends Alcohol {

	public Wine(String name,String brand, int abv) {
		super(name,brand,abv);
	}
	
	@Override 
	public String toString() {
		return "와인 : "+brand+", "+name+", 도수 : "+abv+"%";
	}
}
