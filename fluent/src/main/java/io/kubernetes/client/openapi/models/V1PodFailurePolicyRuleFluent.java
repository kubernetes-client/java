package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1PodFailurePolicyRuleFluent<A extends V1PodFailurePolicyRuleFluent<A>> extends Fluent<A>{
  public String getAction();
  public A withAction(String action);
  public Boolean hasAction();
  
  /**
   * This method has been deprecated, please use method buildOnExitCodes instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1PodFailurePolicyOnExitCodesRequirement getOnExitCodes();
  public V1PodFailurePolicyOnExitCodesRequirement buildOnExitCodes();
  public A withOnExitCodes(V1PodFailurePolicyOnExitCodesRequirement onExitCodes);
  public Boolean hasOnExitCodes();
  public V1PodFailurePolicyRuleFluent.OnExitCodesNested<A> withNewOnExitCodes();
  public V1PodFailurePolicyRuleFluent.OnExitCodesNested<A> withNewOnExitCodesLike(V1PodFailurePolicyOnExitCodesRequirement item);
  public V1PodFailurePolicyRuleFluent.OnExitCodesNested<A> editOnExitCodes();
  public V1PodFailurePolicyRuleFluent.OnExitCodesNested<A> editOrNewOnExitCodes();
  public V1PodFailurePolicyRuleFluent.OnExitCodesNested<A> editOrNewOnExitCodesLike(V1PodFailurePolicyOnExitCodesRequirement item);
  public A addToOnPodConditions(Integer index,V1PodFailurePolicyOnPodConditionsPattern item);
  public A setToOnPodConditions(Integer index,V1PodFailurePolicyOnPodConditionsPattern item);
  public A addToOnPodConditions(io.kubernetes.client.openapi.models.V1PodFailurePolicyOnPodConditionsPattern... items);
  public A addAllToOnPodConditions(Collection<V1PodFailurePolicyOnPodConditionsPattern> items);
  public A removeFromOnPodConditions(io.kubernetes.client.openapi.models.V1PodFailurePolicyOnPodConditionsPattern... items);
  public A removeAllFromOnPodConditions(Collection<V1PodFailurePolicyOnPodConditionsPattern> items);
  public A removeMatchingFromOnPodConditions(Predicate<V1PodFailurePolicyOnPodConditionsPatternBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildOnPodConditions instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1PodFailurePolicyOnPodConditionsPattern> getOnPodConditions();
  public List<V1PodFailurePolicyOnPodConditionsPattern> buildOnPodConditions();
  public V1PodFailurePolicyOnPodConditionsPattern buildOnPodCondition(Integer index);
  public V1PodFailurePolicyOnPodConditionsPattern buildFirstOnPodCondition();
  public V1PodFailurePolicyOnPodConditionsPattern buildLastOnPodCondition();
  public V1PodFailurePolicyOnPodConditionsPattern buildMatchingOnPodCondition(Predicate<V1PodFailurePolicyOnPodConditionsPatternBuilder> predicate);
  public Boolean hasMatchingOnPodCondition(Predicate<V1PodFailurePolicyOnPodConditionsPatternBuilder> predicate);
  public A withOnPodConditions(List<V1PodFailurePolicyOnPodConditionsPattern> onPodConditions);
  public A withOnPodConditions(io.kubernetes.client.openapi.models.V1PodFailurePolicyOnPodConditionsPattern... onPodConditions);
  public Boolean hasOnPodConditions();
  public V1PodFailurePolicyRuleFluent.OnPodConditionsNested<A> addNewOnPodCondition();
  public V1PodFailurePolicyRuleFluent.OnPodConditionsNested<A> addNewOnPodConditionLike(V1PodFailurePolicyOnPodConditionsPattern item);
  public V1PodFailurePolicyRuleFluent.OnPodConditionsNested<A> setNewOnPodConditionLike(Integer index,V1PodFailurePolicyOnPodConditionsPattern item);
  public V1PodFailurePolicyRuleFluent.OnPodConditionsNested<A> editOnPodCondition(Integer index);
  public V1PodFailurePolicyRuleFluent.OnPodConditionsNested<A> editFirstOnPodCondition();
  public V1PodFailurePolicyRuleFluent.OnPodConditionsNested<A> editLastOnPodCondition();
  public V1PodFailurePolicyRuleFluent.OnPodConditionsNested<A> editMatchingOnPodCondition(Predicate<V1PodFailurePolicyOnPodConditionsPatternBuilder> predicate);
  public interface OnExitCodesNested<N> extends Nested<N>,V1PodFailurePolicyOnExitCodesRequirementFluent<V1PodFailurePolicyRuleFluent.OnExitCodesNested<N>>{
    public N and();
    public N endOnExitCodes();
    
  }
  public interface OnPodConditionsNested<N> extends Nested<N>,V1PodFailurePolicyOnPodConditionsPatternFluent<V1PodFailurePolicyRuleFluent.OnPodConditionsNested<N>>{
    public N and();
    public N endOnPodCondition();
    
  }
  
}