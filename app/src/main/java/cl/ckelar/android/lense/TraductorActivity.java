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

public class TraductorActivity extends AppCompatActivity {

    private TextView mTextMessage;
    private final String TAG = this.getClass().getName();

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    try {
                        Intent homeIntent = new Intent(TraductorActivity.this, MainActivity.class);
                        startActivity(homeIntent);
                        finish();
                    } catch (Exception e) {
                        Log.e(TAG, e.toString());
                    }
                    return true;
                case R.id.navigation_translate:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_download:
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
        setContentView(R.layout.activity_traductor);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setSelectedItemId(R.id.navigation_translate);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
