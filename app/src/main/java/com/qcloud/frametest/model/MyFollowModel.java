package com.qcloud.frametest.model;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.qcloud.frametest.R;
/**
 * 类说明：我的关注 页面的 model
 * Author: Smoker
 * Date: 2018/7/11 15:23
 */
public class MyFollowModel {
    //获取我的关注页面的数据
    public static void getData(Context context, IMyFollowCallback callback){
        String[] name = {"Jack","沫沫猪","李先森","Macle","Jun","Jane","Richard","Jennifer"};
        String[] sign = {"个性签名","新人直播,开心就好","不想当网红的主播不是好主播!",
                "来快活","我想一直唱","铲屎官日常","谁丑谁知道","就是这个范"};
        String[] buttonText = {"取消关注","取消关注","关注","取消关注","关注","关注","取消关注","关注"};
        /*String[] icon = {"http://img1.imgtn.bdimg.com/it/u=1784724263,4284481848&fm=27&gp=0.jpg",
                "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1531388898642&di=102d146639236412d3281e47af367fd0&imgtype=0&src=http%3A%2F%2Fs14.sinaimg.cn%2Fbmiddle%2F61c55fa3t8e4afa5d835d%26690",
                "http://qq.xiawo.net/upFiles/infoImg/coll/20141027/OT20141027090044714.jpg",
                "http://image.tianjimedia.com/uploadImages/upload/20140811/vwvmrtjqromjpg.jpg",
                "http://img5.duitang.com/uploads/item/201512/15/20151215203146_nSXMH.thumb.224_0.jpeg",
                "https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=3703501882,1069854948&fm=27&gp=0.jpg",
                "http://img5.imgtn.bdimg.com/it/u=1066741163,3759572266&fm=27&gp=0.jpg",
                "http://www.wzfzl.cn/uploads/allimg/170124/121KC216-0.jpg"};*/
        int[] icon = {R.drawable.icon1, R.drawable.icon2, R.drawable.icon3, R.drawable.icon4,
                R.drawable.icon5, R.drawable.icon6, R.drawable.icon7, R.drawable.icon8};
        Drawable[] sex = {context.getResources().getDrawable(R.drawable.tab_male),
                context.getResources().getDrawable(R.drawable.tab_female),
                context.getResources().getDrawable(R.drawable.tab_male),
                context.getResources().getDrawable(R.drawable.tab_male),
                context.getResources().getDrawable(R.drawable.tab_male),
                context.getResources().getDrawable(R.drawable.tab_female),
                context.getResources().getDrawable(R.drawable.tab_male),
                context.getResources().getDrawable(R.drawable.tab_female)};
        int[] buttonBackground = {R.drawable.btn_pressed, R.drawable.btn_pressed, R.drawable.btn_normal,
                R.drawable.btn_pressed,
                R.drawable.btn_normal,
                R.drawable.btn_normal,
                R.drawable.btn_pressed,
                R.drawable.btn_normal};
        callback.getData(icon,sex,name,sign,buttonText,buttonBackground);
    }
}
