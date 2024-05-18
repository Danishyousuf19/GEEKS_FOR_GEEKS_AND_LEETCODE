import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.time.LocalDateTime;

interface FirstInterface {
	public void myMethod(); // interface method
}
interface SecondInterface {
	public void myOtherMethod(); // interface method
}

class DemoClass extends abs implements Comparable<DemoClass>, FirstInterface, SecondInterface {
	public void myMethod() {
		System.out.println("Some text..");
	}

	public void myOtherMethod() {
		System.out.println("Some other text...");
	}

	@Override
	void meth() {
		System.out.println("i am abs");

	}

	@Override
	public int compareTo(DemoClass o) {
		// TODO Auto-generated method stub
		return 0;
	}
}

abstract class abs {
	abstract void meth();
}

public class interfaces {
	enum level {
		medium, high, low;

	}

	public static void main(String[] args) {
		DemoClass myObj = new DemoClass();
		abs myObj2 = new DemoClass();
		myObj2.meth();

		for (level k : level.values()) {
			System.out.println(k);
		}
		myObj.myMethod();
		myObj.myOtherMethod();
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		LocalDateTime myDateObj = LocalDateTime.now();
		System.out.println("Before formatting: " + myDateObj);
		DateTimeFormatter df = DateTimeFormatter.ofPattern("MM-yy HH:mm:s");
		String f = myDateObj.format(df);

		System.out.println("After formatting: " + f);
		 ArrayList<String> cars = new ArrayList<String>();
		    cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    cars.add("Mazda");
		     
		    Collections.sort(cars, new Comparator<String>() {
	            
	            public int compare(String car1, String car2) {
	                // Compare car names in reverse order
	                return car2.compareTo(car1);
	            }
	        });
		    System.out.println(cars);

	}

}
