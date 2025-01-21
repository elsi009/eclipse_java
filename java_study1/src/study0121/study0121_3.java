package study0121;

public class study0121_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" 한줄에 하나씩 출력 ");
		System.out.print(" 한줄에 이어서 출력 ");
		System.out.printf(" \n 되나요 ? ");
		System.out.printf(" %d ", 100 );
		System.out.printf(" \n ");
		/*
		 *  %d - 10진수 정수
		 *  %f - 10진수 실수
		 *  %c - 문자
		 *  %s - 문자열
		 */
		// 형식 지정자를 사용하기 위해 주의할 것
		// 1. 형식 지정자와 데이터 위치를 맞춰야 한다.
		// 2. 형식 지정자와 데이터 갯수 맞추기
		System.out.printf("%d년 %d월 %d일 \n",2025,1,21);
		float fnum = 5.12345f;
		System.out.println("println 출력 : "+fnum);
		System.out.printf("printf 출력 : %.1f \n",fnum);
		
		int num = 15;
		System.out.println(num);
		System.out.printf("%d\n",num);
	}

}
