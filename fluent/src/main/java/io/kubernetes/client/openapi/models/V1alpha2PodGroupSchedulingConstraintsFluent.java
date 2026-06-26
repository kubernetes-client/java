/*
Copyright 2026 The Kubernetes Authors.
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
import java.lang.Object;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1alpha2PodGroupSchedulingConstraintsFluent<A extends io.kubernetes.client.openapi.models.V1alpha2PodGroupSchedulingConstraintsFluent<A>> extends BaseFluent<A>{

  private ArrayList<V1alpha2TopologyConstraintBuilder> topology;

  public V1alpha2PodGroupSchedulingConstraintsFluent() {
  }
  
  public V1alpha2PodGroupSchedulingConstraintsFluent(V1alpha2PodGroupSchedulingConstraints instance) {
    this.copyInstance(instance);
  }

  public A addAllToTopology(Collection<V1alpha2TopologyConstraint> items) {
    if (this.topology == null) {
      this.topology = new ArrayList();
    }
    for (V1alpha2TopologyConstraint item : items) {
        V1alpha2TopologyConstraintBuilder builder = new V1alpha2TopologyConstraintBuilder(item);
        this._visitables.get("topology").add(builder);
        this.topology.add(builder);
    }
    return (A) this;
  }
  
  public TopologyNested<A> addNewTopology() {
    return new TopologyNested(-1, null);
  }
  
  public TopologyNested<A> addNewTopologyLike(V1alpha2TopologyConstraint item) {
    return new TopologyNested(-1, item);
  }
  
  public A addToTopology(V1alpha2TopologyConstraint... items) {
    if (this.topology == null) {
      this.topology = new ArrayList();
    }
    for (V1alpha2TopologyConstraint item : items) {
        V1alpha2TopologyConstraintBuilder builder = new V1alpha2TopologyConstraintBuilder(item);
        this._visitables.get("topology").add(builder);
        this.topology.add(builder);
    }
    return (A) this;
  }
  
  public A addToTopology(int index,V1alpha2TopologyConstraint item) {
    if (this.topology == null) {
      this.topology = new ArrayList();
    }
    V1alpha2TopologyConstraintBuilder builder = new V1alpha2TopologyConstraintBuilder(item);
    if (index < 0 || index >= this.topology.size()) {
        this._visitables.get("topology").add(builder);
        this.topology.add(builder);
    } else {
        this._visitables.get("topology").add(builder);
        this.topology.add(index, builder);
    }
    return (A) this;
  }
  
  public V1alpha2TopologyConstraint buildFirstTopology() {
    return this.topology.get(0).build();
  }
  
  public V1alpha2TopologyConstraint buildLastTopology() {
    return this.topology.get(topology.size() - 1).build();
  }
  
  public V1alpha2TopologyConstraint buildMatchingTopology(Predicate<V1alpha2TopologyConstraintBuilder> predicate) {
      for (V1alpha2TopologyConstraintBuilder item : topology) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public List<V1alpha2TopologyConstraint> buildTopology() {
    return this.topology != null ? build(topology) : null;
  }
  
  public V1alpha2TopologyConstraint buildTopology(int index) {
    return this.topology.get(index).build();
  }
  
  protected void copyInstance(V1alpha2PodGroupSchedulingConstraints instance) {
    instance = instance != null ? instance : new V1alpha2PodGroupSchedulingConstraints();
    if (instance != null) {
      this.withTopology(instance.getTopology());
    }
  }
  
  public TopologyNested<A> editFirstTopology() {
    if (topology.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "topology"));
    }
    return this.setNewTopologyLike(0, this.buildTopology(0));
  }
  
  public TopologyNested<A> editLastTopology() {
    int index = topology.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "topology"));
    }
    return this.setNewTopologyLike(index, this.buildTopology(index));
  }
  
  public TopologyNested<A> editMatchingTopology(Predicate<V1alpha2TopologyConstraintBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < topology.size();i++) {
      if (predicate.test(topology.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "topology"));
    }
    return this.setNewTopologyLike(index, this.buildTopology(index));
  }
  
  public TopologyNested<A> editTopology(int index) {
    if (topology.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "topology"));
    }
    return this.setNewTopologyLike(index, this.buildTopology(index));
  }
  
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }
    if (!(super.equals(o))) {
      return false;
    }
    V1alpha2PodGroupSchedulingConstraintsFluent that = (V1alpha2PodGroupSchedulingConstraintsFluent) o;
    if (!(Objects.equals(topology, that.topology))) {
      return false;
    }
    return true;
  }
  
  public boolean hasMatchingTopology(Predicate<V1alpha2TopologyConstraintBuilder> predicate) {
      for (V1alpha2TopologyConstraintBuilder item : topology) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasTopology() {
    return this.topology != null && !(this.topology.isEmpty());
  }
  
  public int hashCode() {
    return Objects.hash(topology);
  }
  
  public A removeAllFromTopology(Collection<V1alpha2TopologyConstraint> items) {
    if (this.topology == null) {
      return (A) this;
    }
    for (V1alpha2TopologyConstraint item : items) {
        V1alpha2TopologyConstraintBuilder builder = new V1alpha2TopologyConstraintBuilder(item);
        _visitables.get("topology").remove(builder);
        this.topology.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromTopology(V1alpha2TopologyConstraint... items) {
    if (this.topology == null) {
      return (A) this;
    }
    for (V1alpha2TopologyConstraint item : items) {
        V1alpha2TopologyConstraintBuilder builder = new V1alpha2TopologyConstraintBuilder(item);
        _visitables.get("topology").remove(builder);
        this.topology.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromTopology(Predicate<V1alpha2TopologyConstraintBuilder> predicate) {
    if (topology == null) {
      return (A) this;
    }
    Iterator<V1alpha2TopologyConstraintBuilder> each = topology.iterator();
    List visitables = this._visitables.get("topology");
    while (each.hasNext()) {
        V1alpha2TopologyConstraintBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public TopologyNested<A> setNewTopologyLike(int index,V1alpha2TopologyConstraint item) {
    return new TopologyNested(index, item);
  }
  
  public A setToTopology(int index,V1alpha2TopologyConstraint item) {
    if (this.topology == null) {
      this.topology = new ArrayList();
    }
    V1alpha2TopologyConstraintBuilder builder = new V1alpha2TopologyConstraintBuilder(item);
    if (index < 0 || index >= this.topology.size()) {
        this._visitables.get("topology").add(builder);
        this.topology.add(builder);
    } else {
        this._visitables.get("topology").add(builder);
        this.topology.set(index, builder);
    }
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(topology == null) && !(topology.isEmpty())) {
        sb.append("topology:");
        sb.append(topology);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withTopology(List<V1alpha2TopologyConstraint> topology) {
    if (this.topology != null) {
      this._visitables.get("topology").clear();
    }
    if (topology != null) {
        this.topology = new ArrayList();
        for (V1alpha2TopologyConstraint item : topology) {
          this.addToTopology(item);
        }
    } else {
      this.topology = null;
    }
    return (A) this;
  }
  
  public A withTopology(V1alpha2TopologyConstraint... topology) {
    if (this.topology != null) {
        this.topology.clear();
        _visitables.remove("topology");
    }
    if (topology != null) {
      for (V1alpha2TopologyConstraint item : topology) {
        this.addToTopology(item);
      }
    }
    return (A) this;
  }
  public class TopologyNested<N> extends V1alpha2TopologyConstraintFluent<TopologyNested<N>> implements Nested<N>{
  
    V1alpha2TopologyConstraintBuilder builder;
    int index;
  
    TopologyNested(int index,V1alpha2TopologyConstraint item) {
      this.index = index;
      this.builder = new V1alpha2TopologyConstraintBuilder(this, item);
    }
  
    public N and() {
      return (N) V1alpha2PodGroupSchedulingConstraintsFluent.this.setToTopology(index, builder.build());
    }
    
    public N endTopology() {
      return and();
    }
    
  }
}