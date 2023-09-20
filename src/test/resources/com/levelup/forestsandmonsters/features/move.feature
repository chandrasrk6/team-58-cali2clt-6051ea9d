Feature: Move in a direction 
    
    I want to move my character. If they attempt to 
    move past a boundary, the move results in no change in position but does increment move count.

    Scenario Outline: Move in a direction
        Given the character starts at position with XCoordinates <startingPositionX> 
        And starts at YCoordinates <startingPositionY>
        And the player chooses to move in <direction>
        And the current move count is <startingMoveCount>
        When the character moves
        Then the character is now at position with XCoordinates <endingPositionX>
        And YCoordinates <endingPositionY>
        And the new move count is <endingMoveCount>
        Examples:
            | startingPositionX | startingPositionY | direction | startingMoveCount | endingPositionX | endingPositionY | endingMoveCount |
            | 0 | 0 | NORTH | 10 | 0 | 1 | 11 |
            | 0 | 0 | SOUTH | 32 | 0 | 0 | 33 |
            | 0 | 0 | EAST  | 12 | 0 | 1 | 13 |
            | 0 | 0 | WEST  | 10 | 0 | 0 | 11 |
            | 0 | 9 | NORTH | 10 | 0 | 0 | 11 |
            | 0 | 9 | SOUTH | 32 | 0 | 8 | 33 |
            | 0 | 9 | EAST  | 12 | 1 | 9 | 13 |
            | 0 | 9 | WEST  | 10 | 0 | 9 | 11 |
            | 9 | 0 | NORTH | 10 | 9 | 1 | 11 |
            | 9 | 0 | SOUTH | 32 | 9 | 0 | 33 |
            | 9 | 0 | EAST  | 12 | 9 | 0 | 13 |
            | 9 | 0 | WEST  | 10 | 8 | 0 | 11 |
            | 9 | 9 | NORTH | 10 | 9 | 9 | 12 |
            | 9 | 9 | SOUTH | 32 | 9 | 8 | 34 |
            | 9 | 9 | EAST  | 12 | 9 | 9 | 14 |
            | 9 | 9 | WEST  | 10 | 8 | 9 | 12 |