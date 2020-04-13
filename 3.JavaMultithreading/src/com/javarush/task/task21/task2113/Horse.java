package com.javarush.task.task21.task2113;

public class Horse {
    public String name;
    public double speed;
    public double distance;

    public Horse(String name, double speed, double distance)
    {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setSpeed(double speed)
    {
        this.speed = speed;
    }

    public double getSpeed()
    {
        return speed;
    }

    public void setDistance(double distance)
    {
        this.distance = distance;
    }

    public double getDistance()
    {
        return distance;
    }

    public void move() {
        distance+= speed*Math.random();
    }

    public void print() {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < (int) getDistance(); i++)
        {
            sb.append('.');
        }
        System.out.println(sb + this.name);
    }
}