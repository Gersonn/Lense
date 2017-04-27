package cl.ckelar.android.lense;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import cl.ckelar.android.lense.helper.Util;

public class CreditosActivity extends AppCompatActivity {

    private final String TAG = this.getClass().getName();

    private TextView txt_version_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creditos);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        txt_version_name = (TextView) findViewById(R.id.txt_version);
        txt_version_name.setText(Util.getVersionName(this));

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }

        return super.onOptionsItemSelected(item);
    }

}
