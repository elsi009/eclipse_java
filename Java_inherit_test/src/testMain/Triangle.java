package testMain;

public class Triangle extends Diagram {
	
	public Triangle() {}
	public Triangle(int width,int angle) {
		super(width,angle);
	}
	
	@Override
	public void draw() {
		start=!start;
		System.out.println("삼각형 지름이 "+width+"인 삼각형을 그린다");
	}
}
