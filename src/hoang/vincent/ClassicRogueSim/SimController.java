package hoang.vincent.ClassicRogueSim;

import hoang.vincent.ClassicRogueSim.queue.Batch;

import java.util.ArrayList;
import java.util.List;

public class SimController {

    private final SimController controller;
    private List<Batch> completedBatches = new ArrayList<>();
    private Batch currentBatch;
    private int currentBatchId;

    private SimController() {
        controller = new SimController();
        currentBatchId = 0;
    }

    public SimController getController() {
        return this.controller;
    }

    private Batch startNewBatch() {
        if (currentBatch == null) {
            currentBatch = new Batch(++currentBatchId);
        }

        completedBatches.add(currentBatch);

        Batch batch = new Batch(++currentBatchId);
        currentBatch = batch;

        return batch;
    }

    public Batch getCurrentBatch() {
        return currentBatch;
    }

}
