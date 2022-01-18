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

/** Generated */
public class V1beta1EndpointFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1beta1EndpointFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1beta1EndpointFluent<A> {
  public V1beta1EndpointFluentImpl() {}

  public V1beta1EndpointFluentImpl(io.kubernetes.client.openapi.models.V1beta1Endpoint instance) {
    this.withAddresses(instance.getAddresses());

    this.withConditions(instance.getConditions());

    this.withHints(instance.getHints());

    this.withHostname(instance.getHostname());

    this.withNodeName(instance.getNodeName());

    this.withTargetRef(instance.getTargetRef());

    this.withTopology(instance.getTopology());
  }

  private java.util.List<java.lang.String> addresses;
  private io.kubernetes.client.openapi.models.V1beta1EndpointConditionsBuilder conditions;
  private io.kubernetes.client.openapi.models.V1beta1EndpointHintsBuilder hints;
  private java.lang.String hostname;
  private java.lang.String nodeName;
  private io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder targetRef;
  private java.util.Map<java.lang.String, java.lang.String> topology;

  public A addToAddresses(java.lang.Integer index, java.lang.String item) {
    if (this.addresses == null) {
      this.addresses = new java.util.ArrayList<java.lang.String>();
    }
    this.addresses.add(index, item);
    return (A) this;
  }

  public A setToAddresses(java.lang.Integer index, java.lang.String item) {
    if (this.addresses == null) {
      this.addresses = new java.util.ArrayList<java.lang.String>();
    }
    this.addresses.set(index, item);
    return (A) this;
  }

  public A addToAddresses(java.lang.String... items) {
    if (this.addresses == null) {
      this.addresses = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.addresses.add(item);
    }
    return (A) this;
  }

  public A addAllToAddresses(java.util.Collection<java.lang.String> items) {
    if (this.addresses == null) {
      this.addresses = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.addresses.add(item);
    }
    return (A) this;
  }

  public A removeFromAddresses(java.lang.String... items) {
    for (java.lang.String item : items) {
      if (this.addresses != null) {
        this.addresses.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromAddresses(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {
      if (this.addresses != null) {
        this.addresses.remove(item);
      }
    }
    return (A) this;
  }

  public java.util.List<java.lang.String> getAddresses() {
    return this.addresses;
  }

  public java.lang.String getAddress(java.lang.Integer index) {
    return this.addresses.get(index);
  }

  public java.lang.String getFirstAddress() {
    return this.addresses.get(0);
  }

  public java.lang.String getLastAddress() {
    return this.addresses.get(addresses.size() - 1);
  }

  public java.lang.String getMatchingAddress(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : addresses) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingAddress(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : addresses) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withAddresses(java.util.List<java.lang.String> addresses) {
    if (addresses != null) {
      this.addresses = new java.util.ArrayList();
      for (java.lang.String item : addresses) {
        this.addToAddresses(item);
      }
    } else {
      this.addresses = null;
    }
    return (A) this;
  }

  public A withAddresses(java.lang.String... addresses) {
    if (this.addresses != null) {
      this.addresses.clear();
    }
    if (addresses != null) {
      for (java.lang.String item : addresses) {
        this.addToAddresses(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasAddresses() {
    return addresses != null && !addresses.isEmpty();
  }

  public A addNewAddress(java.lang.String original) {
    return (A) addToAddresses(new String(original));
  }

  /**
   * This method has been deprecated, please use method buildConditions instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1beta1EndpointConditions getConditions() {
    return this.conditions != null ? this.conditions.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1beta1EndpointConditions buildConditions() {
    return this.conditions != null ? this.conditions.build() : null;
  }

  public A withConditions(
      io.kubernetes.client.openapi.models.V1beta1EndpointConditions conditions) {
    _visitables.get("conditions").remove(this.conditions);
    if (conditions != null) {
      this.conditions =
          new io.kubernetes.client.openapi.models.V1beta1EndpointConditionsBuilder(conditions);
      _visitables.get("conditions").add(this.conditions);
    }
    return (A) this;
  }

  public java.lang.Boolean hasConditions() {
    return this.conditions != null;
  }

  public io.kubernetes.client.openapi.models.V1beta1EndpointFluent.ConditionsNested<A>
      withNewConditions() {
    return new io.kubernetes.client.openapi.models.V1beta1EndpointFluentImpl.ConditionsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1beta1EndpointFluent.ConditionsNested<A>
      withNewConditionsLike(io.kubernetes.client.openapi.models.V1beta1EndpointConditions item) {
    return new io.kubernetes.client.openapi.models.V1beta1EndpointFluentImpl.ConditionsNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.V1beta1EndpointFluent.ConditionsNested<A>
      editConditions() {
    return withNewConditionsLike(getConditions());
  }

  public io.kubernetes.client.openapi.models.V1beta1EndpointFluent.ConditionsNested<A>
      editOrNewConditions() {
    return withNewConditionsLike(
        getConditions() != null
            ? getConditions()
            : new io.kubernetes.client.openapi.models.V1beta1EndpointConditionsBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1beta1EndpointFluent.ConditionsNested<A>
      editOrNewConditionsLike(io.kubernetes.client.openapi.models.V1beta1EndpointConditions item) {
    return withNewConditionsLike(getConditions() != null ? getConditions() : item);
  }

  /**
   * This method has been deprecated, please use method buildHints instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1beta1EndpointHints getHints() {
    return this.hints != null ? this.hints.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1beta1EndpointHints buildHints() {
    return this.hints != null ? this.hints.build() : null;
  }

  public A withHints(io.kubernetes.client.openapi.models.V1beta1EndpointHints hints) {
    _visitables.get("hints").remove(this.hints);
    if (hints != null) {
      this.hints = new io.kubernetes.client.openapi.models.V1beta1EndpointHintsBuilder(hints);
      _visitables.get("hints").add(this.hints);
    }
    return (A) this;
  }

  public java.lang.Boolean hasHints() {
    return this.hints != null;
  }

  public io.kubernetes.client.openapi.models.V1beta1EndpointFluent.HintsNested<A> withNewHints() {
    return new io.kubernetes.client.openapi.models.V1beta1EndpointFluentImpl.HintsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1beta1EndpointFluent.HintsNested<A> withNewHintsLike(
      io.kubernetes.client.openapi.models.V1beta1EndpointHints item) {
    return new io.kubernetes.client.openapi.models.V1beta1EndpointFluentImpl.HintsNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1beta1EndpointFluent.HintsNested<A> editHints() {
    return withNewHintsLike(getHints());
  }

  public io.kubernetes.client.openapi.models.V1beta1EndpointFluent.HintsNested<A> editOrNewHints() {
    return withNewHintsLike(
        getHints() != null
            ? getHints()
            : new io.kubernetes.client.openapi.models.V1beta1EndpointHintsBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1beta1EndpointFluent.HintsNested<A>
      editOrNewHintsLike(io.kubernetes.client.openapi.models.V1beta1EndpointHints item) {
    return withNewHintsLike(getHints() != null ? getHints() : item);
  }

  public java.lang.String getHostname() {
    return this.hostname;
  }

  public A withHostname(java.lang.String hostname) {
    this.hostname = hostname;
    return (A) this;
  }

  public java.lang.Boolean hasHostname() {
    return this.hostname != null;
  }

  /** Method is deprecated. use withHostname instead. */
  @java.lang.Deprecated
  public A withNewHostname(java.lang.String original) {
    return (A) withHostname(new String(original));
  }

  public java.lang.String getNodeName() {
    return this.nodeName;
  }

  public A withNodeName(java.lang.String nodeName) {
    this.nodeName = nodeName;
    return (A) this;
  }

  public java.lang.Boolean hasNodeName() {
    return this.nodeName != null;
  }

  /** Method is deprecated. use withNodeName instead. */
  @java.lang.Deprecated
  public A withNewNodeName(java.lang.String original) {
    return (A) withNodeName(new String(original));
  }

  /**
   * This method has been deprecated, please use method buildTargetRef instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ObjectReference getTargetRef() {
    return this.targetRef != null ? this.targetRef.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1ObjectReference buildTargetRef() {
    return this.targetRef != null ? this.targetRef.build() : null;
  }

  public A withTargetRef(io.kubernetes.client.openapi.models.V1ObjectReference targetRef) {
    _visitables.get("targetRef").remove(this.targetRef);
    if (targetRef != null) {
      this.targetRef = new io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder(targetRef);
      _visitables.get("targetRef").add(this.targetRef);
    }
    return (A) this;
  }

  public java.lang.Boolean hasTargetRef() {
    return this.targetRef != null;
  }

  public io.kubernetes.client.openapi.models.V1beta1EndpointFluent.TargetRefNested<A>
      withNewTargetRef() {
    return new io.kubernetes.client.openapi.models.V1beta1EndpointFluentImpl.TargetRefNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1beta1EndpointFluent.TargetRefNested<A>
      withNewTargetRefLike(io.kubernetes.client.openapi.models.V1ObjectReference item) {
    return new io.kubernetes.client.openapi.models.V1beta1EndpointFluentImpl.TargetRefNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.V1beta1EndpointFluent.TargetRefNested<A>
      editTargetRef() {
    return withNewTargetRefLike(getTargetRef());
  }

  public io.kubernetes.client.openapi.models.V1beta1EndpointFluent.TargetRefNested<A>
      editOrNewTargetRef() {
    return withNewTargetRefLike(
        getTargetRef() != null
            ? getTargetRef()
            : new io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1beta1EndpointFluent.TargetRefNested<A>
      editOrNewTargetRefLike(io.kubernetes.client.openapi.models.V1ObjectReference item) {
    return withNewTargetRefLike(getTargetRef() != null ? getTargetRef() : item);
  }

  public A addToTopology(java.lang.String key, java.lang.String value) {
    if (this.topology == null && key != null && value != null) {
      this.topology = new java.util.LinkedHashMap();
    }
    if (key != null && value != null) {
      this.topology.put(key, value);
    }
    return (A) this;
  }

  public A addToTopology(java.util.Map<java.lang.String, java.lang.String> map) {
    if (this.topology == null && map != null) {
      this.topology = new java.util.LinkedHashMap();
    }
    if (map != null) {
      this.topology.putAll(map);
    }
    return (A) this;
  }

  public A removeFromTopology(java.lang.String key) {
    if (this.topology == null) {
      return (A) this;
    }
    if (key != null && this.topology != null) {
      this.topology.remove(key);
    }
    return (A) this;
  }

  public A removeFromTopology(java.util.Map<java.lang.String, java.lang.String> map) {
    if (this.topology == null) {
      return (A) this;
    }
    if (map != null) {
      for (Object key : map.keySet()) {
        if (this.topology != null) {
          this.topology.remove(key);
        }
      }
    }
    return (A) this;
  }

  public java.util.Map<java.lang.String, java.lang.String> getTopology() {
    return this.topology;
  }

  public <K, V> A withTopology(java.util.Map<java.lang.String, java.lang.String> topology) {
    if (topology == null) {
      this.topology = null;
    } else {
      this.topology = new java.util.LinkedHashMap(topology);
    }
    return (A) this;
  }

  public java.lang.Boolean hasTopology() {
    return this.topology != null;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1beta1EndpointFluentImpl that = (V1beta1EndpointFluentImpl) o;
    if (addresses != null ? !addresses.equals(that.addresses) : that.addresses != null)
      return false;
    if (conditions != null ? !conditions.equals(that.conditions) : that.conditions != null)
      return false;
    if (hints != null ? !hints.equals(that.hints) : that.hints != null) return false;
    if (hostname != null ? !hostname.equals(that.hostname) : that.hostname != null) return false;
    if (nodeName != null ? !nodeName.equals(that.nodeName) : that.nodeName != null) return false;
    if (targetRef != null ? !targetRef.equals(that.targetRef) : that.targetRef != null)
      return false;
    if (topology != null ? !topology.equals(that.topology) : that.topology != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        addresses, conditions, hints, hostname, nodeName, targetRef, topology, super.hashCode());
  }

  public class ConditionsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1beta1EndpointConditionsFluentImpl<
          io.kubernetes.client.openapi.models.V1beta1EndpointFluent.ConditionsNested<N>>
      implements io.kubernetes.client.openapi.models.V1beta1EndpointFluent.ConditionsNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    ConditionsNestedImpl(io.kubernetes.client.openapi.models.V1beta1EndpointConditions item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1beta1EndpointConditionsBuilder(this, item);
    }

    ConditionsNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1beta1EndpointConditionsBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1beta1EndpointConditionsBuilder builder;

    public N and() {
      return (N) V1beta1EndpointFluentImpl.this.withConditions(builder.build());
    }

    public N endConditions() {
      return and();
    }
  }

  public class HintsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1beta1EndpointHintsFluentImpl<
          io.kubernetes.client.openapi.models.V1beta1EndpointFluent.HintsNested<N>>
      implements io.kubernetes.client.openapi.models.V1beta1EndpointFluent.HintsNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    HintsNestedImpl(io.kubernetes.client.openapi.models.V1beta1EndpointHints item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1beta1EndpointHintsBuilder(this, item);
    }

    HintsNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1beta1EndpointHintsBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1beta1EndpointHintsBuilder builder;

    public N and() {
      return (N) V1beta1EndpointFluentImpl.this.withHints(builder.build());
    }

    public N endHints() {
      return and();
    }
  }

  public class TargetRefNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ObjectReferenceFluentImpl<
          io.kubernetes.client.openapi.models.V1beta1EndpointFluent.TargetRefNested<N>>
      implements io.kubernetes.client.openapi.models.V1beta1EndpointFluent.TargetRefNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    TargetRefNestedImpl(io.kubernetes.client.openapi.models.V1ObjectReference item) {
      this.builder = new io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder(this, item);
    }

    TargetRefNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder builder;

    public N and() {
      return (N) V1beta1EndpointFluentImpl.this.withTargetRef(builder.build());
    }

    public N endTargetRef() {
      return and();
    }
  }
}
