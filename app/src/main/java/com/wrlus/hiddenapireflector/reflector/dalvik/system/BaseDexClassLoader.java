package com.wrlus.hiddenapireflector.reflector.dalvik.system;

import android.util.Log;

import java.lang.reflect.Field;

/**
 * Base class for common functionality between various dex-based
 * {@link ClassLoader} implementations.
 */
public class BaseDexClassLoader {
    private static final String TAG = "BaseDexClassLoader";

    public static Object getPathList(ClassLoader classLoader) {
        try {
            Field field = Class.forName("dalvik.system.BaseDexClassLoader").getDeclaredField("pathList");
            field.setAccessible(true);
            Log.d(TAG, "Invoke BaseDexClassLoader.getPathList("+classLoader+")");
            return field.get(classLoader);
        } catch (ReflectiveOperationException e) {
            e.printStackTrace();
        }
        return null;
    }
}
