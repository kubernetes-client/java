package io.kubernetes.client.examples;

import io.kubernetes.client.leaderelection.LeaderCallbacks;
import io.kubernetes.client.leaderelection.LeaderElectionConfig;
import io.kubernetes.client.leaderelection.LeaderElector;
import io.kubernetes.client.leaderelection.resourcelock.ConfigMapLock;
import io.kubernetes.client.leaderelection.resourcelock.ResourceLockConfig;
import io.kubernetes.client.util.Config;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * A simple example of how to use the LeaderElection Java API
 *
 * @author yu
 */
public class LeaderElectionExample {
    public static void main(String[] args) throws IOException {
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
