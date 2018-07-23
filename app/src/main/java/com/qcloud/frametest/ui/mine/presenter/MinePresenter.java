package com.qcloud.frametest.ui.mine.presenter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.qcloud.frametest.model.IMineCallback;
import com.qcloud.frametest.model.MineModel;
import com.qcloud.frametest.ui.mine.view.IMineView;
/**
 * 类说明：mine页面的presenter
 * Author: Smoker
 * Date: 2018/7/11 15:29
 */
public class MinePresenter {
    private IMineView mView;
    private Drawable drawable;
    private String text = "";
    private Context context;
    private String URL;
    //构造方法
    public void MinePresenter(){

    }
    //获取需要数据的activity
    public void attachView(IMineView view, Context context){
        this.mView = view;
        this.context = context;
    }

    public void getData(String params) {

        MineModel.getData(context, params, new IMineCallback() {
            @Override
            public void getPicture(Drawable picture) {
                drawable = picture;
            }

            @Override
            public void getData(String string) {
                text = string;
            }

            @Override
            public void getUrl(String url) {
                URL = url;
            }
        });
        switch (params){
            case "icon":
                mView.getIconURL(URL);
                break;
            case "sex":
                mView.showSexPicture(drawable);
                break;
            case "vip":
                mView.showVLevelPicture(drawable);
                break;
            case "tablevel":
                mView.showLevelPicture(drawable);
                break;
            case "username":
                mView.showUsername(text);
                break;
            case "ID":
                mView.showId(text);
                break;
            case "follow":
                mView.showFollow(text);
                break;
            case "fens":
                mView.showFens(text);
                break;
            case "tabmoney":
                mView.showMoney(text);
                break;
            case "level_value":
                mView.showLevelValue(text);
                break;
            case "tabdiamonds":
                mView.showDiamonds(text);
                break;
            case "tabgift":
                mView.showGift(text);
                break;
            case "tabqrcode":
                mView.showQrCode(text);
                break;
        }
    }
}
