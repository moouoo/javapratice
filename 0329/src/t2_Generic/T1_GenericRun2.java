package t2_Generic;

public class T1_GenericRun2 {
	public static void main(String[] args) {
		T1_GenericVO2 vo = new T1_GenericVO2();
		
		vo.setObject(3);
		System.out.println("su1 : " + vo.getObject());
		
		vo.setObject(3.14);
		System.out.println("su2 : " + vo.getObject());
		
		vo.setObject("안녕");
		System.out.println("str1 : " + vo.getObject());
		System.out.println();
		
//		Atom atom = new Atom();
//		atom.aa();
		
		vo.setObject(new Atom());
		System.out.println("vo.getObject() : " + vo.getObject());
		
		Atom atom = (Atom) vo.getObject();
		atom.aa();
	}
}
