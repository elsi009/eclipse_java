package java_innerclass;

public class MainMt {

	public static void main(String[] args) {
		
		Test t = new Test();
		
		t.setNum(10); // 내부클래스가 노출 안됨
		t.a.num = 10;
		
		Test.A a = t.new A();
		
		Test.Dog dof = new Test.dog();
		
		Test.origin();
	}

}
