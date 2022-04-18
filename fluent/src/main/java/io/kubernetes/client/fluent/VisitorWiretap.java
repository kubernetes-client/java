/*
Copyright 2022 The Kubernetes Authors.
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
package io.kubernetes.client.fluent;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class VisitorWiretap<T> implements Visitor<T> {
  private VisitorWiretap(
      io.kubernetes.client.fluent.Visitor<T> delegate, Collection<VisitorListener> listeners) {
    this.delegate = delegate;
    this.listeners = listeners;
  }

  private final java.util.Collection<io.kubernetes.client.fluent.VisitorListener> listeners;
  private final io.kubernetes.client.fluent.Visitor<T> delegate;

  public static <T> VisitorWiretap<T> create(
      io.kubernetes.client.fluent.Visitor<T> visitor,
      java.util.Collection<io.kubernetes.client.fluent.VisitorListener> listeners) {
    if (visitor instanceof VisitorWiretap) {
      return (VisitorWiretap<T>) visitor;
    }
    return new VisitorWiretap<T>(visitor, listeners);
  }

  public Class<T> getType() {
    return delegate.getType();
  }

  public void visit(T target) {
    listeners.forEach(l -> l.beforeVisit(delegate, Collections.emptyList(), target));
    delegate.visit(target);
    listeners.forEach(l -> l.afterVisit(delegate, Collections.emptyList(), target));
  }

  public int order() {
    return delegate.order();
  }

  public void visit(List<Object> path, T target) {
    listeners.forEach(l -> l.beforeVisit(delegate, path, target));
    delegate.visit(path, target);
    listeners.forEach(l -> l.afterVisit(delegate, path, target));
  }

  public <F> Boolean canVisit(java.util.List<java.lang.Object> path, F target) {
    boolean canVisit = delegate.canVisit(path, target);
    listeners.forEach(l -> l.onCheck(delegate, canVisit, target));
    return canVisit;
  }
}
