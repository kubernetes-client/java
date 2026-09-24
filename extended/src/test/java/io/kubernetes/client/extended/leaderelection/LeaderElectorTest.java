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
package io.kubernetes.client.extended.leaderelection;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;
import java.util.Date;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

/** Leader Election tests using "simulated" locks created by {@link LockSmith} */
class LeaderElectorTest {
  /**
   * Tests that when a leader candidate is stopped gracefully, second candidate immediately becomes
   * leader.
   */
  @Test
  @Timeout(value = 20000L, unit = TimeUnit.MILLISECONDS)
  void leaderGracefulShutdown() throws Exception {
    LockSmith lockSmith = new LockSmith();

    CountDownLatch startBeingLeader1 = new CountDownLatch(1);
    CountDownLatch stopBeingLeader1 = new CountDownLatch(1);

    LeaderElector leaderElector1 =
        makeAndRunLeaderElectorAsync(lockSmith, "candidate1", startBeingLeader1, stopBeingLeader1);

    // wait for candidate1 to become leader
    startBeingLeader1.await();

    CountDownLatch startBeingLeader2 = new CountDownLatch(1);
    CountDownLatch stopBeingLeader2 = new CountDownLatch(1);

    LeaderElector leaderElector2 =
        makeAndRunLeaderElectorAsync(lockSmith, "candidate2", startBeingLeader2, stopBeingLeader2);

    leaderElector1.close();

    // ensure stopBeingLeader hook is called
    stopBeingLeader1.await();

    // wait for candidate2 to become leader
    startBeingLeader2.await();

    leaderElector2.close();
  }

  @Test
  @Timeout(value = 20000L, unit = TimeUnit.MILLISECONDS)
  void leaderTransitionHook() throws InterruptedException {
    LockSmith lockSmith = new LockSmith();

    CountDownLatch startBeingLeader1 = new CountDownLatch(1);
    CountDownLatch stopBeingLeader1 = new CountDownLatch(1);

    LeaderElector leaderElector1 =
        makeAndRunLeaderElectorAsync(
            lockSmith, "candidate1", startBeingLeader1, stopBeingLeader1, (id) -> {});

    // wait for candidate1 to become leader
    startBeingLeader1.await();

    // start candidate2 and the transition hook should be called on the start
    CountDownLatch startBeingLeader2 = new CountDownLatch(1);
    CountDownLatch stopBeingLeader2 = new CountDownLatch(1);
    CountDownLatch notifiedLeader = new CountDownLatch(1);
    String expectedLeader = "candidate1";
    LeaderElector leaderElector2 =
        makeAndRunLeaderElectorAsync(
            lockSmith,
            "candidate2",
            startBeingLeader2,
            stopBeingLeader2,
            (id) -> {
              if (expectedLeader.equals(id)) {
                notifiedLeader.countDown();
              }
            });

    notifiedLeader.await();

    // start candidate1
    leaderElector1.close();

    // ensure stopBeingLeader hook is called
    stopBeingLeader1.await();

    // wait for candidate2 to become leader
    startBeingLeader2.await();
  }

  /**
   * Tests that on the very first run, a LeaderElector immediately acquires an existing lock whose
   * lease has already expired, rather than waiting an extra leaseDuration before taking over.
   */
  @Test
  @Timeout(value = 20000L, unit = TimeUnit.MILLISECONDS)
  void acquiresAlreadyExpiredLeaseImmediately() throws Exception {
    LockSmith lockSmith = new LockSmith();

    Duration leaseDuration = Duration.ofMillis(TimeUnit.SECONDS.toMillis(10));

    // Simulate a lock that was last renewed well beyond the lease duration in the past, as if
    // its previous holder had crashed a long time ago and this is the first time any candidate
    // observes the (already expired) record.
    Date longAgo = new Date(System.currentTimeMillis() - leaseDuration.toMillis() * 3);
    Lock lock = lockSmith.makeLock("previous-holder");
    lock.create(
        new LeaderElectionRecord(
            "previous-holder", (int) leaseDuration.getSeconds(), longAgo, longAgo, 0));

    CountDownLatch startBeingLeader = new CountDownLatch(1);
    CountDownLatch stopBeingLeader = new CountDownLatch(1);

    makeAndRunLeaderElectorAsync(lockSmith, "candidate1", startBeingLeader, stopBeingLeader);

    // With the fix, the new candidate should become leader almost immediately, well before the
    // full lease duration elapses, since the observed record is already expired.
    assertTrue(
        startBeingLeader.await(leaseDuration.toMillis() / 2, TimeUnit.MILLISECONDS),
        "expected candidate to acquire the already-expired lease promptly");
  }

  private LeaderElector makeAndRunLeaderElectorAsync(
      LockSmith lockSmith,
      String lockIdentity,
      CountDownLatch startBeingLeader,
      CountDownLatch stopBeingLeader) {
    return makeAndRunLeaderElectorAsync(
        lockSmith, lockIdentity, startBeingLeader, stopBeingLeader, (id) -> {});
  }

  private LeaderElector makeAndRunLeaderElectorAsync(
      LockSmith lockSmith,
      String lockIdentity,
      CountDownLatch startBeingLeader,
      CountDownLatch stopBeingLeader,
      Consumer<String> onNewLeaderHook) {
    LeaderElectionConfig leaderElectionConfig =
        new LeaderElectionConfig(
            lockSmith.makeLock(lockIdentity),
            Duration.ofMillis(TimeUnit.SECONDS.toMillis(10)),
            Duration.ofMillis(TimeUnit.SECONDS.toMillis(9)),
            Duration.ofMillis(TimeUnit.SECONDS.toMillis(2)));
    LeaderElector leaderElector = new LeaderElector(leaderElectionConfig);

    Thread thread =
        new Thread(
            () ->
                leaderElector.run(
                    () -> startBeingLeader.countDown(),
                    () -> stopBeingLeader.countDown(),
                    onNewLeaderHook),
            String.format("%s-leader-elector-main", lockIdentity));
    thread.setDaemon(true);
    thread.start();

    return leaderElector;
  }
}
