package com.qcloud.frametest.ui.main.presenter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.qcloud.frametest.R;
import com.qcloud.frametest.model.BottomModel;
import com.qcloud.frametest.model.IBottomCallback;
import com.qcloud.frametest.ui.main.view.IBottomView;
/**
 * 类说明：主页面的Bottom presenter
 * Author: Smoker
 * Date: 2018/7/11 15:23
 */
public class BottomPresenter {
    private IBottomView mView;
    private Drawable drawable;
    public BottomPresenter(){
    }
    //绑定view
    public void attachView(IBottomView view){
        this.mView = view;
    }

    public void getPicture(final View btn){
        String params = "";
        switch (btn.getId()){
            case R.id.btn_home:
                params = "Home";
                break;
            case R.id.btn_mine:
                params = "Mine";
                break;
            case R.id.btn_broadcast:
                params = "Broadcast";
        }
        BottomModel.getPicture((Context) mView,params, new IBottomCallback() {
            @Override
            public void getpicture(Drawable picture) {
                drawable = picture;
                mView.changebackground(btn,drawable);
            }
        });
    }
}
