package com.levelup.forestsandmonsters;

import java.awt.Point;
import com.levelup.forestsandmonsters.GameController.DIRECTION;

public class GameMap {
    
    private com.levelup.forestsandmonsters.Position DEFAULT_START_POSITION=new Position(0,0);
    private com.levelup.forestsandmonsters.Position  Position[];


        public GameMap() {
            int k=0;
            for(int i=0;i<10;i++){

                for(int j=0;j<10;j++){

                    Position[k++]=new Position(i,j);

                }
            }
        }

        public Position calculatePosition(Position currentPosition, DIRECTION direction) {
            Position newPosition = currentPosition;

            if (currentPosition == null) {
                newPosition = DEFAULT_START_POSITION;
            }

            if (DIRECTION.NORTH.equals(direction)) {
                newPosition = new Position(newPosition.coordinates.x, newPosition.coordinates.y + 1);
            }

            if (DIRECTION.EAST.equals(direction)) {
                newPosition = new Position(newPosition.coordinates.x+1, newPosition.coordinates.y);
            }

            if (DIRECTION.WEST.equals(direction)) {
                newPosition = new Position(newPosition.coordinates.x-1, newPosition.coordinates.y);
            }

            if (DIRECTION.SOUTH.equals(direction)) {
                newPosition = new Position(newPosition.coordinates.x, newPosition.coordinates.y - 1);
            }
            
            if (isPositionValid(newPosition.coordinates) == true) {
                return newPosition;
            } else {
                return currentPosition;

            }
        }
        
        public boolean isPositionValid(Point pointToValidate) {
            return pointToValidate.getX() >= 0 && pointToValidate.getX() <= 9 && pointToValidate.getY() >= 0 && pointToValidate.getY() <= 9;

        }  

    }
