package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstAssignmentFacebook {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver =new EdgeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vishwakala97@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("@Mb14");
		driver.findElement(By.xpath("//div[@class='_6ltg']/a")).click();
		driver.findElement(By.xpath("//form[@name='reg']//input[@type='text']")).sendKeys("sowmiya");
		driver.findElement(By.xpath("//form[@name='reg']//input[@name='lastname']")).sendKeys("k");
		driver.findElement(By.xpath("//form[@name='reg']//input[@name='reg_email__']")).sendKeys("9798909890");
		driver.findElement(By.xpath("//form[@name='reg']//input[@name='reg_passwd__']")).sendKeys("@Missqueen");
		WebElement day=driver.findElement(By.xpath("//span[@class='_5k_4']//select[@id='day']"));
		Select s= new Select(day);
		s.selectByIndex(13);
		WebElement month=driver.findElement(By.xpath("//span[@class='_5k_4']//select[@id='month']"));
		Select s1= new Select(month);
		s1.selectByValue("8");
		WebElement year=driver.findElement(By.xpath("//span[@class='_5k_4']//select[@id='year']"));
		Select s2= new Select(year);
		s2.selectByVisibleText("1997");
		driver.findElement(By.xpath("//span[@class='_5k_3']//input[@type='radio']")).click();
		
		
	}

}
