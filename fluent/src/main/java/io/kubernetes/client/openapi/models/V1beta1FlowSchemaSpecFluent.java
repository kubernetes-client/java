package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
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
public interface V1beta1FlowSchemaSpecFluent<A extends V1beta1FlowSchemaSpecFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildDistinguisherMethod instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1beta1FlowDistinguisherMethod getDistinguisherMethod();
  public V1beta1FlowDistinguisherMethod buildDistinguisherMethod();
  public A withDistinguisherMethod(V1beta1FlowDistinguisherMethod distinguisherMethod);
  public Boolean hasDistinguisherMethod();
  public V1beta1FlowSchemaSpecFluent.DistinguisherMethodNested<A> withNewDistinguisherMethod();
  public V1beta1FlowSchemaSpecFluent.DistinguisherMethodNested<A> withNewDistinguisherMethodLike(V1beta1FlowDistinguisherMethod item);
  public V1beta1FlowSchemaSpecFluent.DistinguisherMethodNested<A> editDistinguisherMethod();
  public V1beta1FlowSchemaSpecFluent.DistinguisherMethodNested<A> editOrNewDistinguisherMethod();
  public V1beta1FlowSchemaSpecFluent.DistinguisherMethodNested<A> editOrNewDistinguisherMethodLike(V1beta1FlowDistinguisherMethod item);
  public Integer getMatchingPrecedence();
  public A withMatchingPrecedence(Integer matchingPrecedence);
  public Boolean hasMatchingPrecedence();
  
  /**
   * This method has been deprecated, please use method buildPriorityLevelConfiguration instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1beta1PriorityLevelConfigurationReference getPriorityLevelConfiguration();
  public V1beta1PriorityLevelConfigurationReference buildPriorityLevelConfiguration();
  public A withPriorityLevelConfiguration(V1beta1PriorityLevelConfigurationReference priorityLevelConfiguration);
  public Boolean hasPriorityLevelConfiguration();
  public V1beta1FlowSchemaSpecFluent.PriorityLevelConfigurationNested<A> withNewPriorityLevelConfiguration();
  public V1beta1FlowSchemaSpecFluent.PriorityLevelConfigurationNested<A> withNewPriorityLevelConfigurationLike(V1beta1PriorityLevelConfigurationReference item);
  public V1beta1FlowSchemaSpecFluent.PriorityLevelConfigurationNested<A> editPriorityLevelConfiguration();
  public V1beta1FlowSchemaSpecFluent.PriorityLevelConfigurationNested<A> editOrNewPriorityLevelConfiguration();
  public V1beta1FlowSchemaSpecFluent.PriorityLevelConfigurationNested<A> editOrNewPriorityLevelConfigurationLike(V1beta1PriorityLevelConfigurationReference item);
  public A addToRules(Integer index,V1beta1PolicyRulesWithSubjects item);
  public A setToRules(Integer index,V1beta1PolicyRulesWithSubjects item);
  public A addToRules(io.kubernetes.client.openapi.models.V1beta1PolicyRulesWithSubjects... items);
  public A addAllToRules(Collection<V1beta1PolicyRulesWithSubjects> items);
  public A removeFromRules(io.kubernetes.client.openapi.models.V1beta1PolicyRulesWithSubjects... items);
  public A removeAllFromRules(Collection<V1beta1PolicyRulesWithSubjects> items);
  public A removeMatchingFromRules(Predicate<V1beta1PolicyRulesWithSubjectsBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildRules instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1beta1PolicyRulesWithSubjects> getRules();
  public List<V1beta1PolicyRulesWithSubjects> buildRules();
  public V1beta1PolicyRulesWithSubjects buildRule(Integer index);
  public V1beta1PolicyRulesWithSubjects buildFirstRule();
  public V1beta1PolicyRulesWithSubjects buildLastRule();
  public V1beta1PolicyRulesWithSubjects buildMatchingRule(Predicate<V1beta1PolicyRulesWithSubjectsBuilder> predicate);
  public Boolean hasMatchingRule(Predicate<V1beta1PolicyRulesWithSubjectsBuilder> predicate);
  public A withRules(List<V1beta1PolicyRulesWithSubjects> rules);
  public A withRules(io.kubernetes.client.openapi.models.V1beta1PolicyRulesWithSubjects... rules);
  public Boolean hasRules();
  public V1beta1FlowSchemaSpecFluent.RulesNested<A> addNewRule();
  public V1beta1FlowSchemaSpecFluent.RulesNested<A> addNewRuleLike(V1beta1PolicyRulesWithSubjects item);
  public V1beta1FlowSchemaSpecFluent.RulesNested<A> setNewRuleLike(Integer index,V1beta1PolicyRulesWithSubjects item);
  public V1beta1FlowSchemaSpecFluent.RulesNested<A> editRule(Integer index);
  public V1beta1FlowSchemaSpecFluent.RulesNested<A> editFirstRule();
  public V1beta1FlowSchemaSpecFluent.RulesNested<A> editLastRule();
  public V1beta1FlowSchemaSpecFluent.RulesNested<A> editMatchingRule(Predicate<V1beta1PolicyRulesWithSubjectsBuilder> predicate);
  public interface DistinguisherMethodNested<N> extends Nested<N>,V1beta1FlowDistinguisherMethodFluent<V1beta1FlowSchemaSpecFluent.DistinguisherMethodNested<N>>{
    public N and();
    public N endDistinguisherMethod();
    
  }
  public interface PriorityLevelConfigurationNested<N> extends Nested<N>,V1beta1PriorityLevelConfigurationReferenceFluent<V1beta1FlowSchemaSpecFluent.PriorityLevelConfigurationNested<N>>{
    public N and();
    public N endPriorityLevelConfiguration();
    
  }
  public interface RulesNested<N> extends Nested<N>,V1beta1PolicyRulesWithSubjectsFluent<V1beta1FlowSchemaSpecFluent.RulesNested<N>>{
    public N and();
    public N endRule();
    
  }
  
}