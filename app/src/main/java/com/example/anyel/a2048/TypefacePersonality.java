package com.example.anyel.a2048;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import android.widget.TextView;


/**
 * Created by Anyel on 28/09/2016.
 */

public class TypeFacePersonality  extends TextView  {
   public static Typeface ancreonTitle;
    public static Typeface dowlinkTitle;
    public static Typeface roboTitle;
    public Typeface simkaiTitle;

    public TypeFacePersonality(Context context) {
        super(context);
        myFont();
    }

 public void myFont(){
         ancreonTitle = Typeface.createFromAsset(getContext().getAssets(),"fonts/ANCREON.TTF");
         dowlinkTitle = Typeface.createFromAsset(getContext().getAssets(),"fonts/Downlink.ttf");
         roboTitle = Typeface.createFromAsset(getContext().getAssets(),"fonts/ROBO.ttf");
         simkaiTitle = Typeface.createFromAsset(getContext().getAssets(),"fonts/simkai.ttf");

    }
}
