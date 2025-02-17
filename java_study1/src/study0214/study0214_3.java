package study0214;

import java.util.Scanner;

public class study0214_3 {

	public static void main(String[] args) {
		
		/*
		 *  문제 2
		 *  알파벳 문자 하나를 입력하세요
		 *  입력한 알파벳으로 시작하는 단어를 모두 찾아 출력하세요
		 *  그리고 출력한 단어가 총 몇개인지 출력하세요
		 */
		
		
		String[] word = new String[] {
				"apple", "banana", "cherry", "date", "elderberry", 
	            "fig", "grape", "honeydew", "kiwi", "lemon", 
	            "mango", "nectarine", "orange", "papaya", "quince", 
	            "raspberry", "strawberry", "tangerine", "ugli", "vanilla", 
	            "watermelon", "xigua", "yam", "zucchini", "avocado", 
	            "blueberry", "cantaloupe", "dragonfruit", "apricot", "blackberry", 
	            "coconut", "dragonfruit", "eggplant", "feijoa", "grapefruit", 
	            "huckleberry", "iceplant", "jackfruit", "kiwifruit", "lime", 
	            "mangosteen", "nectar", "orange", "peach", "pineapple", 
	            "pear", "plum", "pomegranate", "pear", "lime", 
	            "apricot", "banana", "papaya", "melon", "peach", 
	            "plum", "raspberry", "blueberry", "citrus", "mango", 
	            "blackcurrant", "cucumber", "fennel", "grape", "strawberry", 
	            "apricot", "blackberry", "currant", "kiwi", "orange", 
	            "lemon", "watermelon", "melon", "tangerine", "apple", 
	            "date", "elderberry", "fruit", "peach", "fruit", 
	            "apple", "cherry", "fig", "honeydew", "jackfruit", 
	            "papaya", "blueberry", "plum", "pomegranate", "grape", 
	            "avocado", "kiwi", "lemon", "watermelon", "tangerine", 
	            "strawberry", "dragonfruit", "lime", "pear", "peach"
		};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("알파벳을 입력하세요");
		char text = sc.next().toLowerCase().charAt(0);
		
		for(String words : word) {
			if(words.charAt(0) == text) {
				System.out.println(words);
			}
		}
		
		

	}

}
