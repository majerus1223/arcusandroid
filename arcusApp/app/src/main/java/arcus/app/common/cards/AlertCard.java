/*
 *  Copyright 2019 Arcus Project.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package arcus.app.common.cards;

import android.content.Context;

import arcus.app.R;


public class AlertCard extends SimpleDividerCard{

    private String deviceId;
    private String name;
    private String triggeredBy;
    private ALARM_SYSTEM alarm_system;

    public enum ALARM_SYSTEM{
        SAFETY,
        SECURITY
    }

    public final static String TAG = "ALERT_CARD";

    public AlertCard(Context context, ALARM_SYSTEM alarm_system) {
        super(context);
        setTag(TAG);
        this.alarm_system = alarm_system;
        showDivider();
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTriggeredBy() {
        return triggeredBy;
    }

    public void setTriggeredBy(String triggeredBy) {
        this.triggeredBy = triggeredBy;
    }

    public ALARM_SYSTEM getAlarm_system() {
        return alarm_system;
    }

    @Override
    public int getLayout(){
        return R.layout.dashboard_subsystem_alert;
    }
}
