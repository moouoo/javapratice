package t3_LinkedList;

import java.util.LinkedList;

public class Test1 {
	public static void main(String[] args) {
	
		//List<String> vos = new LinkedList<>();
		LinkedList<String> vos = new LinkedList<>();
		
		System.out.println("vos크기 : " + vos.size());
		System.out.println("vos : " + vos);
		System.out.println();
		
		vos.add("홍길동");
		vos.add("김말숙");
		vos.add("김바보");
		vos.add("이거지");
		vos.add("신안녕");
		
		System.out.println("vos크기 : " + vos.size());
		System.out.println("vos : " + vos);
		System.out.println();
		
		String name = vos.get(2);
		System.out.println("name : " + name);
		System.out.println();
		
		vos.set(2, "김조용");
		System.out.println("vos크기 : " + vos.size());
		System.out.println("vos : " + vos);
		System.out.println();
		
		vos.remove(2);
		System.out.println("vos크기 : " + vos.size());
		System.out.println("vos : " + vos);
		System.out.println();
		
		name = vos.get(2);
		System.out.println("name : " + name);
		System.out.println();
		
		vos.clear();
		System.out.println("vos크기 : " + vos.size());
		System.out.println("vos : " + vos);
		System.out.println();
	}
}
