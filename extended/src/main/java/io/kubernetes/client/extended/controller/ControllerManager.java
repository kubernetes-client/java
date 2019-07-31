package io.kubernetes.client.extended.controller;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** The type Controller manager manages a set of controllers' lifecycle. */
public class ControllerManager implements Controller {
  private static final Logger log = LoggerFactory.getLogger(DefaultController.class);
  private Controller[] controllers;
  private ExecutorService controllerThreadPool;

  /**
   * Instantiates a new Controller manager.
   *
   * @param controllers the controllers to be managed.
   */
  public ControllerManager(Controller... controllers) {
    this.controllers = controllers;
  }

  @Override
  public void shutdown() {
    for (Controller controller : this.controllers) {
      controller.shutdown();
    }
    if (controllerThreadPool != null) {
      this.controllerThreadPool.shutdown();
    }
  }

  @Override
  public void run() {
    if (controllers.length == 0) {
      throw new RuntimeException("no controller registered in the manager..");
    }
    CountDownLatch latch = new CountDownLatch(controllers.length);
    this.controllerThreadPool = Executors.newFixedThreadPool(controllers.length);
    for (Controller controller : this.controllers) {
      controllerThreadPool.submit(
          () -> {
            controller.run();
            latch.countDown();
          });
    }
    try {
      log.debug("Controller-Manager {} bootstrapping..");
      latch.await();
    } catch (InterruptedException e) {
      log.error("Aborting controller-manager.", e);
    } finally {
      log.info("Controller-Manager {} exited");
    }
  }
}
