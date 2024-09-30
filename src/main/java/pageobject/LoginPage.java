package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

import javax.swing.*;

public class LoginPage {

    private WebDriver driver;


    @FindBy(xpath = "//li[@ data-cy='account']")

    private WebElement signIn;

    @FindBy(xpath="//input[@placeholder='Enter Mobile Number']")
    private WebElement enterMobileNumber;

    @FindBy(xpath ="//span[text()='Continue']")
    private WebElement continueButton;

   // WebElement elementToRightClick = driver.findElement(By.id("right-click-area"));

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);  // Initializing elements with PageFactory
    }


    public void signInMakeMyTrip() throws InterruptedException {
        Thread.sleep(5000);
        signIn.click();


    }
    public void enterPhoneNumberInPlaceHolder(String phoneNumber) throws InterruptedException {
        Thread.sleep(10000);
        enterMobileNumber.sendKeys(phoneNumber);

    }

    public void clickOnContinueButton() throws InterruptedException {
        Thread.sleep(10000);

        Actions action = new Actions(driver);
        action.moveToElement(continueButton).build().perform();
        action.doubleClick(continueButton).build().perform();
        //action.contextClick(continueButton).build().perform();

        //continueButton.click();

    }

}