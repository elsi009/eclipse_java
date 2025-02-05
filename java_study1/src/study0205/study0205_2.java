package study0205;

import java.util.Scanner;

public class study0205_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		int com = (int)(Math.random() * 50 +1);
		
		
		while(true) {
			System.out.println("정수 입력 : ");
			int num = sc.nextInt();
			if(com==num) {
				System.out.println("정답");
				break;
			}
			else if ( com> num) {
				System.out.println("up");
			}else {
				System.out.println("down");
			}
		}
	}

}
