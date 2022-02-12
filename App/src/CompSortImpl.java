import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompSortImpl {
	public static void main(String[] args) {
		List<Person> arr = new ArrayList<Person>();
		
		arr.add(new Person("Juliano 001", 30));
		arr.add(new Person("Juliano 002", 32));
		arr.add(new Person("Juliano 003", 21));
		arr.add(new Person("Juliano 004", 31));
		
		for (Person p : arr ) {
			System.out.println(p.getName() + " " + p.getAge() );
		}
		
		System.out.println("");
		
//		Collections.sort((List) arr);
		Collections.sort((List) arr, new Person());
		
		for (Person p : arr ) {
			System.out.println(p.getName() + " " + p.getAge() );
		}
	}
}	
