package study0214;

public class study0214_1 {

	public static void main(String[] args) {
		
//		String str = "member";
//		System.out.println(str.charAt(0));
		
//		String str = new String("member");
//		char[] c = new char[] {'a'};
//		String[] names = new String[5];
//		names[0] = new String("박문수");
//		names[1] = "김정호";
//		names[2] = "서경림";
//		names[3] = "김명준";
//		names[4] = "이정훈";
//		
//		
//		boolean hasName = false;
//		for (String name : names ) {
//			if( name.equals("김미란"))
//				hasName = true;
////			System.out.println(name);
//		}
//		if(hasName) System.out.println("이름 등록 됨");
//		else System.out.println("등록 되지 않은 이름");
//		
//		String temp = String.join(",", names);
//		boolean hasName = temp.contains("서경림");
//		
//		
//		
				
		// 참조 변수 : 특정 공간의 메모리 주소만 저장할 수 있는 변수
		// 참조 변수는 배열의 주소를 가지는 참조변수와, 객체의 주소를 가지는 참조변수
		//		배열의 주소를 가지고 있는 참조변수는 참조변수이름[인덱스] 방식으로 사용
		//		객체의 주소를 가지는 참조변수는 참조변수.xxx 방식으로 사용 
		
		String[][] dept = new String[4][7];
		dept[0] = new String[]{"컴퓨터공학과","정보과학과","정보통신공학과","정보산업공학과","전자공학과","문헌정보학과","전기공학과"};
		dept[1] = new String[]{"이지은","김영미","박순애","이춘애","이미선","김기범","박준용"};
		dept[2] = new String[]{"3333","3334","3335","3336","3337","3338","3339"};
		dept[3] = new String[]{"T101","T201","T301","T401","T501","T601","T701"};
		
		
		int idx=-1;
		
		String search ="정보통신공학과";
		for(int i=0;i<dept[0].length;i++) {
			if(dept[0][i].equals(search)) {
				idx=i; break;
				
			}}
		
		if(idx== -1)
		{
			System.out.println("등록되지않은학과입니다");
			return;
			}
		
		System.out.println("조교 : "+dept[1][idx]+", 사무실 : "+dept[3][idx]);
			
			
		}}
