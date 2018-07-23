package com.qcloud.frametest.model;

import android.content.Context;
import com.qcloud.frametest.R;
/**
 * 类说明：mine页面的 model
 * Author: Smoker
 * Date: 2018/7/11 15:24
 */
public class MineModel {
    //获取mine页面的数据
    public static void getData(Context context, String param, IMineCallback callback){
        switch (param){
            case "icon":
                callback.getUrl("http://img1.imgtn.bdimg.com/it/u=4019821913,2416568076&fm=27&gp=0.jpg");
                break;
            case "sex":
                callback.getPicture(context.getResources().getDrawable(R.drawable.tab_female));
                break;
            case "vip":
                callback.getPicture(context.getResources().getDrawable(R.drawable.tab_vlevel));
                break;
            case "tablevel":
                callback.getPicture(context.getResources().getDrawable(R.drawable.tab_st));
                break;
            case "username":
                callback.getData("Macle");
                break;
            case "ID":
                callback.getData("ID:zz1234");
                break;
            case "follow":
                callback.getData("12345");
                break;
            case "fens":
                callback.getData("12345");
                break;
            case "tabmoney":
                callback.getData("¥500");
                break;
            case "level_value":
                callback.getData("钻石");
                break;
            case "tabdiamonds":
                callback.getData("500个");
                break;
            case "tabgift":
                callback.getData("500个");
                break;
            case "tabqrcode":
                callback.getData("ID:zz1234");
                break;
        }
    }
}
