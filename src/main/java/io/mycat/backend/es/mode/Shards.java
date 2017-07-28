package io.mycat.backend.es.mode;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "total",
        "successful",
        "failed"
})
public class Shards implements Serializable {

    @JsonProperty("total")
    private Long total;
    @JsonProperty("successful")
    private Long successful;
    @JsonProperty("failed")
    private Long failed;
    private final static long serialVersionUID = 780270946000929404L;

    @JsonProperty("total")
    public Long getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(Long total) {
        this.total = total;
    }

    public Shards withTotal(Long total) {
        this.total = total;
        return this;
    }

    @JsonProperty("successful")
    public Long getSuccessful() {
        return successful;
    }

    @JsonProperty("successful")
    public void setSuccessful(Long successful) {
        this.successful = successful;
    }

    public Shards withSuccessful(Long successful) {
        this.successful = successful;
        return this;
    }

    @JsonProperty("failed")
    public Long getFailed() {
        return failed;
    }

    @JsonProperty("failed")
    public void setFailed(Long failed) {
        this.failed = failed;
    }

    public Shards withFailed(Long failed) {
        this.failed = failed;
        return this;
    }

}

