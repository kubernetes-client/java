package io.kubernetes.client.extended.leaderelection;

import static java.util.concurrent.TimeUnit.SECONDS;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LeaderElectionTest {

  @Before
  public void setUp() {
    MockResourceLock.lock = new ReentrantLock();
    MockResourceLock.leaderRecord = null;
  }

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
    public LeaderElectionRecord get() {
      lock.lock();
      try {
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
