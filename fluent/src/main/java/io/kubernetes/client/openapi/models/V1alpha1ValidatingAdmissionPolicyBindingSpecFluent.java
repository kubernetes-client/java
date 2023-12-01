package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1alpha1ValidatingAdmissionPolicyBindingSpecFluent<A extends V1alpha1ValidatingAdmissionPolicyBindingSpecFluent<A>> extends BaseFluent<A>{
  public V1alpha1ValidatingAdmissionPolicyBindingSpecFluent() {
  }
  
  public V1alpha1ValidatingAdmissionPolicyBindingSpecFluent(V1alpha1ValidatingAdmissionPolicyBindingSpec instance) {
    this.copyInstance(instance);
  }
  private V1alpha1MatchResourcesBuilder matchResources;
  private V1alpha1ParamRefBuilder paramRef;
  private String policyName;
  private List<String> validationActions;
  
  protected void copyInstance(V1alpha1ValidatingAdmissionPolicyBindingSpec instance) {
    instance = (instance != null ? instance : new V1alpha1ValidatingAdmissionPolicyBindingSpec());
    if (instance != null) {
          this.withMatchResources(instance.getMatchResources());
          this.withParamRef(instance.getParamRef());
          this.withPolicyName(instance.getPolicyName());
          this.withValidationActions(instance.getValidationActions());
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
  
  public A addToValidationActions(int index,String item) {
    if (this.validationActions == null) {this.validationActions = new ArrayList<String>();}
    this.validationActions.add(index, item);
    return (A)this;
  }
  
  public A setToValidationActions(int index,String item) {
    if (this.validationActions == null) {this.validationActions = new ArrayList<String>();}
    this.validationActions.set(index, item); return (A)this;
  }
  
  public A addToValidationActions(java.lang.String... items) {
    if (this.validationActions == null) {this.validationActions = new ArrayList<String>();}
    for (String item : items) {this.validationActions.add(item);} return (A)this;
  }
  
  public A addAllToValidationActions(Collection<String> items) {
    if (this.validationActions == null) {this.validationActions = new ArrayList<String>();}
    for (String item : items) {this.validationActions.add(item);} return (A)this;
  }
  
  public A removeFromValidationActions(java.lang.String... items) {
    if (this.validationActions == null) return (A)this;
    for (String item : items) { this.validationActions.remove(item);} return (A)this;
  }
  
  public A removeAllFromValidationActions(Collection<String> items) {
    if (this.validationActions == null) return (A)this;
    for (String item : items) { this.validationActions.remove(item);} return (A)this;
  }
  
  public List<String> getValidationActions() {
    return this.validationActions;
  }
  
  public String getValidationAction(int index) {
    return this.validationActions.get(index);
  }
  
  public String getFirstValidationAction() {
    return this.validationActions.get(0);
  }
  
  public String getLastValidationAction() {
    return this.validationActions.get(validationActions.size() - 1);
  }
  
  public String getMatchingValidationAction(Predicate<String> predicate) {
      for (String item : validationActions) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingValidationAction(Predicate<String> predicate) {
      for (String item : validationActions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withValidationActions(List<String> validationActions) {
    if (validationActions != null) {
        this.validationActions = new ArrayList();
        for (String item : validationActions) {
          this.addToValidationActions(item);
        }
    } else {
      this.validationActions = null;
    }
    return (A) this;
  }
  
  public A withValidationActions(java.lang.String... validationActions) {
    if (this.validationActions != null) {
        this.validationActions.clear();
        _visitables.remove("validationActions");
    }
    if (validationActions != null) {
      for (String item : validationActions) {
        this.addToValidationActions(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasValidationActions() {
    return this.validationActions != null && !this.validationActions.isEmpty();
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha1ValidatingAdmissionPolicyBindingSpecFluent that = (V1alpha1ValidatingAdmissionPolicyBindingSpecFluent) o;
    if (!java.util.Objects.equals(matchResources, that.matchResources)) return false;
    if (!java.util.Objects.equals(paramRef, that.paramRef)) return false;
    if (!java.util.Objects.equals(policyName, that.policyName)) return false;
    if (!java.util.Objects.equals(validationActions, that.validationActions)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(matchResources,  paramRef,  policyName,  validationActions,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (matchResources != null) { sb.append("matchResources:"); sb.append(matchResources + ","); }
    if (paramRef != null) { sb.append("paramRef:"); sb.append(paramRef + ","); }
    if (policyName != null) { sb.append("policyName:"); sb.append(policyName + ","); }
    if (validationActions != null && !validationActions.isEmpty()) { sb.append("validationActions:"); sb.append(validationActions); }
    sb.append("}");
    return sb.toString();
  }
  public class MatchResourcesNested<N> extends V1alpha1MatchResourcesFluent<MatchResourcesNested<N>> implements Nested<N>{
    MatchResourcesNested(V1alpha1MatchResources item) {
      this.builder = new V1alpha1MatchResourcesBuilder(this, item);
    }
    V1alpha1MatchResourcesBuilder builder;
    
    public N and() {
      return (N) V1alpha1ValidatingAdmissionPolicyBindingSpecFluent.this.withMatchResources(builder.build());
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
      return (N) V1alpha1ValidatingAdmissionPolicyBindingSpecFluent.this.withParamRef(builder.build());
    }
    
    public N endParamRef() {
      return and();
    }
    
  
  }

}