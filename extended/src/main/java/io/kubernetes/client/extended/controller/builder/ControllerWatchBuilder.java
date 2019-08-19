package io.kubernetes.client.extended.controller.builder;

import io.kubernetes.client.extended.controller.Controllers;
import io.kubernetes.client.extended.controller.DefaultControllerWatch;
import io.kubernetes.client.extended.controller.reconciler.Request;
import io.kubernetes.client.extended.workqueue.WorkQueue;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class ControllerWatchBuilder<ApiType> {

  private Function<ApiType, Request> workKeyGenerator;
  private WorkQueue<Request> workQueue;
  private Class<ApiType> apiTypeClass;

  private Predicate<ApiType> onAddFilterPredicate;
  private BiPredicate<ApiType, ApiType> onUpdateFilterPredicate;
  private BiPredicate<ApiType, Boolean> onDeleteFilterPredicate;

  ControllerWatchBuilder(Class<ApiType> apiTypeClass, WorkQueue<Request> workQueue) {
    this.apiTypeClass = apiTypeClass;
    this.workKeyGenerator = Controllers.defaultReflectiveKeyFunc();
    this.workQueue = workQueue;
  }

  /**
   * Sets a filter for add notification.
   *
   * @param filter the filter
   * @return the controller builder . controller watch builder
   */
  public ControllerWatchBuilder<ApiType> withOnAddFilter(Predicate<ApiType> filter) {
    this.onAddFilterPredicate = filter;
    return this;
  }

  /**
   * Sets a filter for update notification.
   *
   * @param filter the filter
   * @return the controller builder . controller watch builder
   */
  public ControllerWatchBuilder<ApiType> withOnUpdateFilter(BiPredicate<ApiType, ApiType> filter) {
    this.onUpdateFilterPredicate = filter;
    return this;
  }

  /**
   * Sets a filter for delete notification.
   *
   * @param filter the filter
   * @return the controller builder . controller watch builder
   */
  public ControllerWatchBuilder<ApiType> withOnDeleteFilter(BiPredicate<ApiType, Boolean> filter) {
    this.onDeleteFilterPredicate = filter;
    return this;
  }

  /**
   * Overrides work-queue key-func for the watch.
   *
   * @param workKeyGenerator the work key generator
   * @return the controller builder . controller watch builder
   */
  public ControllerWatchBuilder<ApiType> withWorkQueueKeyFunc(
      Function<ApiType, Request> workKeyGenerator) {
    this.workKeyGenerator = workKeyGenerator;
    return this;
  }

  /**
   * End building controller-watch.
   *
   * @return the controller builder
   * @throws IllegalStateException the illegal state exception
   */
  public DefaultControllerWatch<ApiType> build() throws IllegalStateException {
    DefaultControllerWatch<ApiType> workQueueHandler =
        new DefaultControllerWatch<>(apiTypeClass, workQueue, workKeyGenerator);
    workQueueHandler.setOnAddFilterPredicate(onAddFilterPredicate);
    workQueueHandler.setOnUpdateFilterPredicate(onUpdateFilterPredicate);
    workQueueHandler.setOnDeleteFilterPredicate(onDeleteFilterPredicate);
    return workQueueHandler;
  }
}
