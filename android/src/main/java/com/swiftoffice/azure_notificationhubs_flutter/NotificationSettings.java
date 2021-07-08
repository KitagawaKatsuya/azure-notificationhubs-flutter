package com.swiftoffice.azure_notificationhubs_flutter;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

public class NotificationSettings {
    private String HubName;
    private String HubConnectionString;
    private String HubTag;

    public NotificationSettings(Context context) {
        try {
            ApplicationInfo app = context.getPackageManager().getApplicationInfo(context.getPackageName(),
                    PackageManager.GET_META_DATA);
            Bundle bundle = app.metaData;
            HubName = bundle.getString("NotificationHubName");
            HubConnectionString = bundle.getString("NotificationHubConnectionString");
            HubTag = bundle.getString("HubTag");
        } catch (PackageManager.NameNotFoundException e) {
        }
    }

    public String getHubName() {
        return HubName;
    }

    public String getHubConnectionString() {
        return HubConnectionString;
    }

    public String getHubTag() {
        return HubTag;
    }

}