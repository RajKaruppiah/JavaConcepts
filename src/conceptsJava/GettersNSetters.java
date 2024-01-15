package conceptsJava;

public class GettersNSetters {

	String name;
	int age;

	public static void main(String[] args) {

		GettersNSetters obj = new GettersNSetters();

		obj.setAge(25);
		obj.setName("Raj");

		System.out.println(obj.getAge());
		System.out.println(obj.getName());

		obj.printUserDetails();

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void printUserDetails() {

		System.out.println(getAge() + ", " + getName());

	}

}
