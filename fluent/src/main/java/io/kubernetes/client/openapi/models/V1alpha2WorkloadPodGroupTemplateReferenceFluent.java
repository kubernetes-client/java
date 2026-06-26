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
public class V1alpha2WorkloadPodGroupTemplateReferenceFluent<A extends io.kubernetes.client.openapi.models.V1alpha2WorkloadPodGroupTemplateReferenceFluent<A>> extends BaseFluent<A>{

  private String podGroupTemplateName;
  private String workloadName;

  public V1alpha2WorkloadPodGroupTemplateReferenceFluent() {
  }
  
  public V1alpha2WorkloadPodGroupTemplateReferenceFluent(V1alpha2WorkloadPodGroupTemplateReference instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1alpha2WorkloadPodGroupTemplateReference instance) {
    instance = instance != null ? instance : new V1alpha2WorkloadPodGroupTemplateReference();
    if (instance != null) {
        this.withPodGroupTemplateName(instance.getPodGroupTemplateName());
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
    V1alpha2WorkloadPodGroupTemplateReferenceFluent that = (V1alpha2WorkloadPodGroupTemplateReferenceFluent) o;
    if (!(Objects.equals(podGroupTemplateName, that.podGroupTemplateName))) {
      return false;
    }
    if (!(Objects.equals(workloadName, that.workloadName))) {
      return false;
    }
    return true;
  }
  
  public String getPodGroupTemplateName() {
    return this.podGroupTemplateName;
  }
  
  public String getWorkloadName() {
    return this.workloadName;
  }
  
  public boolean hasPodGroupTemplateName() {
    return this.podGroupTemplateName != null;
  }
  
  public boolean hasWorkloadName() {
    return this.workloadName != null;
  }
  
  public int hashCode() {
    return Objects.hash(podGroupTemplateName, workloadName);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(podGroupTemplateName == null)) {
        sb.append("podGroupTemplateName:");
        sb.append(podGroupTemplateName);
        sb.append(",");
    }
    if (!(workloadName == null)) {
        sb.append("workloadName:");
        sb.append(workloadName);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withPodGroupTemplateName(String podGroupTemplateName) {
    this.podGroupTemplateName = podGroupTemplateName;
    return (A) this;
  }
  
  public A withWorkloadName(String workloadName) {
    this.workloadName = workloadName;
    return (A) this;
  }
  
}