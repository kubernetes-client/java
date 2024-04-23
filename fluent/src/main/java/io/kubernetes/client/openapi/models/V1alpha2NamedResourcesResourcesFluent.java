package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1alpha2NamedResourcesResourcesFluent<A extends V1alpha2NamedResourcesResourcesFluent<A>> extends BaseFluent<A>{
  public V1alpha2NamedResourcesResourcesFluent() {
  }
  
  public V1alpha2NamedResourcesResourcesFluent(V1alpha2NamedResourcesResources instance) {
    this.copyInstance(instance);
  }
  private ArrayList<V1alpha2NamedResourcesInstanceBuilder> instances;
  
  protected void copyInstance(V1alpha2NamedResourcesResources instance) {
    instance = (instance != null ? instance : new V1alpha2NamedResourcesResources());
    if (instance != null) {
          this.withInstances(instance.getInstances());
        }
  }
  
  public A addToInstances(int index,V1alpha2NamedResourcesInstance item) {
    if (this.instances == null) {this.instances = new ArrayList<V1alpha2NamedResourcesInstanceBuilder>();}
    V1alpha2NamedResourcesInstanceBuilder builder = new V1alpha2NamedResourcesInstanceBuilder(item);
    if (index < 0 || index >= instances.size()) { _visitables.get("instances").add(builder); instances.add(builder); } else { _visitables.get("instances").add(index, builder); instances.add(index, builder);}
    return (A)this;
  }
  
  public A setToInstances(int index,V1alpha2NamedResourcesInstance item) {
    if (this.instances == null) {this.instances = new ArrayList<V1alpha2NamedResourcesInstanceBuilder>();}
    V1alpha2NamedResourcesInstanceBuilder builder = new V1alpha2NamedResourcesInstanceBuilder(item);
    if (index < 0 || index >= instances.size()) { _visitables.get("instances").add(builder); instances.add(builder); } else { _visitables.get("instances").set(index, builder); instances.set(index, builder);}
    return (A)this;
  }
  
  public A addToInstances(io.kubernetes.client.openapi.models.V1alpha2NamedResourcesInstance... items) {
    if (this.instances == null) {this.instances = new ArrayList<V1alpha2NamedResourcesInstanceBuilder>();}
    for (V1alpha2NamedResourcesInstance item : items) {V1alpha2NamedResourcesInstanceBuilder builder = new V1alpha2NamedResourcesInstanceBuilder(item);_visitables.get("instances").add(builder);this.instances.add(builder);} return (A)this;
  }
  
  public A addAllToInstances(Collection<V1alpha2NamedResourcesInstance> items) {
    if (this.instances == null) {this.instances = new ArrayList<V1alpha2NamedResourcesInstanceBuilder>();}
    for (V1alpha2NamedResourcesInstance item : items) {V1alpha2NamedResourcesInstanceBuilder builder = new V1alpha2NamedResourcesInstanceBuilder(item);_visitables.get("instances").add(builder);this.instances.add(builder);} return (A)this;
  }
  
  public A removeFromInstances(io.kubernetes.client.openapi.models.V1alpha2NamedResourcesInstance... items) {
    if (this.instances == null) return (A)this;
    for (V1alpha2NamedResourcesInstance item : items) {V1alpha2NamedResourcesInstanceBuilder builder = new V1alpha2NamedResourcesInstanceBuilder(item);_visitables.get("instances").remove(builder); this.instances.remove(builder);} return (A)this;
  }
  
  public A removeAllFromInstances(Collection<V1alpha2NamedResourcesInstance> items) {
    if (this.instances == null) return (A)this;
    for (V1alpha2NamedResourcesInstance item : items) {V1alpha2NamedResourcesInstanceBuilder builder = new V1alpha2NamedResourcesInstanceBuilder(item);_visitables.get("instances").remove(builder); this.instances.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromInstances(Predicate<V1alpha2NamedResourcesInstanceBuilder> predicate) {
    if (instances == null) return (A) this;
    final Iterator<V1alpha2NamedResourcesInstanceBuilder> each = instances.iterator();
    final List visitables = _visitables.get("instances");
    while (each.hasNext()) {
      V1alpha2NamedResourcesInstanceBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1alpha2NamedResourcesInstance> buildInstances() {
    return this.instances != null ? build(instances) : null;
  }
  
  public V1alpha2NamedResourcesInstance buildInstance(int index) {
    return this.instances.get(index).build();
  }
  
  public V1alpha2NamedResourcesInstance buildFirstInstance() {
    return this.instances.get(0).build();
  }
  
  public V1alpha2NamedResourcesInstance buildLastInstance() {
    return this.instances.get(instances.size() - 1).build();
  }
  
  public V1alpha2NamedResourcesInstance buildMatchingInstance(Predicate<V1alpha2NamedResourcesInstanceBuilder> predicate) {
      for (V1alpha2NamedResourcesInstanceBuilder item : instances) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingInstance(Predicate<V1alpha2NamedResourcesInstanceBuilder> predicate) {
      for (V1alpha2NamedResourcesInstanceBuilder item : instances) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withInstances(List<V1alpha2NamedResourcesInstance> instances) {
    if (this.instances != null) {
      this._visitables.get("instances").clear();
    }
    if (instances != null) {
        this.instances = new ArrayList();
        for (V1alpha2NamedResourcesInstance item : instances) {
          this.addToInstances(item);
        }
    } else {
      this.instances = null;
    }
    return (A) this;
  }
  
  public A withInstances(io.kubernetes.client.openapi.models.V1alpha2NamedResourcesInstance... instances) {
    if (this.instances != null) {
        this.instances.clear();
        _visitables.remove("instances");
    }
    if (instances != null) {
      for (V1alpha2NamedResourcesInstance item : instances) {
        this.addToInstances(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasInstances() {
    return this.instances != null && !this.instances.isEmpty();
  }
  
  public InstancesNested<A> addNewInstance() {
    return new InstancesNested(-1, null);
  }
  
  public InstancesNested<A> addNewInstanceLike(V1alpha2NamedResourcesInstance item) {
    return new InstancesNested(-1, item);
  }
  
  public InstancesNested<A> setNewInstanceLike(int index,V1alpha2NamedResourcesInstance item) {
    return new InstancesNested(index, item);
  }
  
  public InstancesNested<A> editInstance(int index) {
    if (instances.size() <= index) throw new RuntimeException("Can't edit instances. Index exceeds size.");
    return setNewInstanceLike(index, buildInstance(index));
  }
  
  public InstancesNested<A> editFirstInstance() {
    if (instances.size() == 0) throw new RuntimeException("Can't edit first instances. The list is empty.");
    return setNewInstanceLike(0, buildInstance(0));
  }
  
  public InstancesNested<A> editLastInstance() {
    int index = instances.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last instances. The list is empty.");
    return setNewInstanceLike(index, buildInstance(index));
  }
  
  public InstancesNested<A> editMatchingInstance(Predicate<V1alpha2NamedResourcesInstanceBuilder> predicate) {
    int index = -1;
    for (int i=0;i<instances.size();i++) { 
    if (predicate.test(instances.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching instances. No match found.");
    return setNewInstanceLike(index, buildInstance(index));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha2NamedResourcesResourcesFluent that = (V1alpha2NamedResourcesResourcesFluent) o;
    if (!java.util.Objects.equals(instances, that.instances)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(instances,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (instances != null && !instances.isEmpty()) { sb.append("instances:"); sb.append(instances); }
    sb.append("}");
    return sb.toString();
  }
  public class InstancesNested<N> extends V1alpha2NamedResourcesInstanceFluent<InstancesNested<N>> implements Nested<N>{
    InstancesNested(int index,V1alpha2NamedResourcesInstance item) {
      this.index = index;
      this.builder = new V1alpha2NamedResourcesInstanceBuilder(this, item);
    }
    V1alpha2NamedResourcesInstanceBuilder builder;
    int index;
    
    public N and() {
      return (N) V1alpha2NamedResourcesResourcesFluent.this.setToInstances(index,builder.build());
    }
    
    public N endInstance() {
      return and();
    }
    
  
  }

}