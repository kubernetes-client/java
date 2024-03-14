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
package io.kubernetes.client.e2e.extended.leaderelection;

import static org.assertj.core.api.Assertions.assertThat;

import io.kubernetes.client.extended.leaderelection.LeaderElectionConfig;
import io.kubernetes.client.extended.leaderelection.LeaderElector;
import io.kubernetes.client.extended.leaderelection.Lock;
import io.kubernetes.client.extended.leaderelection.resourcelock.ConfigMapLock;
import io.kubernetes.client.extended.leaderelection.resourcelock.EndpointsLock;
import io.kubernetes.client.extended.leaderelection.resourcelock.LeaseLock;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.apis.CoordinationV1Api;
import io.kubernetes.client.openapi.apis.CoreV1Api;
import io.kubernetes.client.util.ClientBuilder;
import java.net.HttpURLConnection;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class LeaderElectorTest {

  private static final Logger LOGGER = LoggerFactory.getLogger(LeaderElectorTest.class);

  private static final String LOCK_RESOURCE_NAME = "leader-election-it";
  private static final String NAMESPACE = "default";

  private enum LockType {
    ConfigMap,
    Endpoints,
    Lease
  }

  public static Collection<Object[]> constructorFeeder() {
    final List<Object[]> args = new ArrayList<>();

    args.add(new Object[] {LockType.ConfigMap});
    args.add(new Object[] {LockType.Endpoints});
    args.add(new Object[] {LockType.Lease});

    return args;
  }

  private ApiClient apiClient;
  private LockType lockType;

  private void initLeaderElectorTest(LockType lockType) throws Exception {
    apiClient = ClientBuilder.defaultClient();
    // delete the lock resource if it exists, or else first leader candidate might need to wait for
    // a whole leaseDuration configured
    switch (lockType) {
      case ConfigMap:
        deleteConfigMapLockResource();
        break;
      case Endpoints:
        deleteEndpointsLockResource();
        break;
      case Lease:
        deleteLeaseLockResource();
        break;
      default:
        throw new RuntimeException("Unknown LockType " + lockType);
    }
    this.lockType = lockType;
  }

  @MethodSource("constructorFeeder")
  @ParameterizedTest(name = "{0}")
  @Timeout(value = 30000L, unit = TimeUnit.MILLISECONDS)
  void singleCandidateLeaderElection(LockType lockType) throws Exception {
    initLeaderElectorTest(lockType);
    CountDownLatch startLeadershipLatch = new CountDownLatch(1);
    CountDownLatch stopLeadershipLatch = new CountDownLatch(1);

    LeaderElector leaderElector =
        makeAndRunLeaderElectorAsync(
            "candidate",
            null,
            startLeadershipLatch::countDown,
            stopLeadershipLatch::countDown,
            apiClient);

    startLeadershipLatch.await();

    leaderElector.close();

    stopLeadershipLatch.await();
  }

  @MethodSource("constructorFeeder")
  @ParameterizedTest(name = "{0}")
  @Timeout(value = 30000L, unit = TimeUnit.MILLISECONDS)
  void multiCandidateLeaderElection(LockType lockType) throws Exception {
    initLeaderElectorTest(lockType);
    CyclicBarrier startBarrier = new CyclicBarrier(2);

    CountDownLatch startBeingLeader = new CountDownLatch(1);
    CountDownLatch stopBeingLeader = new CountDownLatch(1);

    AtomicInteger startBeingLeaderCount = new AtomicInteger();
    AtomicInteger stopBeingLeaderCount = new AtomicInteger();

    AtomicReference<String> leaderRef = new AtomicReference<>();

    String candidate1 = "candidate1";
    String candidate2 = "candidate2";

    LeaderElector leaderElector1 =
        makeAndRunLeaderElectorAsync(
            candidate1,
            startBarrier,
            () -> {
              startBeingLeaderCount.incrementAndGet();
              leaderRef.set(candidate1);
              startBeingLeader.countDown();
            },
            () -> {
              stopBeingLeaderCount.incrementAndGet();
              stopBeingLeader.countDown();
            },
            apiClient);

    LeaderElector leaderElector2 =
        makeAndRunLeaderElectorAsync(
            candidate2,
            startBarrier,
            () -> {
              startBeingLeaderCount.incrementAndGet();
              leaderRef.set(candidate2);
              startBeingLeader.countDown();
            },
            () -> {
              stopBeingLeaderCount.incrementAndGet();
              stopBeingLeader.countDown();
            },
            apiClient);

    // wait till someone becomes leader
    startBeingLeader.await();
    assertThat(leaderRef).doesNotHaveNullValue();
    assertThat(candidate1.equals(leaderRef.get()) || candidate2.equals(leaderRef.get())).isTrue();

    // stop both LeaderElectors, in order .. non-leader, then leader so that
    // non-leader doesn't get to become leader
    if (candidate1.equals(leaderRef.get())) {
      leaderElector2.close();
      leaderElector1.close();
    } else {
      leaderElector1.close();
      leaderElector2.close();
    }

    stopBeingLeader.await();

    // make sure that only one candidate became leader
    assertThat(startBeingLeaderCount).hasValue(1);
    assertThat(stopBeingLeaderCount).hasValue(1);
  }

  @MethodSource("constructorFeeder")
  @ParameterizedTest(name = "{0}")
  @Timeout(value = 45000L, unit = TimeUnit.MILLISECONDS)
  void leaderGracefulShutdown(LockType lockType) throws Exception {
    initLeaderElectorTest(lockType);
    CountDownLatch startBeingLeader1 = new CountDownLatch(1);
    CountDownLatch stopBeingLeader1 = new CountDownLatch(1);

    LeaderElector leaderElector1 =
        makeAndRunLeaderElectorAsync(
            "candidate1",
            null,
            startBeingLeader1::countDown,
            stopBeingLeader1::countDown,
            apiClient);

    // wait for candidate1 to become leader
    startBeingLeader1.await();

    CountDownLatch startBeingLeader2 = new CountDownLatch(1);
    CountDownLatch stopBeingLeader2 = new CountDownLatch(1);

    LeaderElector leaderElector2 =
        makeAndRunLeaderElectorAsync(
            "candidate2",
            null,
            startBeingLeader2::countDown,
            stopBeingLeader2::countDown,
            apiClient);

    leaderElector1.close();

    // ensure stopBeingLeader hook is called
    stopBeingLeader1.await();

    // wait for candidate2 to become leader
    startBeingLeader2.await();

    leaderElector2.close();
  }

  private LeaderElector makeAndRunLeaderElectorAsync(
      String candidateId,
      CyclicBarrier startBarrier,
      Runnable startBeingLeader,
      Runnable stopBeingLeader,
      ApiClient apiClient) {

    Lock lock = makeLock(candidateId, NAMESPACE, LOCK_RESOURCE_NAME, apiClient);

    LeaderElectionConfig leaderElectionConfig =
        new LeaderElectionConfig(
            lock, Duration.ofSeconds(30), Duration.ofSeconds(23), Duration.ofSeconds(3));
    LeaderElector leaderElector = new LeaderElector(leaderElectionConfig);

    Thread thread =
        new Thread(
            () -> {
              if (startBarrier != null) {
                try {
                  startBarrier.await();
                } catch (InterruptedException | BrokenBarrierException ex) {
                  LOGGER.error("startBarrier.await() failed", ex);
                  return;
                }
              }

              leaderElector.run(startBeingLeader, stopBeingLeader);
            },
            String.format("%s-leader-elector-main", candidateId));
    thread.setDaemon(true);
    thread.start();

    return leaderElector;
  }

  private Lock makeLock(
      String candidateId, String namespace, String lockResourceName, ApiClient k8sApiClient) {

    switch (lockType) {
      case ConfigMap:
        return new ConfigMapLock(namespace, lockResourceName, candidateId, k8sApiClient);
      case Endpoints:
        return new EndpointsLock(namespace, lockResourceName, candidateId, k8sApiClient);
      case Lease:
        return new LeaseLock(namespace, lockResourceName, candidateId, k8sApiClient);
      default:
        throw new RuntimeException("Unknown LockType " + lockType);
    }
  }

  private void deleteConfigMapLockResource() throws Exception {
    try {
      CoreV1Api coreV1Api = new CoreV1Api(apiClient);
      coreV1Api.deleteNamespacedConfigMap(
          LOCK_RESOURCE_NAME, NAMESPACE).execute();
    } catch (ApiException ex) {
      if (ex.getCode() != HttpURLConnection.HTTP_NOT_FOUND) {
        throw ex;
      }
    }
  }

  private void deleteEndpointsLockResource() throws Exception {
    try {
      CoreV1Api coreV1Api = new CoreV1Api(apiClient);
      coreV1Api.deleteNamespacedEndpoints(
          LOCK_RESOURCE_NAME, NAMESPACE).execute();
    } catch (ApiException ex) {
      if (ex.getCode() != HttpURLConnection.HTTP_NOT_FOUND) {
        throw ex;
      }
    }
  }

  private void deleteLeaseLockResource() throws Exception {
    try {
      CoordinationV1Api coordinationV1Api = new CoordinationV1Api(apiClient);
      coordinationV1Api.deleteNamespacedLease(
          LOCK_RESOURCE_NAME, NAMESPACE).execute();
    } catch (ApiException ex) {
      if (ex.getCode() != HttpURLConnection.HTTP_NOT_FOUND) {
        throw ex;
      }
    }
  }
}
