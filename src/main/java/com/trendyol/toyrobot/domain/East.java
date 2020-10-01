package com.trendyol.toyrobot.domain;

public class East implements Compass{


    @Override
    public void move(Coordinate coordinate) {
        coordinate.moveX();
    }

    @Override
    public Compass turnLeft() {
        return (Compass) new North();
    }

    @Override
    public Compass turnRight() {
        return (Compass) new South();
    }

    @Override
    public String getName() {
        return "EAST";
    }
}
