package com.MaysaSantos.CarterinhaMaysa.app

import android.app.Application
import com.MaysaSantos.CarterinhaMaysa.app.di.AppContainer
import com.MaysaSantos.CarterinhaMaysa.app.di.DefaultAppContainer

class CarteirinhaApplication : Application() {
    val container: AppContainer by lazy {
        DefaultAppContainer()
    }
}