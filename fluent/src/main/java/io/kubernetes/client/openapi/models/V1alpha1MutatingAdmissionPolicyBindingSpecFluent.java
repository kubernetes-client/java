package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1alpha1MutatingAdmissionPolicyBindingSpecFluent<A extends V1alpha1MutatingAdmissionPolicyBindingSpecFluent<A>> extends BaseFluent<A>{
  public V1alpha1MutatingAdmissionPolicyBindingSpecFluent() {
  }
  
  public V1alpha1MutatingAdmissionPolicyBindingSpecFluent(V1alpha1MutatingAdmissionPolicyBindingSpec instance) {
    this.copyInstance(instance);
  }
  private V1alpha1MatchResourcesBuilder matchResources;
  private V1alpha1ParamRefBuilder paramRef;
  private String policyName;
  
  protected void copyInstance(V1alpha1MutatingAdmissionPolicyBindingSpec instance) {
    instance = (instance != null ? instance : new V1alpha1MutatingAdmissionPolicyBindingSpec());
    if (instance != null) {
          this.withMatchResources(instance.getMatchResources());
          this.withParamRef(instance.getParamRef());
          this.withPolicyName(instance.getPolicyName());
        }
  }
  
  public V1alpha1MatchResources buildMatchResources() {
    return this.matchResources != null ? this.matchResources.build() : null;
  }
  
  public A withMatchResources(V1alpha1MatchResources matchResources) {
    this._visitables.remove("matchResources");
    if (matchResources != null) {
        this.matchResources = new V1alpha1MatchResourcesBuilder(matchResources);
        this._visitables.get("matchResources").add(this.matchResources);
    } else {
        this.matchResources = null;
        this._visitables.get("matchResources").remove(this.matchResources);
    }
    return (A) this;
  }
  
  public boolean hasMatchResources() {
    return this.matchResources != null;
  }
  
  public MatchResourcesNested<A> withNewMatchResources() {
    return new MatchResourcesNested(null);
  }
  
  public MatchResourcesNested<A> withNewMatchResourcesLike(V1alpha1MatchResources item) {
    return new MatchResourcesNested(item);
  }
  
  public MatchResourcesNested<A> editMatchResources() {
    return withNewMatchResourcesLike(java.util.Optional.ofNullable(buildMatchResources()).orElse(null));
  }
  
  public MatchResourcesNested<A> editOrNewMatchResources() {
    return withNewMatchResourcesLike(java.util.Optional.ofNullable(buildMatchResources()).orElse(new V1alpha1MatchResourcesBuilder().build()));
  }
  
  public MatchResourcesNested<A> editOrNewMatchResourcesLike(V1alpha1MatchResources item) {
    return withNewMatchResourcesLike(java.util.Optional.ofNullable(buildMatchResources()).orElse(item));
  }
  
  public V1alpha1ParamRef buildParamRef() {
    return this.paramRef != null ? this.paramRef.build() : null;
  }
  
  public A withParamRef(V1alpha1ParamRef paramRef) {
    this._visitables.remove("paramRef");
    if (paramRef != null) {
        this.paramRef = new V1alpha1ParamRefBuilder(paramRef);
        this._visitables.get("paramRef").add(this.paramRef);
    } else {
        this.paramRef = null;
        this._visitables.get("paramRef").remove(this.paramRef);
    }
    return (A) this;
  }
  
  public boolean hasParamRef() {
    return this.paramRef != null;
  }
  
  public ParamRefNested<A> withNewParamRef() {
    return new ParamRefNested(null);
  }
  
  public ParamRefNested<A> withNewParamRefLike(V1alpha1ParamRef item) {
    return new ParamRefNested(item);
  }
  
  public ParamRefNested<A> editParamRef() {
    return withNewParamRefLike(java.util.Optional.ofNullable(buildParamRef()).orElse(null));
  }
  
  public ParamRefNested<A> editOrNewParamRef() {
    return withNewParamRefLike(java.util.Optional.ofNullable(buildParamRef()).orElse(new V1alpha1ParamRefBuilder().build()));
  }
  
  public ParamRefNested<A> editOrNewParamRefLike(V1alpha1ParamRef item) {
    return withNewParamRefLike(java.util.Optional.ofNullable(buildParamRef()).orElse(item));
  }
  
  public String getPolicyName() {
    return this.policyName;
  }
  
  public A withPolicyName(String policyName) {
    this.policyName = policyName;
    return (A) this;
  }
  
  public boolean hasPolicyName() {
    return this.policyName != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha1MutatingAdmissionPolicyBindingSpecFluent that = (V1alpha1MutatingAdmissionPolicyBindingSpecFluent) o;
    if (!java.util.Objects.equals(matchResources, that.matchResources)) return false;
    if (!java.util.Objects.equals(paramRef, that.paramRef)) return false;
    if (!java.util.Objects.equals(policyName, that.policyName)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(matchResources,  paramRef,  policyName,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (matchResources != null) { sb.append("matchResources:"); sb.append(matchResources + ","); }
    if (paramRef != null) { sb.append("paramRef:"); sb.append(paramRef + ","); }
    if (policyName != null) { sb.append("policyName:"); sb.append(policyName); }
    sb.append("}");
    return sb.toString();
  }
  public class MatchResourcesNested<N> extends V1alpha1MatchResourcesFluent<MatchResourcesNested<N>> implements Nested<N>{
    MatchResourcesNested(V1alpha1MatchResources item) {
      this.builder = new V1alpha1MatchResourcesBuilder(this, item);
    }
    V1alpha1MatchResourcesBuilder builder;
    
    public N and() {
      return (N) V1alpha1MutatingAdmissionPolicyBindingSpecFluent.this.withMatchResources(builder.build());
    }
    
    public N endMatchResources() {
      return and();
    }
    
  
  }
  public class ParamRefNested<N> extends V1alpha1ParamRefFluent<ParamRefNested<N>> implements Nested<N>{
    ParamRefNested(V1alpha1ParamRef item) {
      this.builder = new V1alpha1ParamRefBuilder(this, item);
    }
    V1alpha1ParamRefBuilder builder;
    
    public N and() {
      return (N) V1alpha1MutatingAdmissionPolicyBindingSpecFluent.this.withParamRef(builder.build());
    }
    
    public N endParamRef() {
      return and();
    }
    
  
  }

}