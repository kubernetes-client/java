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
public class V1APIGroupListFluent<A extends io.kubernetes.client.openapi.models.V1APIGroupListFluent<A>> extends BaseFluent<A>{
  public V1APIGroupListFluent() {
  }
  
  public V1APIGroupListFluent(V1APIGroupList instance) {
    this.copyInstance(instance);
  }
  private String apiVersion;
  private ArrayList<V1APIGroupBuilder> groups;
  private String kind;
  
  protected void copyInstance(V1APIGroupList instance) {
    instance = instance != null ? instance : new V1APIGroupList();
    if (instance != null) {
        this.withApiVersion(instance.getApiVersion());
        this.withGroups(instance.getGroups());
        this.withKind(instance.getKind());
    }
  }
  
  public String getApiVersion() {
    return this.apiVersion;
  }
  
  public A withApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return (A) this;
  }
  
  public boolean hasApiVersion() {
    return this.apiVersion != null;
  }
  
  public A addToGroups(int index,V1APIGroup item) {
    if (this.groups == null) {
      this.groups = new ArrayList();
    }
    V1APIGroupBuilder builder = new V1APIGroupBuilder(item);
    if (index < 0 || index >= groups.size()) {
        _visitables.get("groups").add(builder);
        groups.add(builder);
    } else {
        _visitables.get("groups").add(builder);
        groups.add(index, builder);
    }
    return (A) this;
  }
  
  public A setToGroups(int index,V1APIGroup item) {
    if (this.groups == null) {
      this.groups = new ArrayList();
    }
    V1APIGroupBuilder builder = new V1APIGroupBuilder(item);
    if (index < 0 || index >= groups.size()) {
        _visitables.get("groups").add(builder);
        groups.add(builder);
    } else {
        _visitables.get("groups").add(builder);
        groups.set(index, builder);
    }
    return (A) this;
  }
  
  public A addToGroups(V1APIGroup... items) {
    if (this.groups == null) {
      this.groups = new ArrayList();
    }
    for (V1APIGroup item : items) {
        V1APIGroupBuilder builder = new V1APIGroupBuilder(item);
        _visitables.get("groups").add(builder);
        this.groups.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToGroups(Collection<V1APIGroup> items) {
    if (this.groups == null) {
      this.groups = new ArrayList();
    }
    for (V1APIGroup item : items) {
        V1APIGroupBuilder builder = new V1APIGroupBuilder(item);
        _visitables.get("groups").add(builder);
        this.groups.add(builder);
    }
    return (A) this;
  }
  
  public A removeFromGroups(V1APIGroup... items) {
    if (this.groups == null) {
      return (A) this;
    }
    for (V1APIGroup item : items) {
        V1APIGroupBuilder builder = new V1APIGroupBuilder(item);
        _visitables.get("groups").remove(builder);
        this.groups.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromGroups(Collection<V1APIGroup> items) {
    if (this.groups == null) {
      return (A) this;
    }
    for (V1APIGroup item : items) {
        V1APIGroupBuilder builder = new V1APIGroupBuilder(item);
        _visitables.get("groups").remove(builder);
        this.groups.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromGroups(Predicate<V1APIGroupBuilder> predicate) {
    if (groups == null) {
      return (A) this;
    }
    Iterator<V1APIGroupBuilder> each = groups.iterator();
    List visitables = _visitables.get("groups");
    while (each.hasNext()) {
        V1APIGroupBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public List<V1APIGroup> buildGroups() {
    return this.groups != null ? build(groups) : null;
  }
  
  public V1APIGroup buildGroup(int index) {
    return this.groups.get(index).build();
  }
  
  public V1APIGroup buildFirstGroup() {
    return this.groups.get(0).build();
  }
  
  public V1APIGroup buildLastGroup() {
    return this.groups.get(groups.size() - 1).build();
  }
  
  public V1APIGroup buildMatchingGroup(Predicate<V1APIGroupBuilder> predicate) {
      for (V1APIGroupBuilder item : groups) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingGroup(Predicate<V1APIGroupBuilder> predicate) {
      for (V1APIGroupBuilder item : groups) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withGroups(List<V1APIGroup> groups) {
    if (this.groups != null) {
      this._visitables.get("groups").clear();
    }
    if (groups != null) {
        this.groups = new ArrayList();
        for (V1APIGroup item : groups) {
          this.addToGroups(item);
        }
    } else {
      this.groups = null;
    }
    return (A) this;
  }
  
  public A withGroups(V1APIGroup... groups) {
    if (this.groups != null) {
        this.groups.clear();
        _visitables.remove("groups");
    }
    if (groups != null) {
      for (V1APIGroup item : groups) {
        this.addToGroups(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasGroups() {
    return this.groups != null && !(this.groups.isEmpty());
  }
  
  public GroupsNested<A> addNewGroup() {
    return new GroupsNested(-1, null);
  }
  
  public GroupsNested<A> addNewGroupLike(V1APIGroup item) {
    return new GroupsNested(-1, item);
  }
  
  public GroupsNested<A> setNewGroupLike(int index,V1APIGroup item) {
    return new GroupsNested(index, item);
  }
  
  public GroupsNested<A> editGroup(int index) {
    if (index <= groups.size()) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "groups"));
    }
    return this.setNewGroupLike(index, this.buildGroup(index));
  }
  
  public GroupsNested<A> editFirstGroup() {
    if (groups.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "groups"));
    }
    return this.setNewGroupLike(0, this.buildGroup(0));
  }
  
  public GroupsNested<A> editLastGroup() {
    int index = groups.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "groups"));
    }
    return this.setNewGroupLike(index, this.buildGroup(index));
  }
  
  public GroupsNested<A> editMatchingGroup(Predicate<V1APIGroupBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < groups.size();i++) {
      if (predicate.test(groups.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "groups"));
    }
    return this.setNewGroupLike(index, this.buildGroup(index));
  }
  
  public String getKind() {
    return this.kind;
  }
  
  public A withKind(String kind) {
    this.kind = kind;
    return (A) this;
  }
  
  public boolean hasKind() {
    return this.kind != null;
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
    V1APIGroupListFluent that = (V1APIGroupListFluent) o;
    if (!(Objects.equals(apiVersion, that.apiVersion))) {
      return false;
    }
    if (!(Objects.equals(groups, that.groups))) {
      return false;
    }
    if (!(Objects.equals(kind, that.kind))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(apiVersion, groups, kind);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(apiVersion == null)) {
        sb.append("apiVersion:");
        sb.append(apiVersion);
        sb.append(",");
    }
    if (!(groups == null) && !(groups.isEmpty())) {
        sb.append("groups:");
        sb.append(groups);
        sb.append(",");
    }
    if (!(kind == null)) {
        sb.append("kind:");
        sb.append(kind);
    }
    sb.append("}");
    return sb.toString();
  }
  public class GroupsNested<N> extends V1APIGroupFluent<GroupsNested<N>> implements Nested<N>{
    GroupsNested(int index,V1APIGroup item) {
      this.index = index;
      this.builder = new V1APIGroupBuilder(this, item);
    }
    V1APIGroupBuilder builder;
    int index;
    
    public N and() {
      return (N) V1APIGroupListFluent.this.setToGroups(index, builder.build());
    }
    
    public N endGroup() {
      return and();
    }
    
  
  }

}