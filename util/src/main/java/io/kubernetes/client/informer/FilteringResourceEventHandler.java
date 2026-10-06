/*
Copyright 2026 The Kubernetes Authors.
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
package io.kubernetes.client.informer;

import io.kubernetes.client.common.KubernetesObject;
import java.util.Objects;
import java.util.function.Predicate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * FilteringResourceEventHandler dispatches events only when objects match a predicate.
 */
public class FilteringResourceEventHandler<ApiType extends KubernetesObject>
    implements ResourceEventHandler<ApiType> {

  private static final Logger log = LoggerFactory.getLogger(FilteringResourceEventHandler.class);

  private final ResourceEventHandler<ApiType> delegate;
  private final Predicate<ApiType> filter;

  public FilteringResourceEventHandler(
      ResourceEventHandler<ApiType> delegate, Predicate<ApiType> filter) {
    this.delegate = Objects.requireNonNull(delegate);
    this.filter = Objects.requireNonNull(filter);
  }

  @Override
  public void onAdd(ApiType obj) {
    if (matches(obj)) {
      delegate.onAdd(obj);
    }
  }

  @Override
  public void onUpdate(ApiType oldObj, ApiType newObj) {
    boolean oldMatched = matches(oldObj);
    boolean newMatched = matches(newObj);
    if (oldMatched && newMatched) {
      delegate.onUpdate(oldObj, newObj);
      return;
    }
    if (!oldMatched && newMatched) {
      delegate.onAdd(newObj);
      return;
    }
    if (oldMatched) {
      delegate.onDelete(oldObj, false);
    }
  }

  @Override
  public void onDelete(ApiType obj, boolean deletedFinalStateUnknown) {
    if (matches(obj)) {
      delegate.onDelete(obj, deletedFinalStateUnknown);
    }
  }

  private boolean matches(ApiType obj) {
    if (obj == null) {
      return false;
    }
    try {
      return filter.test(obj);
    } catch (RuntimeException e) {
      log.warn("Predicate threw an exception; dropping informer event", e);
      return false;
    }
  }
}
