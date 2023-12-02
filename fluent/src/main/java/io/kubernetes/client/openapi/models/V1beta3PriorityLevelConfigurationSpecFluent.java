package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1beta3PriorityLevelConfigurationSpecFluent<A extends V1beta3PriorityLevelConfigurationSpecFluent<A>> extends BaseFluent<A>{
  public V1beta3PriorityLevelConfigurationSpecFluent() {
  }
  
  public V1beta3PriorityLevelConfigurationSpecFluent(V1beta3PriorityLevelConfigurationSpec instance) {
    this.copyInstance(instance);
  }
  private V1beta3ExemptPriorityLevelConfigurationBuilder exempt;
  private V1beta3LimitedPriorityLevelConfigurationBuilder limited;
  private String type;
  
  protected void copyInstance(V1beta3PriorityLevelConfigurationSpec instance) {
    instance = (instance != null ? instance : new V1beta3PriorityLevelConfigurationSpec());
    if (instance != null) {
          this.withExempt(instance.getExempt());
          this.withLimited(instance.getLimited());
          this.withType(instance.getType());
        }
  }
  
  public V1beta3ExemptPriorityLevelConfiguration buildExempt() {
    return this.exempt != null ? this.exempt.build() : null;
  }
  
  public A withExempt(V1beta3ExemptPriorityLevelConfiguration exempt) {
    this._visitables.remove("exempt");
    if (exempt != null) {
        this.exempt = new V1beta3ExemptPriorityLevelConfigurationBuilder(exempt);
        this._visitables.get("exempt").add(this.exempt);
    } else {
        this.exempt = null;
        this._visitables.get("exempt").remove(this.exempt);
    }
    return (A) this;
  }
  
  public boolean hasExempt() {
    return this.exempt != null;
  }
  
  public ExemptNested<A> withNewExempt() {
    return new ExemptNested(null);
  }
  
  public ExemptNested<A> withNewExemptLike(V1beta3ExemptPriorityLevelConfiguration item) {
    return new ExemptNested(item);
  }
  
  public ExemptNested<A> editExempt() {
    return withNewExemptLike(java.util.Optional.ofNullable(buildExempt()).orElse(null));
  }
  
  public ExemptNested<A> editOrNewExempt() {
    return withNewExemptLike(java.util.Optional.ofNullable(buildExempt()).orElse(new V1beta3ExemptPriorityLevelConfigurationBuilder().build()));
  }
  
  public ExemptNested<A> editOrNewExemptLike(V1beta3ExemptPriorityLevelConfiguration item) {
    return withNewExemptLike(java.util.Optional.ofNullable(buildExempt()).orElse(item));
  }
  
  public V1beta3LimitedPriorityLevelConfiguration buildLimited() {
    return this.limited != null ? this.limited.build() : null;
  }
  
  public A withLimited(V1beta3LimitedPriorityLevelConfiguration limited) {
    this._visitables.remove("limited");
    if (limited != null) {
        this.limited = new V1beta3LimitedPriorityLevelConfigurationBuilder(limited);
        this._visitables.get("limited").add(this.limited);
    } else {
        this.limited = null;
        this._visitables.get("limited").remove(this.limited);
    }
    return (A) this;
  }
  
  public boolean hasLimited() {
    return this.limited != null;
  }
  
  public LimitedNested<A> withNewLimited() {
    return new LimitedNested(null);
  }
  
  public LimitedNested<A> withNewLimitedLike(V1beta3LimitedPriorityLevelConfiguration item) {
    return new LimitedNested(item);
  }
  
  public LimitedNested<A> editLimited() {
    return withNewLimitedLike(java.util.Optional.ofNullable(buildLimited()).orElse(null));
  }
  
  public LimitedNested<A> editOrNewLimited() {
    return withNewLimitedLike(java.util.Optional.ofNullable(buildLimited()).orElse(new V1beta3LimitedPriorityLevelConfigurationBuilder().build()));
  }
  
  public LimitedNested<A> editOrNewLimitedLike(V1beta3LimitedPriorityLevelConfiguration item) {
    return withNewLimitedLike(java.util.Optional.ofNullable(buildLimited()).orElse(item));
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
    V1beta3PriorityLevelConfigurationSpecFluent that = (V1beta3PriorityLevelConfigurationSpecFluent) o;
    if (!java.util.Objects.equals(exempt, that.exempt)) return false;
    if (!java.util.Objects.equals(limited, that.limited)) return false;
    if (!java.util.Objects.equals(type, that.type)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(exempt,  limited,  type,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (exempt != null) { sb.append("exempt:"); sb.append(exempt + ","); }
    if (limited != null) { sb.append("limited:"); sb.append(limited + ","); }
    if (type != null) { sb.append("type:"); sb.append(type); }
    sb.append("}");
    return sb.toString();
  }
  public class ExemptNested<N> extends V1beta3ExemptPriorityLevelConfigurationFluent<ExemptNested<N>> implements Nested<N>{
    ExemptNested(V1beta3ExemptPriorityLevelConfiguration item) {
      this.builder = new V1beta3ExemptPriorityLevelConfigurationBuilder(this, item);
    }
    V1beta3ExemptPriorityLevelConfigurationBuilder builder;
    
    public N and() {
      return (N) V1beta3PriorityLevelConfigurationSpecFluent.this.withExempt(builder.build());
    }
    
    public N endExempt() {
      return and();
    }
    
  
  }
  public class LimitedNested<N> extends V1beta3LimitedPriorityLevelConfigurationFluent<LimitedNested<N>> implements Nested<N>{
    LimitedNested(V1beta3LimitedPriorityLevelConfiguration item) {
      this.builder = new V1beta3LimitedPriorityLevelConfigurationBuilder(this, item);
    }
    V1beta3LimitedPriorityLevelConfigurationBuilder builder;
    
    public N and() {
      return (N) V1beta3PriorityLevelConfigurationSpecFluent.this.withLimited(builder.build());
    }
    
    public N endLimited() {
      return and();
    }
    
  
  }

}