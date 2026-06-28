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
public class V1alpha3ResourcePoolStatusRequestSpecFluent<A extends io.kubernetes.client.openapi.models.V1alpha3ResourcePoolStatusRequestSpecFluent<A>> extends BaseFluent<A>{

  private String driver;
  private Integer limit;
  private String poolName;

  public V1alpha3ResourcePoolStatusRequestSpecFluent() {
  }
  
  public V1alpha3ResourcePoolStatusRequestSpecFluent(V1alpha3ResourcePoolStatusRequestSpec instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1alpha3ResourcePoolStatusRequestSpec instance) {
    instance = instance != null ? instance : new V1alpha3ResourcePoolStatusRequestSpec();
    if (instance != null) {
        this.withDriver(instance.getDriver());
        this.withLimit(instance.getLimit());
        this.withPoolName(instance.getPoolName());
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
    V1alpha3ResourcePoolStatusRequestSpecFluent that = (V1alpha3ResourcePoolStatusRequestSpecFluent) o;
    if (!(Objects.equals(driver, that.driver))) {
      return false;
    }
    if (!(Objects.equals(limit, that.limit))) {
      return false;
    }
    if (!(Objects.equals(poolName, that.poolName))) {
      return false;
    }
    return true;
  }
  
  public String getDriver() {
    return this.driver;
  }
  
  public Integer getLimit() {
    return this.limit;
  }
  
  public String getPoolName() {
    return this.poolName;
  }
  
  public boolean hasDriver() {
    return this.driver != null;
  }
  
  public boolean hasLimit() {
    return this.limit != null;
  }
  
  public boolean hasPoolName() {
    return this.poolName != null;
  }
  
  public int hashCode() {
    return Objects.hash(driver, limit, poolName);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(driver == null)) {
        sb.append("driver:");
        sb.append(driver);
        sb.append(",");
    }
    if (!(limit == null)) {
        sb.append("limit:");
        sb.append(limit);
        sb.append(",");
    }
    if (!(poolName == null)) {
        sb.append("poolName:");
        sb.append(poolName);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withDriver(String driver) {
    this.driver = driver;
    return (A) this;
  }
  
  public A withLimit(Integer limit) {
    this.limit = limit;
    return (A) this;
  }
  
  public A withPoolName(String poolName) {
    this.poolName = poolName;
    return (A) this;
  }
  
}