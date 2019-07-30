package pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import base.ScreenBase;

public class UserJourney_Page extends ScreenBase {

	public UserJourney_Page(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindAll({

			@FindBy(xpath = "//*[@class='cookieDisclaimer__closeButton ng-scope']"),
			@FindBy(xpath = "//button[@aria-label='Close']")

	})
	private WebElement Close_Cookies;

	@FindBy(xpath = "//button[contains(text(),'Login')]")
	private WebElement Login;

	@FindBy(xpath = "//form[@class='jsx-2435773800 Login__form']/descendant::input[@id='username']")
	private WebElement email;

	@FindBy(xpath = "//form[@class='jsx-2435773800 Login__form']/descendant::*[contains(text(),'Forgot Login details')]")
	private WebElement forgot;

	@FindBy(xpath = "//form[@id='ForgotLoginRequestForm']/descendant::*[@id='UsernameOrEmailAddress']")
	private WebElement usernameForgot;

	@FindBy(xpath = "//form[@id='ForgotLoginRequestForm']/descendant::*[@id='ForgotLoginSubmitButton']")
	private WebElement submit;
	
	@FindBy(xpath ="//*[contains(text(),'sports')]")
	private WebElement sports;

	public void isUserInWelcomeScreen() {
		clickAble(driver, Close_Cookies);
		//Assert.assertTrue(isElementPresent(Login), "The Welcome is not loaded");
		//clickAble(driver, sports);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

        //This will scroll the web page till end.		
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

	}

	public void loginUser() {
		
		clickAble(driver, Login);

//		WebDriverWait wait2 = new WebDriverWait(driver, 40);
//		wait2.until(ExpectedConditions.elementToBeClickable(
//				By.xpath("//form[@class='jsx-2435773800 Login__form']/descendant::label[@for='username']")));
//		driver.findElement(By.xpath("//form[@class='jsx-2435773800 Login__form']/descendant::label[@for='username']"))
//				.click();
		
		ScreenBase.enterText(email, "manjula", driver);

		
	}

	public void forgotPasswordDetail() {

		ScreenBase.clickAble(driver, forgot);

		String parent = driver.getWindowHandle();

		Set<String> s1 = driver.getWindowHandles();

		Iterator<String> I1 = s1.iterator();

		while (I1.hasNext()) {

			String child_window = I1.next();

			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);

				System.out.println(driver.switchTo().window(child_window).getTitle());

				usernameForgot.sendKeys("manjula@gmail.com");

				ScreenBase.clickAble(driver, submit);
				driver.close();

			}

		}
		
		driver.switchTo().window(parent);
	}
	
	public void scrollbottom()
	{
		
	}

}
