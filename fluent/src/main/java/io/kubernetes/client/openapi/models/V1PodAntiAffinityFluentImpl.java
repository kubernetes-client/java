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
package io.kubernetes.client.openapi.models;

import java.util.Iterator;
import java.util.List;

/** Generated */
public class V1PodAntiAffinityFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1PodAntiAffinityFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1PodAntiAffinityFluent<A> {
  public V1PodAntiAffinityFluentImpl() {}

  public V1PodAntiAffinityFluentImpl(
      io.kubernetes.client.openapi.models.V1PodAntiAffinity instance) {
    this.withPreferredDuringSchedulingIgnoredDuringExecution(
        instance.getPreferredDuringSchedulingIgnoredDuringExecution());

    this.withRequiredDuringSchedulingIgnoredDuringExecution(
        instance.getRequiredDuringSchedulingIgnoredDuringExecution());
  }

  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermBuilder>
      preferredDuringSchedulingIgnoredDuringExecution;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1PodAffinityTermBuilder>
      requiredDuringSchedulingIgnoredDuringExecution;

  public A addToPreferredDuringSchedulingIgnoredDuringExecution(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm item) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution == null) {
      this.preferredDuringSchedulingIgnoredDuringExecution =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermBuilder>();
    }
    io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermBuilder builder =
        new io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermBuilder(item);
    _visitables
        .get("preferredDuringSchedulingIgnoredDuringExecution")
        .add(
            index >= 0
                ? index
                : _visitables.get("preferredDuringSchedulingIgnoredDuringExecution").size(),
            builder);
    this.preferredDuringSchedulingIgnoredDuringExecution.add(
        index >= 0 ? index : preferredDuringSchedulingIgnoredDuringExecution.size(), builder);
    return (A) this;
  }

  public A setToPreferredDuringSchedulingIgnoredDuringExecution(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm item) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution == null) {
      this.preferredDuringSchedulingIgnoredDuringExecution =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermBuilder>();
    }
    io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermBuilder builder =
        new io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermBuilder(item);
    if (index < 0
        || index >= _visitables.get("preferredDuringSchedulingIgnoredDuringExecution").size()) {
      _visitables.get("preferredDuringSchedulingIgnoredDuringExecution").add(builder);
    } else {
      _visitables.get("preferredDuringSchedulingIgnoredDuringExecution").set(index, builder);
    }
    if (index < 0 || index >= preferredDuringSchedulingIgnoredDuringExecution.size()) {
      preferredDuringSchedulingIgnoredDuringExecution.add(builder);
    } else {
      preferredDuringSchedulingIgnoredDuringExecution.set(index, builder);
    }
    return (A) this;
  }

  public A addToPreferredDuringSchedulingIgnoredDuringExecution(
      io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm... items) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution == null) {
      this.preferredDuringSchedulingIgnoredDuringExecution =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm item : items) {
      io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermBuilder builder =
          new io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermBuilder(item);
      _visitables.get("preferredDuringSchedulingIgnoredDuringExecution").add(builder);
      this.preferredDuringSchedulingIgnoredDuringExecution.add(builder);
    }
    return (A) this;
  }

  public A addAllToPreferredDuringSchedulingIgnoredDuringExecution(
      java.util.Collection<io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm> items) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution == null) {
      this.preferredDuringSchedulingIgnoredDuringExecution =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm item : items) {
      io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermBuilder builder =
          new io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermBuilder(item);
      _visitables.get("preferredDuringSchedulingIgnoredDuringExecution").add(builder);
      this.preferredDuringSchedulingIgnoredDuringExecution.add(builder);
    }
    return (A) this;
  }

  public A removeFromPreferredDuringSchedulingIgnoredDuringExecution(
      io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm... items) {
    for (io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm item : items) {
      io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermBuilder builder =
          new io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermBuilder(item);
      _visitables.get("preferredDuringSchedulingIgnoredDuringExecution").remove(builder);
      if (this.preferredDuringSchedulingIgnoredDuringExecution != null) {
        this.preferredDuringSchedulingIgnoredDuringExecution.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromPreferredDuringSchedulingIgnoredDuringExecution(
      java.util.Collection<io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm> items) {
    for (io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm item : items) {
      io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermBuilder builder =
          new io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermBuilder(item);
      _visitables.get("preferredDuringSchedulingIgnoredDuringExecution").remove(builder);
      if (this.preferredDuringSchedulingIgnoredDuringExecution != null) {
        this.preferredDuringSchedulingIgnoredDuringExecution.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromPreferredDuringSchedulingIgnoredDuringExecution(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermBuilder>
          predicate) {
    if (preferredDuringSchedulingIgnoredDuringExecution == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermBuilder> each =
        preferredDuringSchedulingIgnoredDuringExecution.iterator();
    final List visitables = _visitables.get("preferredDuringSchedulingIgnoredDuringExecution");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method
   * buildPreferredDuringSchedulingIgnoredDuringExecution instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm>
      getPreferredDuringSchedulingIgnoredDuringExecution() {
    return preferredDuringSchedulingIgnoredDuringExecution != null
        ? build(preferredDuringSchedulingIgnoredDuringExecution)
        : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm>
      buildPreferredDuringSchedulingIgnoredDuringExecution() {
    return preferredDuringSchedulingIgnoredDuringExecution != null
        ? build(preferredDuringSchedulingIgnoredDuringExecution)
        : null;
  }

  public io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm
      buildPreferredDuringSchedulingIgnoredDuringExecution(java.lang.Integer index) {
    return this.preferredDuringSchedulingIgnoredDuringExecution.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm
      buildFirstPreferredDuringSchedulingIgnoredDuringExecution() {
    return this.preferredDuringSchedulingIgnoredDuringExecution.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm
      buildLastPreferredDuringSchedulingIgnoredDuringExecution() {
    return this.preferredDuringSchedulingIgnoredDuringExecution
        .get(preferredDuringSchedulingIgnoredDuringExecution.size() - 1)
        .build();
  }

  public io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm
      buildMatchingPreferredDuringSchedulingIgnoredDuringExecution(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermBuilder>
              predicate) {
    for (io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermBuilder item :
        preferredDuringSchedulingIgnoredDuringExecution) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingPreferredDuringSchedulingIgnoredDuringExecution(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermBuilder item :
        preferredDuringSchedulingIgnoredDuringExecution) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withPreferredDuringSchedulingIgnoredDuringExecution(
      java.util.List<io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm>
          preferredDuringSchedulingIgnoredDuringExecution) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution != null) {
      _visitables
          .get("preferredDuringSchedulingIgnoredDuringExecution")
          .removeAll(this.preferredDuringSchedulingIgnoredDuringExecution);
    }
    if (preferredDuringSchedulingIgnoredDuringExecution != null) {
      this.preferredDuringSchedulingIgnoredDuringExecution = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm item :
          preferredDuringSchedulingIgnoredDuringExecution) {
        this.addToPreferredDuringSchedulingIgnoredDuringExecution(item);
      }
    } else {
      this.preferredDuringSchedulingIgnoredDuringExecution = null;
    }
    return (A) this;
  }

  public A withPreferredDuringSchedulingIgnoredDuringExecution(
      io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm...
          preferredDuringSchedulingIgnoredDuringExecution) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution != null) {
      this.preferredDuringSchedulingIgnoredDuringExecution.clear();
    }
    if (preferredDuringSchedulingIgnoredDuringExecution != null) {
      for (io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm item :
          preferredDuringSchedulingIgnoredDuringExecution) {
        this.addToPreferredDuringSchedulingIgnoredDuringExecution(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasPreferredDuringSchedulingIgnoredDuringExecution() {
    return preferredDuringSchedulingIgnoredDuringExecution != null
        && !preferredDuringSchedulingIgnoredDuringExecution.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1PodAntiAffinityFluent
              .PreferredDuringSchedulingIgnoredDuringExecutionNested<
          A>
      addNewPreferredDuringSchedulingIgnoredDuringExecution() {
    return new io.kubernetes.client.openapi.models.V1PodAntiAffinityFluentImpl
        .PreferredDuringSchedulingIgnoredDuringExecutionNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1PodAntiAffinityFluent
              .PreferredDuringSchedulingIgnoredDuringExecutionNested<
          A>
      addNewPreferredDuringSchedulingIgnoredDuringExecutionLike(
          io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm item) {
    return new io.kubernetes.client.openapi.models.V1PodAntiAffinityFluentImpl
        .PreferredDuringSchedulingIgnoredDuringExecutionNestedImpl(-1, item);
  }

  public io.kubernetes.client.openapi.models.V1PodAntiAffinityFluent
              .PreferredDuringSchedulingIgnoredDuringExecutionNested<
          A>
      setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(
          java.lang.Integer index,
          io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm item) {
    return new io.kubernetes.client.openapi.models.V1PodAntiAffinityFluentImpl
        .PreferredDuringSchedulingIgnoredDuringExecutionNestedImpl(index, item);
  }

  public io.kubernetes.client.openapi.models.V1PodAntiAffinityFluent
              .PreferredDuringSchedulingIgnoredDuringExecutionNested<
          A>
      editPreferredDuringSchedulingIgnoredDuringExecution(java.lang.Integer index) {
    if (preferredDuringSchedulingIgnoredDuringExecution.size() <= index)
      throw new RuntimeException(
          "Can't edit preferredDuringSchedulingIgnoredDuringExecution. Index exceeds size.");
    return setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(
        index, buildPreferredDuringSchedulingIgnoredDuringExecution(index));
  }

  public io.kubernetes.client.openapi.models.V1PodAntiAffinityFluent
              .PreferredDuringSchedulingIgnoredDuringExecutionNested<
          A>
      editFirstPreferredDuringSchedulingIgnoredDuringExecution() {
    if (preferredDuringSchedulingIgnoredDuringExecution.size() == 0)
      throw new RuntimeException(
          "Can't edit first preferredDuringSchedulingIgnoredDuringExecution. The list is empty.");
    return setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(
        0, buildPreferredDuringSchedulingIgnoredDuringExecution(0));
  }

  public io.kubernetes.client.openapi.models.V1PodAntiAffinityFluent
              .PreferredDuringSchedulingIgnoredDuringExecutionNested<
          A>
      editLastPreferredDuringSchedulingIgnoredDuringExecution() {
    int index = preferredDuringSchedulingIgnoredDuringExecution.size() - 1;
    if (index < 0)
      throw new RuntimeException(
          "Can't edit last preferredDuringSchedulingIgnoredDuringExecution. The list is empty.");
    return setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(
        index, buildPreferredDuringSchedulingIgnoredDuringExecution(index));
  }

  public io.kubernetes.client.openapi.models.V1PodAntiAffinityFluent
              .PreferredDuringSchedulingIgnoredDuringExecutionNested<
          A>
      editMatchingPreferredDuringSchedulingIgnoredDuringExecution(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < preferredDuringSchedulingIgnoredDuringExecution.size(); i++) {
      if (predicate.test(preferredDuringSchedulingIgnoredDuringExecution.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0)
      throw new RuntimeException(
          "Can't edit matching preferredDuringSchedulingIgnoredDuringExecution. No match found.");
    return setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(
        index, buildPreferredDuringSchedulingIgnoredDuringExecution(index));
  }

  public A addToRequiredDuringSchedulingIgnoredDuringExecution(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1PodAffinityTerm item) {
    if (this.requiredDuringSchedulingIgnoredDuringExecution == null) {
      this.requiredDuringSchedulingIgnoredDuringExecution =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1PodAffinityTermBuilder>();
    }
    io.kubernetes.client.openapi.models.V1PodAffinityTermBuilder builder =
        new io.kubernetes.client.openapi.models.V1PodAffinityTermBuilder(item);
    _visitables
        .get("requiredDuringSchedulingIgnoredDuringExecution")
        .add(
            index >= 0
                ? index
                : _visitables.get("requiredDuringSchedulingIgnoredDuringExecution").size(),
            builder);
    this.requiredDuringSchedulingIgnoredDuringExecution.add(
        index >= 0 ? index : requiredDuringSchedulingIgnoredDuringExecution.size(), builder);
    return (A) this;
  }

  public A setToRequiredDuringSchedulingIgnoredDuringExecution(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1PodAffinityTerm item) {
    if (this.requiredDuringSchedulingIgnoredDuringExecution == null) {
      this.requiredDuringSchedulingIgnoredDuringExecution =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1PodAffinityTermBuilder>();
    }
    io.kubernetes.client.openapi.models.V1PodAffinityTermBuilder builder =
        new io.kubernetes.client.openapi.models.V1PodAffinityTermBuilder(item);
    if (index < 0
        || index >= _visitables.get("requiredDuringSchedulingIgnoredDuringExecution").size()) {
      _visitables.get("requiredDuringSchedulingIgnoredDuringExecution").add(builder);
    } else {
      _visitables.get("requiredDuringSchedulingIgnoredDuringExecution").set(index, builder);
    }
    if (index < 0 || index >= requiredDuringSchedulingIgnoredDuringExecution.size()) {
      requiredDuringSchedulingIgnoredDuringExecution.add(builder);
    } else {
      requiredDuringSchedulingIgnoredDuringExecution.set(index, builder);
    }
    return (A) this;
  }

  public A addToRequiredDuringSchedulingIgnoredDuringExecution(
      io.kubernetes.client.openapi.models.V1PodAffinityTerm... items) {
    if (this.requiredDuringSchedulingIgnoredDuringExecution == null) {
      this.requiredDuringSchedulingIgnoredDuringExecution =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1PodAffinityTermBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1PodAffinityTerm item : items) {
      io.kubernetes.client.openapi.models.V1PodAffinityTermBuilder builder =
          new io.kubernetes.client.openapi.models.V1PodAffinityTermBuilder(item);
      _visitables.get("requiredDuringSchedulingIgnoredDuringExecution").add(builder);
      this.requiredDuringSchedulingIgnoredDuringExecution.add(builder);
    }
    return (A) this;
  }

  public A addAllToRequiredDuringSchedulingIgnoredDuringExecution(
      java.util.Collection<io.kubernetes.client.openapi.models.V1PodAffinityTerm> items) {
    if (this.requiredDuringSchedulingIgnoredDuringExecution == null) {
      this.requiredDuringSchedulingIgnoredDuringExecution =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1PodAffinityTermBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1PodAffinityTerm item : items) {
      io.kubernetes.client.openapi.models.V1PodAffinityTermBuilder builder =
          new io.kubernetes.client.openapi.models.V1PodAffinityTermBuilder(item);
      _visitables.get("requiredDuringSchedulingIgnoredDuringExecution").add(builder);
      this.requiredDuringSchedulingIgnoredDuringExecution.add(builder);
    }
    return (A) this;
  }

  public A removeFromRequiredDuringSchedulingIgnoredDuringExecution(
      io.kubernetes.client.openapi.models.V1PodAffinityTerm... items) {
    for (io.kubernetes.client.openapi.models.V1PodAffinityTerm item : items) {
      io.kubernetes.client.openapi.models.V1PodAffinityTermBuilder builder =
          new io.kubernetes.client.openapi.models.V1PodAffinityTermBuilder(item);
      _visitables.get("requiredDuringSchedulingIgnoredDuringExecution").remove(builder);
      if (this.requiredDuringSchedulingIgnoredDuringExecution != null) {
        this.requiredDuringSchedulingIgnoredDuringExecution.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromRequiredDuringSchedulingIgnoredDuringExecution(
      java.util.Collection<io.kubernetes.client.openapi.models.V1PodAffinityTerm> items) {
    for (io.kubernetes.client.openapi.models.V1PodAffinityTerm item : items) {
      io.kubernetes.client.openapi.models.V1PodAffinityTermBuilder builder =
          new io.kubernetes.client.openapi.models.V1PodAffinityTermBuilder(item);
      _visitables.get("requiredDuringSchedulingIgnoredDuringExecution").remove(builder);
      if (this.requiredDuringSchedulingIgnoredDuringExecution != null) {
        this.requiredDuringSchedulingIgnoredDuringExecution.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromRequiredDuringSchedulingIgnoredDuringExecution(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PodAffinityTermBuilder>
          predicate) {
    if (requiredDuringSchedulingIgnoredDuringExecution == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1PodAffinityTermBuilder> each =
        requiredDuringSchedulingIgnoredDuringExecution.iterator();
    final List visitables = _visitables.get("requiredDuringSchedulingIgnoredDuringExecution");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1PodAffinityTermBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method
   * buildRequiredDuringSchedulingIgnoredDuringExecution instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1PodAffinityTerm>
      getRequiredDuringSchedulingIgnoredDuringExecution() {
    return requiredDuringSchedulingIgnoredDuringExecution != null
        ? build(requiredDuringSchedulingIgnoredDuringExecution)
        : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1PodAffinityTerm>
      buildRequiredDuringSchedulingIgnoredDuringExecution() {
    return requiredDuringSchedulingIgnoredDuringExecution != null
        ? build(requiredDuringSchedulingIgnoredDuringExecution)
        : null;
  }

  public io.kubernetes.client.openapi.models.V1PodAffinityTerm
      buildRequiredDuringSchedulingIgnoredDuringExecution(java.lang.Integer index) {
    return this.requiredDuringSchedulingIgnoredDuringExecution.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1PodAffinityTerm
      buildFirstRequiredDuringSchedulingIgnoredDuringExecution() {
    return this.requiredDuringSchedulingIgnoredDuringExecution.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1PodAffinityTerm
      buildLastRequiredDuringSchedulingIgnoredDuringExecution() {
    return this.requiredDuringSchedulingIgnoredDuringExecution
        .get(requiredDuringSchedulingIgnoredDuringExecution.size() - 1)
        .build();
  }

  public io.kubernetes.client.openapi.models.V1PodAffinityTerm
      buildMatchingRequiredDuringSchedulingIgnoredDuringExecution(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PodAffinityTermBuilder>
              predicate) {
    for (io.kubernetes.client.openapi.models.V1PodAffinityTermBuilder item :
        requiredDuringSchedulingIgnoredDuringExecution) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingRequiredDuringSchedulingIgnoredDuringExecution(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PodAffinityTermBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1PodAffinityTermBuilder item :
        requiredDuringSchedulingIgnoredDuringExecution) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withRequiredDuringSchedulingIgnoredDuringExecution(
      java.util.List<io.kubernetes.client.openapi.models.V1PodAffinityTerm>
          requiredDuringSchedulingIgnoredDuringExecution) {
    if (this.requiredDuringSchedulingIgnoredDuringExecution != null) {
      _visitables
          .get("requiredDuringSchedulingIgnoredDuringExecution")
          .removeAll(this.requiredDuringSchedulingIgnoredDuringExecution);
    }
    if (requiredDuringSchedulingIgnoredDuringExecution != null) {
      this.requiredDuringSchedulingIgnoredDuringExecution = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1PodAffinityTerm item :
          requiredDuringSchedulingIgnoredDuringExecution) {
        this.addToRequiredDuringSchedulingIgnoredDuringExecution(item);
      }
    } else {
      this.requiredDuringSchedulingIgnoredDuringExecution = null;
    }
    return (A) this;
  }

  public A withRequiredDuringSchedulingIgnoredDuringExecution(
      io.kubernetes.client.openapi.models.V1PodAffinityTerm...
          requiredDuringSchedulingIgnoredDuringExecution) {
    if (this.requiredDuringSchedulingIgnoredDuringExecution != null) {
      this.requiredDuringSchedulingIgnoredDuringExecution.clear();
    }
    if (requiredDuringSchedulingIgnoredDuringExecution != null) {
      for (io.kubernetes.client.openapi.models.V1PodAffinityTerm item :
          requiredDuringSchedulingIgnoredDuringExecution) {
        this.addToRequiredDuringSchedulingIgnoredDuringExecution(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasRequiredDuringSchedulingIgnoredDuringExecution() {
    return requiredDuringSchedulingIgnoredDuringExecution != null
        && !requiredDuringSchedulingIgnoredDuringExecution.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1PodAntiAffinityFluent
              .RequiredDuringSchedulingIgnoredDuringExecutionNested<
          A>
      addNewRequiredDuringSchedulingIgnoredDuringExecution() {
    return new io.kubernetes.client.openapi.models.V1PodAntiAffinityFluentImpl
        .RequiredDuringSchedulingIgnoredDuringExecutionNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1PodAntiAffinityFluent
              .RequiredDuringSchedulingIgnoredDuringExecutionNested<
          A>
      addNewRequiredDuringSchedulingIgnoredDuringExecutionLike(
          io.kubernetes.client.openapi.models.V1PodAffinityTerm item) {
    return new io.kubernetes.client.openapi.models.V1PodAntiAffinityFluentImpl
        .RequiredDuringSchedulingIgnoredDuringExecutionNestedImpl(-1, item);
  }

  public io.kubernetes.client.openapi.models.V1PodAntiAffinityFluent
              .RequiredDuringSchedulingIgnoredDuringExecutionNested<
          A>
      setNewRequiredDuringSchedulingIgnoredDuringExecutionLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1PodAffinityTerm item) {
    return new io.kubernetes.client.openapi.models.V1PodAntiAffinityFluentImpl
        .RequiredDuringSchedulingIgnoredDuringExecutionNestedImpl(index, item);
  }

  public io.kubernetes.client.openapi.models.V1PodAntiAffinityFluent
              .RequiredDuringSchedulingIgnoredDuringExecutionNested<
          A>
      editRequiredDuringSchedulingIgnoredDuringExecution(java.lang.Integer index) {
    if (requiredDuringSchedulingIgnoredDuringExecution.size() <= index)
      throw new RuntimeException(
          "Can't edit requiredDuringSchedulingIgnoredDuringExecution. Index exceeds size.");
    return setNewRequiredDuringSchedulingIgnoredDuringExecutionLike(
        index, buildRequiredDuringSchedulingIgnoredDuringExecution(index));
  }

  public io.kubernetes.client.openapi.models.V1PodAntiAffinityFluent
              .RequiredDuringSchedulingIgnoredDuringExecutionNested<
          A>
      editFirstRequiredDuringSchedulingIgnoredDuringExecution() {
    if (requiredDuringSchedulingIgnoredDuringExecution.size() == 0)
      throw new RuntimeException(
          "Can't edit first requiredDuringSchedulingIgnoredDuringExecution. The list is empty.");
    return setNewRequiredDuringSchedulingIgnoredDuringExecutionLike(
        0, buildRequiredDuringSchedulingIgnoredDuringExecution(0));
  }

  public io.kubernetes.client.openapi.models.V1PodAntiAffinityFluent
              .RequiredDuringSchedulingIgnoredDuringExecutionNested<
          A>
      editLastRequiredDuringSchedulingIgnoredDuringExecution() {
    int index = requiredDuringSchedulingIgnoredDuringExecution.size() - 1;
    if (index < 0)
      throw new RuntimeException(
          "Can't edit last requiredDuringSchedulingIgnoredDuringExecution. The list is empty.");
    return setNewRequiredDuringSchedulingIgnoredDuringExecutionLike(
        index, buildRequiredDuringSchedulingIgnoredDuringExecution(index));
  }

  public io.kubernetes.client.openapi.models.V1PodAntiAffinityFluent
              .RequiredDuringSchedulingIgnoredDuringExecutionNested<
          A>
      editMatchingRequiredDuringSchedulingIgnoredDuringExecution(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PodAffinityTermBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < requiredDuringSchedulingIgnoredDuringExecution.size(); i++) {
      if (predicate.test(requiredDuringSchedulingIgnoredDuringExecution.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0)
      throw new RuntimeException(
          "Can't edit matching requiredDuringSchedulingIgnoredDuringExecution. No match found.");
    return setNewRequiredDuringSchedulingIgnoredDuringExecutionLike(
        index, buildRequiredDuringSchedulingIgnoredDuringExecution(index));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1PodAntiAffinityFluentImpl that = (V1PodAntiAffinityFluentImpl) o;
    if (preferredDuringSchedulingIgnoredDuringExecution != null
        ? !preferredDuringSchedulingIgnoredDuringExecution.equals(
            that.preferredDuringSchedulingIgnoredDuringExecution)
        : that.preferredDuringSchedulingIgnoredDuringExecution != null) return false;
    if (requiredDuringSchedulingIgnoredDuringExecution != null
        ? !requiredDuringSchedulingIgnoredDuringExecution.equals(
            that.requiredDuringSchedulingIgnoredDuringExecution)
        : that.requiredDuringSchedulingIgnoredDuringExecution != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        preferredDuringSchedulingIgnoredDuringExecution,
        requiredDuringSchedulingIgnoredDuringExecution,
        super.hashCode());
  }

  public class PreferredDuringSchedulingIgnoredDuringExecutionNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermFluentImpl<
          io.kubernetes.client.openapi.models.V1PodAntiAffinityFluent
                  .PreferredDuringSchedulingIgnoredDuringExecutionNested<
              N>>
      implements io.kubernetes.client.openapi.models.V1PodAntiAffinityFluent
                  .PreferredDuringSchedulingIgnoredDuringExecutionNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    PreferredDuringSchedulingIgnoredDuringExecutionNestedImpl(
        java.lang.Integer index,
        io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm item) {
      this.index = index;
      this.builder =
          new io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermBuilder(this, item);
    }

    PreferredDuringSchedulingIgnoredDuringExecutionNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N)
          V1PodAntiAffinityFluentImpl.this.setToPreferredDuringSchedulingIgnoredDuringExecution(
              index, builder.build());
    }

    public N endPreferredDuringSchedulingIgnoredDuringExecution() {
      return and();
    }
  }

  public class RequiredDuringSchedulingIgnoredDuringExecutionNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1PodAffinityTermFluentImpl<
          io.kubernetes.client.openapi.models.V1PodAntiAffinityFluent
                  .RequiredDuringSchedulingIgnoredDuringExecutionNested<
              N>>
      implements io.kubernetes.client.openapi.models.V1PodAntiAffinityFluent
                  .RequiredDuringSchedulingIgnoredDuringExecutionNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    RequiredDuringSchedulingIgnoredDuringExecutionNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V1PodAffinityTerm item) {
      this.index = index;
      this.builder = new io.kubernetes.client.openapi.models.V1PodAffinityTermBuilder(this, item);
    }

    RequiredDuringSchedulingIgnoredDuringExecutionNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1PodAffinityTermBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1PodAffinityTermBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N)
          V1PodAntiAffinityFluentImpl.this.setToRequiredDuringSchedulingIgnoredDuringExecution(
              index, builder.build());
    }

    public N endRequiredDuringSchedulingIgnoredDuringExecution() {
      return and();
    }
  }
}
