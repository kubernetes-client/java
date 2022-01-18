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
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.stream.Collectors;

public class BaseFluent<F extends io.kubernetes.client.fluent.Fluent<F>>
    implements io.kubernetes.client.fluent.Fluent<F>, io.kubernetes.client.fluent.Visitable<F> {
  public static final java.lang.String VISIT = "visit";
  public final io.kubernetes.client.fluent.VisitableMap _visitables = new VisitableMap();

  public static <T> io.kubernetes.client.fluent.VisitableBuilder<T, ?> builderOf(T item) {
    if (item instanceof Editable) {
      Object editor = ((Editable) item).edit();
      if (editor instanceof VisitableBuilder) {
        return (VisitableBuilder<T, ?>) editor;
      }
    }
    try {
      return (VisitableBuilder<T, ?>)
          Class.forName(item.getClass().getName() + "Builder")
              .getConstructor(item.getClass())
              .newInstance(item);
    } catch (Exception e) {
      throw new IllegalStateException("Failed to create builder for: " + item.getClass(), e);
    }
  }

  public static <T> java.util.List<T> build(
      java.util.List<? extends io.kubernetes.client.fluent.Builder<? extends T>> list) {
    return list == null
        ? null
        : new ArrayList<T>(list.stream().map(Builder::build).collect(Collectors.toList()));
  }

  public static <T> java.util.List<T> build(
      java.util.Set<? extends io.kubernetes.client.fluent.Builder<? extends T>> set) {
    return set == null
        ? null
        : new ArrayList<>(set.stream().map(Builder::build).collect(Collectors.toList()));
  }

  public static <T> java.util.List<T> aggregate(java.util.List<? extends T>... lists) {
    return new ArrayList(
        Arrays.stream(lists).filter(Objects::nonNull).collect(Collectors.toList()));
  }

  public static <T> java.util.Set<T> aggregate(java.util.Set<? extends T>[] sets) {
    return new LinkedHashSet(
        Arrays.stream(sets).filter(Objects::nonNull).collect(Collectors.toSet()));
  }

  public static <V extends io.kubernetes.client.fluent.Visitor<?>, F> java.lang.Boolean canVisit(
      V visitor, F fluent) {
    if (visitor instanceof TypedVisitor) {
      if (!((TypedVisitor) visitor).getType().isAssignableFrom(fluent.getClass())) {
        return false;
      }
    }
    if (visitor instanceof PathAwareTypedVisitor) {
      PathAwareTypedVisitor pathAwareTypedVisitor = (PathAwareTypedVisitor) visitor;
      Class parentType = pathAwareTypedVisitor.getParentType();
      Class actaulParentType = pathAwareTypedVisitor.getActualParentType();
      if (!parentType.isAssignableFrom(actaulParentType)) {
        return false;
      }
    }
    return hasCompatibleVisitMethod(visitor, fluent);
  }

  public static <V, F> java.lang.Boolean hasCompatibleVisitMethod(V visitor, F fluent) {
    for (java.lang.reflect.Method method : visitor.getClass().getMethods()) {
      if (!method.getName().equals(VISIT) || method.getParameterTypes().length != 1) {
        continue;
      }
      Class visitorType = method.getParameterTypes()[0];
      if (visitorType.isAssignableFrom(fluent.getClass())) {
        return true;
      } else {
        return false;
      }
    }
    return false;
  }

  public F accept(io.kubernetes.client.fluent.Visitor... visitors) {
    return isPathAwareVisitorArray(visitors)
        ? acceptPathAware(asPathAwareVisitorArray(visitors))
        : acceptInternal(visitors);
  }

  public <V> F accept(java.lang.Class<V> type, io.kubernetes.client.fluent.Visitor<V> visitor) {
    return accept(
        new TypedVisitor<V>() {
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

  public F acceptInternal(io.kubernetes.client.fluent.Visitor<?>... visitors) {
    for (Visitor visitor : visitors) {
      for (Visitable visitable : _visitables) {
        visitable.accept(visitor);
      }

      if (canVisit(visitor, this)) {
        visitor.visit(this);
      }
    }
    return (F) this;
  }

  private F acceptPathAware(
      io.kubernetes.client.fluent.PathAwareTypedVisitor<?, ?>... pathAwareTypedVisitors) {
    return acceptInternal(
        Arrays.stream(pathAwareTypedVisitors)
            .map(p -> p.next(this))
            .toArray(size -> new PathAwareTypedVisitor[size]));
  }

  private static boolean isPathAwareVisitorArray(
      io.kubernetes.client.fluent.Visitor<?>[] visitors) {
    return !Arrays.stream(visitors)
        .filter(v -> !(v instanceof PathAwareTypedVisitor))
        .findAny()
        .isPresent();
  }

  private static io.kubernetes.client.fluent.PathAwareTypedVisitor<?, ?>[] asPathAwareVisitorArray(
      io.kubernetes.client.fluent.Visitor<?>[] visitors) {
    return Arrays.stream(visitors)
        .filter(v -> v instanceof PathAwareTypedVisitor)
        .map(v -> (PathAwareTypedVisitor) v)
        .toArray(size -> new PathAwareTypedVisitor[size]);
  }
}
