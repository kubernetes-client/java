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

import java.util.List;
import java.util.Map.Entry;

public class PathAwareTypedVisitor<V, P> extends TypedVisitor<V> {
  PathAwareTypedVisitor() {
    List<Class> args = Visitors.getTypeArguments(PathAwareTypedVisitor.class, getClass());
    if (args == null || args.isEmpty()) {
      throw new IllegalStateException(
          "Could not determine type arguments for path aware typed visitor.");
    }
    this.type = (Class<V>) args.get(0);
    this.parentType = (Class<P>) args.get(1);
  }

  private final Class<V> type;
  private final Class<P> parentType;

  public void visit(V element) {}

  public void visit(List<Entry<String, Object>> path, V element) {
    visit(element);
  }

  public P getParent(List<Entry<String, Object>> path) {
    return path.size() - 1 >= 0 ? (P) path.get(path.size() - 1) : null;
  }

  public Class<P> getParentType() {
    return parentType;
  }
}
