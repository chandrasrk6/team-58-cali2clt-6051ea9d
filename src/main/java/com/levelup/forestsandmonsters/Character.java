package com.levelup.forestsandmonsters;
public class Character {
    /* variable declarations */
    String characterName = " C ";

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
}
