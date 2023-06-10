package com.ait.qa23.tests;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FindElementTests {

  WebDriver driver;
  @BeforeMethod
  public void setUp(){
    driver  = new ChromeDriver();
    driver.get("https://ilcarro.web.app");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  @Test
  public void findElementByCssTest(){
    // {id -> css = #}, {class -> css = .}
//    driver.findElement(By.id("city"));
    driver.findElement(By.cssSelector("#city"));
//    driver.findElements(By.className("header"));
    driver.findElement(By.cssSelector(".header"));

    //atribute -> css([])
    driver.findElement(By.cssSelector("[href^='/let']")); //srart with -> ^
    driver.findElement(By.cssSelector("[href*='car']")); //contains -> *
    driver.findElement(By.cssSelector("[href$='/let-car-work']")); //end on -> $

  }

  @Test
  public void findElementByXpathTest(){
    //id -> xpath -> //*[@id='value']
//    driver.findElement(By.id("city"));
    driver.findElements(By.xpath("//*[@id ='city']"));

    //class -> xpath //*[@class='value']
    driver.findElement(By.xpath("//*[@class='header']"));

    //contains, end on, start -> //*[contains(.,'text')]
    driver.findElement(By.xpath("//*[contains(., 'Find your car now!')]"));

  }


  @AfterMethod
  public void tearDown(){
    driver.quit();
  }

}





