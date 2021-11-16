package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;
import io.kubernetes.client.fluent.Fluent;
import java.lang.Integer;
import java.util.Collection;

 /**
  * Generated
  */
public interface V1ValidatingWebhookFluent<A extends io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public A addToAdmissionReviewVersions(java.lang.Integer index,java.lang.String item);
  public A setToAdmissionReviewVersions(java.lang.Integer index,java.lang.String item);
  public A addToAdmissionReviewVersions(java.lang.String... items);
  public A addAllToAdmissionReviewVersions(java.util.Collection<java.lang.String> items);
  public A removeFromAdmissionReviewVersions(java.lang.String... items);
  public A removeAllFromAdmissionReviewVersions(java.util.Collection<java.lang.String> items);
  public java.util.List<java.lang.String> getAdmissionReviewVersions();
  public java.lang.String getAdmissionReviewVersion(java.lang.Integer index);
  public java.lang.String getFirstAdmissionReviewVersion();
  public java.lang.String getLastAdmissionReviewVersion();
  public java.lang.String getMatchingAdmissionReviewVersion(java.util.function.Predicate<java.lang.String> predicate);
  public java.lang.Boolean hasMatchingAdmissionReviewVersion(java.util.function.Predicate<java.lang.String> predicate);
  public A withAdmissionReviewVersions(java.util.List<java.lang.String> admissionReviewVersions);
  public A withAdmissionReviewVersions(java.lang.String... admissionReviewVersions);
  public java.lang.Boolean hasAdmissionReviewVersions();
  public A addNewAdmissionReviewVersion(java.lang.String arg0);
  
  /**
   * This method has been deprecated, please use method buildClientConfig instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.AdmissionregistrationV1WebhookClientConfig getClientConfig();
  public io.kubernetes.client.openapi.models.AdmissionregistrationV1WebhookClientConfig buildClientConfig();
  public A withClientConfig(io.kubernetes.client.openapi.models.AdmissionregistrationV1WebhookClientConfig clientConfig);
  public java.lang.Boolean hasClientConfig();
  public io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.ClientConfigNested<A> withNewClientConfig();
  public io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.ClientConfigNested<A> withNewClientConfigLike(io.kubernetes.client.openapi.models.AdmissionregistrationV1WebhookClientConfig item);
  public io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.ClientConfigNested<A> editClientConfig();
  public io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.ClientConfigNested<A> editOrNewClientConfig();
  public io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.ClientConfigNested<A> editOrNewClientConfigLike(io.kubernetes.client.openapi.models.AdmissionregistrationV1WebhookClientConfig item);
  public java.lang.String getFailurePolicy();
  public A withFailurePolicy(java.lang.String failurePolicy);
  public java.lang.Boolean hasFailurePolicy();
  
  /**
   * Method is deprecated. use withFailurePolicy instead.
   */
  @java.lang.Deprecated
  public A withNewFailurePolicy(java.lang.String arg0);
  public java.lang.String getMatchPolicy();
  public A withMatchPolicy(java.lang.String matchPolicy);
  public java.lang.Boolean hasMatchPolicy();
  
  /**
   * Method is deprecated. use withMatchPolicy instead.
   */
  @java.lang.Deprecated
  public A withNewMatchPolicy(java.lang.String arg0);
  public java.lang.String getName();
  public A withName(java.lang.String name);
  public java.lang.Boolean hasName();
  
  /**
   * Method is deprecated. use withName instead.
   */
  @java.lang.Deprecated
  public A withNewName(java.lang.String arg0);
  
  /**
   * This method has been deprecated, please use method buildNamespaceSelector instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1LabelSelector getNamespaceSelector();
  public io.kubernetes.client.openapi.models.V1LabelSelector buildNamespaceSelector();
  public A withNamespaceSelector(io.kubernetes.client.openapi.models.V1LabelSelector namespaceSelector);
  public java.lang.Boolean hasNamespaceSelector();
  public io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.NamespaceSelectorNested<A> withNewNamespaceSelector();
  public io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.NamespaceSelectorNested<A> withNewNamespaceSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);
  public io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.NamespaceSelectorNested<A> editNamespaceSelector();
  public io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.NamespaceSelectorNested<A> editOrNewNamespaceSelector();
  public io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.NamespaceSelectorNested<A> editOrNewNamespaceSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);
  
  /**
   * This method has been deprecated, please use method buildObjectSelector instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1LabelSelector getObjectSelector();
  public io.kubernetes.client.openapi.models.V1LabelSelector buildObjectSelector();
  public A withObjectSelector(io.kubernetes.client.openapi.models.V1LabelSelector objectSelector);
  public java.lang.Boolean hasObjectSelector();
  public io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.ObjectSelectorNested<A> withNewObjectSelector();
  public io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.ObjectSelectorNested<A> withNewObjectSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);
  public io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.ObjectSelectorNested<A> editObjectSelector();
  public io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.ObjectSelectorNested<A> editOrNewObjectSelector();
  public io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.ObjectSelectorNested<A> editOrNewObjectSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);
  public A addToRules(java.lang.Integer index,io.kubernetes.client.openapi.models.V1RuleWithOperations item);
  public A setToRules(java.lang.Integer index,io.kubernetes.client.openapi.models.V1RuleWithOperations item);
  public A addToRules(io.kubernetes.client.openapi.models.V1RuleWithOperations... items);
  public A addAllToRules(java.util.Collection<io.kubernetes.client.openapi.models.V1RuleWithOperations> items);
  public A removeFromRules(io.kubernetes.client.openapi.models.V1RuleWithOperations... items);
  public A removeAllFromRules(java.util.Collection<io.kubernetes.client.openapi.models.V1RuleWithOperations> items);
  public A removeMatchingFromRules(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1RuleWithOperationsBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildRules instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1RuleWithOperations> getRules();
  public java.util.List<io.kubernetes.client.openapi.models.V1RuleWithOperations> buildRules();
  public io.kubernetes.client.openapi.models.V1RuleWithOperations buildRule(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1RuleWithOperations buildFirstRule();
  public io.kubernetes.client.openapi.models.V1RuleWithOperations buildLastRule();
  public io.kubernetes.client.openapi.models.V1RuleWithOperations buildMatchingRule(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1RuleWithOperationsBuilder> predicate);
  public java.lang.Boolean hasMatchingRule(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1RuleWithOperationsBuilder> predicate);
  public A withRules(java.util.List<io.kubernetes.client.openapi.models.V1RuleWithOperations> rules);
  public A withRules(io.kubernetes.client.openapi.models.V1RuleWithOperations... rules);
  public java.lang.Boolean hasRules();
  public io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.RulesNested<A> addNewRule();
  public io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.RulesNested<A> addNewRuleLike(io.kubernetes.client.openapi.models.V1RuleWithOperations item);
  public io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.RulesNested<A> setNewRuleLike(java.lang.Integer index,io.kubernetes.client.openapi.models.V1RuleWithOperations item);
  public io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.RulesNested<A> editRule(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.RulesNested<A> editFirstRule();
  public io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.RulesNested<A> editLastRule();
  public io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.RulesNested<A> editMatchingRule(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1RuleWithOperationsBuilder> predicate);
  public java.lang.String getSideEffects();
  public A withSideEffects(java.lang.String sideEffects);
  public java.lang.Boolean hasSideEffects();
  
  /**
   * Method is deprecated. use withSideEffects instead.
   */
  @java.lang.Deprecated
  public A withNewSideEffects(java.lang.String arg0);
  public java.lang.Integer getTimeoutSeconds();
  public A withTimeoutSeconds(java.lang.Integer timeoutSeconds);
  public java.lang.Boolean hasTimeoutSeconds();
  public interface ClientConfigNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.AdmissionregistrationV1WebhookClientConfigFluent<io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.ClientConfigNested<N>>{
    public N and();
    public N endClientConfig();
    
  }
  public interface NamespaceSelectorNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1LabelSelectorFluent<io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.NamespaceSelectorNested<N>>{
    public N and();
    public N endNamespaceSelector();
    
  }
  public interface ObjectSelectorNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1LabelSelectorFluent<io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.ObjectSelectorNested<N>>{
    public N and();
    public N endObjectSelector();
    
  }
  public interface RulesNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1RuleWithOperationsFluent<io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.RulesNested<N>>{
    public N and();
    public N endRule();
    
  }
  
}