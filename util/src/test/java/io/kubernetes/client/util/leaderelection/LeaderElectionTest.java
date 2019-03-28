/*
Copyright 2019 The Kubernetes Authors.
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
package io.kubernetes.client.util.leaderelection;

import io.kubernetes.client.leaderelection.LeaderCallbacks;
import io.kubernetes.client.leaderelection.LeaderElectionConfig;
import io.kubernetes.client.leaderelection.LeaderElector;
import io.kubernetes.client.leaderelection.resourcelock.ConfigMapLock;
import io.kubernetes.client.leaderelection.resourcelock.ResourceLockConfig;
import io.kubernetes.client.util.Config;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.junit.Ignore;
import org.junit.Test;

@Ignore
public class LeaderElectionTest {

  @Test
  public void leaderelection() throws IOException {
    final String name = "my-cm-lock";
    final String namespace = "kube-system";

    ResourceLockConfig lockConfig = new ResourceLockConfig();
    lockConfig.setIdentity(String.format("%s-%s", name, System.currentTimeMillis()));
    ConfigMapLock lock = new ConfigMapLock(name, namespace, Config.defaultClient(), lockConfig);

    LeaderCallbacks callbacks = new LeaderCallbacks() {
      @Override
      public void onStartedLeading() {
        System.out.println("onStartedLeading");
        try {
          Thread.sleep(TimeUnit.SECONDS.toMillis(86400));
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }

      @Override
      public void onStopLeading() {
        System.out.println("onStopLeading");
      }

      @Override
      public void onNewLeader(String identity) {
        System.out.println("onNewLeader identity: " + identity);
        try {
          Thread.sleep(TimeUnit.SECONDS.toMillis(86400));
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    };
    LeaderElectionConfig electionConfig = new LeaderElectionConfig(
        lock,
        TimeUnit.SECONDS.toMillis(30),
        TimeUnit.SECONDS.toMillis(15),
        TimeUnit.SECONDS.toMillis(5),
        callbacks,
        true,
        name);
    LeaderElector leaderElector = new LeaderElector(electionConfig);
    try {
      leaderElector.run();
    } finally {
      leaderElector.cancel();
    }
  }
}
