package cn.edu.gdmec.android.weatherdemo_cg.mvp.model;

/**
 * Created by apple on 18/5/15.
 */

public interface IWeatherModel {
    void loadWeather(String url,ILoadListener loadListener);
}
