package objectOrientedPrograming;

public class Car extends Vehicle{

	int wheels = 2;
	int pedals = 2;

	void wheels() {
		System.out.println("The car got 4 wheels");
	}

	void go() {
		System.out.println("The car goes at 60mphr");
	}

	void stop() {
		System.out.println("This stop is for car - overriding the vehicle ");
	}


}
