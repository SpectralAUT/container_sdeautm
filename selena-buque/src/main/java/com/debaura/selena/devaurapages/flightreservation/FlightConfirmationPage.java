package com.debaura.selena.devaurapages.flightreservation;

import com.debaura.selena.devaurapages.AbsBasePage;
import org.openqa.selenium.WebDriver;

public class FlightConfirmationPage extends AbsBasePage {
    public FlightConfirmationPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isAt() {
        return false;
    }
}
