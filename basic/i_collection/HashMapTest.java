package i_collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();//HashMap을 많이 사용
		
		map.put("유다영", 100);//HashMap은 toString으로 오버라이드 되어 주소 대신 값을 넣어도 된다.
		map.put("구인수", 83);
		map.put("나진실", 99);
		map.put("유민지", 98);
		
		System.out.println(map);
		System.out.println(map.get("구인수"));//해당 key의 value를 되돌려줌
		
		map.remove("나진실");
		System.out.println(map);
	
		map.put("유민지", 95);//중복이 있으면 최근에 들어간 값으로 수정
		System.out.println(map);
		
		
		
		
		
		
	}
}
