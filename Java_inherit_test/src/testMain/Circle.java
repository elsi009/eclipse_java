package testMain;

public class Circle extends Diagram{

	public Circle() {}
	public Circle(int width,int angle) {
		super(width,angle);
	}
	
	@Override
	public void draw() {
		start=!start;
		System.out.println("원 지름이 "+width+"인 원을 그린다");
	}
	
}
