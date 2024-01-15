package objectOrientedPrograming;

public class InheritanceTest {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Vehicle();
		vehicle.brake();
		vehicle.go();
		
		Vehicle vehicle2 = new Car();
		vehicle2.brake();
		
		vehicle2.go();
		
		vehicle2.stop();
		
		System.out.println();
		System.out.println("*************************");
		
		Car car = new Car();
		car.go();
		car.brake();
		System.out.println(car.wheels);
		
		
		Bicycle bike = new Bicycle();
		bike.go();
		bike.wheels();
//		System.out.println(bike.wheels);
		
		Bus bus = new Bus();
		bus.go();
		
		
		

	}

}
