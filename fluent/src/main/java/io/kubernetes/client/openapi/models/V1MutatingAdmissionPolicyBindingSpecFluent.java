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
public class V1MutatingAdmissionPolicyBindingSpecFluent<A extends io.kubernetes.client.openapi.models.V1MutatingAdmissionPolicyBindingSpecFluent<A>> extends BaseFluent<A>{

  private V1MatchResourcesBuilder matchResources;
  private V1ParamRefBuilder paramRef;
  private String policyName;

  public V1MutatingAdmissionPolicyBindingSpecFluent() {
  }
  
  public V1MutatingAdmissionPolicyBindingSpecFluent(V1MutatingAdmissionPolicyBindingSpec instance) {
    this.copyInstance(instance);
  }

  public V1MatchResources buildMatchResources() {
    return this.matchResources != null ? this.matchResources.build() : null;
  }
  
  public V1ParamRef buildParamRef() {
    return this.paramRef != null ? this.paramRef.build() : null;
  }
  
  protected void copyInstance(V1MutatingAdmissionPolicyBindingSpec instance) {
    instance = instance != null ? instance : new V1MutatingAdmissionPolicyBindingSpec();
    if (instance != null) {
        this.withMatchResources(instance.getMatchResources());
        this.withParamRef(instance.getParamRef());
        this.withPolicyName(instance.getPolicyName());
    }
  }
  
  public MatchResourcesNested<A> editMatchResources() {
    return this.withNewMatchResourcesLike(Optional.ofNullable(this.buildMatchResources()).orElse(null));
  }
  
  public MatchResourcesNested<A> editOrNewMatchResources() {
    return this.withNewMatchResourcesLike(Optional.ofNullable(this.buildMatchResources()).orElse(new V1MatchResourcesBuilder().build()));
  }
  
  public MatchResourcesNested<A> editOrNewMatchResourcesLike(V1MatchResources item) {
    return this.withNewMatchResourcesLike(Optional.ofNullable(this.buildMatchResources()).orElse(item));
  }
  
  public ParamRefNested<A> editOrNewParamRef() {
    return this.withNewParamRefLike(Optional.ofNullable(this.buildParamRef()).orElse(new V1ParamRefBuilder().build()));
  }
  
  public ParamRefNested<A> editOrNewParamRefLike(V1ParamRef item) {
    return this.withNewParamRefLike(Optional.ofNullable(this.buildParamRef()).orElse(item));
  }
  
  public ParamRefNested<A> editParamRef() {
    return this.withNewParamRefLike(Optional.ofNullable(this.buildParamRef()).orElse(null));
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
    V1MutatingAdmissionPolicyBindingSpecFluent that = (V1MutatingAdmissionPolicyBindingSpecFluent) o;
    if (!(Objects.equals(matchResources, that.matchResources))) {
      return false;
    }
    if (!(Objects.equals(paramRef, that.paramRef))) {
      return false;
    }
    if (!(Objects.equals(policyName, that.policyName))) {
      return false;
    }
    return true;
  }
  
  public String getPolicyName() {
    return this.policyName;
  }
  
  public boolean hasMatchResources() {
    return this.matchResources != null;
  }
  
  public boolean hasParamRef() {
    return this.paramRef != null;
  }
  
  public boolean hasPolicyName() {
    return this.policyName != null;
  }
  
  public int hashCode() {
    return Objects.hash(matchResources, paramRef, policyName);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(matchResources == null)) {
        sb.append("matchResources:");
        sb.append(matchResources);
        sb.append(",");
    }
    if (!(paramRef == null)) {
        sb.append("paramRef:");
        sb.append(paramRef);
        sb.append(",");
    }
    if (!(policyName == null)) {
        sb.append("policyName:");
        sb.append(policyName);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withMatchResources(V1MatchResources matchResources) {
    this._visitables.remove("matchResources");
    if (matchResources != null) {
        this.matchResources = new V1MatchResourcesBuilder(matchResources);
        this._visitables.get("matchResources").add(this.matchResources);
    } else {
        this.matchResources = null;
        this._visitables.get("matchResources").remove(this.matchResources);
    }
    return (A) this;
  }
  
  public MatchResourcesNested<A> withNewMatchResources() {
    return new MatchResourcesNested(null);
  }
  
  public MatchResourcesNested<A> withNewMatchResourcesLike(V1MatchResources item) {
    return new MatchResourcesNested(item);
  }
  
  public ParamRefNested<A> withNewParamRef() {
    return new ParamRefNested(null);
  }
  
  public ParamRefNested<A> withNewParamRefLike(V1ParamRef item) {
    return new ParamRefNested(item);
  }
  
  public A withParamRef(V1ParamRef paramRef) {
    this._visitables.remove("paramRef");
    if (paramRef != null) {
        this.paramRef = new V1ParamRefBuilder(paramRef);
        this._visitables.get("paramRef").add(this.paramRef);
    } else {
        this.paramRef = null;
        this._visitables.get("paramRef").remove(this.paramRef);
    }
    return (A) this;
  }
  
  public A withPolicyName(String policyName) {
    this.policyName = policyName;
    return (A) this;
  }
  public class MatchResourcesNested<N> extends V1MatchResourcesFluent<MatchResourcesNested<N>> implements Nested<N>{
  
    V1MatchResourcesBuilder builder;
  
    MatchResourcesNested(V1MatchResources item) {
      this.builder = new V1MatchResourcesBuilder(this, item);
    }
  
    public N and() {
      return (N) V1MutatingAdmissionPolicyBindingSpecFluent.this.withMatchResources(builder.build());
    }
    
    public N endMatchResources() {
      return and();
    }
    
  }
  public class ParamRefNested<N> extends V1ParamRefFluent<ParamRefNested<N>> implements Nested<N>{
  
    V1ParamRefBuilder builder;
  
    ParamRefNested(V1ParamRef item) {
      this.builder = new V1ParamRefBuilder(this, item);
    }
  
    public N and() {
      return (N) V1MutatingAdmissionPolicyBindingSpecFluent.this.withParamRef(builder.build());
    }
    
    public N endParamRef() {
      return and();
    }
    
  }
}