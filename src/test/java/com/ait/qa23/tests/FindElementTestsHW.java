package com.ait.qa23.tests;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FindElementTestsHW {
  WebDriver driver;

 @BeforeMethod
 public void setUp(){
   driver = new ChromeDriver();
   driver.get("https://demowebshop.tricentis.com/");
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 }


 @Test
 public void findElementByCssTest(){
   driver.findElement(By.cssSelector(".search-box"));
   driver.findElement(By.cssSelector("#nivo-slider"));
   driver.findElement(By.cssSelector("[href^='/apparel']"));
   driver.findElement(By.cssSelector("#newsletter-subscribe-button"));
   driver.findElement(By.cssSelector(".footer-poweredby"));
   driver.findElement(By.cssSelector(".footer-disclaimer"));
   driver.findElement(By.cssSelector(".cart-label"));
   driver.findElement(By.cssSelector("[href='/register']"));
   driver.findElement(By.cssSelector("[href='/login']"));
   driver.findElement(By.cssSelector(".facebook"));

 }

 @Test
 public void findElementByXpathTest(){
  driver.findElement(By.xpath("//*[@class='search-box']"));
  driver.findElement(By.xpath("//*[@id='nivo-slider']"));
  driver.findElement(By.xpath("//*[contains(., 'apparel')]"));
  driver.findElement(By.xpath("//*[@id='newsletter-subscribe-button']"));
  driver.findElement(By.xpath("//*[@class='footer-poweredby']"));
  driver.findElement(By.xpath("//*[@class='footer-disclaimer']"));
  driver.findElement(By.xpath("//*[@class='cart-label']"));
  driver.findElement(By.xpath("//*[@href='/register']"));
  driver.findElement(By.xpath("//*[@href='/login']"));
  driver.findElement(By.xpath("//*[@class='facebook']"));

 }

 @AfterMethod
 public void tearDown(){
   driver.quit();
 }

}
