import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class docker {

    @Test
    void shouldReturn() {

        given()
                .baseUri("https://localhost:9999")
                .contentType("text/plain; charset = UTF-8")
                .when()
                .get("/api/cards")
                .then()
                .statusCode(200);
    }
}