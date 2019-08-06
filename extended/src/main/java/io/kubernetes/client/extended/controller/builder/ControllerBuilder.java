package io.kubernetes.client.extended.controller.builder;

import io.kubernetes.client.extended.controller.reconciler.Request;
import io.kubernetes.client.extended.workqueue.WorkQueue;
import io.kubernetes.client.informer.SharedInformerFactory;

/** The type Controller builder is the entry class of controller builders. */
public class ControllerBuilder {

  /**
   * Default builder is for building default controller.
   *
   * @param factory the informer factory, note that there supposed to be one informer factory
   *     globally in your application.
   * @return the default controller builder
   */
  public static DefaultControllerBuilder defaultBuilder(SharedInformerFactory factory) {
    return new DefaultControllerBuilder(factory);
  }

  /**
   * Controller manager builder is for building controller-manager .
   *
   * @param factory the informer factory
   * @return the controller mananger builder
   */
  public static ControllerManagerBuilder controllerManagerBuilder(SharedInformerFactory factory) {
    return new ControllerManagerBuilder(factory);
  }

  /**
   * Controller watch builder is for building controller-watch.
   *
   * @return the controller watch builder
   */
  public static <ApiType> ControllerWatchBuilder<ApiType> controllerWatchBuilder(
      Class<ApiType> apiTypeClass, WorkQueue<Request> workQueue) {
    return new ControllerWatchBuilder(apiTypeClass, workQueue);
  }
}
