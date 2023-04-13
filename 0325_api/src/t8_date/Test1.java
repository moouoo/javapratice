package t8_date;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
	public static void main(String[] args) {
		
		// Date 객체
		Date today = new Date();
		System.out.println("1.오늘 날짜(기본형식) : " + today);
		
		// 날짜 객체 문자화 : toString()
		String strToday = today.toString();
		System.out.println("2.오늘 날짜(문자기본형식) : " + strToday);
		
		// 날짜형식을 사용자 지정에 따라 변경하기 : SimpleDateFormat()
		// 매개변수 - 년도(yy,yyyy), 월요일(M), 일(d), 시간(h, H), 분(m), 초(s)
		//SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-M-dd");
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		String strNow = sdf1.format(today);
		System.out.println("년-월-일 " + strNow);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("H:m:s");
		String strTime = sdf2.format(today);
		System.out.println("현재시간은? " + strTime);
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd H:m:s");
		String strNow2 = sdf3.format(today);
		System.out.println("현재 날짜/시간은? " + strNow2);

		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy년 MM월 dd일 H시m분s초");
		String strNow4 = sdf4.format(today);
		System.out.println("현재 날짜/시간은? " + strNow4);
		
		int su1 = 12;
		double su2 = 123.4567;
		// DecimalFormat 클래스 : 숫자형식설정
		DecimalFormat df = new DecimalFormat("0,000"); // 자릿수를 확보해서 넣어준다.
		System.out.println(df.format(su1));
		
		DecimalFormat df2 = new DecimalFormat("#,##0"); // 위에 나타내는 값을 보완하기 위해서 만들어진 것
		System.out.println(df2.format(su1));
		
		DecimalFormat df3 = new DecimalFormat("#,##0.0"); // .0을 붙여줌으로써 소수점단위표시 및 저절로 반올림해줌
		System.out.println(df3.format(su2));
		
		
	}
}
