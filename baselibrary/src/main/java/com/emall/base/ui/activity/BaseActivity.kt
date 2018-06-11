package com.emall.base.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.emall.base.common.AppManager
import com.trello.rxlifecycle2.components.support.RxAppCompatActivity

/**
 * Created by 刘晓 on 2018/6/6.
 */
open class BaseActivity: RxAppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppManager.instance.addActivity(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        AppManager.instance.finishActivity(this)
    }
}