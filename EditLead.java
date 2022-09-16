package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver =new EdgeDriver();
		driver.get("www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("crmsfa");
        driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
        driver.findElement(By.xpath("//a[text()='Leads']")).click();
        String s1= driver.getTitle();
        System.out.println(s1);
        driver.findElement(By.linkText("Find Leads")).click();
        driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("vishwa");
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@Class='linktext']")).click();
//        driver.get("http://leaftaps.com/crmsfa/control/viewLead?partyId=10001");
        String s2= driver.getTitle();
        System.out.println(s2);
        if(s1.equals(s2)) {
        	System.out.println("tile is same");
        }
        else
        {
        	System.out.println("verified the title screen navigated");
        }
        driver.findElement(By.linkText("Edit")).click();
        WebElement CN=driver.findElement(By.xpath("//form[@id='updateLeadForm']//input[@id='updateLeadForm_companyName']"));
        CN.clear();
        String s ="Nimble";
        CN.sendKeys(s);
        driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
        String VCN=driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
        if(s.equals(VCN))
        {
        	System.out.println("Company is same unique");
        }
        else
        {
        	System.out.println("Company name is not unique");
        }
        
        driver.close();
         }
	
	}


