package study0203;

import java.util.Scanner;

public class study0203_3 {

	public static void main(String[] args) {
		/*
		 * 과제
		 * 가위바위보 게임 만들기
		 * 1. 가위 2. 바위 3. 보
		 * 
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 가위 2. 바위 3. 보 중 입력하세요");
		int user = sc.nextInt();
		int num = (int)(Math.random()*3+1);
		System.out.println(num);
		if(user==num) {
			System.out.println("비겼습니다");
		} else if((user==1&&num==2) || (user==2&&num==3) || (user==3 && num==1))
		{ 
			System.out.println("졌습니다");                                
		}
		else
		{
			System.out.println("이겼습니다");                                 
		}
	}

}
