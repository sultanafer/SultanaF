package learnInterfaceForFrameWork;

import org.testng.annotations.Test;

public class TC_001_CreateLead extends GenericWrapper {

	@Test
	public static void main(String[] args) {
		launchBrowser("http://leaftaps.com/opentaps/control/main");
        enterById("username","DemoSalesManager");
        enterById("username", "crmsfa");
        enterByXPath("//input[@value='login']");
        clickByLinkText("CRM/SFA");
        clickByLinkText("Leads");
        clickByLinkText("CreateLead");
        Thread.sleep(2000);
        enterById("createLeadForm_companyName","TCS");
        enterById("createLeadForm_FirstName","Hema");
        enterById("createLeadForm_LastName","M");
        enterById("createLeadForm_firstNmaeLocal","Hema");
        enterByXPath("//input[@name='createLeadForm_firstNmaeLocal']","Ma");
        enterByXPath("//input[@name='personalTitle']","Ms");
        enterByVisibleTextId("createLeadForm_dataSourceId","website");
        enterByXPath("//input[@name='generalRevenue']","1000");
        enterByVisibleTextById("createLeadForm_industryEnumId']","Insurance");
        enterByVisibleTextByName("ownershipEnumId","sole Proprietorship"]","Sole Proprietoship");
        enterByXPath("//input[@name='sicCode']","1010");
        enterByXPath("//textarea[@name='description']","It is a Software Developmnet Platform");
	}

}
