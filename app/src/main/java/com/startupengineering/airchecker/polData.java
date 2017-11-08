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
    private float hasel_value;
    private float esche_value;
    private float erle_value;
    private float birke_value;
    private float suesgraeser_value;
    private float roggen_value;
    private float beifuss_value;
    private float ambrosia_value;

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

    public float getHasel() { return hasel_value; }
    public float getEsche() { return esche_value; }
    public float getErle() { return erle_value; }
    public float getBirke() { return birke_value; }
    public float getSuesgraeser() { return suesgraeser_value; }
    public float getRoggen() { return roggen_value; }
    public float getBeifuss() { return beifuss_value; }
    public float getAmbrosia() { return ambrosia_value; }

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
        hasel_value = r.nextFloat() * 10;
        esche_value = r.nextFloat() * 10;
        erle_value = r.nextFloat() * 10;
        birke_value = r.nextFloat() * 10;
        suesgraeser_value = r.nextFloat() * 10;
        roggen_value = r.nextFloat() * 10;
        beifuss_value = r.nextFloat() * 10;
        ambrosia_value = r.nextFloat() * 10;

        last_refresh = System.currentTimeMillis();
    }
}
