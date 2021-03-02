package com.profillo.step_definitions;

import com.profillo.pages.BookCategoryPage;
import com.profillo.utilities.BrowserUtils;
import com.profillo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class AddBookParameters_StepDefs {



    @When("user fills each add book parameters on add book window")
    public void user_fills_each_add_book_parameters_on_add_book_window() {
        BrowserUtils.waitFor(3);
        Driver.get().findElement(By.name("name")).sendKeys("Kuşlar da Gitti");
        Driver.get().findElement(By.xpath("//input[@name='author']")).sendKeys("Yasar Kemal");
        Driver.get().findElement(By.name("isbn")).sendKeys("975-437-009-5");
        Driver.get().findElement(By.name("year")).sendKeys("1978");
        Driver.get().findElement(By.id("book_group_id")).sendKeys("Classic");
        //Driver.get().findElement(By.xpath("//textarea[@name='description']")).sendKeys("Kuşlar da Gitti, " +
            //    "İstanbul'un çürüyen, kirlenen yüzünün ve insanlığın da şehirle birlikte yok oluşunun romanıdır");

    }

    @When("user clicks on save changes button")
    public void user_clicks_on_save_changes_button() {
        BrowserUtils.waitFor( 3 );
        BookCategoryPage bookCategoryPage = new BookCategoryPage();
        new BookCategoryPage().saveChangesButton.click();
    }

    @Then("new added book will appear on book management page")
    public void new_added_book_will_appear_on_book_management_page() {
            BrowserUtils.waitFor(2);
            //Assert.assertTrue(Driver.get().findElement(By.xpath("//div[@class='toast toast-success']//div[1]")).isDisplayed());
            Assert.assertTrue(new BookCategoryPage().newBook.isDisplayed());
        }


}
