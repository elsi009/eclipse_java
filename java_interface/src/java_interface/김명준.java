package java_interface;

public class 김명준 implements Move,Attack, Active{
	
	@Override
	public void moving() {
		System.out.println("명준이가 앞으로 걸어간다.");
	}
	
	@Override
	public void target() {
		System.out.println("은호의 복부를 가격");
	}
}
