package com.nb.mars.object;

import com.nb.mars.state.IRoverState;

public class Rover {

    private IRoverState state;
    private Location location;

    public Rover(Location location, IRoverState state) {
        this.location = location;
        this.state = state;
    }

    public void turnLeft(){
        getState().turnLeft(this);
    }

    public void turnRight(){
        getState().turnRight(this);
    }

    public void move(){
        getState().move(this);
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public IRoverState getState() {
        return state;
    }

    public void setState(IRoverState state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Rover{" +
                "state=" + state +
                ", locationX=" + location.getX() +
                ", locationY=" + location.getY() +
                '}';
    }

}
