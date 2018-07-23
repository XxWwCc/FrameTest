package com.qcloud.frametest.ui.main.widget;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import com.qcloud.frametest.R;
import com.qcloud.frametest.adapter.TestRVAdapter;
import com.qcloud.frametest.beans.TestBean;
import com.qcloud.frametest.ui.home.widget.Fragmenthome;
import com.qcloud.frametest.ui.main.presenter.BottomPresenter;
import com.qcloud.frametest.ui.main.view.IBottomView;
import com.qcloud.frametest.ui.mine.widget.Fragmentmine;
import com.qcloud.frametest.ui.room.widget.Fragmentbroadcastlive;

import java.util.ArrayList;

/**
 * 类说明：主页面
 * Author: Smoker
 * Date: 2018/7/11 15:23
 */
public class MainActivity extends AppCompatActivity implements IBottomView,View.OnClickListener{

    private Fragmentbroadcastlive fragment_b;
    private Fragmenthome fragment_h;
    private Fragmentmine fragment_m;
    private Button btnhome,btnmine,btnbroadcast;
    private TextView tvtitle_text;
    private FragmentManager fragmentManager;
    private FragmentTransaction transaction;
    private BottomPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        initView();
    }
    //初始化
    private void initView() {
        //初始化presenter
        presenter = new BottomPresenter();
        presenter.attachView(this);

        fragmentManager = getSupportFragmentManager();
        transaction = fragmentManager.beginTransaction();
        tvtitle_text = findViewById(R.id.tv_title_text);
        btnhome = findViewById(R.id.btn_home);
        btnbroadcast = findViewById(R.id.btn_broadcast);
        btnmine = findViewById(R.id.btn_mine);

        showHomeFragment();
        presenter.getPicture(btnhome);

        btnmine.setOnClickListener(this);
        btnbroadcast.setOnClickListener(this);
        btnhome.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        restartButton();
        switch (view.getId()){
            case R.id.btn_home:
                showHomeFragment();
                break;
            case R.id.btn_broadcast:
                showBroadcastFragment();
                break;
            case R.id.btn_mine:
                showMineFragment();
        }
    }
    //主页
    @Override
    public void showHomeFragment() {
        presenter.getPicture(btnhome);
        transaction = fragmentManager.beginTransaction();
        hideAllFragment(transaction);
        if (fragment_h == null){
            fragment_h = new Fragmenthome();
            transaction.add(R.id.FL_main_content,fragment_h);
        }else {
            transaction.show(fragment_h);
        }
        transaction.commitAllowingStateLoss();
    }
    //我的
    @Override
    public void showMineFragment() {
        presenter.getPicture(btnmine);
        transaction = fragmentManager.beginTransaction();
        hideAllFragment(transaction);
        if (fragment_m == null) {
            fragment_m = new Fragmentmine();
            transaction.add(R.id.FL_main_content, fragment_m);
        }else {
            transaction.show(fragment_m);
        }
        transaction.commitAllowingStateLoss();
    }
    //直播
    @Override
    public void showBroadcastFragment() {
        presenter.getPicture(btnbroadcast);
        transaction = fragmentManager.beginTransaction();
        hideAllFragment(transaction);
        if (fragment_b == null){
            fragment_b = new Fragmentbroadcastlive();
            transaction.add(R.id.FL_main_content,fragment_b);
        }else {
            transaction.show(fragment_b);
        }
        transaction.commitAllowingStateLoss();
    }
    //改变按钮背景图片
    @Override
    public void changebackground(View btn,Drawable picture) {
        btn.setBackground(picture);
    }

    private void hideAllFragment(FragmentTransaction transaction){
        if (fragment_b!= null){
            transaction.hide(fragment_b);
        }
        if (fragment_h!= null){
            transaction.hide(fragment_h);
        }
        if (fragment_m!= null){
            transaction.hide(fragment_m);
        }
    }
    //重置按钮颜色
    private void restartButton(){
        btnhome.setBackgroundResource(R.drawable.btn_home_normal);
        btnmine.setBackgroundResource(R.drawable.btn_mine);
        btnbroadcast.setBackgroundResource(R.drawable.btn_broadcastlive);
    }

    @Override//用于判断要跳转的哪一个fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == 10){
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            Fragment fragment = new Fragmentmine();
            fragmentTransaction.replace(R.id.main_content,fragment);
            fragmentTransaction.commit();
        }
    }
}
