package weel2.day1;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Input {

	// TODO Auto-generated method stub
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver =new EdgeDriver();
		driver.get("https://leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@placeholder='Babu Manickam']")).sendKeys("Vishwakala");
		driver.findElement(By.xpath("//input[@value='Chennai']")).sendKeys("Coimbatore");
		boolean Enabled =driver.findElement(By.xpath("//input[@Placeholder='Disabled']")).isEnabled();
		System.out.println(Enabled);
		if(Enabled==false){
			System.out.println("verified button is disabled");
		}
		else
		{
			System.out.println("Buttin is Enabled");

		}
		driver.findElement(By.xpath("//input[contains(@value,'Can you clear me, please?')]")).clear();
		String Clear =  driver.findElement(By.xpath("//input[contains(@value,'Can you clear me, please?')]")).getText();
		if(Clear.equals("")) {
			System.out.println("Text is cleared ");
		}
		else
		{
			System.out.println("Text is not cleared");
		}

		String gettext = driver.findElement(By.xpath("//input[@name='j_idt88:j_idt97']")).getAttribute("value");
		System.out.println("retrieve the text : "+gettext);
		driver.findElement(By.xpath("//input[@name='j_idt88:j_idt99']")).sendKeys("vish@gamil.com",Keys.TAB);
		//Type About yourself
		driver.findElement(By.xpath("//textarea[@placeholder='About yourself']")).sendKeys("Strong human");
		//just press enter and confirm error message
		//	         Thread.sleep(1000);
		//	         driver.findElement(By.xpath("//div[@class='grid formgrid']/following::input[@name='j_idt106:thisform:age']")).click();
		//	         String errormessage= driver.findElement(By.xpath("//span[@class='ui-message-error-detail']")).getText();
		//	         if(errormessage.equals("Age is mandatory"))
		//	         {
		//	        	 System.out.println("Error message displayed");
		//	         }
		//	         else 
		//	         {
		//	        	 System.out.println("Error message not displayed");
		//	         }
		//	         
		//Type your name and choose the third option
		driver.findElement(By.xpath("//li[@class='ui-autocomplete-input-token']/input[@name='j_idt106:auto-complete_input']")).sendKeys("vishwakala");
		driver.findElement(By.xpath("(//li[@role='option'])[3]")).click();


		//click and confirm keyboard appears
		driver.findElement(By.xpath("//input[@name='j_idt106:j_idt122']")).click();
		boolean displayed= driver.findElement(By.xpath("//div[@class='ui-widget ui-widget-content ui-corner-all ui-shadow keypad-popup ui-input-overlay']")).isDisplayed();
		if(displayed==true) {
			System.out.println("Keyboard Appeared");
		}
		else
		{
			System.out.println("Keyboard is not Appeared");;

		}
		driver.findElement(By.xpath("//button[text()='Close']")).click();
		driver.close();
	}

}
