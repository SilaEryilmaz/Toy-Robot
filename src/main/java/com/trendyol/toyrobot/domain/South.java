package com.trendyol.toyrobot.domain;

public class South implements Compass{

    @Override
    public void move(Coordinate coordinate) {
        coordinate.moveReverseY();
    }

    @Override
    public Compass turnLeft() {
        return (Compass) new East();
    }

    @Override
    public Compass turnRight() {
        return (Compass) new West();
    }

    @Override
    public String getName() {
        return "SOUTH";
    }
}
