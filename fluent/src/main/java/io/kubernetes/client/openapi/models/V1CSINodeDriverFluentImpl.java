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

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V1CSINodeDriverFluentImpl<A extends V1CSINodeDriverFluent<A>> extends BaseFluent<A>
    implements V1CSINodeDriverFluent<A> {
  public V1CSINodeDriverFluentImpl() {}

  public V1CSINodeDriverFluentImpl(io.kubernetes.client.openapi.models.V1CSINodeDriver instance) {
    this.withAllocatable(instance.getAllocatable());

    this.withName(instance.getName());

    this.withNodeID(instance.getNodeID());

    this.withTopologyKeys(instance.getTopologyKeys());
  }

  private V1VolumeNodeResourcesBuilder allocatable;
  private String name;
  private java.lang.String nodeID;
  private List<java.lang.String> topologyKeys;

  /**
   * This method has been deprecated, please use method buildAllocatable instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1VolumeNodeResources getAllocatable() {
    return this.allocatable != null ? this.allocatable.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1VolumeNodeResources buildAllocatable() {
    return this.allocatable != null ? this.allocatable.build() : null;
  }

  public A withAllocatable(io.kubernetes.client.openapi.models.V1VolumeNodeResources allocatable) {
    _visitables.get("allocatable").remove(this.allocatable);
    if (allocatable != null) {
      this.allocatable =
          new io.kubernetes.client.openapi.models.V1VolumeNodeResourcesBuilder(allocatable);
      _visitables.get("allocatable").add(this.allocatable);
    }
    return (A) this;
  }

  public Boolean hasAllocatable() {
    return this.allocatable != null;
  }

  public V1CSINodeDriverFluent.AllocatableNested<A> withNewAllocatable() {
    return new V1CSINodeDriverFluentImpl.AllocatableNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1CSINodeDriverFluent.AllocatableNested<A>
      withNewAllocatableLike(io.kubernetes.client.openapi.models.V1VolumeNodeResources item) {
    return new V1CSINodeDriverFluentImpl.AllocatableNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1CSINodeDriverFluent.AllocatableNested<A>
      editAllocatable() {
    return withNewAllocatableLike(getAllocatable());
  }

  public io.kubernetes.client.openapi.models.V1CSINodeDriverFluent.AllocatableNested<A>
      editOrNewAllocatable() {
    return withNewAllocatableLike(
        getAllocatable() != null
            ? getAllocatable()
            : new io.kubernetes.client.openapi.models.V1VolumeNodeResourcesBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1CSINodeDriverFluent.AllocatableNested<A>
      editOrNewAllocatableLike(io.kubernetes.client.openapi.models.V1VolumeNodeResources item) {
    return withNewAllocatableLike(getAllocatable() != null ? getAllocatable() : item);
  }

  public java.lang.String getName() {
    return this.name;
  }

  public A withName(java.lang.String name) {
    this.name = name;
    return (A) this;
  }

  public java.lang.Boolean hasName() {
    return this.name != null;
  }

  public java.lang.String getNodeID() {
    return this.nodeID;
  }

  public A withNodeID(java.lang.String nodeID) {
    this.nodeID = nodeID;
    return (A) this;
  }

  public java.lang.Boolean hasNodeID() {
    return this.nodeID != null;
  }

  public A addToTopologyKeys(Integer index, java.lang.String item) {
    if (this.topologyKeys == null) {
      this.topologyKeys = new ArrayList<java.lang.String>();
    }
    this.topologyKeys.add(index, item);
    return (A) this;
  }

  public A setToTopologyKeys(java.lang.Integer index, java.lang.String item) {
    if (this.topologyKeys == null) {
      this.topologyKeys = new java.util.ArrayList<java.lang.String>();
    }
    this.topologyKeys.set(index, item);
    return (A) this;
  }

  public A addToTopologyKeys(java.lang.String... items) {
    if (this.topologyKeys == null) {
      this.topologyKeys = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.topologyKeys.add(item);
    }
    return (A) this;
  }

  public A addAllToTopologyKeys(Collection<java.lang.String> items) {
    if (this.topologyKeys == null) {
      this.topologyKeys = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.topologyKeys.add(item);
    }
    return (A) this;
  }

  public A removeFromTopologyKeys(java.lang.String... items) {
    for (java.lang.String item : items) {
      if (this.topologyKeys != null) {
        this.topologyKeys.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromTopologyKeys(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {
      if (this.topologyKeys != null) {
        this.topologyKeys.remove(item);
      }
    }
    return (A) this;
  }

  public java.util.List<java.lang.String> getTopologyKeys() {
    return this.topologyKeys;
  }

  public java.lang.String getTopologyKey(java.lang.Integer index) {
    return this.topologyKeys.get(index);
  }

  public java.lang.String getFirstTopologyKey() {
    return this.topologyKeys.get(0);
  }

  public java.lang.String getLastTopologyKey() {
    return this.topologyKeys.get(topologyKeys.size() - 1);
  }

  public java.lang.String getMatchingTopologyKey(Predicate<java.lang.String> predicate) {
    for (java.lang.String item : topologyKeys) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingTopologyKey(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : topologyKeys) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withTopologyKeys(java.util.List<java.lang.String> topologyKeys) {
    if (topologyKeys != null) {
      this.topologyKeys = new java.util.ArrayList();
      for (java.lang.String item : topologyKeys) {
        this.addToTopologyKeys(item);
      }
    } else {
      this.topologyKeys = null;
    }
    return (A) this;
  }

  public A withTopologyKeys(java.lang.String... topologyKeys) {
    if (this.topologyKeys != null) {
      this.topologyKeys.clear();
    }
    if (topologyKeys != null) {
      for (java.lang.String item : topologyKeys) {
        this.addToTopologyKeys(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasTopologyKeys() {
    return topologyKeys != null && !topologyKeys.isEmpty();
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1CSINodeDriverFluentImpl that = (V1CSINodeDriverFluentImpl) o;
    if (allocatable != null ? !allocatable.equals(that.allocatable) : that.allocatable != null)
      return false;
    if (name != null ? !name.equals(that.name) : that.name != null) return false;
    if (nodeID != null ? !nodeID.equals(that.nodeID) : that.nodeID != null) return false;
    if (topologyKeys != null ? !topologyKeys.equals(that.topologyKeys) : that.topologyKeys != null)
      return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(allocatable, name, nodeID, topologyKeys, super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (allocatable != null) {
      sb.append("allocatable:");
      sb.append(allocatable + ",");
    }
    if (name != null) {
      sb.append("name:");
      sb.append(name + ",");
    }
    if (nodeID != null) {
      sb.append("nodeID:");
      sb.append(nodeID + ",");
    }
    if (topologyKeys != null && !topologyKeys.isEmpty()) {
      sb.append("topologyKeys:");
      sb.append(topologyKeys);
    }
    sb.append("}");
    return sb.toString();
  }

  class AllocatableNestedImpl<N>
      extends V1VolumeNodeResourcesFluentImpl<V1CSINodeDriverFluent.AllocatableNested<N>>
      implements io.kubernetes.client.openapi.models.V1CSINodeDriverFluent.AllocatableNested<N>,
          Nested<N> {
    AllocatableNestedImpl(io.kubernetes.client.openapi.models.V1VolumeNodeResources item) {
      this.builder = new V1VolumeNodeResourcesBuilder(this, item);
    }

    AllocatableNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1VolumeNodeResourcesBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1VolumeNodeResourcesBuilder builder;

    public N and() {
      return (N) V1CSINodeDriverFluentImpl.this.withAllocatable(builder.build());
    }

    public N endAllocatable() {
      return and();
    }
  }
}
