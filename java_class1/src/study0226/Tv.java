package study0226;

public class Tv extends Product{ // 자식클래스
		
		public Tv() {
			super(); // 부모클래스의 생성자메서드
			//super는 부모클래스의 객체를 의미한다.
		}
		public Tv(String brand, int price, String name) {
			super();
			super.brand = brand;
			super.price = price;
			this.name = name;
		}
		@Override
		public void power() {
			onOff=!onOff;
			System.out.println("TV 전원 : "+onOff);
		}
	}

// 오버라이딩
/* 상속 관계인 경우, 인터페이스 implements인 경우에 사용
 * 성립 조건
 * 1. 메서드의 원형은 그대로 유지
 * 2. 내용만 변경한다.
 * 3. 상속 또는 implements인 경우에만 가능
 */
