package hoang.vincent.ClassicRogueSim.queue.events;

import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;

enum AttackResult {
    MISS,
    DODGE,
    HIT,
    GLANCE,
    PARRY,
    CRIT
}

public class AttackCalculation {
    public static AttackResult getAttackResult(int targetLevel,
                                               int attackerSkill,
                                               double criticalChance,
                                               int hitChance) {

        double missChance = getMissChance(targetLevel, attackerSkill) + 18.0;
        double dodgeChance = 5 + (((targetLevel * 5) - attackerSkill) * 0.1);
        double critSuppression = 4.8;

        double critCap = 100.0 - 40.0 - missChance - dodgeChance + hitChance - critSuppression;
        double rngRoll = ThreadLocalRandom.current().nextDouble(100.0) + 1;

        if (rngRoll <= 40.0) {
            return AttackResult.GLANCE;
        }

        if (rngRoll > 40.0 && rngRoll >= 40.0&& rngRoll <= 40.0 + dodgeChance) {
            return AttackResult.DODGE;
        }

        if (rngRoll > 40.0 && rngRoll >= 40.0
                && rngRoll > 40.0 + dodgeChance
                && rngRoll <= 40.0 + dodgeChance + missChance - hitChance) {
            return AttackResult.MISS;
        }

        if (criticalChance > critCap) {
            return AttackResult.CRIT;
        }

        double sumOfMissChance = 40.0 + dodgeChance + missChance;

        if (rngRoll > sumOfMissChance + hitChance) {
            return  AttackResult.CRIT;
        }

        return AttackResult.HIT;
    }

    public static double getMissChance(int targetLevel, int attackerSkill) {
        // If the target is a mob and defense minus attack rating is 11 or more
        if ((targetLevel * 5 - attackerSkill) > 11) {
            return 5 + ((targetLevel * 5) - attackerSkill) * 0.2;
        }

        // If the target is a mob and defense minus attack rating is 10 or less
        if ((targetLevel * 5 - attackerSkill) < 11) {
            return 5 + ((targetLevel * 5) - attackerSkill) * 0.1;
        }

        // If the target is a mob below level 10
        if (targetLevel < 10) {
            return 5 * (targetLevel / 10.0);
        }

        // If the target is a player
        // Note this is a placeholder that assumes the player being attacked has 0 +defense on items
        return 5 + (300 - attackerSkill) * 0.04;
    }

    public static double getCriticalStrike(double damage) {
        // TODO: add talents
        return damage * 2;
    }

    public static double getGlancingBlow(double damage, int targetLevel, int attackerSkill) {
        int skillDelta = targetLevel - attackerSkill;

        if (skillDelta  == 15) {
            return damage * 0.65;
        }

        if (skillDelta == 14) {
            return damage * 0.69;
        }

        if (skillDelta == 13) {
            return damage * 0.73;
        }

        if (skillDelta == 12) {
            return damage * 0.77;
        }

        if (skillDelta == 11) {
            return damage * 0.81;
        }

        if (skillDelta == 10) {
            return damage * 0.85;
        }

        if (skillDelta == 9) {
            return damage * 0.89;
        }

        if (skillDelta == 8) {
            return damage * 0.93;
        }

        if (skillDelta <= 7) {
            return damage * 0.95;
        }

        Logger.getLogger("AttackCalculation").log(Level.INFO, "getGlancingBlow invalid skillDelta (targetLevel - attackerSkill)");
        return damage;
    }
}
