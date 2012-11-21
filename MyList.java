import java.util.*;
public class MyList {
  private ArrayList list;

	public MyList(int[] intArray) {
		 
		list = asList(intArray);
	}

	
	public ArrayList asList(int[] myArray) {
		ArrayList myArrayList = new ArrayList();
		
		for(int i=0; i < myArray.length ; i++) {
			myArrayList.add(myArray[i]);
		}
		return myArrayList;
	}
	
	
	public boolean contains(int element) {
		if (list.isEmpty()) {
			return false;
		}
		
		else {
				int midElement = (int) list.get(list.size()/2);
				
				if (midElement == element) {
					return true;
				}

				else if (midElement > element) {
					ArrayList anotherList = new ArrayList();
					
					for(int i=0; i<(list.size()/2);i++) {
						anotherList.add(list.get(i));
					}	
					return (anotherList.contains(element));
					
				}
				
				else {
					ArrayList anotherList = new ArrayList();
					for(int i = (list.size()/2); i < (list.size()) ; i++) {
						anotherList.add(list.get(i));
					}	
					return (anotherList.contains(element));
				
				}
		}
	
	
	
	
	
	}
	
}	
  
  

