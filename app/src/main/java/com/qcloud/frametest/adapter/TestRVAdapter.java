package com.qcloud.frametest.adapter;

import android.content.Context;
import com.qcloud.frametest.R;
import com.qcloud.frametest.beans.TestBean;
import com.qcloud.qclib.adapter.recyclerview.BaseViewHolder;
import com.qcloud.qclib.adapter.recyclerview.CommonRecyclerAdapter;
import com.qcloud.qclib.image.GlideUtil;

import java.util.List;

public class TestRVAdapter extends CommonRecyclerAdapter<TestBean> {

    public TestRVAdapter(Context context) {
        super(context);
    }

    @Override
    public int onCreateViewLayoutID(int viewType) {
        return R.layout.item_of_myfollow;
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        TestBean bean = mList.get(position);
        holder.setImageDrawable(R.id.iv_account_icon,mContext.getResources().getDrawable(bean.getAccountIcon()));
        holder.setImageDrawable(R.id.iv_account_sex,bean.getAccountSex());
        holder.setText(R.id.tv_account_name,bean.getAccountName());
        holder.setText(R.id.tv_account_sign,bean.getAccountSign());
        holder.setBackgroundRes(R.id.btn_account_follow,bean.getBtnbackgroud());
        holder.setText(R.id.btn_account_follow,bean.getBtntext());
    }
}
