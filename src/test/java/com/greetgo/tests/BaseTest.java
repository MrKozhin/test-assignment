package com.greetgo.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.greetgo.pages.CodeInspectPage;
import com.greetgo.pages.MainPage;
import com.greetgo.pages.SearchResultPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public abstract class BaseTest {

    protected MainPage mainPage;
    protected SearchResultPage searchResultPage;
    protected CodeInspectPage codeInspectPage;

    public void init() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--lang=en");
        Configuration.browserCapabilities = new DesiredCapabilities();
        Configuration.browserCapabilities.setCapability(ChromeOptions.CAPABILITY, options);
        Configuration.browser = "chrome";
        Configuration.driverManagerEnabled = true;
        Configuration.headless = false;
        //Configuration.browserSize = "1920x1080";
    }

    @BeforeTest
    public void setUp() {
        init();
        mainPage = new MainPage();
        searchResultPage = new SearchResultPage();
        codeInspectPage = new CodeInspectPage();
    }

    @AfterTest
    public void tearDown() {
        Selenide.closeWebDriver();
    }

}
