package com.wrlus.hiddenapireflector.reflector.android.content.pm;

import java.lang.reflect.Method;

public class ApplicationInfo {
    public static boolean isPrivilegedApp(android.content.pm.ApplicationInfo applicationInfo) {
        try {
            Method method = android.content.pm.ApplicationInfo.class
                    .getDeclaredMethod("isPrivilegedApp");
            return (boolean) method.invoke(applicationInfo);
        } catch (ReflectiveOperationException e) {
            e.printStackTrace();
        }
        return false;
    }
}
