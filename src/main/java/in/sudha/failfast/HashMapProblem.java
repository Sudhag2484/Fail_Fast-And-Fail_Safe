package in.sudha.failfast;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapProblem {
	
	public static void main(String[] args) {
		
		
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		
		hashMap.put(1, 1);
		hashMap.put(2, 2);
		hashMap.put(3, 3);
		
		Iterator<Integer> iterator = hashMap.keySet().iterator();
		while(iterator.hasNext()) {
			Integer key = iterator.next();
			System.out.println("Map value "+hashMap.get(key));
			if(key.equals(2)) {
				hashMap.put(4, 4);
			}
		}
		
	}
}
