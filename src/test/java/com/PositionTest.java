package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import com.levelup.forestsandmonsters.Position;



public class PositionTest {
    @Test
    public void initializationSetsXCoordinates () {
        Position position = new Position(5, 5);
        assertEquals(5, position.coordinates.x);
    }

    @Test
    public void initializationSetsYCoordinates () {
        Position position = new Position(5, 5);
        assertEquals(5, position.coordinates.y);
    }
}