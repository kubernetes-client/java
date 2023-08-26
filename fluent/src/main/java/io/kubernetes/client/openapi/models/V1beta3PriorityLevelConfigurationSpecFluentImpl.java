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
  public class V1beta3PriorityLevelConfigurationSpecFluentImpl<A extends V1beta3PriorityLevelConfigurationSpecFluent<A>> extends BaseFluent<A> implements V1beta3PriorityLevelConfigurationSpecFluent<A>{
  public V1beta3PriorityLevelConfigurationSpecFluentImpl() {
  }
  public V1beta3PriorityLevelConfigurationSpecFluentImpl(V1beta3PriorityLevelConfigurationSpec instance) {
    if (instance != null) {
      this.withLimited(instance.getLimited());
      this.withType(instance.getType());
    }
  }
  private V1beta3LimitedPriorityLevelConfigurationBuilder limited;
  private String type;
  
  /**
   * This method has been deprecated, please use method buildLimited instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1beta3LimitedPriorityLevelConfiguration getLimited() {
    return this.limited!=null ?this.limited.build():null;
  }
  public V1beta3LimitedPriorityLevelConfiguration buildLimited() {
    return this.limited!=null ?this.limited.build():null;
  }
  public A withLimited(V1beta3LimitedPriorityLevelConfiguration limited) {
    _visitables.get("limited").remove(this.limited);
    if (limited!=null){ this.limited= new V1beta3LimitedPriorityLevelConfigurationBuilder(limited); _visitables.get("limited").add(this.limited);} else { this.limited = null; _visitables.get("limited").remove(this.limited); } return (A) this;
  }
  public Boolean hasLimited() {
    return this.limited != null;
  }
  public V1beta3PriorityLevelConfigurationSpecFluentImpl.LimitedNested<A> withNewLimited() {
    return new V1beta3PriorityLevelConfigurationSpecFluentImpl.LimitedNestedImpl();
  }
  public V1beta3PriorityLevelConfigurationSpecFluentImpl.LimitedNested<A> withNewLimitedLike(V1beta3LimitedPriorityLevelConfiguration item) {
    return new V1beta3PriorityLevelConfigurationSpecFluentImpl.LimitedNestedImpl(item);
  }
  public V1beta3PriorityLevelConfigurationSpecFluentImpl.LimitedNested<A> editLimited() {
    return withNewLimitedLike(getLimited());
  }
  public V1beta3PriorityLevelConfigurationSpecFluentImpl.LimitedNested<A> editOrNewLimited() {
    return withNewLimitedLike(getLimited() != null ? getLimited(): new V1beta3LimitedPriorityLevelConfigurationBuilder().build());
  }
  public V1beta3PriorityLevelConfigurationSpecFluentImpl.LimitedNested<A> editOrNewLimitedLike(V1beta3LimitedPriorityLevelConfiguration item) {
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
    if (!super.equals(o)) return false;
    V1beta3PriorityLevelConfigurationSpecFluentImpl that = (V1beta3PriorityLevelConfigurationSpecFluentImpl) o;
    if (!java.util.Objects.equals(limited, that.limited)) return false;

    if (!java.util.Objects.equals(type, that.type)) return false;

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
  class LimitedNestedImpl<N> extends V1beta3LimitedPriorityLevelConfigurationFluentImpl<V1beta3PriorityLevelConfigurationSpecFluentImpl.LimitedNested<N>> implements V1beta3PriorityLevelConfigurationSpecFluentImpl.LimitedNested<N>,Nested<N>{
    LimitedNestedImpl(V1beta3LimitedPriorityLevelConfiguration item) {
      this.builder = new V1beta3LimitedPriorityLevelConfigurationBuilder(this, item);
    }
    LimitedNestedImpl() {
      this.builder = new V1beta3LimitedPriorityLevelConfigurationBuilder(this);
    }
    V1beta3LimitedPriorityLevelConfigurationBuilder builder;
    public N and() {
      return (N) V1beta3PriorityLevelConfigurationSpecFluentImpl.this.withLimited(builder.build());
    }
    public N endLimited() {
      return and();
    }
    
  }
  
}