package cl.ckelar.android.lense;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;
    private final String TAG = this.getClass().getName();

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.nav_bottom_home);
                    return true;
                case R.id.navigation_translate:
                    try {
                        Intent homeIntent = new Intent(MainActivity.this, TraductorActivity.class);
                        startActivity(homeIntent);
                        finish();
                    } catch (Exception e) {
                        Log.e(TAG, e.toString());
                    }
                    return true;
                case R.id.navigation_download:
                    //mTextMessage.setText(R.string.nav_bottom_senias);
                    //return true;
                    try {
                        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(getResources().getString(R.string.url_mineduc_lenguaje_senias)));
                        startActivity(browserIntent);
                    } catch (Exception e) {
                        Log.e(TAG, e.toString());
                    }
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
