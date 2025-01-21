package study0121;

import java.util.Scanner;

public class study0121_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num = new Scanner(System.in);
		int age = 0;
		System.out.print("나이 : ");
		age = num.nextInt();
		
		// 태어난 년도
		int birth = 2025 - age;
		System.out.println("태어난 년도 : "+ birth + "년");
		
		
	}

}
