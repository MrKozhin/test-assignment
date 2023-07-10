package com.greetgo.pages;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$x;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class ArticlePage {

    private final String URL = "https://en.wikipedia.org/wiki/Google#";
    private final ElementsCollection paragraphsContentsPanel = $$(By.xpath("//li[contains(@class, 'vector-toc-list-item vector-toc-level-')]"));
    private final ElementsCollection paragraphsArticle = $$(By.xpath("//span[contains(@class, 'mw-headline')]"));
    private final SelenideElement languageDropdown = $x("//div[@id='p-lang-btn']");
    private final SelenideElement languageRussianButton = $x("//li[@title='Русский' and @class='interlanguage-link interwiki-ru mw-list-item']");
    private final SelenideElement wikiLogoRussian = $x("//a[@class='mw-wiki-logo']");


    public String getURL() {
        return URL;
    }

    public ElementsCollection getParagraphsContentsPanel() {
        return paragraphsContentsPanel;
    }

    public ElementsCollection getParagraphsArticle() {
        return paragraphsArticle;
    }

    public SelenideElement getLanguageDropdown() {
        return languageDropdown;
    }

    public SelenideElement getLanguageRussianButton() {
        return languageRussianButton;
    }

    public SelenideElement getWikiLogoRussian() {
        return wikiLogoRussian;
    }
}
