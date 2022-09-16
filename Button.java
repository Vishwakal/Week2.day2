package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver =new EdgeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//click & confirm the title
		String Title =driver.getTitle();
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		String Title1 =driver.getTitle();
		if(Title.equals(Title1)) {
			System.out.println("Page is not navigated");
		}
		else
		{
			System.out.println("Title verified");

		}
		driver.navigate().back();
		Thread.sleep(1000);
		//Confirm if the button is disabled.
		boolean buttondisabled= driver.findElement(By.xpath("//button[@name='j_idt88:j_idt92']")).isEnabled();
		if(buttondisabled==true) {
			System.out.println("button is Enabled");
		}
		else
		{
			System.out.println("Button is disabled");
		}

		//Find and Save the button color
		String backgroundcolor =driver.findElement(By.xpath("//span[text()='Save']")).getCssValue("background-color");
		System.out.println("Button clear ="+backgroundcolor);

		//Find the height and width of this button
		Dimension HW =driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize();
		System.out.println("Height & Width =" +HW);

		//Click Image Button and Click on any hidden button
		driver.findElement(By.xpath("//span[text()='Image']")).click();
		driver.findElement(By.xpath("//div[@class='col-12 md:col-6']")).click();
		driver.close();
		//
	}
}


