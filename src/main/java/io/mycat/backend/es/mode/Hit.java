package io.mycat.backend.es.mode;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "_index",
        "_type",
        "_id",
        "_score",
        "_source"
})
public class Hit implements Serializable {

    @JsonProperty("_index")
    private String index;
    @JsonProperty("_type")
    private String type;
    @JsonProperty("_id")
    private String id;
    @JsonProperty("_score")
    private Long score;
    @JsonProperty("_source")
    private ObjectNode source;

    private final static long serialVersionUID = 7875152997572595360L;

    @JsonProperty("_index")
    public String getIndex() {
        return index;
    }

    @JsonProperty("_index")
    public void setIndex(String index) {
        this.index = index;
    }

    public Hit withIndex(String index) {
        this.index = index;
        return this;
    }

    @JsonProperty("_type")
    public String getType() {
        return type;
    }

    @JsonProperty("_type")
    public void setType(String type) {
        this.type = type;
    }

    public Hit withType(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("_id")
    public String getId() {
        return id;
    }

    @JsonProperty("_id")
    public void setId(String id) {
        this.id = id;
    }

    public Hit withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("_score")
    public Long getScore() {
        return score;
    }

    @JsonProperty("_score")
    public void setScore(Long score) {
        this.score = score;
    }

    public Hit withScore(Long score) {
        this.score = score;
        return this;
    }

    @JsonProperty("_source")
    public ObjectNode getSource() {
        return source;
    }

    @JsonProperty("_source")
    public void setSource(ObjectNode source) {
        this.source = source;
    }

    public Hit withSource(ObjectNode source) {
        this.source = source;
        return this;
    }

}

