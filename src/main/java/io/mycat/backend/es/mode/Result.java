package io.mycat.backend.es.mode;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "took",
        "timed_out",
        "_shards",
        "hits"
})
public class Result implements Serializable {

    @JsonProperty("took")
    private Long took;
    @JsonProperty("timed_out")
    private Boolean timedOut;
    @JsonProperty("_shards")
    private Shards shards;
    @JsonProperty("hits")
    private Hits hits;

    @JsonProperty("aggregations")
    private ObjectNode aggregations;

    private final static long serialVersionUID = -2762349355281253088L;

    @JsonProperty("took")
    public Long getTook() {
        return took;
    }

    @JsonProperty("took")
    public void setTook(Long took) {
        this.took = took;
    }

    public Result withTook(Long took) {
        this.took = took;
        return this;
    }

    @JsonProperty("timed_out")
    public Boolean getTimedOut() {
        return timedOut;
    }

    @JsonProperty("timed_out")
    public void setTimedOut(Boolean timedOut) {
        this.timedOut = timedOut;
    }

    public Result withTimedOut(Boolean timedOut) {
        this.timedOut = timedOut;
        return this;
    }

    @JsonProperty("_shards")
    public Shards getShards() {
        return shards;
    }

    @JsonProperty("_shards")
    public void setShards(Shards shards) {
        this.shards = shards;
    }

    public Result withShards(Shards shards) {
        this.shards = shards;
        return this;
    }

    @JsonProperty("hits")
    public Hits getHits() {
        return hits;
    }

    @JsonProperty("hits")
    public void setHits(Hits hits) {
        this.hits = hits;
    }

    public Result withHits(Hits hits) {
        this.hits = hits;
        return this;
    }

    public ObjectNode getAggregations() {
        return aggregations;
    }

    public void setAggregations(ObjectNode aggregations) {
        this.aggregations = aggregations;
    }
}

