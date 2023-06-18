package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1alpha1ValidatingAdmissionPolicyBindingSpecFluentImpl<A extends V1alpha1ValidatingAdmissionPolicyBindingSpecFluent<A>> extends BaseFluent<A> implements V1alpha1ValidatingAdmissionPolicyBindingSpecFluent<A>{
  public V1alpha1ValidatingAdmissionPolicyBindingSpecFluentImpl() {
  }
  public V1alpha1ValidatingAdmissionPolicyBindingSpecFluentImpl(V1alpha1ValidatingAdmissionPolicyBindingSpec instance) {
    if (instance != null) {
      this.withMatchResources(instance.getMatchResources());
      this.withParamRef(instance.getParamRef());
      this.withPolicyName(instance.getPolicyName());
      this.withValidationActions(instance.getValidationActions());
    }
  }
  private V1alpha1MatchResourcesBuilder matchResources;
  private V1alpha1ParamRefBuilder paramRef;
  private String policyName;
  private List<String> validationActions;
  
  /**
   * This method has been deprecated, please use method buildMatchResources instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1alpha1MatchResources getMatchResources() {
    return this.matchResources!=null ?this.matchResources.build():null;
  }
  public V1alpha1MatchResources buildMatchResources() {
    return this.matchResources!=null ?this.matchResources.build():null;
  }
  public A withMatchResources(V1alpha1MatchResources matchResources) {
    _visitables.get("matchResources").remove(this.matchResources);
    if (matchResources!=null){ this.matchResources= new V1alpha1MatchResourcesBuilder(matchResources); _visitables.get("matchResources").add(this.matchResources);} else { this.matchResources = null; _visitables.get("matchResources").remove(this.matchResources); } return (A) this;
  }
  public Boolean hasMatchResources() {
    return this.matchResources != null;
  }
  public V1alpha1ValidatingAdmissionPolicyBindingSpecFluentImpl.MatchResourcesNested<A> withNewMatchResources() {
    return new V1alpha1ValidatingAdmissionPolicyBindingSpecFluentImpl.MatchResourcesNestedImpl();
  }
  public V1alpha1ValidatingAdmissionPolicyBindingSpecFluentImpl.MatchResourcesNested<A> withNewMatchResourcesLike(V1alpha1MatchResources item) {
    return new V1alpha1ValidatingAdmissionPolicyBindingSpecFluentImpl.MatchResourcesNestedImpl(item);
  }
  public V1alpha1ValidatingAdmissionPolicyBindingSpecFluentImpl.MatchResourcesNested<A> editMatchResources() {
    return withNewMatchResourcesLike(getMatchResources());
  }
  public V1alpha1ValidatingAdmissionPolicyBindingSpecFluentImpl.MatchResourcesNested<A> editOrNewMatchResources() {
    return withNewMatchResourcesLike(getMatchResources() != null ? getMatchResources(): new V1alpha1MatchResourcesBuilder().build());
  }
  public V1alpha1ValidatingAdmissionPolicyBindingSpecFluentImpl.MatchResourcesNested<A> editOrNewMatchResourcesLike(V1alpha1MatchResources item) {
    return withNewMatchResourcesLike(getMatchResources() != null ? getMatchResources(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildParamRef instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1alpha1ParamRef getParamRef() {
    return this.paramRef!=null ?this.paramRef.build():null;
  }
  public V1alpha1ParamRef buildParamRef() {
    return this.paramRef!=null ?this.paramRef.build():null;
  }
  public A withParamRef(V1alpha1ParamRef paramRef) {
    _visitables.get("paramRef").remove(this.paramRef);
    if (paramRef!=null){ this.paramRef= new V1alpha1ParamRefBuilder(paramRef); _visitables.get("paramRef").add(this.paramRef);} else { this.paramRef = null; _visitables.get("paramRef").remove(this.paramRef); } return (A) this;
  }
  public Boolean hasParamRef() {
    return this.paramRef != null;
  }
  public V1alpha1ValidatingAdmissionPolicyBindingSpecFluentImpl.ParamRefNested<A> withNewParamRef() {
    return new V1alpha1ValidatingAdmissionPolicyBindingSpecFluentImpl.ParamRefNestedImpl();
  }
  public V1alpha1ValidatingAdmissionPolicyBindingSpecFluentImpl.ParamRefNested<A> withNewParamRefLike(V1alpha1ParamRef item) {
    return new V1alpha1ValidatingAdmissionPolicyBindingSpecFluentImpl.ParamRefNestedImpl(item);
  }
  public V1alpha1ValidatingAdmissionPolicyBindingSpecFluentImpl.ParamRefNested<A> editParamRef() {
    return withNewParamRefLike(getParamRef());
  }
  public V1alpha1ValidatingAdmissionPolicyBindingSpecFluentImpl.ParamRefNested<A> editOrNewParamRef() {
    return withNewParamRefLike(getParamRef() != null ? getParamRef(): new V1alpha1ParamRefBuilder().build());
  }
  public V1alpha1ValidatingAdmissionPolicyBindingSpecFluentImpl.ParamRefNested<A> editOrNewParamRefLike(V1alpha1ParamRef item) {
    return withNewParamRefLike(getParamRef() != null ? getParamRef(): item);
  }
  public String getPolicyName() {
    return this.policyName;
  }
  public A withPolicyName(String policyName) {
    this.policyName=policyName; return (A) this;
  }
  public Boolean hasPolicyName() {
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
    for (String item : items) {if (this.validationActions!= null){ this.validationActions.remove(item);}} return (A)this;
  }
  public A removeAllFromValidationActions(Collection<String> items) {
    for (String item : items) {if (this.validationActions!= null){ this.validationActions.remove(item);}} return (A)this;
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
    for (String item: validationActions) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingValidationAction(Predicate<String> predicate) {
    for (String item: validationActions) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withValidationActions(List<String> validationActions) {
    if (validationActions != null) {this.validationActions = new ArrayList(); for (String item : validationActions){this.addToValidationActions(item);}} else { this.validationActions = null;} return (A) this;
  }
  public A withValidationActions(java.lang.String... validationActions) {
    if (this.validationActions != null) {this.validationActions.clear(); _visitables.remove("validationActions"); }
    if (validationActions != null) {for (String item :validationActions){ this.addToValidationActions(item);}} return (A) this;
  }
  public Boolean hasValidationActions() {
    return validationActions != null && !validationActions.isEmpty();
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha1ValidatingAdmissionPolicyBindingSpecFluentImpl that = (V1alpha1ValidatingAdmissionPolicyBindingSpecFluentImpl) o;
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
  class MatchResourcesNestedImpl<N> extends V1alpha1MatchResourcesFluentImpl<V1alpha1ValidatingAdmissionPolicyBindingSpecFluentImpl.MatchResourcesNested<N>> implements V1alpha1ValidatingAdmissionPolicyBindingSpecFluentImpl.MatchResourcesNested<N>,Nested<N>{
    MatchResourcesNestedImpl(V1alpha1MatchResources item) {
      this.builder = new V1alpha1MatchResourcesBuilder(this, item);
    }
    MatchResourcesNestedImpl() {
      this.builder = new V1alpha1MatchResourcesBuilder(this);
    }
    V1alpha1MatchResourcesBuilder builder;
    public N and() {
      return (N) V1alpha1ValidatingAdmissionPolicyBindingSpecFluentImpl.this.withMatchResources(builder.build());
    }
    public N endMatchResources() {
      return and();
    }
    
  }
  class ParamRefNestedImpl<N> extends V1alpha1ParamRefFluentImpl<V1alpha1ValidatingAdmissionPolicyBindingSpecFluentImpl.ParamRefNested<N>> implements V1alpha1ValidatingAdmissionPolicyBindingSpecFluentImpl.ParamRefNested<N>,Nested<N>{
    ParamRefNestedImpl(V1alpha1ParamRef item) {
      this.builder = new V1alpha1ParamRefBuilder(this, item);
    }
    ParamRefNestedImpl() {
      this.builder = new V1alpha1ParamRefBuilder(this);
    }
    V1alpha1ParamRefBuilder builder;
    public N and() {
      return (N) V1alpha1ValidatingAdmissionPolicyBindingSpecFluentImpl.this.withParamRef(builder.build());
    }
    public N endParamRef() {
      return and();
    }
    
  }
  
}