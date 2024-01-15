package interfac.example;

public class ICICIBank implements RBI{

	public static void main(String[] args) {

		ICICIBank obj = new ICICIBank();
		obj.interestRate();
		obj.repoRate();
		obj.bankBranch();
		
	}

	@Override
	public void interestRate() {

		System.out.println("Interest rate at ICICI 7%");
	}

	@Override
	public void repoRate() {

		System.out.println("Repo rate at ICICI 5.5%");
	}

	public void bankBranch() {
		System.out.println("In Chennai city branch");
	}
	
}
