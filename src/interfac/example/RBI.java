package interfac.example;

public interface RBI {
	
	void interestRate();
	void repoRate();
	
}

class ICICI implements RBI
{

	@Override
	public void interestRate() {

		System.out.println("Interest rate at ICICI 7%");
	}

	@Override
	public void repoRate() {

		System.out.println("Repo rate at ICICI 5.5%");
	}
	
}