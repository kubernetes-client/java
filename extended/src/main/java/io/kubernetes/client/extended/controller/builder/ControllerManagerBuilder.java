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
package io.kubernetes.client.extended.controller.builder;

import io.kubernetes.client.extended.controller.Controller;
import io.kubernetes.client.extended.controller.ControllerManager;
import io.kubernetes.client.informer.SharedInformerFactory;
import java.util.ArrayList;
import java.util.List;

/** The type Controller mananger builder. */
public class ControllerManagerBuilder {

  private SharedInformerFactory informerFactory;

  /** Instantiates a new Controller mananger builder. */
  ControllerManagerBuilder(SharedInformerFactory factory) {
    this.informerFactory = factory;
    this.controllerList = new ArrayList<>();
  }

  private List<Controller> controllerList;

  /**
   * Add controller controller mananger builder.
   *
   * @param controller the controller
   * @return the controller mananger builder
   */
  public ControllerManagerBuilder addController(Controller controller) {
    this.controllerList.add(controller);
    return this;
  }

  /**
   * Build controller manager.
   *
   * @return the controller manager
   */
  public ControllerManager build() {
    return new ControllerManager(
        informerFactory, controllerList.stream().toArray(Controller[]::new));
  }
}
