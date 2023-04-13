package t6_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMap3_2 {
	public static void main(String[] args) {
		Map<String, List<H3_InforVo>> listMap = new HashMap<>();
		List<H3_InforVo> vos = new ArrayList<>();
		H3_InforVo vo;
		
		vo = new H3_InforVo();
		vo.setName("홍길동");
		vo.setAge(25);
		vos.add(vo);
		
		vo = new H3_InforVo();		
		vo.setName("김말숙");
		vo.setAge(33);
		vos.add(vo);
		
		vo = new H3_InforVo();		
		vo.setName("이기자");
		vo.setAge(44);
		vos.add(vo);
		
		listMap.put("성명", vos);
		
		System.out.println("listMap : " + listMap);
		
		
		System.out.println("첫번째 명단 이름 : " + listMap.get("성명").get(0).getName());
		
		//List<H3_InforVo> vos = listMap.get("성명");
		vos = listMap.get("성명");
		for(H3_InforVo hVo: vos) {
			if(hVo.getName().equals("김말숙")) {
				System.out.println(hVo.getAge());
			}
		}
	}
}
