package study0204;
import java.util.Scanner;
public class study0204_1 {

	public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	       
//	       int sum=0;
//	       for(int i=1; i<=10; i++) {
//	    	   sum += i;
//	       }
//	       System.out.println(sum);
	       
	       int num1, num2;
	       int sum=0;
	       System.out.print("첫번째 숫자를 입력하세요 : ");
	       num1 = sc.nextInt();
	       System.out.print("두번째 숫자를 입력하세요 : ");
	       num2 = sc.nextInt();
	       if(num1>num2) {
	    	   for(int i=num2; i<=num1; i++)
	    	   {
	    		   sum += i;
	    	   }
	       }
	       else {
	    	   for (int i=num1; i<=num2; i++)
	    	   {
	    		   sum += i;
	    	   }
	       }
	       System.out.println("두 정수의 합은 " +sum + "입니다.");
	}

}
