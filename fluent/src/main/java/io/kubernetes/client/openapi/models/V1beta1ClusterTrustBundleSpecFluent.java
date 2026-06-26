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
public class V1beta1ClusterTrustBundleSpecFluent<A extends io.kubernetes.client.openapi.models.V1beta1ClusterTrustBundleSpecFluent<A>> extends BaseFluent<A>{

  private String signerName;
  private String trustBundle;

  public V1beta1ClusterTrustBundleSpecFluent() {
  }
  
  public V1beta1ClusterTrustBundleSpecFluent(V1beta1ClusterTrustBundleSpec instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1beta1ClusterTrustBundleSpec instance) {
    instance = instance != null ? instance : new V1beta1ClusterTrustBundleSpec();
    if (instance != null) {
        this.withSignerName(instance.getSignerName());
        this.withTrustBundle(instance.getTrustBundle());
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
    V1beta1ClusterTrustBundleSpecFluent that = (V1beta1ClusterTrustBundleSpecFluent) o;
    if (!(Objects.equals(signerName, that.signerName))) {
      return false;
    }
    if (!(Objects.equals(trustBundle, that.trustBundle))) {
      return false;
    }
    return true;
  }
  
  public String getSignerName() {
    return this.signerName;
  }
  
  public String getTrustBundle() {
    return this.trustBundle;
  }
  
  public boolean hasSignerName() {
    return this.signerName != null;
  }
  
  public boolean hasTrustBundle() {
    return this.trustBundle != null;
  }
  
  public int hashCode() {
    return Objects.hash(signerName, trustBundle);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(signerName == null)) {
        sb.append("signerName:");
        sb.append(signerName);
        sb.append(",");
    }
    if (!(trustBundle == null)) {
        sb.append("trustBundle:");
        sb.append(trustBundle);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withSignerName(String signerName) {
    this.signerName = signerName;
    return (A) this;
  }
  
  public A withTrustBundle(String trustBundle) {
    this.trustBundle = trustBundle;
    return (A) this;
  }
  
}