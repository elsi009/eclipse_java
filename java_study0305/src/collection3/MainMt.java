package collection3;

import java.util.ArrayList;

public class MainMt {

	public static void main(String[] args) {
		
		ArrayList<Member> list = new ArrayList<>();
		
		MemberDao test = new MemberDao();
		
		ArrayList<Member> memberList = test.select();
		for(Member m : memberList) {
			System.out.println(m);
		}
	}

}
