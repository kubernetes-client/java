package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.RuntimeException;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.Objects;
import java.util.Collection;
import java.lang.Object;
import java.util.List;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ResourceStatusFluent<A extends io.kubernetes.client.openapi.models.V1ResourceStatusFluent<A>> extends BaseFluent<A>{
  public V1ResourceStatusFluent() {
  }
  
  public V1ResourceStatusFluent(V1ResourceStatus instance) {
    this.copyInstance(instance);
  }
  private String name;
  private ArrayList<V1ResourceHealthBuilder> resources;
  
  protected void copyInstance(V1ResourceStatus instance) {
    instance = instance != null ? instance : new V1ResourceStatus();
    if (instance != null) {
        this.withName(instance.getName());
        this.withResources(instance.getResources());
    }
  }
  
  public String getName() {
    return this.name;
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public A addToResources(int index,V1ResourceHealth item) {
    if (this.resources == null) {
      this.resources = new ArrayList();
    }
    V1ResourceHealthBuilder builder = new V1ResourceHealthBuilder(item);
    if (index < 0 || index >= resources.size()) {
        _visitables.get("resources").add(builder);
        resources.add(builder);
    } else {
        _visitables.get("resources").add(builder);
        resources.add(index, builder);
    }
    return (A) this;
  }
  
  public A setToResources(int index,V1ResourceHealth item) {
    if (this.resources == null) {
      this.resources = new ArrayList();
    }
    V1ResourceHealthBuilder builder = new V1ResourceHealthBuilder(item);
    if (index < 0 || index >= resources.size()) {
        _visitables.get("resources").add(builder);
        resources.add(builder);
    } else {
        _visitables.get("resources").add(builder);
        resources.set(index, builder);
    }
    return (A) this;
  }
  
  public A addToResources(V1ResourceHealth... items) {
    if (this.resources == null) {
      this.resources = new ArrayList();
    }
    for (V1ResourceHealth item : items) {
        V1ResourceHealthBuilder builder = new V1ResourceHealthBuilder(item);
        _visitables.get("resources").add(builder);
        this.resources.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToResources(Collection<V1ResourceHealth> items) {
    if (this.resources == null) {
      this.resources = new ArrayList();
    }
    for (V1ResourceHealth item : items) {
        V1ResourceHealthBuilder builder = new V1ResourceHealthBuilder(item);
        _visitables.get("resources").add(builder);
        this.resources.add(builder);
    }
    return (A) this;
  }
  
  public A removeFromResources(V1ResourceHealth... items) {
    if (this.resources == null) {
      return (A) this;
    }
    for (V1ResourceHealth item : items) {
        V1ResourceHealthBuilder builder = new V1ResourceHealthBuilder(item);
        _visitables.get("resources").remove(builder);
        this.resources.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromResources(Collection<V1ResourceHealth> items) {
    if (this.resources == null) {
      return (A) this;
    }
    for (V1ResourceHealth item : items) {
        V1ResourceHealthBuilder builder = new V1ResourceHealthBuilder(item);
        _visitables.get("resources").remove(builder);
        this.resources.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromResources(Predicate<V1ResourceHealthBuilder> predicate) {
    if (resources == null) {
      return (A) this;
    }
    Iterator<V1ResourceHealthBuilder> each = resources.iterator();
    List visitables = _visitables.get("resources");
    while (each.hasNext()) {
        V1ResourceHealthBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public List<V1ResourceHealth> buildResources() {
    return this.resources != null ? build(resources) : null;
  }
  
  public V1ResourceHealth buildResource(int index) {
    return this.resources.get(index).build();
  }
  
  public V1ResourceHealth buildFirstResource() {
    return this.resources.get(0).build();
  }
  
  public V1ResourceHealth buildLastResource() {
    return this.resources.get(resources.size() - 1).build();
  }
  
  public V1ResourceHealth buildMatchingResource(Predicate<V1ResourceHealthBuilder> predicate) {
      for (V1ResourceHealthBuilder item : resources) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingResource(Predicate<V1ResourceHealthBuilder> predicate) {
      for (V1ResourceHealthBuilder item : resources) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withResources(List<V1ResourceHealth> resources) {
    if (this.resources != null) {
      this._visitables.get("resources").clear();
    }
    if (resources != null) {
        this.resources = new ArrayList();
        for (V1ResourceHealth item : resources) {
          this.addToResources(item);
        }
    } else {
      this.resources = null;
    }
    return (A) this;
  }
  
  public A withResources(V1ResourceHealth... resources) {
    if (this.resources != null) {
        this.resources.clear();
        _visitables.remove("resources");
    }
    if (resources != null) {
      for (V1ResourceHealth item : resources) {
        this.addToResources(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasResources() {
    return this.resources != null && !(this.resources.isEmpty());
  }
  
  public ResourcesNested<A> addNewResource() {
    return new ResourcesNested(-1, null);
  }
  
  public ResourcesNested<A> addNewResourceLike(V1ResourceHealth item) {
    return new ResourcesNested(-1, item);
  }
  
  public ResourcesNested<A> setNewResourceLike(int index,V1ResourceHealth item) {
    return new ResourcesNested(index, item);
  }
  
  public ResourcesNested<A> editResource(int index) {
    if (index <= resources.size()) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "resources"));
    }
    return this.setNewResourceLike(index, this.buildResource(index));
  }
  
  public ResourcesNested<A> editFirstResource() {
    if (resources.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "resources"));
    }
    return this.setNewResourceLike(0, this.buildResource(0));
  }
  
  public ResourcesNested<A> editLastResource() {
    int index = resources.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "resources"));
    }
    return this.setNewResourceLike(index, this.buildResource(index));
  }
  
  public ResourcesNested<A> editMatchingResource(Predicate<V1ResourceHealthBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < resources.size();i++) {
      if (predicate.test(resources.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "resources"));
    }
    return this.setNewResourceLike(index, this.buildResource(index));
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
    V1ResourceStatusFluent that = (V1ResourceStatusFluent) o;
    if (!(Objects.equals(name, that.name))) {
      return false;
    }
    if (!(Objects.equals(resources, that.resources))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(name, resources);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(name == null)) {
        sb.append("name:");
        sb.append(name);
        sb.append(",");
    }
    if (!(resources == null) && !(resources.isEmpty())) {
        sb.append("resources:");
        sb.append(resources);
    }
    sb.append("}");
    return sb.toString();
  }
  public class ResourcesNested<N> extends V1ResourceHealthFluent<ResourcesNested<N>> implements Nested<N>{
    ResourcesNested(int index,V1ResourceHealth item) {
      this.index = index;
      this.builder = new V1ResourceHealthBuilder(this, item);
    }
    V1ResourceHealthBuilder builder;
    int index;
    
    public N and() {
      return (N) V1ResourceStatusFluent.this.setToResources(index, builder.build());
    }
    
    public N endResource() {
      return and();
    }
    
  
  }

}