package com.greetgo.pages;

import static com.codeborne.selenide.Selenide.$x;

import com.codeborne.selenide.SelenideElement;

public class MainPage {
    private final String URL = "https://www.wikipedia.org/";
    private final SelenideElement searchInputField = $x("//input[@id='searchInput']");

    public String getURL() {
        return URL;
    }

    public SelenideElement getSearchInputField() {
        return searchInputField;
    }
}
