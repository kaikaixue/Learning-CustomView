package com.xk.customview.activity;

import android.os.Bundle;

import com.xk.customview.R;

/**
 * Created by xuekai on 2017/2/20.
 */

public class RevealDrawableActivityView extends ViewBaseActivity {
    private int progress = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reveal_drawable);
    }
}
