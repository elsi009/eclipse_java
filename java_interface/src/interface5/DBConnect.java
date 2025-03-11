package interface5;

import java.sql.*;

public class DBConnect {
	
	private Connection conn;
	private Statement st;
	private ResultSet rs;
	
	protected DBConnect() {
		connection();
	}
	
	private void connection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String user = "java";
			String password = "1234";
			String url = "jdbc:mysql://localhost:3306/java";
			
			conn = DriverManager.getConnection(url,user,password);
		}
		catch(Exception e) {
			System.out.println("드라이버 로드 실패 또는 연결 실패");
			e.printStackTrace();
		}
	}
	

}
