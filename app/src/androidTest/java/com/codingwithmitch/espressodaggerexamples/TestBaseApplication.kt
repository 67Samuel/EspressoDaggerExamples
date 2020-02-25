package com.codingwithmitch.espressodaggerexamples

import com.codingwithmitch.espressodaggerexamples.di.*
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.InternalCoroutinesApi

@ExperimentalCoroutinesApi
@UseExperimental(InternalCoroutinesApi::class)
class TestBaseApplication : BaseApplication(){

    override fun initAppComponent() {
        appComponent = DaggerTestAppComponent.builder()
            .application(this)
            .build()
    }



}










