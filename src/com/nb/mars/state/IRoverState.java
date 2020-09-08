package com.nb.mars.state;

import com.nb.mars.object.Rover;

public interface IRoverState {
    void turnLeft(Rover rover);
    void turnRight(Rover rover);
    void move(Rover rover);
}
