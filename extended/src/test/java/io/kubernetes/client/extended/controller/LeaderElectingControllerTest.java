package io.kubernetes.client.extended.controller;

import static org.junit.Assert.*;

import io.kubernetes.client.extended.leaderelection.LeaderElectionConfig;
import io.kubernetes.client.extended.leaderelection.LeaderElector;
import io.kubernetes.client.extended.leaderelection.resourcelock.EndpointsLock;
import java.time.Duration;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import org.junit.Test;

public class LeaderElectingControllerTest {

  private ExecutorService controllerThread = Executors.newSingleThreadExecutor();
  private final int stepCooldownIntervalInMillis = 500;

  private void cooldown() {
    try {
      Thread.sleep(stepCooldownIntervalInMillis);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  @Test
  public void testLeaderElectingController() {

    AtomicBoolean startTriggered = new AtomicBoolean(false);
    AtomicBoolean stopTriggered = new AtomicBoolean(false);

    MockLeaderElector leaderElector = new MockLeaderElector();

    LeaderElectingController leaderElectingController =
        new LeaderElectingController(
            leaderElector,
            new Controller() {
              @Override
              public void shutdown() {
                stopTriggered.set(true);
              }

              @Override
              public void run() {
                startTriggered.set(true);
              }
            });

    controllerThread.submit(leaderElectingController::run);
    cooldown();

    leaderElector.start();
    assertTrue(startTriggered.get());
    leaderElector.stop();
    assertTrue(stopTriggered.get());
  }

  private class MockLeaderElector extends LeaderElector {

    Runnable startHook;
    Runnable stopHook;

    private MockLeaderElector() {
      super(
          new LeaderElectionConfig(
              new EndpointsLock("default", "foo", "identity"),
              Duration.ofMillis(500),
              Duration.ofMillis(400),
              Duration.ofMillis(300)));
    }

    private void start() {
      startHook.run();
    }

    private void stop() {
      stopHook.run();
    }

    @Override
    public void run(Runnable startLeadingHook, Runnable stopLeadingHook) {
      startHook = startLeadingHook;
      stopHook = stopLeadingHook;
    }
  }
}
