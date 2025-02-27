package testMain;

public class Quadrangle extends Diagram{
	
	public Quadrangle() {}
	public Quadrangle(int width,int angle) {
		super(width,angle);
	}
	
	@Override
	public void draw() {
		start=!start;
		System.out.println("사각형 지름이 "+width+"인 사각형을 그린다");
	}
	

}
