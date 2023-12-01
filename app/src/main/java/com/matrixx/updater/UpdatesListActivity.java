/*
 * Copyright (C) 2017 The LineageOS Project
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
package com.matrixx.updater;

import androidx.appcompat.app.AppCompatActivity;

import com.matrixx.updater.model.UpdateInfo;

public abstract class UpdatesListActivity extends AppCompatActivity {
    public abstract void exportUpdate(UpdateInfo update);
    public abstract void showSnackbar(int stringId, int duration);
}