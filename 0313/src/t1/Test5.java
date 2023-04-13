package t1;

public class Test5 {
	public static void main(String[] args) {
		String str1, str2, str3;
		str1 = "홍길동";
		str2 = "학생";
		str3 = "서울";
		
		System.out.println("str1 + str2 + str3 = " + str1 + str2 + str3);
		System.out.println("str1 + str2 + str3 = " + str1 +"은 "+str2+"이고 "+str3+"에 산다.");
		System.out.println("str1 + str2 + str3 = " + str1 +"은 "+str2+"이고 "+str3+"에 산다.");
		System.out.println("str1 + str2 + str3 = " + "__은 __이고__에 산다.");
		
		String state;
		state = "집이다.";
		System.out.println("str1 + str2 + str3 = " + "__은 __이고__에 산다.");
		System.out.println(str1 + "은 "+str2+"이고 "+str3+"이 " + state);
		System.out.println("str1 + str2 + str3 = " + "__은\t __이고\n__이 __");
		System.out.println(str1+ "은\t "+str2+"이고\n"+str3+"이 "+ state);
		System.out.println();
		System.out.println("안녕!!");
		System.out.println("안녕's");
		System.out.println("안녕\"s");
		System.out.println("안녕\\s");
		
	}
	
}
