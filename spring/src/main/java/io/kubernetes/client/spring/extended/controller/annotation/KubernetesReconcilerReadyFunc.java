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

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The ready func for Kubernetes reconciler. The reconciler won't be reconciling upon any events
 * unless all its registered ready funcs return true.
 *
 * <p>A ready func must have the signature as {@link java.util.function.Supplier<Boolean>}
 *
 * @deprecated register the watcher via the {@link
 *     io.kubernetes.client.extended.controller.builder.ControllerBuilder} API
 */
@Deprecated
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface KubernetesReconcilerReadyFunc {}
