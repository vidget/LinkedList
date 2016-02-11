import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class App {

	public static void main(String[] args) {
		
		//ArrayLists manage arrays internally
		//[0][1][2][3][4][5]......
		
		
		//If you only want to add or remove items from the the end of your list
		//use an ArrayList
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		//LinkedLists consists of elements where each elements
		//has a reference to the previous and next element
		//[0]<->[1]<->[2]<->[3]<->[4]<->[5]....
		
		
		
		//When removing or adding  items from the beginning or middle 
		//use a LinkedList
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		
		doTimings("ArrayList", arrayList);
		doTimings("LinkedList", linkedList);
 
	}
	
	//can send in both types of lists
	private static void doTimings (String type, List<Integer> list){
		
		for(int i=0; i<1E5;i++){
			list.add(i);
		}
		
		long start = System.currentTimeMillis();
		
		//Time taken 0 ms for ArrayList
		//Time taken 10 ms for LinkedList
		//Add itmes at the end of the list
		for(int i=0; i<1E5;i++){
			list.add(i);
	    }
		
		
		//Add items elsewhere in the list
		//Time taken 6679 ms for ArrayList
		//Time taken 26 ms for LinkedList
		
		//for(int i=0; i<1E5;i++){
		//	list.add(0, i);
		//}
		
		
		
		long end = System.currentTimeMillis();
		
		System.out.println("Time taken "+ (end-start)+" ms for "+ type);
		
	}

}
