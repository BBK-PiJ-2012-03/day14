public class MyListScript {

public static void main(String[] args) {
		MyListScript script = new MyListScript();
		script.launch();
	}
 
	public void launch() {
		MyList myList = new MyList(new int[] {2,4,6,8,10});
		System.out.println(myList.contains(8));
	}
}	
		