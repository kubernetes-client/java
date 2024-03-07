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

import io.kubernetes.client.informer.SharedInformerFactory;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The type Controller manager manages a set of controllers' lifecycle and also their informer
 * factory.
 */
public class ControllerManager implements Controller {
  private static final Logger log = LoggerFactory.getLogger(ControllerManager.class);
  private Controller[] controllers;
  private ExecutorService controllerThreadPool;
  private SharedInformerFactory informerFactory;

  /**
   * Instantiates a new Controller manager.
   *
   * @param controllers the controllers to be managed.
   */
  public ControllerManager(SharedInformerFactory factory, Controller... controllers) {
    this.controllers = controllers;
    this.informerFactory = factory;
  }

  @Override
  public void shutdown() {
    for (Controller controller : this.controllers) {
      controller.shutdown();
    }
    if (controllerThreadPool != null) {
      this.controllerThreadPool.shutdown();
    }
    this.informerFactory.stopAllRegisteredInformers();
  }

  @Override
  public void run() {
    if (controllers.length == 0) {
      throw new RuntimeException("no controller registered in the manager..");
    }
    this.informerFactory.startAllRegisteredInformers();
    CountDownLatch latch = new CountDownLatch(controllers.length);
    this.controllerThreadPool = Executors.newFixedThreadPool(controllers.length);
    for (Controller controller : this.controllers) {
      controllerThreadPool.submit(
          () -> {
            try {
              log.debug("Starting controller manager");
              controller.run();
            } catch (Throwable t) {
              log.error("Unexpected controller termination", t);
            } finally {
              latch.countDown();
              log.debug("Exiting controller manager");
            }
          });
    }
    try {
      log.debug("Controller-Manager bootstrapping.");
      latch.await();
    } catch (InterruptedException e) {
      log.error("Aborting controller-manager.", e);
    } finally {
      log.info("Controller-Manager exited");
    }
  }
}
