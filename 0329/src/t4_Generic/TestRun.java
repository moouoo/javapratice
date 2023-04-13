package t4_Generic;

public class TestRun {
	public static void main(String[] args) {
		//TestVO vo = new TestVO();
		TestVO<Integer> intVo = new TestVO<Integer>();
		intVo.setObject(100);
		int intSu = intVo.getObject();
		System.out.println("intSu : " + intSu);
		System.out.println();
		
		TestVO<Double> dblVo = new TestVO<Double>();
		dblVo.setObject(3.14);
		double dblSu = dblVo.getObject();
		System.out.println("dblSu : " + dblSu);
		System.out.println();
		
		TestVO<String> strVo = new TestVO<String>();
		strVo.setObject("홍길동");
		String str = strVo.getObject();
		System.out.println("strSu : " + str);
		System.out.println();
		
		TestVO<Atom> atomVo = new TestVO<Atom>();
		atomVo.setObject(new Atom());
		Atom atom = atomVo.getObject();
		atom.aa();
		System.out.println(atom.name);
		System.out.println(atom.su1);
		System.out.println(atom.su2);
	}
}
