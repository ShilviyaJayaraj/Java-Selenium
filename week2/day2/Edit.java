package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit {
	
  public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/logout");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("demoSalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	String title = driver.getTitle();
	System.out.println(title);
	driver.findElement(By.className("crmsfa")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("shilviya");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("jayaraj");
	driver.findElement(By.name("submitButton")).click();
	driver.findElement(By.linkText("Edit")).click();
	driver.findElement(By.id("updateLeadForm_companyName")).clear();
	driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Update CompanyName");
	driver.findElement(By.name("submitButton")).click();

}
}