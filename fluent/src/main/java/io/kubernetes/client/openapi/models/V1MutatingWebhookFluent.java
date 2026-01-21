package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Integer;
import java.lang.Object;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1MutatingWebhookFluent<A extends io.kubernetes.client.openapi.models.V1MutatingWebhookFluent<A>> extends BaseFluent<A>{

  private List<String> admissionReviewVersions;
  private AdmissionregistrationV1WebhookClientConfigBuilder clientConfig;
  private String failurePolicy;
  private ArrayList<V1MatchConditionBuilder> matchConditions;
  private String matchPolicy;
  private String name;
  private V1LabelSelectorBuilder namespaceSelector;
  private V1LabelSelectorBuilder objectSelector;
  private String reinvocationPolicy;
  private ArrayList<V1RuleWithOperationsBuilder> rules;
  private String sideEffects;
  private Integer timeoutSeconds;

  public V1MutatingWebhookFluent() {
  }
  
  public V1MutatingWebhookFluent(V1MutatingWebhook instance) {
    this.copyInstance(instance);
  }

  public A addAllToAdmissionReviewVersions(Collection<String> items) {
    if (this.admissionReviewVersions == null) {
      this.admissionReviewVersions = new ArrayList();
    }
    for (String item : items) {
      this.admissionReviewVersions.add(item);
    }
    return (A) this;
  }
  
  public A addAllToMatchConditions(Collection<V1MatchCondition> items) {
    if (this.matchConditions == null) {
      this.matchConditions = new ArrayList();
    }
    for (V1MatchCondition item : items) {
        V1MatchConditionBuilder builder = new V1MatchConditionBuilder(item);
        _visitables.get("matchConditions").add(builder);
        this.matchConditions.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToRules(Collection<V1RuleWithOperations> items) {
    if (this.rules == null) {
      this.rules = new ArrayList();
    }
    for (V1RuleWithOperations item : items) {
        V1RuleWithOperationsBuilder builder = new V1RuleWithOperationsBuilder(item);
        _visitables.get("rules").add(builder);
        this.rules.add(builder);
    }
    return (A) this;
  }
  
  public MatchConditionsNested<A> addNewMatchCondition() {
    return new MatchConditionsNested(-1, null);
  }
  
  public MatchConditionsNested<A> addNewMatchConditionLike(V1MatchCondition item) {
    return new MatchConditionsNested(-1, item);
  }
  
  public RulesNested<A> addNewRule() {
    return new RulesNested(-1, null);
  }
  
  public RulesNested<A> addNewRuleLike(V1RuleWithOperations item) {
    return new RulesNested(-1, item);
  }
  
  public A addToAdmissionReviewVersions(String... items) {
    if (this.admissionReviewVersions == null) {
      this.admissionReviewVersions = new ArrayList();
    }
    for (String item : items) {
      this.admissionReviewVersions.add(item);
    }
    return (A) this;
  }
  
  public A addToAdmissionReviewVersions(int index,String item) {
    if (this.admissionReviewVersions == null) {
      this.admissionReviewVersions = new ArrayList();
    }
    this.admissionReviewVersions.add(index, item);
    return (A) this;
  }
  
  public A addToMatchConditions(V1MatchCondition... items) {
    if (this.matchConditions == null) {
      this.matchConditions = new ArrayList();
    }
    for (V1MatchCondition item : items) {
        V1MatchConditionBuilder builder = new V1MatchConditionBuilder(item);
        _visitables.get("matchConditions").add(builder);
        this.matchConditions.add(builder);
    }
    return (A) this;
  }
  
  public A addToMatchConditions(int index,V1MatchCondition item) {
    if (this.matchConditions == null) {
      this.matchConditions = new ArrayList();
    }
    V1MatchConditionBuilder builder = new V1MatchConditionBuilder(item);
    if (index < 0 || index >= matchConditions.size()) {
        _visitables.get("matchConditions").add(builder);
        matchConditions.add(builder);
    } else {
        _visitables.get("matchConditions").add(builder);
        matchConditions.add(index, builder);
    }
    return (A) this;
  }
  
  public A addToRules(V1RuleWithOperations... items) {
    if (this.rules == null) {
      this.rules = new ArrayList();
    }
    for (V1RuleWithOperations item : items) {
        V1RuleWithOperationsBuilder builder = new V1RuleWithOperationsBuilder(item);
        _visitables.get("rules").add(builder);
        this.rules.add(builder);
    }
    return (A) this;
  }
  
  public A addToRules(int index,V1RuleWithOperations item) {
    if (this.rules == null) {
      this.rules = new ArrayList();
    }
    V1RuleWithOperationsBuilder builder = new V1RuleWithOperationsBuilder(item);
    if (index < 0 || index >= rules.size()) {
        _visitables.get("rules").add(builder);
        rules.add(builder);
    } else {
        _visitables.get("rules").add(builder);
        rules.add(index, builder);
    }
    return (A) this;
  }
  
  public AdmissionregistrationV1WebhookClientConfig buildClientConfig() {
    return this.clientConfig != null ? this.clientConfig.build() : null;
  }
  
  public V1MatchCondition buildFirstMatchCondition() {
    return this.matchConditions.get(0).build();
  }
  
  public V1RuleWithOperations buildFirstRule() {
    return this.rules.get(0).build();
  }
  
  public V1MatchCondition buildLastMatchCondition() {
    return this.matchConditions.get(matchConditions.size() - 1).build();
  }
  
  public V1RuleWithOperations buildLastRule() {
    return this.rules.get(rules.size() - 1).build();
  }
  
  public V1MatchCondition buildMatchCondition(int index) {
    return this.matchConditions.get(index).build();
  }
  
  public List<V1MatchCondition> buildMatchConditions() {
    return this.matchConditions != null ? build(matchConditions) : null;
  }
  
  public V1MatchCondition buildMatchingMatchCondition(Predicate<V1MatchConditionBuilder> predicate) {
      for (V1MatchConditionBuilder item : matchConditions) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public V1RuleWithOperations buildMatchingRule(Predicate<V1RuleWithOperationsBuilder> predicate) {
      for (V1RuleWithOperationsBuilder item : rules) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public V1LabelSelector buildNamespaceSelector() {
    return this.namespaceSelector != null ? this.namespaceSelector.build() : null;
  }
  
  public V1LabelSelector buildObjectSelector() {
    return this.objectSelector != null ? this.objectSelector.build() : null;
  }
  
  public V1RuleWithOperations buildRule(int index) {
    return this.rules.get(index).build();
  }
  
  public List<V1RuleWithOperations> buildRules() {
    return this.rules != null ? build(rules) : null;
  }
  
  protected void copyInstance(V1MutatingWebhook instance) {
    instance = instance != null ? instance : new V1MutatingWebhook();
    if (instance != null) {
        this.withAdmissionReviewVersions(instance.getAdmissionReviewVersions());
        this.withClientConfig(instance.getClientConfig());
        this.withFailurePolicy(instance.getFailurePolicy());
        this.withMatchConditions(instance.getMatchConditions());
        this.withMatchPolicy(instance.getMatchPolicy());
        this.withName(instance.getName());
        this.withNamespaceSelector(instance.getNamespaceSelector());
        this.withObjectSelector(instance.getObjectSelector());
        this.withReinvocationPolicy(instance.getReinvocationPolicy());
        this.withRules(instance.getRules());
        this.withSideEffects(instance.getSideEffects());
        this.withTimeoutSeconds(instance.getTimeoutSeconds());
    }
  }
  
  public ClientConfigNested<A> editClientConfig() {
    return this.withNewClientConfigLike(Optional.ofNullable(this.buildClientConfig()).orElse(null));
  }
  
  public MatchConditionsNested<A> editFirstMatchCondition() {
    if (matchConditions.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "matchConditions"));
    }
    return this.setNewMatchConditionLike(0, this.buildMatchCondition(0));
  }
  
  public RulesNested<A> editFirstRule() {
    if (rules.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "rules"));
    }
    return this.setNewRuleLike(0, this.buildRule(0));
  }
  
  public MatchConditionsNested<A> editLastMatchCondition() {
    int index = matchConditions.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "matchConditions"));
    }
    return this.setNewMatchConditionLike(index, this.buildMatchCondition(index));
  }
  
  public RulesNested<A> editLastRule() {
    int index = rules.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "rules"));
    }
    return this.setNewRuleLike(index, this.buildRule(index));
  }
  
  public MatchConditionsNested<A> editMatchCondition(int index) {
    if (matchConditions.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "matchConditions"));
    }
    return this.setNewMatchConditionLike(index, this.buildMatchCondition(index));
  }
  
  public MatchConditionsNested<A> editMatchingMatchCondition(Predicate<V1MatchConditionBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < matchConditions.size();i++) {
      if (predicate.test(matchConditions.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "matchConditions"));
    }
    return this.setNewMatchConditionLike(index, this.buildMatchCondition(index));
  }
  
  public RulesNested<A> editMatchingRule(Predicate<V1RuleWithOperationsBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < rules.size();i++) {
      if (predicate.test(rules.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "rules"));
    }
    return this.setNewRuleLike(index, this.buildRule(index));
  }
  
  public NamespaceSelectorNested<A> editNamespaceSelector() {
    return this.withNewNamespaceSelectorLike(Optional.ofNullable(this.buildNamespaceSelector()).orElse(null));
  }
  
  public ObjectSelectorNested<A> editObjectSelector() {
    return this.withNewObjectSelectorLike(Optional.ofNullable(this.buildObjectSelector()).orElse(null));
  }
  
  public ClientConfigNested<A> editOrNewClientConfig() {
    return this.withNewClientConfigLike(Optional.ofNullable(this.buildClientConfig()).orElse(new AdmissionregistrationV1WebhookClientConfigBuilder().build()));
  }
  
  public ClientConfigNested<A> editOrNewClientConfigLike(AdmissionregistrationV1WebhookClientConfig item) {
    return this.withNewClientConfigLike(Optional.ofNullable(this.buildClientConfig()).orElse(item));
  }
  
  public NamespaceSelectorNested<A> editOrNewNamespaceSelector() {
    return this.withNewNamespaceSelectorLike(Optional.ofNullable(this.buildNamespaceSelector()).orElse(new V1LabelSelectorBuilder().build()));
  }
  
  public NamespaceSelectorNested<A> editOrNewNamespaceSelectorLike(V1LabelSelector item) {
    return this.withNewNamespaceSelectorLike(Optional.ofNullable(this.buildNamespaceSelector()).orElse(item));
  }
  
  public ObjectSelectorNested<A> editOrNewObjectSelector() {
    return this.withNewObjectSelectorLike(Optional.ofNullable(this.buildObjectSelector()).orElse(new V1LabelSelectorBuilder().build()));
  }
  
  public ObjectSelectorNested<A> editOrNewObjectSelectorLike(V1LabelSelector item) {
    return this.withNewObjectSelectorLike(Optional.ofNullable(this.buildObjectSelector()).orElse(item));
  }
  
  public RulesNested<A> editRule(int index) {
    if (rules.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "rules"));
    }
    return this.setNewRuleLike(index, this.buildRule(index));
  }
  
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }
    if (!(super.equals(o))) {
      return false;
    }
    V1MutatingWebhookFluent that = (V1MutatingWebhookFluent) o;
    if (!(Objects.equals(admissionReviewVersions, that.admissionReviewVersions))) {
      return false;
    }
    if (!(Objects.equals(clientConfig, that.clientConfig))) {
      return false;
    }
    if (!(Objects.equals(failurePolicy, that.failurePolicy))) {
      return false;
    }
    if (!(Objects.equals(matchConditions, that.matchConditions))) {
      return false;
    }
    if (!(Objects.equals(matchPolicy, that.matchPolicy))) {
      return false;
    }
    if (!(Objects.equals(name, that.name))) {
      return false;
    }
    if (!(Objects.equals(namespaceSelector, that.namespaceSelector))) {
      return false;
    }
    if (!(Objects.equals(objectSelector, that.objectSelector))) {
      return false;
    }
    if (!(Objects.equals(reinvocationPolicy, that.reinvocationPolicy))) {
      return false;
    }
    if (!(Objects.equals(rules, that.rules))) {
      return false;
    }
    if (!(Objects.equals(sideEffects, that.sideEffects))) {
      return false;
    }
    if (!(Objects.equals(timeoutSeconds, that.timeoutSeconds))) {
      return false;
    }
    return true;
  }
  
  public String getAdmissionReviewVersion(int index) {
    return this.admissionReviewVersions.get(index);
  }
  
  public List<String> getAdmissionReviewVersions() {
    return this.admissionReviewVersions;
  }
  
  public String getFailurePolicy() {
    return this.failurePolicy;
  }
  
  public String getFirstAdmissionReviewVersion() {
    return this.admissionReviewVersions.get(0);
  }
  
  public String getLastAdmissionReviewVersion() {
    return this.admissionReviewVersions.get(admissionReviewVersions.size() - 1);
  }
  
  public String getMatchPolicy() {
    return this.matchPolicy;
  }
  
  public String getMatchingAdmissionReviewVersion(Predicate<String> predicate) {
      for (String item : admissionReviewVersions) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public String getName() {
    return this.name;
  }
  
  public String getReinvocationPolicy() {
    return this.reinvocationPolicy;
  }
  
  public String getSideEffects() {
    return this.sideEffects;
  }
  
  public Integer getTimeoutSeconds() {
    return this.timeoutSeconds;
  }
  
  public boolean hasAdmissionReviewVersions() {
    return this.admissionReviewVersions != null && !(this.admissionReviewVersions.isEmpty());
  }
  
  public boolean hasClientConfig() {
    return this.clientConfig != null;
  }
  
  public boolean hasFailurePolicy() {
    return this.failurePolicy != null;
  }
  
  public boolean hasMatchConditions() {
    return this.matchConditions != null && !(this.matchConditions.isEmpty());
  }
  
  public boolean hasMatchPolicy() {
    return this.matchPolicy != null;
  }
  
  public boolean hasMatchingAdmissionReviewVersion(Predicate<String> predicate) {
      for (String item : admissionReviewVersions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasMatchingMatchCondition(Predicate<V1MatchConditionBuilder> predicate) {
      for (V1MatchConditionBuilder item : matchConditions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasMatchingRule(Predicate<V1RuleWithOperationsBuilder> predicate) {
      for (V1RuleWithOperationsBuilder item : rules) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public boolean hasNamespaceSelector() {
    return this.namespaceSelector != null;
  }
  
  public boolean hasObjectSelector() {
    return this.objectSelector != null;
  }
  
  public boolean hasReinvocationPolicy() {
    return this.reinvocationPolicy != null;
  }
  
  public boolean hasRules() {
    return this.rules != null && !(this.rules.isEmpty());
  }
  
  public boolean hasSideEffects() {
    return this.sideEffects != null;
  }
  
  public boolean hasTimeoutSeconds() {
    return this.timeoutSeconds != null;
  }
  
  public int hashCode() {
    return Objects.hash(admissionReviewVersions, clientConfig, failurePolicy, matchConditions, matchPolicy, name, namespaceSelector, objectSelector, reinvocationPolicy, rules, sideEffects, timeoutSeconds);
  }
  
  public A removeAllFromAdmissionReviewVersions(Collection<String> items) {
    if (this.admissionReviewVersions == null) {
      return (A) this;
    }
    for (String item : items) {
      this.admissionReviewVersions.remove(item);
    }
    return (A) this;
  }
  
  public A removeAllFromMatchConditions(Collection<V1MatchCondition> items) {
    if (this.matchConditions == null) {
      return (A) this;
    }
    for (V1MatchCondition item : items) {
        V1MatchConditionBuilder builder = new V1MatchConditionBuilder(item);
        _visitables.get("matchConditions").remove(builder);
        this.matchConditions.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromRules(Collection<V1RuleWithOperations> items) {
    if (this.rules == null) {
      return (A) this;
    }
    for (V1RuleWithOperations item : items) {
        V1RuleWithOperationsBuilder builder = new V1RuleWithOperationsBuilder(item);
        _visitables.get("rules").remove(builder);
        this.rules.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromAdmissionReviewVersions(String... items) {
    if (this.admissionReviewVersions == null) {
      return (A) this;
    }
    for (String item : items) {
      this.admissionReviewVersions.remove(item);
    }
    return (A) this;
  }
  
  public A removeFromMatchConditions(V1MatchCondition... items) {
    if (this.matchConditions == null) {
      return (A) this;
    }
    for (V1MatchCondition item : items) {
        V1MatchConditionBuilder builder = new V1MatchConditionBuilder(item);
        _visitables.get("matchConditions").remove(builder);
        this.matchConditions.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromRules(V1RuleWithOperations... items) {
    if (this.rules == null) {
      return (A) this;
    }
    for (V1RuleWithOperations item : items) {
        V1RuleWithOperationsBuilder builder = new V1RuleWithOperationsBuilder(item);
        _visitables.get("rules").remove(builder);
        this.rules.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromMatchConditions(Predicate<V1MatchConditionBuilder> predicate) {
    if (matchConditions == null) {
      return (A) this;
    }
    Iterator<V1MatchConditionBuilder> each = matchConditions.iterator();
    List visitables = _visitables.get("matchConditions");
    while (each.hasNext()) {
        V1MatchConditionBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public A removeMatchingFromRules(Predicate<V1RuleWithOperationsBuilder> predicate) {
    if (rules == null) {
      return (A) this;
    }
    Iterator<V1RuleWithOperationsBuilder> each = rules.iterator();
    List visitables = _visitables.get("rules");
    while (each.hasNext()) {
        V1RuleWithOperationsBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public MatchConditionsNested<A> setNewMatchConditionLike(int index,V1MatchCondition item) {
    return new MatchConditionsNested(index, item);
  }
  
  public RulesNested<A> setNewRuleLike(int index,V1RuleWithOperations item) {
    return new RulesNested(index, item);
  }
  
  public A setToAdmissionReviewVersions(int index,String item) {
    if (this.admissionReviewVersions == null) {
      this.admissionReviewVersions = new ArrayList();
    }
    this.admissionReviewVersions.set(index, item);
    return (A) this;
  }
  
  public A setToMatchConditions(int index,V1MatchCondition item) {
    if (this.matchConditions == null) {
      this.matchConditions = new ArrayList();
    }
    V1MatchConditionBuilder builder = new V1MatchConditionBuilder(item);
    if (index < 0 || index >= matchConditions.size()) {
        _visitables.get("matchConditions").add(builder);
        matchConditions.add(builder);
    } else {
        _visitables.get("matchConditions").add(builder);
        matchConditions.set(index, builder);
    }
    return (A) this;
  }
  
  public A setToRules(int index,V1RuleWithOperations item) {
    if (this.rules == null) {
      this.rules = new ArrayList();
    }
    V1RuleWithOperationsBuilder builder = new V1RuleWithOperationsBuilder(item);
    if (index < 0 || index >= rules.size()) {
        _visitables.get("rules").add(builder);
        rules.add(builder);
    } else {
        _visitables.get("rules").add(builder);
        rules.set(index, builder);
    }
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(admissionReviewVersions == null) && !(admissionReviewVersions.isEmpty())) {
        sb.append("admissionReviewVersions:");
        sb.append(admissionReviewVersions);
        sb.append(",");
    }
    if (!(clientConfig == null)) {
        sb.append("clientConfig:");
        sb.append(clientConfig);
        sb.append(",");
    }
    if (!(failurePolicy == null)) {
        sb.append("failurePolicy:");
        sb.append(failurePolicy);
        sb.append(",");
    }
    if (!(matchConditions == null) && !(matchConditions.isEmpty())) {
        sb.append("matchConditions:");
        sb.append(matchConditions);
        sb.append(",");
    }
    if (!(matchPolicy == null)) {
        sb.append("matchPolicy:");
        sb.append(matchPolicy);
        sb.append(",");
    }
    if (!(name == null)) {
        sb.append("name:");
        sb.append(name);
        sb.append(",");
    }
    if (!(namespaceSelector == null)) {
        sb.append("namespaceSelector:");
        sb.append(namespaceSelector);
        sb.append(",");
    }
    if (!(objectSelector == null)) {
        sb.append("objectSelector:");
        sb.append(objectSelector);
        sb.append(",");
    }
    if (!(reinvocationPolicy == null)) {
        sb.append("reinvocationPolicy:");
        sb.append(reinvocationPolicy);
        sb.append(",");
    }
    if (!(rules == null) && !(rules.isEmpty())) {
        sb.append("rules:");
        sb.append(rules);
        sb.append(",");
    }
    if (!(sideEffects == null)) {
        sb.append("sideEffects:");
        sb.append(sideEffects);
        sb.append(",");
    }
    if (!(timeoutSeconds == null)) {
        sb.append("timeoutSeconds:");
        sb.append(timeoutSeconds);
    }
    sb.append("}");
    return sb.toString();
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
  
  public A withAdmissionReviewVersions(String... admissionReviewVersions) {
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
  
  public A withFailurePolicy(String failurePolicy) {
    this.failurePolicy = failurePolicy;
    return (A) this;
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
  
  public A withMatchConditions(V1MatchCondition... matchConditions) {
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
  
  public A withMatchPolicy(String matchPolicy) {
    this.matchPolicy = matchPolicy;
    return (A) this;
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
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
  
  public ClientConfigNested<A> withNewClientConfig() {
    return new ClientConfigNested(null);
  }
  
  public ClientConfigNested<A> withNewClientConfigLike(AdmissionregistrationV1WebhookClientConfig item) {
    return new ClientConfigNested(item);
  }
  
  public NamespaceSelectorNested<A> withNewNamespaceSelector() {
    return new NamespaceSelectorNested(null);
  }
  
  public NamespaceSelectorNested<A> withNewNamespaceSelectorLike(V1LabelSelector item) {
    return new NamespaceSelectorNested(item);
  }
  
  public ObjectSelectorNested<A> withNewObjectSelector() {
    return new ObjectSelectorNested(null);
  }
  
  public ObjectSelectorNested<A> withNewObjectSelectorLike(V1LabelSelector item) {
    return new ObjectSelectorNested(item);
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
  
  public A withReinvocationPolicy(String reinvocationPolicy) {
    this.reinvocationPolicy = reinvocationPolicy;
    return (A) this;
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
  
  public A withRules(V1RuleWithOperations... rules) {
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
  
  public A withSideEffects(String sideEffects) {
    this.sideEffects = sideEffects;
    return (A) this;
  }
  
  public A withTimeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
    return (A) this;
  }
  public class ClientConfigNested<N> extends AdmissionregistrationV1WebhookClientConfigFluent<ClientConfigNested<N>> implements Nested<N>{
  
    AdmissionregistrationV1WebhookClientConfigBuilder builder;
  
    ClientConfigNested(AdmissionregistrationV1WebhookClientConfig item) {
      this.builder = new AdmissionregistrationV1WebhookClientConfigBuilder(this, item);
    }
  
    public N and() {
      return (N) V1MutatingWebhookFluent.this.withClientConfig(builder.build());
    }
    
    public N endClientConfig() {
      return and();
    }
    
  }
  public class MatchConditionsNested<N> extends V1MatchConditionFluent<MatchConditionsNested<N>> implements Nested<N>{
  
    V1MatchConditionBuilder builder;
    int index;
  
    MatchConditionsNested(int index,V1MatchCondition item) {
      this.index = index;
      this.builder = new V1MatchConditionBuilder(this, item);
    }
  
    public N and() {
      return (N) V1MutatingWebhookFluent.this.setToMatchConditions(index, builder.build());
    }
    
    public N endMatchCondition() {
      return and();
    }
    
  }
  public class NamespaceSelectorNested<N> extends V1LabelSelectorFluent<NamespaceSelectorNested<N>> implements Nested<N>{
  
    V1LabelSelectorBuilder builder;
  
    NamespaceSelectorNested(V1LabelSelector item) {
      this.builder = new V1LabelSelectorBuilder(this, item);
    }
  
    public N and() {
      return (N) V1MutatingWebhookFluent.this.withNamespaceSelector(builder.build());
    }
    
    public N endNamespaceSelector() {
      return and();
    }
    
  }
  public class ObjectSelectorNested<N> extends V1LabelSelectorFluent<ObjectSelectorNested<N>> implements Nested<N>{
  
    V1LabelSelectorBuilder builder;
  
    ObjectSelectorNested(V1LabelSelector item) {
      this.builder = new V1LabelSelectorBuilder(this, item);
    }
  
    public N and() {
      return (N) V1MutatingWebhookFluent.this.withObjectSelector(builder.build());
    }
    
    public N endObjectSelector() {
      return and();
    }
    
  }
  public class RulesNested<N> extends V1RuleWithOperationsFluent<RulesNested<N>> implements Nested<N>{
  
    V1RuleWithOperationsBuilder builder;
    int index;
  
    RulesNested(int index,V1RuleWithOperations item) {
      this.index = index;
      this.builder = new V1RuleWithOperationsBuilder(this, item);
    }
  
    public N and() {
      return (N) V1MutatingWebhookFluent.this.setToRules(index, builder.build());
    }
    
    public N endRule() {
      return and();
    }
    
  }
}