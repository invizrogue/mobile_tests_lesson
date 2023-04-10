package study.qa.tests.local;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;
import static io.qameta.allure.Allure.step;

import com.codeborne.selenide.Selenide;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import study.qa.tests.TestBase;

public class LocalAndroidTest extends TestBase {

    @Test
    @Tags({@Tag("local"), @Tag("real")})
    void searchInputTest() {

        step("Пропустить onboarding screen", Selenide::back);
        step("Ввод строки поиска в поле поиска", () -> {
            $(accessibilityId("Search Wikipedia")).click();
            $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Selenide");
        });
        step("Проверка, что есть результаты поиска", () ->
                $$(id("org.wikipedia.alpha:id/page_list_item_title"))
                        .shouldHave(sizeGreaterThan(0)));
    }

    @Test
    @Tags({@Tag("local"), @Tag("real")})
    void onboardingScreenTest() {

        String pageOnePrimary = "The Free Encyclopedia …in over 300 languages";
        String pageOneSecondary = "We’ve found the following on your device:";
        String pageTwoPrimary = "New ways to explore";
        String pageThreePrimary = "Reading lists with sync";
        String pageFourPrimary = "Send anonymous data";

        step("Страница содержит текст " + pageOnePrimary, () -> {
            $(id("org.wikipedia.alpha:id/primaryTextView"))
                    .shouldHave(text(pageOnePrimary));
        });
        step("Страница содержит текст " + pageOneSecondary, () -> {
            $(id("org.wikipedia.alpha:id/secondaryTextView"))
                    .shouldHave(text(pageOneSecondary));
        });
        step("Переход на следующую страницу", () -> {
            $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
        });
        step("Страница содержит текст " + pageTwoPrimary, () -> {
            $(id("org.wikipedia.alpha:id/primaryTextView"))
                    .shouldHave(text(pageTwoPrimary));
        });
        step("Переход на следующую страницу", () -> {
            $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
        });
        step("Страница содержит текст " + pageThreePrimary, () -> {
            $(id("org.wikipedia.alpha:id/primaryTextView"))
                    .shouldHave(text(pageThreePrimary));
        });
        step("Переход на следующую страницу", () -> {
            $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
        });
        step("Страница содержит текст " + pageFourPrimary, () -> {
            $(id("org.wikipedia.alpha:id/primaryTextView"))
                    .shouldHave(text(pageFourPrimary));
        });
        step("Страница содержит текст " + pageFourPrimary, () -> {
            $(id("org.wikipedia.alpha:id/primaryTextView"))
                    .shouldHave(text(pageFourPrimary));
        });
        step("Страница содержит кнопку Reject", () -> {
            $(id("org.wikipedia.alpha:id/rejectButton")).should(visible);
        });
        step("Страница содержит кнопку Accept", () -> {
            $(id("org.wikipedia.alpha:id/acceptButton")).should(visible);
        });
    }
}