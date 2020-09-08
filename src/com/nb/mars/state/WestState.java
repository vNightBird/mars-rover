package com.nb.mars.state;

import com.nb.mars.object.Location;
import com.nb.mars.object.Rover;

public class WestState implements IRoverState{
    @Override
    public void turnLeft(Rover rover) {
        rover.setState(new SouthState());
    }

    @Override
    public void turnRight(Rover rover) {
        rover.setState(new NorthState());
    }

    @Override
    public void move(Rover rover) {
        rover.setLocation(new Location(rover.getLocation().getX()-1, rover.getLocation().getY()));
    }

    @Override
    public String toString() {
        return "WEST";
    }
}
