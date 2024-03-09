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

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import io.kubernetes.client.openapi.ApiException;
import java.net.HttpURLConnection;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class LeaderElectionTest {

  @BeforeEach
  void setUp() {
    MockResourceLock.lock = new ReentrantLock();
    MockResourceLock.leaderRecord = null;
  }

  @Mock private Lock lock;

  @Test
  void simpleLeaderElection() throws InterruptedException {
    List<String> electionHistory = new ArrayList<>();
    List<String> leadershipHistory = new ArrayList<>();

    MockResourceLock mockLock = new MockResourceLock("mock");
    mockLock.renewCountMax = 3;
    mockLock.onCreate =
        record -> {
          electionHistory.add("create record");
          leadershipHistory.add("get leadership");
        };
    mockLock.onUpdate =
        record -> {
          electionHistory.add("update record");
        };
    mockLock.onChange =
        record -> {
          electionHistory.add("change record");
        };

    LeaderElectionConfig leaderElectionConfig = new LeaderElectionConfig();
    leaderElectionConfig.setLock(mockLock);
    leaderElectionConfig.setLeaseDuration(Duration.ofMillis(1000));
    leaderElectionConfig.setRetryPeriod(Duration.ofMillis(500));
    leaderElectionConfig.setRenewDeadline(Duration.ofMillis(600));
    LeaderElector leaderElector = new LeaderElector(leaderElectionConfig);

    CountDownLatch testLeaderElectionLatch = new CountDownLatch(2);
    ExecutorService leaderElectionWorker = Executors.newSingleThreadExecutor();
    leaderElectionWorker.submit(
        () -> {
          leaderElector.run(
              () -> {
                leadershipHistory.add("start leading");
                testLeaderElectionLatch.countDown();
              },
              () -> {
                leadershipHistory.add("stop leading");
                testLeaderElectionLatch.countDown();
              });
        });

    testLeaderElectionLatch.await(10, SECONDS);

    assertHistory(electionHistory, "create record", "update record", "update record");
    assertHistory(leadershipHistory, "get leadership", "start leading", "stop leading");
  }

  @Test
  void leaderElection() throws InterruptedException {
    List<String> electionHistory = new ArrayList<>();
    List<String> leadershipHistory = new ArrayList<>();
    CountDownLatch lockAStopLeading = new CountDownLatch(1);

    MockResourceLock mockLockA = new MockResourceLock("mockA");
    mockLockA.renewCountMax = 3;
    mockLockA.onCreate =
        record -> {
          electionHistory.add("A creates record");
          leadershipHistory.add("A gets leadership");
        };
    mockLockA.onUpdate =
        record -> {
          electionHistory.add("A updates record");
        };
    mockLockA.onChange =
        record -> {
          leadershipHistory.add("A gets leadership");
        };
    LeaderElectionConfig leaderElectionConfigA = new LeaderElectionConfig();
    leaderElectionConfigA.setLock(mockLockA);
    leaderElectionConfigA.setLeaseDuration(Duration.ofMillis(500));
    leaderElectionConfigA.setRetryPeriod(Duration.ofMillis(300));
    leaderElectionConfigA.setRenewDeadline(Duration.ofMillis(400));
    LeaderElector leaderElectorA = new LeaderElector(leaderElectionConfigA);

    MockResourceLock mockLockB = new MockResourceLock("mockB");
    mockLockB.renewCountMax = 4;
    mockLockB.onCreate =
        record -> {
          electionHistory.add("B creates record");
          leadershipHistory.add("B gets leadership");
        };
    mockLockB.onUpdate =
        record -> {
          electionHistory.add("B updates record");
        };
    mockLockB.onChange =
        record -> {
          leadershipHistory.add("B gets leadership");
        };
    LeaderElectionConfig leaderElectionConfigB = new LeaderElectionConfig();
    leaderElectionConfigB.setLock(mockLockB);
    leaderElectionConfigB.setLeaseDuration(Duration.ofMillis(500));
    leaderElectionConfigB.setRetryPeriod(Duration.ofMillis(300));
    leaderElectionConfigB.setRenewDeadline(Duration.ofMillis(400));
    LeaderElector leaderElectorB = new LeaderElector(leaderElectionConfigB);

    CountDownLatch testLeaderElectionLatch = new CountDownLatch(4);
    ExecutorService leaderElectionWorker = Executors.newFixedThreadPool(2);
    leaderElectionWorker.submit(
        () -> {
          leaderElectorA.run(
              () -> {
                leadershipHistory.add("A starts leading");
                testLeaderElectionLatch.countDown();
              },
              () -> {
                leadershipHistory.add("A stops leading");
                testLeaderElectionLatch.countDown();
                lockAStopLeading.countDown();
              });
        });

    lockAStopLeading.await(3, SECONDS);
    leaderElectionWorker.submit(
        () -> {
          leaderElectorB.run(
              () -> {
                leadershipHistory.add("B starts leading");
                testLeaderElectionLatch.countDown();
              },
              () -> {
                leadershipHistory.add("B stops leading");
                testLeaderElectionLatch.countDown();
              });
        });

    testLeaderElectionLatch.await(10, SECONDS);

    assertHistory(
        electionHistory,
        "A creates record",
        "A updates record",
        "A updates record",
        "B updates record",
        "B updates record",
        "B updates record",
        "B updates record");
    assertHistory(
        leadershipHistory,
        "A gets leadership",
        "A starts leading",
        "A stops leading",
        "B gets leadership",
        "B starts leading",
        "B stops leading");
  }

  @Test
  void leaderElectionWithRenewDeadline() throws InterruptedException {
    List<String> electionHistory = new ArrayList<>();
    List<String> leadershipHistory = new ArrayList<>();

    CountDownLatch testLockAccessLatch = new CountDownLatch(9);
    MockResourceLock mockLock = new MockResourceLock("mock");
    mockLock.renewCountMax = 3;
    mockLock.onCreate =
        record -> {
          electionHistory.add("create record");
          leadershipHistory.add("get leadership");
          testLockAccessLatch.countDown();
        };
    mockLock.onUpdate =
        record -> {
          electionHistory.add("update record");
          testLockAccessLatch.countDown();
        };
    mockLock.onChange =
        record -> {
          electionHistory.add("change record");
          testLockAccessLatch.countDown();
        };
    mockLock.onTryUpdate =
        record -> {
          electionHistory.add("try update record");
          testLockAccessLatch.countDown();
        };

    LeaderElectionConfig leaderElectionConfig = new LeaderElectionConfig();
    leaderElectionConfig.setLock(mockLock);
    leaderElectionConfig.setLeaseDuration(Duration.ofMillis(1000));
    leaderElectionConfig.setRetryPeriod(Duration.ofMillis(200));
    leaderElectionConfig.setRenewDeadline(Duration.ofMillis(700));
    LeaderElector leaderElector = new LeaderElector(leaderElectionConfig);

    CountDownLatch testLeaderElectionLatch = new CountDownLatch(2);
    ExecutorService leaderElectionWorker = Executors.newSingleThreadExecutor();
    leaderElectionWorker.submit(
        () -> {
          leaderElector.run(
              () -> {
                leadershipHistory.add("start leading");
                testLeaderElectionLatch.countDown();
              },
              () -> {
                leadershipHistory.add("stop leading");
                testLeaderElectionLatch.countDown();
              });
        });

    testLeaderElectionLatch.await(10, SECONDS);
    testLockAccessLatch.await(10, SECONDS);

    assertWildcardHistory(
        electionHistory,
        "create record",
        "try update record+",
        "update record",
        "try update record+",
        "update record",
        "try update record+");
    assertHistory(leadershipHistory, "get leadership", "start leading", "stop leading");
  }

  private void assertHistory(List<String> history, String... expected) {
    assertThat(expected).isNotNull();
    assertThat(history).isNotNull();
    assertThat(history).hasSize(expected.length);

    for (int index = 0; index < history.size(); ++index) {
      assertThat(history.get(index))
          .withFailMessage(
              "Not equal at index %d, expected %s, got %s",
              index, expected[index], history.get(index))
          .isEqualTo(expected[index]);
    }
  }

  // assertWildcardHistory allows for an arbitrary number of repeated entries for an
  // comparison with a '+' suffix. This allows for a semantic rather than literal
  // comparison to avoid issues of timing.
  private void assertWildcardHistory(List<String> history, String... expected) {
    assertThat(expected).isNotNull();
    assertThat(history).isNotNull();

    // TODO: This code is too complicated and a little bit buggy, but it works
    // for the current limited use case. Clean this up!
    int expectedIx = 0;
    for (int index = 0; index < history.size(); ++index) {
      String compare = expected[expectedIx];
      if (compare.endsWith("+")) {
        compare = compare.substring(0, compare.length() - 1);
        if (!history.get(index).equals(compare)) {
          expectedIx++;
          compare = expected[expectedIx];
          expectedIx++;
        }
      } else {
        expectedIx++;
      }
      assertThat(history.get(index))
          .withFailMessage(
              "Not equal at index %d, expected %s, got %s", index, compare, history.get(index))
          .isEqualTo(compare);
    }
  }

  @Test
  void leaderElectionCaptureException() throws ApiException, InterruptedException {
    RuntimeException expectedException = new RuntimeException("noxu");
    AtomicReference<Throwable> actualException = new AtomicReference<>();
    when(lock.get()).thenThrow(expectedException);
    LeaderElectionConfig leaderElectionConfig = new LeaderElectionConfig();
    leaderElectionConfig.setLock(lock);
    leaderElectionConfig.setLeaseDuration(Duration.ofMillis(1000));
    leaderElectionConfig.setRetryPeriod(Duration.ofMillis(200));
    leaderElectionConfig.setRenewDeadline(Duration.ofMillis(700));
    final CountDownLatch cLatch = new CountDownLatch(1);
    LeaderElector leaderElector =
        new LeaderElector(
            leaderElectionConfig,
            (t) -> {
              actualException.set(t);
              cLatch.countDown();
            });

    ExecutorService leaderElectionWorker = Executors.newFixedThreadPool(1);
    leaderElectionWorker.submit(
        () -> {
          leaderElector.run(() -> {}, () -> {});
        });
    cLatch.await();

    assertThat(actualException.get()).hasCause(expectedException);
  }

  @Test
  void leaderElectionReportLeaderOnStart() throws ApiException, InterruptedException {
    when(lock.identity()).thenReturn("foo1");
    when(lock.get())
        .thenReturn(
            new LeaderElectionRecord() {
              {
                setHolderIdentity("foo2");
                setAcquireTime(new Date());
                setRenewTime(new Date());
                setLeaderTransitions(1);
                setLeaseDurationSeconds(60);
              }
            })
        .thenReturn(
            new LeaderElectionRecord() {
              {
                setHolderIdentity("foo3");
                setAcquireTime(new Date());
                setRenewTime(new Date());
                setLeaderTransitions(1);
                setLeaseDurationSeconds(60);
              }
            });

    List<String> notifications = new ArrayList<>();
    LeaderElectionConfig leaderElectionConfig = new LeaderElectionConfig();
    leaderElectionConfig.setLock(lock);
    leaderElectionConfig.setLeaseDuration(Duration.ofMillis(1000));
    leaderElectionConfig.setRetryPeriod(Duration.ofMillis(200));
    leaderElectionConfig.setRenewDeadline(Duration.ofMillis(700));
    LeaderElector leaderElector = new LeaderElector(leaderElectionConfig);
    ExecutorService leaderElectionWorker = Executors.newFixedThreadPool(1);
    final CountDownLatch cLatch = new CountDownLatch(2);
    leaderElectionWorker.submit(
        () -> {
          leaderElector.run(
              () -> {},
              () -> {},
              (id) -> {
                notifications.add(id);
                cLatch.countDown();
              });
        });

    // wait for two notifications to occur.
    cLatch.await();

    assertThat(notifications).containsExactly("foo2", "foo3");
  }

  @Test
  void leaderElectionShouldReportLeaderItAcquiresOnStart()
      throws ApiException, InterruptedException {
    when(lock.identity()).thenReturn("foo1");
    when(lock.get())
        .thenReturn(
            new LeaderElectionRecord() {
              {
                setHolderIdentity("foo1");
                setAcquireTime(new Date());
                setRenewTime(new Date());
                setLeaderTransitions(1);
                setLeaseDurationSeconds(60);
              }
            });
    List<String> notifications = new ArrayList<>();
    LeaderElectionConfig leaderElectionConfig = new LeaderElectionConfig();
    leaderElectionConfig.setLock(lock);
    leaderElectionConfig.setLeaseDuration(Duration.ofMillis(1000));
    leaderElectionConfig.setRetryPeriod(Duration.ofMillis(200));
    leaderElectionConfig.setRenewDeadline(Duration.ofMillis(700));
    LeaderElector leaderElector = new LeaderElector(leaderElectionConfig);
    ExecutorService leaderElectionWorker = Executors.newFixedThreadPool(1);
    final CountDownLatch cLatch = new CountDownLatch(1);
    leaderElectionWorker.submit(
        () -> {
          leaderElector.run(
              () -> {},
              () -> {},
              (id) -> {
                notifications.add(id);
                cLatch.countDown();
              });
        });

    cLatch.await();
    assertThat(notifications).hasSize(1);
    assertThat(notifications.get(0)).isEqualTo("foo1");
  }

  public static class MockResourceLock implements Lock {

    public static ReentrantLock lock;
    public static LeaderElectionRecord leaderRecord;

    public int renewCount = 0;
    public int renewCountMax = 4;

    private Consumer<LeaderElectionRecord> onCreate;
    private Consumer<LeaderElectionRecord> onUpdate;
    private Consumer<LeaderElectionRecord> onChange;
    private Consumer<LeaderElectionRecord> onTryUpdate;

    private String iden;

    public MockResourceLock(String iden) {
      this.iden = iden;
    }

    @Override
    public LeaderElectionRecord get() throws ApiException {
      lock.lock();
      try {
        if (leaderRecord == null) {
          throw new ApiException("Record Not Found", HttpURLConnection.HTTP_NOT_FOUND, null, null);
        }
        return leaderRecord;
      } finally {
        lock.unlock();
      }
    }

    @Override
    public boolean create(LeaderElectionRecord record) {
      lock.lock();
      try {
        if (leaderRecord != null) {
          return false;
        }
        leaderRecord = record;
        onCreate.accept(record);
        renewCount++;
        return true;
      } finally {
        lock.unlock();
      }
    }

    @Override
    public boolean update(LeaderElectionRecord record) {
      lock.lock();
      try {
        if (onTryUpdate != null) {
          onTryUpdate.accept(record);
        }
        if (renewCount >= renewCountMax) {
          return false;
        }
        LeaderElectionRecord oldRecord = leaderRecord;
        leaderRecord = record;
        onUpdate.accept(record);
        if (!oldRecord.getHolderIdentity().equals(record.getHolderIdentity())) {
          onChange.accept(record);
        }
        renewCount++;
        return true;
      } finally {
        lock.unlock();
      }
    }

    @Override
    public String identity() {
      return this.iden;
    }

    @Override
    public String describe() {
      return iden;
    }
  }
}
