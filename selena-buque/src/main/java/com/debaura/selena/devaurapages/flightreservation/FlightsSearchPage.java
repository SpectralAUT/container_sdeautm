package com.debaura.selena.devaurapages.flightreservation;

import com.debaura.selena.devaurapages.AbsBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class FlightsSearchPage extends AbsBasePage {


    @FindBy(id = "passengers")
    private WebElement passengersselect;
    @FindBy(id = "search-flights")
    private WebElement searchFlightsButton;


    public FlightsSearchPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isAt() {
        this.wait.until(ExpectedConditions.visibilityOf(this.passengersselect));
        return this.passengersselect.isDisplayed();
    }


    public void selectPassengers(String noOfPassengers) {
        Select passengers = new Select(this.passengersselect);
        passengers.selectByValue(noOfPassengers);
    }

    public void searchFlighs() {
        this.searchFlightsButton.click();
    }

}
