package Person;

public class Person {
	String name;
	int age;

	public Person (String name,  int age) {
		this.name = name;
		this.age = age;

	}
	public void introduce() {
		System.out.println("Hi, name is " + name + " and I am " + age + " years old.");
	}
	
	public static void mai(String[]args) {
		Person p1 = new Person("Alice", 20);
		p1.introduce();
	}

}
