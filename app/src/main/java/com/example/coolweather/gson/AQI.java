package com.example.coolweather.gson;

/**
 * Created by Administrator on 2017/5/29.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
