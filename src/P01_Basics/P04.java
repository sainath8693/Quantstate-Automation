package P01_Basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class P04 {
	public static void main(String[] args) throws Exception
	{
		P04 ref = new P04();
		ref.myData();
	}
	public void myData() throws Exception
	{
		ChromeDriver driver = new ChromeDriver();
		FileInputStream fis = new FileInputStream("./testData/commonData.properties");
		Properties p = new Properties();
		p.load(fis);
		
		String fName = p.getProperty("fname");
		driver.quit();
		System.out.println(fName);
		
		driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[1]/div/form/div/div[2]/div/form/div/div[2]/div/div/div[1]/div/div/div[1]/div[2]/input"));
	}
	
}
