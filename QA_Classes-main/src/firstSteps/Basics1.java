package firstSteps;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Basics1 {

	public static void main(String[] args) throws InterruptedException {
		

	    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\WebDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        //System.out.println("Browser has opened chrome");

				Thread.sleep(1000);

				
				 

				driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
				driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
				driver.findElement(By.xpath("//button[@type='submit']")).click();

				
				Thread.sleep(1000);

				driver.findElement(By.xpath("//span[text()='Leave']")).click();
				Thread.sleep(1000);

				driver.findElement( By.xpath("//div[text()='Select']")).click();

			

				List<WebElement> menuItems = driver.findElements(( By.xpath("//div[@role='listbox']")));	

				//WebDriverWait wait = new WebDriverWait(driver, 20);
				//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Rejected']")));

				String element = "Rejected";
				
				for(WebElement item:menuItems) {

					if(item.getText().contains(element)) {
					
						System.out.println(element + " is present");
					
					}else {
						System.out.println(element + " is not present");
					}
					
		}

	}

}
