package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1NodeConfigStatusFluentImpl<A extends V1NodeConfigStatusFluent<A>> extends BaseFluent<A> implements V1NodeConfigStatusFluent<A>{
  public V1NodeConfigStatusFluentImpl() {
  }
  public V1NodeConfigStatusFluentImpl(V1NodeConfigStatus instance) {
    this.withActive(instance.getActive());

    this.withAssigned(instance.getAssigned());

    this.withError(instance.getError());

    this.withLastKnownGood(instance.getLastKnownGood());

  }
  private V1NodeConfigSourceBuilder active;
  private V1NodeConfigSourceBuilder assigned;
  private String error;
  private V1NodeConfigSourceBuilder lastKnownGood;
  
  /**
   * This method has been deprecated, please use method buildActive instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1NodeConfigSource getActive() {
    return this.active!=null ?this.active.build():null;
  }
  public V1NodeConfigSource buildActive() {
    return this.active!=null ?this.active.build():null;
  }
  public A withActive(V1NodeConfigSource active) {
    _visitables.get("active").remove(this.active);
    if (active!=null){ this.active= new V1NodeConfigSourceBuilder(active); _visitables.get("active").add(this.active);} else { this.active = null; _visitables.get("active").remove(this.active); } return (A) this;
  }
  public Boolean hasActive() {
    return this.active != null;
  }
  public V1NodeConfigStatusFluent.ActiveNested<A> withNewActive() {
    return new V1NodeConfigStatusFluentImpl.ActiveNestedImpl();
  }
  public V1NodeConfigStatusFluent.ActiveNested<A> withNewActiveLike(V1NodeConfigSource item) {
    return new V1NodeConfigStatusFluentImpl.ActiveNestedImpl(item);
  }
  public V1NodeConfigStatusFluent.ActiveNested<A> editActive() {
    return withNewActiveLike(getActive());
  }
  public V1NodeConfigStatusFluent.ActiveNested<A> editOrNewActive() {
    return withNewActiveLike(getActive() != null ? getActive(): new V1NodeConfigSourceBuilder().build());
  }
  public V1NodeConfigStatusFluent.ActiveNested<A> editOrNewActiveLike(V1NodeConfigSource item) {
    return withNewActiveLike(getActive() != null ? getActive(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildAssigned instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1NodeConfigSource getAssigned() {
    return this.assigned!=null ?this.assigned.build():null;
  }
  public V1NodeConfigSource buildAssigned() {
    return this.assigned!=null ?this.assigned.build():null;
  }
  public A withAssigned(V1NodeConfigSource assigned) {
    _visitables.get("assigned").remove(this.assigned);
    if (assigned!=null){ this.assigned= new V1NodeConfigSourceBuilder(assigned); _visitables.get("assigned").add(this.assigned);} else { this.assigned = null; _visitables.get("assigned").remove(this.assigned); } return (A) this;
  }
  public Boolean hasAssigned() {
    return this.assigned != null;
  }
  public V1NodeConfigStatusFluent.AssignedNested<A> withNewAssigned() {
    return new V1NodeConfigStatusFluentImpl.AssignedNestedImpl();
  }
  public V1NodeConfigStatusFluent.AssignedNested<A> withNewAssignedLike(V1NodeConfigSource item) {
    return new V1NodeConfigStatusFluentImpl.AssignedNestedImpl(item);
  }
  public V1NodeConfigStatusFluent.AssignedNested<A> editAssigned() {
    return withNewAssignedLike(getAssigned());
  }
  public V1NodeConfigStatusFluent.AssignedNested<A> editOrNewAssigned() {
    return withNewAssignedLike(getAssigned() != null ? getAssigned(): new V1NodeConfigSourceBuilder().build());
  }
  public V1NodeConfigStatusFluent.AssignedNested<A> editOrNewAssignedLike(V1NodeConfigSource item) {
    return withNewAssignedLike(getAssigned() != null ? getAssigned(): item);
  }
  public String getError() {
    return this.error;
  }
  public A withError(String error) {
    this.error=error; return (A) this;
  }
  public Boolean hasError() {
    return this.error != null;
  }
  
  /**
   * This method has been deprecated, please use method buildLastKnownGood instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1NodeConfigSource getLastKnownGood() {
    return this.lastKnownGood!=null ?this.lastKnownGood.build():null;
  }
  public V1NodeConfigSource buildLastKnownGood() {
    return this.lastKnownGood!=null ?this.lastKnownGood.build():null;
  }
  public A withLastKnownGood(V1NodeConfigSource lastKnownGood) {
    _visitables.get("lastKnownGood").remove(this.lastKnownGood);
    if (lastKnownGood!=null){ this.lastKnownGood= new V1NodeConfigSourceBuilder(lastKnownGood); _visitables.get("lastKnownGood").add(this.lastKnownGood);} else { this.lastKnownGood = null; _visitables.get("lastKnownGood").remove(this.lastKnownGood); } return (A) this;
  }
  public Boolean hasLastKnownGood() {
    return this.lastKnownGood != null;
  }
  public V1NodeConfigStatusFluent.LastKnownGoodNested<A> withNewLastKnownGood() {
    return new V1NodeConfigStatusFluentImpl.LastKnownGoodNestedImpl();
  }
  public V1NodeConfigStatusFluent.LastKnownGoodNested<A> withNewLastKnownGoodLike(V1NodeConfigSource item) {
    return new V1NodeConfigStatusFluentImpl.LastKnownGoodNestedImpl(item);
  }
  public V1NodeConfigStatusFluent.LastKnownGoodNested<A> editLastKnownGood() {
    return withNewLastKnownGoodLike(getLastKnownGood());
  }
  public V1NodeConfigStatusFluent.LastKnownGoodNested<A> editOrNewLastKnownGood() {
    return withNewLastKnownGoodLike(getLastKnownGood() != null ? getLastKnownGood(): new V1NodeConfigSourceBuilder().build());
  }
  public V1NodeConfigStatusFluent.LastKnownGoodNested<A> editOrNewLastKnownGoodLike(V1NodeConfigSource item) {
    return withNewLastKnownGoodLike(getLastKnownGood() != null ? getLastKnownGood(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1NodeConfigStatusFluentImpl that = (V1NodeConfigStatusFluentImpl) o;
    if (active != null ? !active.equals(that.active) :that.active != null) return false;
    if (assigned != null ? !assigned.equals(that.assigned) :that.assigned != null) return false;
    if (error != null ? !error.equals(that.error) :that.error != null) return false;
    if (lastKnownGood != null ? !lastKnownGood.equals(that.lastKnownGood) :that.lastKnownGood != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(active,  assigned,  error,  lastKnownGood,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (active != null) { sb.append("active:"); sb.append(active + ","); }
    if (assigned != null) { sb.append("assigned:"); sb.append(assigned + ","); }
    if (error != null) { sb.append("error:"); sb.append(error + ","); }
    if (lastKnownGood != null) { sb.append("lastKnownGood:"); sb.append(lastKnownGood); }
    sb.append("}");
    return sb.toString();
  }
  class ActiveNestedImpl<N> extends V1NodeConfigSourceFluentImpl<V1NodeConfigStatusFluent.ActiveNested<N>> implements V1NodeConfigStatusFluent.ActiveNested<N>,Nested<N>{
    ActiveNestedImpl(V1NodeConfigSource item) {
      this.builder = new V1NodeConfigSourceBuilder(this, item);
    }
    ActiveNestedImpl() {
      this.builder = new V1NodeConfigSourceBuilder(this);
    }
    V1NodeConfigSourceBuilder builder;
    public N and() {
      return (N) V1NodeConfigStatusFluentImpl.this.withActive(builder.build());
    }
    public N endActive() {
      return and();
    }
    
  }
  class AssignedNestedImpl<N> extends V1NodeConfigSourceFluentImpl<V1NodeConfigStatusFluent.AssignedNested<N>> implements V1NodeConfigStatusFluent.AssignedNested<N>,Nested<N>{
    AssignedNestedImpl(V1NodeConfigSource item) {
      this.builder = new V1NodeConfigSourceBuilder(this, item);
    }
    AssignedNestedImpl() {
      this.builder = new V1NodeConfigSourceBuilder(this);
    }
    V1NodeConfigSourceBuilder builder;
    public N and() {
      return (N) V1NodeConfigStatusFluentImpl.this.withAssigned(builder.build());
    }
    public N endAssigned() {
      return and();
    }
    
  }
  class LastKnownGoodNestedImpl<N> extends V1NodeConfigSourceFluentImpl<V1NodeConfigStatusFluent.LastKnownGoodNested<N>> implements V1NodeConfigStatusFluent.LastKnownGoodNested<N>,Nested<N>{
    LastKnownGoodNestedImpl(V1NodeConfigSource item) {
      this.builder = new V1NodeConfigSourceBuilder(this, item);
    }
    LastKnownGoodNestedImpl() {
      this.builder = new V1NodeConfigSourceBuilder(this);
    }
    V1NodeConfigSourceBuilder builder;
    public N and() {
      return (N) V1NodeConfigStatusFluentImpl.this.withLastKnownGood(builder.build());
    }
    public N endLastKnownGood() {
      return and();
    }
    
  }
  
}