package cn.edu.gdmec.android.weatherdemo_cg.mvp.View;

import cn.edu.gdmec.android.weatherdemo_cg.mvp.WeatherBean;

/**
 * Created by apple on 18/5/15.
 */

public interface IWeatherView {
    void showProgress();
    void hideProgress();
    void showWeatherData(WeatherBean weatherBean);
    void showLoadFailMsg(Exception e);
}
