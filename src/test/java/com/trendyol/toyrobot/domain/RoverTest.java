package com.trendyol.toyrobot.domain;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RoverTest {

    @Test
    public void should_create_rover() {
        Rover rover = createNorthRover();
        assertEquals(0, rover.getCoordinate().getX());
        assertEquals(0, rover.getCoordinate().getY());
        assertEquals("NORTH", rover.getCompass().getName());
    }

    @Test
    public void should_move_forward_when_compass_is_north() {
        Rover rover = createNorthRover();
        rover.move();
        assertEquals(1, rover.getCoordinate().getY());
    }

    @Test
    public void should_move_forward_when_compass_is_east() {
        Rover rover = createEastRover();
        rover.move();
        assertEquals(1, rover.getCoordinate().getX());
    }

    @Test
    public void should_move_forward_when_compass_is_south() {
        Rover rover = createSouthRover();
        rover.move();
        assertEquals(-1, rover.getCoordinate().getY());
    }

    @Test
    public void should_move_forward_when_compass_is_west() {
        Rover rover = createWestRover();
        rover.move();
        assertEquals(-1, rover.getCoordinate().getX());
    }

    @Test
    public void should_turn_left_when_compass_is_north() {
        Rover rover = createNorthRover();
        rover.turnLeft();
        assertEquals("WEST", rover.getCompass().getName());
    }

    @Test
    public void should_turn_left_when_compass_is_west() {
        Rover rover = createWestRover();
        rover.turnLeft();
        assertEquals("SOUTH", rover.getCompass().getName());
    }

    @Test
    public void should_turn_left_when_compass_is_south() {
        Rover rover = createSouthRover();
        rover.turnLeft();
        assertEquals("EAST", rover.getCompass().getName());
    }

    @Test
    public void should_turn_left_when_compass_is_east() {
        Rover rover = createEastRover();
        rover.turnLeft();
        assertEquals("NORTH", rover.getCompass().getName());
    }

    @Test
    public void should_turn_right_when_compass_is_north () {
        Rover rover = createNorthRover();
        rover.turnRight();
        assertEquals("EAST", rover.getCompass().getName());
    }

    @Test
    public void should_turn_right_when_compass_is_east() {
        Rover rover = createEastRover();
        rover.turnRight();
        assertEquals("SOUTH", rover.getCompass().getName());
    }

    @Test
    public void should_turn_right_when_compass_is_south() {
        Rover rover = createSouthRover();
        rover.turnRight();
        assertEquals("WEST", rover.getCompass().getName());
    }

    @Test
    public void should_turn_right_when_compass_is_west () {
        Rover rover = createWestRover();
        rover.turnRight();
        assertEquals("NORTH", rover.getCompass().getName());
    }

    private Rover createWestRover() {
        return new Rover(new Coordinate(0,0) ,new West());
    }

    private Rover createSouthRover() {
        return new Rover(new Coordinate(0,0), new South());
    }

    private Rover createEastRover() {
        return new Rover(new Coordinate(0,0), new East());
    }

    private Rover createNorthRover() {
        return new Rover();
    }
}
