package hoang.vincent.ClassicRogueSim.queue;

import hoang.vincent.ClassicRogueSim.queue.events.DamageEvent;
import java.util.concurrent.LinkedBlockingQueue;

public class Batch {

    private LinkedBlockingQueue<DamageEvent> queue;

    public Batch() {
        queue = new LinkedBlockingQueue<>();
    }

    public void addEvent(DamageEvent event) {
        queue.add(event);
    }
}
