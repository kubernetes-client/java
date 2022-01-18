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
import java.util.stream.Collectors;

public class VisitableMap
    extends java.util.HashMap<
        java.lang.String, java.util.List<io.kubernetes.client.fluent.Visitable<?>>>
    implements java.lang.Iterable<io.kubernetes.client.fluent.Visitable<?>> {
  public java.util.List<io.kubernetes.client.fluent.Visitable<?>> get(java.lang.Object key) {
    if (!containsKey(key)) {
      put(String.valueOf(key), new ArrayList());
    }
    return super.get(key);
  }

  public java.util.List<io.kubernetes.client.fluent.Visitable<?>> aggregate() {
    return values().stream().flatMap(l -> l.stream()).collect(Collectors.toList());
  }

  public java.util.Iterator<io.kubernetes.client.fluent.Visitable<?>> iterator() {
    return aggregate().iterator();
  }

  public void forEach(
      java.util.function.Consumer<? super io.kubernetes.client.fluent.Visitable<?>> action) {
    aggregate().forEach(action);
  }

  public java.util.Spliterator spliterator() {
    return aggregate().spliterator();
  }
}
