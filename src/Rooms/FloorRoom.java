package Rooms;

import People.Person;

public class FloorRoom extends Room
{
    public FloorRoom(int x, int y) {
        super(x, y);
    }
    /**
     * Triggers the game ending conditions.
     * @param x the Person entering
     */
    @Override
    public void enterRoom(Person x) {
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("You found the floor room! You can sleep on the floor now.");
    }
}