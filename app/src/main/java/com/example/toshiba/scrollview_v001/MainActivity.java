package com.example.toshiba.scrollview_v001;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.IOException;


public class MainActivity extends ActionBarActivity implements  View.OnClickListener {
    ImageView principal,caballo,conejo,cris,jimboy,juan,kevin,liam,mono,venado;
    Button insertar;
    int movil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        conejo=(ImageView) findViewById(R.id.conejo);
        caballo=(ImageView) findViewById(R.id.caballo);
        venado=(ImageView) findViewById(R.id.principal);
        cris=(ImageView) findViewById(R.id.criss);
        jimboy=(ImageView) findViewById(R.id.jimboy);
        juan=(ImageView) findViewById(R.id.juan);
        kevin=(ImageView) findViewById(R.id.kevin);
        liam=(ImageView) findViewById(R.id.liam);
        mono=(ImageView) findViewById(R.id.mono);
        principal=(ImageView) findViewById(R.id.principal);
        insertar=(Button)findViewById(R.id.btInsertar);

        conejo.setOnClickListener(this);
        cris.setOnClickListener(this);
        jimboy.setOnClickListener(this);
        juan.setOnClickListener(this);
        kevin.setOnClickListener(this);
        liam.setOnClickListener(this);
        mono.setOnClickListener(this);
        caballo.setOnClickListener(this);
        venado.setOnClickListener(this);
        principal.setOnClickListener(this);
        insertar.setOnClickListener(this);




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.conejo:
                principal.setImageResource(R.drawable.conejo);
                movil=R.drawable.conejo;
                break;

            case R.id.criss:
                principal.setImageResource(R.drawable.criss);
                movil=R.drawable.criss;
                break;

            case R.id.jimboy:
                principal.setImageResource(R.drawable.jimmboy);
                movil=R.drawable.jimmboy;
                break;

            case R.id.juan:
                principal.setImageResource(R.drawable.juann);
                movil=R.drawable.juann;
                break;

            case R.id.kevin:
                principal.setImageResource(R.drawable.liiam);
                movil=R.drawable.liiam;
                break;

            case R.id.mono:
                principal.setImageResource(R.drawable.mono);
                movil=R.drawable.mono;
                break;

            case R.id.caballo:
                principal.setImageResource(R.drawable.caballo);
                movil=R.drawable.caballo;
                break;

            case R.id.principal:
                principal.setImageResource(R.drawable.venado);
                movil=R.drawable.venado;
                break;

            case R.id.btInsertar:
                Bitmap imagen= BitmapFactory.decodeStream(getResources().openRawResource(movil));
                try {
                    getApplicationContext().setWallpaper(imagen);
                } catch (IOException e) {
                    e.printStackTrace();
                }

                Toast mensaje=Toast.makeText(this,"La imagen ahora es wallpaper",Toast.LENGTH_SHORT);
                  mensaje.show();


                break;
        }
    }
}
