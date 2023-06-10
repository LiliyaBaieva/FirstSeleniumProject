package com.ait.qa23.tests;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSeleniumTest {

  WebDriver driver; //объявляем класс из селениума
  //before - setUp - открывающи енастройки
  @BeforeMethod
  public void setUp(){
    //чтоб до конца инициализировать нужно дописать:
    ChromeOptions options = new ChromeOptions();
    options.addArguments("remote-allow-origins=*");

    driver = new ChromeDriver(); //инициализировали переменнную driver
    // находить файл ChromeDriver, который мы скачивали и отправляли в Tools

//    driver.get("https://www.google.com");
      driver.navigate().to("https://telranedu.web.app/login"); //with history

    //maximize browser window
    driver.manage().window().maximize();

  }

  //tests
  @Test
  public void findElementByTegName(){
    System.out.println("Site opened!!!");

    //find element by teg
    WebElement element = driver.findElement(By.tagName("h1"));
    System.out.println(element.getText());

    //find list of elements
    List<WebElement> elements = driver.findElements(By.tagName("a"));
    System.out.println(elements.size());

    //find element by Class name
    WebElement element1 = driver.findElement(By.className("navbar-component_nav__1X_4m"));
    System.out.println(element1.getText());

    //find element by name
    WebElement email = driver.findElement(By.name("email"));
//    System.out.println(email.getText()); //print nothing

  }

  //after - tearDown - закрывающие настройки
  @AfterMethod
  public void tearDown(){
    driver.quit(); //close all tabs & close browser
//    driver.close(); // only 1 tab (if 1 tab -> close window)
  }

}
