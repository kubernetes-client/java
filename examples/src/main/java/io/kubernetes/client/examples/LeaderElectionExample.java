package io.kubernetes.client.examples;

import io.kubernetes.client.ApiClient;
import io.kubernetes.client.Configuration;
import io.kubernetes.client.extended.leaderelection.LeaderElectionConfig;
import io.kubernetes.client.extended.leaderelection.LeaderElector;
import io.kubernetes.client.extended.leaderelection.resourcelock.EndpointsLock;
import io.kubernetes.client.util.Config;
import java.time.Duration;

/**
 * A simple example of how to use the Java API
 *
 * <p>Easiest way to run this: mvn exec:java
 * -Dexec.mainClass="io.kubernetes.client.examples.LeaderElectionExample"
 *
 * <p>From inside $REPO_DIR/examples
 */
public class LeaderElectionExample {
  public static void main(String[] args) throws Exception {
    ApiClient client = Config.defaultClient();
    Configuration.setDefaultApiClient(client);

    EndpointsLock lock = new EndpointsLock("kube-system", "leader-election", "foo");

    LeaderElectionConfig leaderElectionConfig =
        new LeaderElectionConfig(
            lock, Duration.ofMillis(10000), Duration.ofMillis(8000), Duration.ofMillis(2000));
    LeaderElector leaderElector = new LeaderElector(leaderElectionConfig);

    leaderElector.run(
        () -> {
          System.out.println("Do something when getting leadership.");
        },
        () -> {
          System.out.println("Do something when losing leadership.");
        });
  }
}
