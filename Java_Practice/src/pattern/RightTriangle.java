package pattern;

public class RightTriangle {


	
	public static void main(String[] args) {

		pattern1(10);
//		pattern2(10);
	
	}

	static void pattern1(int n) {
		for(int row =1 ; row<=n; row++) {
			for(int col=1; col<=row; col++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
	}
	
	static void pattern2(int n) {
		for(int row =10 ; row<=n; row--) {
			for(int col=10; col<=row; col--) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
	}
	
}
