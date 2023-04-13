package t3_String;

public class T7_split {
	public static void main(String[] args) {
		// split() : 문자열(배열)을 특정문자(열)로 분리한다. 분리된 항목이 각가의 배열요소로 저장된다.
		
		String tel = "010-123-4567";
		
		String[] telArr = tel.split("-");
		
		for(String item : telArr) {
			System.out.print(item + " / ");
		}
		System.out.println();
		
		System.out.println("지역번호 : " + telArr[0]);
		System.out.println("국번호 : " + telArr[1]);
		System.out.println("전화번호 : " + telArr[2]);
		System.out.println();
		
		// 마지막의 '/'를 제거후 출력하시오.
		String telTemp = "";
		for(String tt : telArr) {
			telTemp += tt + "/";
		}
		System.out.println("telTemp : " + telTemp);
		System.out.println("telTemp : " + telTemp.substring(0,telTemp.length()-1));
		
		// join() : 특정문자로 문자(열)을 결합시켜준다.
		String telJoin = String.join("@", telArr);
		System.out.println("telJoin : " + telJoin);
	}
}
