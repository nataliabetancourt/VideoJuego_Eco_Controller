package com.example.videojuego_eco_controller.model;

import java.util.ArrayList;

public class Player {

    private int x, y, width, height;
    private String action;
    private int coolDown, speed;
    private ArrayList<Bullet> bullets;

    public Player (int x, int y, String action) {
        this.x = x;
        this.y = y;
        this.speed = 30;
        this.coolDown = 0;
        this.width = 55;
        this.height = 115;
        this.action = action;

        //array
        bullets = new ArrayList <>();
    }

    public Player() { }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

}
