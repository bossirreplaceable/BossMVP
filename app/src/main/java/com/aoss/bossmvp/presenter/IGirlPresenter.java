package com.aoss.bossmvp.presenter;

import android.widget.BaseAdapter;

import com.aoss.bossmvp.model.IGirlModel;
import com.aoss.bossmvp.model.MyModel;
import com.aoss.bossmvp.view.IGirls;

import java.lang.ref.WeakReference;
import java.util.List;

/**
 * Created by YoBo on 2017/11/6.
 */

public class IGirlPresenter<T extends IGirls> extends BasePresenter<T> {


    //1.view层的引用
    //private IGirls girlView;
    //2.model层的引用
    private IGirlModel girlModel = new MyModel();

    //3.获取view引用的构造函数
    public IGirlPresenter() {
    }


    //4.执行业务逻辑方法
    public void fetch() {

        if (mWeakView.get() != null) {
            mWeakView.get().showLoading();
            if (girlModel != null) {

                girlModel.loadGirls(new IGirlModel.GirlsLoadListener() {

                    @Override
                    public void onComplete(List<String> girls) {
                        if (mWeakView.get() != null) {
                            mWeakView.get().showDataList(girls);
                        }
                    }
                });

            }

        }


    }


}
