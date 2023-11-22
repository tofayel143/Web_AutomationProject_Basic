package com.basicautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class BasicAutomation extends BaseDriver{
	
	String url = "https://ahsan.com.bd/";
	
	@Test
	public void webAutomation() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get(url);

        Actions action = new Actions(driver);

        WebElement bookInformation = driver.findElement(By.xpath("/html/body/header/div[2]/div/div/div/ul/li[2]/a"));
        action.moveToElement(bookInformation).build().perform();
        Thread.sleep(3000);

        WebElement writer = driver.findElement(By.xpath("/html/body/header/div[2]/div/div/div/ul/li[2]/ul/li[1]/a"));
        action.moveToElement(writer).build().perform();
        writer.click();
        Thread.sleep(3000);

        WebElement arifAzad = driver.findElement(By.xpath("/html/body/section[1]/div/div/div[2]/div[1]/div/a/h5/center"));
        arifAzad.click();
        Thread.sleep(3000);

        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement litareture = driver.findElement(By.xpath("/html/body/section[1]/div/div/div[2]/div/div[2]/div[2]/div[6]/div/div[2]/h3/a"));
        js.executeScript("arguments[0].scrollIntoView(true)", litareture);
        Thread.sleep(3000);
        litareture.click();
        Thread.sleep(3000);

        WebElement discription = driver.findElement(By.xpath("//*[@id=\"ordernowUrl\"]"));
        js.executeScript("arguments[0].scrollIntoView(true)", discription);
        Thread.sleep(3000);

        WebElement addToCard = driver.findElement(By.className("add-to-cart2"));
//        js.executeScript("arguments[0].scrollIntoView(true)", addToCard);
        addToCard.click();
        Thread.sleep(3000);

        WebElement goToCard = driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div[3]/ul/li[2]/a"));
        goToCard.click();
        Thread.sleep(3000);

        WebElement checkOut = driver.findElement(By.cssSelector(".cart_page_checkout_btn > span:nth-child(2) > a:nth-child(1)"));
//        js.executeScript("arguments[0].scrollIntoView(true)", checkOut);
        checkOut.click();
        Thread.sleep(3000);
        
        WebElement login = driver.findElement(By.xpath("//*[@id=\"ClickHereForLogin\"]"));
        login.click();
        Thread.sleep(3000);
        
        WebElement mobile = driver.findElement(By.name("user_id"));
        mobile.sendKeys("01518907007");
        Thread.sleep(3000);
        
        WebElement passWord = driver.findElement(By.name("password"));
        passWord.sendKeys("t30a12s91");
        Thread.sleep(3000);
        
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"loginBtnHere\"]"));
        loginButton.click();
        Thread.sleep(3000);
        
        WebElement phone = driver.findElement(By.name("optional_number"));
        phone.sendKeys("01719347159");
        Thread.sleep(3000);

    }

}
