package com.startupengineering.airchecker;

import java.util.Date;
import java.util.Random;

/**
 * Created by Julian on 08.11.2017.
 */

public class polData {

    private float stickstoffmonoxid_value;
    private float feinstaub_value;
    private float stickstoffdioxid_value;
    private float schwefeldioxid_value;
    private float ozon_value;

    private long last_refresh;

    public float getStickstoffmonoxid() {
        return stickstoffmonoxid_value;
    }

    public float getFeinstaub() {
        return feinstaub_value;
    }

    public float getStickstoffdioxid() {
        return stickstoffdioxid_value;
    }

    public float getSchwefeldioxid() {
        return schwefeldioxid_value;
    }

    public float getOzon() {
        return ozon_value;
    }

    public String getLastRefreshDate() {
        Date refreshDate = new Date(last_refresh);

        //int day = refreshDate.getDay();
        //int month = refreshDate.getMonth();
        //int year = refreshDate.getYear();
        int hours = refreshDate.getHours();
        int minutes = refreshDate.getMinutes();
        int seconds = refreshDate.getSeconds();

        return Integer.toString(hours) + ":" + Integer.toString(minutes);
    }

    public void refreshData() {
        Random r = new Random(System.currentTimeMillis());

        stickstoffmonoxid_value = r.nextFloat() * 10;
        feinstaub_value = r.nextFloat() * 10;
        stickstoffdioxid_value = r.nextFloat() * 10;
        schwefeldioxid_value = r.nextFloat() * 10;
        ozon_value = r.nextFloat() * 10;

        last_refresh = System.currentTimeMillis();
    }
}
