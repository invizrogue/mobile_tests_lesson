package study.qa.tests;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import io.qameta.allure.selenide.AllureSelenide;
import study.qa.drivers.BrowserstackMobileDriver;
import study.qa.drivers.LocalMobileDriver;
import study.qa.helpers.Attach;

public class TestBase {

    public static String env = System.getProperty("env");

    @BeforeAll
    static void beforeAll() {
        if (env.equals("android") || env.equals("ios")) {
            Configuration.browser = BrowserstackMobileDriver.class.getName();
        } else {
            Configuration.browser = LocalMobileDriver.class.getName();
        }
        Configuration.browserSize = null;
    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        open();
    }

    @AfterEach
    void afterEach() {
        String sessionId = Selenide.sessionId().toString();
        Attach.pageSource();
        closeWebDriver();
        if (env.equals("android") || env.equals("ios")) {
            Attach.addVideo(sessionId);
        }
    }
}