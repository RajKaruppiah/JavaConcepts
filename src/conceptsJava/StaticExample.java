package conceptsJava;

class emp {
	
	int eid;
	int salary;
	static String ceo;
	
	public void showEmpDetails() {
		System.out.println(eid +" : " +salary +" : "+ceo);
		
	}
	
}



public class StaticExample {

	
	
	public static void main(String[] args) {

		emp emp1=new emp();
		emp1.eid=25;
		emp1.salary=25000;
		emp.ceo="Vikram";
		
		
		emp emp2=new emp();
		
		emp2.eid=26;
		emp2.salary=30000;
		emp.ceo="Vikram";
		
		emp1.showEmpDetails();
		emp2.showEmpDetails();
		
	}

}
