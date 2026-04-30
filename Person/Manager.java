package Person;

public class Manager extends Employee {
	int teamSize;
	
	public Manager(String name, int age, double salary, int teamSize) {
		super(name, age, salary);
		this.teamSize = teamSize;
	}
	@Override
	
	public void displaySalary() {
		super.displaySalary();
		System.out.println("I manage a team of" + teamSize + " people.");
	}

	public static void main(String[] args) {
		Employee e1 = new Employee("David", 28, 60000);
		Manager m1 = new Manager("Eve",40,90000,5);
		
		System.out.println("Employee:");
		e1.introduce();
		e1.displaySalary();
		System.out.println("\nManager:");
		m1.introduce();
		m1.displaySalary();

	}

}
