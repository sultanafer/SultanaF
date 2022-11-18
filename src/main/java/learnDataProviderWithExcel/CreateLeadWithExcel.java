package learnDataProviderWithExcel;

import org.testng.annotations.Test;

public class CreateLeadWithExcel extends ProjectSpecificWrapper {
	

		@Test(dataProvider="getData")
		public void CreateLead(String cname, String fname, String lname) {
	driver.findElementByLinkText("Create Lead").click();
	driver.findElementById("createLeadForm_companyName").sendKeys(cname);
	driver.findElementByCssSelector("input#createLeadForm_firstName").sendKeys(fname);
	driver.findElementById("createLeadForm_lastName").sendKeys(lname);
	driver.getTitle();	
		
}
}
