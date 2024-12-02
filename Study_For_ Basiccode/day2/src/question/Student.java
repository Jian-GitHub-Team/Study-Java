package question;

public class Student {
	Teacher[] teacher = new Teacher[10];
	String name;
	int age;
	char gender;

	public Student() {
		teacher[0] = new Teacher("tom", "math", 12);
	}
}
