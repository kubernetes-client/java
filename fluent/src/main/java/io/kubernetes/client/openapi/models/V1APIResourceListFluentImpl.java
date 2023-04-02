package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1APIResourceListFluentImpl<A extends V1APIResourceListFluent<A>> extends BaseFluent<A> implements V1APIResourceListFluent<A>{
  public V1APIResourceListFluentImpl() {
  }
  public V1APIResourceListFluentImpl(V1APIResourceList instance) {
    this.withApiVersion(instance.getApiVersion());

    this.withGroupVersion(instance.getGroupVersion());

    this.withKind(instance.getKind());

    this.withResources(instance.getResources());

  }
  private String apiVersion;
  private String groupVersion;
  private String kind;
  private ArrayList<V1APIResourceBuilder> resources;
  public String getApiVersion() {
    return this.apiVersion;
  }
  public A withApiVersion(String apiVersion) {
    this.apiVersion=apiVersion; return (A) this;
  }
  public Boolean hasApiVersion() {
    return this.apiVersion != null;
  }
  public String getGroupVersion() {
    return this.groupVersion;
  }
  public A withGroupVersion(String groupVersion) {
    this.groupVersion=groupVersion; return (A) this;
  }
  public Boolean hasGroupVersion() {
    return this.groupVersion != null;
  }
  public String getKind() {
    return this.kind;
  }
  public A withKind(String kind) {
    this.kind=kind; return (A) this;
  }
  public Boolean hasKind() {
    return this.kind != null;
  }
  public A addToResources(Integer index,V1APIResource item) {
    if (this.resources == null) {this.resources = new ArrayList<V1APIResourceBuilder>();}
    V1APIResourceBuilder builder = new V1APIResourceBuilder(item);_visitables.get("resources").add(index >= 0 ? index : _visitables.get("resources").size(), builder);this.resources.add(index >= 0 ? index : resources.size(), builder); return (A)this;
  }
  public A setToResources(Integer index,V1APIResource item) {
    if (this.resources == null) {this.resources = new ArrayList<V1APIResourceBuilder>();}
    V1APIResourceBuilder builder = new V1APIResourceBuilder(item);
    if (index < 0 || index >= _visitables.get("resources").size()) { _visitables.get("resources").add(builder); } else { _visitables.get("resources").set(index, builder);}
    if (index < 0 || index >= resources.size()) { resources.add(builder); } else { resources.set(index, builder);}
     return (A)this;
  }
  public A addToResources(io.kubernetes.client.openapi.models.V1APIResource... items) {
    if (this.resources == null) {this.resources = new ArrayList<V1APIResourceBuilder>();}
    for (V1APIResource item : items) {V1APIResourceBuilder builder = new V1APIResourceBuilder(item);_visitables.get("resources").add(builder);this.resources.add(builder);} return (A)this;
  }
  public A addAllToResources(Collection<V1APIResource> items) {
    if (this.resources == null) {this.resources = new ArrayList<V1APIResourceBuilder>();}
    for (V1APIResource item : items) {V1APIResourceBuilder builder = new V1APIResourceBuilder(item);_visitables.get("resources").add(builder);this.resources.add(builder);} return (A)this;
  }
  public A removeFromResources(io.kubernetes.client.openapi.models.V1APIResource... items) {
    for (V1APIResource item : items) {V1APIResourceBuilder builder = new V1APIResourceBuilder(item);_visitables.get("resources").remove(builder);if (this.resources != null) {this.resources.remove(builder);}} return (A)this;
  }
  public A removeAllFromResources(Collection<V1APIResource> items) {
    for (V1APIResource item : items) {V1APIResourceBuilder builder = new V1APIResourceBuilder(item);_visitables.get("resources").remove(builder);if (this.resources != null) {this.resources.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromResources(Predicate<V1APIResourceBuilder> predicate) {
    if (resources == null) return (A) this;
    final Iterator<V1APIResourceBuilder> each = resources.iterator();
    final List visitables = _visitables.get("resources");
    while (each.hasNext()) {
      V1APIResourceBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildResources instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1APIResource> getResources() {
    return resources != null ? build(resources) : null;
  }
  public List<V1APIResource> buildResources() {
    return resources != null ? build(resources) : null;
  }
  public V1APIResource buildResource(Integer index) {
    return this.resources.get(index).build();
  }
  public V1APIResource buildFirstResource() {
    return this.resources.get(0).build();
  }
  public V1APIResource buildLastResource() {
    return this.resources.get(resources.size() - 1).build();
  }
  public V1APIResource buildMatchingResource(Predicate<V1APIResourceBuilder> predicate) {
    for (V1APIResourceBuilder item: resources) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingResource(Predicate<V1APIResourceBuilder> predicate) {
    for (V1APIResourceBuilder item: resources) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withResources(List<V1APIResource> resources) {
    if (this.resources != null) { _visitables.get("resources").removeAll(this.resources);}
    if (resources != null) {this.resources = new ArrayList(); for (V1APIResource item : resources){this.addToResources(item);}} else { this.resources = null;} return (A) this;
  }
  public A withResources(io.kubernetes.client.openapi.models.V1APIResource... resources) {
    if (this.resources != null) {this.resources.clear();}
    if (resources != null) {for (V1APIResource item :resources){ this.addToResources(item);}} return (A) this;
  }
  public Boolean hasResources() {
    return resources != null && !resources.isEmpty();
  }
  public V1APIResourceListFluent.ResourcesNested<A> addNewResource() {
    return new V1APIResourceListFluentImpl.ResourcesNestedImpl();
  }
  public V1APIResourceListFluent.ResourcesNested<A> addNewResourceLike(V1APIResource item) {
    return new V1APIResourceListFluentImpl.ResourcesNestedImpl(-1, item);
  }
  public V1APIResourceListFluent.ResourcesNested<A> setNewResourceLike(Integer index,V1APIResource item) {
    return new V1APIResourceListFluentImpl.ResourcesNestedImpl(index, item);
  }
  public V1APIResourceListFluent.ResourcesNested<A> editResource(Integer index) {
    if (resources.size() <= index) throw new RuntimeException("Can't edit resources. Index exceeds size.");
    return setNewResourceLike(index, buildResource(index));
  }
  public V1APIResourceListFluent.ResourcesNested<A> editFirstResource() {
    if (resources.size() == 0) throw new RuntimeException("Can't edit first resources. The list is empty.");
    return setNewResourceLike(0, buildResource(0));
  }
  public V1APIResourceListFluent.ResourcesNested<A> editLastResource() {
    int index = resources.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last resources. The list is empty.");
    return setNewResourceLike(index, buildResource(index));
  }
  public V1APIResourceListFluent.ResourcesNested<A> editMatchingResource(Predicate<V1APIResourceBuilder> predicate) {
    int index = -1;
    for (int i=0;i<resources.size();i++) { 
    if (predicate.test(resources.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching resources. No match found.");
    return setNewResourceLike(index, buildResource(index));
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1APIResourceListFluentImpl that = (V1APIResourceListFluentImpl) o;
    if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
    if (groupVersion != null ? !groupVersion.equals(that.groupVersion) :that.groupVersion != null) return false;
    if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
    if (resources != null ? !resources.equals(that.resources) :that.resources != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(apiVersion,  groupVersion,  kind,  resources,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiVersion != null) { sb.append("apiVersion:"); sb.append(apiVersion + ","); }
    if (groupVersion != null) { sb.append("groupVersion:"); sb.append(groupVersion + ","); }
    if (kind != null) { sb.append("kind:"); sb.append(kind + ","); }
    if (resources != null && !resources.isEmpty()) { sb.append("resources:"); sb.append(resources); }
    sb.append("}");
    return sb.toString();
  }
  class ResourcesNestedImpl<N> extends V1APIResourceFluentImpl<V1APIResourceListFluent.ResourcesNested<N>> implements V1APIResourceListFluent.ResourcesNested<N>,Nested<N>{
    ResourcesNestedImpl(Integer index,V1APIResource item) {
      this.index = index;
      this.builder = new V1APIResourceBuilder(this, item);
    }
    ResourcesNestedImpl() {
      this.index = -1;
      this.builder = new V1APIResourceBuilder(this);
    }
    V1APIResourceBuilder builder;
    Integer index;
    public N and() {
      return (N) V1APIResourceListFluentImpl.this.setToResources(index,builder.build());
    }
    public N endResource() {
      return and();
    }
    
  }
  
}