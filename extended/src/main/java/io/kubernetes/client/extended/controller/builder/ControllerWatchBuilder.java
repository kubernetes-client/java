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

import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.extended.controller.Controllers;
import io.kubernetes.client.extended.controller.DefaultControllerWatch;
import io.kubernetes.client.extended.controller.reconciler.Request;
import io.kubernetes.client.extended.workqueue.WorkQueue;
import java.time.Duration;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class ControllerWatchBuilder<ApiType extends KubernetesObject> {

  private Function<ApiType, Request> workKeyGenerator;
  private WorkQueue<Request> workQueue;
  private Class<ApiType> apiTypeClass;
  private Duration resyncPeriod = Duration.ZERO;

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

  public ControllerWatchBuilder<ApiType> withResyncPeriod(Duration resyncPeriod) {
    this.resyncPeriod = resyncPeriod;
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
        new DefaultControllerWatch<>(apiTypeClass, workQueue, workKeyGenerator, resyncPeriod);
    workQueueHandler.setOnAddFilterPredicate(onAddFilterPredicate);
    workQueueHandler.setOnUpdateFilterPredicate(onUpdateFilterPredicate);
    workQueueHandler.setOnDeleteFilterPredicate(onDeleteFilterPredicate);
    return workQueueHandler;
  }
}
