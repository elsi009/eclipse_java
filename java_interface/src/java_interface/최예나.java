package java_interface;

public class 최예나 implements Move, Attack, Active {

	
	@Override
	public void moving() {
		
		System.out.println("예나가 360도 돌면서 걸어간다.");
	}
	
	@Override
	public void target() {
		System.out.println("예나가 경림이를 노려보았다.");
	}
}
