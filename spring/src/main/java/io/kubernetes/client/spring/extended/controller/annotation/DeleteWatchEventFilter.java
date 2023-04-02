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
package io.kubernetes.client.spring.extended.controller.annotation;

import io.kubernetes.client.common.KubernetesObject;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates that the method is a filter for {@link
 * io.kubernetes.client.informer.EventType#MODIFIED} from watches.
 *
 * <p>A update-event filter must have the signature as {@link
 * java.util.function.BiPredicate<ApiType, Boolean>} where the 1st parameter is the
 * "before-deletion" state of the resource and the 2nd indicates whether the cache entry for the
 * resource is stale.
 *
 * @deprecated register the watcher via the {@link
 *     io.kubernetes.client.extended.controller.builder.ControllerBuilder} API
 */
@Deprecated
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface DeleteWatchEventFilter {
  Class<? extends KubernetesObject> apiTypeClass();
}
