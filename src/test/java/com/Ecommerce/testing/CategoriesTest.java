package com.Ecommerce.testing;

import Utils.CategoryUtils;
import modesl.request_models.CategoryDTO;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class CategoriesTest {

    @Test
    public void getOneCategory() {
        Response response = CategoryUtils.getCategory("1");
        Assert.assertEquals(response.statusCode(), 200, "Status is not correct");

        CategoryDTO category = response.as(CategoryDTO.class);
        Assert.assertEquals(category.getId(), 1, "id is not correct");
    }

    @Test
    public void getCategories() {
        Response response = CategoryUtils.getAllCategories();
        Assert.assertEquals(response.statusCode(), 200, "Status is not correct");

        List<CategoryDTO> categories = response.jsonPath().getList("", CategoryDTO.class);
        Assert.assertFalse(categories.isEmpty(), "Categories list is empty");
        Assert.assertEquals(categories.get(0).getId(), 1, "id is not correct");
    }

    @Test
    public void getInvalidCategory() {
        Response response = CategoryUtils.getCategory("0");
        Assert.assertEquals(response.statusCode(), 400, "Status is not correct");
    }
}