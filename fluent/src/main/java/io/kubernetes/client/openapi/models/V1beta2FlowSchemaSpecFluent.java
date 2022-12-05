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
public interface V1beta2FlowSchemaSpecFluent<A extends V1beta2FlowSchemaSpecFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildDistinguisherMethod instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1beta2FlowDistinguisherMethod getDistinguisherMethod();
  public V1beta2FlowDistinguisherMethod buildDistinguisherMethod();
  public A withDistinguisherMethod(V1beta2FlowDistinguisherMethod distinguisherMethod);
  public Boolean hasDistinguisherMethod();
  public V1beta2FlowSchemaSpecFluent.DistinguisherMethodNested<A> withNewDistinguisherMethod();
  public V1beta2FlowSchemaSpecFluent.DistinguisherMethodNested<A> withNewDistinguisherMethodLike(V1beta2FlowDistinguisherMethod item);
  public V1beta2FlowSchemaSpecFluent.DistinguisherMethodNested<A> editDistinguisherMethod();
  public V1beta2FlowSchemaSpecFluent.DistinguisherMethodNested<A> editOrNewDistinguisherMethod();
  public V1beta2FlowSchemaSpecFluent.DistinguisherMethodNested<A> editOrNewDistinguisherMethodLike(V1beta2FlowDistinguisherMethod item);
  public Integer getMatchingPrecedence();
  public A withMatchingPrecedence(Integer matchingPrecedence);
  public Boolean hasMatchingPrecedence();
  
  /**
   * This method has been deprecated, please use method buildPriorityLevelConfiguration instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1beta2PriorityLevelConfigurationReference getPriorityLevelConfiguration();
  public V1beta2PriorityLevelConfigurationReference buildPriorityLevelConfiguration();
  public A withPriorityLevelConfiguration(V1beta2PriorityLevelConfigurationReference priorityLevelConfiguration);
  public Boolean hasPriorityLevelConfiguration();
  public V1beta2FlowSchemaSpecFluent.PriorityLevelConfigurationNested<A> withNewPriorityLevelConfiguration();
  public V1beta2FlowSchemaSpecFluent.PriorityLevelConfigurationNested<A> withNewPriorityLevelConfigurationLike(V1beta2PriorityLevelConfigurationReference item);
  public V1beta2FlowSchemaSpecFluent.PriorityLevelConfigurationNested<A> editPriorityLevelConfiguration();
  public V1beta2FlowSchemaSpecFluent.PriorityLevelConfigurationNested<A> editOrNewPriorityLevelConfiguration();
  public V1beta2FlowSchemaSpecFluent.PriorityLevelConfigurationNested<A> editOrNewPriorityLevelConfigurationLike(V1beta2PriorityLevelConfigurationReference item);
  public A addToRules(Integer index,V1beta2PolicyRulesWithSubjects item);
  public A setToRules(Integer index,V1beta2PolicyRulesWithSubjects item);
  public A addToRules(io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjects... items);
  public A addAllToRules(Collection<V1beta2PolicyRulesWithSubjects> items);
  public A removeFromRules(io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjects... items);
  public A removeAllFromRules(Collection<V1beta2PolicyRulesWithSubjects> items);
  public A removeMatchingFromRules(Predicate<V1beta2PolicyRulesWithSubjectsBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildRules instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1beta2PolicyRulesWithSubjects> getRules();
  public List<V1beta2PolicyRulesWithSubjects> buildRules();
  public V1beta2PolicyRulesWithSubjects buildRule(Integer index);
  public V1beta2PolicyRulesWithSubjects buildFirstRule();
  public V1beta2PolicyRulesWithSubjects buildLastRule();
  public V1beta2PolicyRulesWithSubjects buildMatchingRule(Predicate<V1beta2PolicyRulesWithSubjectsBuilder> predicate);
  public Boolean hasMatchingRule(Predicate<V1beta2PolicyRulesWithSubjectsBuilder> predicate);
  public A withRules(List<V1beta2PolicyRulesWithSubjects> rules);
  public A withRules(io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjects... rules);
  public Boolean hasRules();
  public V1beta2FlowSchemaSpecFluent.RulesNested<A> addNewRule();
  public V1beta2FlowSchemaSpecFluent.RulesNested<A> addNewRuleLike(V1beta2PolicyRulesWithSubjects item);
  public V1beta2FlowSchemaSpecFluent.RulesNested<A> setNewRuleLike(Integer index,V1beta2PolicyRulesWithSubjects item);
  public V1beta2FlowSchemaSpecFluent.RulesNested<A> editRule(Integer index);
  public V1beta2FlowSchemaSpecFluent.RulesNested<A> editFirstRule();
  public V1beta2FlowSchemaSpecFluent.RulesNested<A> editLastRule();
  public V1beta2FlowSchemaSpecFluent.RulesNested<A> editMatchingRule(Predicate<V1beta2PolicyRulesWithSubjectsBuilder> predicate);
  public interface DistinguisherMethodNested<N> extends Nested<N>,V1beta2FlowDistinguisherMethodFluent<V1beta2FlowSchemaSpecFluent.DistinguisherMethodNested<N>>{
    public N and();
    public N endDistinguisherMethod();
    
  }
  public interface PriorityLevelConfigurationNested<N> extends Nested<N>,V1beta2PriorityLevelConfigurationReferenceFluent<V1beta2FlowSchemaSpecFluent.PriorityLevelConfigurationNested<N>>{
    public N and();
    public N endPriorityLevelConfiguration();
    
  }
  public interface RulesNested<N> extends Nested<N>,V1beta2PolicyRulesWithSubjectsFluent<V1beta2FlowSchemaSpecFluent.RulesNested<N>>{
    public N and();
    public N endRule();
    
  }
  
}