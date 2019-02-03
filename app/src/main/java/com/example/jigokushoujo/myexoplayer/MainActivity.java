package com.example.jigokushoujo.myexoplayer;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        Button boton = (Button) findViewById(R.id.botonAceptar);

        boton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                final String url = ((EditText) findViewById(R.id.url)).getText().toString();
                Intent intent = new Intent(MainActivity.this, PlayerActivity.class);
                intent.putExtra("textoURL", url);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        });
    }
}
