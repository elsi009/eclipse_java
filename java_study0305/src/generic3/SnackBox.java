package generic3;

public class SnackBox<T> {
	T item;
	
	
	public void makeBox(T item) {
		this.item = item;
		System.out.println(this.item);
		System.out.println("과자 박스 만들기");
	}

}
