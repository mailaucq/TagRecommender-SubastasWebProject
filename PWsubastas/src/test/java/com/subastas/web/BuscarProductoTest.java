package com.subastas.web;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import junit.framework.TestCase;

import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BuscarProductoTest extends TestCase{
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://localhost:8080";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testBuscarProducto() throws Exception {
    driver.get(baseUrl + "/PWsubastas/home.jsp");
    driver.findElement(By.linkText("Login")).click();
    driver.findElement(By.id("usuarioNombre")).clear();
    driver.findElement(By.id("usuarioNombre")).sendKeys("Eli");
    driver.findElement(By.id("usuarioPassword")).clear();
    driver.findElement(By.id("usuarioPassword")).sendKeys("eli");
    driver.findElement(By.name("submit")).click();
    driver.findElement(By.id("searchWord")).clear();
    driver.findElement(By.id("searchWord")).sendKeys("Capitan");
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.id("searchWord")).clear();
    driver.findElement(By.id("searchWord")).sendKeys("");
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
