package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1beta3LimitedPriorityLevelConfigurationFluentImpl<A extends V1beta3LimitedPriorityLevelConfigurationFluent<A>> extends BaseFluent<A> implements V1beta3LimitedPriorityLevelConfigurationFluent<A>{
  public V1beta3LimitedPriorityLevelConfigurationFluentImpl() {
  }
  public V1beta3LimitedPriorityLevelConfigurationFluentImpl(V1beta3LimitedPriorityLevelConfiguration instance) {
    if (instance != null) {
      this.withBorrowingLimitPercent(instance.getBorrowingLimitPercent());
      this.withLendablePercent(instance.getLendablePercent());
      this.withLimitResponse(instance.getLimitResponse());
      this.withNominalConcurrencyShares(instance.getNominalConcurrencyShares());
    }
  }
  private Integer borrowingLimitPercent;
  private Integer lendablePercent;
  private V1beta3LimitResponseBuilder limitResponse;
  private Integer nominalConcurrencyShares;
  public Integer getBorrowingLimitPercent() {
    return this.borrowingLimitPercent;
  }
  public A withBorrowingLimitPercent(Integer borrowingLimitPercent) {
    this.borrowingLimitPercent=borrowingLimitPercent; return (A) this;
  }
  public Boolean hasBorrowingLimitPercent() {
    return this.borrowingLimitPercent != null;
  }
  public Integer getLendablePercent() {
    return this.lendablePercent;
  }
  public A withLendablePercent(Integer lendablePercent) {
    this.lendablePercent=lendablePercent; return (A) this;
  }
  public Boolean hasLendablePercent() {
    return this.lendablePercent != null;
  }
  
  /**
   * This method has been deprecated, please use method buildLimitResponse instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1beta3LimitResponse getLimitResponse() {
    return this.limitResponse!=null ?this.limitResponse.build():null;
  }
  public V1beta3LimitResponse buildLimitResponse() {
    return this.limitResponse!=null ?this.limitResponse.build():null;
  }
  public A withLimitResponse(V1beta3LimitResponse limitResponse) {
    _visitables.get("limitResponse").remove(this.limitResponse);
    if (limitResponse!=null){ this.limitResponse= new V1beta3LimitResponseBuilder(limitResponse); _visitables.get("limitResponse").add(this.limitResponse);} else { this.limitResponse = null; _visitables.get("limitResponse").remove(this.limitResponse); } return (A) this;
  }
  public Boolean hasLimitResponse() {
    return this.limitResponse != null;
  }
  public V1beta3LimitedPriorityLevelConfigurationFluentImpl.LimitResponseNested<A> withNewLimitResponse() {
    return new V1beta3LimitedPriorityLevelConfigurationFluentImpl.LimitResponseNestedImpl();
  }
  public V1beta3LimitedPriorityLevelConfigurationFluentImpl.LimitResponseNested<A> withNewLimitResponseLike(V1beta3LimitResponse item) {
    return new V1beta3LimitedPriorityLevelConfigurationFluentImpl.LimitResponseNestedImpl(item);
  }
  public V1beta3LimitedPriorityLevelConfigurationFluentImpl.LimitResponseNested<A> editLimitResponse() {
    return withNewLimitResponseLike(getLimitResponse());
  }
  public V1beta3LimitedPriorityLevelConfigurationFluentImpl.LimitResponseNested<A> editOrNewLimitResponse() {
    return withNewLimitResponseLike(getLimitResponse() != null ? getLimitResponse(): new V1beta3LimitResponseBuilder().build());
  }
  public V1beta3LimitedPriorityLevelConfigurationFluentImpl.LimitResponseNested<A> editOrNewLimitResponseLike(V1beta3LimitResponse item) {
    return withNewLimitResponseLike(getLimitResponse() != null ? getLimitResponse(): item);
  }
  public Integer getNominalConcurrencyShares() {
    return this.nominalConcurrencyShares;
  }
  public A withNominalConcurrencyShares(Integer nominalConcurrencyShares) {
    this.nominalConcurrencyShares=nominalConcurrencyShares; return (A) this;
  }
  public Boolean hasNominalConcurrencyShares() {
    return this.nominalConcurrencyShares != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1beta3LimitedPriorityLevelConfigurationFluentImpl that = (V1beta3LimitedPriorityLevelConfigurationFluentImpl) o;
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
  class LimitResponseNestedImpl<N> extends V1beta3LimitResponseFluentImpl<V1beta3LimitedPriorityLevelConfigurationFluentImpl.LimitResponseNested<N>> implements V1beta3LimitedPriorityLevelConfigurationFluentImpl.LimitResponseNested<N>,Nested<N>{
    LimitResponseNestedImpl(V1beta3LimitResponse item) {
      this.builder = new V1beta3LimitResponseBuilder(this, item);
    }
    LimitResponseNestedImpl() {
      this.builder = new V1beta3LimitResponseBuilder(this);
    }
    V1beta3LimitResponseBuilder builder;
    public N and() {
      return (N) V1beta3LimitedPriorityLevelConfigurationFluentImpl.this.withLimitResponse(builder.build());
    }
    public N endLimitResponse() {
      return and();
    }
    
  }
  
}