package test2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test {

	public static void main(String[] args) throws ParseException {
		
		Date today = new Date();
		System.out.println(today);
		
		System.out.println(today.getYear()+1900);
		
		System.out.println(today.getMonth()+1);
		
		System.out.println(today.getHours()+":"+today.getMinutes()+":"+today.getSeconds());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		
		String myDate = sdf.format(today);
		
		System.out.println(myDate);
		
		SimpleDateFormat time = new SimpleDateFormat("hh시 mm분 ss초");
		String myTime = time.format(today);
		System.out.println(myTime);
		
		// 날짜 차이 구하기
		// 2024.12.18 부터 오늘까지 몇일인지 구하기
		
		Date start = new SimpleDateFormat("yyyy.MM.dd").parse("2024.12.18");
		
		long difsec = (today.getTime() - start.getTime());
		System.out.println(difsec);
		
		long difmin = difsec/60;
		System.out.println(difmin);
		
		long difhour = difmin/60;
		System.out.println(difhour);
		
		long difDays = difhour/24;
		System.out.println(difDays);
		
		
	}

}
