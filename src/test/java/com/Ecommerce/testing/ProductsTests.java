package com.Ecommerce.testing;

import Utils.ProductsUtils;
import io.restassured.response.Response;
import modesl.request_models.ProductDTO;
import modesl.response_models.GetAllProductPOJO;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ProductsTests {

    @Test
    public void getAllProducts() {
        Response response = ProductsUtils.getAllProducts();
        Assert.assertNotNull(response.jsonPath().getString("[0].price"));
    }

    @Test
    public void getProductById() {
        GetAllProductPOJO.Example product = ProductsUtils
                .getSingleProductById(6)
                .as(GetAllProductPOJO.Example.class);

        Assert.assertNotNull(product.getTitle());
    }

    @Test
    public void getProductBySlug() {
        GetAllProductPOJO.Example product = ProductsUtils
                .getSingleProductBySlug("majestic-mountain-graphic-t-shirt")
                .as(GetAllProductPOJO.Example.class);

        Assert.assertNotNull(product.getTitle());
    }

    @Test
    public void createProduct() {
        ProductDTO body = ProductDTO.builder()
                .title("New Product " + System.currentTimeMillis())
                .price(10.0)
                .description("A description")
                .categoryId(1)
                .images(List.of("https://placehold.co/600x400"))
                .build();

        Response response = ProductsUtils.createProduct(body);
        Assert.assertEquals(response.statusCode(), 201);
    }

    @Test
    public void updateProduct() {
        ProductDTO body = ProductDTO.builder()
                .title("NewProduct " + System.currentTimeMillis())
                .price(10.0)
                .description("Adescription")
                .categoryId(1)
                .images(List.of("https://placehold.co/600x400"))
                .build();

        Response response = ProductsUtils.updateProduct(11, body);
        Assert.assertEquals(response.statusCode(), 200);
    }
}