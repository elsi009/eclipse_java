package study0116;

public class test {

	public static void main(String[] args) {
		
		
		int blue = 20;
		int red = 15;
		int white = 0;
		
		white = blue;
		blue = red;
		red = white;
		System.out.println(blue);
		System.out.println(red);
		
		int birthYear = 1991;
		System.out.println(2025-birthYear);
		
		float fnum = 2.156f;
		// 자바에서는 실수 뒤에 f붙여야함
		
		char ch = 'a';
		System.out.println(ch);
		
		ch = 'H';
		System.out.println(ch - 'A');
		
		
		String name= "홍길동";
		System.out.println(name);
		
		// 문자열은 String , 문자는 char 
		
		boolean isApple = true;
		
		
	}

}
