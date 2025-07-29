package org_master;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import tr.NewTravelReq;

public class Driver {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	driver.get("https://travel.quantstate.ai/login");
	Thread.sleep(1000);
	driver.manage().window().maximize();
	
	// Enter Username
	driver.findElement(By.name("userName")).sendKeys("Rahul_MGR@Ontra");
	// Enter Password
	driver.findElement(By.name("password")).sendKeys("Rahul@123");
	// Login button
	driver.findElement(By.xpath("//button[text()='Login']")).click();
	Thread.sleep(500);
	
	// Admin Management
/*	driver.findElement(By.xpath("//div[@title='Admin Management']")).click();
	Thread.sleep(500);
	driver.findElement(By.xpath("//div[@title='Admin Management']")).click();
	Thread.sleep(500);
	
	// Organization Master
	driver.findElement(By.xpath("//div[text()='Organization Master']")).click();
	Thread.sleep(200);
	*/
	// organization registration
//	Org_registration ref = new Org_registration(driver);
//	ref.newOrg();
	
	
	// Organization staff registration
//	driver.findElement(By.xpath("//p[text()='Organization staff registration']")).click();
//	Thread.sleep(200);
//	Org_staffRegistration ref2 = new Org_staffRegistration(driver);
//	ref2.new_orgStaff();
	
	// New Travel Request
	//Travel Request
	driver.findElement(By.xpath("//a[@title='Travel Request']")).click();
	Thread.sleep(1000);
	NewTravelReq ref3 = new NewTravelReq(driver);
//	ref3.trForm();
	ref3.trForm();

	

	
	
	//driver.quit();

}
}
