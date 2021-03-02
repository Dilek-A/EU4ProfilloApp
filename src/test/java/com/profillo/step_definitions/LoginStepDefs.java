package com.profillo.step_definitions;

import com.profillo.pages.LoginPage;
import com.profillo.utilities.BrowserUtils;
import com.profillo.utilities.ConfigurationReader;
import com.profillo.utilities.Driver;
import io.cucumber.java.en.Given;
import org.junit.Assert;

public class LoginStepDefs {

    @Given("the librarian logged in the application")
    public void the_librarian_logged_in_the_application() {

        Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().manage().window().maximize();
        BrowserUtils.waitFor(1);

       String mailAddress = ConfigurationReader.get("librarian_username");
       String password = ConfigurationReader.get("librarian_password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(mailAddress, password);

        BrowserUtils.waitFor( 1 );
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals( "Library", actualTitle );



    }


}
