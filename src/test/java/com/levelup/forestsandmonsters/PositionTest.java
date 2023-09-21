package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import com.levelup.forestsandmonsters.Position;



public class PositionTest {
    @Test
    public void initializationPositionXYCoordinates  () {
        Position position = new Position(5, 5);
        assertEquals(5, position.coordinates.x);
        assertEquals(5, position.coordinates.y);
    }

}