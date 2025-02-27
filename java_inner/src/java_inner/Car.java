package java_inner;

public class Car {
	private Tire tire;
	
	public Car(Tire tire) {
		this.setTire(tire);
	}

	public Tire getTire() {
		return tire;
	}

	public void setTire(Tire tire) {
		this.tire = tire;
	}

}
