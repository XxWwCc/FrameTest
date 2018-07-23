package com.qcloud.frametest.ui.mine.widget;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import com.qcloud.frametest.R;
import com.qcloud.frametest.adapter.RecycleViewAdapter;
import com.qcloud.frametest.beans.TestBean;
import com.qcloud.frametest.ui.mine.presenter.MyFollowPresenter;
import com.qcloud.frametest.ui.mine.view.IMyFollowView;
import java.util.ArrayList;
import java.util.List;
/**
 * 类说明：我的关注
 * Author: Smoker
 * Date: 2018/7/11 15:33
 */
public class MyFollowActivity extends AppCompatActivity implements IMyFollowView,View.OnClickListener {

    private Button btnback;
    private RecyclerView listitem_myfollow;
    private LinearLayoutManager layoutManager;
    private RecycleViewAdapter adapter;
    private Drawable[] sex;
    private String[] name,buttonText,sign;
    private int[] icon,buttonBackground;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_myfollow);
        initView();
        listitem_myfollow.setAdapter(adapter);
    }
    //初始化各控件
    private void initView() {
        btnback = findViewById(R.id.btn_back);
        btnback.setOnClickListener(this);
        listitem_myfollow = findViewById(R.id.list_item_myfollow);
        MyFollowPresenter presenter = new MyFollowPresenter();
        presenter.attachView(this,MyFollowActivity.this);
        presenter.getData();
        layoutManager = new LinearLayoutManager(this);
        listitem_myfollow.setLayoutManager(layoutManager);
        adapter = new RecycleViewAdapter(this, initData());
    }
    //获取UI控件需要的数据
    private List<TestBean> initData() {
        List<TestBean> list = new ArrayList<>();
        for (int i=0;i < 8;i++) {
            TestBean bean = new TestBean();
            bean.setAccountIcon(icon[i]);
            bean.setAccountName(name[i]);
            bean.setAccountSex(sex[i]);
            bean.setAccountSign(sign[i]);
            bean.setBtnbackgroud(buttonBackground[i]);
            bean.setBtntext(buttonText[i]);
            list.add(bean);
        }
        return list;
    }

    @Override
    public void onClick(View view) {
        setResult(10);
        finish();
    }

    @Override//调用presenter的方法获取数据
    public void getData(int[] ic, Drawable[] se, String[] na, String[] si, String[] bText, int[] bBackground) {
        icon = ic;
        sex = se;
        name = na;
        sign = si;
        buttonText = bText;
        buttonBackground = bBackground;
    }
}
