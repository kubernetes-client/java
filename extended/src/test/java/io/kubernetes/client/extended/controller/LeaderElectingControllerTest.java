package io.kubernetes.client.extended.controller;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import io.kubernetes.client.ApiException;
import io.kubernetes.client.extended.leaderelection.LeaderElectionConfig;
import io.kubernetes.client.extended.leaderelection.LeaderElectionRecord;
import io.kubernetes.client.extended.leaderelection.LeaderElector;
import io.kubernetes.client.extended.leaderelection.Lock;
import java.time.Duration;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LeaderElectingControllerTest {

  @Mock private Controller mockController;

  @Mock private Lock mockLock;

  private final int stepCooldownIntervalInMillis = 500;

  private void cooldown() {
    try {
      Thread.sleep(stepCooldownIntervalInMillis);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  @Test
  public void testLeaderElectingController() throws ApiException {

    AtomicReference<LeaderElectionRecord> record = new AtomicReference<>();
    record.set(new LeaderElectionRecord());

    when(mockLock.identity()).thenReturn("foo");

    doAnswer(invocationOnMock -> record.get()).when(mockLock).get();

    doAnswer(
            invocationOnMock -> {
              record.set(invocationOnMock.getArgument(0));
              return true;
            })
        .when(mockLock)
        .create(any());

    doReturn(false).when(mockLock).update(any());

    LeaderElectingController leaderElectingController =
        new LeaderElectingController(
            new LeaderElector(
                new LeaderElectionConfig(
                    mockLock, Duration.ofMillis(30), Duration.ofMillis(20), Duration.ofMillis(10))),
            mockController);

    ExecutorService controllerThread = Executors.newSingleThreadExecutor();
    controllerThread.submit(leaderElectingController::run);
    cooldown();

    verify(mockLock, times(1)).create(any());
    verify(mockLock, atLeastOnce()).update(any());

    verify(mockController, times(1)).run();
    verify(mockController, times(1)).shutdown();
  }
}
