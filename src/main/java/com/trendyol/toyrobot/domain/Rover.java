package com.trendyol.toyrobot.domain;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.Setter;

import javax.swing.text.Position;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Setter
@Getter
public class Rover {

    private String id;
    private Coordinate coordinate;
    private Compass compass;
    private List<Material> material;

    public Rover() {
        this.id = UUID.randomUUID().toString();
        this.coordinate  = new Coordinate(0,0);
        this.compass = new North();
        this.material = new ArrayList<Material>();
    }

    public Rover(Coordinate coordinate, Compass compass) {
        this.id = UUID.randomUUID().toString();
        this.coordinate  = coordinate;
        this.compass = compass;
        this.material = new ArrayList<Material>();
    }

    public void move() {
        compass.move(this.coordinate);
        this.material.add(new Material(this.compass.getName()));
    }

    public void turnLeft() {
        this.compass= compass.turnLeft();
        this.material.add(new Material(this.compass.getName()));
    }

    public void turnRight() {
        this.compass = compass.turnRight();
        this.material.add(new Material(this.compass.getName()));
    }



}
