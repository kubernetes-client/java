package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.List;
import java.lang.Integer;
import java.util.Collection;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ValidatingWebhookFluent<A extends V1ValidatingWebhookFluent<A>> extends BaseFluent<A>{
  public V1ValidatingWebhookFluent() {
  }
  
  public V1ValidatingWebhookFluent(V1ValidatingWebhook instance) {
    this.copyInstance(instance);
  }
  private List<String> admissionReviewVersions;
  private AdmissionregistrationV1WebhookClientConfigBuilder clientConfig;
  private String failurePolicy;
  private ArrayList<V1MatchConditionBuilder> matchConditions;
  private String matchPolicy;
  private String name;
  private V1LabelSelectorBuilder namespaceSelector;
  private V1LabelSelectorBuilder objectSelector;
  private ArrayList<V1RuleWithOperationsBuilder> rules;
  private String sideEffects;
  private Integer timeoutSeconds;
  
  protected void copyInstance(V1ValidatingWebhook instance) {
    instance = (instance != null ? instance : new V1ValidatingWebhook());
    if (instance != null) {
          this.withAdmissionReviewVersions(instance.getAdmissionReviewVersions());
          this.withClientConfig(instance.getClientConfig());
          this.withFailurePolicy(instance.getFailurePolicy());
          this.withMatchConditions(instance.getMatchConditions());
          this.withMatchPolicy(instance.getMatchPolicy());
          this.withName(instance.getName());
          this.withNamespaceSelector(instance.getNamespaceSelector());
          this.withObjectSelector(instance.getObjectSelector());
          this.withRules(instance.getRules());
          this.withSideEffects(instance.getSideEffects());
          this.withTimeoutSeconds(instance.getTimeoutSeconds());
        }
  }
  
  public A addToAdmissionReviewVersions(int index,String item) {
    if (this.admissionReviewVersions == null) {this.admissionReviewVersions = new ArrayList<String>();}
    this.admissionReviewVersions.add(index, item);
    return (A)this;
  }
  
  public A setToAdmissionReviewVersions(int index,String item) {
    if (this.admissionReviewVersions == null) {this.admissionReviewVersions = new ArrayList<String>();}
    this.admissionReviewVersions.set(index, item); return (A)this;
  }
  
  public A addToAdmissionReviewVersions(java.lang.String... items) {
    if (this.admissionReviewVersions == null) {this.admissionReviewVersions = new ArrayList<String>();}
    for (String item : items) {this.admissionReviewVersions.add(item);} return (A)this;
  }
  
  public A addAllToAdmissionReviewVersions(Collection<String> items) {
    if (this.admissionReviewVersions == null) {this.admissionReviewVersions = new ArrayList<String>();}
    for (String item : items) {this.admissionReviewVersions.add(item);} return (A)this;
  }
  
  public A removeFromAdmissionReviewVersions(java.lang.String... items) {
    if (this.admissionReviewVersions == null) return (A)this;
    for (String item : items) { this.admissionReviewVersions.remove(item);} return (A)this;
  }
  
  public A removeAllFromAdmissionReviewVersions(Collection<String> items) {
    if (this.admissionReviewVersions == null) return (A)this;
    for (String item : items) { this.admissionReviewVersions.remove(item);} return (A)this;
  }
  
  public List<String> getAdmissionReviewVersions() {
    return this.admissionReviewVersions;
  }
  
  public String getAdmissionReviewVersion(int index) {
    return this.admissionReviewVersions.get(index);
  }
  
  public String getFirstAdmissionReviewVersion() {
    return this.admissionReviewVersions.get(0);
  }
  
  public String getLastAdmissionReviewVersion() {
    return this.admissionReviewVersions.get(admissionReviewVersions.size() - 1);
  }
  
  public String getMatchingAdmissionReviewVersion(Predicate<String> predicate) {
      for (String item : admissionReviewVersions) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingAdmissionReviewVersion(Predicate<String> predicate) {
      for (String item : admissionReviewVersions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withAdmissionReviewVersions(List<String> admissionReviewVersions) {
    if (admissionReviewVersions != null) {
        this.admissionReviewVersions = new ArrayList();
        for (String item : admissionReviewVersions) {
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
        _visitables.remove("admissionReviewVersions");
    }
    if (admissionReviewVersions != null) {
      for (String item : admissionReviewVersions) {
        this.addToAdmissionReviewVersions(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasAdmissionReviewVersions() {
    return this.admissionReviewVersions != null && !this.admissionReviewVersions.isEmpty();
  }
  
  public AdmissionregistrationV1WebhookClientConfig buildClientConfig() {
    return this.clientConfig != null ? this.clientConfig.build() : null;
  }
  
  public A withClientConfig(AdmissionregistrationV1WebhookClientConfig clientConfig) {
    this._visitables.remove("clientConfig");
    if (clientConfig != null) {
        this.clientConfig = new AdmissionregistrationV1WebhookClientConfigBuilder(clientConfig);
        this._visitables.get("clientConfig").add(this.clientConfig);
    } else {
        this.clientConfig = null;
        this._visitables.get("clientConfig").remove(this.clientConfig);
    }
    return (A) this;
  }
  
  public boolean hasClientConfig() {
    return this.clientConfig != null;
  }
  
  public ClientConfigNested<A> withNewClientConfig() {
    return new ClientConfigNested(null);
  }
  
  public ClientConfigNested<A> withNewClientConfigLike(AdmissionregistrationV1WebhookClientConfig item) {
    return new ClientConfigNested(item);
  }
  
  public ClientConfigNested<A> editClientConfig() {
    return withNewClientConfigLike(java.util.Optional.ofNullable(buildClientConfig()).orElse(null));
  }
  
  public ClientConfigNested<A> editOrNewClientConfig() {
    return withNewClientConfigLike(java.util.Optional.ofNullable(buildClientConfig()).orElse(new AdmissionregistrationV1WebhookClientConfigBuilder().build()));
  }
  
  public ClientConfigNested<A> editOrNewClientConfigLike(AdmissionregistrationV1WebhookClientConfig item) {
    return withNewClientConfigLike(java.util.Optional.ofNullable(buildClientConfig()).orElse(item));
  }
  
  public String getFailurePolicy() {
    return this.failurePolicy;
  }
  
  public A withFailurePolicy(String failurePolicy) {
    this.failurePolicy = failurePolicy;
    return (A) this;
  }
  
  public boolean hasFailurePolicy() {
    return this.failurePolicy != null;
  }
  
  public A addToMatchConditions(int index,V1MatchCondition item) {
    if (this.matchConditions == null) {this.matchConditions = new ArrayList<V1MatchConditionBuilder>();}
    V1MatchConditionBuilder builder = new V1MatchConditionBuilder(item);
    if (index < 0 || index >= matchConditions.size()) { _visitables.get("matchConditions").add(builder); matchConditions.add(builder); } else { _visitables.get("matchConditions").add(index, builder); matchConditions.add(index, builder);}
    return (A)this;
  }
  
  public A setToMatchConditions(int index,V1MatchCondition item) {
    if (this.matchConditions == null) {this.matchConditions = new ArrayList<V1MatchConditionBuilder>();}
    V1MatchConditionBuilder builder = new V1MatchConditionBuilder(item);
    if (index < 0 || index >= matchConditions.size()) { _visitables.get("matchConditions").add(builder); matchConditions.add(builder); } else { _visitables.get("matchConditions").set(index, builder); matchConditions.set(index, builder);}
    return (A)this;
  }
  
  public A addToMatchConditions(io.kubernetes.client.openapi.models.V1MatchCondition... items) {
    if (this.matchConditions == null) {this.matchConditions = new ArrayList<V1MatchConditionBuilder>();}
    for (V1MatchCondition item : items) {V1MatchConditionBuilder builder = new V1MatchConditionBuilder(item);_visitables.get("matchConditions").add(builder);this.matchConditions.add(builder);} return (A)this;
  }
  
  public A addAllToMatchConditions(Collection<V1MatchCondition> items) {
    if (this.matchConditions == null) {this.matchConditions = new ArrayList<V1MatchConditionBuilder>();}
    for (V1MatchCondition item : items) {V1MatchConditionBuilder builder = new V1MatchConditionBuilder(item);_visitables.get("matchConditions").add(builder);this.matchConditions.add(builder);} return (A)this;
  }
  
  public A removeFromMatchConditions(io.kubernetes.client.openapi.models.V1MatchCondition... items) {
    if (this.matchConditions == null) return (A)this;
    for (V1MatchCondition item : items) {V1MatchConditionBuilder builder = new V1MatchConditionBuilder(item);_visitables.get("matchConditions").remove(builder); this.matchConditions.remove(builder);} return (A)this;
  }
  
  public A removeAllFromMatchConditions(Collection<V1MatchCondition> items) {
    if (this.matchConditions == null) return (A)this;
    for (V1MatchCondition item : items) {V1MatchConditionBuilder builder = new V1MatchConditionBuilder(item);_visitables.get("matchConditions").remove(builder); this.matchConditions.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromMatchConditions(Predicate<V1MatchConditionBuilder> predicate) {
    if (matchConditions == null) return (A) this;
    final Iterator<V1MatchConditionBuilder> each = matchConditions.iterator();
    final List visitables = _visitables.get("matchConditions");
    while (each.hasNext()) {
      V1MatchConditionBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1MatchCondition> buildMatchConditions() {
    return this.matchConditions != null ? build(matchConditions) : null;
  }
  
  public V1MatchCondition buildMatchCondition(int index) {
    return this.matchConditions.get(index).build();
  }
  
  public V1MatchCondition buildFirstMatchCondition() {
    return this.matchConditions.get(0).build();
  }
  
  public V1MatchCondition buildLastMatchCondition() {
    return this.matchConditions.get(matchConditions.size() - 1).build();
  }
  
  public V1MatchCondition buildMatchingMatchCondition(Predicate<V1MatchConditionBuilder> predicate) {
      for (V1MatchConditionBuilder item : matchConditions) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingMatchCondition(Predicate<V1MatchConditionBuilder> predicate) {
      for (V1MatchConditionBuilder item : matchConditions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withMatchConditions(List<V1MatchCondition> matchConditions) {
    if (this.matchConditions != null) {
      this._visitables.get("matchConditions").clear();
    }
    if (matchConditions != null) {
        this.matchConditions = new ArrayList();
        for (V1MatchCondition item : matchConditions) {
          this.addToMatchConditions(item);
        }
    } else {
      this.matchConditions = null;
    }
    return (A) this;
  }
  
  public A withMatchConditions(io.kubernetes.client.openapi.models.V1MatchCondition... matchConditions) {
    if (this.matchConditions != null) {
        this.matchConditions.clear();
        _visitables.remove("matchConditions");
    }
    if (matchConditions != null) {
      for (V1MatchCondition item : matchConditions) {
        this.addToMatchConditions(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasMatchConditions() {
    return this.matchConditions != null && !this.matchConditions.isEmpty();
  }
  
  public MatchConditionsNested<A> addNewMatchCondition() {
    return new MatchConditionsNested(-1, null);
  }
  
  public MatchConditionsNested<A> addNewMatchConditionLike(V1MatchCondition item) {
    return new MatchConditionsNested(-1, item);
  }
  
  public MatchConditionsNested<A> setNewMatchConditionLike(int index,V1MatchCondition item) {
    return new MatchConditionsNested(index, item);
  }
  
  public MatchConditionsNested<A> editMatchCondition(int index) {
    if (matchConditions.size() <= index) throw new RuntimeException("Can't edit matchConditions. Index exceeds size.");
    return setNewMatchConditionLike(index, buildMatchCondition(index));
  }
  
  public MatchConditionsNested<A> editFirstMatchCondition() {
    if (matchConditions.size() == 0) throw new RuntimeException("Can't edit first matchConditions. The list is empty.");
    return setNewMatchConditionLike(0, buildMatchCondition(0));
  }
  
  public MatchConditionsNested<A> editLastMatchCondition() {
    int index = matchConditions.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last matchConditions. The list is empty.");
    return setNewMatchConditionLike(index, buildMatchCondition(index));
  }
  
  public MatchConditionsNested<A> editMatchingMatchCondition(Predicate<V1MatchConditionBuilder> predicate) {
    int index = -1;
    for (int i=0;i<matchConditions.size();i++) { 
    if (predicate.test(matchConditions.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching matchConditions. No match found.");
    return setNewMatchConditionLike(index, buildMatchCondition(index));
  }
  
  public String getMatchPolicy() {
    return this.matchPolicy;
  }
  
  public A withMatchPolicy(String matchPolicy) {
    this.matchPolicy = matchPolicy;
    return (A) this;
  }
  
  public boolean hasMatchPolicy() {
    return this.matchPolicy != null;
  }
  
  public String getName() {
    return this.name;
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public V1LabelSelector buildNamespaceSelector() {
    return this.namespaceSelector != null ? this.namespaceSelector.build() : null;
  }
  
  public A withNamespaceSelector(V1LabelSelector namespaceSelector) {
    this._visitables.remove("namespaceSelector");
    if (namespaceSelector != null) {
        this.namespaceSelector = new V1LabelSelectorBuilder(namespaceSelector);
        this._visitables.get("namespaceSelector").add(this.namespaceSelector);
    } else {
        this.namespaceSelector = null;
        this._visitables.get("namespaceSelector").remove(this.namespaceSelector);
    }
    return (A) this;
  }
  
  public boolean hasNamespaceSelector() {
    return this.namespaceSelector != null;
  }
  
  public NamespaceSelectorNested<A> withNewNamespaceSelector() {
    return new NamespaceSelectorNested(null);
  }
  
  public NamespaceSelectorNested<A> withNewNamespaceSelectorLike(V1LabelSelector item) {
    return new NamespaceSelectorNested(item);
  }
  
  public NamespaceSelectorNested<A> editNamespaceSelector() {
    return withNewNamespaceSelectorLike(java.util.Optional.ofNullable(buildNamespaceSelector()).orElse(null));
  }
  
  public NamespaceSelectorNested<A> editOrNewNamespaceSelector() {
    return withNewNamespaceSelectorLike(java.util.Optional.ofNullable(buildNamespaceSelector()).orElse(new V1LabelSelectorBuilder().build()));
  }
  
  public NamespaceSelectorNested<A> editOrNewNamespaceSelectorLike(V1LabelSelector item) {
    return withNewNamespaceSelectorLike(java.util.Optional.ofNullable(buildNamespaceSelector()).orElse(item));
  }
  
  public V1LabelSelector buildObjectSelector() {
    return this.objectSelector != null ? this.objectSelector.build() : null;
  }
  
  public A withObjectSelector(V1LabelSelector objectSelector) {
    this._visitables.remove("objectSelector");
    if (objectSelector != null) {
        this.objectSelector = new V1LabelSelectorBuilder(objectSelector);
        this._visitables.get("objectSelector").add(this.objectSelector);
    } else {
        this.objectSelector = null;
        this._visitables.get("objectSelector").remove(this.objectSelector);
    }
    return (A) this;
  }
  
  public boolean hasObjectSelector() {
    return this.objectSelector != null;
  }
  
  public ObjectSelectorNested<A> withNewObjectSelector() {
    return new ObjectSelectorNested(null);
  }
  
  public ObjectSelectorNested<A> withNewObjectSelectorLike(V1LabelSelector item) {
    return new ObjectSelectorNested(item);
  }
  
  public ObjectSelectorNested<A> editObjectSelector() {
    return withNewObjectSelectorLike(java.util.Optional.ofNullable(buildObjectSelector()).orElse(null));
  }
  
  public ObjectSelectorNested<A> editOrNewObjectSelector() {
    return withNewObjectSelectorLike(java.util.Optional.ofNullable(buildObjectSelector()).orElse(new V1LabelSelectorBuilder().build()));
  }
  
  public ObjectSelectorNested<A> editOrNewObjectSelectorLike(V1LabelSelector item) {
    return withNewObjectSelectorLike(java.util.Optional.ofNullable(buildObjectSelector()).orElse(item));
  }
  
  public A addToRules(int index,V1RuleWithOperations item) {
    if (this.rules == null) {this.rules = new ArrayList<V1RuleWithOperationsBuilder>();}
    V1RuleWithOperationsBuilder builder = new V1RuleWithOperationsBuilder(item);
    if (index < 0 || index >= rules.size()) { _visitables.get("rules").add(builder); rules.add(builder); } else { _visitables.get("rules").add(index, builder); rules.add(index, builder);}
    return (A)this;
  }
  
  public A setToRules(int index,V1RuleWithOperations item) {
    if (this.rules == null) {this.rules = new ArrayList<V1RuleWithOperationsBuilder>();}
    V1RuleWithOperationsBuilder builder = new V1RuleWithOperationsBuilder(item);
    if (index < 0 || index >= rules.size()) { _visitables.get("rules").add(builder); rules.add(builder); } else { _visitables.get("rules").set(index, builder); rules.set(index, builder);}
    return (A)this;
  }
  
  public A addToRules(io.kubernetes.client.openapi.models.V1RuleWithOperations... items) {
    if (this.rules == null) {this.rules = new ArrayList<V1RuleWithOperationsBuilder>();}
    for (V1RuleWithOperations item : items) {V1RuleWithOperationsBuilder builder = new V1RuleWithOperationsBuilder(item);_visitables.get("rules").add(builder);this.rules.add(builder);} return (A)this;
  }
  
  public A addAllToRules(Collection<V1RuleWithOperations> items) {
    if (this.rules == null) {this.rules = new ArrayList<V1RuleWithOperationsBuilder>();}
    for (V1RuleWithOperations item : items) {V1RuleWithOperationsBuilder builder = new V1RuleWithOperationsBuilder(item);_visitables.get("rules").add(builder);this.rules.add(builder);} return (A)this;
  }
  
  public A removeFromRules(io.kubernetes.client.openapi.models.V1RuleWithOperations... items) {
    if (this.rules == null) return (A)this;
    for (V1RuleWithOperations item : items) {V1RuleWithOperationsBuilder builder = new V1RuleWithOperationsBuilder(item);_visitables.get("rules").remove(builder); this.rules.remove(builder);} return (A)this;
  }
  
  public A removeAllFromRules(Collection<V1RuleWithOperations> items) {
    if (this.rules == null) return (A)this;
    for (V1RuleWithOperations item : items) {V1RuleWithOperationsBuilder builder = new V1RuleWithOperationsBuilder(item);_visitables.get("rules").remove(builder); this.rules.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromRules(Predicate<V1RuleWithOperationsBuilder> predicate) {
    if (rules == null) return (A) this;
    final Iterator<V1RuleWithOperationsBuilder> each = rules.iterator();
    final List visitables = _visitables.get("rules");
    while (each.hasNext()) {
      V1RuleWithOperationsBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1RuleWithOperations> buildRules() {
    return this.rules != null ? build(rules) : null;
  }
  
  public V1RuleWithOperations buildRule(int index) {
    return this.rules.get(index).build();
  }
  
  public V1RuleWithOperations buildFirstRule() {
    return this.rules.get(0).build();
  }
  
  public V1RuleWithOperations buildLastRule() {
    return this.rules.get(rules.size() - 1).build();
  }
  
  public V1RuleWithOperations buildMatchingRule(Predicate<V1RuleWithOperationsBuilder> predicate) {
      for (V1RuleWithOperationsBuilder item : rules) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingRule(Predicate<V1RuleWithOperationsBuilder> predicate) {
      for (V1RuleWithOperationsBuilder item : rules) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withRules(List<V1RuleWithOperations> rules) {
    if (this.rules != null) {
      this._visitables.get("rules").clear();
    }
    if (rules != null) {
        this.rules = new ArrayList();
        for (V1RuleWithOperations item : rules) {
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
        _visitables.remove("rules");
    }
    if (rules != null) {
      for (V1RuleWithOperations item : rules) {
        this.addToRules(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasRules() {
    return this.rules != null && !this.rules.isEmpty();
  }
  
  public RulesNested<A> addNewRule() {
    return new RulesNested(-1, null);
  }
  
  public RulesNested<A> addNewRuleLike(V1RuleWithOperations item) {
    return new RulesNested(-1, item);
  }
  
  public RulesNested<A> setNewRuleLike(int index,V1RuleWithOperations item) {
    return new RulesNested(index, item);
  }
  
  public RulesNested<A> editRule(int index) {
    if (rules.size() <= index) throw new RuntimeException("Can't edit rules. Index exceeds size.");
    return setNewRuleLike(index, buildRule(index));
  }
  
  public RulesNested<A> editFirstRule() {
    if (rules.size() == 0) throw new RuntimeException("Can't edit first rules. The list is empty.");
    return setNewRuleLike(0, buildRule(0));
  }
  
  public RulesNested<A> editLastRule() {
    int index = rules.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last rules. The list is empty.");
    return setNewRuleLike(index, buildRule(index));
  }
  
  public RulesNested<A> editMatchingRule(Predicate<V1RuleWithOperationsBuilder> predicate) {
    int index = -1;
    for (int i=0;i<rules.size();i++) { 
    if (predicate.test(rules.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching rules. No match found.");
    return setNewRuleLike(index, buildRule(index));
  }
  
  public String getSideEffects() {
    return this.sideEffects;
  }
  
  public A withSideEffects(String sideEffects) {
    this.sideEffects = sideEffects;
    return (A) this;
  }
  
  public boolean hasSideEffects() {
    return this.sideEffects != null;
  }
  
  public Integer getTimeoutSeconds() {
    return this.timeoutSeconds;
  }
  
  public A withTimeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
    return (A) this;
  }
  
  public boolean hasTimeoutSeconds() {
    return this.timeoutSeconds != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ValidatingWebhookFluent that = (V1ValidatingWebhookFluent) o;
    if (!java.util.Objects.equals(admissionReviewVersions, that.admissionReviewVersions)) return false;
    if (!java.util.Objects.equals(clientConfig, that.clientConfig)) return false;
    if (!java.util.Objects.equals(failurePolicy, that.failurePolicy)) return false;
    if (!java.util.Objects.equals(matchConditions, that.matchConditions)) return false;
    if (!java.util.Objects.equals(matchPolicy, that.matchPolicy)) return false;
    if (!java.util.Objects.equals(name, that.name)) return false;
    if (!java.util.Objects.equals(namespaceSelector, that.namespaceSelector)) return false;
    if (!java.util.Objects.equals(objectSelector, that.objectSelector)) return false;
    if (!java.util.Objects.equals(rules, that.rules)) return false;
    if (!java.util.Objects.equals(sideEffects, that.sideEffects)) return false;
    if (!java.util.Objects.equals(timeoutSeconds, that.timeoutSeconds)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(admissionReviewVersions,  clientConfig,  failurePolicy,  matchConditions,  matchPolicy,  name,  namespaceSelector,  objectSelector,  rules,  sideEffects,  timeoutSeconds,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (admissionReviewVersions != null && !admissionReviewVersions.isEmpty()) { sb.append("admissionReviewVersions:"); sb.append(admissionReviewVersions + ","); }
    if (clientConfig != null) { sb.append("clientConfig:"); sb.append(clientConfig + ","); }
    if (failurePolicy != null) { sb.append("failurePolicy:"); sb.append(failurePolicy + ","); }
    if (matchConditions != null && !matchConditions.isEmpty()) { sb.append("matchConditions:"); sb.append(matchConditions + ","); }
    if (matchPolicy != null) { sb.append("matchPolicy:"); sb.append(matchPolicy + ","); }
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (namespaceSelector != null) { sb.append("namespaceSelector:"); sb.append(namespaceSelector + ","); }
    if (objectSelector != null) { sb.append("objectSelector:"); sb.append(objectSelector + ","); }
    if (rules != null && !rules.isEmpty()) { sb.append("rules:"); sb.append(rules + ","); }
    if (sideEffects != null) { sb.append("sideEffects:"); sb.append(sideEffects + ","); }
    if (timeoutSeconds != null) { sb.append("timeoutSeconds:"); sb.append(timeoutSeconds); }
    sb.append("}");
    return sb.toString();
  }
  public class ClientConfigNested<N> extends AdmissionregistrationV1WebhookClientConfigFluent<ClientConfigNested<N>> implements Nested<N>{
    ClientConfigNested(AdmissionregistrationV1WebhookClientConfig item) {
      this.builder = new AdmissionregistrationV1WebhookClientConfigBuilder(this, item);
    }
    AdmissionregistrationV1WebhookClientConfigBuilder builder;
    
    public N and() {
      return (N) V1ValidatingWebhookFluent.this.withClientConfig(builder.build());
    }
    
    public N endClientConfig() {
      return and();
    }
    
  
  }
  public class MatchConditionsNested<N> extends V1MatchConditionFluent<MatchConditionsNested<N>> implements Nested<N>{
    MatchConditionsNested(int index,V1MatchCondition item) {
      this.index = index;
      this.builder = new V1MatchConditionBuilder(this, item);
    }
    V1MatchConditionBuilder builder;
    int index;
    
    public N and() {
      return (N) V1ValidatingWebhookFluent.this.setToMatchConditions(index,builder.build());
    }
    
    public N endMatchCondition() {
      return and();
    }
    
  
  }
  public class NamespaceSelectorNested<N> extends V1LabelSelectorFluent<NamespaceSelectorNested<N>> implements Nested<N>{
    NamespaceSelectorNested(V1LabelSelector item) {
      this.builder = new V1LabelSelectorBuilder(this, item);
    }
    V1LabelSelectorBuilder builder;
    
    public N and() {
      return (N) V1ValidatingWebhookFluent.this.withNamespaceSelector(builder.build());
    }
    
    public N endNamespaceSelector() {
      return and();
    }
    
  
  }
  public class ObjectSelectorNested<N> extends V1LabelSelectorFluent<ObjectSelectorNested<N>> implements Nested<N>{
    ObjectSelectorNested(V1LabelSelector item) {
      this.builder = new V1LabelSelectorBuilder(this, item);
    }
    V1LabelSelectorBuilder builder;
    
    public N and() {
      return (N) V1ValidatingWebhookFluent.this.withObjectSelector(builder.build());
    }
    
    public N endObjectSelector() {
      return and();
    }
    
  
  }
  public class RulesNested<N> extends V1RuleWithOperationsFluent<RulesNested<N>> implements Nested<N>{
    RulesNested(int index,V1RuleWithOperations item) {
      this.index = index;
      this.builder = new V1RuleWithOperationsBuilder(this, item);
    }
    V1RuleWithOperationsBuilder builder;
    int index;
    
    public N and() {
      return (N) V1ValidatingWebhookFluent.this.setToRules(index,builder.build());
    }
    
    public N endRule() {
      return and();
    }
    
  
  }

}