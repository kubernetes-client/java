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
public class V1PriorityLevelConfigurationSpecFluent<A extends io.kubernetes.client.openapi.models.V1PriorityLevelConfigurationSpecFluent<A>> extends BaseFluent<A>{

  private V1ExemptPriorityLevelConfigurationBuilder exempt;
  private V1LimitedPriorityLevelConfigurationBuilder limited;
  private String type;

  public V1PriorityLevelConfigurationSpecFluent() {
  }
  
  public V1PriorityLevelConfigurationSpecFluent(V1PriorityLevelConfigurationSpec instance) {
    this.copyInstance(instance);
  }

  public V1ExemptPriorityLevelConfiguration buildExempt() {
    return this.exempt != null ? this.exempt.build() : null;
  }
  
  public V1LimitedPriorityLevelConfiguration buildLimited() {
    return this.limited != null ? this.limited.build() : null;
  }
  
  protected void copyInstance(V1PriorityLevelConfigurationSpec instance) {
    instance = instance != null ? instance : new V1PriorityLevelConfigurationSpec();
    if (instance != null) {
        this.withExempt(instance.getExempt());
        this.withLimited(instance.getLimited());
        this.withType(instance.getType());
    }
  }
  
  public ExemptNested<A> editExempt() {
    return this.withNewExemptLike(Optional.ofNullable(this.buildExempt()).orElse(null));
  }
  
  public LimitedNested<A> editLimited() {
    return this.withNewLimitedLike(Optional.ofNullable(this.buildLimited()).orElse(null));
  }
  
  public ExemptNested<A> editOrNewExempt() {
    return this.withNewExemptLike(Optional.ofNullable(this.buildExempt()).orElse(new V1ExemptPriorityLevelConfigurationBuilder().build()));
  }
  
  public ExemptNested<A> editOrNewExemptLike(V1ExemptPriorityLevelConfiguration item) {
    return this.withNewExemptLike(Optional.ofNullable(this.buildExempt()).orElse(item));
  }
  
  public LimitedNested<A> editOrNewLimited() {
    return this.withNewLimitedLike(Optional.ofNullable(this.buildLimited()).orElse(new V1LimitedPriorityLevelConfigurationBuilder().build()));
  }
  
  public LimitedNested<A> editOrNewLimitedLike(V1LimitedPriorityLevelConfiguration item) {
    return this.withNewLimitedLike(Optional.ofNullable(this.buildLimited()).orElse(item));
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
    V1PriorityLevelConfigurationSpecFluent that = (V1PriorityLevelConfigurationSpecFluent) o;
    if (!(Objects.equals(exempt, that.exempt))) {
      return false;
    }
    if (!(Objects.equals(limited, that.limited))) {
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
  
  public boolean hasExempt() {
    return this.exempt != null;
  }
  
  public boolean hasLimited() {
    return this.limited != null;
  }
  
  public boolean hasType() {
    return this.type != null;
  }
  
  public int hashCode() {
    return Objects.hash(exempt, limited, type);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(exempt == null)) {
        sb.append("exempt:");
        sb.append(exempt);
        sb.append(",");
    }
    if (!(limited == null)) {
        sb.append("limited:");
        sb.append(limited);
        sb.append(",");
    }
    if (!(type == null)) {
        sb.append("type:");
        sb.append(type);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withExempt(V1ExemptPriorityLevelConfiguration exempt) {
    this._visitables.remove("exempt");
    if (exempt != null) {
        this.exempt = new V1ExemptPriorityLevelConfigurationBuilder(exempt);
        this._visitables.get("exempt").add(this.exempt);
    } else {
        this.exempt = null;
        this._visitables.get("exempt").remove(this.exempt);
    }
    return (A) this;
  }
  
  public A withLimited(V1LimitedPriorityLevelConfiguration limited) {
    this._visitables.remove("limited");
    if (limited != null) {
        this.limited = new V1LimitedPriorityLevelConfigurationBuilder(limited);
        this._visitables.get("limited").add(this.limited);
    } else {
        this.limited = null;
        this._visitables.get("limited").remove(this.limited);
    }
    return (A) this;
  }
  
  public ExemptNested<A> withNewExempt() {
    return new ExemptNested(null);
  }
  
  public ExemptNested<A> withNewExemptLike(V1ExemptPriorityLevelConfiguration item) {
    return new ExemptNested(item);
  }
  
  public LimitedNested<A> withNewLimited() {
    return new LimitedNested(null);
  }
  
  public LimitedNested<A> withNewLimitedLike(V1LimitedPriorityLevelConfiguration item) {
    return new LimitedNested(item);
  }
  
  public A withType(String type) {
    this.type = type;
    return (A) this;
  }
  public class ExemptNested<N> extends V1ExemptPriorityLevelConfigurationFluent<ExemptNested<N>> implements Nested<N>{
  
    V1ExemptPriorityLevelConfigurationBuilder builder;
  
    ExemptNested(V1ExemptPriorityLevelConfiguration item) {
      this.builder = new V1ExemptPriorityLevelConfigurationBuilder(this, item);
    }
  
    public N and() {
      return (N) V1PriorityLevelConfigurationSpecFluent.this.withExempt(builder.build());
    }
    
    public N endExempt() {
      return and();
    }
    
  }
  public class LimitedNested<N> extends V1LimitedPriorityLevelConfigurationFluent<LimitedNested<N>> implements Nested<N>{
  
    V1LimitedPriorityLevelConfigurationBuilder builder;
  
    LimitedNested(V1LimitedPriorityLevelConfiguration item) {
      this.builder = new V1LimitedPriorityLevelConfigurationBuilder(this, item);
    }
  
    public N and() {
      return (N) V1PriorityLevelConfigurationSpecFluent.this.withLimited(builder.build());
    }
    
    public N endLimited() {
      return and();
    }
    
  }
}