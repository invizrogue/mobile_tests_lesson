package study.qa.helpers;

import static io.restassured.RestAssured.given;
import static java.lang.String.format;
import static study.qa.helpers.CustomAllureListener.withCustomTemplates;

public class BrowserStackHelper {

    public static String getVideoUrl (String sessionId) {
        String url = format("https://api.browserstack.com/app-automate/sessions/%s.json", sessionId);

        return given()
                .log().all()
                .filter(withCustomTemplates())
                .auth().basic("bsuser_u6W7lp", "GPAGxr9zv43ebJsxhEMQ")
                .when()
                .get(url)
                .then()
                .log().all()
                .statusCode(200)
                .extract().path("automation_session.video_url");
    }
}