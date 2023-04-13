package t5_set;

import java.util.HashSet;

// set계열 : 집합자료형이다. 순서에 상관없고, 자료의 중복을 허용하지 않는다.
public class T1_HashSet {

	public static void main(String[] args) {
		HashSet<String> hash = new HashSet<>();
		
		System.out.println("hash의 크기 : " + hash.size());
		System.out.println();
		
		// 자료추가
		hash.add("Java");
		hash.add("Database");
		hash.add("HTML5");
		hash.add("CSS3");
		hash.add("Javascript");
		hash.add("jQuery");
		
		System.out.println("hash의 크기 : " + hash.size());
		System.out.println("hash : " + hash);
		System.out.println();
		
		hash.add("Java");
		hash.add("java");
		System.out.println("hash의 크기 : " + hash.size());
		System.out.println("hash : " + hash);
		System.out.println();
		
		hash.remove("java");
		System.out.println("hash의 크기 : " + hash.size());
		System.out.println("hash : " + hash);
		System.out.println();
		
		hash.clear();
		System.out.println("hash의 크기 : " + hash.size());
		System.out.println("hash : " + hash);
		System.out.println();
		
		if(hash.isEmpty()) {
			System.out.println("자료가 없습니다.");
		}
		else {
			System.out.println("자료가 존재합니다.ㄴ");
		}
	}

}
