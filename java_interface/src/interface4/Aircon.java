package interface4;

public class Aircon implements remoteCon{
	
	@Override
	public void TurnOn() {
		System.out.println("에어컨을 킨다.");
	}
	
	@Override
	public void TurnOff() {
		System.out.println("에어컨을 끈다.");
	}


}
