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
  public class V1beta1PriorityLevelConfigurationSpecFluentImpl<A extends V1beta1PriorityLevelConfigurationSpecFluent<A>> extends BaseFluent<A> implements V1beta1PriorityLevelConfigurationSpecFluent<A>{
  public V1beta1PriorityLevelConfigurationSpecFluentImpl() {
  }
  public V1beta1PriorityLevelConfigurationSpecFluentImpl(V1beta1PriorityLevelConfigurationSpec instance) {
    this.withLimited(instance.getLimited());

    this.withType(instance.getType());

  }
  private V1beta1LimitedPriorityLevelConfigurationBuilder limited;
  private String type;
  
  /**
   * This method has been deprecated, please use method buildLimited instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1beta1LimitedPriorityLevelConfiguration getLimited() {
    return this.limited!=null ?this.limited.build():null;
  }
  public V1beta1LimitedPriorityLevelConfiguration buildLimited() {
    return this.limited!=null ?this.limited.build():null;
  }
  public A withLimited(V1beta1LimitedPriorityLevelConfiguration limited) {
    _visitables.get("limited").remove(this.limited);
    if (limited!=null){ this.limited= new V1beta1LimitedPriorityLevelConfigurationBuilder(limited); _visitables.get("limited").add(this.limited);} else { this.limited = null; _visitables.get("limited").remove(this.limited); } return (A) this;
  }
  public Boolean hasLimited() {
    return this.limited != null;
  }
  public V1beta1PriorityLevelConfigurationSpecFluent.LimitedNested<A> withNewLimited() {
    return new V1beta1PriorityLevelConfigurationSpecFluentImpl.LimitedNestedImpl();
  }
  public V1beta1PriorityLevelConfigurationSpecFluent.LimitedNested<A> withNewLimitedLike(V1beta1LimitedPriorityLevelConfiguration item) {
    return new V1beta1PriorityLevelConfigurationSpecFluentImpl.LimitedNestedImpl(item);
  }
  public V1beta1PriorityLevelConfigurationSpecFluent.LimitedNested<A> editLimited() {
    return withNewLimitedLike(getLimited());
  }
  public V1beta1PriorityLevelConfigurationSpecFluent.LimitedNested<A> editOrNewLimited() {
    return withNewLimitedLike(getLimited() != null ? getLimited(): new V1beta1LimitedPriorityLevelConfigurationBuilder().build());
  }
  public V1beta1PriorityLevelConfigurationSpecFluent.LimitedNested<A> editOrNewLimitedLike(V1beta1LimitedPriorityLevelConfiguration item) {
    return withNewLimitedLike(getLimited() != null ? getLimited(): item);
  }
  public String getType() {
    return this.type;
  }
  public A withType(String type) {
    this.type=type; return (A) this;
  }
  public Boolean hasType() {
    return this.type != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1beta1PriorityLevelConfigurationSpecFluentImpl that = (V1beta1PriorityLevelConfigurationSpecFluentImpl) o;
    if (limited != null ? !limited.equals(that.limited) :that.limited != null) return false;
    if (type != null ? !type.equals(that.type) :that.type != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(limited,  type,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (limited != null) { sb.append("limited:"); sb.append(limited + ","); }
    if (type != null) { sb.append("type:"); sb.append(type); }
    sb.append("}");
    return sb.toString();
  }
  class LimitedNestedImpl<N> extends V1beta1LimitedPriorityLevelConfigurationFluentImpl<V1beta1PriorityLevelConfigurationSpecFluent.LimitedNested<N>> implements V1beta1PriorityLevelConfigurationSpecFluent.LimitedNested<N>,Nested<N>{
    LimitedNestedImpl(V1beta1LimitedPriorityLevelConfiguration item) {
      this.builder = new V1beta1LimitedPriorityLevelConfigurationBuilder(this, item);
    }
    LimitedNestedImpl() {
      this.builder = new V1beta1LimitedPriorityLevelConfigurationBuilder(this);
    }
    V1beta1LimitedPriorityLevelConfigurationBuilder builder;
    public N and() {
      return (N) V1beta1PriorityLevelConfigurationSpecFluentImpl.this.withLimited(builder.build());
    }
    public N endLimited() {
      return and();
    }
    
  }
  
}