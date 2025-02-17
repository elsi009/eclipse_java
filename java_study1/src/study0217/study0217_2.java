package study0217;

import java.util.Arrays;

public class study0217_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] harvest = {9,10,11,8,7,5};
		int hp =0;
		int max =0;
		int tmp = 0;
		
		for(int i=0;i<harvest.length;i++) {
			
			hp += harvest[i];
			tmp = harvest[i];
			
		}
		System.out.println("총 수확량은 "+hp+" 입니다");
		float avg = hp/(float)(harvest.length);
		System.out.println("평균값은 "+avg+" 입니다");
		Arrays.sort(harvest);
		System.out.println(harvest[harvest.length-1]);
	}

}
