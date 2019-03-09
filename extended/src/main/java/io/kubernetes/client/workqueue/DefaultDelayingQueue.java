package io.kubernetes.client.workqueue;

import com.google.common.primitives.Longs;

import java.time.Duration;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * The default delaying queue implementation.
 */
public class DefaultDelayingQueue extends DefaultWorkQueue implements DelayingQueue {

    private DelayQueue      delayQueue    = new DelayQueue();
    private ExecutorService waitingWorker = Executors.newSingleThreadExecutor();

    public DefaultDelayingQueue() {
        waitingWorker.submit(this::waitingLoop);
    }

    public void addAfter(Object item, Duration duration) {
        // don't add if we're already shutting down
        if (super.shuttingDown()) {
            return;
        }

        // immediately add things w/o delay
        if (duration.isZero()) {
            super.add(item);
            return;
        }
        WaitForEntry entry = new WaitForEntry();
        entry.data = item;
        entry.readyAtMillis = System.currentTimeMillis() + duration.toMillis();
        delayQueue.offer(entry);
    }

    public void waitingLoop() {
        try {
            while (true) {
                if (super.shuttingDown()) {
                    return;
                }
                WaitForEntry entry = (WaitForEntry) delayQueue.take();
                super.add(entry.data);
            }
        } catch (InterruptedException e) {
            return;
        }
    }

    private class WaitForEntry implements Delayed {

        private Object data;
        private long   readyAtMillis;

        @Override
        public long getDelay(TimeUnit unit) {
            return unit.convert(readyAtMillis - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        @Override
        public int compareTo(Delayed o) {
            return Longs.compare(readyAtMillis, ((WaitForEntry) o).readyAtMillis);
        }
    }
}
