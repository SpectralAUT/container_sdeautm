package com.debaura.selena.devaurapages.flightreservation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
    private WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, );
    }


    public void enterUserDetails(String firstName, String lastName) {
        this.firstnameinput.sendKeys(firstName);
        this.lastnameinput.sendKeys(lastName);
    }

    public void enterUserCredentials(String email, String psswd) {

        this.emailinput.sendKeys(email);
        this.passwdinput.sendKeys(psswd);


    }

    public void enterAddress(String street, String city, String state, String zip) {
        this.streetinput.sendKeys(street);
        this.cityinput.sendKeys(city);
        this.zipinput.sendKeys(zip);
    }


    public void register() {
        this.registerbutton.click();
    }


    public void goTo(String url) {
        this.driver.get(url);
    }


    @FindBy(id = "firstName")
    private WebElement firstnameinput;
    @FindBy(id = "lastName")
    private WebElement lastnameinput;
    @FindBy(id = "email")
    private WebElement emailinput;
    @FindBy(id = "password")
    private WebElement passwdinput;
    @FindBy(name = "street")
    private WebElement streetinput;
    @FindBy(name = "zip")
    private WebElement zipinput;
    @FindBy(id = "register-btn")
    private WebElement registerbutton;
    @FindBy(name = "city")
    private WebElement cityinput;


}
