package com.qcloud.frametest.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.qcloud.frametest.R;
import com.qcloud.frametest.beans.TestBean;
import com.qcloud.qclib.image.GlideUtil;

import java.util.List;
/**
 * 类说明：RecyclerView 适配器
 * Author: Smoker
 * Date: 2018/7/11 15:20
 */
public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.myViewHolder> {

    private Context mcontext;
    private List<TestBean> data;
    //RecycleViewAdapter 的构造方法
    public RecycleViewAdapter(Context context,List<TestBean> data){
        this.mcontext = context;
        this.data = data;
    }
    @Override//为item创建视图
    public RecycleViewAdapter.myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mcontext).inflate(R.layout.item_of_myfollow,parent,false);
        myViewHolder holder = new myViewHolder(view);
        return holder;
    }

    @Override//将数据绑定到item中
    public void onBindViewHolder(RecycleViewAdapter.myViewHolder holder, int position) {
        TestBean bean = data.get(position);
        holder.tvaccount_name.setText(bean.getAccountName());
//        holder.ivaccount_icon
//        GlideUtil.loadCircleImage(mcontext,holder.ivaccount_icon,bean.getAccountIcon(),R.drawable.icon_no_data,80,80,false,false);
        GlideUtil.loadImageForRes(mcontext,holder.ivaccount_icon,bean.getAccountIcon(),R.drawable.icon_no_data,80,80,false,false);

        holder.ivaccount_sex.setImageDrawable(bean.getAccountSex());
        holder.tvaccount_sign.setText(bean.getAccountSign());
        holder.btnaccount_follow.setText(bean.getBtntext());
        holder.btnaccount_follow.setBackground(mcontext.getResources().getDrawable(bean.getBtnbackgroud()));
    }

    @Override//数据list的长度
    public int getItemCount() {
        return data.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder {
        ImageView ivaccount_icon,ivaccount_sex;
        TextView tvaccount_name,tvaccount_sign;
        Button btnaccount_follow;
        public myViewHolder(View itemView) {
            super(itemView);
            ivaccount_icon = itemView.findViewById(R.id.iv_account_icon);
            ivaccount_sex = itemView.findViewById(R.id.iv_account_sex);
            tvaccount_name = itemView.findViewById(R.id.tv_account_name);
            tvaccount_sign = itemView.findViewById(R.id.tv_account_sign);
            btnaccount_follow = itemView.findViewById(R.id.btn_account_follow);
        }
    }
}
