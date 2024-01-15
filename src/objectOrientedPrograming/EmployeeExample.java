package objectOrientedPrograming;

class Name
{
	String firstName;
	String middleName;
	String lastName;
	
	public Name(String fname, String mname, String lname) {
		this.firstName=fname;
		this.middleName=mname;
		this.lastName=lname;		
	}
	
}






public class EmployeeExample {
	
	int age;
	Name n;
	
	public  void display(int age, Name n) {
		
		System.out.println("Age " +age);
		System.out.println("First Name " +n.firstName +"\n" + "Middle Name " +n.middleName + "\n" +"Last Name " +n.lastName );
	}

	public static void main(String[] args) {

		EmployeeExample obj = new EmployeeExample();
		Name n = new Name("Raj", "KR", "Karuppiah");
		Name n1 = new Name("Bakiya", "R", "Rajasekaran");
		
		obj.display(25, n);
		obj.display(20, n1);
		
	}

}
