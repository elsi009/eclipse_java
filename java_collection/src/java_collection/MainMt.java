package java_collection;

import java.util.ArrayList;

public class MainMt {

	public static void main(String[] args) {
		
//		MyArray a = new MyArray();
//		a.add(100);
//		a.add(20);
//		a.add(50);
//		a.add(1232);
//		a.add(543);
//		
//		
//		System.out.println(a.arr[4]);
		
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(2323);
		list.add("장미란");
		list.add("포카칩");
		list.add(3.144);
		
		System.out.println(list.size());
		
		System.out.println(list.get(2));
		
		System.out.println(list.indexOf("포카칩"));
		
		list.remove(0);
		list.remove("포카칩");
		System.out.println(list);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for(Object o: list) {
			System.out.println(o);
		}
		
		list.add(1,"내가원하는곳");
		
		System.out.println(list);
		
		System.out.println(list.contains("장미란"));
		
		list.clear(); // 배열 모두 삭제
		
		System.out.println(list);
		
		
	}

}

/*
	자바 컬렉션 프레임 워크
	자료구조와 알고리즘을 클래스화 시켜놓은것
	자료구조 - 데이터를 저장관리하는 방법
	알고리즘 - 저장된 데이터를 가공하는 방법
	
	
		Collection 				Map
			List					HashMap
				ArrayList			TreeMap
				LinkedList			Properties
				Vector
				Stack
				Queue
			Set
				HashSet
				TreeSet


*/