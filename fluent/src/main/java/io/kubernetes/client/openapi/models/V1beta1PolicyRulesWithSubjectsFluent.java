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
public interface V1beta1PolicyRulesWithSubjectsFluent<A extends V1beta1PolicyRulesWithSubjectsFluent<A>> extends Fluent<A>{
  public A addToNonResourceRules(Integer index,V1beta1NonResourcePolicyRule item);
  public A setToNonResourceRules(Integer index,V1beta1NonResourcePolicyRule item);
  public A addToNonResourceRules(io.kubernetes.client.openapi.models.V1beta1NonResourcePolicyRule... items);
  public A addAllToNonResourceRules(Collection<V1beta1NonResourcePolicyRule> items);
  public A removeFromNonResourceRules(io.kubernetes.client.openapi.models.V1beta1NonResourcePolicyRule... items);
  public A removeAllFromNonResourceRules(Collection<V1beta1NonResourcePolicyRule> items);
  public A removeMatchingFromNonResourceRules(Predicate<V1beta1NonResourcePolicyRuleBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildNonResourceRules instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1beta1NonResourcePolicyRule> getNonResourceRules();
  public List<V1beta1NonResourcePolicyRule> buildNonResourceRules();
  public V1beta1NonResourcePolicyRule buildNonResourceRule(Integer index);
  public V1beta1NonResourcePolicyRule buildFirstNonResourceRule();
  public V1beta1NonResourcePolicyRule buildLastNonResourceRule();
  public V1beta1NonResourcePolicyRule buildMatchingNonResourceRule(Predicate<V1beta1NonResourcePolicyRuleBuilder> predicate);
  public Boolean hasMatchingNonResourceRule(Predicate<V1beta1NonResourcePolicyRuleBuilder> predicate);
  public A withNonResourceRules(List<V1beta1NonResourcePolicyRule> nonResourceRules);
  public A withNonResourceRules(io.kubernetes.client.openapi.models.V1beta1NonResourcePolicyRule... nonResourceRules);
  public Boolean hasNonResourceRules();
  public V1beta1PolicyRulesWithSubjectsFluent.NonResourceRulesNested<A> addNewNonResourceRule();
  public V1beta1PolicyRulesWithSubjectsFluent.NonResourceRulesNested<A> addNewNonResourceRuleLike(V1beta1NonResourcePolicyRule item);
  public V1beta1PolicyRulesWithSubjectsFluent.NonResourceRulesNested<A> setNewNonResourceRuleLike(Integer index,V1beta1NonResourcePolicyRule item);
  public V1beta1PolicyRulesWithSubjectsFluent.NonResourceRulesNested<A> editNonResourceRule(Integer index);
  public V1beta1PolicyRulesWithSubjectsFluent.NonResourceRulesNested<A> editFirstNonResourceRule();
  public V1beta1PolicyRulesWithSubjectsFluent.NonResourceRulesNested<A> editLastNonResourceRule();
  public V1beta1PolicyRulesWithSubjectsFluent.NonResourceRulesNested<A> editMatchingNonResourceRule(Predicate<V1beta1NonResourcePolicyRuleBuilder> predicate);
  public A addToResourceRules(Integer index,V1beta1ResourcePolicyRule item);
  public A setToResourceRules(Integer index,V1beta1ResourcePolicyRule item);
  public A addToResourceRules(io.kubernetes.client.openapi.models.V1beta1ResourcePolicyRule... items);
  public A addAllToResourceRules(Collection<V1beta1ResourcePolicyRule> items);
  public A removeFromResourceRules(io.kubernetes.client.openapi.models.V1beta1ResourcePolicyRule... items);
  public A removeAllFromResourceRules(Collection<V1beta1ResourcePolicyRule> items);
  public A removeMatchingFromResourceRules(Predicate<V1beta1ResourcePolicyRuleBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildResourceRules instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1beta1ResourcePolicyRule> getResourceRules();
  public List<V1beta1ResourcePolicyRule> buildResourceRules();
  public V1beta1ResourcePolicyRule buildResourceRule(Integer index);
  public V1beta1ResourcePolicyRule buildFirstResourceRule();
  public V1beta1ResourcePolicyRule buildLastResourceRule();
  public V1beta1ResourcePolicyRule buildMatchingResourceRule(Predicate<V1beta1ResourcePolicyRuleBuilder> predicate);
  public Boolean hasMatchingResourceRule(Predicate<V1beta1ResourcePolicyRuleBuilder> predicate);
  public A withResourceRules(List<V1beta1ResourcePolicyRule> resourceRules);
  public A withResourceRules(io.kubernetes.client.openapi.models.V1beta1ResourcePolicyRule... resourceRules);
  public Boolean hasResourceRules();
  public V1beta1PolicyRulesWithSubjectsFluent.ResourceRulesNested<A> addNewResourceRule();
  public V1beta1PolicyRulesWithSubjectsFluent.ResourceRulesNested<A> addNewResourceRuleLike(V1beta1ResourcePolicyRule item);
  public V1beta1PolicyRulesWithSubjectsFluent.ResourceRulesNested<A> setNewResourceRuleLike(Integer index,V1beta1ResourcePolicyRule item);
  public V1beta1PolicyRulesWithSubjectsFluent.ResourceRulesNested<A> editResourceRule(Integer index);
  public V1beta1PolicyRulesWithSubjectsFluent.ResourceRulesNested<A> editFirstResourceRule();
  public V1beta1PolicyRulesWithSubjectsFluent.ResourceRulesNested<A> editLastResourceRule();
  public V1beta1PolicyRulesWithSubjectsFluent.ResourceRulesNested<A> editMatchingResourceRule(Predicate<V1beta1ResourcePolicyRuleBuilder> predicate);
  public A addToSubjects(Integer index,V1beta1Subject item);
  public A setToSubjects(Integer index,V1beta1Subject item);
  public A addToSubjects(io.kubernetes.client.openapi.models.V1beta1Subject... items);
  public A addAllToSubjects(Collection<V1beta1Subject> items);
  public A removeFromSubjects(io.kubernetes.client.openapi.models.V1beta1Subject... items);
  public A removeAllFromSubjects(Collection<V1beta1Subject> items);
  public A removeMatchingFromSubjects(Predicate<V1beta1SubjectBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildSubjects instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1beta1Subject> getSubjects();
  public List<V1beta1Subject> buildSubjects();
  public V1beta1Subject buildSubject(Integer index);
  public V1beta1Subject buildFirstSubject();
  public V1beta1Subject buildLastSubject();
  public V1beta1Subject buildMatchingSubject(Predicate<V1beta1SubjectBuilder> predicate);
  public Boolean hasMatchingSubject(Predicate<V1beta1SubjectBuilder> predicate);
  public A withSubjects(List<V1beta1Subject> subjects);
  public A withSubjects(io.kubernetes.client.openapi.models.V1beta1Subject... subjects);
  public Boolean hasSubjects();
  public V1beta1PolicyRulesWithSubjectsFluent.SubjectsNested<A> addNewSubject();
  public V1beta1PolicyRulesWithSubjectsFluent.SubjectsNested<A> addNewSubjectLike(V1beta1Subject item);
  public V1beta1PolicyRulesWithSubjectsFluent.SubjectsNested<A> setNewSubjectLike(Integer index,V1beta1Subject item);
  public V1beta1PolicyRulesWithSubjectsFluent.SubjectsNested<A> editSubject(Integer index);
  public V1beta1PolicyRulesWithSubjectsFluent.SubjectsNested<A> editFirstSubject();
  public V1beta1PolicyRulesWithSubjectsFluent.SubjectsNested<A> editLastSubject();
  public V1beta1PolicyRulesWithSubjectsFluent.SubjectsNested<A> editMatchingSubject(Predicate<V1beta1SubjectBuilder> predicate);
  public interface NonResourceRulesNested<N> extends Nested<N>,V1beta1NonResourcePolicyRuleFluent<V1beta1PolicyRulesWithSubjectsFluent.NonResourceRulesNested<N>>{
    public N and();
    public N endNonResourceRule();
    
  }
  public interface ResourceRulesNested<N> extends Nested<N>,V1beta1ResourcePolicyRuleFluent<V1beta1PolicyRulesWithSubjectsFluent.ResourceRulesNested<N>>{
    public N and();
    public N endResourceRule();
    
  }
  public interface SubjectsNested<N> extends Nested<N>,V1beta1SubjectFluent<V1beta1PolicyRulesWithSubjectsFluent.SubjectsNested<N>>{
    public N and();
    public N endSubject();
    
  }
  
}