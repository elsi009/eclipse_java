package generic2;

public class Soju extends Alcohol{
	
	
	public Soju(String name,String brand, int abv) {
		super(name,brand,abv);
	}
	
	@Override 
	public String toString() {
		return "소주 : "+brand+", "+name+", 도수 : "+abv+"%";
	}
	
	public void aa() {
		System.out.println("나는 소주다");
	}

}
