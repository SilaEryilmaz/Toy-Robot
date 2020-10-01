package com.trendyol.toyrobot.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Coordinate {

    private int x;
    private int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moveX(){
        this.x = x+1;
    }

    public void moveY(){
        this.y= y+1;
    }

    public void moveReverseX(){
        this.x = x-1;

    }

    public void moveReverseY(){
        this.y = y-1;

    }
}
