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
public class V1beta2LimitedPriorityLevelConfigurationFluent<A extends V1beta2LimitedPriorityLevelConfigurationFluent<A>> extends BaseFluent<A>{
  public V1beta2LimitedPriorityLevelConfigurationFluent() {
  }
  
  public V1beta2LimitedPriorityLevelConfigurationFluent(V1beta2LimitedPriorityLevelConfiguration instance) {
    this.copyInstance(instance);
  }
  private Integer assuredConcurrencyShares;
  private Integer borrowingLimitPercent;
  private Integer lendablePercent;
  private V1beta2LimitResponseBuilder limitResponse;
  
  protected void copyInstance(V1beta2LimitedPriorityLevelConfiguration instance) {
    instance = (instance != null ? instance : new V1beta2LimitedPriorityLevelConfiguration());
    if (instance != null) {
          this.withAssuredConcurrencyShares(instance.getAssuredConcurrencyShares());
          this.withBorrowingLimitPercent(instance.getBorrowingLimitPercent());
          this.withLendablePercent(instance.getLendablePercent());
          this.withLimitResponse(instance.getLimitResponse());
        }
  }
  
  public Integer getAssuredConcurrencyShares() {
    return this.assuredConcurrencyShares;
  }
  
  public A withAssuredConcurrencyShares(Integer assuredConcurrencyShares) {
    this.assuredConcurrencyShares = assuredConcurrencyShares;
    return (A) this;
  }
  
  public boolean hasAssuredConcurrencyShares() {
    return this.assuredConcurrencyShares != null;
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
  
  public V1beta2LimitResponse buildLimitResponse() {
    return this.limitResponse != null ? this.limitResponse.build() : null;
  }
  
  public A withLimitResponse(V1beta2LimitResponse limitResponse) {
    this._visitables.remove("limitResponse");
    if (limitResponse != null) {
        this.limitResponse = new V1beta2LimitResponseBuilder(limitResponse);
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
  
  public LimitResponseNested<A> withNewLimitResponseLike(V1beta2LimitResponse item) {
    return new LimitResponseNested(item);
  }
  
  public LimitResponseNested<A> editLimitResponse() {
    return withNewLimitResponseLike(java.util.Optional.ofNullable(buildLimitResponse()).orElse(null));
  }
  
  public LimitResponseNested<A> editOrNewLimitResponse() {
    return withNewLimitResponseLike(java.util.Optional.ofNullable(buildLimitResponse()).orElse(new V1beta2LimitResponseBuilder().build()));
  }
  
  public LimitResponseNested<A> editOrNewLimitResponseLike(V1beta2LimitResponse item) {
    return withNewLimitResponseLike(java.util.Optional.ofNullable(buildLimitResponse()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1beta2LimitedPriorityLevelConfigurationFluent that = (V1beta2LimitedPriorityLevelConfigurationFluent) o;
    if (!java.util.Objects.equals(assuredConcurrencyShares, that.assuredConcurrencyShares)) return false;
    if (!java.util.Objects.equals(borrowingLimitPercent, that.borrowingLimitPercent)) return false;
    if (!java.util.Objects.equals(lendablePercent, that.lendablePercent)) return false;
    if (!java.util.Objects.equals(limitResponse, that.limitResponse)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(assuredConcurrencyShares,  borrowingLimitPercent,  lendablePercent,  limitResponse,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (assuredConcurrencyShares != null) { sb.append("assuredConcurrencyShares:"); sb.append(assuredConcurrencyShares + ","); }
    if (borrowingLimitPercent != null) { sb.append("borrowingLimitPercent:"); sb.append(borrowingLimitPercent + ","); }
    if (lendablePercent != null) { sb.append("lendablePercent:"); sb.append(lendablePercent + ","); }
    if (limitResponse != null) { sb.append("limitResponse:"); sb.append(limitResponse); }
    sb.append("}");
    return sb.toString();
  }
  public class LimitResponseNested<N> extends V1beta2LimitResponseFluent<LimitResponseNested<N>> implements Nested<N>{
    LimitResponseNested(V1beta2LimitResponse item) {
      this.builder = new V1beta2LimitResponseBuilder(this, item);
    }
    V1beta2LimitResponseBuilder builder;
    
    public N and() {
      return (N) V1beta2LimitedPriorityLevelConfigurationFluent.this.withLimitResponse(builder.build());
    }
    
    public N endLimitResponse() {
      return and();
    }
    
  
  }

}