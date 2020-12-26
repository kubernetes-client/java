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
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import io.kubernetes.client.openapi.ApiException;
import java.net.HttpURLConnection;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LeaderElectionTest {

  @Before
  public void setUp() {
    MockResourceLock.lock = new ReentrantLock();
    MockResourceLock.leaderRecord = null;
  }

  @Mock private Lock lock;

  @Test
  public void testSimpleLeaderElection() throws InterruptedException {
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
  public void testLeaderElection() throws InterruptedException {
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
  public void testLeaderElectionWithRenewDeadline() throws InterruptedException {
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
    mockLock.onTryUpdate =
        record -> {
          electionHistory.add("try update record");
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

    assertHistory(
        electionHistory,
        "create record",
        "try update record",
        "update record",
        "try update record",
        "update record",
        "try update record",
        "try update record",
        "try update record",
        "try update record");
    assertHistory(leadershipHistory, "get leadership", "start leading", "stop leading");
  }

  private void assertHistory(List<String> history, String... expected) {
    Assert.assertNotNull(expected);
    Assert.assertNotNull(history);
    Assert.assertEquals(expected.length, history.size());

    for (int index = 0; index < history.size(); ++index) {
      Assert.assertEquals(
          String.format(
              "Not equal at index %d, expected %s, got %s",
              index, expected[index], history.get(index)),
          expected[index],
          history.get(index));
    }
  }

  @Test
  public void testLeaderElectionCaptureException() throws ApiException, InterruptedException {
    RuntimeException expectedException = new RuntimeException("noxu");
    AtomicReference<Throwable> actualException = new AtomicReference<>();
    when(lock.get()).thenThrow(expectedException);
    LeaderElectionConfig leaderElectionConfig = new LeaderElectionConfig();
    leaderElectionConfig.setLock(lock);
    leaderElectionConfig.setLeaseDuration(Duration.ofMillis(1000));
    leaderElectionConfig.setRetryPeriod(Duration.ofMillis(200));
    leaderElectionConfig.setRenewDeadline(Duration.ofMillis(700));
    LeaderElector leaderElector =
        new LeaderElector(leaderElectionConfig, (t) -> actualException.set(t));

    ExecutorService leaderElectionWorker = Executors.newFixedThreadPool(1);
    leaderElectionWorker.submit(
        () -> {
          leaderElector.run(() -> {}, () -> {});
        });
    // TODO: Remove this sleep
    Thread.sleep(Duration.ofSeconds(2).toMillis());
    assertEquals(expectedException, actualException.get().getCause());
  }

  @Test
  public void testLeaderElectionReportLeaderOnStart() throws ApiException, InterruptedException {
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
    final Semaphore s = new Semaphore(2);
    s.acquire(2);
    leaderElectionWorker.submit(
        () -> {
          leaderElector.run(
              () -> {},
              () -> {},
              (id) -> {
                notifications.add(id);
                s.release();
              });
        });

    // wait for two notifications to occur.
    s.acquire(2);

    assertEquals(2, notifications.size());
    assertEquals("foo2", notifications.get(0));
    assertEquals("foo3", notifications.get(1));
  }

  @Test
  public void testLeaderElectionShouldReportLeaderItAcquiresOnStart()
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
    Semaphore s = new Semaphore(1);
    s.acquire();
    leaderElectionWorker.submit(
        () -> {
          leaderElector.run(
              () -> {},
              () -> {},
              (id) -> {
                notifications.add(id);
                s.release();
              });
        });

    s.acquire();
    assertEquals(1, notifications.size());
    assertEquals("foo1", notifications.get(0));
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
