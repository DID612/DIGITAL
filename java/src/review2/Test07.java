package review2;

import java.util.HashMap;
import java.util.Iterator;

public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> map = new HashMap<String, String>();
		map.put("2020160001", "홍길동");
		map.put("2020160002", "임꺽정");
		//순서를 보장하지 않기 때문에 반복문을 사용할 수 없다.
		//keyset() set으로 키값을 하나로 뭉침. 중복 불가이기 때문에 ㄱㅊ
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			String value = map.get(key);
			System.out.println("학번 : " +  key +", 이름 : "+value);
		}
	}

}
