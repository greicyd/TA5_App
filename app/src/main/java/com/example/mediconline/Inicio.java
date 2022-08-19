package com.example.mediconline;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Timer;
import java.util.TimerTask;

public class Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        TimerTask tarea= new TimerTask() {
            @Override
            public void run() {
                Intent intend=new Intent(Inicio.this, MainActivity.class);
                startActivity(intend);
                finish();
            }

        };
        Timer tiempo =new Timer();
        tiempo.schedule(tarea,3000);
    }

}
