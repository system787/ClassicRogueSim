package hoang.vincent.ClassicRogueSim.models.player;

import hoang.vincent.ClassicRogueSim.models.character.Dwarf;

public class Player {
    private Race race;
    private int strength;
    private int agility;
    private int stamina;
    private int intellect;
    private int spirit;

    // Constructor
    public Player(Race race) {
        this.race = race;

        setBaseStats();
    }

    // Character Stats
    private void setBaseStats() {
        switch (race) {
            case DWARF:
                this.strength = Dwarf.strength;
                this.agility = Dwarf.agility;
                this.stamina = Dwarf.stamina;
                this.intellect = Dwarf.intellect;
                this.spirit = Dwarf.spirit;
                return;
            case GNOME:

            case HUMAN:
            case NIGHTELF:
            case ORC:
            case TROLL:
            case UNDEAD:
        }
    }
}
