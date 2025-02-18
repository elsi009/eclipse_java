package study028;

public class ClassArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Member mem = new Member();
//		mem.name = "김유신";
//		mem.job = "군인";
//		mem.age=38;
		
		Member[] members = new Member[5];
		for(int i=0;i<members.length;i++) {
		members[i] = new Member();
		}
		
		members[0].name="박문수";
		members[0].job="감찰관";
		members[0].age=34;
		members[1].name="이순신";
		members[1].job="군인";
		members[1].age=31;
		members[2].name="문익점";
		members[2].job="산업스파이";
		members[2].age=45;
		
		for(int i=0;i<members.length;i++) {
		System.out.println(members[i].name);
		System.out.println(members[i].job);
		System.out.println(members[i].age);
		}
	}

}
