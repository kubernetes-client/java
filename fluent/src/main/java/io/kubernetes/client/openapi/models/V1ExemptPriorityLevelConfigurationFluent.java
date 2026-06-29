/*
Copyright 2026 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ExemptPriorityLevelConfigurationFluent<A extends io.kubernetes.client.openapi.models.V1ExemptPriorityLevelConfigurationFluent<A>> extends BaseFluent<A>{

  private Integer lendablePercent;
  private Integer nominalConcurrencyShares;

  public V1ExemptPriorityLevelConfigurationFluent() {
  }
  
  public V1ExemptPriorityLevelConfigurationFluent(V1ExemptPriorityLevelConfiguration instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1ExemptPriorityLevelConfiguration instance) {
    instance = instance != null ? instance : new V1ExemptPriorityLevelConfiguration();
    if (instance != null) {
        this.withLendablePercent(instance.getLendablePercent());
        this.withNominalConcurrencyShares(instance.getNominalConcurrencyShares());
    }
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
    V1ExemptPriorityLevelConfigurationFluent that = (V1ExemptPriorityLevelConfigurationFluent) o;
    if (!(Objects.equals(lendablePercent, that.lendablePercent))) {
      return false;
    }
    if (!(Objects.equals(nominalConcurrencyShares, that.nominalConcurrencyShares))) {
      return false;
    }
    return true;
  }
  
  public Integer getLendablePercent() {
    return this.lendablePercent;
  }
  
  public Integer getNominalConcurrencyShares() {
    return this.nominalConcurrencyShares;
  }
  
  public boolean hasLendablePercent() {
    return this.lendablePercent != null;
  }
  
  public boolean hasNominalConcurrencyShares() {
    return this.nominalConcurrencyShares != null;
  }
  
  public int hashCode() {
    return Objects.hash(lendablePercent, nominalConcurrencyShares);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(lendablePercent == null)) {
        sb.append("lendablePercent:");
        sb.append(lendablePercent);
        sb.append(",");
    }
    if (!(nominalConcurrencyShares == null)) {
        sb.append("nominalConcurrencyShares:");
        sb.append(nominalConcurrencyShares);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withLendablePercent(Integer lendablePercent) {
    this.lendablePercent = lendablePercent;
    return (A) this;
  }
  
  public A withNominalConcurrencyShares(Integer nominalConcurrencyShares) {
    this.nominalConcurrencyShares = nominalConcurrencyShares;
    return (A) this;
  }
  
}