package com.profillo.step_definitions;

import com.profillo.pages.BookCategoryPage;
import com.profillo.utilities.BrowserUtils;
import io.cucumber.java.en.Given;

public class AddBook_stepDefs {


    @Given("user clicks on book module")
    public void user_clicks_on_book_module() {
        BrowserUtils.waitFor( 5 );
        BookCategoryPage booksMdl = new BookCategoryPage();
        booksMdl.booksModule.click();
    }

    @Given("user clicks on Add Book button")
    public void user_clicks_on_Add_Book_button() {
        BrowserUtils.waitFor( 5 );
        BookCategoryPage bookBtn = new BookCategoryPage();
        bookBtn.addBookButton.click();
    }




}
