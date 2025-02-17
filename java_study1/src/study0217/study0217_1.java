package study0217;

public class study0217_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String[] name = new String[3];
//		String[] book = new String[5];
//		name[0] = "이주리";
//		name[1] = "김성후";
//		name[2] = "박이환";
//		
//		book[0] = "마당을 나온 암탉";
//		book[1] = "무서운게 딱 좋아";
//		book[2] = "오만과 편견";
//		book[3] = "정글에서 살아남기";
//		book[4] = "은하수를 여행하는 히치하이킹";
//		
//		for(int i=0;i<name.length;i++) {
//			System.out.println(name[i]);
		
		String[][] book = new String[][] {
			{"이순신","자바","c언어","html"},
			{"김유신","c++","컴퓨터 개론","삼국지1","삼국지2"},
			{"박문수","홍길동전","심청전","안데르센동화1"}};
		
		for(String[] info : book) {
			for(String tmp: info) {
				System.out.println(tmp);
			}
			System.out.println();
			
		}
		
		
		
	}

}
