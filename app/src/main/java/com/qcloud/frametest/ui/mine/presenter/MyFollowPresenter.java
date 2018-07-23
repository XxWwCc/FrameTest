package com.qcloud.frametest.ui.mine.presenter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.qcloud.frametest.model.IMyFollowCallback;
import com.qcloud.frametest.model.MyFollowModel;
import com.qcloud.frametest.ui.mine.view.IMyFollowView;
/**
 * 类说明：我的关注 页面的presenter
 * Author: Smoker
 * Date: 2018/7/11 15:29
 */
public class MyFollowPresenter {
    private IMyFollowView mView;
    private int[] icon,buttonBackground;
    private Drawable[] sex;
    private String[] name,buttonText,sign;
    private Context context;
    //构造方法
    public void MyFollowPresenter(){

    }
    //获取需要数据的activity
    public void attachView(IMyFollowView view, Context context){
        this.mView = view;
        this.context = context;
    }

    public void getData() {

        MyFollowModel.getData(context,  new IMyFollowCallback() {
            @Override
            public void getData(int[] ic, Drawable[] se, String[] na, String[] si, String[] bText, int[] bBackground) {
                icon = ic;
                sex = se;
                name = na;
                sign = si;
                buttonText = bText;
                buttonBackground = bBackground;
            }
        });
        mView.getData(icon,sex,name,sign,buttonText,buttonBackground);
    }

}

