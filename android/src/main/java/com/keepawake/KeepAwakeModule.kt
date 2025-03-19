package com.keepawake

import android.app.Activity
import android.view.WindowManager
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.module.annotations.ReactModule

@ReactModule(name = KeepAwakeModule.NAME)
class KeepAwakeModule(private val reactContext: ReactApplicationContext) :
    ReactContextBaseJavaModule(reactContext) {

  override fun getName(): String {
    return NAME
  }

  @ReactMethod
  fun activate() {
    val activity = reactContext.currentActivity
    if (activity != null) {
      activity.runOnUiThread {
        activity.window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
      }
    }
  }

  @ReactMethod
  fun deactivate() {
    val activity = reactContext.currentActivity
    if (activity != null) {
      activity.runOnUiThread {
        activity.window.clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
      }
    }
  }

  companion object {
    const val NAME = "KeepAwake"
  }
}
