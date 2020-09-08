package com.nb.mars.utils;

import com.nb.mars.object.Rover;
import com.nb.mars.command.ICommand;
import com.nb.mars.command.LeftCommand;
import com.nb.mars.command.MoveCommand;
import com.nb.mars.command.RightCommand;
import com.nb.mars.state.*;


import java.util.ArrayList;
import java.util.List;

public class MarsUtils {

    public static IRoverState directionParser (String direction) throws Exception {

        if("N".equals(direction)) return new NorthState();
        if("E".equals(direction)) return new EastState();
        if("S".equals(direction)) return new SouthState();
        if("W".equals(direction)) return new WestState();

        throw new Exception("INVALID DIRECTION. VALID DIRECTIONS: N, E, S, W");
    }

    public static List<ICommand> commandParser(String commands, Rover rover) throws Exception {
        List<ICommand> commandArray = new ArrayList<>();

        for(int i = 0; i < commands.length(); i++) {
            if('L' == commands.charAt(i)) {
                commandArray.add(new LeftCommand(rover));
            } else if('R' == commands.charAt(i)) {
                commandArray.add(new RightCommand(rover));
            } else if ('M' == commands.charAt(i)) {
                commandArray.add(new MoveCommand(rover));
            } else
                throw new Exception("INVALID COMMAND. VALID COMMANDS: L, R, M");
        }

        return commandArray;
    }
}
