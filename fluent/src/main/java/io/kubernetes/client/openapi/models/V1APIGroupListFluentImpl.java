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
  public class V1APIGroupListFluentImpl<A extends V1APIGroupListFluent<A>> extends BaseFluent<A> implements V1APIGroupListFluent<A>{
  public V1APIGroupListFluentImpl() {
  }
  public V1APIGroupListFluentImpl(V1APIGroupList instance) {
    this.withApiVersion(instance.getApiVersion());

    this.withGroups(instance.getGroups());

    this.withKind(instance.getKind());

  }
  private String apiVersion;
  private ArrayList<V1APIGroupBuilder> groups;
  private String kind;
  public String getApiVersion() {
    return this.apiVersion;
  }
  public A withApiVersion(String apiVersion) {
    this.apiVersion=apiVersion; return (A) this;
  }
  public Boolean hasApiVersion() {
    return this.apiVersion != null;
  }
  public A addToGroups(Integer index,V1APIGroup item) {
    if (this.groups == null) {this.groups = new ArrayList<V1APIGroupBuilder>();}
    V1APIGroupBuilder builder = new V1APIGroupBuilder(item);_visitables.get("groups").add(index >= 0 ? index : _visitables.get("groups").size(), builder);this.groups.add(index >= 0 ? index : groups.size(), builder); return (A)this;
  }
  public A setToGroups(Integer index,V1APIGroup item) {
    if (this.groups == null) {this.groups = new ArrayList<V1APIGroupBuilder>();}
    V1APIGroupBuilder builder = new V1APIGroupBuilder(item);
    if (index < 0 || index >= _visitables.get("groups").size()) { _visitables.get("groups").add(builder); } else { _visitables.get("groups").set(index, builder);}
    if (index < 0 || index >= groups.size()) { groups.add(builder); } else { groups.set(index, builder);}
     return (A)this;
  }
  public A addToGroups(io.kubernetes.client.openapi.models.V1APIGroup... items) {
    if (this.groups == null) {this.groups = new ArrayList<V1APIGroupBuilder>();}
    for (V1APIGroup item : items) {V1APIGroupBuilder builder = new V1APIGroupBuilder(item);_visitables.get("groups").add(builder);this.groups.add(builder);} return (A)this;
  }
  public A addAllToGroups(Collection<V1APIGroup> items) {
    if (this.groups == null) {this.groups = new ArrayList<V1APIGroupBuilder>();}
    for (V1APIGroup item : items) {V1APIGroupBuilder builder = new V1APIGroupBuilder(item);_visitables.get("groups").add(builder);this.groups.add(builder);} return (A)this;
  }
  public A removeFromGroups(io.kubernetes.client.openapi.models.V1APIGroup... items) {
    for (V1APIGroup item : items) {V1APIGroupBuilder builder = new V1APIGroupBuilder(item);_visitables.get("groups").remove(builder);if (this.groups != null) {this.groups.remove(builder);}} return (A)this;
  }
  public A removeAllFromGroups(Collection<V1APIGroup> items) {
    for (V1APIGroup item : items) {V1APIGroupBuilder builder = new V1APIGroupBuilder(item);_visitables.get("groups").remove(builder);if (this.groups != null) {this.groups.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromGroups(Predicate<V1APIGroupBuilder> predicate) {
    if (groups == null) return (A) this;
    final Iterator<V1APIGroupBuilder> each = groups.iterator();
    final List visitables = _visitables.get("groups");
    while (each.hasNext()) {
      V1APIGroupBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildGroups instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1APIGroup> getGroups() {
    return groups != null ? build(groups) : null;
  }
  public List<V1APIGroup> buildGroups() {
    return groups != null ? build(groups) : null;
  }
  public V1APIGroup buildGroup(Integer index) {
    return this.groups.get(index).build();
  }
  public V1APIGroup buildFirstGroup() {
    return this.groups.get(0).build();
  }
  public V1APIGroup buildLastGroup() {
    return this.groups.get(groups.size() - 1).build();
  }
  public V1APIGroup buildMatchingGroup(Predicate<V1APIGroupBuilder> predicate) {
    for (V1APIGroupBuilder item: groups) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingGroup(Predicate<V1APIGroupBuilder> predicate) {
    for (V1APIGroupBuilder item: groups) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withGroups(List<V1APIGroup> groups) {
    if (this.groups != null) { _visitables.get("groups").removeAll(this.groups);}
    if (groups != null) {this.groups = new ArrayList(); for (V1APIGroup item : groups){this.addToGroups(item);}} else { this.groups = null;} return (A) this;
  }
  public A withGroups(io.kubernetes.client.openapi.models.V1APIGroup... groups) {
    if (this.groups != null) {this.groups.clear();}
    if (groups != null) {for (V1APIGroup item :groups){ this.addToGroups(item);}} return (A) this;
  }
  public Boolean hasGroups() {
    return groups != null && !groups.isEmpty();
  }
  public V1APIGroupListFluent.GroupsNested<A> addNewGroup() {
    return new V1APIGroupListFluentImpl.GroupsNestedImpl();
  }
  public V1APIGroupListFluent.GroupsNested<A> addNewGroupLike(V1APIGroup item) {
    return new V1APIGroupListFluentImpl.GroupsNestedImpl(-1, item);
  }
  public V1APIGroupListFluent.GroupsNested<A> setNewGroupLike(Integer index,V1APIGroup item) {
    return new V1APIGroupListFluentImpl.GroupsNestedImpl(index, item);
  }
  public V1APIGroupListFluent.GroupsNested<A> editGroup(Integer index) {
    if (groups.size() <= index) throw new RuntimeException("Can't edit groups. Index exceeds size.");
    return setNewGroupLike(index, buildGroup(index));
  }
  public V1APIGroupListFluent.GroupsNested<A> editFirstGroup() {
    if (groups.size() == 0) throw new RuntimeException("Can't edit first groups. The list is empty.");
    return setNewGroupLike(0, buildGroup(0));
  }
  public V1APIGroupListFluent.GroupsNested<A> editLastGroup() {
    int index = groups.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last groups. The list is empty.");
    return setNewGroupLike(index, buildGroup(index));
  }
  public V1APIGroupListFluent.GroupsNested<A> editMatchingGroup(Predicate<V1APIGroupBuilder> predicate) {
    int index = -1;
    for (int i=0;i<groups.size();i++) { 
    if (predicate.test(groups.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching groups. No match found.");
    return setNewGroupLike(index, buildGroup(index));
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
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1APIGroupListFluentImpl that = (V1APIGroupListFluentImpl) o;
    if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
    if (groups != null ? !groups.equals(that.groups) :that.groups != null) return false;
    if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(apiVersion,  groups,  kind,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiVersion != null) { sb.append("apiVersion:"); sb.append(apiVersion + ","); }
    if (groups != null && !groups.isEmpty()) { sb.append("groups:"); sb.append(groups + ","); }
    if (kind != null) { sb.append("kind:"); sb.append(kind); }
    sb.append("}");
    return sb.toString();
  }
  class GroupsNestedImpl<N> extends V1APIGroupFluentImpl<V1APIGroupListFluent.GroupsNested<N>> implements V1APIGroupListFluent.GroupsNested<N>,Nested<N>{
    GroupsNestedImpl(Integer index,V1APIGroup item) {
      this.index = index;
      this.builder = new V1APIGroupBuilder(this, item);
    }
    GroupsNestedImpl() {
      this.index = -1;
      this.builder = new V1APIGroupBuilder(this);
    }
    V1APIGroupBuilder builder;
    Integer index;
    public N and() {
      return (N) V1APIGroupListFluentImpl.this.setToGroups(index,builder.build());
    }
    public N endGroup() {
      return and();
    }
    
  }
  
}