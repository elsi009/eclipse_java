package interface4;

public class Light implements remoteCon {
	
	@Override
	public void TurnOn() {
		System.out.println("스마트 전구를 킨다.");
	}
	
	@Override
	public void TurnOff() {
		System.out.println("스마트 전구를 끈다.");
	}

}
