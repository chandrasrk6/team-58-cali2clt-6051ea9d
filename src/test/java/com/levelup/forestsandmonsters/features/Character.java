package com.levelup.forestsandmonsters.features;

public class Character {
    /* variable declarations */
    String characterName = " C ";

    Character testCharacter = new Character(characterName);
    

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    @Override
    public String toString() {
        return "Character [characterName=" + characterName + "]";
    }

    public void setTestCharacter(Character testCharacter) {
        this.testCharacter = testCharacter;
    }

    public Character(String characterName) {
        this.characterName = characterName;
    }
    

}
