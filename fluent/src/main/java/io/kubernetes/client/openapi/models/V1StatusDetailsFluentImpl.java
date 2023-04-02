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
  public class V1StatusDetailsFluentImpl<A extends V1StatusDetailsFluent<A>> extends BaseFluent<A> implements V1StatusDetailsFluent<A>{
  public V1StatusDetailsFluentImpl() {
  }
  public V1StatusDetailsFluentImpl(V1StatusDetails instance) {
    this.withCauses(instance.getCauses());

    this.withGroup(instance.getGroup());

    this.withKind(instance.getKind());

    this.withName(instance.getName());

    this.withRetryAfterSeconds(instance.getRetryAfterSeconds());

    this.withUid(instance.getUid());

  }
  private ArrayList<V1StatusCauseBuilder> causes;
  private String group;
  private String kind;
  private String name;
  private Integer retryAfterSeconds;
  private String uid;
  public A addToCauses(Integer index,V1StatusCause item) {
    if (this.causes == null) {this.causes = new ArrayList<V1StatusCauseBuilder>();}
    V1StatusCauseBuilder builder = new V1StatusCauseBuilder(item);_visitables.get("causes").add(index >= 0 ? index : _visitables.get("causes").size(), builder);this.causes.add(index >= 0 ? index : causes.size(), builder); return (A)this;
  }
  public A setToCauses(Integer index,V1StatusCause item) {
    if (this.causes == null) {this.causes = new ArrayList<V1StatusCauseBuilder>();}
    V1StatusCauseBuilder builder = new V1StatusCauseBuilder(item);
    if (index < 0 || index >= _visitables.get("causes").size()) { _visitables.get("causes").add(builder); } else { _visitables.get("causes").set(index, builder);}
    if (index < 0 || index >= causes.size()) { causes.add(builder); } else { causes.set(index, builder);}
     return (A)this;
  }
  public A addToCauses(io.kubernetes.client.openapi.models.V1StatusCause... items) {
    if (this.causes == null) {this.causes = new ArrayList<V1StatusCauseBuilder>();}
    for (V1StatusCause item : items) {V1StatusCauseBuilder builder = new V1StatusCauseBuilder(item);_visitables.get("causes").add(builder);this.causes.add(builder);} return (A)this;
  }
  public A addAllToCauses(Collection<V1StatusCause> items) {
    if (this.causes == null) {this.causes = new ArrayList<V1StatusCauseBuilder>();}
    for (V1StatusCause item : items) {V1StatusCauseBuilder builder = new V1StatusCauseBuilder(item);_visitables.get("causes").add(builder);this.causes.add(builder);} return (A)this;
  }
  public A removeFromCauses(io.kubernetes.client.openapi.models.V1StatusCause... items) {
    for (V1StatusCause item : items) {V1StatusCauseBuilder builder = new V1StatusCauseBuilder(item);_visitables.get("causes").remove(builder);if (this.causes != null) {this.causes.remove(builder);}} return (A)this;
  }
  public A removeAllFromCauses(Collection<V1StatusCause> items) {
    for (V1StatusCause item : items) {V1StatusCauseBuilder builder = new V1StatusCauseBuilder(item);_visitables.get("causes").remove(builder);if (this.causes != null) {this.causes.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromCauses(Predicate<V1StatusCauseBuilder> predicate) {
    if (causes == null) return (A) this;
    final Iterator<V1StatusCauseBuilder> each = causes.iterator();
    final List visitables = _visitables.get("causes");
    while (each.hasNext()) {
      V1StatusCauseBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildCauses instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1StatusCause> getCauses() {
    return causes != null ? build(causes) : null;
  }
  public List<V1StatusCause> buildCauses() {
    return causes != null ? build(causes) : null;
  }
  public V1StatusCause buildCause(Integer index) {
    return this.causes.get(index).build();
  }
  public V1StatusCause buildFirstCause() {
    return this.causes.get(0).build();
  }
  public V1StatusCause buildLastCause() {
    return this.causes.get(causes.size() - 1).build();
  }
  public V1StatusCause buildMatchingCause(Predicate<V1StatusCauseBuilder> predicate) {
    for (V1StatusCauseBuilder item: causes) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingCause(Predicate<V1StatusCauseBuilder> predicate) {
    for (V1StatusCauseBuilder item: causes) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withCauses(List<V1StatusCause> causes) {
    if (this.causes != null) { _visitables.get("causes").removeAll(this.causes);}
    if (causes != null) {this.causes = new ArrayList(); for (V1StatusCause item : causes){this.addToCauses(item);}} else { this.causes = null;} return (A) this;
  }
  public A withCauses(io.kubernetes.client.openapi.models.V1StatusCause... causes) {
    if (this.causes != null) {this.causes.clear();}
    if (causes != null) {for (V1StatusCause item :causes){ this.addToCauses(item);}} return (A) this;
  }
  public Boolean hasCauses() {
    return causes != null && !causes.isEmpty();
  }
  public V1StatusDetailsFluent.CausesNested<A> addNewCause() {
    return new V1StatusDetailsFluentImpl.CausesNestedImpl();
  }
  public V1StatusDetailsFluent.CausesNested<A> addNewCauseLike(V1StatusCause item) {
    return new V1StatusDetailsFluentImpl.CausesNestedImpl(-1, item);
  }
  public V1StatusDetailsFluent.CausesNested<A> setNewCauseLike(Integer index,V1StatusCause item) {
    return new V1StatusDetailsFluentImpl.CausesNestedImpl(index, item);
  }
  public V1StatusDetailsFluent.CausesNested<A> editCause(Integer index) {
    if (causes.size() <= index) throw new RuntimeException("Can't edit causes. Index exceeds size.");
    return setNewCauseLike(index, buildCause(index));
  }
  public V1StatusDetailsFluent.CausesNested<A> editFirstCause() {
    if (causes.size() == 0) throw new RuntimeException("Can't edit first causes. The list is empty.");
    return setNewCauseLike(0, buildCause(0));
  }
  public V1StatusDetailsFluent.CausesNested<A> editLastCause() {
    int index = causes.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last causes. The list is empty.");
    return setNewCauseLike(index, buildCause(index));
  }
  public V1StatusDetailsFluent.CausesNested<A> editMatchingCause(Predicate<V1StatusCauseBuilder> predicate) {
    int index = -1;
    for (int i=0;i<causes.size();i++) { 
    if (predicate.test(causes.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching causes. No match found.");
    return setNewCauseLike(index, buildCause(index));
  }
  public String getGroup() {
    return this.group;
  }
  public A withGroup(String group) {
    this.group=group; return (A) this;
  }
  public Boolean hasGroup() {
    return this.group != null;
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
  public String getName() {
    return this.name;
  }
  public A withName(String name) {
    this.name=name; return (A) this;
  }
  public Boolean hasName() {
    return this.name != null;
  }
  public Integer getRetryAfterSeconds() {
    return this.retryAfterSeconds;
  }
  public A withRetryAfterSeconds(Integer retryAfterSeconds) {
    this.retryAfterSeconds=retryAfterSeconds; return (A) this;
  }
  public Boolean hasRetryAfterSeconds() {
    return this.retryAfterSeconds != null;
  }
  public String getUid() {
    return this.uid;
  }
  public A withUid(String uid) {
    this.uid=uid; return (A) this;
  }
  public Boolean hasUid() {
    return this.uid != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1StatusDetailsFluentImpl that = (V1StatusDetailsFluentImpl) o;
    if (causes != null ? !causes.equals(that.causes) :that.causes != null) return false;
    if (group != null ? !group.equals(that.group) :that.group != null) return false;
    if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
    if (name != null ? !name.equals(that.name) :that.name != null) return false;
    if (retryAfterSeconds != null ? !retryAfterSeconds.equals(that.retryAfterSeconds) :that.retryAfterSeconds != null) return false;
    if (uid != null ? !uid.equals(that.uid) :that.uid != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(causes,  group,  kind,  name,  retryAfterSeconds,  uid,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (causes != null && !causes.isEmpty()) { sb.append("causes:"); sb.append(causes + ","); }
    if (group != null) { sb.append("group:"); sb.append(group + ","); }
    if (kind != null) { sb.append("kind:"); sb.append(kind + ","); }
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (retryAfterSeconds != null) { sb.append("retryAfterSeconds:"); sb.append(retryAfterSeconds + ","); }
    if (uid != null) { sb.append("uid:"); sb.append(uid); }
    sb.append("}");
    return sb.toString();
  }
  class CausesNestedImpl<N> extends V1StatusCauseFluentImpl<V1StatusDetailsFluent.CausesNested<N>> implements V1StatusDetailsFluent.CausesNested<N>,Nested<N>{
    CausesNestedImpl(Integer index,V1StatusCause item) {
      this.index = index;
      this.builder = new V1StatusCauseBuilder(this, item);
    }
    CausesNestedImpl() {
      this.index = -1;
      this.builder = new V1StatusCauseBuilder(this);
    }
    V1StatusCauseBuilder builder;
    Integer index;
    public N and() {
      return (N) V1StatusDetailsFluentImpl.this.setToCauses(index,builder.build());
    }
    public N endCause() {
      return and();
    }
    
  }
  
}