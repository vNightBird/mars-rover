package com.nb.mars;

import com.nb.mars.command.ICommand;
import com.nb.mars.object.Field;
import com.nb.mars.object.Location;
import com.nb.mars.object.Rover;
import com.nb.mars.utils.MarsUtils;

import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        while (true) {
            try {
                //TAKE BORDERS
                String[] borders = scan.nextLine().split(" ");
                //TODO CRASH CONTROL
                Field mars = new Field(new Location(Integer.parseInt(borders[0]), Integer.parseInt(borders[0])));

                //TAKE CURRENT LOCATION AND STATE
                String[] initials = scan.nextLine().split(" ");
                Location roverInitialLocation = new Location(Integer.parseInt(initials[0]), Integer.parseInt(initials[1]));
                Rover marsRover = new Rover(roverInitialLocation, MarsUtils.directionParser(initials[2]));

                //TAKE COMMANDS
                String commands = scan.nextLine();
                List<ICommand> commandList = MarsUtils.commandParser(commands, marsRover);

                //APPLY COMMANDS
                commandList.forEach(ICommand::execute);

                System.out.println("FINAL: " + marsRover);
            }catch (Exception e) {
                e.printStackTrace();
            }
        }


    }
}
