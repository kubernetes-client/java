package io.kubernetes.client.extended.controller;

import io.kubernetes.client.extended.leaderelection.LeaderElector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LeaderElectingController implements Controller {

  private static final Logger log = LoggerFactory.getLogger(LeaderElectingController.class);

  private Controller delegateController;
  private LeaderElector leaderElector;

  public LeaderElectingController(LeaderElector leaderElector, Controller delegateController) {
    this.delegateController = delegateController;
    this.leaderElector = leaderElector;
  }

  @Override
  public void shutdown() {
    this.delegateController.shutdown();
  }

  @Override
  public void run() {
    this.leaderElector.run(
        () -> {
          log.info("Lease acquired, starting controller..");
          this.delegateController.run();
        },
        () -> {
          log.info("Lease lost, shutting down controller..");
          this.delegateController.shutdown();
        });
  }
}
