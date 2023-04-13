package t3;

//할당연산자(대입연산자) - +=, *=, /=, %=
public class Test4 {
	
	public static void main(String[] args) {
		int su1=10, su2=20;
		int res = 30, res2 = 0;
		
//		res = res + su1;
		res += su1;
		System.out.println("res : " + res);
		
		res2 = res2 + (su1 + su2);	//res2 = 30
		res2 += (su1 + su2);		//res2 + (su1 + su2)
		System.out.println("res2 : " + res2);
	}
}
