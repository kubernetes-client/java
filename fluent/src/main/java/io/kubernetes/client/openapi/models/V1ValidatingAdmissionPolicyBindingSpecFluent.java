package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ValidatingAdmissionPolicyBindingSpecFluent<A extends io.kubernetes.client.openapi.models.V1ValidatingAdmissionPolicyBindingSpecFluent<A>> extends BaseFluent<A>{

  private V1MatchResourcesBuilder matchResources;
  private V1ParamRefBuilder paramRef;
  private String policyName;
  private List<String> validationActions;

  public V1ValidatingAdmissionPolicyBindingSpecFluent() {
  }
  
  public V1ValidatingAdmissionPolicyBindingSpecFluent(V1ValidatingAdmissionPolicyBindingSpec instance) {
    this.copyInstance(instance);
  }

  public A addAllToValidationActions(Collection<String> items) {
    if (this.validationActions == null) {
      this.validationActions = new ArrayList();
    }
    for (String item : items) {
      this.validationActions.add(item);
    }
    return (A) this;
  }
  
  public A addToValidationActions(String... items) {
    if (this.validationActions == null) {
      this.validationActions = new ArrayList();
    }
    for (String item : items) {
      this.validationActions.add(item);
    }
    return (A) this;
  }
  
  public A addToValidationActions(int index,String item) {
    if (this.validationActions == null) {
      this.validationActions = new ArrayList();
    }
    this.validationActions.add(index, item);
    return (A) this;
  }
  
  public V1MatchResources buildMatchResources() {
    return this.matchResources != null ? this.matchResources.build() : null;
  }
  
  public V1ParamRef buildParamRef() {
    return this.paramRef != null ? this.paramRef.build() : null;
  }
  
  protected void copyInstance(V1ValidatingAdmissionPolicyBindingSpec instance) {
    instance = instance != null ? instance : new V1ValidatingAdmissionPolicyBindingSpec();
    if (instance != null) {
        this.withMatchResources(instance.getMatchResources());
        this.withParamRef(instance.getParamRef());
        this.withPolicyName(instance.getPolicyName());
        this.withValidationActions(instance.getValidationActions());
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
    V1ValidatingAdmissionPolicyBindingSpecFluent that = (V1ValidatingAdmissionPolicyBindingSpecFluent) o;
    if (!(Objects.equals(matchResources, that.matchResources))) {
      return false;
    }
    if (!(Objects.equals(paramRef, that.paramRef))) {
      return false;
    }
    if (!(Objects.equals(policyName, that.policyName))) {
      return false;
    }
    if (!(Objects.equals(validationActions, that.validationActions))) {
      return false;
    }
    return true;
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
  
  public String getPolicyName() {
    return this.policyName;
  }
  
  public String getValidationAction(int index) {
    return this.validationActions.get(index);
  }
  
  public List<String> getValidationActions() {
    return this.validationActions;
  }
  
  public boolean hasMatchResources() {
    return this.matchResources != null;
  }
  
  public boolean hasMatchingValidationAction(Predicate<String> predicate) {
      for (String item : validationActions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasParamRef() {
    return this.paramRef != null;
  }
  
  public boolean hasPolicyName() {
    return this.policyName != null;
  }
  
  public boolean hasValidationActions() {
    return this.validationActions != null && !(this.validationActions.isEmpty());
  }
  
  public int hashCode() {
    return Objects.hash(matchResources, paramRef, policyName, validationActions);
  }
  
  public A removeAllFromValidationActions(Collection<String> items) {
    if (this.validationActions == null) {
      return (A) this;
    }
    for (String item : items) {
      this.validationActions.remove(item);
    }
    return (A) this;
  }
  
  public A removeFromValidationActions(String... items) {
    if (this.validationActions == null) {
      return (A) this;
    }
    for (String item : items) {
      this.validationActions.remove(item);
    }
    return (A) this;
  }
  
  public A setToValidationActions(int index,String item) {
    if (this.validationActions == null) {
      this.validationActions = new ArrayList();
    }
    this.validationActions.set(index, item);
    return (A) this;
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
        sb.append(",");
    }
    if (!(validationActions == null) && !(validationActions.isEmpty())) {
        sb.append("validationActions:");
        sb.append(validationActions);
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
  
  public A withValidationActions(String... validationActions) {
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
  public class MatchResourcesNested<N> extends V1MatchResourcesFluent<MatchResourcesNested<N>> implements Nested<N>{
  
    V1MatchResourcesBuilder builder;
  
    MatchResourcesNested(V1MatchResources item) {
      this.builder = new V1MatchResourcesBuilder(this, item);
    }
  
    public N and() {
      return (N) V1ValidatingAdmissionPolicyBindingSpecFluent.this.withMatchResources(builder.build());
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
      return (N) V1ValidatingAdmissionPolicyBindingSpecFluent.this.withParamRef(builder.build());
    }
    
    public N endParamRef() {
      return and();
    }
    
  }
}