package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1LimitResponseFluent<A extends V1LimitResponseFluent<A>> extends BaseFluent<A>{
  public V1LimitResponseFluent() {
  }
  
  public V1LimitResponseFluent(V1LimitResponse instance) {
    this.copyInstance(instance);
  }
  private V1QueuingConfigurationBuilder queuing;
  private String type;
  
  protected void copyInstance(V1LimitResponse instance) {
    instance = (instance != null ? instance : new V1LimitResponse());
    if (instance != null) {
          this.withQueuing(instance.getQueuing());
          this.withType(instance.getType());
        }
  }
  
  public V1QueuingConfiguration buildQueuing() {
    return this.queuing != null ? this.queuing.build() : null;
  }
  
  public A withQueuing(V1QueuingConfiguration queuing) {
    this._visitables.remove("queuing");
    if (queuing != null) {
        this.queuing = new V1QueuingConfigurationBuilder(queuing);
        this._visitables.get("queuing").add(this.queuing);
    } else {
        this.queuing = null;
        this._visitables.get("queuing").remove(this.queuing);
    }
    return (A) this;
  }
  
  public boolean hasQueuing() {
    return this.queuing != null;
  }
  
  public QueuingNested<A> withNewQueuing() {
    return new QueuingNested(null);
  }
  
  public QueuingNested<A> withNewQueuingLike(V1QueuingConfiguration item) {
    return new QueuingNested(item);
  }
  
  public QueuingNested<A> editQueuing() {
    return withNewQueuingLike(java.util.Optional.ofNullable(buildQueuing()).orElse(null));
  }
  
  public QueuingNested<A> editOrNewQueuing() {
    return withNewQueuingLike(java.util.Optional.ofNullable(buildQueuing()).orElse(new V1QueuingConfigurationBuilder().build()));
  }
  
  public QueuingNested<A> editOrNewQueuingLike(V1QueuingConfiguration item) {
    return withNewQueuingLike(java.util.Optional.ofNullable(buildQueuing()).orElse(item));
  }
  
  public String getType() {
    return this.type;
  }
  
  public A withType(String type) {
    this.type = type;
    return (A) this;
  }
  
  public boolean hasType() {
    return this.type != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1LimitResponseFluent that = (V1LimitResponseFluent) o;
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
  public class QueuingNested<N> extends V1QueuingConfigurationFluent<QueuingNested<N>> implements Nested<N>{
    QueuingNested(V1QueuingConfiguration item) {
      this.builder = new V1QueuingConfigurationBuilder(this, item);
    }
    V1QueuingConfigurationBuilder builder;
    
    public N and() {
      return (N) V1LimitResponseFluent.this.withQueuing(builder.build());
    }
    
    public N endQueuing() {
      return and();
    }
    
  
  }

}