package i_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class Collection_ArrayList {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();//인터페이스 다형성
		
		list1.add(new Integer(5)); //0번째 방에 인티저타입 5가 들어감
		list1.add(4);
		list1.add(3);
		list1.add(2);
		list1.add(1);//기본형 숫자 1이 들어가요 
		
		System.out.println(list1);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>(list1.subList(1, 4)); //list1 복제
		System.out.println(list2);//앞은 포함, 뒤는 미포함
		
//		Collections.s
		
		list2.add(1, 100);
		System.out.println(list2);//뒤로 밀어버림
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
