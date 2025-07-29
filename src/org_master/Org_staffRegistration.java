package org_master;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Org_staffRegistration {

	ChromeDriver driver;

	Org_staffRegistration(ChromeDriver driver) {
		this.driver = driver;
	}

	public void new_orgStaff() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		//New button
		driver.findElement(By.xpath("//button[text()='New']")).click();
		
		// Organization Drop
		WebElement dropdown = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[1]/div/form/div/form/div/div[1]/div/div/div[1]/div/div/div[1]/div[2]/input"));
		dropdown.click();
		dropdown.sendKeys("Anmsoft");
		Thread.sleep(500);
		dropdown.sendKeys(Keys.ENTER);
		
		// First Name
		driver.findElement(By.xpath("//input[@placeholder='Enter First Name']")).sendKeys("A");
		
		// Last Name
		driver.findElement(By.xpath("//input[@placeholder='Enter Last Name']")).sendKeys("B");
		
		//Phone no
		driver.findElement(By.xpath("//input[@placeholder='Enter Phone No']")).sendKeys("9876543210");
		
		//Email id
		driver.findElement(By.xpath("//input[@placeholder='Enter Email Id']")).sendKeys("abc@gmail.com");
		
		//Username
		driver.findElement(By.xpath("//input[@placeholder='Enter User Name']")).sendKeys("Anish@Quantstate");
		
		//Password
		driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("Anish@123");
		//confirm password
		driver.findElement(By.xpath("//input[@placeholder='Enter Confirm Password']")).sendKeys("Anish@123");
		
		//Roles dropdown
		WebElement role = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[1]/div/form/div/form/div/div[9]/div/div/div[1]/div/div/div[1]/div[2]/input"));
		role.click();
		role.sendKeys("CTS Admin");
		Thread.sleep(500);
		role.sendKeys(Keys.ENTER);
		
		//Save Button
		//driver.findElement(By.xpath("//button[text()='Save']")).click();
		
		
		
		
	}
}
