package com.qcloud.frametest.model;

import android.content.Context;
import com.qcloud.frametest.R;
/**
 * 类说明：主页面的BottomModel
 * Author: Smoker
 * Date: 2018/7/11 15:21
 */
public class BottomModel {
    //获取图片数据
    public static void getPicture(Context context, String param, IBottomCallback callback){
        switch (param){
            case "Home":
                callback.getpicture(context.getResources().getDrawable(R.drawable.btn_home_press));
                break;
            case "Mine":
                callback.getpicture(context.getResources().getDrawable(R.drawable.btn_mine_press));
                break;
            case "Broadcast":
                callback.getpicture(context.getResources().getDrawable(R.drawable.btn_broadcastlive));
        }
    }
}
