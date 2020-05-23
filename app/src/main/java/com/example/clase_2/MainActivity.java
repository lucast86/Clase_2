package com.example.clase_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //onCreate ocurre cuando la pantalla se genera
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        this.saludar();//metodo
    }

    // ENLACES DE EVENTOS
    @Override
    protected void onPause() { //PARA PAUSAR LA APP
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    private void saludar(){

    }
}
