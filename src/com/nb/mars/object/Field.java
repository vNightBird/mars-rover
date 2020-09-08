package com.nb.mars.object;

public class Field {

    private Location maxLocation;
    private final Location minLocation = new Location(0,0);

    public Field(Location maxLocation) {
        this.maxLocation = maxLocation;
    }

    public Location getMaxLocation() {
        return maxLocation;
    }

    public void setMaxLocation(Location maxLocation) {
        this.maxLocation = maxLocation;
    }

    public Location getMinLocation() {
        return minLocation;
    }

}
