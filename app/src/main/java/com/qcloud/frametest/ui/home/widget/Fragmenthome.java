package com.qcloud.frametest.ui.home.widget;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.qcloud.frametest.R;
/**
 * 类说明：fragment_home
 * Author: Smoker
 * Date: 2018/7/11 15:23
 */
public class Fragmenthome extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home,container,false);
    }
}
