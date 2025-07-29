package tr;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v135.css.model.CSSStyleSheetHeader;

public class NewTravelReq {
	ChromeDriver driver;
	public NewTravelReq(ChromeDriver driver)
	{
		this.driver=driver;
	}
	public void trForm() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// Travel Request Form
		driver.findElement(By.xpath("//p[text()='Travel Request Form']")).click();
		
		// New Button
		driver.findElement(By.xpath("//button[text()='New']")).click();
		Thread.sleep(1000);
		
		// Checkbox - Select Request For
		WebElement reqForFlight = driver.findElement(By.id("inlineCheckbox1"));
		reqForFlight.click();
		WebElement reqForCar = driver.findElement(By.id("inlineCheckbox2"));
		
		WebElement reqForHotel = driver.findElement(By.id("inlineCheckbox3"));
		reqForHotel.click();
		WebElement reqForInsurance = driver.findElement(By.id("inlineCheckbox4"));
		Thread.sleep(500);
		
		// Travel Origin
		driver.findElement(By.xpath("//input[@placeholder='Enter Travel Origin']")).sendKeys("A");
		
		// Travel Destination
		driver.findElement(By.xpath("//input[@placeholder='Enter Travel Destination']")).sendKeys("B");
		
		// Travel purpose dropdown
		WebElement trPurpose = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[1]/div/form/form/div/div[3]/div/div/div[1]/div/div/div[1]/div[2]/input"));
		trPurpose.click();
		trPurpose.sendKeys("Business Meeting");
		Thread.sleep(500);
		trPurpose.sendKeys(Keys.ENTER);
		
		// Travel Date From
		driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[1]/div/form/form/div/div[4]/div/div/input")).sendKeys("07222025");
		
		// Travel Date To
		driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[1]/div/form/form/div/div[5]/div/div/input")).sendKeys("07252025");
		
		// Travel Group/Policy
		WebElement trGroup = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[1]/div/form/div[2]/div/div/div/div[1]/div[2]/input"));
		trGroup.click();
		trGroup.sendKeys("SmartTravel Policy Group");
		Thread.sleep(800);
		trGroup.sendKeys(Keys.ENTER);
		
		//===============================================================
		// Flight Input Fields
		if (reqForFlight.isSelected()) {
			
			 //Radio Buttons
			WebElement oneWay = driver.findElement(By.id("oneWay"));
			WebElement roundTrip = driver.findElement(By.id("roundTrip"));
			roundTrip.click();
			Thread.sleep(1000);

			WebElement flightOrigin = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[1]/div/form/div[3]/div[2]/div[2]/div[1]/div/input"));
			flightOrigin.sendKeys("Delhi");

			Thread.sleep(500);
			WebElement flightDestination = driver
					.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[1]/div/form/div[3]/div[2]/div[2]/div[3]/div/input"));
			Thread.sleep(500);
			flightDestination.sendKeys("Pune");

			WebElement departureDate = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[1]/div/form/div[3]/div[2]/div[2]/div[3]/div/input"));
			departureDate.sendKeys("07252025");

			if (roundTrip.isSelected()) {
				WebElement arrivalDate = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[1]/div/form/div[3]/div[2]/div[2]/div[4]/div/input"));
				arrivalDate.sendKeys("07282025");
			}
		}
		// Hotel Input Fields
		 if(reqForHotel.isSelected())	
		{
			WebElement hotelCity = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[1]/div/form/div[3]/div[2]/div/div[1]/div/input"));
			hotelCity.sendKeys("Mumbai");
			
			WebElement checkinDate = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[1]/div/form/div[3]/div[2]/div/div[2]/div/input"));
			checkinDate.sendKeys("07222025");
			
			WebElement checkoutDate = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[1]/div/form/div[3]/div[2]/div/div[3]/div/input"));
			checkoutDate.sendKeys("07232025");
		}
		
		//=======================	Cash Advance	=======================
		
		// Currency Drop-down
		
		// Required Amount
		driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[1]/div/form/div[4]/div[2]/div/div[2]/input")).sendKeys("15000");
		
		//Purpose of Forex
		
		// Mode of Collection
		
		// Comments
		driver.findElement(By.id("floatingTextarea")).sendKeys("15000 required for trip");
	}
}
