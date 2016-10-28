package com.gavin.base;


import android.app.Activity;
import android.os.Bundle;

/**
 * Created by gavin on 16/10/26.
 */

public abstract class BaseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        initVabribles();
        initViews();
        loadData();
        
        
    }

    protected abstract void initVabribles();
    protected abstract void initViews();
    protected abstract void loadData();
}
