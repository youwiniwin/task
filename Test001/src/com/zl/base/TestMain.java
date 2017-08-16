package com.zl.base;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;


public class TestMain {  
	  
    /** 
     * @param args 
     * @throws InterruptedException  
     */  
    public static void main(String[] args) throws InterruptedException {  
        new TestMain().testBaiduSearch();  
    }  
  
    public void testBaiduSearch() throws InterruptedException {  
        // Optional, if not specified, WebDriver will search your path for  
        // chromedriver.  
        System.setProperty("webdriver.chrome.driver", "E:/KAIFA/Tools/chromedriver.exe");  
  
        WebDriver driver = new ChromeDriver();  
        driver.get("http://www.newrank.cn/public/info/list.html?period=week&type=data");  
        Thread.sleep(5000);  
        WebElement more = driver.findElement(By.cssSelector("p.showmore a"));  
        more.click();  
        Thread.sleep(5000); // Let the user actually see something!  
        List<WebElement> names = driver.findElements(By.cssSelector("table tbody tr td h4 a"));  
        for(WebElement e : names) {  
            System.out.println(e.getText());  
        }  
        Thread.sleep(5000); // Let the user actually see something!  
        driver.quit();  
    }  
}