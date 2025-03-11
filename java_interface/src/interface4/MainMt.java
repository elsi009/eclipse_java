package interface4;

public class MainMt {

	public static void main(String[] args) {
		
//		Light sl = new Light();
//		TV tv = new TV();
//		Aircon ac = new Aircon();
//		
//		sl.TurnOn();
//		sl.TurnOff();
//
//		tv.TurnOn();
//		tv.TurnOff();
//		ac.TurnOn();
//		ac.TurnOff();
		
		remoteCon[] rc = new remoteCon[3];
		
		rc[0] = new Light();
		rc[1] = new TV();
		rc[2] = new Aircon();
		
		for(remoteCon rm : rc) {
			rm.TurnOn();
			rm.TurnOff();
		}
	}

}
