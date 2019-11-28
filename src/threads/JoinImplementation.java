package threads;


class Employee{
	int id;
	String name;
	
	Employee(int id, String name){
		this.id = id;
		this.name = name;
	}
}

public class JoinImplementation {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(1,"Harman");
		JoinImplementation test = new JoinImplementation();
		test.passByRefTest(e1);
		System.out.println(e1.id);
		System.out.println(e1.name);
		
	}
	
	public static void passByRefTest(Employee obj) {
//		obj.name = "Update Name";
		obj = null;
	}

}
