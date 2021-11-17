
public class ConstructorExample {
	
	
	public  ConstructorExample() {   //hidden constructor, automatically will be called)
		
		System.out.println("Default constructor");
			
	}
	
	public  ConstructorExample(int i) {
		
		System.out.println("single parms constructor");
		System.out.println("the value of i is " +i);
		
		
	}
	
	public  ConstructorExample(int i, int j) {
		
		System.out.println("two parms constructor");
		System.out.println("the value i " +i);
		System.out.println("the value of j "+j);
		
	}
	
	

	public static void main(String[] args) {
		
		ConstructorExample obj = new ConstructorExample();
		
		ConstructorExample obj1=new ConstructorExample(10);
		
		ConstructorExample obj2= new ConstructorExample(5,15);
		
		
	}

}
