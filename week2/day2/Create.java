package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Create {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");

		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		  driver.findElement(By.linkText("CRM/SFA")).click();
		  driver.findElement(By.linkText("Leads")).click();
		  driver.findElement(By.linkText("Create Lead")).click();
		  driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		  driver.findElement(By.id("createLeadForm_firstName")).sendKeys( "Shilviya");
		  driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Thomas");
		  driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Jayaraj") ;
		  driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("TestLeaf@gmail.com");
		  driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9876543210"); 
		  driver.findElement(By.name("submitButton")).click();
		
	}

}
