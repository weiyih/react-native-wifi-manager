
package com.weiyih.rnwifimanager;

import android.content.Context;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.widget.Toast;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

import java.util.List;

public class RNWifiManagerModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private static String MODULE_NAME = "RNWifiManager";

    private static WifiManager wifiManager = null;

    public RNWifiManagerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
        createManager();
    }

    @Override
    public String getName() {
        return MODULE_NAME;
    }

    @ReactMethod
    public void createManager() {
        if (wifiManager == null) {
            wifiManager = (WifiManager) reactContext.getApplicationContext().getSystemService(Context.WIFI_SERVICE);
        }
    }

    @ReactMethod
    public void startScan() {
        wifiManager.startScan();
    }

    @ReactMethod
    public void connect(WifiConfiguration config) {
        wifiManager.addNetwork(config);

    }

    @ReactMethod
    public void disconnect() {
        if (wifiManager.getWifiState() == WifiManager.WIFI_STATE_ENABLED)
            wifiManager.disconnect();
    }


    @ReactMethod
    public void getConfiguredNetworks() {
        List<WifiConfiguration> listWifi = wifiManager.getConfiguredNetworks();
    }


    @ReactMethod
    public void getConnectionInfo() {
        WifiInfo currentWifi = wifiManager.getConnectionInfo();
        Toast.makeText(reactContext, currentWifi.getSSID(),Toast.LENGTH_SHORT).show();
    }
  /*
    TODO - Implement
    BroadcastReceiver
    WifiConfiguration - creation
    ScanResult
    WifiManager - startScan, stopScan
    PermissionCheck - Fix

  */
}