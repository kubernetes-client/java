package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1alpha1MatchResourcesFluent<A extends V1alpha1MatchResourcesFluent<A>> extends Fluent<A>{
  public A addToExcludeResourceRules(int index,V1alpha1NamedRuleWithOperations item);
  public A setToExcludeResourceRules(int index,V1alpha1NamedRuleWithOperations item);
  public A addToExcludeResourceRules(io.kubernetes.client.openapi.models.V1alpha1NamedRuleWithOperations... items);
  public A addAllToExcludeResourceRules(Collection<V1alpha1NamedRuleWithOperations> items);
  public A removeFromExcludeResourceRules(io.kubernetes.client.openapi.models.V1alpha1NamedRuleWithOperations... items);
  public A removeAllFromExcludeResourceRules(Collection<V1alpha1NamedRuleWithOperations> items);
  public A removeMatchingFromExcludeResourceRules(Predicate<V1alpha1NamedRuleWithOperationsBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildExcludeResourceRules instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1alpha1NamedRuleWithOperations> getExcludeResourceRules();
  public List<V1alpha1NamedRuleWithOperations> buildExcludeResourceRules();
  public V1alpha1NamedRuleWithOperations buildExcludeResourceRule(int index);
  public V1alpha1NamedRuleWithOperations buildFirstExcludeResourceRule();
  public V1alpha1NamedRuleWithOperations buildLastExcludeResourceRule();
  public V1alpha1NamedRuleWithOperations buildMatchingExcludeResourceRule(Predicate<V1alpha1NamedRuleWithOperationsBuilder> predicate);
  public Boolean hasMatchingExcludeResourceRule(Predicate<V1alpha1NamedRuleWithOperationsBuilder> predicate);
  public A withExcludeResourceRules(List<V1alpha1NamedRuleWithOperations> excludeResourceRules);
  public A withExcludeResourceRules(io.kubernetes.client.openapi.models.V1alpha1NamedRuleWithOperations... excludeResourceRules);
  public Boolean hasExcludeResourceRules();
  public V1alpha1MatchResourcesFluent.ExcludeResourceRulesNested<A> addNewExcludeResourceRule();
  public V1alpha1MatchResourcesFluent.ExcludeResourceRulesNested<A> addNewExcludeResourceRuleLike(V1alpha1NamedRuleWithOperations item);
  public V1alpha1MatchResourcesFluent.ExcludeResourceRulesNested<A> setNewExcludeResourceRuleLike(int index,V1alpha1NamedRuleWithOperations item);
  public V1alpha1MatchResourcesFluent.ExcludeResourceRulesNested<A> editExcludeResourceRule(int index);
  public V1alpha1MatchResourcesFluent.ExcludeResourceRulesNested<A> editFirstExcludeResourceRule();
  public V1alpha1MatchResourcesFluent.ExcludeResourceRulesNested<A> editLastExcludeResourceRule();
  public V1alpha1MatchResourcesFluent.ExcludeResourceRulesNested<A> editMatchingExcludeResourceRule(Predicate<V1alpha1NamedRuleWithOperationsBuilder> predicate);
  public String getMatchPolicy();
  public A withMatchPolicy(String matchPolicy);
  public Boolean hasMatchPolicy();
  
  /**
   * This method has been deprecated, please use method buildNamespaceSelector instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1LabelSelector getNamespaceSelector();
  public V1LabelSelector buildNamespaceSelector();
  public A withNamespaceSelector(V1LabelSelector namespaceSelector);
  public Boolean hasNamespaceSelector();
  public V1alpha1MatchResourcesFluent.NamespaceSelectorNested<A> withNewNamespaceSelector();
  public V1alpha1MatchResourcesFluent.NamespaceSelectorNested<A> withNewNamespaceSelectorLike(V1LabelSelector item);
  public V1alpha1MatchResourcesFluent.NamespaceSelectorNested<A> editNamespaceSelector();
  public V1alpha1MatchResourcesFluent.NamespaceSelectorNested<A> editOrNewNamespaceSelector();
  public V1alpha1MatchResourcesFluent.NamespaceSelectorNested<A> editOrNewNamespaceSelectorLike(V1LabelSelector item);
  
  /**
   * This method has been deprecated, please use method buildObjectSelector instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1LabelSelector getObjectSelector();
  public V1LabelSelector buildObjectSelector();
  public A withObjectSelector(V1LabelSelector objectSelector);
  public Boolean hasObjectSelector();
  public V1alpha1MatchResourcesFluent.ObjectSelectorNested<A> withNewObjectSelector();
  public V1alpha1MatchResourcesFluent.ObjectSelectorNested<A> withNewObjectSelectorLike(V1LabelSelector item);
  public V1alpha1MatchResourcesFluent.ObjectSelectorNested<A> editObjectSelector();
  public V1alpha1MatchResourcesFluent.ObjectSelectorNested<A> editOrNewObjectSelector();
  public V1alpha1MatchResourcesFluent.ObjectSelectorNested<A> editOrNewObjectSelectorLike(V1LabelSelector item);
  public A addToResourceRules(int index,V1alpha1NamedRuleWithOperations item);
  public A setToResourceRules(int index,V1alpha1NamedRuleWithOperations item);
  public A addToResourceRules(io.kubernetes.client.openapi.models.V1alpha1NamedRuleWithOperations... items);
  public A addAllToResourceRules(Collection<V1alpha1NamedRuleWithOperations> items);
  public A removeFromResourceRules(io.kubernetes.client.openapi.models.V1alpha1NamedRuleWithOperations... items);
  public A removeAllFromResourceRules(Collection<V1alpha1NamedRuleWithOperations> items);
  public A removeMatchingFromResourceRules(Predicate<V1alpha1NamedRuleWithOperationsBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildResourceRules instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1alpha1NamedRuleWithOperations> getResourceRules();
  public List<V1alpha1NamedRuleWithOperations> buildResourceRules();
  public V1alpha1NamedRuleWithOperations buildResourceRule(int index);
  public V1alpha1NamedRuleWithOperations buildFirstResourceRule();
  public V1alpha1NamedRuleWithOperations buildLastResourceRule();
  public V1alpha1NamedRuleWithOperations buildMatchingResourceRule(Predicate<V1alpha1NamedRuleWithOperationsBuilder> predicate);
  public Boolean hasMatchingResourceRule(Predicate<V1alpha1NamedRuleWithOperationsBuilder> predicate);
  public A withResourceRules(List<V1alpha1NamedRuleWithOperations> resourceRules);
  public A withResourceRules(io.kubernetes.client.openapi.models.V1alpha1NamedRuleWithOperations... resourceRules);
  public Boolean hasResourceRules();
  public V1alpha1MatchResourcesFluent.ResourceRulesNested<A> addNewResourceRule();
  public V1alpha1MatchResourcesFluent.ResourceRulesNested<A> addNewResourceRuleLike(V1alpha1NamedRuleWithOperations item);
  public V1alpha1MatchResourcesFluent.ResourceRulesNested<A> setNewResourceRuleLike(int index,V1alpha1NamedRuleWithOperations item);
  public V1alpha1MatchResourcesFluent.ResourceRulesNested<A> editResourceRule(int index);
  public V1alpha1MatchResourcesFluent.ResourceRulesNested<A> editFirstResourceRule();
  public V1alpha1MatchResourcesFluent.ResourceRulesNested<A> editLastResourceRule();
  public V1alpha1MatchResourcesFluent.ResourceRulesNested<A> editMatchingResourceRule(Predicate<V1alpha1NamedRuleWithOperationsBuilder> predicate);
  public interface ExcludeResourceRulesNested<N> extends Nested<N>,V1alpha1NamedRuleWithOperationsFluent<V1alpha1MatchResourcesFluent.ExcludeResourceRulesNested<N>>{
    public N and();
    public N endExcludeResourceRule();
    
  }
  public interface NamespaceSelectorNested<N> extends Nested<N>,V1LabelSelectorFluent<V1alpha1MatchResourcesFluent.NamespaceSelectorNested<N>>{
    public N and();
    public N endNamespaceSelector();
    
  }
  public interface ObjectSelectorNested<N> extends Nested<N>,V1LabelSelectorFluent<V1alpha1MatchResourcesFluent.ObjectSelectorNested<N>>{
    public N and();
    public N endObjectSelector();
    
  }
  public interface ResourceRulesNested<N> extends Nested<N>,V1alpha1NamedRuleWithOperationsFluent<V1alpha1MatchResourcesFluent.ResourceRulesNested<N>>{
    public N and();
    public N endResourceRule();
    
  }
  
}