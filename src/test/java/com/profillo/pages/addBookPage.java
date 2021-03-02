package com.profillo.pages;

import com.profillo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addBookPage {

    public class AddBookPage extends BasePage{

        public AddBookPage(){ PageFactory.initElements( Driver.get(), this); }

        @FindBy(xpath="//span[text()='Books']")
        public WebElement booksModule;

        @FindBy(xpath="(//a[contains(@class,'btn btn-primary')])[1]")
        public WebElement addBookButton;

        @FindBy(id = "book_group_id")
        public WebElement bookCategoryDropdown;
    }

}
