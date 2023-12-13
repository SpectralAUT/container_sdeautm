package com.debaura.selena.devaurapages.flightreservation;

import com.debaura.selena.devaurapages.AbsBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class FlighSelectionPage extends AbsBasePage {


    @FindBy(name = "departure-flight")
    private List<WebElement> departureFlightsOptions;
    @FindBy(name = "arrival-flight")
    private List<WebElement> arrivalFlightsOptions;

    @FindBy(id = "confirm-flights")
    private WebElement confirmsFlightsButton;


    public FlighSelectionPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isAt() {
        this.wait.until(ExpectedConditions.visibilityOf(this.confirmsFlightsButton));
        return this.confirmsFlightsButton.isDisplayed();
    }
    public void selectFLights() {
        int ramdom = ThreadLocalRandom.current().nextInt(0, departureFlightsOptions.size());
        this.departureFlightsOptions.get(ramdom).click();
        this.arrivalFlightsOptions.get(ramdom).click();
    }
}
