package testMain;

public class MainMethod {
	
	public static void main(String[] args) {
		
		Circle c = new Circle(20,180);
		Quadrangle q = new Quadrangle(10,90);
		Triangle t = new Triangle(10,60);
		
		c.draw();
		q.draw();
		t.draw();
	}

}
