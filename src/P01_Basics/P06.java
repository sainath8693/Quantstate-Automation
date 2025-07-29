package P01_Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P06 {
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
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div[1]/div/form/div/div[1]/div/form/div/div[8]/div/div/input")).sendKeys("0722x2025");
	}
}
