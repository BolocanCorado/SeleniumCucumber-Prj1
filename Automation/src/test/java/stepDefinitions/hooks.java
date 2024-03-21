package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
	
	@Before("@NetBanking")	
	public void netBankingSetup() {
		
		System.out.println("*******");
		System.out.println("Setup the entries in NetBanking database");
	}
	@After
	public void clearEntries() {
		
		System.out.println("*******");
		System.out.println("Clear the entries");
	}
	
	@Before("@Mortgage")
	public void morgageSetup() {
		
		System.out.println("*******");
		System.out.println("Setup the entries in Morgage database");
	}
	
}

// Before -> Background -> ScenarioExecution -> After
