package screens;

import org.testng.annotations.Test;

import base.BaseClass;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import objectrepo.DemoObj;

public class Search extends BaseClass {
	
	
	
	@Test(description = "SearchGoogle method")
	@Description("Search Google method to enter test")
	@Severity(SeverityLevel.CRITICAL)
	public void searchGoogle() {
		DemoObj demoobj = new DemoObj(BaseClass.driver);
		demoobj.typeSearch("test");
	
	}

}
