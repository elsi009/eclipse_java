package generic3;

public class MainMt {

	public static void main(String[] args) {
		
		
		
		SnackBox<Postic> 박스1 = new SnackBox<>();
		박스1.makeBox(new Postic("포스틱",1700));
		
		Snack 포스틱 = new Postic("포스틱",1700);
		SnackBox<Postic> 과자봉지 = new SnackBox<>();
		과자봉지.makeBox((Postic)포스틱);
		
		Snack[] 과자배열= new Snack[] {
				new Yegam("예감",9000),new SpicyShirimp("매운새우깡1",15000),new SpicyShirimp("매운새우깡2",6000)
		};
		
		SnackBox<Snack> 박스3= new SnackBox<>();
		박스3.makeBox(과자배열[0]);
		SnackBox<Snack> 박스4= new SnackBox<>();
		박스4.makeBox(과자배열[1]);
		SnackBox<Snack> 박스5= new SnackBox<>();
		박스5.makeBox(과자배열[2]);
		
	}

}
