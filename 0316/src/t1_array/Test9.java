package t1_array;

public class Test9 {
	public static void main(String[] args) {
	
		double[] dd = new double[5];
		dd[0] = 0;
		dd[4] = 10;
		dd[2] = 3.14;
		
		for(int i=0; i<dd.length; i++) {
			System.out.println("dd["+i+"] = " + dd[i]);
		}
		System.out.println("========================");
		
		boolean[] bb = new boolean[5];
		bb[2] = true;
		bb[bb.length-1] = true;		
		for(int i=0; i<bb.length; i++) {
			System.out.println("bb["+i+"] = " + bb[i]);
		}
		System.out.println("========================");
		
		String[] ss = new String[5];
		ss[1] = "seoul";
		ss[3] = "busan";
		ss[ss.length - 1] = "cheongju";
		for(int i=0; i<ss.length; i++) {
			System.out.println("ss["+i+"] = " + ss[i]);
		}
		System.out.println("========================");
	}
}
