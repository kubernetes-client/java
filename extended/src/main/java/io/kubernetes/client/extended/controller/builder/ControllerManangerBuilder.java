package io.kubernetes.client.extended.controller.builder;

import io.kubernetes.client.extended.controller.Controller;
import io.kubernetes.client.extended.controller.ControllerManager;
import io.kubernetes.client.informer.SharedInformerFactory;
import java.util.ArrayList;
import java.util.List;

/** The type Controller mananger builder. */
public class ControllerManangerBuilder {

  private SharedInformerFactory informerFactory;

  /** Instantiates a new Controller mananger builder. */
  ControllerManangerBuilder(SharedInformerFactory factory) {
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
  public ControllerManangerBuilder addController(Controller controller) {
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
