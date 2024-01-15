package conceptsJava;

public class ConstructorEg1 {

	ConstructorEg1() {
		this(10);
		System.out.println("no-arg");
	}

	public ConstructorEg1(int i) {

		this(10.5);
		System.out.println("int-arg");
	}

	public ConstructorEg1(double d) {

		System.out.println("double-d");
	}

	public static void main(String[] args) {

		ConstructorEg1 t = new ConstructorEg1();
		
		ConstructorEg1 t1 = new ConstructorEg1(10);
		
		ConstructorEg1 t3 = new ConstructorEg1(10.5);

	}

}
