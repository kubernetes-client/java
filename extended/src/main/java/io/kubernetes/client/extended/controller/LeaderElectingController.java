package io.kubernetes.client.extended.controller;

import io.kubernetes.client.extended.leaderelection.LeaderElector;

public class LeaderElectingController implements Controller {

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
        () -> this.delegateController.run(), () -> this.delegateController.shutdown());
  }
}
