package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import com.google.gson.annotations.SerializedName;
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
public interface V1beta3FlowSchemaSpecFluent<A extends V1beta3FlowSchemaSpecFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildDistinguisherMethod instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1beta3FlowDistinguisherMethod getDistinguisherMethod();
  public V1beta3FlowDistinguisherMethod buildDistinguisherMethod();
  public A withDistinguisherMethod(V1beta3FlowDistinguisherMethod distinguisherMethod);
  public Boolean hasDistinguisherMethod();
  public V1beta3FlowSchemaSpecFluent.DistinguisherMethodNested<A> withNewDistinguisherMethod();
  public V1beta3FlowSchemaSpecFluent.DistinguisherMethodNested<A> withNewDistinguisherMethodLike(V1beta3FlowDistinguisherMethod item);
  public V1beta3FlowSchemaSpecFluent.DistinguisherMethodNested<A> editDistinguisherMethod();
  public V1beta3FlowSchemaSpecFluent.DistinguisherMethodNested<A> editOrNewDistinguisherMethod();
  public V1beta3FlowSchemaSpecFluent.DistinguisherMethodNested<A> editOrNewDistinguisherMethodLike(V1beta3FlowDistinguisherMethod item);
  public Integer getMatchingPrecedence();
  public A withMatchingPrecedence(Integer matchingPrecedence);
  public Boolean hasMatchingPrecedence();
  
  /**
   * This method has been deprecated, please use method buildPriorityLevelConfiguration instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1beta3PriorityLevelConfigurationReference getPriorityLevelConfiguration();
  public V1beta3PriorityLevelConfigurationReference buildPriorityLevelConfiguration();
  public A withPriorityLevelConfiguration(V1beta3PriorityLevelConfigurationReference priorityLevelConfiguration);
  public Boolean hasPriorityLevelConfiguration();
  public V1beta3FlowSchemaSpecFluent.PriorityLevelConfigurationNested<A> withNewPriorityLevelConfiguration();
  public V1beta3FlowSchemaSpecFluent.PriorityLevelConfigurationNested<A> withNewPriorityLevelConfigurationLike(V1beta3PriorityLevelConfigurationReference item);
  public V1beta3FlowSchemaSpecFluent.PriorityLevelConfigurationNested<A> editPriorityLevelConfiguration();
  public V1beta3FlowSchemaSpecFluent.PriorityLevelConfigurationNested<A> editOrNewPriorityLevelConfiguration();
  public V1beta3FlowSchemaSpecFluent.PriorityLevelConfigurationNested<A> editOrNewPriorityLevelConfigurationLike(V1beta3PriorityLevelConfigurationReference item);
  public A addToRules(int index,V1beta3PolicyRulesWithSubjects item);
  public A setToRules(int index,V1beta3PolicyRulesWithSubjects item);
  public A addToRules(io.kubernetes.client.openapi.models.V1beta3PolicyRulesWithSubjects... items);
  public A addAllToRules(Collection<V1beta3PolicyRulesWithSubjects> items);
  public A removeFromRules(io.kubernetes.client.openapi.models.V1beta3PolicyRulesWithSubjects... items);
  public A removeAllFromRules(Collection<V1beta3PolicyRulesWithSubjects> items);
  public A removeMatchingFromRules(Predicate<V1beta3PolicyRulesWithSubjectsBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildRules instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1beta3PolicyRulesWithSubjects> getRules();
  public List<V1beta3PolicyRulesWithSubjects> buildRules();
  public V1beta3PolicyRulesWithSubjects buildRule(int index);
  public V1beta3PolicyRulesWithSubjects buildFirstRule();
  public V1beta3PolicyRulesWithSubjects buildLastRule();
  public V1beta3PolicyRulesWithSubjects buildMatchingRule(Predicate<V1beta3PolicyRulesWithSubjectsBuilder> predicate);
  public Boolean hasMatchingRule(Predicate<V1beta3PolicyRulesWithSubjectsBuilder> predicate);
  public A withRules(List<V1beta3PolicyRulesWithSubjects> rules);
  public A withRules(io.kubernetes.client.openapi.models.V1beta3PolicyRulesWithSubjects... rules);
  public Boolean hasRules();
  public V1beta3FlowSchemaSpecFluent.RulesNested<A> addNewRule();
  public V1beta3FlowSchemaSpecFluent.RulesNested<A> addNewRuleLike(V1beta3PolicyRulesWithSubjects item);
  public V1beta3FlowSchemaSpecFluent.RulesNested<A> setNewRuleLike(int index,V1beta3PolicyRulesWithSubjects item);
  public V1beta3FlowSchemaSpecFluent.RulesNested<A> editRule(int index);
  public V1beta3FlowSchemaSpecFluent.RulesNested<A> editFirstRule();
  public V1beta3FlowSchemaSpecFluent.RulesNested<A> editLastRule();
  public V1beta3FlowSchemaSpecFluent.RulesNested<A> editMatchingRule(Predicate<V1beta3PolicyRulesWithSubjectsBuilder> predicate);
  public interface DistinguisherMethodNested<N> extends Nested<N>,V1beta3FlowDistinguisherMethodFluent<V1beta3FlowSchemaSpecFluent.DistinguisherMethodNested<N>>{
    public N and();
    public N endDistinguisherMethod();
    
  }
  public interface PriorityLevelConfigurationNested<N> extends Nested<N>,V1beta3PriorityLevelConfigurationReferenceFluent<V1beta3FlowSchemaSpecFluent.PriorityLevelConfigurationNested<N>>{
    public N and();
    public N endPriorityLevelConfiguration();
    
  }
  public interface RulesNested<N> extends Nested<N>,V1beta3PolicyRulesWithSubjectsFluent<V1beta3FlowSchemaSpecFluent.RulesNested<N>>{
    public N and();
    public N endRule();
    
  }
  
}