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
import javax.annotation.processing.Generated;

/**
 * Generated
 */
@Generated("io.sundr:builder-annotations")
@SuppressWarnings({"unchecked"})
public class V1alpha3WorkloadReferenceFluent<A extends V1alpha3WorkloadReferenceFluent<A>> extends BaseFluent<A>{

  private String templateName;
  private String workloadName;

  public V1alpha3WorkloadReferenceFluent() {
  }
  
  public V1alpha3WorkloadReferenceFluent(V1alpha3WorkloadReference instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1alpha3WorkloadReference instance) {
    instance = instance != null ? instance : new V1alpha3WorkloadReference();
    if (instance != null) {
        this.withTemplateName(instance.getTemplateName());
        this.withWorkloadName(instance.getWorkloadName());
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
    V1alpha3WorkloadReferenceFluent<?> that = (V1alpha3WorkloadReferenceFluent<?>) o;
    if (!(Objects.equals(templateName, that.templateName))) {
      return false;
    }
    if (!(Objects.equals(workloadName, that.workloadName))) {
      return false;
    }
    return true;
  }
  
  public String getTemplateName() {
    return this.templateName;
  }
  
  public String getWorkloadName() {
    return this.workloadName;
  }
  
  public boolean hasTemplateName() {
    return this.templateName != null;
  }
  
  public boolean hasWorkloadName() {
    return this.workloadName != null;
  }
  
  public int hashCode() {
    return Objects.hash(templateName, workloadName);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(templateName == null)) {
        sb.append("templateName:");
        sb.append(templateName);
        sb.append(",");
    }
    if (!(workloadName == null)) {
        sb.append("workloadName:");
        sb.append(workloadName);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withTemplateName(String templateName) {
    this.templateName = templateName;
    return (A) this;
  }
  
  public A withWorkloadName(String workloadName) {
    this.workloadName = workloadName;
    return (A) this;
  }
  
}