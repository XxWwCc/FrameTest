package com.qcloud.frametest.ui.main.view;

import android.graphics.drawable.Drawable;
import android.view.View;
/**
 * 接口说明：主页面的Bottom view
 * Author: Smoker
 * Date: 2018/7/11 15:23
 */
public interface IBottomView {
    void showHomeFragment();
    void showBroadcastFragment();
    void showMineFragment();
    void changebackground(View params, Drawable picture);
}
