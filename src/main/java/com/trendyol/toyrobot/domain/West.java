package com.trendyol.toyrobot.domain;

public class West implements Compass {

    @Override
    public void move(Coordinate coordinate) {
        coordinate.moveReverseX();
    }

    @Override
    public Compass turnLeft() {
        return (Compass) new South();
    }

    @Override
    public Compass turnRight() {
        return (Compass) new North();
    }

    @Override
    public String getName() {
        return "WEST";
    }
}
