package com.profillo.step_definitions;

import com.profillo.utilities.BrowserUtils;
import com.profillo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class IsbnFunc_stepDefs {

    @When("user clicks on ISBN box")
    public void user_clicks_on_ISBN_box() {
        BrowserUtils.waitFor(3);
        Driver.get().findElement(By.name("isbn")).click();


    }

    @Then("user enters ISBN data")
    public void user_enters_ISBN_data() {
        BrowserUtils.waitFor(3);
        Driver.get().findElement(By.name("isbn")).sendKeys("975-437-009-5");


    }
}
