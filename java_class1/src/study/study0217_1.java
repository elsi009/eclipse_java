package study;

public class study0217_1 {

	public static void main(String[] args) {
		  
		Member info = new Member();
		info.name = "김유신";
		info.age =30;
		System.out.println(info.name);
		
		Member my = new Member();
		my.name = "박문수";
		my.age = 25;
		
		Animal friend = new Animal();
		friend.kind = "고양이";
		friend.name = "쫀떡이";
		friend.age = 6;
		System.out.println("동물 종은 "+friend.kind+"이고 이름은 "+friend.name+", 나이는 "+friend.age+"살입니다");
	}

}
// 기본 데이터 타입으로 선언한 변수는 데이터 저장이 직접 가능
// int num=10;
// 배열 또는 클래스 타입으로 선언한 변수는 참조 변수이다.
// 참조 변수에는 메모리주소저장한다.
// 그래서 자바에서는 new 연산 자통에서 공간을 할당 받아 그 공간의 주소를 저장


class Member{
	String name;
	int age;
	float eyes;
}

class Animal {
	String kind;
	String name;
	int age;
}

// 프로그래밍 명명 규칙
// 1. 카멜 표기법
// 	  첫문자를 제외하고 단어의 첫글자를 대문자로 표현
//	  함수, 인스턴스, 객체, 변수
// 2. 스네이크 표기법
//	  모든 단어 사이에 _를 붙여서 이름 짓기
//	  데이터베이스의 테이블명, 컬럼명
// 3. 파스칼 표기법
// 	  카멜 표기법과 유사하지만 첫문자부터 대문자로 표기
//	  객체지향 언어의 클래스나 
// 4. 케밥 표기법
// 	  카멜표기법과 달리 소문자로 표현하며 단어와 단어사이에 - 붙이기
// 	  css의 class명 