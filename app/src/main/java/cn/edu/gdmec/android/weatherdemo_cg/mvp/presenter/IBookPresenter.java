package cn.edu.gdmec.android.weatherdemo_cg.mvp.presenter;

import cn.edu.gdmec.android.weatherdemo_cg.mvp.BookBean;

/**
 * Created by apple on 18/5/15.
 */

public interface IBookPresenter {
    void onSuccess(BookBean bookBean);

    void onFailure(Exception e);

    void loadBook(String bookName);
}
