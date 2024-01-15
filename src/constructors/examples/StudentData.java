package constructors.examples;

public class StudentData {

	private int studId;
	private String studName;
	private int StudAge;

	public StudentData() {

		studId = 100;
		studName = "Raj";
		StudAge = 15;
	}

	StudentData(int num1, String str, int num2) {
		studId = num1;
		studName = str;
		StudAge = num2;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public int getStudAge() {
		return StudAge;
	}

	public void setStudAge(int studAge) {
		StudAge = studAge;
	}

	public static void main(String[] args) {
		
		StudentData obj = new StudentData();
		
		System.out.println(obj.StudAge);
		System.out.println(obj.studId);
		System.out.println(obj.studName);
		
		StudentData obj1 = new StudentData(101,"Raju",16);
		
		System.out.println(obj1.studId);
		System.out.println(obj1.studName);
		System.out.println(obj1.StudAge);

	}

}
