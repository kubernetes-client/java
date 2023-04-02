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
import io.kubernetes.client.informer.ResourceEventHandler;
import java.time.Duration;

/**
 * The interface Controller watch defines how a controller watches certain resources.
 *
 * @param <ApiType> the type parameter
 */
public interface ControllerWatch<ApiType extends KubernetesObject> {
  /**
   * Gets the watching resource class.
   *
   * @return the resouce class
   */
  Class<ApiType> getResourceClass();

  /**
   * Gets the event handler on watch events from the resource.
   *
   * @return the resource event handler
   */
  ResourceEventHandler<ApiType> getResourceEventHandler();

  /**
   * Gets resync period for the registering event handler.
   *
   * @return the resync period
   */
  Duration getResyncPeriod();
}
