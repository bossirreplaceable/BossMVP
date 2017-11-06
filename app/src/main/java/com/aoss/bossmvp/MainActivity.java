package com.aoss.bossmvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.aoss.bossmvp.presenter.IGirlPresenter;
import com.aoss.bossmvp.view.IGirls;

import java.util.List;

public class MainActivity extends BaseActivity<IGirls, IGirlPresenter<IGirls>> implements IGirls {


    RecyclerView mRcler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        presenter.fetch();
    }

    @Override
    protected IGirlPresenter<IGirls> createPresenter() {
        return new IGirlPresenter();
    }

    private void initView() {
        mRcler = findViewById(R.id.main_recler);
        GridLayoutManager layoutManager = new GridLayoutManager(this, 4, LinearLayoutManager.HORIZONTAL, false);
        mRcler.setLayoutManager(layoutManager);
    }

    @Override
    public void showLoading() {

        Toast.makeText(this, "获取图片成功", Toast.LENGTH_SHORT).show();
    }


    @Override
    public void showDataList(List<String> dataList) {
        MvpAdapter adapter = new MvpAdapter(this, dataList);
        mRcler.setAdapter(adapter);
    }
}
