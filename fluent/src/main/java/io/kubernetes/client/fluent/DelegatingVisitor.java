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
import java.util.function.Predicate;

public class DelegatingVisitor<T> implements Visitor<T> {
  DelegatingVisitor(Class<T> type, Visitor<T> delegate) {
    this.type = type;
    this.delegate = delegate;
  }

  private final Class<T> type;
  private final Visitor<T> delegate;

  public Class<T> getType() {
    return type;
  }

  public void visit(T target) {
    delegate.visit(target);
  }

  public int order() {
    return delegate.order();
  }

  public void visit(List<Entry<String, Object>> path, T target) {
    delegate.visit(path, target);
  }

  public <F> Predicate<List<Entry<String, Object>>> getRequirement() {
    return delegate.getRequirement();
  }
}
