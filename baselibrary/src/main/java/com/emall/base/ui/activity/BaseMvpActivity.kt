package com.emall.base.ui.activity

import com.emall.base.presenter.BasePresenter
import com.emall.base.presenter.view.BaseView

/**
 * Created by 刘晓 on 2018/6/6.
 */
open class BaseMvpActivity<T: BasePresenter<*>>:BaseActivity(), BaseView {
    override fun showLoading() {

    }

    override fun hideLoading() {
    }

    override fun onError(text: String) {
    }

    lateinit var mPresenter: T

}