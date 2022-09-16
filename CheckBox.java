package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver =new EdgeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Basic checkbox
		driver.findElement(By.xpath("//div[@class='ui-helper-hidden-accessible']//following::div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();

		//Notification
		driver.findElement(By.xpath("//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget']/div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		String Alert =driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
		System.out.println("Notification :"+Alert);

		//choose your favorite languages
		driver.findElement(By.xpath("//label[text()='Java']/preceding::div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		driver.findElement(By.xpath("//label[text()='Python']/preceding::div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();

		//Toggleswitch
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		String AlertToggle =driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
		System.out.println("Toggle switch alert :" +AlertToggle);
		boolean toggle=driver.findElement(By.xpath("//div[@class='ui-helper-hidden-accessible']/input[@name='j_idt87:j_idt102_input']")).isEnabled();
		if(toggle==true) {
			System.out.println("button is Enabled");
		}
		else
		{
			System.out.println("Button is disabled");
		}



	}

}
