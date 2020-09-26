package com.deuk.daggertemplate03.di

import com.deuk.daggertemplate03.MainActivity
import dagger.Component

@Component(modules = [UserModule::class])
interface AppComponent {

    fun inject(mainActivity: MainActivity)

}