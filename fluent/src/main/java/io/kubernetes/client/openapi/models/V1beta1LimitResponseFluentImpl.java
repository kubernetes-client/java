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
  public class V1beta1LimitResponseFluentImpl<A extends V1beta1LimitResponseFluent<A>> extends BaseFluent<A> implements V1beta1LimitResponseFluent<A>{
  public V1beta1LimitResponseFluentImpl() {
  }
  public V1beta1LimitResponseFluentImpl(V1beta1LimitResponse instance) {
    this.withQueuing(instance.getQueuing());

    this.withType(instance.getType());

  }
  private V1beta1QueuingConfigurationBuilder queuing;
  private String type;
  
  /**
   * This method has been deprecated, please use method buildQueuing instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1beta1QueuingConfiguration getQueuing() {
    return this.queuing!=null ?this.queuing.build():null;
  }
  public V1beta1QueuingConfiguration buildQueuing() {
    return this.queuing!=null ?this.queuing.build():null;
  }
  public A withQueuing(V1beta1QueuingConfiguration queuing) {
    _visitables.get("queuing").remove(this.queuing);
    if (queuing!=null){ this.queuing= new V1beta1QueuingConfigurationBuilder(queuing); _visitables.get("queuing").add(this.queuing);} else { this.queuing = null; _visitables.get("queuing").remove(this.queuing); } return (A) this;
  }
  public Boolean hasQueuing() {
    return this.queuing != null;
  }
  public V1beta1LimitResponseFluent.QueuingNested<A> withNewQueuing() {
    return new V1beta1LimitResponseFluentImpl.QueuingNestedImpl();
  }
  public V1beta1LimitResponseFluent.QueuingNested<A> withNewQueuingLike(V1beta1QueuingConfiguration item) {
    return new V1beta1LimitResponseFluentImpl.QueuingNestedImpl(item);
  }
  public V1beta1LimitResponseFluent.QueuingNested<A> editQueuing() {
    return withNewQueuingLike(getQueuing());
  }
  public V1beta1LimitResponseFluent.QueuingNested<A> editOrNewQueuing() {
    return withNewQueuingLike(getQueuing() != null ? getQueuing(): new V1beta1QueuingConfigurationBuilder().build());
  }
  public V1beta1LimitResponseFluent.QueuingNested<A> editOrNewQueuingLike(V1beta1QueuingConfiguration item) {
    return withNewQueuingLike(getQueuing() != null ? getQueuing(): item);
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
    V1beta1LimitResponseFluentImpl that = (V1beta1LimitResponseFluentImpl) o;
    if (queuing != null ? !queuing.equals(that.queuing) :that.queuing != null) return false;
    if (type != null ? !type.equals(that.type) :that.type != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(queuing,  type,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (queuing != null) { sb.append("queuing:"); sb.append(queuing + ","); }
    if (type != null) { sb.append("type:"); sb.append(type); }
    sb.append("}");
    return sb.toString();
  }
  class QueuingNestedImpl<N> extends V1beta1QueuingConfigurationFluentImpl<V1beta1LimitResponseFluent.QueuingNested<N>> implements V1beta1LimitResponseFluent.QueuingNested<N>,Nested<N>{
    QueuingNestedImpl(V1beta1QueuingConfiguration item) {
      this.builder = new V1beta1QueuingConfigurationBuilder(this, item);
    }
    QueuingNestedImpl() {
      this.builder = new V1beta1QueuingConfigurationBuilder(this);
    }
    V1beta1QueuingConfigurationBuilder builder;
    public N and() {
      return (N) V1beta1LimitResponseFluentImpl.this.withQueuing(builder.build());
    }
    public N endQueuing() {
      return and();
    }
    
  }
  
}