package generic2;

public class Makgeolli extends Alcohol{

	public Makgeolli(String name,String brand, int abv) {
		super(name,brand,abv);
	}
	
	@Override 
	public String toString() {
		return "막걸리 : "+brand+", "+name+", 도수 : "+abv+"%";
	}
}
