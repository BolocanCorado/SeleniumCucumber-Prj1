package stepDefinitions;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.XMLParser;

public class AmountDigits {

	    private String fileName;
	    private String elementName;
	    private String extractedContent;
	    private String accountName;

	    @Given("I have an XML file named {string}")
	    public void i_have_an_xml_file_named(String fileName) {
	    	this.fileName = fileName;
	    }
	    @When("I extract the total amount {string}")
	    public void i_extract_the_total_amount(String elementName) {
	    	this.elementName = elementName;
	        this.extractedContent = XMLParser.extractTotalAmount(fileName, elementName);
	    }
	    @Then("check total amount {string}")
	    public void check_total_amount(String expectedContent) {
	    	assertEquals("8000.2", extractedContent);
	    	int Amount = extractedContent.length();
	    	if (Amount >= 2) {
	    		System.out.println("Total amount has " + Amount + " digits");
	    	}
	    }
	    
	    @Then("I extract the amount of {string}")
	    public void i_extract_the_amount_of(String accountName) {
	    	this.accountName = accountName;
	        this.extractedContent = XMLParser.extractAccountAmount(fileName, accountName);
	    }
	    @Then("Check total amount is correct")
	    public void check_total_amount_is_correct() {
	        // Write code here that turns the phrase above into concrete actions
	        System.out.println("TEST");
	    }

	}
