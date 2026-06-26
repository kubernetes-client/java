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
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1beta2OpaqueDeviceConfigurationFluent<A extends io.kubernetes.client.openapi.models.V1beta2OpaqueDeviceConfigurationFluent<A>> extends BaseFluent<A>{

  private String driver;
  private Object parameters;

  public V1beta2OpaqueDeviceConfigurationFluent() {
  }
  
  public V1beta2OpaqueDeviceConfigurationFluent(V1beta2OpaqueDeviceConfiguration instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1beta2OpaqueDeviceConfiguration instance) {
    instance = instance != null ? instance : new V1beta2OpaqueDeviceConfiguration();
    if (instance != null) {
        this.withDriver(instance.getDriver());
        this.withParameters(instance.getParameters());
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
    V1beta2OpaqueDeviceConfigurationFluent that = (V1beta2OpaqueDeviceConfigurationFluent) o;
    if (!(Objects.equals(driver, that.driver))) {
      return false;
    }
    if (!(Objects.equals(parameters, that.parameters))) {
      return false;
    }
    return true;
  }
  
  public String getDriver() {
    return this.driver;
  }
  
  public Object getParameters() {
    return this.parameters;
  }
  
  public boolean hasDriver() {
    return this.driver != null;
  }
  
  public boolean hasParameters() {
    return this.parameters != null;
  }
  
  public int hashCode() {
    return Objects.hash(driver, parameters);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(driver == null)) {
        sb.append("driver:");
        sb.append(driver);
        sb.append(",");
    }
    if (!(parameters == null)) {
        sb.append("parameters:");
        sb.append(parameters);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withDriver(String driver) {
    this.driver = driver;
    return (A) this;
  }
  
  public A withParameters(Object parameters) {
    this.parameters = parameters;
    return (A) this;
  }
  
}