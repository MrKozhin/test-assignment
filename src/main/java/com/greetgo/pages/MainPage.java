package com.greetgo.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    private final String URL = "https://www.wikipedia.org/";

    public String getURL() {
        return URL;
    }

    public SelenideElement getSearchInputField() {
        return $("input[id='searchInput']");
    }
}
