import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrSync {
	public static void main(String[] args) {
//		List<String> list = Collections.synchronizedList(new ArrayList<String>());

		List<String> list = new CopyOnWriteArrayList<String>();
		
		list.add("Juliano");
		list.add("Juliano 002");
		list.add("Juliano 003");
		
//		
//		synchronized (list) {
//			Iterator<String> iterator = list.iterator();
//			
//			while(iterator.hasNext()) {
//				System.out.println(iterator.next());
//			}
//		}
		
	}
}
