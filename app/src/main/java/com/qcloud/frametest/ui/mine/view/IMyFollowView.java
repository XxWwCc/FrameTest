package com.qcloud.frametest.ui.mine.view;

import android.graphics.drawable.Drawable;
/**
 * 接口说明：我的关注 页面的view
 * Author: Smoker
 * Date: 2018/7/11 15:31
 */
public interface IMyFollowView {
    void getData(int[] icon,Drawable[] sex,String[] name,String[] sign,String[] buttonText,int[] buttonBackground);
}
