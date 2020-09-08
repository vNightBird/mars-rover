package com.nb.mars.state;

import com.nb.mars.object.Location;
import com.nb.mars.object.Rover;

public class NorthState implements IRoverState{
    @Override
    public void turnLeft(Rover rover) {
        rover.setState(new WestState());
    }

    @Override
    public void turnRight(Rover rover) {
        rover.setState(new EastState());
    }

    @Override
    public void move(Rover rover) {
        rover.setLocation(new Location(rover.getLocation().getX(), rover.getLocation().getY()+1));
    }

    @Override
    public String toString() {
        return "NORTH";
    }
}


