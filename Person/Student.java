package Person;

public class Student extends Person{
	String school;

	public Student(String name, int age, String school) {
		super(name, age);
		this.school = school;
		// TODO Auto-generated constructor stub
	}
@Override public void introduce() {
	super.introduce();
	System.out.println("I attend " + school + ".");
}
	public static void main(String[] args) {
		Student s1 = new Student("Bob", 18, "High School");
		s1.introduce();

	}

}
