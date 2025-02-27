package customer;


import java.sql.*;
import java.util.Scanner;

import java.util.Date;
import store.*;



public class MainMethod {

	public static void main(String[] args) {
		Banana[] ba = new Banana[15];
		ba[0] =new Banana(2500,500);
//		ba[0].makeJuice();
		
		// 다형성 - 하나의 타입으로 여러개의 타입을 다룰 수 있다.
		// 상속 관계 Implemert
	
//		Fruit f = new Banana(2500,500);
//		f.makeJuice();
//		Fruit g = new Grape(3500,400);
//		g.makeJuice();
		
		Fruit[] menu = new Fruit[10];
//		menu[0] = new Banana(2500,350);
//		menu[1] = new Banana(3000,400);
//		menu[2] = new Orange(3500,400);
//		menu[3] = new Banana(3500,500);
//		menu[4] = new Grape(4500,350);
//		menu[5] = new Banana(4500,550);
//		menu[6] = new Grape(5000,450);
//		menu[7] = new Orange(4000,350);
//		menu[8] = new Orange(5000,550);
//		menu[9] = new Grape(6000,600);
		
//		menu[2].makeJuice();
//		menu[6].pieceFruit();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패");
			e.printStackTrace();
		}
		
		//계정로그인
		String user = "java";
		String password = "1234";
		String url = "jdbc:mysql://localhost:3306/java";
		
		//데이터베이스와 연결한 객체를 저장해둬야 한다.
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(url,user,password);
		} catch (SQLException e) {
			System.out.println("접속 실패");
			e.printStackTrace();
		}
		
		// 쿼리문 작성하여 보내고 받기
		// select * from store_menu1;
		
		String sql = "select * from store_menu1";
		// 작성한 쿼리문을 데이터베이스에 보내래면
		// Statement, PreparedStatment
		
		Statement st = null;
		ResultSet rs = null;
		
		try {
		st = conn.createStatement();
		rs = st.executeQuery(sql);
		
		// rs.next() 를 통해서 조회된 결과값이 존재하는지 확인
		for(int i=0; rs.next(); i++) {
			int cost = rs.getInt("cost");
			int cap = rs.getInt("capacity");
			String type = rs.getString("fruit_type");
			if(type.equals("banana")){
					menu[i] = new Banana(cost,cap);
					}
			if(type.equals("grape")){
				menu[i] = new Grape(cost,cap);
				}
			if(type.equals("orange")){
				menu[i] = new Orange(cost,cap);
				}
		}} catch(SQLException e) {
			System.out.println("쿼리문 조회 실패");
			e.printStackTrace();
		}
		
		
		// 데이터베이스에서 조회한 데이터를 바나나, 포도, 오렌지 객체로 저장될 수 있게 하기
		
		
		Buyer ctm1 = new Buyer(10000);
		
		
		for(int i=0; i<menu.length; i++) {
			System.out.println((i+1)
					+". "+menu[i]);
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("구매 번호 : "); 
		int num = sc.nextInt();
		
		ctm1.setMoney(ctm1.getMoney() -menu[num-1].getCost());
		
		ctm1.setBuyDate(new Date());
		ctm1.setItem(menu[num-1]);
		
		
		System.out.println(ctm1);
	
	}

}
