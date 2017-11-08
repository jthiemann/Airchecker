package com.startupengineering.airchecker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.startupengineering.airchecker.polData;

public class DetailedView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_view);

        polData poldata = new polData();
        poldata.refreshData();

        TextView refresh_time = (TextView) findViewById(R.id.last_refresh_val);
        refresh_time.setText(poldata.getLastRefreshDate().toString());

        TextView pollutants1_e1_value = (TextView) findViewById(R.id.pollutants1_e1_val);
        pollutants1_e1_value.setText(Float.toString(poldata.getStickstoffmonoxid()));

        TextView pollutants1_e2_value = (TextView) findViewById(R.id.pollutants1_e2_val);
        pollutants1_e2_value.setText(Float.toString(poldata.getFeinstaub()));

        TextView pollutants1_e3_value = (TextView) findViewById(R.id.pollutants1_e3_val);
        pollutants1_e3_value.setText(Float.toString(poldata.getStickstoffdioxid()));

        TextView pollutants1_e4_value = (TextView) findViewById(R.id.pollutants1_e4_val);
        pollutants1_e4_value.setText(Float.toString(poldata.getSchwefeldioxid()));

        TextView pollutants1_e5_value = (TextView) findViewById(R.id.pollutants1_e5_val);
        pollutants1_e5_value.setText(Float.toString(poldata.getOzon()));
    }
}
