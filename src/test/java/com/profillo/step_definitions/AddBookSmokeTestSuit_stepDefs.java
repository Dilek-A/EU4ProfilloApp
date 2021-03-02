package com.profillo.step_definitions;


import com.profillo.pages.BookCategoryPage;
import com.profillo.utilities.BrowserUtils;
import com.profillo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AddBookSmokeTestSuit_stepDefs {

    @When("user clicks on books module")
    public void user_clicks_on_books_module() {
        BrowserUtils.waitFor( 5 );
        BookCategoryPage booksMdl = new BookCategoryPage();
        booksMdl.booksModule.click();
    }

    @Then("Book Management page should be opened")
    public void book_Management_page_should_be_opened() {
        Assert.assertEquals("http://library3.cybertekschool.com/#books", Driver.get().getCurrentUrl() );

    }

    @Then("the user should be able to click to Add Book button")
    public void the_user_should_be_able_to_click_to_Add_Book_button() {
        BrowserUtils.waitFor( 3 );
        BookCategoryPage booksMdl = new BookCategoryPage();
        booksMdl.addBookButton.click();
    }

    @Then("Add Book window should be opened")
    public void add_Book_window_should_be_opened() {
        BrowserUtils.waitFor( 3 );
        BookCategoryPage bookBtn = new BookCategoryPage();
       // bookBtn.addBookButton.click();
        Assert.assertEquals( "Add Book",bookBtn.addWindow.getText() );
    }


}
