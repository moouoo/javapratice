package t6_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap4 {
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		map.put("a", "가");
		map.put("b", "나");
		map.put("c", "다");
		map.put("d", "라");
		map.put("e", "마");
		map.put("f", "바");
		map.put("g", "사");
		map.put("f", "아");
		System.out.println("map : " + map);
		
		Iterator<String> it = map.keySet().iterator();
		System.out.println("it : " + it);
		while(it.hasNext()) {
			String key = it.next();
			String value = map.get(key);
			System.out.println("키 : " + key+ " , 값 : " + value);
		}
		
		// '키'만 참조?
		System.out.println("키 : " + map.keySet());
		
		// '값'만 참조?
		System.out.println("값 : " + map.values());
		
		for(String item : map.values()) {
			System.out.print(item + " \t ");
		}
		
	}
}
