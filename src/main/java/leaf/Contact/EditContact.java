package leaf.Contact;

import org.testng.annotations.Test;

import wrappers.ProjectSpecificWrapper;


public class EditContact extends ProjectSpecificWrapper {

	@Test(groups={"sanity"},dependsOnGroups={"smoke"})
	public void editContact() throws Exception{
		//login();
		clickByLink("Contacts");
		clickByLink("Find Contacts");
		enterByXpath("(//label[contains(text(),'First name:')])[3]/following::input[1]", "Gopinath");
		clickByXpath("//button[contains(text(),'Find Contacts')]");
		Thread.sleep(2000);
		clickByXpath("(//a[@class='linktext'])[4]");
		verifyTitle("View Contact | opentaps CRM");
		clickByXpath("//a[contains(text(),'Edit')]");
		enterById("updateContactForm_departmentName", "IT");
		clickByXpath("//input[@class='smallSubmit']");
	}
}
