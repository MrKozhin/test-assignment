package com.greetgo.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CodeInspectPage {
    String URL = "https://en.wikipedia.org/w/index.php?title=Main_Page&action=edit";


    public String getURL() {
        return URL;
    }

    public SelenideElement getLinkToMainPage() {
        return $("li[id='n-mainpage-description'] > a");
    }

    public SelenideElement getBurgerMenu() {
        return $("#vector-main-menu-dropdown");
    }
}
