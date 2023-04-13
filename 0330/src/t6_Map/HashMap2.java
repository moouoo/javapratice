package t6_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMap2 {

	public static void main(String[] args) {
		
		Map<String, List<Integer>> listMap = new HashMap<>();
		System.out.println("listMap : " + listMap);
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		listMap.put("mbc", list);
		System.out.println("mbc : " + listMap.get("mbc"));
		
		List<Integer> list2 = listMap.get("mbc");
		System.out.println("list2 : " + list2);
		System.out.println("list2(0) : " + list2.get(0));

		
		System.out.println("mbc : " + listMap.get("mbc").get(0));
	}

}
