package hoang.vincent.ClassicRogueSim.models.player;

import hoang.vincent.ClassicRogueSim.models.character.Dwarf;
import hoang.vincent.ClassicRogueSim.models.character.Gnome;
import hoang.vincent.ClassicRogueSim.models.equipment.Equipment;

public class Player {
    private Race race;
    private int strength;
    private int agility;
    private int stamina;
    private int intellect;
    private int spirit;

    private Equipment equipment;

    // Constructor
    public Player(Race race) {
        this.race = race;
        this.equipment = new Equipment();

        setBaseStats();
    }

    // Character Getters
    public Race getRace() {
        return this.race;
    }

    public Equipment getEquipment() {
        return this.equipment;
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
                this.strength = Gnome.strength;
            case HUMAN:
            case NIGHTELF:
            case ORC:
            case TROLL:
            case UNDEAD:
        }
    }
}
