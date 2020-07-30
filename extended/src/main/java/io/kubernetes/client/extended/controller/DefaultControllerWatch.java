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

import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.extended.controller.reconciler.Request;
import io.kubernetes.client.extended.workqueue.WorkQueue;
import io.kubernetes.client.informer.ResourceEventHandler;
import java.time.Duration;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * An event handler plumbs work-queue into a controller.
 *
 * @param <ApiType> the type parameter
 */
public class DefaultControllerWatch<ApiType extends KubernetesObject>
    implements ControllerWatch<ApiType> {

  private final WorkQueue<Request> workQueue;
  private final Function<ApiType, Request> workKeyGenerator;

  private Class<ApiType> apiTypeClass;
  private Predicate<ApiType> onAddFilterPredicate;
  private BiPredicate<ApiType, ApiType> onUpdateFilterPredicate;
  private BiPredicate<ApiType, Boolean> onDeleteFilterPredicate;
  private Duration resyncPeriod;

  /**
   * Instantiates a new Work queue resource event handler.
   *
   * @param workQueue the work queue
   * @param workKeyGenerator the work key generator
   */
  public DefaultControllerWatch(
      Class<ApiType> apiTypeClass,
      WorkQueue<Request> workQueue,
      Function<ApiType, Request> workKeyGenerator,
      Duration resyncPeriod) {
    this.workQueue = workQueue;
    this.apiTypeClass = apiTypeClass;
    this.workKeyGenerator = workKeyGenerator;
    this.resyncPeriod = resyncPeriod;
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

  public Class<ApiType> getApiTypeClass() {
    return apiTypeClass;
  }

  @Override
  public Class<ApiType> getResourceClass() {
    return this.apiTypeClass;
  }

  @Override
  public ResourceEventHandler<ApiType> getResourceEventHandler() {
    return new ResourceEventHandler<ApiType>() {
      @Override
      public void onAdd(ApiType obj) {
        if (onAddFilterPredicate == null || onAddFilterPredicate.test(obj)) {
          Request req = workKeyGenerator.apply(obj);
          if (null != req) {
            workQueue.add(req);
          }
        }
      }

      @Override
      public void onUpdate(ApiType oldObj, ApiType newObj) {
        if (onUpdateFilterPredicate == null || onUpdateFilterPredicate.test(oldObj, newObj)) {
          Request req = workKeyGenerator.apply(newObj);
          if (null != req) {
            workQueue.add(req);
          }
        }
      }

      @Override
      public void onDelete(ApiType obj, boolean deletedFinalStateUnknown) {
        if (onDeleteFilterPredicate == null
            || onDeleteFilterPredicate.test(obj, deletedFinalStateUnknown)) {
          Request req = workKeyGenerator.apply(obj);
          if (null != req) {
            workQueue.add(req);
          }
        }
      }
    };
  }

  @Override
  public Duration getResyncPeriod() {
    return this.resyncPeriod;
  }
}
