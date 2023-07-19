package com.greetgo.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ArticlePage {

    private final String URL = "https://en.wikipedia.org/wiki/Google#";
    private final String URL_RUS = "https://ru.wikipedia.org/wiki/Google_(%D0%BA%D0%BE%D0%BC%D0%BF%D0%B0%D0%BD%D0%B8%D1%8F)";
    private final String RANDOM_URL = "https://en.wikipedia.org/wiki/Special:Random";

    public String getURL() {
        return URL;
    }

    public String getRANDOM_URL() {
        return RANDOM_URL;
    }

    public String getURL_RUS() {
        return URL_RUS;
    }

    public ElementsCollection getParagraphsContentsPanel() {
        return $$("li[class*='vector-toc-list-item vector-toc-level-']");
    }

    public ElementsCollection getParagraphsArticle() {
        return $$("span[class*= 'mw-headline']");
    }

    public SelenideElement getLanguageDropdown() {
        return $("#p-lang-btn");
    }

    public SelenideElement getLanguageRussianButton() {
        return $("li[title='Русский']");
    }

    public SelenideElement getWikiLogoRussian() {
        return $(".mw-wiki-logo");
    }

    public SelenideElement getContents() {
        return $("h2[class='vector-pinnable-header-label']");
    }

    public SelenideElement getArticleTitle() {
        return $(".mw-page-title-main");
    }

    public SelenideElement getMoreLangsButton() {
        return $(".mw-interlanguage-selector.mw-ui-button");
    }

    public ElementsCollection getAllLangsToChooseList() {
        return $$(".interlanguage-link");
    }

    public SelenideElement getElementToScrollDown(int i) {
        return $$(".three.columns").get(i);
    }


}
