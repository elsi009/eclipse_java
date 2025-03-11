package java_study0305;

public class MainMt {

	public static void main(String[] args) {
		
		Drink<String> d = new Drink<String>();
		d.name = "토마토주스";
		d.ml = 350;
		d.메뉴추천("토마토");
		
		
		Integer m; // int 기본 타입의 자바 클래스 명
		Float f; // float 의 기본 타입의 자바 클래스 명
		Double db; //double 의 기본 타입의 자바 클래스명
		Byte bt; // Byte 기본 타입의 자바 클래스 명
		Short s; // short 기본 타입의 자바 클래스명
		Character c;
		Boolean b;
		
	}

}

/*

	제네릭 - 속에 특유한, 속명 	상표명 - 일반명
		 - 클래스 내부에서 사용할 데이터 타입을 외부에서 지정하는 방법
		 - 제네릭 타입으로는 무조건 클래스 타입만 가능 
		 -> int : Integer 클래스 
		 
		 class A {
		 	int num;
		 	float fnum;
		 	String name;
		 	}
		 	

*/