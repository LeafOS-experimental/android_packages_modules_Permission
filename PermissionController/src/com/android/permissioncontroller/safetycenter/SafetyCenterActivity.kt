/*
 * Copyright (C) 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.android.permissioncontroller.safetycenter

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Bundle
import android.widget.TextView

/**
 * Entry-point activity for SafetyCenter.
 */
// TODO(b/200665463): Implement SafetyCenter UI on Android T.
class SafetyCenterActivity : Activity() {

    @SuppressLint("SetTextI18n") // This is just a skeleton for now.
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val safetyCenterText = TextView(this)
        safetyCenterText.text = "SafetyCenter"
        setContentView(safetyCenterText)
    }
}