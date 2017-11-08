package com.startupengineering.airchecker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.Menu;
import android.view.MenuItem;

import com.startupengineering.airchecker.polData;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class DetailedView extends AppCompatActivity {

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.settings:
                // User chose the "Settings" item, show the app settings UI...
                return true;
            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.settings, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_view);

        polData poldata = new polData();
        poldata.refreshData();

        DecimalFormat df = new DecimalFormat("#.#");
        df.setRoundingMode(RoundingMode.CEILING);

        TextView refresh_time = (TextView) findViewById(R.id.last_refresh_val);
        refresh_time.setText(poldata.getLastRefreshDate().toString());

        TextView pollutants1_e1_value = (TextView) findViewById(R.id.pollutants1_e1_val);
        pollutants1_e1_value.setText(df.format(poldata.getStickstoffmonoxid()));

        TextView pollutants1_e2_value = (TextView) findViewById(R.id.pollutants1_e2_val);
        pollutants1_e2_value.setText(df.format(poldata.getFeinstaub()));

        TextView pollutants1_e3_value = (TextView) findViewById(R.id.pollutants1_e3_val);
        pollutants1_e3_value.setText(df.format(poldata.getStickstoffdioxid()));

        TextView pollutants1_e4_value = (TextView) findViewById(R.id.pollutants1_e4_val);
        pollutants1_e4_value.setText(df.format(poldata.getSchwefeldioxid()));

        TextView pollutants1_e5_value = (TextView) findViewById(R.id.pollutants1_e5_val);
        pollutants1_e5_value.setText(df.format(poldata.getOzon()));


        TextView pollutants2_e1_value = (TextView) findViewById(R.id.pollutants2_e1_val);
        pollutants2_e1_value.setText(df.format(poldata.getHasel()));

        TextView pollutants2_e2_value = (TextView) findViewById(R.id.pollutants2_e2_val);
        pollutants2_e2_value.setText(df.format(poldata.getEsche()));

        TextView pollutants2_e3_value = (TextView) findViewById(R.id.pollutants2_e3_val);
        pollutants2_e3_value.setText(df.format(poldata.getErle()));

        TextView pollutants2_e4_value = (TextView) findViewById(R.id.pollutants2_e4_val);
        pollutants2_e4_value.setText(df.format(poldata.getBirke()));

        TextView pollutants2_e5_value = (TextView) findViewById(R.id.pollutants2_e5_val);
        pollutants2_e5_value.setText(df.format(poldata.getSuesgraeser()));

        TextView pollutants2_e6_value = (TextView) findViewById(R.id.pollutants2_e6_val);
        pollutants2_e6_value.setText(df.format(poldata.getRoggen()));

        TextView pollutants2_e7_value = (TextView) findViewById(R.id.pollutants2_e7_val);
        pollutants2_e7_value.setText(df.format(poldata.getBeifuss()));

        TextView pollutants2_e8_value = (TextView) findViewById(R.id.pollutants2_e8_val);
        pollutants2_e8_value.setText(df.format(poldata.getAmbrosia()));
    }
}
