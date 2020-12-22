package hoang.vincent.ClassicRogueSim.queue.events;

import hoang.vincent.ClassicRogueSim.models.player.Player;
import hoang.vincent.ClassicRogueSim.queue.Batch;

import java.util.concurrent.ThreadLocalRandom;

public class MeleeSwing implements DamageEvent {

    private Player player;
    private boolean isMainHand;
    private static double GLANCING_CHANCE = 0.40;

    public MeleeSwing(Player player, boolean isMainHand) {
        this.player = player;
    }

    // Setup
    private double getWeaponDamageFromRange(Player player, boolean isMainHand) {
        int low;
        int high;

        if (isMainHand) {
            low = player.getEquipment().getMainHand().getDamageLow();
            high = player.getEquipment().getMainHand().getDamageHigh();
        } else {
            low = player.getEquipment().getOffHand().getDamageLow();
            high = player.getEquipment().getOffHand().getDamageHigh();
        }

        return ThreadLocalRandom.current().nextInt(low, high + 1);
    }

    @Override
    public void runDamageEvent(Batch batch) {
        batch.addEvent(this);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    private void calculateAttackResult(AttackResult result) {
        switch (result) {
            case CRIT:

                return;
            case HIT:
                return;
            case MISS:
                return;
            case DODGE:
                return;
            case PARRY:
                return;
            case GLANCE:
                return;
        }
    }
}
