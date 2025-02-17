package study0217;

public class homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] game = new int[25];
		
		for(int i=0;i<game.length;i++) {
			int temp = (int)(Math.random()*50+1);
			for(int k=0;k<i;k++) {
				if(game[k] == temp) {
					i--;
					break;

		
		
		int bingo=0;
		int 가로=0, 세로=0, 대각선1=0, 대각선2=0;
		
		for(int i=0;i<5;i++) {
			for(int k=0; k<5;k++) {
				if(game[i*5+k] ==0) {
					가로++;
				}
				if(game[k*5+i] ==0){
					세로++;
				}
			}
			if(game[i*6]==0) {
				대각선1++;
			}
			if(game[i*4+4]==0)
			{
				대각선2++;
			}
			if(가로==5) {
				bingo++;
			}
			if(세로==5) {
				bingo++;
			}
			if(대각선1==5) {
				bingo++;
			}
			if(bingo==5) {
				System.out.println("5줄 빙고 끝!!!");
				break;
			}
			
		}
	}

}
