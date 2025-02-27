package customer;

import java.util.Date;

import store.Fruit;

public class Buyer {
	private int money;
	private Fruit item;
	public void setItem(Fruit item) {
		this.item = item;
	}

	private Date buyDate;
	
	public Buyer(int money) {
		this.money = money;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public Fruit getItem() {
		return item;
	}

	public Date getBuyDate() {
		return buyDate;
    }
		   
    public void setBuyDate(Date buyDate) {
		this.buyDate = buyDate;
  }
		   
	@Override
	public String toString() {
		return "보유 머니 : "+this.money+"원 구매일 : " +this.buyDate+ " 구매음료 : "+this.item;
	}
	
}
