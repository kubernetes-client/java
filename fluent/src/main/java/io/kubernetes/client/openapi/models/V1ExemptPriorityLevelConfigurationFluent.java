package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ExemptPriorityLevelConfigurationFluent<A extends V1ExemptPriorityLevelConfigurationFluent<A>> extends BaseFluent<A>{
  public V1ExemptPriorityLevelConfigurationFluent() {
  }
  
  public V1ExemptPriorityLevelConfigurationFluent(V1ExemptPriorityLevelConfiguration instance) {
    this.copyInstance(instance);
  }
  private Integer lendablePercent;
  private Integer nominalConcurrencyShares;
  
  protected void copyInstance(V1ExemptPriorityLevelConfiguration instance) {
    instance = (instance != null ? instance : new V1ExemptPriorityLevelConfiguration());
    if (instance != null) {
          this.withLendablePercent(instance.getLendablePercent());
          this.withNominalConcurrencyShares(instance.getNominalConcurrencyShares());
        }
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
    V1ExemptPriorityLevelConfigurationFluent that = (V1ExemptPriorityLevelConfigurationFluent) o;
    if (!java.util.Objects.equals(lendablePercent, that.lendablePercent)) return false;
    if (!java.util.Objects.equals(nominalConcurrencyShares, that.nominalConcurrencyShares)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(lendablePercent,  nominalConcurrencyShares,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (lendablePercent != null) { sb.append("lendablePercent:"); sb.append(lendablePercent + ","); }
    if (nominalConcurrencyShares != null) { sb.append("nominalConcurrencyShares:"); sb.append(nominalConcurrencyShares); }
    sb.append("}");
    return sb.toString();
  }
  

}