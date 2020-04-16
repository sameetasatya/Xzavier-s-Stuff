package com.example.petapp;
import android.graphics.drawable.Drawable;

public class Pet {

    private int health;
    private int resistant;
    private int life;
    private boolean isAlive;
    private String mood;
    private Drawable drawable;

    Pet(Drawable avatar){
        life = 100;
        isAlive = true;
        mood = "happy";
        health = (int) (Math.random()*50);
        resistant = (int) (Math.random()*80);

        drawable = avatar;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getResistant() {
        return resistant;
    }

    public void setResistant(int resistant) {
        this.resistant = resistant;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public Drawable getDrawable() {
        return drawable;
    }

    public void setDrawable(Drawable drawable) {
        this.drawable = drawable;
    }
}
