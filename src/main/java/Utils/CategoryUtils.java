package Utils;

import Utils.ApiRequests;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class CategoryUtils {
    public static Response getCategory(String id)
    {
        return ApiRequests.get(Constants.CATEGORY_END_POINT, id);
    }
    public static Response getAllCategories()
    {
        return ApiRequests.get(Constants.CATEGORY_END_POINT);
    }
}