package com.debaura.selena.devaurapages.flightreservation;

import com.debaura.selena.devaurapages.AbsBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationConfirmationPage extends AbsBasePage {


    @FindBy(id = "go-to-flights-search")
    private WebElement gotoflightsearchbutton;

    public RegistrationConfirmationPage(WebDriver driver) {
        super(driver);
    }


    public void goToFlightsSearch() {
        this.gotoflightsearchbutton.click();
    }

    @Override
    public boolean isAt() {
        this.wait.until(ExpectedConditions.visibilityOf(this.gotoflightsearchbutton));
        return this.gotoflightsearchbutton.isDisplayed();
    }
}
