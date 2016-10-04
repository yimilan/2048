package com.example.anyel.a2048;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity{

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        goRegisterGamer();
    }

    protected void goRegisterGamer() {
        ImageView logo2048 = (ImageView) findViewById(R.id.logo_2048);
        logo2048.setOnClickListener(new  View.OnClickListener(){
           // @Override
            public void onClick(View v) {
               // Toast.makeText(getBaseContext(),getResources().getString(R.string.texto_prueba),Toast.LENGTH_SHORT).show();
                //out.println("Hola");
                //Snackbar.make(v,getResources().getString(R.string.texto_prueba),Snackbar.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this, RegisterGamer.class);
                startActivity(i);
                finish();
            }
        });
    }


}
