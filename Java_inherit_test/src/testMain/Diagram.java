package testMain;

public  abstract class Diagram {
	protected boolean start=false;
	protected int width;
	protected int angle; 
	public Diagram() {}
	
	public Diagram(int width, int angle) {
		this.width = width;
		this.angle = angle;
	}
	
	public abstract void draw();

}
