package org_master;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Org_registration {
	ChromeDriver driver;
	public Org_registration(ChromeDriver driver) {
		this.driver=driver;
	}

	public void newOrg() throws InterruptedException 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		driver.findElement(By.xpath("//p[text()='Organization registration']")).click();
		
		//New button
		driver.findElement(By.xpath("//button[text()='New']")).click();
		
		//Organization name
		driver.findElement(By.xpath("//input[@placeholder='Enter Organization Name']")).sendKeys("A");
		
		//Org code
		driver.findElement(By.xpath("//input[@placeholder='Enter Organization Code']")).sendKeys("5689");
		
		//Parent org dropdown
		WebElement parentOrg = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[1]/div/form/div/form/div/div[3]/div/div/div[1]/div/div/div[1]/div[2]/input"));
		parentOrg.click();
		parentOrg.sendKeys("Anmsoft");
		parentOrg.sendKeys(Keys.ENTER);
		
		//Organization Type
		WebElement orgType = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[1]/div/form/div/form/div/div[4]/div/div/div[1]/div/div/div[1]/div[2]/input"));
		orgType.click();
		orgType.sendKeys("Corporate");
		orgType.sendKeys(Keys.ENTER);
		
		//Address 
		driver.findElement(By.xpath("//input[@placeholder='Enter address']")).sendKeys("Mumbai");
		
		//Enter GST Number
		driver.findElement(By.xpath("//input[@placeholder='Enter GST Number']")).sendKeys("27ABCDE1234F1Z5");
		
		//Country dorp-down
		WebElement country = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[1]/div/form/div/form/div/div[7]/div/div/div[1]/div/div/div[1]/div[2]/input"));
		country.click();
		country.sendKeys("India");
		country.sendKeys(Keys.ENTER);
		
		//city Drop-down
		WebElement city = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[1]/div/form/div/form/div/div[8]/div/div/div[1]/div/div/div[1]/div[2]/input"));
		city.click();
		city.sendKeys("MUMBAI");
		Thread.sleep(1000);
		city.sendKeys(Keys.ENTER);
		Thread.sleep(1500);
		//Zip code
		driver.findElement(By.xpath("//input[@placeholder='Enter ZIP Code']")).sendKeys("400001");
		
		// IATA Number
		driver.findElement(By.xpath("//input[@placeholder='Enter IATA No']")).sendKeys("9685425");
		
		// PAN No
		driver.findElement(By.xpath("//input[@placeholder='Enter Tax Identification No(PAN No)']")).sendKeys("DECPM5687B");
		
		// Organization mail
		driver.findElement(By.xpath("//input[@placeholder='Enter Organization Mail']")).sendKeys("abc@gmail.com");
		
		// contact no
		driver.findElement(By.xpath("//input[@placeholder='Enter Contact No']")).sendKeys("9876543210");
		
		// website
		driver.findElement(By.xpath("//input[@placeholder='Enter Website Name']")).sendKeys("info@travelQuantstate.com");
		
		// currency dropdown
		WebElement currency = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[1]/div/form/div/form/div/div[15]/div/div/div[1]/div/div/div[1]/div[2]/input"));
		currency.click();
		currency.sendKeys("INR");
		currency.sendKeys(Keys.ENTER);
		Thread.sleep(1200);
		currency.sendKeys("USD");
		currency.sendKeys(Keys.ENTER);
		
		// Operation Country
		WebElement operatingcountry = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[1]/div/form/div/form/div/div[16]/div/div/div[1]/div/div/div[1]/div[2]/input"));
		operatingcountry.sendKeys("India");
		operatingcountry.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		
		// Operatng Regions checkbox
		WebElement operatingRegion = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[1]/div/form/div/form/div/div[17]/div/div/div[2]/div/input"));
		Thread.sleep(1000);
		operatingRegion.click();
		
		// Products checkbox
		WebElement products = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[1]/div/form/div/form/div/div[18]/div/div/div[2]/div/input"));
		products.click();
		
		//driver.findElement(By.xpath("//button[text()='Save']")).click();
		
	}
}
