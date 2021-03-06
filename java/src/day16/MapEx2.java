package day16;

import java.util.HashMap;
import java.util.Iterator;

public class MapEx2 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("국어", 100);
		map.put("영어", 60);
		map.put("수학", 40);
		System.out.println("수학 : " + map.get("수학"));
		
		Iterator<String> it = map.keySet().iterator();
		//valueSet은 없지만 keySet은 있다.
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key +" : " + map.get(key) );
		}
	}

}
