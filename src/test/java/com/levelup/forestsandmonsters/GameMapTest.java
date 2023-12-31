package com.levelup.forestsandmonsters;

import com.levelup.forestsandmonsters.GameController.DIRECTION;
import static com.levelup.forestsandmonsters.GameController.DIRECTION.*;
import java.awt.Point;

import org.junit.jupiter.api.Test;

public class GameMapTest {
    static final int DEFAULT_POSITIONS = 100;
    static final Position DEFAULT_START_POSITION = new Position(0, 0);
    int numPositions;

    @Test
    public static void setUpGameMap() {
       
   }
        public Position calculatePosition(Position startingPosition, DIRECTION direction) {
            Position newPosition = startingPosition;

            if (startingPosition == null) {
                newPosition = DEFAULT_START_POSITION;
            }

            if (direction == NORTH) {
                newPosition = new Position(newPosition.getX(), newPosition.getY() + 1);
                numPositions++;
            }else if (direction == SOUTH) {
                newPosition = new Position(newPosition.getX(), newPosition.getY() - 1);
                numPositions++;
            }else if (direction == EAST) {
                newPosition = new Position(newPosition.getX() + 1, newPosition.getY());
                numPositions++;
            }else if (direction == WEST) {
                newPosition = new Position(newPosition.getX() - 1, newPosition.getY());
                numPositions++;
            }

            if (isPositionValid(newPosition.coordinates) == true) {
                return newPosition;
            } else {
                return startingPosition;
            }            
                    }
        private boolean isPositionValid(Point coordinates) {
            return false;
        }
            }