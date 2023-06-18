package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1beta3PolicyRulesWithSubjectsFluent<A extends V1beta3PolicyRulesWithSubjectsFluent<A>> extends Fluent<A>{
  public A addToNonResourceRules(int index,V1beta3NonResourcePolicyRule item);
  public A setToNonResourceRules(int index,V1beta3NonResourcePolicyRule item);
  public A addToNonResourceRules(io.kubernetes.client.openapi.models.V1beta3NonResourcePolicyRule... items);
  public A addAllToNonResourceRules(Collection<V1beta3NonResourcePolicyRule> items);
  public A removeFromNonResourceRules(io.kubernetes.client.openapi.models.V1beta3NonResourcePolicyRule... items);
  public A removeAllFromNonResourceRules(Collection<V1beta3NonResourcePolicyRule> items);
  public A removeMatchingFromNonResourceRules(Predicate<V1beta3NonResourcePolicyRuleBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildNonResourceRules instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1beta3NonResourcePolicyRule> getNonResourceRules();
  public List<V1beta3NonResourcePolicyRule> buildNonResourceRules();
  public V1beta3NonResourcePolicyRule buildNonResourceRule(int index);
  public V1beta3NonResourcePolicyRule buildFirstNonResourceRule();
  public V1beta3NonResourcePolicyRule buildLastNonResourceRule();
  public V1beta3NonResourcePolicyRule buildMatchingNonResourceRule(Predicate<V1beta3NonResourcePolicyRuleBuilder> predicate);
  public Boolean hasMatchingNonResourceRule(Predicate<V1beta3NonResourcePolicyRuleBuilder> predicate);
  public A withNonResourceRules(List<V1beta3NonResourcePolicyRule> nonResourceRules);
  public A withNonResourceRules(io.kubernetes.client.openapi.models.V1beta3NonResourcePolicyRule... nonResourceRules);
  public Boolean hasNonResourceRules();
  public V1beta3PolicyRulesWithSubjectsFluent.NonResourceRulesNested<A> addNewNonResourceRule();
  public V1beta3PolicyRulesWithSubjectsFluent.NonResourceRulesNested<A> addNewNonResourceRuleLike(V1beta3NonResourcePolicyRule item);
  public V1beta3PolicyRulesWithSubjectsFluent.NonResourceRulesNested<A> setNewNonResourceRuleLike(int index,V1beta3NonResourcePolicyRule item);
  public V1beta3PolicyRulesWithSubjectsFluent.NonResourceRulesNested<A> editNonResourceRule(int index);
  public V1beta3PolicyRulesWithSubjectsFluent.NonResourceRulesNested<A> editFirstNonResourceRule();
  public V1beta3PolicyRulesWithSubjectsFluent.NonResourceRulesNested<A> editLastNonResourceRule();
  public V1beta3PolicyRulesWithSubjectsFluent.NonResourceRulesNested<A> editMatchingNonResourceRule(Predicate<V1beta3NonResourcePolicyRuleBuilder> predicate);
  public A addToResourceRules(int index,V1beta3ResourcePolicyRule item);
  public A setToResourceRules(int index,V1beta3ResourcePolicyRule item);
  public A addToResourceRules(io.kubernetes.client.openapi.models.V1beta3ResourcePolicyRule... items);
  public A addAllToResourceRules(Collection<V1beta3ResourcePolicyRule> items);
  public A removeFromResourceRules(io.kubernetes.client.openapi.models.V1beta3ResourcePolicyRule... items);
  public A removeAllFromResourceRules(Collection<V1beta3ResourcePolicyRule> items);
  public A removeMatchingFromResourceRules(Predicate<V1beta3ResourcePolicyRuleBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildResourceRules instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1beta3ResourcePolicyRule> getResourceRules();
  public List<V1beta3ResourcePolicyRule> buildResourceRules();
  public V1beta3ResourcePolicyRule buildResourceRule(int index);
  public V1beta3ResourcePolicyRule buildFirstResourceRule();
  public V1beta3ResourcePolicyRule buildLastResourceRule();
  public V1beta3ResourcePolicyRule buildMatchingResourceRule(Predicate<V1beta3ResourcePolicyRuleBuilder> predicate);
  public Boolean hasMatchingResourceRule(Predicate<V1beta3ResourcePolicyRuleBuilder> predicate);
  public A withResourceRules(List<V1beta3ResourcePolicyRule> resourceRules);
  public A withResourceRules(io.kubernetes.client.openapi.models.V1beta3ResourcePolicyRule... resourceRules);
  public Boolean hasResourceRules();
  public V1beta3PolicyRulesWithSubjectsFluent.ResourceRulesNested<A> addNewResourceRule();
  public V1beta3PolicyRulesWithSubjectsFluent.ResourceRulesNested<A> addNewResourceRuleLike(V1beta3ResourcePolicyRule item);
  public V1beta3PolicyRulesWithSubjectsFluent.ResourceRulesNested<A> setNewResourceRuleLike(int index,V1beta3ResourcePolicyRule item);
  public V1beta3PolicyRulesWithSubjectsFluent.ResourceRulesNested<A> editResourceRule(int index);
  public V1beta3PolicyRulesWithSubjectsFluent.ResourceRulesNested<A> editFirstResourceRule();
  public V1beta3PolicyRulesWithSubjectsFluent.ResourceRulesNested<A> editLastResourceRule();
  public V1beta3PolicyRulesWithSubjectsFluent.ResourceRulesNested<A> editMatchingResourceRule(Predicate<V1beta3ResourcePolicyRuleBuilder> predicate);
  public A addToSubjects(int index,V1beta3Subject item);
  public A setToSubjects(int index,V1beta3Subject item);
  public A addToSubjects(io.kubernetes.client.openapi.models.V1beta3Subject... items);
  public A addAllToSubjects(Collection<V1beta3Subject> items);
  public A removeFromSubjects(io.kubernetes.client.openapi.models.V1beta3Subject... items);
  public A removeAllFromSubjects(Collection<V1beta3Subject> items);
  public A removeMatchingFromSubjects(Predicate<V1beta3SubjectBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildSubjects instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1beta3Subject> getSubjects();
  public List<V1beta3Subject> buildSubjects();
  public V1beta3Subject buildSubject(int index);
  public V1beta3Subject buildFirstSubject();
  public V1beta3Subject buildLastSubject();
  public V1beta3Subject buildMatchingSubject(Predicate<V1beta3SubjectBuilder> predicate);
  public Boolean hasMatchingSubject(Predicate<V1beta3SubjectBuilder> predicate);
  public A withSubjects(List<V1beta3Subject> subjects);
  public A withSubjects(io.kubernetes.client.openapi.models.V1beta3Subject... subjects);
  public Boolean hasSubjects();
  public V1beta3PolicyRulesWithSubjectsFluent.SubjectsNested<A> addNewSubject();
  public V1beta3PolicyRulesWithSubjectsFluent.SubjectsNested<A> addNewSubjectLike(V1beta3Subject item);
  public V1beta3PolicyRulesWithSubjectsFluent.SubjectsNested<A> setNewSubjectLike(int index,V1beta3Subject item);
  public V1beta3PolicyRulesWithSubjectsFluent.SubjectsNested<A> editSubject(int index);
  public V1beta3PolicyRulesWithSubjectsFluent.SubjectsNested<A> editFirstSubject();
  public V1beta3PolicyRulesWithSubjectsFluent.SubjectsNested<A> editLastSubject();
  public V1beta3PolicyRulesWithSubjectsFluent.SubjectsNested<A> editMatchingSubject(Predicate<V1beta3SubjectBuilder> predicate);
  public interface NonResourceRulesNested<N> extends Nested<N>,V1beta3NonResourcePolicyRuleFluent<V1beta3PolicyRulesWithSubjectsFluent.NonResourceRulesNested<N>>{
    public N and();
    public N endNonResourceRule();
    
  }
  public interface ResourceRulesNested<N> extends Nested<N>,V1beta3ResourcePolicyRuleFluent<V1beta3PolicyRulesWithSubjectsFluent.ResourceRulesNested<N>>{
    public N and();
    public N endResourceRule();
    
  }
  public interface SubjectsNested<N> extends Nested<N>,V1beta3SubjectFluent<V1beta3PolicyRulesWithSubjectsFluent.SubjectsNested<N>>{
    public N and();
    public N endSubject();
    
  }
  
}