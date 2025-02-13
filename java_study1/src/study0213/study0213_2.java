package study0213;

public class study0213_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자열 메서드
		
		String word = "I like tomato";
		
		//문자 열에서 특정 문자 추출
		
		System.out.println(word.charAt(7));
		
		// 문자열에서 지정된 위치 문자열 추출
		System.out.println(word.substring(7));
		
		String temp = word.substring(2,6);
		
		System.out.println(temp);
		
		//문자열의 길이
		System.out.println(word.length());
		
		String text = "나랏말싸미 듕귁에 달아 문자와로 서르 사맛디 아니할세";
		
		int idx = text.indexOf('문');
		System.out.println(idx);
		
		idx = text.indexOf("문자와로");
		System.out.println(idx);
		
		System.out.println(text.substring(idx));
		
		text = "서경림-김현진-김미란-김석진-주동건-정수영";
		
		System.out.println(text.split("-"));
		
		String[] names = text.split("-");
		
		System.out.println(names[4]);
		
		// 배열 -> 문자열로 변환
		
		text = String.join(",",names);
		System.out.println(text);
		
		System.out.println("abc"+word);
		System.out.println("abc".concat(word));
		
		//String 클래스 타입의 변수가 비었냐?
		
		word = " ";
		
		System.out.println(word.isEmpty());
		
		System.out.println(word.isBlank());
		
		// empty 는 문자열의 인덱스가 존재하지 않아야 true
		// blank 는 띄어쓰기와 같이 빈공간인 경우에 비어있다로 표시 true
		
		word = "김현진은 너구리를 좋아한다.";
				
				
		System.out.println(word.replace("너구리", "강아지"));
		System.out.println(word);
		
		text = word.replace("너구리", "강아지");
		System.out.println(text);
		
		word = "010.1234.5678.9128";
		System.out.println(word.replaceAll("[0-4]","a" ));
		
		
		/* 정규 표현식
		 * 
		 *  . 임의의 문자 1개를 의미
		 *  ^ 시작을 의미 ( ^a : a로 시작하는 단어)
		 *  $ $앞의 문자열로 문자가 끝나는지를 의미 ( a$ : a로 끝나는 단어)
		 *  [] []괄호 안의 문자가 있는지 확인해라 뜻 ([a] : a문자가 있는지 확인)
		 *  [^] []괄호안에 ^뒤의 문자가 있으면 제외해라
		 *  	[a-z] : a부터 z까지 문자 확인
		 *  	[^a-z] : a부터 z까지 를 제외한 문자
		 *  - 사이의 문자 또는 숫자를 의미 ([a-z]: a부터 z까지 문자 확인)
		 *  	[a-z0-9] : 알파벳소문자 전체, 0~9중 한문자
		 *  | 또는 [a|h]
		 *  () 그룹 01(0|1): 01뒤에 0또는 1
		 *  {} 개수 a{3}b : a가 3번 나오고 뒤에 b가 있다
		 *  	^\d{3}-\d{4}-\d{4}$ : 전화번호 정규 표현식
		 *  \d 0~9 숫자
		 *  \b 공백, 탭 , /를 의미
		 *  \B \b의 부정 (공백, 탭 등이 아닌 문자)
		 *  \D 0~9가 아닌거
		 *  \w 알파벳 대소문자+숫자+"_" [a-zA-Z_0-9]
		 *
		 */
		
		
		word = "tomato98731*";
		//알파벳 제외한 나머지를 0으로 변경
		System.out.println(word.replaceAll("[^a-z]", "0"));
		
		// 비밀번호 6자리 이상 12자리 이하 영어 소문자, 숫자 포함
		// ^[A-Za-z0-9]{6,12}$
		
		//주민등록 번호 확인
		
		// \d{6}\-[1-4]\d{6}
	}

}
