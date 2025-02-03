package study0203;

import java.util.Scanner;

public class study0203_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int phour , pmin;
		int cost = 1000;
		int totaltime=0;
		
		System.out.println("주차시간 ( 시간, 분) : ");
		phour = sc.nextInt();
		pmin = sc.nextInt();
		
		totaltime = phour * 60 + pmin;
		if(phour >= 8) {
			cost = 10000;
			totaltime=0;
		}
		else if(phour >= 4) {
			cost = 2500;
			totaltime -= 240;
		}
		else if(phour >= 2) {
			cost = 1700;
			totaltime -= 120;
		}
		else {
			totaltime = totaltime < 30 ? 0 : totaltime-30;
		}
		
		int price =  cost + (totaltime /10 * 100);
		System.out.println("주차요금 : "+price+"원");
	}
}
	
		
