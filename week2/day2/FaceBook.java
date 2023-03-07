package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.get("https://en-gb.facebook.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.findElement(By.xpath("//a[text()='Create new account']")).click();
driver.findElement(By.name("firstname")).sendKeys("Hari");
driver.findElement(By.name("lastname")).sendKeys("Sivam");
driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("1234567890");
driver.findElement(By.id("password_step_input")).sendKeys("Sivamhari1");
WebElement birthday = driver.findElement(By.name("birthday_day"));
Select day = new Select(birthday);
day.selectByVisibleText("17");
WebElement birthmonth = driver.findElement(By.id("month"));
Select month = new Select(birthmonth);
month.selectByIndex(9);
WebElement birthyear = driver.findElement(By.id("year"));
Select year = new Select(birthyear);
year.selectByValue("1996");
driver.findElement(By.xpath("//input[@value='1']")).click();



	}

}
