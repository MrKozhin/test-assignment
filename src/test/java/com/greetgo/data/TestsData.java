package com.greetgo.data;

import org.testng.annotations.DataProvider;

public class TestsData {

    @DataProvider(name = "Search Field Data Provider")
    public static Object[][] searchFieldDataProvider() {

        return new Object[][] {
            {"Search results", 6, 20},
            {"Search results", 255, 0},
            {"Search results", 256, 0}
        };
    }

    @DataProvider(name = "Link To Main Data Provider")
    public static Object[][] testLinkToMainPageDataProvider() {
        return new Object[][] {
            {"Wikipedia, the free encyclopedia", "https://en.wikipedia.org/wiki/Main_Page"}
        };
    }
}
