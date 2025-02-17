package com.kakaotech.team25

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate
import com.amazonaws.mobileconnectors.s3.transferutility.TransferNetworkLossHandler
import com.kakao.sdk.common.KakaoSdk
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        initializeKakaoSdk()
        initializeTransferNetworkLossHandler()
        setLightMode()
    }

    private fun setLightMode() {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
    }

    private fun initializeKakaoSdk() {
        KakaoSdk.init(this, BuildConfig.KAKAO_API_KEY)
    }

    private fun initializeTransferNetworkLossHandler() {
        TransferNetworkLossHandler.getInstance(this)
    }
}
