package in.sudha.failfast;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFast {
	
	
	public static void main(String[] args) {
	   
		ArrayList<Integer> li = new ArrayList<>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		
	  Iterator<Integer> it = li.iterator();
	  while(it.hasNext()) {
		  Integer value = it.next();
		  
		  if(value.equals(2)) {
			  li.remove(value);//occure ConcurrentModificationException
		  }
	  }
		
	}

}
