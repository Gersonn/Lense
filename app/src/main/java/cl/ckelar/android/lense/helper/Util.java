package cl.ckelar.android.lense.helper;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;

/**
 * Created by gedi on 27-04-17.
 */

public class Util {

    //get the current version number and name
    public static String getVersionName(Context context) {
        String versionName = "";
        //int versionCode = -1;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            versionName = packageInfo.versionName;
            //versionCode = packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(context.getClass().getName(), e.toString());
        }

        return versionName;

    }

}
