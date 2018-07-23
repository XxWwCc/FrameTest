package com.qcloud.frametest.base;

import android.support.v7.app.AppCompatActivity;
import com.qcloud.qclib.base.BasePresenter;
/**
 * 类说明：BaseActivity
 * Author: Smoker
 * Date: 2018/7/11 15:21
 */
public abstract class BaseActivity<V,T extends BasePresenter<V>> extends AppCompatActivity {

}
