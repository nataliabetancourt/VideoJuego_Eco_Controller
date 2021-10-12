package com.example.videojuego_eco_controller.model;

public class Bullet {

    private int x, y, speed;
    private boolean visible;

    public Bullet (int x, int y) {
        this.x = x;
        this.y = y;
        this.speed = 2;
        this.visible = true;
    }

    //movimiento bala de player
    public void moveBullet() {
        y-=speed;
    }

    //movimineto bala de enemigo fuerte
    public void moveEnemyBullet() {
        y+=speed;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public int getY() {
        return y;
    }


}
