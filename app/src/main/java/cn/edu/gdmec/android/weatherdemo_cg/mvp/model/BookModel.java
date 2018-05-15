package cn.edu.gdmec.android.weatherdemo_cg.mvp.model;

import cn.edu.gdmec.android.weatherdemo_cg.mvp.BookBean;
import cn.edu.gdmec.android.weatherdemo_cg.mvp.utils.OkHttpUtils;

/**
 * Created by apple on 18/5/15.
 */

public class BookModel implements IBookModel{


    @Override
    public void loadBook(String url, final ILoadBookListener iLoadBookListener) {
        OkHttpUtils.ResultBookCallback resultBookCallback=new OkHttpUtils.ResultBookCallback() {
            @Override
            public void getBook(BookBean bookBean) {
                iLoadBookListener.onSuccess(bookBean);

            }

            @Override
            public void onFailure(Exception e) {
                iLoadBookListener.onFailure(e);
            }
        };
        OkHttpUtils.getResultBookCallback(url,resultBookCallback);
    }
}
