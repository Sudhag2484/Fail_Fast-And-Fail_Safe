package in.sudha.failfast;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFastSolution1 {
	
// Iterator Solution-1
	public static void main(String[] args) {
	   
		ArrayList<Integer> li = new ArrayList<>();
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
			  it.remove();
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


