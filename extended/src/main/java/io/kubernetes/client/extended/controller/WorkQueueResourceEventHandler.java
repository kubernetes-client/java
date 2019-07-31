package io.kubernetes.client.extended.controller;

import io.kubernetes.client.extended.controller.reconciler.Request;
import io.kubernetes.client.extended.workqueue.WorkQueue;
import io.kubernetes.client.informer.ResourceEventHandler;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * An event handler plumbs work-queue into a controller.
 *
 * @param <ApiType> the type parameter
 */
public class WorkQueueResourceEventHandler<ApiType> implements ResourceEventHandler<ApiType> {

  private final WorkQueue<Request> workQueue;
  private final Function<ApiType, Request> workKeyGenerator;
  private Predicate<ApiType> onAddFilterPredicate;
  private BiPredicate<ApiType, ApiType> onUpdateFilterPredicate;
  private BiPredicate<ApiType, Boolean> onDeleteFilterPredicate;

  /**
   * Instantiates a new Work queue resource event handler.
   *
   * @param workQueue the work queue
   * @param workKeyGenerator the work key generator
   */
  public WorkQueueResourceEventHandler(
      WorkQueue<Request> workQueue, Function<ApiType, Request> workKeyGenerator) {
    this.workQueue = workQueue;
    this.workKeyGenerator = workKeyGenerator;
  }

  public Predicate<ApiType> getOnAddFilterPredicate() {
    return onAddFilterPredicate;
  }

  public void setOnAddFilterPredicate(Predicate<ApiType> onAddFilterPredicate) {
    this.onAddFilterPredicate = onAddFilterPredicate;
  }

  public BiPredicate<ApiType, ApiType> getOnUpdateFilterPredicate() {
    return onUpdateFilterPredicate;
  }

  public void setOnUpdateFilterPredicate(BiPredicate<ApiType, ApiType> onUpdateFilterPredicate) {
    this.onUpdateFilterPredicate = onUpdateFilterPredicate;
  }

  public BiPredicate<ApiType, Boolean> getOnDeleteFilterPredicate() {
    return onDeleteFilterPredicate;
  }

  public void setOnDeleteFilterPredicate(BiPredicate<ApiType, Boolean> onDeleteFilterPredicate) {
    this.onDeleteFilterPredicate = onDeleteFilterPredicate;
  }

  @Override
  public void onAdd(ApiType obj) {
    if (onAddFilterPredicate == null || onAddFilterPredicate.test(obj)) {
      workQueue.add(workKeyGenerator.apply(obj));
    }
  }

  @Override
  public void onUpdate(ApiType oldObj, ApiType newObj) {
    if (onUpdateFilterPredicate == null || onUpdateFilterPredicate.test(oldObj, newObj)) {
      workQueue.add(workKeyGenerator.apply(newObj));
    }
  }

  @Override
  public void onDelete(ApiType obj, boolean deletedFinalStateUnknown) {
    if (onDeleteFilterPredicate == null
        || onDeleteFilterPredicate.test(obj, deletedFinalStateUnknown)) {
      workQueue.add(workKeyGenerator.apply(obj));
    }
  }
}
