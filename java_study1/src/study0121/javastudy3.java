package study0121;

import java.util.Scanner;

public class javastudy3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자바에서 결과로 출력하는 방법
		System.out.println("출력하는 방법");
		// 자바에서 키보드를 통해 데이터를 입력하는 방법
		// 자바에서 입력하기 위한 순서
		// 1. 입력 객체 생성
		// 2. 입력 객체를 통해 데이터에 맞는 입력메서드 호출
		//num 이라는 변수에 정수 데이터 입력하여 저장하기
		//nextInt() 가 정수 데이터 입력하기 위한 메서드이다.
//		System.out.print("정수 입력 : ");
//		int num = input.nextInt();
//		System.out.println("입력 잘 되었나?  "+num);
		
		// 사각형의 너비와 높이를 키보드를 통해 입력받고
		// 넓이를 계산하여 출력하세요.
	
		Scanner text = new Scanner(System.in);
		System.out.print("너비 입력 : ");
		int width = text.nextInt();
		System.out.print("높이 입력 : ");
		int height = text.nextInt();
		int extent = width * height ;
		System.out.println("넓이 : "+extent);
		// println => 한줄 끝낸다는 뜻 
		
		
		
	}

}
