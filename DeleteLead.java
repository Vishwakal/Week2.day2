package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver =new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("crmsfa");
        driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
        driver.findElement(By.xpath("//a[text()='Leads']")).click();
        String s1= driver.getTitle();
        System.out.println(s1);
        driver.findElement(By.linkText("Find Leads")).click();
        driver.findElement(By.xpath("(//form[@method='POST']//span[contains(@class,'x-tab-strip-text')])[2]")).click();
        driver.findElement(By.xpath("//form[@method='POST']//input[@name='phoneNumber']")).sendKeys("9");
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        Thread.sleep(5000);
        String e =driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).getText();
       System.out.println(e);
        driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
       //        driver.get("http://leaftaps.com/crmsfa/control/viewLead?partyId=10185");
        driver.findElement(By.linkText("Delete")).click();
        driver.findElement(By.linkText("Find Leads")).click();
        driver.findElement(By.xpath("//input[@name='id']")).sendKeys(e);
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        String verifymessage=driver.findElement(By.xpath("//div[@class='x-toolbar x-small-editor']")).getText();
        if(verifymessage.equals("No records to display"))
        {
        	System.out.println("verfied the message");     
        }
        else
        {
        	System.out.println("message is not same ");
        }
        driver.close();     
        
	}
}