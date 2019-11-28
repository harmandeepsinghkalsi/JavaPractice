package collections;

import java.util.TreeSet;

class Employee implements Comparable<Employee> {
	int id;
	String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int compareTo(Employee o) {
		if(this.id<o.id)
			return -1;
		else if(this.id>o.id) {
			return 1;
		} else {
			return 0;
		}
	}
}

public class Collection1 {

	public static void main(String[] args) {
		
		TreeSet<Employee> ts = new TreeSet<>();
		ts.add(new Employee(1,"Harman"));
		ts.add(new Employee(2, "TestUser"));
		
		System.out.println(ts);
		
	}

}
