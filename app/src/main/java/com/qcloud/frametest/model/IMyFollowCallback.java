package com.qcloud.frametest.model;

import android.graphics.drawable.Drawable;
/**
 * 接口说明：我的关注 页面的 callback
 * Author: Smoker
 * Date: 2018/7/11 15:23
 */
public interface IMyFollowCallback {
    void getData(int[] icon,Drawable[] sex,String[] name,String[] sign,String[] buttonText,int[] buttonBackground);
}
