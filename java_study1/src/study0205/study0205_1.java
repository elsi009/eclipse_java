package study0205;

import java.util.Scanner;

public class study0205_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
//		int sum=0;
//		for(int i=1;i<=10;i++) {
//			sum += 10*i;
//			System.out.println(sum);
//		}
		
//		System.out.print("정수 입력 : ");
//		int num = sc.nextInt();
		
		int gugu =0;
		for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++)
			{
				gugu = i*j;
				System.out.println(i+" 곱하기 "+j+" = "+gugu);
			}
		}
	}

}
