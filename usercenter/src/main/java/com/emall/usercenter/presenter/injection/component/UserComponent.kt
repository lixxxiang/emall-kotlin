package com.emall.usercenter.presenter.injection.component

import com.emall.usercenter.presenter.injection.module.UserModule
import com.emall.usercenter.ui.activity.RegisterActivity
import dagger.Component

@Component(modules = arrayOf(UserModule::class))
interface UserComponent {
    fun inject(activity: RegisterActivity)
}