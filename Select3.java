package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Select3 {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver =new EdgeDriver();
		driver.get("https://leafground.com/select.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		//Which is your favorite UI Automation tool?

		WebElement drop= driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select sel= new Select(drop);
		sel.selectByIndex(1);

		//Choose your preffered company
		driver.findElement(By.xpath("//label[text()='Select Country']")).click();
		driver.findElement(By.xpath("//li[text()='India']")).click();

		//Choose the Course
		//		driver.findElement(By.xpath("//button[@type='button']/span[@class='ui-button-text']")).click();
		//		driver.findElement(By.className("//li[@data-item-label='Selenium WebDriver']")).click();

		//Choose language randomly
		driver.findElement(By.xpath("//label[text()='Select Language']")).click();
		driver.findElement(By.xpath("//li[text()='Tamil']")).click();






	}

}
