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
  public class V1beta1LimitedPriorityLevelConfigurationFluentImpl<A extends V1beta1LimitedPriorityLevelConfigurationFluent<A>> extends BaseFluent<A> implements V1beta1LimitedPriorityLevelConfigurationFluent<A>{
  public V1beta1LimitedPriorityLevelConfigurationFluentImpl() {
  }
  public V1beta1LimitedPriorityLevelConfigurationFluentImpl(V1beta1LimitedPriorityLevelConfiguration instance) {
    this.withAssuredConcurrencyShares(instance.getAssuredConcurrencyShares());

    this.withLimitResponse(instance.getLimitResponse());

  }
  private Integer assuredConcurrencyShares;
  private V1beta1LimitResponseBuilder limitResponse;
  public Integer getAssuredConcurrencyShares() {
    return this.assuredConcurrencyShares;
  }
  public A withAssuredConcurrencyShares(Integer assuredConcurrencyShares) {
    this.assuredConcurrencyShares=assuredConcurrencyShares; return (A) this;
  }
  public Boolean hasAssuredConcurrencyShares() {
    return this.assuredConcurrencyShares != null;
  }
  
  /**
   * This method has been deprecated, please use method buildLimitResponse instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1beta1LimitResponse getLimitResponse() {
    return this.limitResponse!=null ?this.limitResponse.build():null;
  }
  public V1beta1LimitResponse buildLimitResponse() {
    return this.limitResponse!=null ?this.limitResponse.build():null;
  }
  public A withLimitResponse(V1beta1LimitResponse limitResponse) {
    _visitables.get("limitResponse").remove(this.limitResponse);
    if (limitResponse!=null){ this.limitResponse= new V1beta1LimitResponseBuilder(limitResponse); _visitables.get("limitResponse").add(this.limitResponse);} else { this.limitResponse = null; _visitables.get("limitResponse").remove(this.limitResponse); } return (A) this;
  }
  public Boolean hasLimitResponse() {
    return this.limitResponse != null;
  }
  public V1beta1LimitedPriorityLevelConfigurationFluent.LimitResponseNested<A> withNewLimitResponse() {
    return new V1beta1LimitedPriorityLevelConfigurationFluentImpl.LimitResponseNestedImpl();
  }
  public V1beta1LimitedPriorityLevelConfigurationFluent.LimitResponseNested<A> withNewLimitResponseLike(V1beta1LimitResponse item) {
    return new V1beta1LimitedPriorityLevelConfigurationFluentImpl.LimitResponseNestedImpl(item);
  }
  public V1beta1LimitedPriorityLevelConfigurationFluent.LimitResponseNested<A> editLimitResponse() {
    return withNewLimitResponseLike(getLimitResponse());
  }
  public V1beta1LimitedPriorityLevelConfigurationFluent.LimitResponseNested<A> editOrNewLimitResponse() {
    return withNewLimitResponseLike(getLimitResponse() != null ? getLimitResponse(): new V1beta1LimitResponseBuilder().build());
  }
  public V1beta1LimitedPriorityLevelConfigurationFluent.LimitResponseNested<A> editOrNewLimitResponseLike(V1beta1LimitResponse item) {
    return withNewLimitResponseLike(getLimitResponse() != null ? getLimitResponse(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1beta1LimitedPriorityLevelConfigurationFluentImpl that = (V1beta1LimitedPriorityLevelConfigurationFluentImpl) o;
    if (assuredConcurrencyShares != null ? !assuredConcurrencyShares.equals(that.assuredConcurrencyShares) :that.assuredConcurrencyShares != null) return false;
    if (limitResponse != null ? !limitResponse.equals(that.limitResponse) :that.limitResponse != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(assuredConcurrencyShares,  limitResponse,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (assuredConcurrencyShares != null) { sb.append("assuredConcurrencyShares:"); sb.append(assuredConcurrencyShares + ","); }
    if (limitResponse != null) { sb.append("limitResponse:"); sb.append(limitResponse); }
    sb.append("}");
    return sb.toString();
  }
  class LimitResponseNestedImpl<N> extends V1beta1LimitResponseFluentImpl<V1beta1LimitedPriorityLevelConfigurationFluent.LimitResponseNested<N>> implements V1beta1LimitedPriorityLevelConfigurationFluent.LimitResponseNested<N>,Nested<N>{
    LimitResponseNestedImpl(V1beta1LimitResponse item) {
      this.builder = new V1beta1LimitResponseBuilder(this, item);
    }
    LimitResponseNestedImpl() {
      this.builder = new V1beta1LimitResponseBuilder(this);
    }
    V1beta1LimitResponseBuilder builder;
    public N and() {
      return (N) V1beta1LimitedPriorityLevelConfigurationFluentImpl.this.withLimitResponse(builder.build());
    }
    public N endLimitResponse() {
      return and();
    }
    
  }
  
}