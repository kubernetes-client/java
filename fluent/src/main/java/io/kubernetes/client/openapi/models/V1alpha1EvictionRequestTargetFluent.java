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
import javax.annotation.processing.Generated;

/**
 * Generated
 */
@Generated("io.sundr:builder-annotations")
@SuppressWarnings({"unchecked"})
public class V1alpha1EvictionRequestTargetFluent<A extends V1alpha1EvictionRequestTargetFluent<A>> extends BaseFluent<A>{

  private V1alpha1EvictionRequestPodReferenceBuilder pod;

  public V1alpha1EvictionRequestTargetFluent() {
  }
  
  public V1alpha1EvictionRequestTargetFluent(V1alpha1EvictionRequestTarget instance) {
    this.copyInstance(instance);
  }

  public V1alpha1EvictionRequestPodReference buildPod() {
    return this.pod != null ? this.pod.build() : null;
  }
  
  protected void copyInstance(V1alpha1EvictionRequestTarget instance) {
    instance = instance != null ? instance : new V1alpha1EvictionRequestTarget();
    if (instance != null) {
      this.withPod(instance.getPod());
    }
  }
  
  public PodNested<A> editOrNewPod() {
    return this.withNewPodLike(Optional.ofNullable(this.buildPod()).orElse(new V1alpha1EvictionRequestPodReferenceBuilder().build()));
  }
  
  public PodNested<A> editOrNewPodLike(V1alpha1EvictionRequestPodReference item) {
    return this.withNewPodLike(Optional.ofNullable(this.buildPod()).orElse(item));
  }
  
  public PodNested<A> editPod() {
    return this.withNewPodLike(Optional.ofNullable(this.buildPod()).orElse(null));
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
    V1alpha1EvictionRequestTargetFluent<?> that = (V1alpha1EvictionRequestTargetFluent<?>) o;
    if (!(Objects.equals(pod, that.pod))) {
      return false;
    }
    return true;
  }
  
  public boolean hasPod() {
    return this.pod != null;
  }
  
  public int hashCode() {
    return Objects.hash(pod);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(pod == null)) {
        sb.append("pod:");
        sb.append(pod);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public PodNested<A> withNewPod() {
    return new PodNested<>(null);
  }
  
  public PodNested<A> withNewPodLike(V1alpha1EvictionRequestPodReference item) {
    return new PodNested<>(item);
  }
  
  public A withPod(V1alpha1EvictionRequestPodReference pod) {
    this._visitables.remove("pod");
    if (pod != null) {
        this.pod = new V1alpha1EvictionRequestPodReferenceBuilder(pod);
        this._visitables.get("pod").add(this.pod);
    } else {
        this._visitables.get("pod").remove(this.pod);
        this.pod = null;
    }
    return (A) this;
  }
  public class PodNested<N> extends V1alpha1EvictionRequestPodReferenceFluent<PodNested<N>> implements Nested<N>{
  
    V1alpha1EvictionRequestPodReferenceBuilder builder;
  
    PodNested(V1alpha1EvictionRequestPodReference item) {
      this.builder = new V1alpha1EvictionRequestPodReferenceBuilder(this, item);
    }
  
    public N and() {
      return (N) V1alpha1EvictionRequestTargetFluent.this.withPod(builder.build());
    }
    
    public N endPod() {
      return and();
    }
    
  }
}