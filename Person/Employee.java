package Person;

public class Employee extends Person {
	public Employee(String name, int age, double salary) {
		super(name, age);
		this.salary = salary;
		// TODO Auto-generated constructor stub
	}

	double salary;
public void displaySalary() {
	System.out.println("My salary is $" + salary);
}
	public static void main(String[] args) {
		Employee e1 = new Employee("Charlie", 30, 55000);
		e1.introduce();
		e1.displaySalary();

	}

}
