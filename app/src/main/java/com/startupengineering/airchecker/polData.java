package com.startupengineering.airchecker;

import java.math.RoundingMode;
import java.text.DecimalFormat;
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

    //TODO: Replace filler variables
    private float graeser_value;
    private float esche_value;
    private float buche_value;
    private float birke_value;
    private float allergy_5;
    private float allergy_6;
    private float allergy_7;

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

    public float getOzon() { return ozon_value; }

    //TODO: Replace filler variables
    public float getGraeser() { return graeser_value; }
    public float getEsche() { return esche_value; }
    public float getBuche() { return buche_value; }
    public float getBirke() { return birke_value; }
    public float getAllergy_5() { return allergy_5; }
    public float getAllergy_6() { return allergy_6; }
    public float getAllergy_7() { return allergy_7; }

    //TODO: add allergy values
    //TODO: add geters for allergy values

    public String getLastRefreshDate() {
        Date refreshDate = new Date(last_refresh);

        //int day = refreshDate.getDay();
        //int month = refreshDate.getMonth();
        //int year = refreshDate.getYear();
        int hours = refreshDate.getHours();
        int minutes = refreshDate.getMinutes();
        int seconds = refreshDate.getSeconds();

        return Integer.toString(hours) + ":" + Integer.toString(minutes) + ":" + Integer.toString(seconds);
    }

    public void refreshData() {
        Random r = new Random(System.currentTimeMillis());

        stickstoffmonoxid_value = r.nextFloat() * 10;
        feinstaub_value = r.nextFloat() * 10;
        stickstoffdioxid_value = r.nextFloat() * 10;
        schwefeldioxid_value = r.nextFloat() * 10;
        ozon_value = r.nextFloat() * 10;

        //TODO: Replace filler variables
        graeser_value = r.nextFloat() * 10;
        esche_value = r.nextFloat() * 10;
        buche_value = r.nextFloat() * 10;
        birke_value = r.nextFloat() * 10;
        allergy_5 = r.nextFloat() * 10;
        allergy_6 = r.nextFloat() * 10;
        allergy_7 = r.nextFloat() * 10;

        last_refresh = System.currentTimeMillis();
    }
}
