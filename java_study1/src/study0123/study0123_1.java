package study0123;

import java.util.Scanner;

public class study0123_1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// 조건 연산자
		// (조건식) ? 참일경우 실행 내용 : 거짓일경우 실행 내용;
//		String result = (10 > 5 ) ? "5보다 크다" : "5보다 작다";
//		System.out.println(result);
		
		/* Scanner input = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age = input.nextInt();
		int b =	(age < 19 ) ? 1000 : 1500;
		System.out.printf("나이 %d살, 버스 요금 :%d원 \n" , age , b);
		*/
		
		/* Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 숫자 : ");
		int num1 = scan.nextInt();
		System.out.print("두번째 숫자 : ");
		int num2 = scan.nextInt();
		
		int bignum = (num1 > num2 ) ? num1 : num2 ;
		System.out.println("두 숫자중 큰 숫자는 : " + bignum); 
		
		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int num3 = scan.nextInt();
		System.out.print("두번째 숫자를 입력하세요 : ");
		int num4 = scan.nextInt();
		
		String res = (num3 == num4 ) ? "두 숫자가 같다" : "두 숫자가 같지 않다";
		System.out.println(res); 
		
		
		System.out.print("정수 입력 : ");
		int num = scan.nextInt();
		
		// 입력한 정수가 양수냐 0이냐 음수냐 
		
		String result = (num > 0) ? "양수" : ( (num ==0) ? "0이다" : "음수");
		System.out.print(result);
		
		// 바이킹을 타기 위해서는 키가 135 이상이어야 한다.
		// 바이킹 탑승 여부를 출력하세요. 
		
		System.out.print("키를 입력하세요 : ");
		int height = scan.nextInt();
		String itsok = ( height >= 135 ) ? "바이킹을 탈 수 있음" : "바이킹을 탈 수 없음";
		System.out.print(itsok);
		
		System.out.print("1. 파미향 짬뽕 2. 쿠켄 돈가스 3. 공주 순대 : ");
		int select = scan.nextInt();
		int price = (select == 1) ? 9000 : 0 ;
		price = (select == 2) ? 8000 : price ;
		price = (select == 3) ? 6500 : price ; 
		System.out.print("가격은 " + price);*/
		
		System.out.print("첫번째 정수 : ");
		int numa = scan.nextInt();
		System.out.print("두번째 정수 : ");
		int numb = scan.nextInt();
		System.out.print("세번째 정수 : ");
		int numc = scan.nextInt();
//		int bignum = (numa > numb ) ? numa : (numb > numc )? numb : numc ;
		int bignum = (numa > numb ) ? numa : numb ;
		bignum = (bignum > numc ) ? bignum : numc;
		System.out.print("가장 큰 정수는 ? " + bignum);

		
		
		
		
		
		
	}

}
