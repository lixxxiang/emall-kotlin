package com.emall.usercenter.presenter

import com.emall.base.presenter.BasePresenter
import com.emall.usercenter.presenter.view.RegisterView

/**
 * Created by 刘晓 on 2018/6/6.
 */
class RegisterPresenter : BasePresenter<RegisterView>(){
    fun test(){
        mView.onTestResult()
    }
}