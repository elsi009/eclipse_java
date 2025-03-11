package java_study0310;

import java.util.TreeSet;

public class TreeMain {

	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<>();
		tree.add(35);
		tree.add(41);
		tree.add(29);
		tree.add(9);
		tree.add(15);
		tree.add(31);
		tree.add(20);
		
		System.out.println(tree);
		
		System.out.println(tree.headSet(20)); // 20미만의 숫자 찾아줌
		System.out.println(tree.tailSet(31)); // 31이상의 숫자 찾아줌
		
		// 특정 값 기준으로 작은 데이터 모두 찾기 -headSet
		// 특정 값 기준으로 큰 데이터 모두 찾기 - tailSet
		
		
		System.out.println(tree.first()); // 첫번째값
		System.out.println(tree.last()); // 마지막 값
		System.out.println(tree.higher(29));
		
		// higher - 해당값 보다 큰 값중에 가장 가까운거 찾기
		// 가장 가까운 값이 없으면 null
		
		System.out.println(tree.higher(100));
		System.out.println(tree.lower(30));
		// lower - 해당값보다 작은 값중에서 가장 가까운거 찾기
		
		System.out.println(tree.ceiling(39));
		// ceiling - 해당값 이상인 값중 가장 가까운거 찾기
		//			 해당값 포함해서 찾기 때문에 입력한 값이 나올수도 있음
		
		System.out.println(tree.floor(17));
		
		// floor -  해당값 이하인 값중 가장 가까운거 찾기
		// 			해당값 포함해서 찾기에 입력한 값이 나올수 있음
		
		System.out.println(tree.subSet(17,41));
		// subSet - 범위 지정하여 검색
		// subSet(a,b) a부터 b전까지 검색
			
		}
		
	}


