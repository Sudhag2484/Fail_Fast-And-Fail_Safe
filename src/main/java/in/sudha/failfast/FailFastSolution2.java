package in.sudha.failfast;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastSolution2 {


	public static void main(String[] args) {
	   
		CopyOnWriteArrayList<Integer> li = new CopyOnWriteArrayList<>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		
		System.out.println("Before Removing element 2");

	  Iterator<Integer> it = li.iterator();
	  while(it.hasNext()) {
		  Integer value = it.next();
		  System.out.println(value);

		  if(value.equals(2)) {
			  li.remove(value);
		  }
	  }
	  System.out.println("After Removing element 2");
	  Iterator<Integer> it1 = li.iterator();
	  while(it1.hasNext()) {
		  Integer value = it1.next();
		  System.out.println(value);
	}
		
	}
}
