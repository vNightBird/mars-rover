package com.nb.mars.command;

import com.nb.mars.object.Rover;

public class MoveCommand implements ICommand{
    Rover rover;

    public MoveCommand(Rover rover) {
        this.rover = rover;
    }

    @Override
    public void execute() {
        rover.move();
        System.out.println("MOVED TO " + rover.getState() + ": " + rover);
    }
}
