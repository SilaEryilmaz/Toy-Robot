package com.trendyol.toyrobot.domain;

public class North implements Compass {

    @Override
    public void move(Coordinate coordinate) {
        coordinate.moveY();
    }

    @Override
    public Compass turnLeft() {
        return (Compass) new West();
    }

    @Override
    public Compass turnRight() {
        return (Compass) new East();
    }

    @Override
    public String getName() {
        return "NORTH";
    }
}
