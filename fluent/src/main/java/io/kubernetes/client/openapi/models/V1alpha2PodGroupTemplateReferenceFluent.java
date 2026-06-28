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
import io.kubernetes.client.fluent.Nested;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1alpha2PodGroupTemplateReferenceFluent<A extends io.kubernetes.client.openapi.models.V1alpha2PodGroupTemplateReferenceFluent<A>> extends BaseFluent<A>{

  private V1alpha2WorkloadPodGroupTemplateReferenceBuilder workload;

  public V1alpha2PodGroupTemplateReferenceFluent() {
  }
  
  public V1alpha2PodGroupTemplateReferenceFluent(V1alpha2PodGroupTemplateReference instance) {
    this.copyInstance(instance);
  }

  public V1alpha2WorkloadPodGroupTemplateReference buildWorkload() {
    return this.workload != null ? this.workload.build() : null;
  }
  
  protected void copyInstance(V1alpha2PodGroupTemplateReference instance) {
    instance = instance != null ? instance : new V1alpha2PodGroupTemplateReference();
    if (instance != null) {
      this.withWorkload(instance.getWorkload());
    }
  }
  
  public WorkloadNested<A> editOrNewWorkload() {
    return this.withNewWorkloadLike(Optional.ofNullable(this.buildWorkload()).orElse(new V1alpha2WorkloadPodGroupTemplateReferenceBuilder().build()));
  }
  
  public WorkloadNested<A> editOrNewWorkloadLike(V1alpha2WorkloadPodGroupTemplateReference item) {
    return this.withNewWorkloadLike(Optional.ofNullable(this.buildWorkload()).orElse(item));
  }
  
  public WorkloadNested<A> editWorkload() {
    return this.withNewWorkloadLike(Optional.ofNullable(this.buildWorkload()).orElse(null));
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
    V1alpha2PodGroupTemplateReferenceFluent that = (V1alpha2PodGroupTemplateReferenceFluent) o;
    if (!(Objects.equals(workload, that.workload))) {
      return false;
    }
    return true;
  }
  
  public boolean hasWorkload() {
    return this.workload != null;
  }
  
  public int hashCode() {
    return Objects.hash(workload);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(workload == null)) {
        sb.append("workload:");
        sb.append(workload);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public WorkloadNested<A> withNewWorkload() {
    return new WorkloadNested(null);
  }
  
  public WorkloadNested<A> withNewWorkloadLike(V1alpha2WorkloadPodGroupTemplateReference item) {
    return new WorkloadNested(item);
  }
  
  public A withWorkload(V1alpha2WorkloadPodGroupTemplateReference workload) {
    this._visitables.remove("workload");
    if (workload != null) {
        this.workload = new V1alpha2WorkloadPodGroupTemplateReferenceBuilder(workload);
        this._visitables.get("workload").add(this.workload);
    } else {
        this.workload = null;
        this._visitables.get("workload").remove(this.workload);
    }
    return (A) this;
  }
  public class WorkloadNested<N> extends V1alpha2WorkloadPodGroupTemplateReferenceFluent<WorkloadNested<N>> implements Nested<N>{
  
    V1alpha2WorkloadPodGroupTemplateReferenceBuilder builder;
  
    WorkloadNested(V1alpha2WorkloadPodGroupTemplateReference item) {
      this.builder = new V1alpha2WorkloadPodGroupTemplateReferenceBuilder(this, item);
    }
  
    public N and() {
      return (N) V1alpha2PodGroupTemplateReferenceFluent.this.withWorkload(builder.build());
    }
    
    public N endWorkload() {
      return and();
    }
    
  }
}