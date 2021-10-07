package testler.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_JavaArama {
    public static void main(String[] args) {
        //amazon web sayfasina girip Java kelimesini aratin ve bulunan sonuc sayisini yazdirin

        System.setProperty("webdriver.chrome.driver","(computer's path)selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");

        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));

        search.sendKeys("Java" + Keys.ENTER);//Selenium gets Enter.

       //I used xpath to get numbers of result
        
        WebElement resultNumber = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[1]"));

        System.out.println(resultNumber.getText());

        driver.close();
    }
}
