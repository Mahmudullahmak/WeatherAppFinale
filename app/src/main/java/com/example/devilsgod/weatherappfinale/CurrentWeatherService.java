package com.example.devilsgod.weatherappfinale;

/**
 * Created by Devils God on 1/8/2018.
 */

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;



public interface CurrentWeatherService {
    @GET()
    Call<CurrentWeatherResponse> getCurrentWeatherData(@Url String endUrl);
    @GET()
    Call<ForcastWeatherResponse> getAllForcastData(@Url String endUrl);
}
