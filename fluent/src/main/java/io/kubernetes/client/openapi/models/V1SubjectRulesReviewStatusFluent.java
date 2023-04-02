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
public interface V1SubjectRulesReviewStatusFluent<A extends V1SubjectRulesReviewStatusFluent<A>> extends Fluent<A>{
  public String getEvaluationError();
  public A withEvaluationError(String evaluationError);
  public Boolean hasEvaluationError();
  public Boolean getIncomplete();
  public A withIncomplete(Boolean incomplete);
  public Boolean hasIncomplete();
  public A addToNonResourceRules(Integer index,V1NonResourceRule item);
  public A setToNonResourceRules(Integer index,V1NonResourceRule item);
  public A addToNonResourceRules(io.kubernetes.client.openapi.models.V1NonResourceRule... items);
  public A addAllToNonResourceRules(Collection<V1NonResourceRule> items);
  public A removeFromNonResourceRules(io.kubernetes.client.openapi.models.V1NonResourceRule... items);
  public A removeAllFromNonResourceRules(Collection<V1NonResourceRule> items);
  public A removeMatchingFromNonResourceRules(Predicate<V1NonResourceRuleBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildNonResourceRules instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1NonResourceRule> getNonResourceRules();
  public List<V1NonResourceRule> buildNonResourceRules();
  public V1NonResourceRule buildNonResourceRule(Integer index);
  public V1NonResourceRule buildFirstNonResourceRule();
  public V1NonResourceRule buildLastNonResourceRule();
  public V1NonResourceRule buildMatchingNonResourceRule(Predicate<V1NonResourceRuleBuilder> predicate);
  public Boolean hasMatchingNonResourceRule(Predicate<V1NonResourceRuleBuilder> predicate);
  public A withNonResourceRules(List<V1NonResourceRule> nonResourceRules);
  public A withNonResourceRules(io.kubernetes.client.openapi.models.V1NonResourceRule... nonResourceRules);
  public Boolean hasNonResourceRules();
  public V1SubjectRulesReviewStatusFluent.NonResourceRulesNested<A> addNewNonResourceRule();
  public V1SubjectRulesReviewStatusFluent.NonResourceRulesNested<A> addNewNonResourceRuleLike(V1NonResourceRule item);
  public V1SubjectRulesReviewStatusFluent.NonResourceRulesNested<A> setNewNonResourceRuleLike(Integer index,V1NonResourceRule item);
  public V1SubjectRulesReviewStatusFluent.NonResourceRulesNested<A> editNonResourceRule(Integer index);
  public V1SubjectRulesReviewStatusFluent.NonResourceRulesNested<A> editFirstNonResourceRule();
  public V1SubjectRulesReviewStatusFluent.NonResourceRulesNested<A> editLastNonResourceRule();
  public V1SubjectRulesReviewStatusFluent.NonResourceRulesNested<A> editMatchingNonResourceRule(Predicate<V1NonResourceRuleBuilder> predicate);
  public A addToResourceRules(Integer index,V1ResourceRule item);
  public A setToResourceRules(Integer index,V1ResourceRule item);
  public A addToResourceRules(io.kubernetes.client.openapi.models.V1ResourceRule... items);
  public A addAllToResourceRules(Collection<V1ResourceRule> items);
  public A removeFromResourceRules(io.kubernetes.client.openapi.models.V1ResourceRule... items);
  public A removeAllFromResourceRules(Collection<V1ResourceRule> items);
  public A removeMatchingFromResourceRules(Predicate<V1ResourceRuleBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildResourceRules instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1ResourceRule> getResourceRules();
  public List<V1ResourceRule> buildResourceRules();
  public V1ResourceRule buildResourceRule(Integer index);
  public V1ResourceRule buildFirstResourceRule();
  public V1ResourceRule buildLastResourceRule();
  public V1ResourceRule buildMatchingResourceRule(Predicate<V1ResourceRuleBuilder> predicate);
  public Boolean hasMatchingResourceRule(Predicate<V1ResourceRuleBuilder> predicate);
  public A withResourceRules(List<V1ResourceRule> resourceRules);
  public A withResourceRules(io.kubernetes.client.openapi.models.V1ResourceRule... resourceRules);
  public Boolean hasResourceRules();
  public V1SubjectRulesReviewStatusFluent.ResourceRulesNested<A> addNewResourceRule();
  public V1SubjectRulesReviewStatusFluent.ResourceRulesNested<A> addNewResourceRuleLike(V1ResourceRule item);
  public V1SubjectRulesReviewStatusFluent.ResourceRulesNested<A> setNewResourceRuleLike(Integer index,V1ResourceRule item);
  public V1SubjectRulesReviewStatusFluent.ResourceRulesNested<A> editResourceRule(Integer index);
  public V1SubjectRulesReviewStatusFluent.ResourceRulesNested<A> editFirstResourceRule();
  public V1SubjectRulesReviewStatusFluent.ResourceRulesNested<A> editLastResourceRule();
  public V1SubjectRulesReviewStatusFluent.ResourceRulesNested<A> editMatchingResourceRule(Predicate<V1ResourceRuleBuilder> predicate);
  public A withIncomplete();
  public interface NonResourceRulesNested<N> extends Nested<N>,V1NonResourceRuleFluent<V1SubjectRulesReviewStatusFluent.NonResourceRulesNested<N>>{
    public N and();
    public N endNonResourceRule();
    
  }
  public interface ResourceRulesNested<N> extends Nested<N>,V1ResourceRuleFluent<V1SubjectRulesReviewStatusFluent.ResourceRulesNested<N>>{
    public N and();
    public N endResourceRule();
    
  }
  
}