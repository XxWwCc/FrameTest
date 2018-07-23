package com.qcloud.frametest.ui.mine.view;

import android.graphics.drawable.Drawable;
/**
 * 接口说明：mine页面的view
 * Author: Smoker
 * Date: 2018/7/11 15:31
 */
public interface IMineView {
    void getIconURL(String iconurl);//用户图标
    void showUsername(String username);//用户名
    void showId(String ID);//用户id
    void showSexPicture(Drawable sex);//用户性别
    void showLevelPicture(Drawable level);//用户等级图片
    void showVLevelPicture(Drawable picture);//是否带V
    void showFollow(String follow);//用户关注
    void showFens(String fens);//用户粉丝
    void showMoney(String money);//用户的收益
    void showLevelValue(String level_value);//用户等级
    void showDiamonds(String diamonds);//用户钻石币数
    void showGift(String gift);//用户礼物个数
    void showQrCode(String qrcode);//用户推广码

}
