<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement" %>


  
<%
	String myId = request.getParameter("id");
	String myPw = request.getParameter("pw");
	String myBt = request.getParameter("birth");
	String myEm = request.getParameter("em");
	
	// 데이터베이스 저장하기 - 하지만 아이디가 중복이면 저장안함
	
	Connection conn=null;
	
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String user = "java";
		String pass = "1234";
		String url = "jdbc:mysql://localhost:3306/java";
		conn = DriverManager.getConnection(url,user,pass);
	}catch(Exception e){
		System.out.println("드라이브 로드 실패 및 접속 실패");
		e.printStackTrace();
	}
	
	// 회원가입 양식에 입력한 내용을 테이블에 저장할 것이다.
	// 그전에 아이디 중복 확인
	
	ResultSet rs = null;
	Statement st = null;
	
	String sql ="select * from member1 where member_id='"+myId+"'";
	
	try{
		st = conn.createStatement();
		rs = st.executeQuery(sql);
		if(rs.next()){ // 참이면 아이디가 중복이라는 뜻이고, 거짓이라면 중복이 아니다.
			// 아이디가 중복이라면 회원가입 다시 하게 해줄것
			// 다시 회원 가입 양식 페이지로 이동해야한다.
			// 이동시키는 방법으로 javaScript 또는 내장객체를 사용하는 방법이 없다.
			%>
				<Script> 
				/* alert("아이디가 중복"); 
				//history.back();
				location.href="/main.jsp"; */
				</script>
			<% 
			response.sendRedirect("main.jsp");
			return;
		}
		
		
	}catch(Exception e){
		System.out.println("아이디 중복 조회 실패");
		e.printStackTrace();
	}
	
	// 아이디 중복이 아니니까 회원가입 내용 테이블에 저장 시키기 
	
	PreparedStatement pt = null;
	
	sql = "insert into member1(member_id, email, password, birth) values(?,?,?,?)";
	
	try{
		pt = conn.prepareStatement(sql);
		pt.setString(1, myId );
		pt.setString(2, myEm);
		pt.setString(3, myPw);
		pt.setString(4, myBt);
		pt.executeUpdate();
		
		
	}catch(SQLException e){
		System.out.println("회원가입 테이블 저장 실패");
		e.printStackTrace();
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2> 회원가입 완료 </h2>
	<h3> 회원 가입 내용 </h3>
	<ul>
		<li>아이디: <%=myId %></li>
		<li>비밀번호: <%=myPw %> </li>
		<li>생년월일 :<%=myBt %> </li>
		<li>이메일 : <%=myEm %></li>
	</ul>
	
	<a href= "main.jusp">Home</a>
</body>
</html>