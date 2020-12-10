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
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.util.Threads;
import java.util.concurrent.ThreadFactory;
import java.util.function.Function;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** The Controllers is a set of commonly used utility functions for constructing controller. */
public class Controllers {

  private static final Logger log = LoggerFactory.getLogger(Controllers.class);

  /**
   * The Default key func function works for work-queue, which extracts namespace and name via
   * reflection from the objects.
   *
   * @param <ApiType> the type parameter
   * @return the function
   */
  public static <ApiType extends KubernetesObject>
      Function<ApiType, Request> defaultReflectiveKeyFunc() {
    return (ApiType obj) -> {
      V1ObjectMeta objectMeta = obj.getMetadata();
      return new Request(objectMeta.getNamespace(), objectMeta.getName());
    };
  }

  /**
   * Named thread factory for constructing controller, useful when debugging dumping status of
   * controller worker threads. e.g. for a controller named `foo`, its threads will be named
   * `foo-1`, `foo-2`...
   *
   * @param controllerName the controller name
   * @return the thread factory
   */
  public static ThreadFactory namedControllerThreadFactory(String controllerName) {
    return Threads.threadFactory(controllerName + "-%d");
  }
}
