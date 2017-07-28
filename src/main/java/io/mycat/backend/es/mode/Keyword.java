package io.mycat.backend.es.mode;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "score",
        "keyword"
})
public class Keyword implements Serializable {

    @JsonProperty("score")
    private Double score;
    @JsonProperty("keyword")
    private String keyword;
    private final static long serialVersionUID = 3299299403943668649L;

    @JsonProperty("score")
    public Double getScore() {
        return score;
    }

    @JsonProperty("score")
    public void setScore(Double score) {
        this.score = score;
    }

    public Keyword withScore(Double score) {
        this.score = score;
        return this;
    }

    @JsonProperty("keyword")
    public String getKeyword() {
        return keyword;
    }

    @JsonProperty("keyword")
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Keyword withKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

}

