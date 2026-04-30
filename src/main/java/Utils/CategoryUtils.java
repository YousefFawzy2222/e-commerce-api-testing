package Utils;

import io.restassured.response.Response;
import modesl.request_models.CategoryDTO;

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
    public static Response createCategory(CategoryDTO body) {
        return Utils.ApiRequests.post(Constants.CATEGORY_END_POINT, body);
    }
    public static Response updateCategory( CategoryDTO body, int id) {
        return Utils.ApiRequests.put(Constants.CATEGORY_END_POINT, id,  body);
    }
}