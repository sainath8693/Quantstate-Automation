package org_master;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Emp_onboarding {
	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://travel.quantstate.ai/login");
		Thread.sleep(1500);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.name("userName")).sendKeys("Anish@Quantstate");
		driver.findElement(By.name("password")).sendKeys("Anish@111");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@title='Admin Management']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@title='Admin Management']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[text()='Organization Master']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//p[text()='Employee Onboarding']")).click();
		Thread.sleep(200);
		//New Button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div[1]/div/form/div/div/span/span[2]/button")).click();
		Thread.sleep(2000); 
		
		WebElement title = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[1]/div/form/div/div[1]/div/form/div/div[1]/div/div/div[1]/div/div/div[1]/div[2]/input"));
		title.click();
		title.sendKeys("Mr");
		title.sendKeys(Keys.ENTER);
		
		
		//=================== Personal Details =====================
		driver.findElement(By.xpath("//input[@placeholder='Enter First Name']")).sendKeys("A");
		driver.findElement(By.xpath("//input[@placeholder='Enter Middle Name']")).sendKeys("B");
		driver.findElement(By.xpath("//input[@placeholder='Enter Last Name']")).sendKeys("C");
		driver.findElement(By.id("gender_Male")).click();
		WebElement calender =  driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[1]/div/form/div/div[1]/div/form/div/div[6]/div/div/input"));
		//calender.click();
		calender.sendKeys("26-07-2025");
		
		driver.findElement(By.xpath("//input[@placeholder='Enter passport number']")).sendKeys("C");
		
		//passport issue date
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div[1]/div/form/div/div[1]/div/form/div/div[8]/div/div/input")).sendKeys("10-07-2025");
		
		//passport Expiry date
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div[1]/div/form/div/div[1]/div/form/div/div[9]/div/div/input")).sendKeys("10-07-2025");
		
		//Nationality dropdown
		WebElement nationality = driver.findElement(By.id("react-select-4-input"));
		nationality.click();
		nationality.sendKeys("India");
		nationality.sendKeys(Keys.ENTER);
		
		//Passport Country dropdown
		WebElement passCountry = driver.findElement(By.id("react-select-5-input"));
		passCountry.click();
		passCountry.sendKeys("India");
		passCountry.sendKeys(Keys.ENTER);
		
		//PAN Number
		driver.findElement(By.xpath("//input[@placeholder='Enter pan number']")).sendKeys("AQZSD3212E");
		
		//================== Employee Details =============
		//Company dropdown
		WebElement company = driver.findElement(By.id("react-select-6-input"));
		company.sendKeys("Quantstate");
		company.sendKeys(Keys.ENTER);
		
		//Designation dropdown
		WebElement designation = driver.findElement(By.id("react-select-7-input"));
		designation.sendKeys("CEO");
		designation.sendKeys(Keys.ENTER);
		
		//Branch 
		driver.findElement(By.xpath("//input[@placeholder='Enter Branch']")).sendKeys("Mumbai");
		
		//Department
		driver.findElement(By.xpath("//input[@placeholder='Enter Department']")).sendKeys("Operations");
		
		//Report to 
		for(int i=0; i<3; i++)
		{
			WebElement reportTo = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[1]/div/"
					+ "form/div/div[2]/div/form/div/div[5]/div/div/div[1]/div/div/div[1]/div[2]/input"));
			
			reportTo.sendKeys("vishal man");
			
			reportTo.sendKeys(Keys.ENTER);	
		}
		
		
		//email id
		driver.findElement(By.xpath("//input[@placeholder='Enter Email Id']")).sendKeys("sainthpatil@gmail.com");
		
		//employee Type
		WebElement empType = driver.findElement(By.id("react-select-9-input"));
		empType.sendKeys("Perm");
		empType.sendKeys(Keys.ENTER);
		
		//DOJ
		driver.findElement(By.xpath("//input[@placeholder='Enter Date Of Joining']"));
		
		//Emp ID
		driver.findElement(By.xpath("//input[@placeholder='Enter Employee ID']")).sendKeys("EMP_512");
		
		//============================  Contact/Address Details ==================
		//Contact no
		driver.findElement(By.xpath("//input[@placeholder='Enter Contact No']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//input[@placeholder='Enter Alternate Contact No']")).sendKeys("9999888800");
		driver.findElement(By.xpath("//input[@placeholder='Enter Address here']")).sendKeys("Mahape");
		WebElement country = driver.findElement(By.id("react-select-10-input"));
		country.sendKeys("India");
		country.sendKeys(Keys.ENTER);
		
		WebElement state = driver.findElement(By.id("react-select-11-input"));
		state.sendKeys("Maharashtra");
		state.sendKeys(Keys.ENTER);
		
		WebElement city = driver.findElement(By.id("react-select-12-input"));
		city.sendKeys("Mumbai");
		city.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//input[@placeholder='Zip Code']")).sendKeys("416356");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1800);");
		
//		Thread.sleep(5000);
//		driver.quit();
	}
}
