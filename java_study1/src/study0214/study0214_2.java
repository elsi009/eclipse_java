package study0214;

import java.util.Scanner;

public class study0214_2 {

	public static void main(String[] args) {
		/* 문제1
		 * 학생 5명의 시험 성적을 키보드를 통해 입력받고
		 * 평균 점수를 구하여 출력하세요
		 * 반드시 시험성적은 배열에 저장
		 */
		
		Scanner sc = new Scanner(System.in);
		int score[] = new int[5];
		int sum = 0;
		for(int i=0;i<score.length;i++)
		{
			System.out.println("학생 "+(i+1)+" 시험 성적 : ");
			score[i] = sc.nextInt();
			sum += score[i];
		}
		
		sc.close();
		double avg = (double)sum/5;
		System.out.println("평균점수는 "+avg+"입니다");
		

	}

}
