package modesl.response_models;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name",
        "slug",
        "image",
        "creationAt",
        "updatedAt"
})
@Generated("jsonschema2pojo")
public class GetAllProductPOJO {
    public static class Category {

        @JsonProperty("id")
        private Integer id;
        @JsonProperty("name")
        private String name;
        @JsonProperty("slug")
        private String slug;
        @JsonProperty("image")
        private String image;
        @JsonProperty("creationAt")
        private String creationAt;
        @JsonProperty("updatedAt")
        private String updatedAt;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

        @JsonProperty("id")
        public Integer getId() {
            return id;
        }

        @JsonProperty("id")
        public void setId(Integer id) {
            this.id = id;
        }

        @JsonProperty("name")
        public String getName() {
            return name;
        }

        @JsonProperty("name")
        public void setName(String name) {
            this.name = name;
        }

        @JsonProperty("slug")
        public String getSlug() {
            return slug;
        }

        @JsonProperty("slug")
        public void setSlug(String slug) {
            this.slug = slug;
        }

        @JsonProperty("image")
        public String getImage() {
            return image;
        }

        @JsonProperty("image")
        public void setImage(String image) {
            this.image = image;
        }

        @JsonProperty("creationAt")
        public String getCreationAt() {
            return creationAt;
        }

        @JsonProperty("creationAt")
        public void setCreationAt(String creationAt) {
            this.creationAt = creationAt;
        }

        @JsonProperty("updatedAt")
        public String getUpdatedAt() {
            return updatedAt;
        }

        @JsonProperty("updatedAt")
        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }
    }
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "id",
            "title",
            "slug",
            "price",
            "description",
            "category",
            "images",
            "creationAt",
            "updatedAt"
    })
    public static class Example {

        @JsonProperty("id")
        private Integer id;
        @JsonProperty("title")
        private String title;
        @JsonProperty("slug")
        private String slug;
        @JsonProperty("price")
        private Integer price;
        @JsonProperty("description")
        private String description;
        @JsonProperty("category")
        private Category category;
        @JsonProperty("images")
        private List<String> images;
        @JsonProperty("creationAt")
        private String creationAt;
        @JsonProperty("updatedAt")
        private String updatedAt;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

        @JsonProperty("id")
        public Integer getId() {
            return id;
        }

        @JsonProperty("id")
        public void setId(Integer id) {
            this.id = id;
        }

        @JsonProperty("title")
        public String getTitle() {
            return title;
        }

        @JsonProperty("title")
        public void setTitle(String title) {
            this.title = title;
        }

        @JsonProperty("slug")
        public String getSlug() {
            return slug;
        }

        @JsonProperty("slug")
        public void setSlug(String slug) {
            this.slug = slug;
        }

        @JsonProperty("price")
        public Integer getPrice() {
            return price;
        }

        @JsonProperty("price")
        public void setPrice(Integer price) {
            this.price = price;
        }

        @JsonProperty("description")
        public String getDescription() {
            return description;
        }

        @JsonProperty("description")
        public void setDescription(String description) {
            this.description = description;
        }

        @JsonProperty("category")
        public Category getCategory() {
            return category;
        }

        @JsonProperty("category")
        public void setCategory(Category category) {
            this.category = category;
        }

        @JsonProperty("images")
        public List<String> getImages() {
            return images;
        }

        @JsonProperty("images")
        public void setImages(List<String> images) {
            this.images = images;
        }

        @JsonProperty("creationAt")
        public String getCreationAt() {
            return creationAt;
        }

        @JsonProperty("creationAt")
        public void setCreationAt(String creationAt) {
            this.creationAt = creationAt;
        }

        @JsonProperty("updatedAt")
        public String getUpdatedAt() {
            return updatedAt;
        }

        @JsonProperty("updatedAt")
        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

    }
}
