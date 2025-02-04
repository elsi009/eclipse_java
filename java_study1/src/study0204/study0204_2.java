package study0204;

import java.util.Scanner;

public class study0204_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	       
//		int temp=0;
//		for(int i=1; i<=9; i++) {
//			temp = 2*i;
//			System.out.println(temp);
//		}
		
		int num1=0,num2=0;
		num1= sc.nextInt();
		for(int i=1;i<=9;i++) {
			num2= num1*i;
			System.out.println(num2);
		}
	}

}
