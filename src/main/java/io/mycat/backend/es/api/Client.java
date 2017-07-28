package io.mycat.backend.es.api;


import com.fasterxml.jackson.databind.node.ObjectNode;
import io.mycat.backend.es.mode.Result;
import retrofit2.Call;
import retrofit2.http.*;

public interface Client {

    @POST("/_sql")
    Call<Result> search(@Query("sql") String sql);

    @GET
    Call<ObjectNode> showMapping(@Url String url);

}
