package com.profillo.step_definitions;

import com.profillo.utilities.BrowserUtils;
import com.profillo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class YearFunc_stepDefs {

    @When("user clicks on Year box")
    public void user_clicks_on_Year_box() {
        BrowserUtils.waitFor(3);
        Driver.get().findElement(By.xpath("(//input[@class='form-control'])[3]")).click();

    }

    @Then("user enters Year data")
    public void user_enters_Year_data() {
        BrowserUtils.waitFor(3);
        Driver.get().findElement(By.xpath("(//input[@class='form-control'])[3]")).sendKeys("1978");



    }

}
