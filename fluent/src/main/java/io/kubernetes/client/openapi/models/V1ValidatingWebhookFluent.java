/*
Copyright 2022 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

/** Generated */
public interface V1ValidatingWebhookFluent<A extends V1ValidatingWebhookFluent<A>>
    extends Fluent<A> {
  public A addToAdmissionReviewVersions(Integer index, String item);

  public A setToAdmissionReviewVersions(java.lang.Integer index, java.lang.String item);

  public A addToAdmissionReviewVersions(java.lang.String... items);

  public A addAllToAdmissionReviewVersions(Collection<java.lang.String> items);

  public A removeFromAdmissionReviewVersions(java.lang.String... items);

  public A removeAllFromAdmissionReviewVersions(java.util.Collection<java.lang.String> items);

  public List<java.lang.String> getAdmissionReviewVersions();

  public java.lang.String getAdmissionReviewVersion(java.lang.Integer index);

  public java.lang.String getFirstAdmissionReviewVersion();

  public java.lang.String getLastAdmissionReviewVersion();

  public java.lang.String getMatchingAdmissionReviewVersion(Predicate<java.lang.String> predicate);

  public Boolean hasMatchingAdmissionReviewVersion(
      java.util.function.Predicate<java.lang.String> predicate);

  public A withAdmissionReviewVersions(java.util.List<java.lang.String> admissionReviewVersions);

  public A withAdmissionReviewVersions(java.lang.String... admissionReviewVersions);

  public java.lang.Boolean hasAdmissionReviewVersions();

  /**
   * This method has been deprecated, please use method buildClientConfig instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public AdmissionregistrationV1WebhookClientConfig getClientConfig();

  public io.kubernetes.client.openapi.models.AdmissionregistrationV1WebhookClientConfig
      buildClientConfig();

  public A withClientConfig(
      io.kubernetes.client.openapi.models.AdmissionregistrationV1WebhookClientConfig clientConfig);

  public java.lang.Boolean hasClientConfig();

  public V1ValidatingWebhookFluent.ClientConfigNested<A> withNewClientConfig();

  public io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.ClientConfigNested<A>
      withNewClientConfigLike(
          io.kubernetes.client.openapi.models.AdmissionregistrationV1WebhookClientConfig item);

  public io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.ClientConfigNested<A>
      editClientConfig();

  public io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.ClientConfigNested<A>
      editOrNewClientConfig();

  public io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.ClientConfigNested<A>
      editOrNewClientConfigLike(
          io.kubernetes.client.openapi.models.AdmissionregistrationV1WebhookClientConfig item);

  public java.lang.String getFailurePolicy();

  public A withFailurePolicy(java.lang.String failurePolicy);

  public java.lang.Boolean hasFailurePolicy();

  public java.lang.String getMatchPolicy();

  public A withMatchPolicy(java.lang.String matchPolicy);

  public java.lang.Boolean hasMatchPolicy();

  public java.lang.String getName();

  public A withName(java.lang.String name);

  public java.lang.Boolean hasName();

  /**
   * This method has been deprecated, please use method buildNamespaceSelector instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V1LabelSelector getNamespaceSelector();

  public io.kubernetes.client.openapi.models.V1LabelSelector buildNamespaceSelector();

  public A withNamespaceSelector(
      io.kubernetes.client.openapi.models.V1LabelSelector namespaceSelector);

  public java.lang.Boolean hasNamespaceSelector();

  public V1ValidatingWebhookFluent.NamespaceSelectorNested<A> withNewNamespaceSelector();

  public io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.NamespaceSelectorNested<A>
      withNewNamespaceSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);

  public io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.NamespaceSelectorNested<A>
      editNamespaceSelector();

  public io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.NamespaceSelectorNested<A>
      editOrNewNamespaceSelector();

  public io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.NamespaceSelectorNested<A>
      editOrNewNamespaceSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);

  /**
   * This method has been deprecated, please use method buildObjectSelector instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1LabelSelector getObjectSelector();

  public io.kubernetes.client.openapi.models.V1LabelSelector buildObjectSelector();

  public A withObjectSelector(io.kubernetes.client.openapi.models.V1LabelSelector objectSelector);

  public java.lang.Boolean hasObjectSelector();

  public V1ValidatingWebhookFluent.ObjectSelectorNested<A> withNewObjectSelector();

  public io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.ObjectSelectorNested<A>
      withNewObjectSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);

  public io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.ObjectSelectorNested<A>
      editObjectSelector();

  public io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.ObjectSelectorNested<A>
      editOrNewObjectSelector();

  public io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.ObjectSelectorNested<A>
      editOrNewObjectSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);

  public A addToRules(java.lang.Integer index, V1RuleWithOperations item);

  public A setToRules(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1RuleWithOperations item);

  public A addToRules(io.kubernetes.client.openapi.models.V1RuleWithOperations... items);

  public A addAllToRules(
      java.util.Collection<io.kubernetes.client.openapi.models.V1RuleWithOperations> items);

  public A removeFromRules(io.kubernetes.client.openapi.models.V1RuleWithOperations... items);

  public A removeAllFromRules(
      java.util.Collection<io.kubernetes.client.openapi.models.V1RuleWithOperations> items);

  public A removeMatchingFromRules(
      java.util.function.Predicate<V1RuleWithOperationsBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildRules instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1RuleWithOperations> getRules();

  public java.util.List<io.kubernetes.client.openapi.models.V1RuleWithOperations> buildRules();

  public io.kubernetes.client.openapi.models.V1RuleWithOperations buildRule(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1RuleWithOperations buildFirstRule();

  public io.kubernetes.client.openapi.models.V1RuleWithOperations buildLastRule();

  public io.kubernetes.client.openapi.models.V1RuleWithOperations buildMatchingRule(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1RuleWithOperationsBuilder>
          predicate);

  public java.lang.Boolean hasMatchingRule(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1RuleWithOperationsBuilder>
          predicate);

  public A withRules(
      java.util.List<io.kubernetes.client.openapi.models.V1RuleWithOperations> rules);

  public A withRules(io.kubernetes.client.openapi.models.V1RuleWithOperations... rules);

  public java.lang.Boolean hasRules();

  public V1ValidatingWebhookFluent.RulesNested<A> addNewRule();

  public io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.RulesNested<A>
      addNewRuleLike(io.kubernetes.client.openapi.models.V1RuleWithOperations item);

  public io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.RulesNested<A>
      setNewRuleLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1RuleWithOperations item);

  public io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.RulesNested<A> editRule(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.RulesNested<A>
      editFirstRule();

  public io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.RulesNested<A>
      editLastRule();

  public io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.RulesNested<A>
      editMatchingRule(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1RuleWithOperationsBuilder>
              predicate);

  public java.lang.String getSideEffects();

  public A withSideEffects(java.lang.String sideEffects);

  public java.lang.Boolean hasSideEffects();

  public java.lang.Integer getTimeoutSeconds();

  public A withTimeoutSeconds(java.lang.Integer timeoutSeconds);

  public java.lang.Boolean hasTimeoutSeconds();

  public interface ClientConfigNested<N>
      extends Nested<N>,
          AdmissionregistrationV1WebhookClientConfigFluent<
              V1ValidatingWebhookFluent.ClientConfigNested<N>> {
    public N and();

    public N endClientConfig();
  }

  public interface NamespaceSelectorNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V1LabelSelectorFluent<V1ValidatingWebhookFluent.NamespaceSelectorNested<N>> {
    public N and();

    public N endNamespaceSelector();
  }

  public interface ObjectSelectorNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V1LabelSelectorFluent<V1ValidatingWebhookFluent.ObjectSelectorNested<N>> {
    public N and();

    public N endObjectSelector();
  }

  public interface RulesNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V1RuleWithOperationsFluent<V1ValidatingWebhookFluent.RulesNested<N>> {
    public N and();

    public N endRule();
  }
}
