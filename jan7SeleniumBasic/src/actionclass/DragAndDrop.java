package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");
		
		WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
		
		driver.switchTo().frame(iframe);
		
		WebElement draggable = driver.findElement(By.xpath("//*[@id='draggable']"));
		
		WebElement droppable = driver.findElement(By.xpath("//*[@id='droppable']"));
		
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(draggable, droppable).perform();
	}

}
