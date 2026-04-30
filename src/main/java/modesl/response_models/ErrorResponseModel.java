package modesl.response_models;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "path",
        "timestamp",
        "name",
        "message"
})
@Generated("jsonschema2pojo")
public class ErrorResponseModel {

    @JsonProperty("path")
    public String path;
    @JsonProperty("timestamp")
    public String timestamp;
    @JsonProperty("name")
    public String name;
    @JsonProperty("message")
    public String message;

}