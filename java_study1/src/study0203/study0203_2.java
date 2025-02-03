package study0203;

import java.util.Scanner;

public class study0203_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		int num = (int)(Math.random()*10)+1;
//		System.out.println(num);
		
		
//		int user = 0, coin = 0;
//		System.out.print("1. 앞면, 2. 뒷면 : ");
//		user = sc.nextInt();
//		coin = (int)(Math.random()*2+1);
//		 
//		if(coin == user) {
//			System.out.println("정답!");
//		}
//		else {
//			System.out.println("땡!");
//		}
		
//		int coin = (int)(Math.random()*15+1);
//		System.out.println(coin);
//		if( (coin%2)==0)
//		{ System.out.println("짝");}
//		else {
//		 System.out.println("홀");
//		}
		
//		int dice = (int)(Math.random()*6+1);
//		int user=0;
//		System.out.println(dice);
//		if(dice<=3) {
//			System.out.println("주사위 값은 작은 값입니다.");
//		} else {
//			System.out.println("주사위 값은 큰 값입니다.");
//		}
		
//	switch(10) { 
//	case 1:
//		System.out.println("1을 선택");
//		break;
//	case 2:
//		System.out.println("3을 선택");
//		break;
//	case 3:
//	    System.out.println("10을 선택");
//	    break;
//	}
		
		int num=15;
		switch(num) {
		case 10:
			System.out.println("10 선택");
			break;
		case 30:	
			System.out.println("30할거야?");
			break;
		case 20:
			System.out.println("case에 표현하는 데이터는 정수, 문자, 문자열");
			break;
		case 50:
			System.out.println("입력된 값에 맞는 case 실행은 "+"break 또는 } 까지 실행");
			break;
		default:
			System.out.println("case에 없는값입니다. 다시 실행하십시오");
			break;
		}
		
		int 점수 = 79;
		switch(점수/10) {
		case 10:
		case 9:
			System.out.println("A학점");
			break;
		case 8:
			System.out.println("B학점");
		break;
		case 7:
			System.out.println("C학점");
			break;
		default:
			System.out.println("F학점");
		}
	
		
	}

}
