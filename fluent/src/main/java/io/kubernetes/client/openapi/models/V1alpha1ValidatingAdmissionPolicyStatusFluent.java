package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.lang.Deprecated;
import java.lang.Long;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1alpha1ValidatingAdmissionPolicyStatusFluent<A extends V1alpha1ValidatingAdmissionPolicyStatusFluent<A>> extends Fluent<A>{
  public A addToConditions(int index,V1Condition item);
  public A setToConditions(int index,V1Condition item);
  public A addToConditions(io.kubernetes.client.openapi.models.V1Condition... items);
  public A addAllToConditions(Collection<V1Condition> items);
  public A removeFromConditions(io.kubernetes.client.openapi.models.V1Condition... items);
  public A removeAllFromConditions(Collection<V1Condition> items);
  public A removeMatchingFromConditions(Predicate<V1ConditionBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildConditions instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1Condition> getConditions();
  public List<V1Condition> buildConditions();
  public V1Condition buildCondition(int index);
  public V1Condition buildFirstCondition();
  public V1Condition buildLastCondition();
  public V1Condition buildMatchingCondition(Predicate<V1ConditionBuilder> predicate);
  public Boolean hasMatchingCondition(Predicate<V1ConditionBuilder> predicate);
  public A withConditions(List<V1Condition> conditions);
  public A withConditions(io.kubernetes.client.openapi.models.V1Condition... conditions);
  public Boolean hasConditions();
  public V1alpha1ValidatingAdmissionPolicyStatusFluent.ConditionsNested<A> addNewCondition();
  public V1alpha1ValidatingAdmissionPolicyStatusFluent.ConditionsNested<A> addNewConditionLike(V1Condition item);
  public V1alpha1ValidatingAdmissionPolicyStatusFluent.ConditionsNested<A> setNewConditionLike(int index,V1Condition item);
  public V1alpha1ValidatingAdmissionPolicyStatusFluent.ConditionsNested<A> editCondition(int index);
  public V1alpha1ValidatingAdmissionPolicyStatusFluent.ConditionsNested<A> editFirstCondition();
  public V1alpha1ValidatingAdmissionPolicyStatusFluent.ConditionsNested<A> editLastCondition();
  public V1alpha1ValidatingAdmissionPolicyStatusFluent.ConditionsNested<A> editMatchingCondition(Predicate<V1ConditionBuilder> predicate);
  public Long getObservedGeneration();
  public A withObservedGeneration(Long observedGeneration);
  public Boolean hasObservedGeneration();
  
  /**
   * This method has been deprecated, please use method buildTypeChecking instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1alpha1TypeChecking getTypeChecking();
  public V1alpha1TypeChecking buildTypeChecking();
  public A withTypeChecking(V1alpha1TypeChecking typeChecking);
  public Boolean hasTypeChecking();
  public V1alpha1ValidatingAdmissionPolicyStatusFluent.TypeCheckingNested<A> withNewTypeChecking();
  public V1alpha1ValidatingAdmissionPolicyStatusFluent.TypeCheckingNested<A> withNewTypeCheckingLike(V1alpha1TypeChecking item);
  public V1alpha1ValidatingAdmissionPolicyStatusFluent.TypeCheckingNested<A> editTypeChecking();
  public V1alpha1ValidatingAdmissionPolicyStatusFluent.TypeCheckingNested<A> editOrNewTypeChecking();
  public V1alpha1ValidatingAdmissionPolicyStatusFluent.TypeCheckingNested<A> editOrNewTypeCheckingLike(V1alpha1TypeChecking item);
  public interface ConditionsNested<N> extends Nested<N>,V1ConditionFluent<V1alpha1ValidatingAdmissionPolicyStatusFluent.ConditionsNested<N>>{
    public N and();
    public N endCondition();
    
  }
  public interface TypeCheckingNested<N> extends Nested<N>,V1alpha1TypeCheckingFluent<V1alpha1ValidatingAdmissionPolicyStatusFluent.TypeCheckingNested<N>>{
    public N and();
    public N endTypeChecking();
    
  }
  
}