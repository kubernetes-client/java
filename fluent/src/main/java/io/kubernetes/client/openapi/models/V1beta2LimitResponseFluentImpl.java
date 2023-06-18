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
  public class V1beta2LimitResponseFluentImpl<A extends V1beta2LimitResponseFluent<A>> extends BaseFluent<A> implements V1beta2LimitResponseFluent<A>{
  public V1beta2LimitResponseFluentImpl() {
  }
  public V1beta2LimitResponseFluentImpl(V1beta2LimitResponse instance) {
    if (instance != null) {
      this.withQueuing(instance.getQueuing());
      this.withType(instance.getType());
    }
  }
  private V1beta2QueuingConfigurationBuilder queuing;
  private String type;
  
  /**
   * This method has been deprecated, please use method buildQueuing instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1beta2QueuingConfiguration getQueuing() {
    return this.queuing!=null ?this.queuing.build():null;
  }
  public V1beta2QueuingConfiguration buildQueuing() {
    return this.queuing!=null ?this.queuing.build():null;
  }
  public A withQueuing(V1beta2QueuingConfiguration queuing) {
    _visitables.get("queuing").remove(this.queuing);
    if (queuing!=null){ this.queuing= new V1beta2QueuingConfigurationBuilder(queuing); _visitables.get("queuing").add(this.queuing);} else { this.queuing = null; _visitables.get("queuing").remove(this.queuing); } return (A) this;
  }
  public Boolean hasQueuing() {
    return this.queuing != null;
  }
  public V1beta2LimitResponseFluentImpl.QueuingNested<A> withNewQueuing() {
    return new V1beta2LimitResponseFluentImpl.QueuingNestedImpl();
  }
  public V1beta2LimitResponseFluentImpl.QueuingNested<A> withNewQueuingLike(V1beta2QueuingConfiguration item) {
    return new V1beta2LimitResponseFluentImpl.QueuingNestedImpl(item);
  }
  public V1beta2LimitResponseFluentImpl.QueuingNested<A> editQueuing() {
    return withNewQueuingLike(getQueuing());
  }
  public V1beta2LimitResponseFluentImpl.QueuingNested<A> editOrNewQueuing() {
    return withNewQueuingLike(getQueuing() != null ? getQueuing(): new V1beta2QueuingConfigurationBuilder().build());
  }
  public V1beta2LimitResponseFluentImpl.QueuingNested<A> editOrNewQueuingLike(V1beta2QueuingConfiguration item) {
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
    if (!super.equals(o)) return false;
    V1beta2LimitResponseFluentImpl that = (V1beta2LimitResponseFluentImpl) o;
    if (!java.util.Objects.equals(queuing, that.queuing)) return false;

    if (!java.util.Objects.equals(type, that.type)) return false;

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
  class QueuingNestedImpl<N> extends V1beta2QueuingConfigurationFluentImpl<V1beta2LimitResponseFluentImpl.QueuingNested<N>> implements V1beta2LimitResponseFluentImpl.QueuingNested<N>,Nested<N>{
    QueuingNestedImpl(V1beta2QueuingConfiguration item) {
      this.builder = new V1beta2QueuingConfigurationBuilder(this, item);
    }
    QueuingNestedImpl() {
      this.builder = new V1beta2QueuingConfigurationBuilder(this);
    }
    V1beta2QueuingConfigurationBuilder builder;
    public N and() {
      return (N) V1beta2LimitResponseFluentImpl.this.withQueuing(builder.build());
    }
    public N endQueuing() {
      return and();
    }
    
  }
  
}