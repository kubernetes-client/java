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
public interface V1ValidatingWebhookFluent<A extends V1ValidatingWebhookFluent<A>> extends Fluent<A>{
  public A addToAdmissionReviewVersions(Integer index,String item);
  public A setToAdmissionReviewVersions(Integer index,String item);
  public A addToAdmissionReviewVersions(java.lang.String... items);
  public A addAllToAdmissionReviewVersions(Collection<String> items);
  public A removeFromAdmissionReviewVersions(java.lang.String... items);
  public A removeAllFromAdmissionReviewVersions(Collection<String> items);
  public List<String> getAdmissionReviewVersions();
  public String getAdmissionReviewVersion(Integer index);
  public String getFirstAdmissionReviewVersion();
  public String getLastAdmissionReviewVersion();
  public String getMatchingAdmissionReviewVersion(Predicate<String> predicate);
  public Boolean hasMatchingAdmissionReviewVersion(Predicate<String> predicate);
  public A withAdmissionReviewVersions(List<String> admissionReviewVersions);
  public A withAdmissionReviewVersions(java.lang.String... admissionReviewVersions);
  public Boolean hasAdmissionReviewVersions();
  
  /**
   * This method has been deprecated, please use method buildClientConfig instead.
   * @return The buildable object.
   */
  @Deprecated
  public AdmissionregistrationV1WebhookClientConfig getClientConfig();
  public AdmissionregistrationV1WebhookClientConfig buildClientConfig();
  public A withClientConfig(AdmissionregistrationV1WebhookClientConfig clientConfig);
  public Boolean hasClientConfig();
  public V1ValidatingWebhookFluent.ClientConfigNested<A> withNewClientConfig();
  public V1ValidatingWebhookFluent.ClientConfigNested<A> withNewClientConfigLike(AdmissionregistrationV1WebhookClientConfig item);
  public V1ValidatingWebhookFluent.ClientConfigNested<A> editClientConfig();
  public V1ValidatingWebhookFluent.ClientConfigNested<A> editOrNewClientConfig();
  public V1ValidatingWebhookFluent.ClientConfigNested<A> editOrNewClientConfigLike(AdmissionregistrationV1WebhookClientConfig item);
  public String getFailurePolicy();
  public A withFailurePolicy(String failurePolicy);
  public Boolean hasFailurePolicy();
  public String getMatchPolicy();
  public A withMatchPolicy(String matchPolicy);
  public Boolean hasMatchPolicy();
  public String getName();
  public A withName(String name);
  public Boolean hasName();
  
  /**
   * This method has been deprecated, please use method buildNamespaceSelector instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1LabelSelector getNamespaceSelector();
  public V1LabelSelector buildNamespaceSelector();
  public A withNamespaceSelector(V1LabelSelector namespaceSelector);
  public Boolean hasNamespaceSelector();
  public V1ValidatingWebhookFluent.NamespaceSelectorNested<A> withNewNamespaceSelector();
  public V1ValidatingWebhookFluent.NamespaceSelectorNested<A> withNewNamespaceSelectorLike(V1LabelSelector item);
  public V1ValidatingWebhookFluent.NamespaceSelectorNested<A> editNamespaceSelector();
  public V1ValidatingWebhookFluent.NamespaceSelectorNested<A> editOrNewNamespaceSelector();
  public V1ValidatingWebhookFluent.NamespaceSelectorNested<A> editOrNewNamespaceSelectorLike(V1LabelSelector item);
  
  /**
   * This method has been deprecated, please use method buildObjectSelector instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1LabelSelector getObjectSelector();
  public V1LabelSelector buildObjectSelector();
  public A withObjectSelector(V1LabelSelector objectSelector);
  public Boolean hasObjectSelector();
  public V1ValidatingWebhookFluent.ObjectSelectorNested<A> withNewObjectSelector();
  public V1ValidatingWebhookFluent.ObjectSelectorNested<A> withNewObjectSelectorLike(V1LabelSelector item);
  public V1ValidatingWebhookFluent.ObjectSelectorNested<A> editObjectSelector();
  public V1ValidatingWebhookFluent.ObjectSelectorNested<A> editOrNewObjectSelector();
  public V1ValidatingWebhookFluent.ObjectSelectorNested<A> editOrNewObjectSelectorLike(V1LabelSelector item);
  public A addToRules(Integer index,V1RuleWithOperations item);
  public A setToRules(Integer index,V1RuleWithOperations item);
  public A addToRules(io.kubernetes.client.openapi.models.V1RuleWithOperations... items);
  public A addAllToRules(Collection<V1RuleWithOperations> items);
  public A removeFromRules(io.kubernetes.client.openapi.models.V1RuleWithOperations... items);
  public A removeAllFromRules(Collection<V1RuleWithOperations> items);
  public A removeMatchingFromRules(Predicate<V1RuleWithOperationsBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildRules instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1RuleWithOperations> getRules();
  public List<V1RuleWithOperations> buildRules();
  public V1RuleWithOperations buildRule(Integer index);
  public V1RuleWithOperations buildFirstRule();
  public V1RuleWithOperations buildLastRule();
  public V1RuleWithOperations buildMatchingRule(Predicate<V1RuleWithOperationsBuilder> predicate);
  public Boolean hasMatchingRule(Predicate<V1RuleWithOperationsBuilder> predicate);
  public A withRules(List<V1RuleWithOperations> rules);
  public A withRules(io.kubernetes.client.openapi.models.V1RuleWithOperations... rules);
  public Boolean hasRules();
  public V1ValidatingWebhookFluent.RulesNested<A> addNewRule();
  public V1ValidatingWebhookFluent.RulesNested<A> addNewRuleLike(V1RuleWithOperations item);
  public V1ValidatingWebhookFluent.RulesNested<A> setNewRuleLike(Integer index,V1RuleWithOperations item);
  public V1ValidatingWebhookFluent.RulesNested<A> editRule(Integer index);
  public V1ValidatingWebhookFluent.RulesNested<A> editFirstRule();
  public V1ValidatingWebhookFluent.RulesNested<A> editLastRule();
  public V1ValidatingWebhookFluent.RulesNested<A> editMatchingRule(Predicate<V1RuleWithOperationsBuilder> predicate);
  public String getSideEffects();
  public A withSideEffects(String sideEffects);
  public Boolean hasSideEffects();
  public Integer getTimeoutSeconds();
  public A withTimeoutSeconds(Integer timeoutSeconds);
  public Boolean hasTimeoutSeconds();
  public interface ClientConfigNested<N> extends Nested<N>,AdmissionregistrationV1WebhookClientConfigFluent<V1ValidatingWebhookFluent.ClientConfigNested<N>>{
    public N and();
    public N endClientConfig();
    
  }
  public interface NamespaceSelectorNested<N> extends Nested<N>,V1LabelSelectorFluent<V1ValidatingWebhookFluent.NamespaceSelectorNested<N>>{
    public N and();
    public N endNamespaceSelector();
    
  }
  public interface ObjectSelectorNested<N> extends Nested<N>,V1LabelSelectorFluent<V1ValidatingWebhookFluent.ObjectSelectorNested<N>>{
    public N and();
    public N endObjectSelector();
    
  }
  public interface RulesNested<N> extends Nested<N>,V1RuleWithOperationsFluent<V1ValidatingWebhookFluent.RulesNested<N>>{
    public N and();
    public N endRule();
    
  }
  
}