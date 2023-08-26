package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1alpha1ValidatingAdmissionPolicyBindingSpecFluent<A extends V1alpha1ValidatingAdmissionPolicyBindingSpecFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildMatchResources instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1alpha1MatchResources getMatchResources();
  public V1alpha1MatchResources buildMatchResources();
  public A withMatchResources(V1alpha1MatchResources matchResources);
  public Boolean hasMatchResources();
  public V1alpha1ValidatingAdmissionPolicyBindingSpecFluent.MatchResourcesNested<A> withNewMatchResources();
  public V1alpha1ValidatingAdmissionPolicyBindingSpecFluent.MatchResourcesNested<A> withNewMatchResourcesLike(V1alpha1MatchResources item);
  public V1alpha1ValidatingAdmissionPolicyBindingSpecFluent.MatchResourcesNested<A> editMatchResources();
  public V1alpha1ValidatingAdmissionPolicyBindingSpecFluent.MatchResourcesNested<A> editOrNewMatchResources();
  public V1alpha1ValidatingAdmissionPolicyBindingSpecFluent.MatchResourcesNested<A> editOrNewMatchResourcesLike(V1alpha1MatchResources item);
  
  /**
   * This method has been deprecated, please use method buildParamRef instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1alpha1ParamRef getParamRef();
  public V1alpha1ParamRef buildParamRef();
  public A withParamRef(V1alpha1ParamRef paramRef);
  public Boolean hasParamRef();
  public V1alpha1ValidatingAdmissionPolicyBindingSpecFluent.ParamRefNested<A> withNewParamRef();
  public V1alpha1ValidatingAdmissionPolicyBindingSpecFluent.ParamRefNested<A> withNewParamRefLike(V1alpha1ParamRef item);
  public V1alpha1ValidatingAdmissionPolicyBindingSpecFluent.ParamRefNested<A> editParamRef();
  public V1alpha1ValidatingAdmissionPolicyBindingSpecFluent.ParamRefNested<A> editOrNewParamRef();
  public V1alpha1ValidatingAdmissionPolicyBindingSpecFluent.ParamRefNested<A> editOrNewParamRefLike(V1alpha1ParamRef item);
  public String getPolicyName();
  public A withPolicyName(String policyName);
  public Boolean hasPolicyName();
  public A addToValidationActions(int index,String item);
  public A setToValidationActions(int index,String item);
  public A addToValidationActions(java.lang.String... items);
  public A addAllToValidationActions(Collection<String> items);
  public A removeFromValidationActions(java.lang.String... items);
  public A removeAllFromValidationActions(Collection<String> items);
  public List<String> getValidationActions();
  public String getValidationAction(int index);
  public String getFirstValidationAction();
  public String getLastValidationAction();
  public String getMatchingValidationAction(Predicate<String> predicate);
  public Boolean hasMatchingValidationAction(Predicate<String> predicate);
  public A withValidationActions(List<String> validationActions);
  public A withValidationActions(java.lang.String... validationActions);
  public Boolean hasValidationActions();
  public interface MatchResourcesNested<N> extends Nested<N>,V1alpha1MatchResourcesFluent<V1alpha1ValidatingAdmissionPolicyBindingSpecFluent.MatchResourcesNested<N>>{
    public N and();
    public N endMatchResources();
    
  }
  public interface ParamRefNested<N> extends Nested<N>,V1alpha1ParamRefFluent<V1alpha1ValidatingAdmissionPolicyBindingSpecFluent.ParamRefNested<N>>{
    public N and();
    public N endParamRef();
    
  }
  
}