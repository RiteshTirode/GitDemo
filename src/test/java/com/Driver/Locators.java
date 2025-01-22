//1) Selenium supports different browsers. In order to use Selenium to automate particular browser, ..
// ..  Selenium provides  different Drivers, specific to browser, which in turn provides different ..
// ..  methods to automate Browser.

// 2) Interface:- is group of related methods that provides empty body, which can be implemented by Classes
// 3) CSS Selector 3 types:- 
// i) Tagname.classname     (ii) Tagname#id  (iii) Tagname[attribute='value'] (iV)ParentTagname[attribute='value'] childTagName,  *cmd -> $(Tagname.classname)
// 4) Xpath:- 
// i) //Tagname[@attribute='value']  (ii) //Tagname[@attribute='value'][index]  (iii) //ParentTagName/ChildTagName[Index]
// Note:- Xpath ignores hidden elements(Tags), whereas CSS Selector counts Hidden Tags,so there might be selection problem of elements, so you have to use Selector Hub or chro-path to find selected element
// Xpath allows traverse forward from parent element to child element as well back from child to parent element.
package com.Driver;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Locators {

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub

		//implicit wait - 2 seconds time out

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aashish\\Music\\Automation\\Drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.findElement(By.id("inputUsername")).sendKeys("rahul");

		driver.findElement(By.name("inputPassword")).sendKeys("hello123");

		driver.findElement(By.className("signInBtn")).click();

		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());

		driver.findElement(By.linkText("Forgot your password?")).click();

		Thread.sleep(1000);//

		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");

		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");

		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();

		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");

		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9864353253");

		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

		System.out.println(driver.findElement(By.cssSelector("form p")).getText());

		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();

		Thread.sleep(1000);

		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");

		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");

		driver.findElement(By.id("chkboxOne")).click();

		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();

		}


	
}
