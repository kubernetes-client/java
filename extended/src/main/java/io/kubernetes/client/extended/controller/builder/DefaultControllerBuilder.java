package io.kubernetes.client.extended.controller.builder;

import io.kubernetes.client.extended.controller.Controller;
import io.kubernetes.client.extended.controller.Controllers;
import io.kubernetes.client.extended.controller.DefaultController;
import io.kubernetes.client.extended.controller.WorkQueueResourceEventHandler;
import io.kubernetes.client.extended.controller.reconciler.Reconciler;
import io.kubernetes.client.extended.controller.reconciler.Request;
import io.kubernetes.client.extended.workqueue.DefaultRateLimitingQueue;
import io.kubernetes.client.extended.workqueue.RateLimitingQueue;
import io.kubernetes.client.informer.SharedIndexInformer;
import io.kubernetes.client.informer.SharedInformerFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/** The type DefaultControllerBuilder is a fluent builder class for constructing a controller. */
public class DefaultControllerBuilder {

  private int workerCount;
  private String controllerName;
  private RateLimitingQueue<Request> workQueue;

  private SharedInformerFactory informerFactory;
  private List<Supplier<Boolean>> readyFuncs;
  private Reconciler reconciler;

  DefaultControllerBuilder() {
    this.workerCount = Constants.DEFAULT_WORKER_COUNT;
    this.controllerName = "default-controller";
    this.workQueue = new DefaultRateLimitingQueue<>(Executors.newSingleThreadExecutor());
    this.readyFuncs = new ArrayList<>();
  }

  /**
   * Starts building controller by given informer factory.
   *
   * @param informerFactory the informer factory
   * @return the controller builder
   */
  DefaultControllerBuilder(SharedInformerFactory informerFactory) {
    this();
    this.informerFactory = informerFactory;
  }

  /**
   * Starts building watches over resource.
   *
   * @param <ApiType> the type parameter for the singular response
   * @param <ApiListType> the type parameter for the list of resources
   * @param apiTypeClass the api type class
   * @return the controller builder . controller watch builder
   */
  public <ApiType, ApiListType>
      DefaultControllerBuilder.ControllerWatchBuilder<ApiType, ApiListType> watch(
          Class<ApiType> apiTypeClass) {
    return new DefaultControllerBuilder.ControllerWatchBuilder<>(apiTypeClass);
  }

  /**
   * Overrides name for the controller.
   *
   * @param controllerName the controller name
   * @return the controller builder
   */
  public DefaultControllerBuilder withName(String controllerName) {
    this.controllerName = controllerName;
    return this;
  }

  /**
   * Overrides workQueue for the controller.
   *
   * @param workQueue the work queue
   * @return the controller builder
   */
  public DefaultControllerBuilder withWorkQueue(RateLimitingQueue<Request> workQueue) {
    this.workQueue = workQueue;
    return this;
  }

  /**
   * Add a ready-function to the pre-flight check of the controller.
   *
   * @param readyFunc the ready func
   * @return the controller builder
   */
  public DefaultControllerBuilder withReadyFunc(Supplier<Boolean> readyFunc) {
    this.readyFuncs.add(readyFunc);
    return this;
  }

  /**
   * Overrides worker thread counts of the controller.
   *
   * @param workerCount the worker count
   * @return the controller builder
   */
  public DefaultControllerBuilder withWorkerCount(int workerCount) {
    this.workerCount = workerCount;
    return this;
  }

  /**
   * Sets reconciler of the controller.
   *
   * @param reconciler the reconciler
   * @return the controller builder
   */
  public DefaultControllerBuilder withReconciler(Reconciler reconciler) {
    this.reconciler = reconciler;
    return this;
  }

  /**
   * Build the controller.
   *
   * @return the controller
   * @throws IllegalStateException the illegal state exception
   */
  public Controller build() throws IllegalStateException {
    if (this.reconciler == null) {
      throw new IllegalStateException("Missing reconciler when building controller.");
    }

    DefaultController controller =
        new DefaultController(
            this.reconciler, this.workQueue, this.readyFuncs.stream().toArray(Supplier[]::new));

    controller.setName(this.controllerName);
    controller.setWorkerCount(this.workerCount);
    controller.setWorkerThreadPool(
        Executors.newScheduledThreadPool(
            this.workerCount, Controllers.namedControllerThreadFactory(this.controllerName)));

    controller.setReconciler(this.reconciler);

    return controller;
  }

  /**
   * The type Controller watch builder builds a watch over resource.
   *
   * @param <ApiType> the type parameter
   * @param <ApiListType> the type parameter
   */
  public class ControllerWatchBuilder<ApiType, ApiListType> {

    private Class<ApiType> apiTypeClass;
    private Function<ApiType, Request> workKeyGenerator;
    private Predicate<ApiType> onAddFilterPredicate;
    private BiPredicate<ApiType, ApiType> onUpdateFilterPredicate;
    private BiPredicate<ApiType, Boolean> onDeleteFilterPredicate;

    private ControllerWatchBuilder(Class<ApiType> apiTypeClass) {
      this.apiTypeClass = apiTypeClass;
      this.workKeyGenerator = Controllers.defaultReflectiveKeyFunc();
    }

    /**
     * Sets a filter for add notification.
     *
     * @param filter the filter
     * @return the controller builder . controller watch builder
     */
    public DefaultControllerBuilder.ControllerWatchBuilder<ApiType, ApiListType> withOnAddFilter(
        Predicate<ApiType> filter) {
      this.onAddFilterPredicate = filter;
      return this;
    }

    /**
     * Sets a filter for update notification.
     *
     * @param filter the filter
     * @return the controller builder . controller watch builder
     */
    public DefaultControllerBuilder.ControllerWatchBuilder<ApiType, ApiListType> withOnUpdateFilter(
        BiPredicate<ApiType, ApiType> filter) {
      this.onUpdateFilterPredicate = filter;
      return this;
    }

    /**
     * Sets a filter for delete notification.
     *
     * @param filter the filter
     * @return the controller builder . controller watch builder
     */
    public DefaultControllerBuilder.ControllerWatchBuilder<ApiType, ApiListType> withOnDeleteFilter(
        BiPredicate<ApiType, Boolean> filter) {
      this.onDeleteFilterPredicate = filter;
      return this;
    }

    /**
     * Overrides work-queue key-func for the watch.
     *
     * @param workKeyGenerator the work key generator
     * @return the controller builder . controller watch builder
     */
    public DefaultControllerBuilder.ControllerWatchBuilder<ApiType, ApiListType>
        withWorkQueueKeyFunc(Function<ApiType, Request> workKeyGenerator) {
      this.workKeyGenerator = workKeyGenerator;
      return this;
    }

    /**
     * End building watch.
     *
     * @return the controller builder
     * @throws IllegalStateException the illegal state exception
     */
    public DefaultControllerBuilder endWatch() throws IllegalStateException {
      // TODO: configurable resync period
      SharedIndexInformer<ApiType> informer =
          informerFactory.getExistingSharedIndexInformer(apiTypeClass);
      if (informer == null) {
        throw new IllegalStateException(
            String.format(
                "Missing informer for resource %s, "
                    + "check if informer already constructed in the informerFactory",
                this.apiTypeClass));
      }
      WorkQueueResourceEventHandler<ApiType> workQueueHandler =
          new WorkQueueResourceEventHandler<>(workQueue, workKeyGenerator);
      if (onAddFilterPredicate != null) {
        workQueueHandler.setOnAddFilterPredicate(onAddFilterPredicate);
      }
      if (onUpdateFilterPredicate != null) {
        workQueueHandler.setOnUpdateFilterPredicate(onUpdateFilterPredicate);
      }
      if (onDeleteFilterPredicate != null) {
        workQueueHandler.setOnDeleteFilterPredicate(onDeleteFilterPredicate);
      }
      informer.addEventHandler(workQueueHandler);
      return DefaultControllerBuilder.this;
    }
  }
}
