package com.qcloud.frametest.model;

import android.graphics.drawable.Drawable;

import java.net.URL;

/**
 * 接口说明：mine页面的callback
 * Author: Smoker
 * Date: 2018/7/11 15:23
 */
public interface IMineCallback {
    void getPicture(Drawable params);
    void getData(String params);
    void getUrl(String url);
}
