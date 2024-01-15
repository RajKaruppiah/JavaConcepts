package constructors.examples;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class Example1 {
	
	 Example1() {   //constructor do not have return type (including void)

		System.out.println("Hello Constructor");
	}

	public static void main(String[] args) {

		Example1 name = new Example1();
		Example1 name2 = new Example1();
		Example1 name3 = new Example1();
	
				
	}

}


class Example2
{
	String name;
	int rollno;
	
	public Example2(String name, int rollno) {

		this.name=name;
		this.rollno=rollno;
		
		System.out.println("name is "+name +" and"+ " roll number is "+rollno);
	}
	
	public static void main(String[] args) {
		
		Example2 obj = new Example2("Raj", 10);
		Example2 obj2 = new Example2("Ram", 11);
		Example2 obj3 = new Example2("Rakesh", 103);
		
//		System.out.println(obj.name +" "+obj.rollno);
//		System.out.println(obj2.name +" "+obj2.rollno);
	}
	
}