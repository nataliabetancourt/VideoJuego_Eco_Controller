package com.example.videojuego_eco_controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.videojuego_eco_controller.model.Player;
import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity implements IObserver{

    private Communication com;
    private ImageView leftBtn, shootBtn, rightBtn;
    private TextView scoreValueTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Elementos graficos
        leftBtn = findViewById(R.id.leftBtn);
        shootBtn = findViewById(R.id.shootBtn);
        rightBtn = findViewById(R.id.rightBtn);
        scoreValueTxt = findViewById(R.id.scoreValueTxt);

        //Communication
        com = Communication.getInstance();
        com.setObserver(this);

        //GSON
        Gson gson = new Gson();
        Player player = new Player();

        //Buttons
        leftBtn.setOnClickListener((v)->{
            player.setAction("left");
            String json = gson.toJson(player);
            com.sendMessage(json);
        });

        shootBtn.setOnClickListener((v)->{
            player.setAction("shoot");
            String json = gson.toJson(player);
            com.sendMessage(json);
        });

        rightBtn.setOnClickListener((v)->{
            player.setAction("right");
            String json = gson.toJson(player);
            com.sendMessage(json);
        });

    }

    @Override
    public void notifyMessage(String message) {
        runOnUiThread(()->{
            scoreValueTxt.setText(message);
        });
    }
}