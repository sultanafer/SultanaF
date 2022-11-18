package learnDataProvider_Parameterization;

import org.testng.annotations.Test;

public class DataProvider_CreateLead extends  ProjectSpecificWrapper   {

	@Test(dataProvider="getData")
	public void createLead(String cName, String fName, String lName) {
driver.findElementByLinkText("Create Lead").click();
driver.findElementById("createLeadForm_companyName").sendKeys(cName);
driver.findElementByCssSelector("input#createLeadForm_firstName").sendKeys(fName);
driver.findElementById("createLeadForm_lastName").sendKeys(lName);
	}

}
