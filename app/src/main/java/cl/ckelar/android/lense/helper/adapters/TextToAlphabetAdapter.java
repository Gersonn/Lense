package cl.ckelar.android.lense.helper.adapters;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.io.InputStream;

import cl.ckelar.android.lense.R;
import cl.ckelar.android.lense.dto.AlfabetoSenias;
import cl.ckelar.android.lense.helper.Util;

/**
 * Clase con métodos auxiliares
 * @author Gerson Díaz
 * @version 1.0
 * Creado el 02/05/2017
 */
public class TextToAlphabetAdapter extends BaseAdapter {

    private final String TAG = this.getClass().getName();
    private Context context;
    private String[] arrayData;

    public TextToAlphabetAdapter(Context context, String[] arrayData) {
        this.context = context;
        this.arrayData = arrayData;
    }

    @Override
    public int getCount() {
        //return 0;
        return arrayData.length;
    }

    @Override
    public Object getItem(int position) {
        //return null;
        return arrayData[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
        //return Long.parseLong(arrayData[position] + "");
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //return null;

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.grid_alfabeto_main, parent, false);
        }

        ImageView imagen = (ImageView) convertView.findViewById(R.id.imagen_letra_alfabeto);

        AssetManager assetManager = context.getAssets();
        Bitmap mIcon = null;
        try {

            //final AlfabetoSenias alfabeto_letra = (AlfabetoSenias) getItem(position);

            //InputStream in = assetManager.open(alfabeto_letra.getImgAssets());
            String alfabeto_letra = (String) getItem(position);

            alfabeto_letra = alfabeto_letra.toLowerCase();
            alfabeto_letra = alfabeto_letra.toLowerCase();
            alfabeto_letra = alfabeto_letra.replace("á", "a");
            alfabeto_letra = alfabeto_letra.replace("é", "e");
            alfabeto_letra = alfabeto_letra.replace("í", "i");
            alfabeto_letra = alfabeto_letra.replace("ó", "o");
            alfabeto_letra = alfabeto_letra.replace("ú", "u");
            alfabeto_letra = alfabeto_letra.replace("ñ", "enie");
            alfabeto_letra = alfabeto_letra.replace(" ", "_");

            Log.d(TAG, "La letra encontrada es: " + alfabeto_letra);

            String path = "alfabeto/" + alfabeto_letra + ".png";

            InputStream in = assetManager.open(path);
            mIcon = BitmapFactory.decodeStream(in);
        } catch (Exception e) {
            Log.e(TAG, e.getMessage());
            mIcon = null;
        }

        if (mIcon != null)
            imagen.setImageBitmap(mIcon);

        return convertView;

    }


}
