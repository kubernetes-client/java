/*
Copyright 2020 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.extended.controller;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.kubernetes.client.extended.leaderelection.LeaderElectionConfig;
import io.kubernetes.client.extended.leaderelection.LeaderElectionRecord;
import io.kubernetes.client.extended.leaderelection.LeaderElector;
import io.kubernetes.client.extended.leaderelection.Lock;
import io.kubernetes.client.openapi.ApiException;
import java.net.HttpURLConnection;
import java.time.Duration;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class LeaderElectingControllerTest {

  @Mock private Controller mockController;

  @Mock private Lock mockLock;

  @Test
  @Timeout(value = 90000, unit = TimeUnit.MILLISECONDS)
  void leaderElectingController() throws ApiException, InterruptedException {

    AtomicReference<LeaderElectionRecord> record = new AtomicReference<>();
    record.set(new LeaderElectionRecord());

    Semaphore apiClientSem = new Semaphore(0);
    Semaphore controllerStartSem = new Semaphore(0);
    Semaphore controllerStopSem = new Semaphore(0);

    when(mockLock.identity()).thenReturn("foo");
    when(mockLock.get())
        .thenThrow(
            new ApiException("Record Not Found", HttpURLConnection.HTTP_NOT_FOUND, null, null))
        .thenReturn(record.get());

    doAnswer(
            invocationOnMock -> {
              record.set(invocationOnMock.getArgument(0));
              apiClientSem.release();
              return true;
            })
        .when(mockLock)
        .create(any());

    doAnswer(
            invocationOnMock -> {
              record.set(invocationOnMock.getArgument(0));
              apiClientSem.release();
              return true;
            })
        .when(mockLock)
        .update(any());

    doAnswer(
            invocationOnMock -> {
              controllerStartSem.release();
              return null;
            })
        .when(mockController)
        .run();

    doAnswer(
            invocationOnMock -> {
              controllerStopSem.release();
              return null;
            })
        .when(mockController)
        .shutdown();

    LeaderElectingController leaderElectingController =
        new LeaderElectingController(
            new LeaderElector(
                new LeaderElectionConfig(
                    mockLock,
                    Duration.ofMillis(300),
                    Duration.ofMillis(200),
                    Duration.ofMillis(100))),
            mockController);

    Thread controllerThread = new Thread(leaderElectingController::run);
    controllerThread.start();
    apiClientSem.acquire(2);
    controllerStartSem.acquire(1);
    controllerThread.interrupt();

    verify(mockLock, times(1)).create(any());
    verify(mockLock, atLeastOnce()).update(any());

    controllerStopSem.acquire(1);
    verify(mockController, times(1)).run();
    verify(mockController, times(1)).shutdown();
  }
}
