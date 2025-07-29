package P01_Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P03_findElements {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box/");
		Thread.sleep(3000);

		List<WebElement> allElements = driver.findElements(By.tagName("input"));
		if (allElements.size() != 0) {
			System.out.println(allElements.size() + " Elements found for input Tag");
		}
		for (WebElement element : allElements) {
			System.out.println(element.getAttribute("Placeholder"));
		}
		driver.close();
	}
}
