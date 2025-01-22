//1) Selenium supports different browsers. In order to use Selenium to automate particular browser, ..
// ..  Selenium provides  different Drivers, specific to browser, which in turn provides different ..
// ..  methods to automate Browser.

// 2) Interface:- is group of related methods that provides empty body, which can be implemented by Classes
// 3) CSS Selector 3 types:- 
// i) Tagname.classname     (ii) Tagname#id  (iii) Tagname[attribute='value'] (iV)ParentTagname[attribute='value'] childTagName,      *cmd -> $(Tagname.classname)
// 4) Xpath:- 
// i) //Tagname[@attribute='value']  (ii) //Tagname[@attribute='value'][index]  (iii) //ParentTagName/ChildTagName[Index]
// Note:- Xpath ignores hidden elements(Tags), whereas CSS Selector counts Hidden Tags,so there might be selection problem of elements, so you have to use Selector Hub or chro-path to find selected element
// Xpath allows traverse forward from parent element to child element as well back from child to parent element.


package com.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;


public class AutomateBrowserr{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aashish\\Music\\Automation\\Drivers\\chromedriver.exe");
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
		/*
		 * options.addArguments("--disable notifications"); DesiredCapabilities cp = new
		 * DesiredCapabilities(); cp.setCapability(ChromeOptions.CAPABILITY, options);
		 * options.merge(cp);
		 */
        WebDriver driver=new ChromeDriver(options);

        driver.get("https://testerwork.com/");

		String title= driver.getTitle();
		System.out.println("Title= "+title);
		if(driver.getCurrentUrl().equals("https://testerwork.com/")) {
			System.out.println("Success");
		}


		System.setProperty("webdriver.edge.driver", "C:\\Users\\Aashish\\Music\\Automation\\Drivers\\msedgedriver.exe");
		EdgeOptions edgeoption= new EdgeOptions();
		edgeoption.addArguments("--remote-allow-origins=*");

		driver= new EdgeDriver(edgeoption);
		driver.get("https://testerwork.com/");

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Aashish\\Music\\Automation\\Drivers\\geckodriver.exe");
		driver= new FirefoxDriver();
		driver.get("https://testerwork.com/");


		/*
		 * driver.quit(); // will close all browser pages open from main page --quite shall quiet the Driver
		 * driver.close(); // Will close only main page --close shall close the current window
		 */
		
		System.out.println("Post Jira 1");
		System.out.println("Post Jira 2 ");
		System.out.println("Post Jira 3 ");
	}



}
