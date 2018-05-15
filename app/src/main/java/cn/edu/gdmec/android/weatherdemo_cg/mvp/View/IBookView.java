package cn.edu.gdmec.android.weatherdemo_cg.mvp.View;

import cn.edu.gdmec.android.weatherdemo_cg.mvp.BookBean;

/**
 * Created by apple on 18/5/15.
 */

public interface IBookView {
    void showBook(BookBean bookBean);

    void showProgress();

    void hideProgress();

    void showLoadFailMsg(Exception e);

}
