package cl.ckelar.android.lense.helper;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;

/**
 * Clase con métodos auxiliares
 * @author Gerson Díaz
 * @version 1.0
 * Creado el 27/04/2017
 */
public class Util {

    /**
     * Obtiene el nombre de la versión actual de la app
     * @see Context
     * @param context
     * @return Retorna el nombre de la versión actual de la app
     * **/
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

    /**
     * Separa una cadena en caracteres
     * @param text
     * @return Retorna un array con los caracteres del texto introducido
     * **/
    public static String[] stringToCharacterArray(String text) {

        String res[] = new String[text.length()];

        int i = 0;
        for (char ch: text.toCharArray()) {
            if (!ValidatorUtil.isLettersOnly(Character.toString(ch))) {
                Log.e("Util", Character.toString(ch) + " No es una letra");
                res[i++] = "";
            } else {
                res[i++] = Character.toString(ch);
            }
            //res[i++] = Character.toString(ch);
        }

        return res;

    }

    /**
     * Genera una cadena de texto a partir de un array de caracteres
     * @param charArray
     * @return Retorna una cadena de texto
     * **/
    public static String characterArrayToString(String[] charArray) {
        StringBuilder builder = new StringBuilder();
        for(String s : charArray) {
            builder.append(s);
        }
        return builder.toString();
    }

}
