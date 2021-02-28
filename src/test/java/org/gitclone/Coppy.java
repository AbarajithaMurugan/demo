package org.gitclone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Coppy {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Navin Vishal M\\Downloads\\Abara's\\eclipse\\configuration\\Demo\\driver\\chromedriver.exe");
    WebDriver driver= new ChromeDriver();
    System.out.println("hie");
    driver.get("https://en-gb.facebook.com/login/");
    driver.findElement(By.id("email")).sendKeys("abcbjdn");
    driver.findElement(By.id("pass")).sendKeys("12345");
    driver.findElement(By.id("loginbutton")).click();
}
}
