package study.qa.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import study.qa.drivers.BrowserStackMobileDriver;
import study.qa.helpers.Attach;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class TestBase {

    @BeforeAll
    static void beforeAll() {
        Configuration.browser = BrowserStackMobileDriver.class.getName();
        Configuration.browserSize = null;
    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        open(); // костыль для инициализации селенида для мобильной автоматизации
    }

    @AfterEach
    void afterEach() {
        String sessionId = Selenide.sessionId().toString();

        Attach.pageSource();

        closeWebDriver();

        Attach.addVideo(sessionId);
    }
}