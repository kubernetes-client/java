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

import java.util.ArrayList;
import java.util.List;

public class PathAwareTypedVisitor<V, P> extends io.kubernetes.client.fluent.TypedVisitor<V> {
  PathAwareTypedVisitor(java.util.List<java.lang.Object> path) {
    this.path = path;
    this.delegate = this;
    this.parentType = (Class<P>) getTypeArguments(PathAwareTypedVisitor.class, getClass()).get(1);
  }

  PathAwareTypedVisitor(
      java.util.List<java.lang.Object> path,
      io.kubernetes.client.fluent.PathAwareTypedVisitor<V, P> delegate) {
    this.path = path;
    this.delegate = this;
    this.parentType =
        (Class<P>) getTypeArguments(PathAwareTypedVisitor.class, delegate.getClass()).get(1);
  }

  java.util.List<java.lang.Object> path;
  io.kubernetes.client.fluent.PathAwareTypedVisitor<V, P> delegate;
  java.lang.Class<P> parentType;

  public void visit(V element) {
    delegate.path = path;
    delegate.visit(element);
  }

  io.kubernetes.client.fluent.PathAwareTypedVisitor<V, P> next(java.lang.Object item) {
    List<Object> path = new ArrayList<Object>(this.path);
    path.add(item);
    return new PathAwareTypedVisitor<V, P>(path, this);
  }

  P getParent() {
    return path.size() - 2 >= 0 ? (P) path.get(path.size() - 2) : null;
  }

  java.lang.Class<P> getParentType() {
    return parentType != null ? parentType : delegate.getParentType();
  }

  protected java.lang.Class<?> getActualParentType() {
    return path.size() - 2 >= 0 ? path.get(path.size() - 2).getClass() : Void.class;
  }
}
