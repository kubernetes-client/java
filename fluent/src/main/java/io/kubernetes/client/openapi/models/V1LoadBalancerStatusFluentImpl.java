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
public class V1LoadBalancerStatusFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1LoadBalancerStatusFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1LoadBalancerStatusFluent<A> {
  public V1LoadBalancerStatusFluentImpl() {}

  public V1LoadBalancerStatusFluentImpl(
      io.kubernetes.client.openapi.models.V1LoadBalancerStatus instance) {
    this.withIngress(instance.getIngress());
  }

  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1LoadBalancerIngressBuilder>
      ingress;

  public A addToIngress(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1LoadBalancerIngress item) {
    if (this.ingress == null) {
      this.ingress =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1LoadBalancerIngressBuilder>();
    }
    io.kubernetes.client.openapi.models.V1LoadBalancerIngressBuilder builder =
        new io.kubernetes.client.openapi.models.V1LoadBalancerIngressBuilder(item);
    _visitables.get("ingress").add(index >= 0 ? index : _visitables.get("ingress").size(), builder);
    this.ingress.add(index >= 0 ? index : ingress.size(), builder);
    return (A) this;
  }

  public A setToIngress(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1LoadBalancerIngress item) {
    if (this.ingress == null) {
      this.ingress =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1LoadBalancerIngressBuilder>();
    }
    io.kubernetes.client.openapi.models.V1LoadBalancerIngressBuilder builder =
        new io.kubernetes.client.openapi.models.V1LoadBalancerIngressBuilder(item);
    if (index < 0 || index >= _visitables.get("ingress").size()) {
      _visitables.get("ingress").add(builder);
    } else {
      _visitables.get("ingress").set(index, builder);
    }
    if (index < 0 || index >= ingress.size()) {
      ingress.add(builder);
    } else {
      ingress.set(index, builder);
    }
    return (A) this;
  }

  public A addToIngress(io.kubernetes.client.openapi.models.V1LoadBalancerIngress... items) {
    if (this.ingress == null) {
      this.ingress =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1LoadBalancerIngressBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1LoadBalancerIngress item : items) {
      io.kubernetes.client.openapi.models.V1LoadBalancerIngressBuilder builder =
          new io.kubernetes.client.openapi.models.V1LoadBalancerIngressBuilder(item);
      _visitables.get("ingress").add(builder);
      this.ingress.add(builder);
    }
    return (A) this;
  }

  public A addAllToIngress(
      java.util.Collection<io.kubernetes.client.openapi.models.V1LoadBalancerIngress> items) {
    if (this.ingress == null) {
      this.ingress =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1LoadBalancerIngressBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1LoadBalancerIngress item : items) {
      io.kubernetes.client.openapi.models.V1LoadBalancerIngressBuilder builder =
          new io.kubernetes.client.openapi.models.V1LoadBalancerIngressBuilder(item);
      _visitables.get("ingress").add(builder);
      this.ingress.add(builder);
    }
    return (A) this;
  }

  public A removeFromIngress(io.kubernetes.client.openapi.models.V1LoadBalancerIngress... items) {
    for (io.kubernetes.client.openapi.models.V1LoadBalancerIngress item : items) {
      io.kubernetes.client.openapi.models.V1LoadBalancerIngressBuilder builder =
          new io.kubernetes.client.openapi.models.V1LoadBalancerIngressBuilder(item);
      _visitables.get("ingress").remove(builder);
      if (this.ingress != null) {
        this.ingress.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromIngress(
      java.util.Collection<io.kubernetes.client.openapi.models.V1LoadBalancerIngress> items) {
    for (io.kubernetes.client.openapi.models.V1LoadBalancerIngress item : items) {
      io.kubernetes.client.openapi.models.V1LoadBalancerIngressBuilder builder =
          new io.kubernetes.client.openapi.models.V1LoadBalancerIngressBuilder(item);
      _visitables.get("ingress").remove(builder);
      if (this.ingress != null) {
        this.ingress.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromIngress(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1LoadBalancerIngressBuilder>
          predicate) {
    if (ingress == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1LoadBalancerIngressBuilder> each =
        ingress.iterator();
    final List visitables = _visitables.get("ingress");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1LoadBalancerIngressBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildIngress instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1LoadBalancerIngress> getIngress() {
    return ingress != null ? build(ingress) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1LoadBalancerIngress> buildIngress() {
    return ingress != null ? build(ingress) : null;
  }

  public io.kubernetes.client.openapi.models.V1LoadBalancerIngress buildIngress(
      java.lang.Integer index) {
    return this.ingress.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1LoadBalancerIngress buildFirstIngress() {
    return this.ingress.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1LoadBalancerIngress buildLastIngress() {
    return this.ingress.get(ingress.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1LoadBalancerIngress buildMatchingIngress(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1LoadBalancerIngressBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1LoadBalancerIngressBuilder item : ingress) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingIngress(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1LoadBalancerIngressBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1LoadBalancerIngressBuilder item : ingress) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withIngress(
      java.util.List<io.kubernetes.client.openapi.models.V1LoadBalancerIngress> ingress) {
    if (this.ingress != null) {
      _visitables.get("ingress").removeAll(this.ingress);
    }
    if (ingress != null) {
      this.ingress = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1LoadBalancerIngress item : ingress) {
        this.addToIngress(item);
      }
    } else {
      this.ingress = null;
    }
    return (A) this;
  }

  public A withIngress(io.kubernetes.client.openapi.models.V1LoadBalancerIngress... ingress) {
    if (this.ingress != null) {
      this.ingress.clear();
    }
    if (ingress != null) {
      for (io.kubernetes.client.openapi.models.V1LoadBalancerIngress item : ingress) {
        this.addToIngress(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasIngress() {
    return ingress != null && !ingress.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1LoadBalancerStatusFluent.IngressNested<A>
      addNewIngress() {
    return new io.kubernetes.client.openapi.models.V1LoadBalancerStatusFluentImpl
        .IngressNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1LoadBalancerStatusFluent.IngressNested<A>
      addNewIngressLike(io.kubernetes.client.openapi.models.V1LoadBalancerIngress item) {
    return new io.kubernetes.client.openapi.models.V1LoadBalancerStatusFluentImpl.IngressNestedImpl(
        -1, item);
  }

  public io.kubernetes.client.openapi.models.V1LoadBalancerStatusFluent.IngressNested<A>
      setNewIngressLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1LoadBalancerIngress item) {
    return new io.kubernetes.client.openapi.models.V1LoadBalancerStatusFluentImpl.IngressNestedImpl(
        index, item);
  }

  public io.kubernetes.client.openapi.models.V1LoadBalancerStatusFluent.IngressNested<A>
      editIngress(java.lang.Integer index) {
    if (ingress.size() <= index)
      throw new RuntimeException("Can't edit ingress. Index exceeds size.");
    return setNewIngressLike(index, buildIngress(index));
  }

  public io.kubernetes.client.openapi.models.V1LoadBalancerStatusFluent.IngressNested<A>
      editFirstIngress() {
    if (ingress.size() == 0)
      throw new RuntimeException("Can't edit first ingress. The list is empty.");
    return setNewIngressLike(0, buildIngress(0));
  }

  public io.kubernetes.client.openapi.models.V1LoadBalancerStatusFluent.IngressNested<A>
      editLastIngress() {
    int index = ingress.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last ingress. The list is empty.");
    return setNewIngressLike(index, buildIngress(index));
  }

  public io.kubernetes.client.openapi.models.V1LoadBalancerStatusFluent.IngressNested<A>
      editMatchingIngress(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1LoadBalancerIngressBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < ingress.size(); i++) {
      if (predicate.test(ingress.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0) throw new RuntimeException("Can't edit matching ingress. No match found.");
    return setNewIngressLike(index, buildIngress(index));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1LoadBalancerStatusFluentImpl that = (V1LoadBalancerStatusFluentImpl) o;
    if (ingress != null ? !ingress.equals(that.ingress) : that.ingress != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(ingress, super.hashCode());
  }

  public class IngressNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1LoadBalancerIngressFluentImpl<
          io.kubernetes.client.openapi.models.V1LoadBalancerStatusFluent.IngressNested<N>>
      implements io.kubernetes.client.openapi.models.V1LoadBalancerStatusFluent.IngressNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    IngressNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V1LoadBalancerIngress item) {
      this.index = index;
      this.builder =
          new io.kubernetes.client.openapi.models.V1LoadBalancerIngressBuilder(this, item);
    }

    IngressNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1LoadBalancerIngressBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1LoadBalancerIngressBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1LoadBalancerStatusFluentImpl.this.setToIngress(index, builder.build());
    }

    public N endIngress() {
      return and();
    }
  }
}
