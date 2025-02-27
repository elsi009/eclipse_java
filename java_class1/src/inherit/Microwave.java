package inherit;

import study0226.Product;

public class Microwave extends Product{ // 전자레인지
	
	public Microwave() {
		System.out.println(super.brand);
	}
	
	@Override
	public void power() {
		System.out.println("전자렌지 전원");
	}
}
