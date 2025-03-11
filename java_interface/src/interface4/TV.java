package interface4;

public class TV implements remoteCon{
	
	
	@Override
	public void TurnOn() {
		System.out.println("TV를 킨다.");
	}
	
	@Override
	public void TurnOff() {
		System.out.println("TV를 끈다.");
	}

}
