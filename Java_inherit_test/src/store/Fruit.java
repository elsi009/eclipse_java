package store;

public abstract class Fruit { // 부모 클래스 - 추상클래스
	protected int cost;
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	protected int capacity;
	
	protected Fruit() {}
	protected Fruit(int c, int cp) {
		this.cost = c;
		this.capacity =cp;
	}
	
	
	public abstract void makeJuice();
	public abstract void pieceFruit();
	
	
}
