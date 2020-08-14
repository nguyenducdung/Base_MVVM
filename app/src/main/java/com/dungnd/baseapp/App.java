package com.dungnd.baseapp;

import android.app.Application;
import android.content.Context;

import com.deploygate.sdk.DeployGate;
import com.dungnd.baseapp.util.Define;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class App extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
        RealmConfiguration realmConfiguration = new RealmConfiguration.Builder()
                .name(Define.REALM_NAME)
                .schemaVersion(0)
                .deleteRealmIfMigrationNeeded()
                .build();
        Realm.setDefaultConfiguration(realmConfiguration);

        // Deploy tool
        DeployGate.install(this);
    }
}
