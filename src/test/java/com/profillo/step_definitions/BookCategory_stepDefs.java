package com.profillo.step_definitions;

import com.profillo.pages.BookCategoryPage;
import com.profillo.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class BookCategory_stepDefs {

    @When("the user clicks on Book Category dropdown")
    public void the_user_clicks_on_Book_Category_dropdown() {
        BrowserUtils.waitFor(2);
        BookCategoryPage BCDropdown = new BookCategoryPage();
        BCDropdown.bookCategoryDropdown.click();
    }

    @Then("the user should see following options")
    public void the_user_should_see_following_options(List<String> categoryOptions) {
        BrowserUtils.waitFor(3);

        Select select = new Select( new BookCategoryPage().bookCategoryDropdown );
        List<String> actualOptions = BrowserUtils.getElementsText(select.getOptions());
        System.out.println( "categoryOptions = " + categoryOptions );
        System.out.println("actualOptions = " + actualOptions);
        Assert.assertEquals(categoryOptions,actualOptions);

    }
}
