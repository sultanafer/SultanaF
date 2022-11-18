package learnTestNG_Parameter;

import org.testng.annotations.Test;

public class Parameter_CreateLead extends ProjectSpecificationWrapper {

		@Test 
		public void createLead() {
driver.findElementByLinkText("Create Lead").click();
driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
driver.findElementByCssSelector("input#createLeadForm_firstName").sendKeys("Hema");
driver.findElementById("createLeadForm_lastName").sendKeys("Mali");

		}

}
