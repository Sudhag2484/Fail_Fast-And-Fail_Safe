package in.sudha.failfast;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapSolution {
	public static void main(String[] args) {

	ConcurrentHashMap<Integer, Integer> cmap = new ConcurrentHashMap<>();
	
	cmap.put(1, 1);
	cmap.put(2, 2);
	cmap.put(3, 3);
	
	Iterator<Integer> iterator = cmap.keySet().iterator();
	while(iterator.hasNext()) {
		Integer key = iterator.next();
		System.out.println("Map value "+cmap.get(key));
		if(key.equals(2)) {
			cmap.put(4, 4);
		}
	}
	}
}
