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
public class V1APIResourceListFluent<A extends io.kubernetes.client.openapi.models.V1APIResourceListFluent<A>> extends BaseFluent<A>{

  private String apiVersion;
  private String groupVersion;
  private String kind;
  private ArrayList<V1APIResourceBuilder> resources;

  public V1APIResourceListFluent() {
  }
  
  public V1APIResourceListFluent(V1APIResourceList instance) {
    this.copyInstance(instance);
  }

  public A addAllToResources(Collection<V1APIResource> items) {
    if (this.resources == null) {
      this.resources = new ArrayList();
    }
    for (V1APIResource item : items) {
        V1APIResourceBuilder builder = new V1APIResourceBuilder(item);
        _visitables.get("resources").add(builder);
        this.resources.add(builder);
    }
    return (A) this;
  }
  
  public ResourcesNested<A> addNewResource() {
    return new ResourcesNested(-1, null);
  }
  
  public ResourcesNested<A> addNewResourceLike(V1APIResource item) {
    return new ResourcesNested(-1, item);
  }
  
  public A addToResources(V1APIResource... items) {
    if (this.resources == null) {
      this.resources = new ArrayList();
    }
    for (V1APIResource item : items) {
        V1APIResourceBuilder builder = new V1APIResourceBuilder(item);
        _visitables.get("resources").add(builder);
        this.resources.add(builder);
    }
    return (A) this;
  }
  
  public A addToResources(int index,V1APIResource item) {
    if (this.resources == null) {
      this.resources = new ArrayList();
    }
    V1APIResourceBuilder builder = new V1APIResourceBuilder(item);
    if (index < 0 || index >= resources.size()) {
        _visitables.get("resources").add(builder);
        resources.add(builder);
    } else {
        _visitables.get("resources").add(builder);
        resources.add(index, builder);
    }
    return (A) this;
  }
  
  public V1APIResource buildFirstResource() {
    return this.resources.get(0).build();
  }
  
  public V1APIResource buildLastResource() {
    return this.resources.get(resources.size() - 1).build();
  }
  
  public V1APIResource buildMatchingResource(Predicate<V1APIResourceBuilder> predicate) {
      for (V1APIResourceBuilder item : resources) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public V1APIResource buildResource(int index) {
    return this.resources.get(index).build();
  }
  
  public List<V1APIResource> buildResources() {
    return this.resources != null ? build(resources) : null;
  }
  
  protected void copyInstance(V1APIResourceList instance) {
    instance = instance != null ? instance : new V1APIResourceList();
    if (instance != null) {
        this.withApiVersion(instance.getApiVersion());
        this.withGroupVersion(instance.getGroupVersion());
        this.withKind(instance.getKind());
        this.withResources(instance.getResources());
    }
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
  
  public ResourcesNested<A> editMatchingResource(Predicate<V1APIResourceBuilder> predicate) {
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
  
  public ResourcesNested<A> editResource(int index) {
    if (resources.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "resources"));
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
    V1APIResourceListFluent that = (V1APIResourceListFluent) o;
    if (!(Objects.equals(apiVersion, that.apiVersion))) {
      return false;
    }
    if (!(Objects.equals(groupVersion, that.groupVersion))) {
      return false;
    }
    if (!(Objects.equals(kind, that.kind))) {
      return false;
    }
    if (!(Objects.equals(resources, that.resources))) {
      return false;
    }
    return true;
  }
  
  public String getApiVersion() {
    return this.apiVersion;
  }
  
  public String getGroupVersion() {
    return this.groupVersion;
  }
  
  public String getKind() {
    return this.kind;
  }
  
  public boolean hasApiVersion() {
    return this.apiVersion != null;
  }
  
  public boolean hasGroupVersion() {
    return this.groupVersion != null;
  }
  
  public boolean hasKind() {
    return this.kind != null;
  }
  
  public boolean hasMatchingResource(Predicate<V1APIResourceBuilder> predicate) {
      for (V1APIResourceBuilder item : resources) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasResources() {
    return this.resources != null && !(this.resources.isEmpty());
  }
  
  public int hashCode() {
    return Objects.hash(apiVersion, groupVersion, kind, resources);
  }
  
  public A removeAllFromResources(Collection<V1APIResource> items) {
    if (this.resources == null) {
      return (A) this;
    }
    for (V1APIResource item : items) {
        V1APIResourceBuilder builder = new V1APIResourceBuilder(item);
        _visitables.get("resources").remove(builder);
        this.resources.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromResources(V1APIResource... items) {
    if (this.resources == null) {
      return (A) this;
    }
    for (V1APIResource item : items) {
        V1APIResourceBuilder builder = new V1APIResourceBuilder(item);
        _visitables.get("resources").remove(builder);
        this.resources.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromResources(Predicate<V1APIResourceBuilder> predicate) {
    if (resources == null) {
      return (A) this;
    }
    Iterator<V1APIResourceBuilder> each = resources.iterator();
    List visitables = _visitables.get("resources");
    while (each.hasNext()) {
        V1APIResourceBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public ResourcesNested<A> setNewResourceLike(int index,V1APIResource item) {
    return new ResourcesNested(index, item);
  }
  
  public A setToResources(int index,V1APIResource item) {
    if (this.resources == null) {
      this.resources = new ArrayList();
    }
    V1APIResourceBuilder builder = new V1APIResourceBuilder(item);
    if (index < 0 || index >= resources.size()) {
        _visitables.get("resources").add(builder);
        resources.add(builder);
    } else {
        _visitables.get("resources").add(builder);
        resources.set(index, builder);
    }
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(apiVersion == null)) {
        sb.append("apiVersion:");
        sb.append(apiVersion);
        sb.append(",");
    }
    if (!(groupVersion == null)) {
        sb.append("groupVersion:");
        sb.append(groupVersion);
        sb.append(",");
    }
    if (!(kind == null)) {
        sb.append("kind:");
        sb.append(kind);
        sb.append(",");
    }
    if (!(resources == null) && !(resources.isEmpty())) {
        sb.append("resources:");
        sb.append(resources);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return (A) this;
  }
  
  public A withGroupVersion(String groupVersion) {
    this.groupVersion = groupVersion;
    return (A) this;
  }
  
  public A withKind(String kind) {
    this.kind = kind;
    return (A) this;
  }
  
  public A withResources(List<V1APIResource> resources) {
    if (this.resources != null) {
      this._visitables.get("resources").clear();
    }
    if (resources != null) {
        this.resources = new ArrayList();
        for (V1APIResource item : resources) {
          this.addToResources(item);
        }
    } else {
      this.resources = null;
    }
    return (A) this;
  }
  
  public A withResources(V1APIResource... resources) {
    if (this.resources != null) {
        this.resources.clear();
        _visitables.remove("resources");
    }
    if (resources != null) {
      for (V1APIResource item : resources) {
        this.addToResources(item);
      }
    }
    return (A) this;
  }
  public class ResourcesNested<N> extends V1APIResourceFluent<ResourcesNested<N>> implements Nested<N>{
  
    V1APIResourceBuilder builder;
    int index;
  
    ResourcesNested(int index,V1APIResource item) {
      this.index = index;
      this.builder = new V1APIResourceBuilder(this, item);
    }
  
    public N and() {
      return (N) V1APIResourceListFluent.this.setToResources(index, builder.build());
    }
    
    public N endResource() {
      return and();
    }
    
  }
}