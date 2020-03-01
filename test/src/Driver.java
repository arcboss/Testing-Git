import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;

public class Driver {

	public static void main(String[] args) {

		System.out.println("Hello, Hello, we are using Git!");
		
		ArrayList<String> cars = new ArrayList<String>() ;
		
		cars.add("Volvo");
		cars.add("Suzuki");
		cars.add("Maruti");
		cars.set(2, "BMW");
		cars.add("Lambo");
		cars.remove(3);
		cars.add("Ford");
		cars.add("Mazda");
		
		Collections.sort(cars);
		System.out.println(cars.size());
		
		System.out.println(cars);
		
		for(String i : cars) {
			System.out.println((i));
		}
		
		ArrayList<Integer> myNumber = new ArrayList<Integer>();
		
		myNumber.add(10);
		myNumber.add(20);
		myNumber.set(1,15);
		myNumber.add(20);
		myNumber.remove(2);
		myNumber.add(5);
		myNumber.add(25);

		System.out.println(myNumber);
		
		Collections.sort(myNumber);
		System.out.println(myNumber);			
		for (int i : myNumber) {
			System.out.println(i);
		}
		
		HashMap<String, String> countryCity = new HashMap<String, String> ();
		
		countryCity.put("England", "London");
		countryCity.put("Bangladesh", "Dhaka");
		countryCity.put("Canada", "Toronto");
		
		countryCity.remove("England");

		System.out.println(countryCity.size());
		
		System.out.println(countryCity.get("Toronto"));	
		
		System.out.println(countryCity);
		
//		Collections.sort(strings);
		
		for (String i : countryCity.keySet()) {
			System.out.println(i);
		}
		
		
		HashMap<String, Integer> peopleAge = new HashMap<String,Integer>();
		
		peopleAge.put("Abdur", 25);
		peopleAge.put("Jibon", 28);
		peopleAge.put("Jahan", 26);
		
		peopleAge.remove("Jibon");
		
		for (String i: peopleAge.keySet()) {
			System.out.println(i +"	"+ peopleAge.get(i) );
		}
		
	}

}
