package com.polo.leire.tipcalc;

import android.app.Application;

/**
 * Created by leire.polo on 21/7/16.
 */
public class TipCalcClass extends Application{
    private final static String ABOUT_URL= "http://www.google.es";

    public String getAboutUrl(){
        return ABOUT_URL;
    }


}
