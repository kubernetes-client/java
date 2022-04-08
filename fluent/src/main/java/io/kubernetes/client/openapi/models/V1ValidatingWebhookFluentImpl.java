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

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V1ValidatingWebhookFluentImpl<A extends V1ValidatingWebhookFluent<A>>
    extends BaseFluent<A> implements V1ValidatingWebhookFluent<A> {
  public V1ValidatingWebhookFluentImpl() {}

  public V1ValidatingWebhookFluentImpl(
      io.kubernetes.client.openapi.models.V1ValidatingWebhook instance) {
    this.withAdmissionReviewVersions(instance.getAdmissionReviewVersions());

    this.withClientConfig(instance.getClientConfig());

    this.withFailurePolicy(instance.getFailurePolicy());

    this.withMatchPolicy(instance.getMatchPolicy());

    this.withName(instance.getName());

    this.withNamespaceSelector(instance.getNamespaceSelector());

    this.withObjectSelector(instance.getObjectSelector());

    this.withRules(instance.getRules());

    this.withSideEffects(instance.getSideEffects());

    this.withTimeoutSeconds(instance.getTimeoutSeconds());
  }

  private List<String> admissionReviewVersions;
  private AdmissionregistrationV1WebhookClientConfigBuilder clientConfig;
  private java.lang.String failurePolicy;
  private java.lang.String matchPolicy;
  private java.lang.String name;
  private V1LabelSelectorBuilder namespaceSelector;
  private V1LabelSelectorBuilder objectSelector;
  private ArrayList<V1RuleWithOperationsBuilder> rules;
  private java.lang.String sideEffects;
  private Integer timeoutSeconds;

  public A addToAdmissionReviewVersions(java.lang.Integer index, java.lang.String item) {
    if (this.admissionReviewVersions == null) {
      this.admissionReviewVersions = new java.util.ArrayList<java.lang.String>();
    }
    this.admissionReviewVersions.add(index, item);
    return (A) this;
  }

  public A setToAdmissionReviewVersions(java.lang.Integer index, java.lang.String item) {
    if (this.admissionReviewVersions == null) {
      this.admissionReviewVersions = new java.util.ArrayList<java.lang.String>();
    }
    this.admissionReviewVersions.set(index, item);
    return (A) this;
  }

  public A addToAdmissionReviewVersions(java.lang.String... items) {
    if (this.admissionReviewVersions == null) {
      this.admissionReviewVersions = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.admissionReviewVersions.add(item);
    }
    return (A) this;
  }

  public A addAllToAdmissionReviewVersions(Collection<java.lang.String> items) {
    if (this.admissionReviewVersions == null) {
      this.admissionReviewVersions = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.admissionReviewVersions.add(item);
    }
    return (A) this;
  }

  public A removeFromAdmissionReviewVersions(java.lang.String... items) {
    for (java.lang.String item : items) {
      if (this.admissionReviewVersions != null) {
        this.admissionReviewVersions.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromAdmissionReviewVersions(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {
      if (this.admissionReviewVersions != null) {
        this.admissionReviewVersions.remove(item);
      }
    }
    return (A) this;
  }

  public java.util.List<java.lang.String> getAdmissionReviewVersions() {
    return this.admissionReviewVersions;
  }

  public java.lang.String getAdmissionReviewVersion(java.lang.Integer index) {
    return this.admissionReviewVersions.get(index);
  }

  public java.lang.String getFirstAdmissionReviewVersion() {
    return this.admissionReviewVersions.get(0);
  }

  public java.lang.String getLastAdmissionReviewVersion() {
    return this.admissionReviewVersions.get(admissionReviewVersions.size() - 1);
  }

  public java.lang.String getMatchingAdmissionReviewVersion(Predicate<java.lang.String> predicate) {
    for (java.lang.String item : admissionReviewVersions) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public Boolean hasMatchingAdmissionReviewVersion(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : admissionReviewVersions) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withAdmissionReviewVersions(java.util.List<java.lang.String> admissionReviewVersions) {
    if (admissionReviewVersions != null) {
      this.admissionReviewVersions = new java.util.ArrayList();
      for (java.lang.String item : admissionReviewVersions) {
        this.addToAdmissionReviewVersions(item);
      }
    } else {
      this.admissionReviewVersions = null;
    }
    return (A) this;
  }

  public A withAdmissionReviewVersions(java.lang.String... admissionReviewVersions) {
    if (this.admissionReviewVersions != null) {
      this.admissionReviewVersions.clear();
    }
    if (admissionReviewVersions != null) {
      for (java.lang.String item : admissionReviewVersions) {
        this.addToAdmissionReviewVersions(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasAdmissionReviewVersions() {
    return admissionReviewVersions != null && !admissionReviewVersions.isEmpty();
  }

  /**
   * This method has been deprecated, please use method buildClientConfig instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public io.kubernetes.client.openapi.models.AdmissionregistrationV1WebhookClientConfig
      getClientConfig() {
    return this.clientConfig != null ? this.clientConfig.build() : null;
  }

  public io.kubernetes.client.openapi.models.AdmissionregistrationV1WebhookClientConfig
      buildClientConfig() {
    return this.clientConfig != null ? this.clientConfig.build() : null;
  }

  public A withClientConfig(
      io.kubernetes.client.openapi.models.AdmissionregistrationV1WebhookClientConfig clientConfig) {
    _visitables.get("clientConfig").remove(this.clientConfig);
    if (clientConfig != null) {
      this.clientConfig = new AdmissionregistrationV1WebhookClientConfigBuilder(clientConfig);
      _visitables.get("clientConfig").add(this.clientConfig);
    }
    return (A) this;
  }

  public java.lang.Boolean hasClientConfig() {
    return this.clientConfig != null;
  }

  public V1ValidatingWebhookFluent.ClientConfigNested<A> withNewClientConfig() {
    return new V1ValidatingWebhookFluentImpl.ClientConfigNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.ClientConfigNested<A>
      withNewClientConfigLike(
          io.kubernetes.client.openapi.models.AdmissionregistrationV1WebhookClientConfig item) {
    return new V1ValidatingWebhookFluentImpl.ClientConfigNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.ClientConfigNested<A>
      editClientConfig() {
    return withNewClientConfigLike(getClientConfig());
  }

  public io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.ClientConfigNested<A>
      editOrNewClientConfig() {
    return withNewClientConfigLike(
        getClientConfig() != null
            ? getClientConfig()
            : new io.kubernetes.client.openapi.models
                    .AdmissionregistrationV1WebhookClientConfigBuilder()
                .build());
  }

  public io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.ClientConfigNested<A>
      editOrNewClientConfigLike(
          io.kubernetes.client.openapi.models.AdmissionregistrationV1WebhookClientConfig item) {
    return withNewClientConfigLike(getClientConfig() != null ? getClientConfig() : item);
  }

  public java.lang.String getFailurePolicy() {
    return this.failurePolicy;
  }

  public A withFailurePolicy(java.lang.String failurePolicy) {
    this.failurePolicy = failurePolicy;
    return (A) this;
  }

  public java.lang.Boolean hasFailurePolicy() {
    return this.failurePolicy != null;
  }

  public java.lang.String getMatchPolicy() {
    return this.matchPolicy;
  }

  public A withMatchPolicy(java.lang.String matchPolicy) {
    this.matchPolicy = matchPolicy;
    return (A) this;
  }

  public java.lang.Boolean hasMatchPolicy() {
    return this.matchPolicy != null;
  }

  public java.lang.String getName() {
    return this.name;
  }

  public A withName(java.lang.String name) {
    this.name = name;
    return (A) this;
  }

  public java.lang.Boolean hasName() {
    return this.name != null;
  }

  /**
   * This method has been deprecated, please use method buildNamespaceSelector instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1LabelSelector getNamespaceSelector() {
    return this.namespaceSelector != null ? this.namespaceSelector.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1LabelSelector buildNamespaceSelector() {
    return this.namespaceSelector != null ? this.namespaceSelector.build() : null;
  }

  public A withNamespaceSelector(
      io.kubernetes.client.openapi.models.V1LabelSelector namespaceSelector) {
    _visitables.get("namespaceSelector").remove(this.namespaceSelector);
    if (namespaceSelector != null) {
      this.namespaceSelector =
          new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(namespaceSelector);
      _visitables.get("namespaceSelector").add(this.namespaceSelector);
    }
    return (A) this;
  }

  public java.lang.Boolean hasNamespaceSelector() {
    return this.namespaceSelector != null;
  }

  public V1ValidatingWebhookFluent.NamespaceSelectorNested<A> withNewNamespaceSelector() {
    return new V1ValidatingWebhookFluentImpl.NamespaceSelectorNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.NamespaceSelectorNested<A>
      withNewNamespaceSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item) {
    return new io.kubernetes.client.openapi.models.V1ValidatingWebhookFluentImpl
        .NamespaceSelectorNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.NamespaceSelectorNested<A>
      editNamespaceSelector() {
    return withNewNamespaceSelectorLike(getNamespaceSelector());
  }

  public io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.NamespaceSelectorNested<A>
      editOrNewNamespaceSelector() {
    return withNewNamespaceSelectorLike(
        getNamespaceSelector() != null
            ? getNamespaceSelector()
            : new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.NamespaceSelectorNested<A>
      editOrNewNamespaceSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item) {
    return withNewNamespaceSelectorLike(
        getNamespaceSelector() != null ? getNamespaceSelector() : item);
  }

  /**
   * This method has been deprecated, please use method buildObjectSelector instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1LabelSelector getObjectSelector() {
    return this.objectSelector != null ? this.objectSelector.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1LabelSelector buildObjectSelector() {
    return this.objectSelector != null ? this.objectSelector.build() : null;
  }

  public A withObjectSelector(io.kubernetes.client.openapi.models.V1LabelSelector objectSelector) {
    _visitables.get("objectSelector").remove(this.objectSelector);
    if (objectSelector != null) {
      this.objectSelector =
          new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(objectSelector);
      _visitables.get("objectSelector").add(this.objectSelector);
    }
    return (A) this;
  }

  public java.lang.Boolean hasObjectSelector() {
    return this.objectSelector != null;
  }

  public V1ValidatingWebhookFluent.ObjectSelectorNested<A> withNewObjectSelector() {
    return new V1ValidatingWebhookFluentImpl.ObjectSelectorNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.ObjectSelectorNested<A>
      withNewObjectSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item) {
    return new io.kubernetes.client.openapi.models.V1ValidatingWebhookFluentImpl
        .ObjectSelectorNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.ObjectSelectorNested<A>
      editObjectSelector() {
    return withNewObjectSelectorLike(getObjectSelector());
  }

  public io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.ObjectSelectorNested<A>
      editOrNewObjectSelector() {
    return withNewObjectSelectorLike(
        getObjectSelector() != null
            ? getObjectSelector()
            : new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.ObjectSelectorNested<A>
      editOrNewObjectSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item) {
    return withNewObjectSelectorLike(getObjectSelector() != null ? getObjectSelector() : item);
  }

  public A addToRules(java.lang.Integer index, V1RuleWithOperations item) {
    if (this.rules == null) {
      this.rules =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1RuleWithOperationsBuilder>();
    }
    io.kubernetes.client.openapi.models.V1RuleWithOperationsBuilder builder =
        new io.kubernetes.client.openapi.models.V1RuleWithOperationsBuilder(item);
    _visitables.get("rules").add(index >= 0 ? index : _visitables.get("rules").size(), builder);
    this.rules.add(index >= 0 ? index : rules.size(), builder);
    return (A) this;
  }

  public A setToRules(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1RuleWithOperations item) {
    if (this.rules == null) {
      this.rules =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1RuleWithOperationsBuilder>();
    }
    io.kubernetes.client.openapi.models.V1RuleWithOperationsBuilder builder =
        new io.kubernetes.client.openapi.models.V1RuleWithOperationsBuilder(item);
    if (index < 0 || index >= _visitables.get("rules").size()) {
      _visitables.get("rules").add(builder);
    } else {
      _visitables.get("rules").set(index, builder);
    }
    if (index < 0 || index >= rules.size()) {
      rules.add(builder);
    } else {
      rules.set(index, builder);
    }
    return (A) this;
  }

  public A addToRules(io.kubernetes.client.openapi.models.V1RuleWithOperations... items) {
    if (this.rules == null) {
      this.rules =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1RuleWithOperationsBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1RuleWithOperations item : items) {
      io.kubernetes.client.openapi.models.V1RuleWithOperationsBuilder builder =
          new io.kubernetes.client.openapi.models.V1RuleWithOperationsBuilder(item);
      _visitables.get("rules").add(builder);
      this.rules.add(builder);
    }
    return (A) this;
  }

  public A addAllToRules(
      java.util.Collection<io.kubernetes.client.openapi.models.V1RuleWithOperations> items) {
    if (this.rules == null) {
      this.rules =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1RuleWithOperationsBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1RuleWithOperations item : items) {
      io.kubernetes.client.openapi.models.V1RuleWithOperationsBuilder builder =
          new io.kubernetes.client.openapi.models.V1RuleWithOperationsBuilder(item);
      _visitables.get("rules").add(builder);
      this.rules.add(builder);
    }
    return (A) this;
  }

  public A removeFromRules(io.kubernetes.client.openapi.models.V1RuleWithOperations... items) {
    for (io.kubernetes.client.openapi.models.V1RuleWithOperations item : items) {
      io.kubernetes.client.openapi.models.V1RuleWithOperationsBuilder builder =
          new io.kubernetes.client.openapi.models.V1RuleWithOperationsBuilder(item);
      _visitables.get("rules").remove(builder);
      if (this.rules != null) {
        this.rules.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromRules(
      java.util.Collection<io.kubernetes.client.openapi.models.V1RuleWithOperations> items) {
    for (io.kubernetes.client.openapi.models.V1RuleWithOperations item : items) {
      io.kubernetes.client.openapi.models.V1RuleWithOperationsBuilder builder =
          new io.kubernetes.client.openapi.models.V1RuleWithOperationsBuilder(item);
      _visitables.get("rules").remove(builder);
      if (this.rules != null) {
        this.rules.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromRules(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1RuleWithOperationsBuilder>
          predicate) {
    if (rules == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1RuleWithOperationsBuilder> each =
        rules.iterator();
    final List visitables = _visitables.get("rules");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1RuleWithOperationsBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildRules instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1RuleWithOperations> getRules() {
    return rules != null ? build(rules) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1RuleWithOperations> buildRules() {
    return rules != null ? build(rules) : null;
  }

  public io.kubernetes.client.openapi.models.V1RuleWithOperations buildRule(
      java.lang.Integer index) {
    return this.rules.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1RuleWithOperations buildFirstRule() {
    return this.rules.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1RuleWithOperations buildLastRule() {
    return this.rules.get(rules.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1RuleWithOperations buildMatchingRule(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1RuleWithOperationsBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1RuleWithOperationsBuilder item : rules) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingRule(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1RuleWithOperationsBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1RuleWithOperationsBuilder item : rules) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withRules(
      java.util.List<io.kubernetes.client.openapi.models.V1RuleWithOperations> rules) {
    if (this.rules != null) {
      _visitables.get("rules").removeAll(this.rules);
    }
    if (rules != null) {
      this.rules = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1RuleWithOperations item : rules) {
        this.addToRules(item);
      }
    } else {
      this.rules = null;
    }
    return (A) this;
  }

  public A withRules(io.kubernetes.client.openapi.models.V1RuleWithOperations... rules) {
    if (this.rules != null) {
      this.rules.clear();
    }
    if (rules != null) {
      for (io.kubernetes.client.openapi.models.V1RuleWithOperations item : rules) {
        this.addToRules(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasRules() {
    return rules != null && !rules.isEmpty();
  }

  public V1ValidatingWebhookFluent.RulesNested<A> addNewRule() {
    return new V1ValidatingWebhookFluentImpl.RulesNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.RulesNested<A>
      addNewRuleLike(io.kubernetes.client.openapi.models.V1RuleWithOperations item) {
    return new io.kubernetes.client.openapi.models.V1ValidatingWebhookFluentImpl.RulesNestedImpl(
        -1, item);
  }

  public io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.RulesNested<A>
      setNewRuleLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1RuleWithOperations item) {
    return new io.kubernetes.client.openapi.models.V1ValidatingWebhookFluentImpl.RulesNestedImpl(
        index, item);
  }

  public io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.RulesNested<A> editRule(
      java.lang.Integer index) {
    if (rules.size() <= index) throw new RuntimeException("Can't edit rules. Index exceeds size.");
    return setNewRuleLike(index, buildRule(index));
  }

  public io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.RulesNested<A>
      editFirstRule() {
    if (rules.size() == 0) throw new RuntimeException("Can't edit first rules. The list is empty.");
    return setNewRuleLike(0, buildRule(0));
  }

  public io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.RulesNested<A>
      editLastRule() {
    int index = rules.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last rules. The list is empty.");
    return setNewRuleLike(index, buildRule(index));
  }

  public io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.RulesNested<A>
      editMatchingRule(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1RuleWithOperationsBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < rules.size(); i++) {
      if (predicate.test(rules.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0) throw new RuntimeException("Can't edit matching rules. No match found.");
    return setNewRuleLike(index, buildRule(index));
  }

  public java.lang.String getSideEffects() {
    return this.sideEffects;
  }

  public A withSideEffects(java.lang.String sideEffects) {
    this.sideEffects = sideEffects;
    return (A) this;
  }

  public java.lang.Boolean hasSideEffects() {
    return this.sideEffects != null;
  }

  public java.lang.Integer getTimeoutSeconds() {
    return this.timeoutSeconds;
  }

  public A withTimeoutSeconds(java.lang.Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
    return (A) this;
  }

  public java.lang.Boolean hasTimeoutSeconds() {
    return this.timeoutSeconds != null;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ValidatingWebhookFluentImpl that = (V1ValidatingWebhookFluentImpl) o;
    if (admissionReviewVersions != null
        ? !admissionReviewVersions.equals(that.admissionReviewVersions)
        : that.admissionReviewVersions != null) return false;
    if (clientConfig != null ? !clientConfig.equals(that.clientConfig) : that.clientConfig != null)
      return false;
    if (failurePolicy != null
        ? !failurePolicy.equals(that.failurePolicy)
        : that.failurePolicy != null) return false;
    if (matchPolicy != null ? !matchPolicy.equals(that.matchPolicy) : that.matchPolicy != null)
      return false;
    if (name != null ? !name.equals(that.name) : that.name != null) return false;
    if (namespaceSelector != null
        ? !namespaceSelector.equals(that.namespaceSelector)
        : that.namespaceSelector != null) return false;
    if (objectSelector != null
        ? !objectSelector.equals(that.objectSelector)
        : that.objectSelector != null) return false;
    if (rules != null ? !rules.equals(that.rules) : that.rules != null) return false;
    if (sideEffects != null ? !sideEffects.equals(that.sideEffects) : that.sideEffects != null)
      return false;
    if (timeoutSeconds != null
        ? !timeoutSeconds.equals(that.timeoutSeconds)
        : that.timeoutSeconds != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        admissionReviewVersions,
        clientConfig,
        failurePolicy,
        matchPolicy,
        name,
        namespaceSelector,
        objectSelector,
        rules,
        sideEffects,
        timeoutSeconds,
        super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (admissionReviewVersions != null && !admissionReviewVersions.isEmpty()) {
      sb.append("admissionReviewVersions:");
      sb.append(admissionReviewVersions + ",");
    }
    if (clientConfig != null) {
      sb.append("clientConfig:");
      sb.append(clientConfig + ",");
    }
    if (failurePolicy != null) {
      sb.append("failurePolicy:");
      sb.append(failurePolicy + ",");
    }
    if (matchPolicy != null) {
      sb.append("matchPolicy:");
      sb.append(matchPolicy + ",");
    }
    if (name != null) {
      sb.append("name:");
      sb.append(name + ",");
    }
    if (namespaceSelector != null) {
      sb.append("namespaceSelector:");
      sb.append(namespaceSelector + ",");
    }
    if (objectSelector != null) {
      sb.append("objectSelector:");
      sb.append(objectSelector + ",");
    }
    if (rules != null && !rules.isEmpty()) {
      sb.append("rules:");
      sb.append(rules + ",");
    }
    if (sideEffects != null) {
      sb.append("sideEffects:");
      sb.append(sideEffects + ",");
    }
    if (timeoutSeconds != null) {
      sb.append("timeoutSeconds:");
      sb.append(timeoutSeconds);
    }
    sb.append("}");
    return sb.toString();
  }

  class ClientConfigNestedImpl<N>
      extends AdmissionregistrationV1WebhookClientConfigFluentImpl<
          V1ValidatingWebhookFluent.ClientConfigNested<N>>
      implements io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.ClientConfigNested<
              N>,
          Nested<N> {
    ClientConfigNestedImpl(
        io.kubernetes.client.openapi.models.AdmissionregistrationV1WebhookClientConfig item) {
      this.builder = new AdmissionregistrationV1WebhookClientConfigBuilder(this, item);
    }

    ClientConfigNestedImpl() {
      this.builder =
          new io.kubernetes.client.openapi.models.AdmissionregistrationV1WebhookClientConfigBuilder(
              this);
    }

    io.kubernetes.client.openapi.models.AdmissionregistrationV1WebhookClientConfigBuilder builder;

    public N and() {
      return (N) V1ValidatingWebhookFluentImpl.this.withClientConfig(builder.build());
    }

    public N endClientConfig() {
      return and();
    }
  }

  class NamespaceSelectorNestedImpl<N>
      extends V1LabelSelectorFluentImpl<V1ValidatingWebhookFluent.NamespaceSelectorNested<N>>
      implements io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent
                  .NamespaceSelectorNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    NamespaceSelectorNestedImpl(V1LabelSelector item) {
      this.builder = new V1LabelSelectorBuilder(this, item);
    }

    NamespaceSelectorNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1LabelSelectorBuilder builder;

    public N and() {
      return (N) V1ValidatingWebhookFluentImpl.this.withNamespaceSelector(builder.build());
    }

    public N endNamespaceSelector() {
      return and();
    }
  }

  class ObjectSelectorNestedImpl<N>
      extends V1LabelSelectorFluentImpl<V1ValidatingWebhookFluent.ObjectSelectorNested<N>>
      implements io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.ObjectSelectorNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    ObjectSelectorNestedImpl(V1LabelSelector item) {
      this.builder = new V1LabelSelectorBuilder(this, item);
    }

    ObjectSelectorNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1LabelSelectorBuilder builder;

    public N and() {
      return (N) V1ValidatingWebhookFluentImpl.this.withObjectSelector(builder.build());
    }

    public N endObjectSelector() {
      return and();
    }
  }

  class RulesNestedImpl<N>
      extends V1RuleWithOperationsFluentImpl<V1ValidatingWebhookFluent.RulesNested<N>>
      implements io.kubernetes.client.openapi.models.V1ValidatingWebhookFluent.RulesNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    RulesNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V1RuleWithOperations item) {
      this.index = index;
      this.builder = new V1RuleWithOperationsBuilder(this, item);
    }

    RulesNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1RuleWithOperationsBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1RuleWithOperationsBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1ValidatingWebhookFluentImpl.this.setToRules(index, builder.build());
    }

    public N endRule() {
      return and();
    }
  }
}
