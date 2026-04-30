package Utils;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class ApiRequests {

    public static Response get(String endPoint) {
        return given()
                .log().all()
                .baseUri(Constants.BASE_URL)
                .when()
                .get(endPoint);
    }

    public static Response get(String endPoint, String path) {
        return given()
                .log().all()
                .baseUri(Constants.BASE_URL)
                .when()
                .get(endPoint + "/" + path);
    }

    public static Response post(String endPoint, Object body) {
        return given()
                .log().all()
                .baseUri(Constants.BASE_URL)
                .contentType(ContentType.JSON)
                .body(body)
                .when()
                .post(endPoint);
    }

    public static Response put(String endPoint, int id, Object body) {
        return given()
                .log().all()
                .baseUri(Constants.BASE_URL)
                .contentType(ContentType.JSON)
                .body(body)
                .when()
                .put(endPoint + "/" + id);
    }
}