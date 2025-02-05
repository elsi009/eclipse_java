package study0205;

import java.util.Scanner;

public class homework0205 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("숫자를 입력하세요 : ");
		num = sc.nextInt();
		int low = 1;
		int high = 50;
		int num1;
		while (true) {
		   num1 = low + (int)(Math.random() * (high - low + 1));
		   System.out.println(num1);
		            
		       if (num1 == num) {
		           System.out.println("정답입니다");
		            break;
		        } else if (num1 > num) {
		          System.out.println("숫자가 너무 큽니다!");
		          high = num1 - 1;
		        } else {
		          System.out.println("숫자가 너무 작습니다!");
		          low = num1 + 1;
		            }
		        }
	}

	}
