package study028;

public class ClassArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Member mem = new Member();
//		mem.name = "김유신";
//		mem.job = "군인";
//		mem.age=38;
		
//		Member[] members = new Member[5];
//		for(int i=0;i<members.length;i++) {
//		members[i] = new Member();
//		}
//		
//		members[0].name="박문수";
//		members[0].job="감찰관";
//		members[0].age=34;
//		members[1].name="이순신";
//		members[1].job="군인";
//		members[1].age=31;
//		members[2].name="문익점";
//		members[2].job="산업스파이";
//		members[2].age=45;
//		
//		for(int i=0;i<members.length;i++) {
//		System.out.println(members[i].name);
//		System.out.println(members[i].job);
//		System.out.println(members[i].age);
//		}
//	}
	
		Movie ex = new Movie();
		ex.name = "검은 사제들";
		ex.genre = "스릴러";
		ex.number = 1000000;
		ex.year = "2018";
		System.out.println("영화 제목은 "+ex.name+", 장르는 "+ex.genre+" 관객 수는"+ex.number+" 개봉년도는 "+ex.year+"입니다");
		
		

}}


/* 생성자 메서드
 * 생성자 메서드는 자바에서 클래스 정의 할때
 * 기본 생성자 메서드도 같이 만들어진다.
 * 눈에 보이지 않게 생략 처리 된 것이지 없는 것은 아니다.
 * 생성자 메서드는 클래스 객체 공간생성시
 * 인스턴스들의 초기화를 담당하는 메서드이다.
 */

/* 오버로딩 조건
 * 1. 메서드 이름이 같아야 한다.
 * 2. 매개 변수 타입이 같으면 안된다.
 * 3.매개 변수 갯수가 달라도 성립
 * 4. 하나의 클래스 
*/

/* 자바 변수 종류
 * 인스턴스 변수
 * 지역 변수
 * 클래스 변수
 * 
 * 변수 우선 순위
 * 지역변수 > 인스턴스변수 >=클래스변수
 */
