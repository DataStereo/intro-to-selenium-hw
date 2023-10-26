package com.example.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends com.example.selenium.pages.BasePage {

    @FindBy(css = "h2")
    private WebElement title;

    @FindBy(css = ".icon-2x")
    private WebElement logout;

    // TODO define title and logout WebElements using @FindBy

    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public String getTitle() {
        return title.getText();
    }

    public MainPage clickLogout() {
        logout.click();
        return this;
    }
}
