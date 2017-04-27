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

/**
 * Created by gedi on 27-04-17.
 */

public class AlfabetoAdapter extends BaseAdapter {

    private final String TAG = this.getClass().getName();
    private Context context;

    public AlfabetoAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        //return 0;
        return AlfabetoSenias.ITEMS.length;
    }

    @Override
    public Object getItem(int position) {
        //return null;
        return AlfabetoSenias.ITEMS[position];
    }

    @Override
    public long getItemId(int position) {
        //return 0;
        return Long.parseLong(AlfabetoSenias.ITEMS[position].getId() + "");
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

            final AlfabetoSenias alfabeto_letra = (AlfabetoSenias) getItem(position);

            InputStream in = assetManager.open(alfabeto_letra.getImgAssets());
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
