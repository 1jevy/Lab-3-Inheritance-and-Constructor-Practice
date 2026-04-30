package Person;

public class PolymorphismDemo {

	public static void main(String[] args) {
		Person[] people= new Person[3];
		people[0]= new Person("Alice", 22);
		people[1]= new Student("Bob", 19, "College");
		people[2]= new Employee("Charlie", 35, 70000);
		
		for(Person p: people) {
			p.introduce();
			System.out.println();
		}

	}

}
