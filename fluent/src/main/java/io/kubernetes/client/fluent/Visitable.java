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

import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

public interface Visitable<T> {
  default <V> T accept(Class<V> type, Visitor<V> visitor) {
    return accept(
        new Visitor<V>() {
          @Override
          public Class<V> getType() {
            return type;
          }

          @Override
          public void visit(V element) {
            visitor.visit(element);
          }
        });
  }

  default T accept(io.kubernetes.client.fluent.Visitor... visitors) {
    for (Visitor visitor : visitors) {
      if (visitor.canVisit(Collections.emptyList(), this)) {
        visitor.visit(this);
      }
    }
    return getTarget(this);
  }

  default T accept(
      List<Entry<String, Object>> path, io.kubernetes.client.fluent.Visitor... visitors) {
    return accept(path, "", visitors);
  }

  default T accept(
      List<Entry<String, Object>> path,
      String currentKey,
      io.kubernetes.client.fluent.Visitor... visitors) {
    for (Visitor visitor : visitors) {
      if (visitor.canVisit(path, this)) {
        visitor.visit(path, this);
      }
    }
    return getTarget(this);
  }

  default T getTarget(Visitable<T> visitable) {
    return (T) visitable;
  }
}
