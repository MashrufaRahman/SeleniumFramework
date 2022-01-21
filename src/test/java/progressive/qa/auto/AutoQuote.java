package progressive.qa.auto;

import java.time.Duration;

import org.apache.commons.math3.stat.descriptive.summary.Product;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import progressive.qa.base.BaseClass2;

public class AutoQuote extends BaseClass2{
	@Test
	public void autoQuoteTesting() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.elementToBeClickable(productsPage.autoButton));
		productsPage.autoButton.click();
		
		wait.until(ExpectedConditions.visibilityOf(productsPage.zipCodeText));
		String zipCodeText = productsPage.zipCodeText.getText();
		
		System.out.println(">>>>>>>>>>>>>>>>>> "+zipCodeText);	
	}
}

	
	/*@Test
		public void autoQuoteTesting() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(ProductsPage.))
		WebElement element = driver.findElement(By.xpath("//div[@id='NavContainer']"));
		element.click();
		
		 element= driver.findElement(By.xpath("//input[@id='zipCode_overlay']"));
		wait.until(ExpectedConditions.visibilityOf(element));
		String zipCodeText = element.getText()
;
		System.err.println(zipCodeText);
		
	}

}*/
