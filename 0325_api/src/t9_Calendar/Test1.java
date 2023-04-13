package t9_Calendar;

import java.util.Calendar;

public class Test1 {

	public static void main(String[] args) {
		
		Calendar today = Calendar.getInstance();
		
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH) + 1;
		int day = today.get(Calendar.DATE);
		
		System.out.println("년-월-일 : "+year+"-"+month+"-"+day);
		
		// 요일 : 1(일), 2(월), 3(화), 4(수), 5(목), 6(금), 7(토)
		int week = today.get(Calendar.DAY_OF_WEEK);
		System.out.println("오늘은 "+week+"요일 입니다.");
		
		String strWeek = "";
		switch(week) {
			case 1:
				strWeek = "일";
				break;
			case 2:
				strWeek = "월";
				break;
			case 3:
				strWeek = "화";
				break;
			case 4:
				strWeek = "수";
				break;
			case 5:
				strWeek = "목";
				break;
			case 6:
				strWeek = "금";
				break;
			case 7:
				strWeek = "토";
				break;
		}
		System.out.println("오늘은 "+strWeek+"요일입니다.");
		
		int hour = today.get(Calendar.HOUR);
		int minute = today.get(Calendar.MINUTE);
		int second = today.get(Calendar.SECOND);
		
		System.out.println("년-월-일 시:분:초(요일) => "+year+"-"+month+"-"+day+" "+hour+":"+minute+":"+second+"("+strWeek+"요일)");
		

		
	}

}
