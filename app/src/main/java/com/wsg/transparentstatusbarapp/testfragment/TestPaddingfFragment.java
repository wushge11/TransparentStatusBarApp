package com.wsg.transparentstatusbarapp.testfragment;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import com.wsg.transparentstatusbarapp.R;
import com.wsg.transparentstatusbarapp.base.BaseFragmentV4;
import com.wsg.transparentstatusbarapp.util.StatusBarUtil;


/**
 * TestPaddingfFragment
 * desc:
 * 
 * 
 * Created by wushange on 2016/9/5 16:27.
 */

public class TestPaddingfFragment extends BaseFragmentV4 {

    @Override
    public int bindLayout() {
        return R.layout.fragment_message;
    }

    @Override
    public View bindView() {
        return null;
    }

    @Override
    public void initParms(Bundle parms) {

    }

    @Override
    public void initView(View view) {
        view.setPadding(0, StatusBarUtil.getStatusBarHeight(getContext()),0,0);
    }

    @Override
    public void doBusiness(Context mContext) {
    }

    @Override
    public void lazyInitBusiness(Context mContext) {

    }
}