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

public class AddConsultaTest extends TestCase{
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
  public void testAddConsulta() throws Exception {
    driver.get(baseUrl + "/PWsubastas/login.htm");
    driver.findElement(By.id("usuarioNombre")).clear();
    driver.findElement(By.id("usuarioNombre")).sendKeys("Eli");
    driver.findElement(By.id("usuarioPassword")).clear();
    driver.findElement(By.id("usuarioPassword")).sendKeys("eli");
    driver.findElement(By.name("submit")).click();
    driver.get(baseUrl + "/PWsubastas/contactar.htm");
    driver.findElement(By.id("nombre")).clear();
    driver.findElement(By.id("nombre")).sendKeys("Rosario");
    driver.findElement(By.id("telefono")).clear();
    driver.findElement(By.id("telefono")).sendKeys("84759009");
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("rosario@chambi");
    driver.findElement(By.id("comentario")).clear();
    driver.findElement(By.id("comentario")).sendKeys("Hola soy Rosario POnce");
    driver.findElement(By.name("submit")).click();
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
