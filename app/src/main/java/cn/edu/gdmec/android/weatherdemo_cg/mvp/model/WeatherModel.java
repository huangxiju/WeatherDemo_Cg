package cn.edu.gdmec.android.weatherdemo_cg.mvp.model;

import cn.edu.gdmec.android.weatherdemo_cg.mvp.WeatherBean;
import cn.edu.gdmec.android.weatherdemo_cg.mvp.utils.OkHttpUtils;

/**
 * Created by apple on 18/5/15.
 */

public class WeatherModel implements IWeatherModel{
    @Override
    public void loadWeather(String url, final ILoadListener loadListener) {
        OkHttpUtils.ResultCallback resultCallback = new OkHttpUtils.ResultCallback() {
            @Override
            public void getWeather(WeatherBean weatherBean) {
                loadListener.onSuccess(weatherBean);
            }

            @Override
            public void onFailure(Exception e) {
                loadListener.onFailure(e);
            }
        };
        OkHttpUtils.getResultCallback(url,resultCallback);
    }
}

