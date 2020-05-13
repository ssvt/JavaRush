package com.javarush.task.task25.task2515;

import java.util.ArrayList;
import java.util.List;

public class Space {
    private int width;                      //ширина
    private int height;                     //ВЫСОТА
    private SpaceShip ship;                 //Космический корабль

    private List<Ufo> ufos;                 //Список НЛО
    private List<Rocket> rockets;           //Список ракет
    private List<Bomb> bombs;               //Список бомб

    public Space(int width, int height) {
        this.width = width;
        this.height = height;
        this.ufos = new ArrayList<>();
        this.rockets = new ArrayList<>();
        this.bombs = new ArrayList<>();
    }

    public void run(){

    }

    public void draw(){

    }
    public void sleep(int ms){
        
    }

    public SpaceShip getShip() { return ship;  }

    public void setShip(SpaceShip ship) { this.ship = ship;  }

    public List<Bomb> getBombs() { return bombs;  }

    public List<Rocket> getRockets() { return rockets;  }

    public List<Ufo> getUfos() { return ufos; }

    public int getWidth() { return width; }

    public int getHeight() { return height; }

    public static void main(String[] args) {
        Canvas canvas = new Canvas(20, 20);
        canvas.print();
    }
}
