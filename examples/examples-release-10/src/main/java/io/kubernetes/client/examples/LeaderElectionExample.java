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
package io.kubernetes.client.examples;

import io.kubernetes.client.extended.leaderelection.LeaderElectionConfig;
import io.kubernetes.client.extended.leaderelection.LeaderElector;
import io.kubernetes.client.extended.leaderelection.resourcelock.EndpointsLock;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.util.Config;
import java.time.Duration;
import java.util.UUID;

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

    // New
    String appNamespace = "default";
    String appName = "leader-election-foobar";
    String lockHolderIdentityName = UUID.randomUUID().toString(); // Anything unique
    EndpointsLock lock = new EndpointsLock(appNamespace, appName, lockHolderIdentityName);

    LeaderElectionConfig leaderElectionConfig =
        new LeaderElectionConfig(
            lock, Duration.ofMillis(10000), Duration.ofMillis(8000), Duration.ofMillis(2000));
    try (LeaderElector leaderElector = new LeaderElector(leaderElectionConfig)) {
      leaderElector.run(
          () -> {
            System.out.println("Do something when getting leadership.");
          },
          () -> {
            System.out.println("Do something when losing leadership.");
          });
    }
  }
}
