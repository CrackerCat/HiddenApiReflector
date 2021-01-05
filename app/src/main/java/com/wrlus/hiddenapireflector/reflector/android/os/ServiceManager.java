package com.wrlus.hiddenapireflector.reflector.android.os;

import android.os.IBinder;
import android.util.Log;

import java.lang.reflect.Method;

public class ServiceManager {

    private static final String TAG = "ServiceManager";

    /**
     * frameworks/base/core/java/android/os/ServiceManager.java
     * public static IBinder getService(String name);
     *
     * Returns a reference to a service with the given name.
     *
     * @param name the name of the service to get
     * @return a reference to the service, or <code>null</code> if the service doesn't exist
     */
    public static IBinder getService(String name) {
        try {
            Method method = Class.forName("android.os.ServiceManager")
                    .getDeclaredMethod("getService", String.class);
            Log.d(TAG, "Invoke ServiceManager.getService("+name+")");
            return (IBinder) method.invoke(null, name);
        } catch (ReflectiveOperationException e) {
            e.printStackTrace();
        }
        return null;
    }
}