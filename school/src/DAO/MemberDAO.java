package DAO;

import java.sql.SQLException;

public class MemberDAO extends DBconnect{

	public boolean userIdAndPassword(String mId, String mPw) {
		// 입력한 아이디와 비밀번호로 테이블 조회 하기
		String sql = "select * from member1 where member_id = '"+mId+"' and password = '"+mPw+"'";
		try {
		st = conn.createStatement();
		rs = st.executeQuery(sql); // statement로 쿼리 보내고 결과받기
		if(rs.next()) { // 조회결과가 있다면 next는 true, 없다면 false
			return true; // 로그인 성공하면 true 변환
		}
		} catch(SQLException e) {
			System.out.println("");
			e.printStackTrace();
		}
		return false; // 로그인 실패(아이디 또는 비번잘못) false 반환
	}

}
