package com.nb.mars.command;

import com.nb.mars.object.Rover;

public class LeftCommand implements ICommand{
    Rover rover;

    public LeftCommand(Rover rover) {
        this.rover = rover;
    }

    @Override
    public void execute() {
        rover.turnLeft();
        System.out.println("TURNED LEFT: " + rover);
    }

}
