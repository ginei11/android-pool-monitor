package com.ingidear.poolmonitor.util;

import com.ingidear.poolmonitor.model.statsaddress.Pool;
import com.ingidear.poolmonitor.model.pool.StatExample;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetrofitAPI {

    @GET("stats_address")
    Call<Pool> queryDashboardStats(@Query("address") String address);

    @GET("stats")
    Call<StatExample> queryStats();
}
