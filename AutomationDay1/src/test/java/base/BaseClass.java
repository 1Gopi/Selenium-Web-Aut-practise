package base;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class BaseClass {
	public static WebDriver driver;
	String Url = "https://www.google.com/";
	
	@Description("Taking screenshots")
	@Severity(SeverityLevel.NORMAL)
	public void captureScreenshot(String filename) {
		TakesScreenshot takesScreenshot = (TakesScreenshot)driver;
		String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
		File src = takesScreenshot.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("./Screenshots/"+filename+" "+timestamp+" "+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(filename+" Screenshot saved successfully");
	}

	@BeforeSuite
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//src//test//java//resources//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(Url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	}
	
	@AfterSuite
	public void tearDown() throws Exception {
		if(driver!=null) {
			Thread.sleep(5000);
			driver.quit();
		}
	}
	
	
	
}
