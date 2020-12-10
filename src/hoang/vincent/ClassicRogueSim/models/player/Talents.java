package hoang.vincent.ClassicRogueSim.models.player;

public class Talents {
    // Assassination
    private int improvedEviscerate;
    private int malice;
    private int ruthlessness;
    private int murder;
    private int improvedSND;
    private int relentlessStrikes;
    private int improvedExposeArmor;
    private int lethality;

    // Combat
    private int improvedSS;
    private int improvedBS;
    private int precision;
    private int dualWieldSpecialization;
    private int daggerSpecialization;
    private int bladeFlurry;
    private int swordSpecialization;
    private int fistSpecialization;
    private int weaponExpertise;
    private int aggression;
    private int adrenalineRush;

    // Subtlety
    private int opportunity;

    // Constructor
    public Talents() {

    }

    // Talent Setters

    /* Assassination */
    public void addImprovedEviscerate() {
        if (improvedEviscerate < 3) {
            improvedEviscerate += 1;
        }
    }

    public void removeImprovedEviscerate() {
        if (improvedEviscerate > 0) {
            improvedEviscerate -= 1;
        }
    }

    public void addMalice() {
        if (malice < 5) {
            malice += 1;
        }
    }

    public void removeMalice() {
        if (malice > 0) {
            malice -= 1;
        }
    }

    public void addRuthlessness() {
        if (ruthlessness < 3) {
            ruthlessness += 1;
        }
    }

    public void removeRuthlessness() {
        if (ruthlessness > 0) {
            ruthlessness -= 1;
        }
    }

    // Talent Getters
    public int getImprovedEviscerate() {
        return improvedEviscerate;
    }

    public int getMalice() {
        return malice;
    }

    public int getRuthlessness() {
        return ruthlessness;
    }

    public int getMurder() {
        return murder;
    }

    public int getImprovedSND() {
        return improvedSND;
    }

    public int getRelentlessStrikes() {
        return relentlessStrikes;
    }

    public int getImprovedExposeArmor() {
        return improvedExposeArmor;
    }

    public int getLethality() {
        return lethality;
    }

    public int getImprovedSS() {
        return improvedSS;
    }

    public int getImprovedBS() {
        return improvedBS;
    }

    public int getPrecision() {
        return precision;
    }

    public int getDualWieldSpecialization() {
        return dualWieldSpecialization;
    }

    public int getDaggerSpecialization() {
        return daggerSpecialization;
    }

    public int getBladeFlurry() {
        return bladeFlurry;
    }

    public int getSwordSpecialization() {
        return swordSpecialization;
    }

    public int getFistSpecialization() {
        return fistSpecialization;
    }

    public int getWeaponExpertise() {
        return weaponExpertise;
    }

    public int getAggression() {
        return aggression;
    }

    public int getAdrenalineRush() {
        return adrenalineRush;
    }

    public int getOpportunity() {
        return opportunity;
    }
}
