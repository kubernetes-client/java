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
