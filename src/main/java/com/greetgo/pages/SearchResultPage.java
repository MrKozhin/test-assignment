package com.greetgo.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchResultPage {


    public SelenideElement getSearchResultHeading() {
        return $("h1[id = 'firstHeading']");
    }

    public SelenideElement getSearchInputFieldFillingText() {
        return $("input[id='ooui-php-1']");
    }

    public ElementsCollection getSearchResultQuickView() {
        return $$(".mw-search-result.mw-search-result-ns-0");
    }

    public ElementsCollection getSearchResultQuickViewsLinks() {
        return $$(".mw-search-result-heading > a");
    }
}
