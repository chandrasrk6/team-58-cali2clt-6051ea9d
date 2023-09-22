package com.levelup.forestsandmonsters;
import com.levelup.forestsandmonsters.Character;

public class Character {
    /* variable declarations */
    String characterName = " C ";
    private Object currentPosition;

    public String getCharacterName() {
        return characterName;
    }
     public void setCharacterName(String characterName) {
        this.characterName = characterName;
    } 
    @Override
    public String toString() {
        return "Please enter your Character Name:" + characterName + "]";
    }
    public Character(String characterName) {
        this.characterName = characterName;
    }
    public <C> void enterMap(GameMap map)
    {
        Character.getCurrentPosition(currentPosition);          
    }
    public static void getCurrentPosition(Object gameController) {

    }
}

