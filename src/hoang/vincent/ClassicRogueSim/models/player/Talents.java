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
    private int maceSpecialization;
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

    public void addMurder() {
        if (murder < 2) {
            murder += 1;
        }
    }

    public void removeMurder() {
        if (murder > 0) {
            murder -= 1;
        }
    }

    public void addImprovedSND() {
        if (improvedSND < 3) {
            improvedSND += 1;
        }
    }

    public void removeImprovedSND() {
        if (improvedSND > 0) {
            improvedSND -= 1;
        }
    }

    public void addRelentlessStrikes() {
        if (relentlessStrikes < 1) {
            relentlessStrikes += 1;
        }
    }

    public void removeRelentlessStrikes() {
        if (relentlessStrikes > 0) {
            relentlessStrikes -= 1;
        }
    }

    public void addImprovedExposeArmor() {
        if (improvedExposeArmor < 3) {
            improvedExposeArmor += 1;
        }
    }

    public void removeImprovedExposeArmor() {
        if (improvedExposeArmor > 0) {
            improvedExposeArmor -= 1;
        }
    }

    public void addLethality() {
        if (lethality < 5) {
            lethality += 1;
        }
    }

    public void removeLethality() {
        if (lethality > 0) {
            lethality -= 1;
        }
    }

    /* Combat */
    public void addImprovedSS() {
        if (improvedSS < 2) {
            improvedSS += 1;
        }
    }

    public void removeImprovedSS() {
        if (improvedSS > 0) {
            improvedSS -= 1;
        }
    }

    public void addImprovedBS() {
        if (improvedBS < 3) {
            improvedBS += 1;
        }
    }

    public void removeImprovedBS() {
        if (improvedBS > 0) {
            improvedBS -= 1;
        }
    }

    public void addPrecision() {
        if (precision < 5) {
            precision += 1;
        }
    }

    public void removePrecision() {
        if (precision > 0) {
            precision -= 1;
        }
    }

    public void addDaggerSpecialization() {
        if (daggerSpecialization < 5) {
            daggerSpecialization += 1;
        }
    }

    public void removeDaggerSpecialization() {
        if (daggerSpecialization > 0) {
            daggerSpecialization -= 1;
        }
    }

    public void addDualWieldSpecialization() {
        if (dualWieldSpecialization < 5) {
            dualWieldSpecialization += 1;
        }
    }

    public void removeDualWieldSpecialization() {
        if (dualWieldSpecialization > 0) {
            dualWieldSpecialization -= 1;
        }
    }

    public void addMaceSpecialization() {
        if (maceSpecialization < 5) {
            maceSpecialization += 1;
        }
    }

    public  void removeMaceSpecialization() {
        if (maceSpecialization > 0) {
            maceSpecialization -= 1;
        }
    }

    public void addBladeFlurry() {
        if (bladeFlurry < 1) {
            bladeFlurry += 1;
        }
    }

    public void removeBladeFlurry() {
        if (bladeFlurry > 0) {
            bladeFlurry -= 1;
        }
    }

    public void addSwordSpecialization() {
        if (swordSpecialization < 5) {
            swordSpecialization += 1;
        }
    }

    public void removeSwordSpecialization() {
        if (swordSpecialization > 0) {
            swordSpecialization -= 1;
        }
    }

    public void addFistSpecialization() {
        if (fistSpecialization < 5) {
            fistSpecialization += 1;
        }
    }

    public void removeFistSpecialization() {
        if (fistSpecialization > 0) {
            fistSpecialization -= 1;
        }
    }

    public void addWeaponExpertise() {
        if (weaponExpertise < 2) {
            weaponExpertise += 1;
        }
    }

    public void removeWeaponExpertise() {
        if (weaponExpertise > 0) {
            weaponExpertise -= 1;
        }
    }

    public void addAggression() {
        if (aggression < 3) {
            aggression += 1;
        }
    }

    public void removeAggression() {
        if (aggression > 0) {
            aggression -= 1;
        }
    }

    public void addAdrenalineRush() {
        if (adrenalineRush < 1) {
            adrenalineRush += 1;
        }
    }

    public void removeAdrenalineRush() {
        if (adrenalineRush > 0) {
            adrenalineRush -= 1;
        }
    }

    /* Subtlety */
    public void addOpportunity() {
        if (opportunity < 5) {
            opportunity += 1;
        }
    }

    public void removeOpportunity() {
        if (opportunity > 0) {
            opportunity -= 1;
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

    public int getMaceSpecialization() {
        return maceSpecialization;
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
