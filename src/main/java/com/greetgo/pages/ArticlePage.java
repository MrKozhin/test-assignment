package com.greetgo.pages;

import static com.codeborne.selenide.Selenide.$$;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;

public class ArticlePage {

    private final String URL = "https://en.wikipedia.org/wiki/Google#";
    private final ElementsCollection paragraphsContentsPanel = $$(By.xpath("//li[contains(@class, 'vector-toc-list-item vector-toc-level-')]"));
    private final ElementsCollection paragraphsArticle = $$(By.xpath("//span[contains(@class, 'mw-headline')]"));

    public String getURL() {
        return URL;
    }

    public ElementsCollection getParagraphsContentsPanel() {
        return paragraphsContentsPanel;
    }

    public ElementsCollection getParagraphsArticle() {
        return paragraphsArticle;
    }
}
