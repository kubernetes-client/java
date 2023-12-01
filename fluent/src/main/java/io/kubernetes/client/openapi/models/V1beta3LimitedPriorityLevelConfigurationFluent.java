package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Integer;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1beta3LimitedPriorityLevelConfigurationFluent<A extends V1beta3LimitedPriorityLevelConfigurationFluent<A>> extends BaseFluent<A>{
  public V1beta3LimitedPriorityLevelConfigurationFluent() {
  }
  
  public V1beta3LimitedPriorityLevelConfigurationFluent(V1beta3LimitedPriorityLevelConfiguration instance) {
    this.copyInstance(instance);
  }
  private Integer borrowingLimitPercent;
  private Integer lendablePercent;
  private V1beta3LimitResponseBuilder limitResponse;
  private Integer nominalConcurrencyShares;
  
  protected void copyInstance(V1beta3LimitedPriorityLevelConfiguration instance) {
    instance = (instance != null ? instance : new V1beta3LimitedPriorityLevelConfiguration());
    if (instance != null) {
          this.withBorrowingLimitPercent(instance.getBorrowingLimitPercent());
          this.withLendablePercent(instance.getLendablePercent());
          this.withLimitResponse(instance.getLimitResponse());
          this.withNominalConcurrencyShares(instance.getNominalConcurrencyShares());
        }
  }
  
  public Integer getBorrowingLimitPercent() {
    return this.borrowingLimitPercent;
  }
  
  public A withBorrowingLimitPercent(Integer borrowingLimitPercent) {
    this.borrowingLimitPercent = borrowingLimitPercent;
    return (A) this;
  }
  
  public boolean hasBorrowingLimitPercent() {
    return this.borrowingLimitPercent != null;
  }
  
  public Integer getLendablePercent() {
    return this.lendablePercent;
  }
  
  public A withLendablePercent(Integer lendablePercent) {
    this.lendablePercent = lendablePercent;
    return (A) this;
  }
  
  public boolean hasLendablePercent() {
    return this.lendablePercent != null;
  }
  
  public V1beta3LimitResponse buildLimitResponse() {
    return this.limitResponse != null ? this.limitResponse.build() : null;
  }
  
  public A withLimitResponse(V1beta3LimitResponse limitResponse) {
    this._visitables.remove("limitResponse");
    if (limitResponse != null) {
        this.limitResponse = new V1beta3LimitResponseBuilder(limitResponse);
        this._visitables.get("limitResponse").add(this.limitResponse);
    } else {
        this.limitResponse = null;
        this._visitables.get("limitResponse").remove(this.limitResponse);
    }
    return (A) this;
  }
  
  public boolean hasLimitResponse() {
    return this.limitResponse != null;
  }
  
  public LimitResponseNested<A> withNewLimitResponse() {
    return new LimitResponseNested(null);
  }
  
  public LimitResponseNested<A> withNewLimitResponseLike(V1beta3LimitResponse item) {
    return new LimitResponseNested(item);
  }
  
  public LimitResponseNested<A> editLimitResponse() {
    return withNewLimitResponseLike(java.util.Optional.ofNullable(buildLimitResponse()).orElse(null));
  }
  
  public LimitResponseNested<A> editOrNewLimitResponse() {
    return withNewLimitResponseLike(java.util.Optional.ofNullable(buildLimitResponse()).orElse(new V1beta3LimitResponseBuilder().build()));
  }
  
  public LimitResponseNested<A> editOrNewLimitResponseLike(V1beta3LimitResponse item) {
    return withNewLimitResponseLike(java.util.Optional.ofNullable(buildLimitResponse()).orElse(item));
  }
  
  public Integer getNominalConcurrencyShares() {
    return this.nominalConcurrencyShares;
  }
  
  public A withNominalConcurrencyShares(Integer nominalConcurrencyShares) {
    this.nominalConcurrencyShares = nominalConcurrencyShares;
    return (A) this;
  }
  
  public boolean hasNominalConcurrencyShares() {
    return this.nominalConcurrencyShares != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1beta3LimitedPriorityLevelConfigurationFluent that = (V1beta3LimitedPriorityLevelConfigurationFluent) o;
    if (!java.util.Objects.equals(borrowingLimitPercent, that.borrowingLimitPercent)) return false;
    if (!java.util.Objects.equals(lendablePercent, that.lendablePercent)) return false;
    if (!java.util.Objects.equals(limitResponse, that.limitResponse)) return false;
    if (!java.util.Objects.equals(nominalConcurrencyShares, that.nominalConcurrencyShares)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(borrowingLimitPercent,  lendablePercent,  limitResponse,  nominalConcurrencyShares,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (borrowingLimitPercent != null) { sb.append("borrowingLimitPercent:"); sb.append(borrowingLimitPercent + ","); }
    if (lendablePercent != null) { sb.append("lendablePercent:"); sb.append(lendablePercent + ","); }
    if (limitResponse != null) { sb.append("limitResponse:"); sb.append(limitResponse + ","); }
    if (nominalConcurrencyShares != null) { sb.append("nominalConcurrencyShares:"); sb.append(nominalConcurrencyShares); }
    sb.append("}");
    return sb.toString();
  }
  public class LimitResponseNested<N> extends V1beta3LimitResponseFluent<LimitResponseNested<N>> implements Nested<N>{
    LimitResponseNested(V1beta3LimitResponse item) {
      this.builder = new V1beta3LimitResponseBuilder(this, item);
    }
    V1beta3LimitResponseBuilder builder;
    
    public N and() {
      return (N) V1beta3LimitedPriorityLevelConfigurationFluent.this.withLimitResponse(builder.build());
    }
    
    public N endLimitResponse() {
      return and();
    }
    
  
  }

}