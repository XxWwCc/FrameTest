package com.qcloud.frametest.beans;

import android.graphics.drawable.Drawable;
/**
 * 类说明：实体类
 * Author: Smoker
 * Date: 2018/7/11 15:21
 */
public class TestBean {
    private String accountName;
    private String accountSign;
    private Drawable accountSex;
    private int accountIcon;
    private String btntext;
    private int btnbackgroud;

    public int getAccountIcon() {
        return accountIcon;
    }

    public void setAccountIcon(int accountIcon) {
        this.accountIcon = accountIcon;
    }

    public Drawable getAccountSex() {
        return accountSex;
    }

    public void setAccountSex(Drawable accountSex) {
        this.accountSex = accountSex;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountSign() {
        return accountSign;
    }

    public void setAccountSign(String accountSign) {
        this.accountSign = accountSign;
    }

    public String getBtntext() {
        return btntext;
    }

    public void setBtntext(String btntext) {
        this.btntext = btntext;
    }

    public int getBtnbackgroud() {
        return btnbackgroud;
    }

    public void setBtnbackgroud(int btnbackgroud) {
        this.btnbackgroud = btnbackgroud;
    }
}
