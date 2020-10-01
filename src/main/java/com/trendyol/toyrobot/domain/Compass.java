package com.trendyol.toyrobot.domain;

public interface Compass {

    void move(Coordinate coordinate);
    Compass turnLeft();
    Compass turnRight();
    String getName();
}
