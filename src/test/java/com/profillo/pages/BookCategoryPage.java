package com.profillo.pages;

import com.profillo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookCategoryPage {

    public BookCategoryPage() { PageFactory.initElements(Driver.get(),this); }

    @FindBy(xpath = "//span[text()='Books']")
    public WebElement booksModule;

    @FindBy(xpath = "//i[@class='fa fa-plus']")
    public WebElement addBookButton;

    @FindBy(id = "book_group_id")
    public WebElement bookCategoryDropdown;

    @FindBy(xpath = "//h5[text()='Add Book']")
    public WebElement addWindow;

    @FindBy(xpath ="//div[text()='The book has been created.']")
    public WebElement newBook;

    @FindBy(xpath = "//button[text()='Save changes']")
    public  WebElement saveChangesButton;

}
