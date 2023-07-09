package com.greetgo.pages;

import static com.codeborne.selenide.Selenide.$x;

import com.codeborne.selenide.SelenideElement;

public class CodeInspectPage {
    String URL = "https://en.wikipedia.org/w/index.php?title=Main_Page&action=edit";
    private final SelenideElement linkToMainPage = $x("//li[@class='mw-list-item' and @id='n-mainpage-description']//a");
    private final SelenideElement burgerMenu = $x("//div[@id='vector-main-menu-dropdown']");

    public String getURL() {
        return URL;
    }

    public SelenideElement getLinkToMainPage() {
        return linkToMainPage;
    }

    public SelenideElement getBurgerMenu() {
        return burgerMenu;
    }
}
