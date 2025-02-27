package study0219;

public class Product {
	String name;
	String brand;
	int num;
	
	Product(){}
	Product(String name, int num ){
		this.name = name;
		this.num = num;
	}
	Product(String name, String brand ,int num){
		this.name = name;
		this.brand= brand;
		this.num = num;
		
	}

}
