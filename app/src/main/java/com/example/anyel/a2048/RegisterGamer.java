package com.example.anyel.a2048;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.anyel.a2048.TypeFacePersonality;

public class RegisterGamer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_gamer);
        configureSubTitle();
        captureButton();
    }
    protected void configureSubTitle(){
       // Toast.makeText(getBaseContext(),getResources().getString(R.string.texto_prueba),Toast.LENGTH_SHORT).show();

        TypeFacePersonality typeFP = new TypeFacePersonality(this);

        TextView subtitleGame = (TextView)findViewById(R.id.subTitleGame);
       subtitleGame.setTypeface(typeFP.roboTitle);

        TextView titleMenu = (TextView)findViewById(R.id.title_reg);
        titleMenu.setTypeface(typeFP.dowlinkTitle);

        EditText nickUser = (EditText)findViewById(R.id.text_nick);
        nickUser.setTypeface(typeFP.simkaiTitle);

        Button login  = (Button)findViewById(R.id.button_enter);
        login.setTypeface(typeFP.dowlinkTitle);
    }

    public void captureButton() {
        Button login = (Button) findViewById(R.id.button_enter);
        login.setOnClickListener(new  View.OnClickListener(){
            // @Override
            public void onClick(View v) {
                EditText nickUser = (EditText) findViewById(R.id.text_nick);
                Intent i = new Intent(RegisterGamer.this, ActivityGame.class);
                i.putExtra(getResources().getString(R.string.title_nick),nickUser.getText().toString());
                //Log.e("Nick: ",nickUser.getText().toString());
                //Toast.makeText(getBaseContext(),nickUser.getText().toString(),Toast.LENGTH_SHORT).show();
                if(nickUser.getText().toString().trim().length()!=0) {
                    startActivity(i);
                    finish();
                }
                else{
                    Snackbar.make(v,getResources().getString(R.string.cautionNick),Snackbar.LENGTH_SHORT).show();
                }
            }
        });
    }



}
