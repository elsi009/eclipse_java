package generic2;

public class Alcohol {
	
	protected Alcohol(String name, String brand, int abv) {
		this.name= name;
		this.brand = brand;
		this.abv = abv;
		
	}
	protected String name;
	protected String brand;
	protected int abv; // 도수
}
