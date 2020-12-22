package hoang.vincent.ClassicRogueSim.queue;

import hoang.vincent.ClassicRogueSim.queue.events.DamageEvent;
import java.util.concurrent.LinkedBlockingQueue;

public class Batch {

    private int batchId;

    private LinkedBlockingQueue<DamageEvent> queue;
    private double totalBatchDamage = 0;

    public Batch(int batchId) {
        this.batchId = batchId;
        queue = new LinkedBlockingQueue<>();
    }

    public void addEvent(DamageEvent event) {
        queue.add(event);
    }

    public void addDamageToTotal(double damage) {
        totalBatchDamage += damage;
    }
}
