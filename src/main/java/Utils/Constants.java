package Utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.restassured.config.ObjectMapperConfig;
import io.restassured.config.RestAssuredConfig;

public class Constants {
    public static final String BASE_URL = "https://api.escuelajs.co/api/v1";
    public static final String CATEGORY_END_POINT = "categories";
    public static final String PRODUCT_END_POINT = "products";

    public static RestAssuredConfig config() {
        return RestAssuredConfig.config()
                .objectMapperConfig(new ObjectMapperConfig().jackson2ObjectMapperFactory(
                        (cls, charset) -> new ObjectMapper()
                                .setSerializationInclusion(JsonInclude.Include.NON_NULL)
                ));
    }
}
