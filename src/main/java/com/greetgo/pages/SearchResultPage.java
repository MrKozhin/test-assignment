package com.greetgo.pages;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$x;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class SearchResultPage {
    private final SelenideElement searchResultHeading = $x("//h1[@id='firstHeading']");
    private final SelenideElement searchInputFieldFillingText = $x("//input[(@type='search') and (@id='ooui-php-1')]");
    private final ElementsCollection searchResultQuickView = $$(By.xpath("//li[contains(@class, 'mw-search-result mw-search-result-ns-0')]"));

    public SelenideElement getSearchResultHeading() {
        return searchResultHeading;
    }

    public SelenideElement getSearchInputFieldFillingText() {
        return searchInputFieldFillingText;
    }

    public ElementsCollection getSearchResultQuickView() {
        return searchResultQuickView;
    }
}
