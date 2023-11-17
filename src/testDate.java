import java.time.LocalDate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class testDate extends prameter {
  
	WebDriver driver = new ChromeDriver(); 
	@BeforeTest
    public void myBeforeTest() {
		
	}
	
	@Test
    public void myTestdate() {
		driver.get("https://www.almosafer.com/en");
		
		WebElement flighDate =driver.findElement(By.cssSelector("div[class='sc-OxbzP sc-lnrBVv gKbptE'] span[class='sc-fvLVrH hNjEjT']"));
		WebElement ReturnDate =driver.findElement(By.cssSelector("div[class='sc-OxbzP sc-bYnzgO bojUIa'] span[class='sc-fvLVrH hNjEjT']"));
		int ActualflighDate = Integer.parseInt(flighDate.getText());
		int ActualReturnDate = Integer.parseInt(ReturnDate.getText());
		myAssert.assertEquals(ActualflighDate,expectedF);
		myAssert.assertEquals(ActualReturnDate,expectedR);
		myAssert.assertAll();
	}
	
	 @AfterTest
	 public void myAfterTest() {
		 
	 }
	 
	
}
