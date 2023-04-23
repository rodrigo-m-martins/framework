package org.duke;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.testng.annotations.Test;

import java.nio.file.Paths;

public class Main {

    @Test
    public void test() {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.webkit().launch();
        Page page = browser.newPage();
        page.navigate("http://whatsmyuseragent.org/");
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("example.png")));


    }
}