package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Integer;
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
public class V1StatusDetailsFluent<A extends io.kubernetes.client.openapi.models.V1StatusDetailsFluent<A>> extends BaseFluent<A>{

  private ArrayList<V1StatusCauseBuilder> causes;
  private String group;
  private String kind;
  private String name;
  private Integer retryAfterSeconds;
  private String uid;

  public V1StatusDetailsFluent() {
  }
  
  public V1StatusDetailsFluent(V1StatusDetails instance) {
    this.copyInstance(instance);
  }

  public A addAllToCauses(Collection<V1StatusCause> items) {
    if (this.causes == null) {
      this.causes = new ArrayList();
    }
    for (V1StatusCause item : items) {
        V1StatusCauseBuilder builder = new V1StatusCauseBuilder(item);
        _visitables.get("causes").add(builder);
        this.causes.add(builder);
    }
    return (A) this;
  }
  
  public CausesNested<A> addNewCause() {
    return new CausesNested(-1, null);
  }
  
  public CausesNested<A> addNewCauseLike(V1StatusCause item) {
    return new CausesNested(-1, item);
  }
  
  public A addToCauses(V1StatusCause... items) {
    if (this.causes == null) {
      this.causes = new ArrayList();
    }
    for (V1StatusCause item : items) {
        V1StatusCauseBuilder builder = new V1StatusCauseBuilder(item);
        _visitables.get("causes").add(builder);
        this.causes.add(builder);
    }
    return (A) this;
  }
  
  public A addToCauses(int index,V1StatusCause item) {
    if (this.causes == null) {
      this.causes = new ArrayList();
    }
    V1StatusCauseBuilder builder = new V1StatusCauseBuilder(item);
    if (index < 0 || index >= causes.size()) {
        _visitables.get("causes").add(builder);
        causes.add(builder);
    } else {
        _visitables.get("causes").add(builder);
        causes.add(index, builder);
    }
    return (A) this;
  }
  
  public V1StatusCause buildCause(int index) {
    return this.causes.get(index).build();
  }
  
  public List<V1StatusCause> buildCauses() {
    return this.causes != null ? build(causes) : null;
  }
  
  public V1StatusCause buildFirstCause() {
    return this.causes.get(0).build();
  }
  
  public V1StatusCause buildLastCause() {
    return this.causes.get(causes.size() - 1).build();
  }
  
  public V1StatusCause buildMatchingCause(Predicate<V1StatusCauseBuilder> predicate) {
      for (V1StatusCauseBuilder item : causes) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  protected void copyInstance(V1StatusDetails instance) {
    instance = instance != null ? instance : new V1StatusDetails();
    if (instance != null) {
        this.withCauses(instance.getCauses());
        this.withGroup(instance.getGroup());
        this.withKind(instance.getKind());
        this.withName(instance.getName());
        this.withRetryAfterSeconds(instance.getRetryAfterSeconds());
        this.withUid(instance.getUid());
    }
  }
  
  public CausesNested<A> editCause(int index) {
    if (causes.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "causes"));
    }
    return this.setNewCauseLike(index, this.buildCause(index));
  }
  
  public CausesNested<A> editFirstCause() {
    if (causes.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "causes"));
    }
    return this.setNewCauseLike(0, this.buildCause(0));
  }
  
  public CausesNested<A> editLastCause() {
    int index = causes.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "causes"));
    }
    return this.setNewCauseLike(index, this.buildCause(index));
  }
  
  public CausesNested<A> editMatchingCause(Predicate<V1StatusCauseBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < causes.size();i++) {
      if (predicate.test(causes.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "causes"));
    }
    return this.setNewCauseLike(index, this.buildCause(index));
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
    V1StatusDetailsFluent that = (V1StatusDetailsFluent) o;
    if (!(Objects.equals(causes, that.causes))) {
      return false;
    }
    if (!(Objects.equals(group, that.group))) {
      return false;
    }
    if (!(Objects.equals(kind, that.kind))) {
      return false;
    }
    if (!(Objects.equals(name, that.name))) {
      return false;
    }
    if (!(Objects.equals(retryAfterSeconds, that.retryAfterSeconds))) {
      return false;
    }
    if (!(Objects.equals(uid, that.uid))) {
      return false;
    }
    return true;
  }
  
  public String getGroup() {
    return this.group;
  }
  
  public String getKind() {
    return this.kind;
  }
  
  public String getName() {
    return this.name;
  }
  
  public Integer getRetryAfterSeconds() {
    return this.retryAfterSeconds;
  }
  
  public String getUid() {
    return this.uid;
  }
  
  public boolean hasCauses() {
    return this.causes != null && !(this.causes.isEmpty());
  }
  
  public boolean hasGroup() {
    return this.group != null;
  }
  
  public boolean hasKind() {
    return this.kind != null;
  }
  
  public boolean hasMatchingCause(Predicate<V1StatusCauseBuilder> predicate) {
      for (V1StatusCauseBuilder item : causes) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public boolean hasRetryAfterSeconds() {
    return this.retryAfterSeconds != null;
  }
  
  public boolean hasUid() {
    return this.uid != null;
  }
  
  public int hashCode() {
    return Objects.hash(causes, group, kind, name, retryAfterSeconds, uid);
  }
  
  public A removeAllFromCauses(Collection<V1StatusCause> items) {
    if (this.causes == null) {
      return (A) this;
    }
    for (V1StatusCause item : items) {
        V1StatusCauseBuilder builder = new V1StatusCauseBuilder(item);
        _visitables.get("causes").remove(builder);
        this.causes.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromCauses(V1StatusCause... items) {
    if (this.causes == null) {
      return (A) this;
    }
    for (V1StatusCause item : items) {
        V1StatusCauseBuilder builder = new V1StatusCauseBuilder(item);
        _visitables.get("causes").remove(builder);
        this.causes.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromCauses(Predicate<V1StatusCauseBuilder> predicate) {
    if (causes == null) {
      return (A) this;
    }
    Iterator<V1StatusCauseBuilder> each = causes.iterator();
    List visitables = _visitables.get("causes");
    while (each.hasNext()) {
        V1StatusCauseBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public CausesNested<A> setNewCauseLike(int index,V1StatusCause item) {
    return new CausesNested(index, item);
  }
  
  public A setToCauses(int index,V1StatusCause item) {
    if (this.causes == null) {
      this.causes = new ArrayList();
    }
    V1StatusCauseBuilder builder = new V1StatusCauseBuilder(item);
    if (index < 0 || index >= causes.size()) {
        _visitables.get("causes").add(builder);
        causes.add(builder);
    } else {
        _visitables.get("causes").add(builder);
        causes.set(index, builder);
    }
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(causes == null) && !(causes.isEmpty())) {
        sb.append("causes:");
        sb.append(causes);
        sb.append(",");
    }
    if (!(group == null)) {
        sb.append("group:");
        sb.append(group);
        sb.append(",");
    }
    if (!(kind == null)) {
        sb.append("kind:");
        sb.append(kind);
        sb.append(",");
    }
    if (!(name == null)) {
        sb.append("name:");
        sb.append(name);
        sb.append(",");
    }
    if (!(retryAfterSeconds == null)) {
        sb.append("retryAfterSeconds:");
        sb.append(retryAfterSeconds);
        sb.append(",");
    }
    if (!(uid == null)) {
        sb.append("uid:");
        sb.append(uid);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withCauses(List<V1StatusCause> causes) {
    if (this.causes != null) {
      this._visitables.get("causes").clear();
    }
    if (causes != null) {
        this.causes = new ArrayList();
        for (V1StatusCause item : causes) {
          this.addToCauses(item);
        }
    } else {
      this.causes = null;
    }
    return (A) this;
  }
  
  public A withCauses(V1StatusCause... causes) {
    if (this.causes != null) {
        this.causes.clear();
        _visitables.remove("causes");
    }
    if (causes != null) {
      for (V1StatusCause item : causes) {
        this.addToCauses(item);
      }
    }
    return (A) this;
  }
  
  public A withGroup(String group) {
    this.group = group;
    return (A) this;
  }
  
  public A withKind(String kind) {
    this.kind = kind;
    return (A) this;
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public A withRetryAfterSeconds(Integer retryAfterSeconds) {
    this.retryAfterSeconds = retryAfterSeconds;
    return (A) this;
  }
  
  public A withUid(String uid) {
    this.uid = uid;
    return (A) this;
  }
  public class CausesNested<N> extends V1StatusCauseFluent<CausesNested<N>> implements Nested<N>{
  
    V1StatusCauseBuilder builder;
    int index;
  
    CausesNested(int index,V1StatusCause item) {
      this.index = index;
      this.builder = new V1StatusCauseBuilder(this, item);
    }
  
    public N and() {
      return (N) V1StatusDetailsFluent.this.setToCauses(index, builder.build());
    }
    
    public N endCause() {
      return and();
    }
    
  }
}