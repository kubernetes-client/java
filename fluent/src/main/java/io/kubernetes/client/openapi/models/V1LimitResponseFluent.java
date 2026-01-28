package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1LimitResponseFluent<A extends io.kubernetes.client.openapi.models.V1LimitResponseFluent<A>> extends BaseFluent<A>{

  private V1QueuingConfigurationBuilder queuing;
  private String type;

  public V1LimitResponseFluent() {
  }
  
  public V1LimitResponseFluent(V1LimitResponse instance) {
    this.copyInstance(instance);
  }

  public V1QueuingConfiguration buildQueuing() {
    return this.queuing != null ? this.queuing.build() : null;
  }
  
  protected void copyInstance(V1LimitResponse instance) {
    instance = instance != null ? instance : new V1LimitResponse();
    if (instance != null) {
        this.withQueuing(instance.getQueuing());
        this.withType(instance.getType());
    }
  }
  
  public QueuingNested<A> editOrNewQueuing() {
    return this.withNewQueuingLike(Optional.ofNullable(this.buildQueuing()).orElse(new V1QueuingConfigurationBuilder().build()));
  }
  
  public QueuingNested<A> editOrNewQueuingLike(V1QueuingConfiguration item) {
    return this.withNewQueuingLike(Optional.ofNullable(this.buildQueuing()).orElse(item));
  }
  
  public QueuingNested<A> editQueuing() {
    return this.withNewQueuingLike(Optional.ofNullable(this.buildQueuing()).orElse(null));
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
    V1LimitResponseFluent that = (V1LimitResponseFluent) o;
    if (!(Objects.equals(queuing, that.queuing))) {
      return false;
    }
    if (!(Objects.equals(type, that.type))) {
      return false;
    }
    return true;
  }
  
  public String getType() {
    return this.type;
  }
  
  public boolean hasQueuing() {
    return this.queuing != null;
  }
  
  public boolean hasType() {
    return this.type != null;
  }
  
  public int hashCode() {
    return Objects.hash(queuing, type);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(queuing == null)) {
        sb.append("queuing:");
        sb.append(queuing);
        sb.append(",");
    }
    if (!(type == null)) {
        sb.append("type:");
        sb.append(type);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public QueuingNested<A> withNewQueuing() {
    return new QueuingNested(null);
  }
  
  public QueuingNested<A> withNewQueuingLike(V1QueuingConfiguration item) {
    return new QueuingNested(item);
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
  
  public A withType(String type) {
    this.type = type;
    return (A) this;
  }
  public class QueuingNested<N> extends V1QueuingConfigurationFluent<QueuingNested<N>> implements Nested<N>{
  
    V1QueuingConfigurationBuilder builder;
  
    QueuingNested(V1QueuingConfiguration item) {
      this.builder = new V1QueuingConfigurationBuilder(this, item);
    }
  
    public N and() {
      return (N) V1LimitResponseFluent.this.withQueuing(builder.build());
    }
    
    public N endQueuing() {
      return and();
    }
    
  }
}