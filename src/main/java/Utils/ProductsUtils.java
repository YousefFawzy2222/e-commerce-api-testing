package Utils;

import io.restassured.response.Response;
import modesl.request_models.ProductDTO;

public class ProductsUtils {

    public static Response getAllProducts() {
        return Utils.ApiRequests.get(Constants.PRODUCT_END_POINT);
    }

    public static Response getSingleProductBySlug(String slug) {
        return Utils.ApiRequests.get(Constants.PRODUCT_END_POINT, "slug/" + slug);
    }

    public static Response getSingleProductById(int id) {
        return Utils.ApiRequests.get(Constants.PRODUCT_END_POINT, String.valueOf(id));
    }

    public static Response createProduct(ProductDTO body) {
        return Utils.ApiRequests.post(Constants.PRODUCT_END_POINT, body);
    }

    public static Response updateProduct(int id, ProductDTO body) {
        return Utils.ApiRequests.put(Constants.PRODUCT_END_POINT, id, body);
    }
}