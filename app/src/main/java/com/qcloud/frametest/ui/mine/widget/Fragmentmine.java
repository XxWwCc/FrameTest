package com.qcloud.frametest.ui.mine.widget;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.qcloud.frametest.R;
import com.qcloud.frametest.ui.mine.presenter.MinePresenter;
import com.qcloud.frametest.ui.mine.view.IMineView;
import com.qcloud.qclib.image.GlideUtil;

/**
 * 类说明：fragment_mine
 * Author: Smoker
 * Date: 2018/7/11 15:32
 */
public class Fragmentmine extends Fragment implements IMineView,View.OnClickListener{

    private ImageView ivmessage_icon,ivmessage_sex,ivmessage_level,ivmessage_vlevel;
    private Button btn_message;
    private TextView tvmessage_name,tvmessage_ID,tvfollow,tvfens,tvmoney_value,tvlevel_value,tvdiamonds_value,tvgift_value,tvqrcode_value;
    private View view;
    MinePresenter minePresenter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_mine,container,false);
        initView();
        initUI();
        return view;
    }
    //初始化控件
    private void initView() {
        minePresenter = new MinePresenter();
        minePresenter.attachView(this,view.getContext());
        ivmessage_icon = view.findViewById(R.id.iv_message_icon);
        ivmessage_sex = view.findViewById(R.id.iv_message_sex);
        ivmessage_level = view.findViewById(R.id.iv_message_level);
        ivmessage_vlevel = view.findViewById(R.id.iv_message_vlevel);
        tvmessage_name = view.findViewById(R.id.tv_message_name);
        tvmessage_ID = view.findViewById(R.id.tv_message_ID);
        tvfollow = view.findViewById(R.id.tv_follow);
        tvfens = view.findViewById(R.id.tv_fens);
        tvmoney_value = view.findViewById(R.id.tv_money_value);
        tvlevel_value = view.findViewById(R.id.tv_level_value);
        tvdiamonds_value = view.findViewById(R.id.tv_diamonds_value);
        tvgift_value = view.findViewById(R.id.tv_gift_value);
        tvqrcode_value = view.findViewById(R.id.tv_qrcode_value);
        btn_message = view.findViewById(R.id.btn_message);
        btn_message.setOnClickListener(this);
    }
    //初始化页面UI
    private void initUI() {
        minePresenter.getData("icon");
        minePresenter.getData("sex");
        minePresenter.getData("tablevel");
        minePresenter.getData("vip");
        minePresenter.getData("username");
        minePresenter.getData("ID");
        minePresenter.getData("follow");
        minePresenter.getData("fens");
        minePresenter.getData("tabmoney");
        minePresenter.getData("level_value");
        minePresenter.getData("tabdiamonds");
        minePresenter.getData("tabgift");
        minePresenter.getData("tabqrcode");
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(getActivity(), MyFollowActivity.class);
        startActivityForResult(intent,1);
    }


    @Override
    public void getIconURL(String iconurl) {
        GlideUtil.loadCircleImage(getContext(),ivmessage_icon,iconurl,R.drawable.icon_no_data,80,80,false,false);
    }

    @Override
    public void showUsername(String username) {
        this.tvmessage_name.setText(username);
    }

    @Override
    public void showId(String id) {
        tvmessage_ID.setText(id);
    }

    @Override
    public void showSexPicture(Drawable sex) {
        this.ivmessage_sex.setImageDrawable(sex);
    }

    @Override
    public void showLevelPicture(Drawable level) {
        this.ivmessage_level.setImageDrawable(level);
    }

    @Override
    public void showVLevelPicture(Drawable picture) {
        ivmessage_vlevel.setImageDrawable(picture);
    }

    @Override
    public void showFollow(String follow) {
        this.tvfollow.setText(follow);
    }

    @Override
    public void showFens(String fens) {
        this.tvfens.setText(fens);
    }

    @Override
    public void showMoney(String money) {
        this.tvmoney_value.setText(money);
    }

    @Override
    public void showLevelValue(String level_value) {
        this.tvlevel_value.setText(level_value);
    }

    @Override
    public void showDiamonds(String diamonds) {
        this.tvdiamonds_value.setText(diamonds);
    }

    @Override
    public void showGift(String gift) {
        this.tvgift_value.setText(gift);
    }

    @Override
    public void showQrCode(String qrcode) {
        this.tvqrcode_value.setText(qrcode);
    }

}