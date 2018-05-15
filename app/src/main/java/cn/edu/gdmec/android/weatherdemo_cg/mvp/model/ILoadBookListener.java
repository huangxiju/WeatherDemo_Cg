package cn.edu.gdmec.android.weatherdemo_cg.mvp.model;

import cn.edu.gdmec.android.weatherdemo_cg.mvp.BookBean;

import cn.edu.gdmec.android.weatherdemo_cg.mvp.WeatherBean;
/**
 * Created by apple on 18/5/15.
 */

public interface ILoadBookListener {
    void onSuccess(BookBean bookBean);

    void onFailure(Exception e);
}
