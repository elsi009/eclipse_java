package study0120;

import java.util.Scanner;

public class javastudy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 사과 상자에 사과가 20개 들어있다.
		 * 오렌지 상자에 오렌지가 15개 들어 있다.
		 * 사과 상자는 11개, 오렌지 상자는 12개 있다면
		 * 과일은 총 몇개인가?
		 */
		int apple = 20;
		int orange = 15;
		int apple_box = 11;
		int orange_box = 12;
		int all_fruite = (apple * apple_box) + (orange * orange_box);
		System.out.println("과일 총 개수 : " +all_fruite) ;
		
		// 자바에서 결과로 출력하는 방법
		System.out.println("출력하는 방법");
		// 자바에서 키보드를 통해 데이터를 입력하는 방법
		// 자바에서 입력하기 위한 순서
		// 1. 입력 객체 생성
		// 2. 입력 객체를 통해 데이터에 맞는 입력메서드 호출
		Scanner input = new Scanner(System.in);
		//num 이라는 변수에 정ㅅ우 데이터 입력하여 저장하기
		//nextInt() 가 정수 데이터 입력하기 위한 메서드이다.
		int num = input.nextInt();
	}

}
