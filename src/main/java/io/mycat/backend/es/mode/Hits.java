package io.mycat.backend.es.mode;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "total",
        "max_score",
        "hits"
})
public class Hits implements Serializable {

    @JsonProperty("total")
    private Long total;
    @JsonProperty("max_score")
    private Long maxScore;
    @JsonProperty("hits")
    private List<Hit> hits = null;
    private final static long serialVersionUID = 5566890629160086237L;

    @JsonProperty("total")
    public Long getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(Long total) {
        this.total = total;
    }

    public Hits withTotal(Long total) {
        this.total = total;
        return this;
    }

    @JsonProperty("max_score")
    public Long getMaxScore() {
        return maxScore;
    }

    @JsonProperty("max_score")
    public void setMaxScore(Long maxScore) {
        this.maxScore = maxScore;
    }

    public Hits withMaxScore(Long maxScore) {
        this.maxScore = maxScore;
        return this;
    }

    @JsonProperty("hits")
    public List<Hit> getHits() {
        return hits;
    }

    @JsonProperty("hits")
    public void setHits(List<Hit> hits) {
        this.hits = hits;
    }

    public Hits withHits(List<Hit> hits) {
        this.hits = hits;
        return this;
    }

}

