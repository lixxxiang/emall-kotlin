package com.emall.usercenter.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.emall.base.ui.activity.BaseMvpActivity

import com.emall.usercenter.R
import com.emall.usercenter.presenter.RegisterPresenter
import com.emall.usercenter.presenter.view.RegisterView
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : BaseMvpActivity<RegisterPresenter>(),RegisterView  {
    override fun onTestResult() {
        println("ddd")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        mPresenter = RegisterPresenter()
        mPresenter.mView = this
        btn.setOnClickListener{
            mPresenter.test()
        }
    }
}
