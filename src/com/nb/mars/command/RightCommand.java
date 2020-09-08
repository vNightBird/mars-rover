package com.nb.mars.command;

import com.nb.mars.object.Rover;

public class RightCommand implements ICommand{
    Rover rover;

    public RightCommand(Rover rover) {
        this.rover = rover;
    }

    @Override
    public void execute() {
        rover.turnRight();
        System.out.println("TURNED RIGHT: " + rover);
    }
}
