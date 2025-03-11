package java_study0305;

public class Drink<T>{
	
	T name;
	int ml;
	
	public void 메뉴추천(T name) {
		this.name= name;
		System.out.println(this.name);
	}
}
