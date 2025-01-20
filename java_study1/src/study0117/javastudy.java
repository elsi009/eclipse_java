package study0117;

public class javastudy {

	public static void main(String[] args) {
		
		int num = 20;
		float pl = 3.14f;
		
		pl = num;
		num = (int)pl; // 강제 형변환
		
		
		// 담배한개피에 수명이 2분 단축된다.
		// 어떤사람이 담배를 20년동안 피웠다.
		// 이 사람이 하루에 몇개피 피우는지 (변수에 값저장)
		// 이사람의 단축된 수명이 총 몇분인가? 
		// 이사람의 단축된 수명이 총 몇시인가?
		// 이사람의 단축된 수명은 총 몇일인가?
		
		   int cigrat=4; 
		   int cigMinute= cigrat * 2 * 365 * 20;
		   double cigHour = cigMinute / 60;
		   double cigDay = cigHour / 24 ;
		      
		   System.out.println(cigMinute);
		   System.out.println(cigHour);
		   System.out.println(cigDay); 
		      

	}

}
