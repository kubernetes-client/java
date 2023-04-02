package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Collection;
import java.lang.Object;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1MutatingWebhookFluentImpl<A extends V1MutatingWebhookFluent<A>> extends BaseFluent<A> implements V1MutatingWebhookFluent<A>{
  public V1MutatingWebhookFluentImpl() {
  }
  public V1MutatingWebhookFluentImpl(V1MutatingWebhook instance) {
    this.withAdmissionReviewVersions(instance.getAdmissionReviewVersions());

    this.withClientConfig(instance.getClientConfig());

    this.withFailurePolicy(instance.getFailurePolicy());

    this.withMatchPolicy(instance.getMatchPolicy());

    this.withName(instance.getName());

    this.withNamespaceSelector(instance.getNamespaceSelector());

    this.withObjectSelector(instance.getObjectSelector());

    this.withReinvocationPolicy(instance.getReinvocationPolicy());

    this.withRules(instance.getRules());

    this.withSideEffects(instance.getSideEffects());

    this.withTimeoutSeconds(instance.getTimeoutSeconds());

  }
  private List<String> admissionReviewVersions;
  private AdmissionregistrationV1WebhookClientConfigBuilder clientConfig;
  private String failurePolicy;
  private String matchPolicy;
  private String name;
  private V1LabelSelectorBuilder namespaceSelector;
  private V1LabelSelectorBuilder objectSelector;
  private String reinvocationPolicy;
  private ArrayList<V1RuleWithOperationsBuilder> rules;
  private String sideEffects;
  private Integer timeoutSeconds;
  public A addToAdmissionReviewVersions(Integer index,String item) {
    if (this.admissionReviewVersions == null) {this.admissionReviewVersions = new ArrayList<String>();}
    this.admissionReviewVersions.add(index, item);
    return (A)this;
  }
  public A setToAdmissionReviewVersions(Integer index,String item) {
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
    for (String item : items) {if (this.admissionReviewVersions!= null){ this.admissionReviewVersions.remove(item);}} return (A)this;
  }
  public A removeAllFromAdmissionReviewVersions(Collection<String> items) {
    for (String item : items) {if (this.admissionReviewVersions!= null){ this.admissionReviewVersions.remove(item);}} return (A)this;
  }
  public List<String> getAdmissionReviewVersions() {
    return this.admissionReviewVersions;
  }
  public String getAdmissionReviewVersion(Integer index) {
    return this.admissionReviewVersions.get(index);
  }
  public String getFirstAdmissionReviewVersion() {
    return this.admissionReviewVersions.get(0);
  }
  public String getLastAdmissionReviewVersion() {
    return this.admissionReviewVersions.get(admissionReviewVersions.size() - 1);
  }
  public String getMatchingAdmissionReviewVersion(Predicate<String> predicate) {
    for (String item: admissionReviewVersions) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingAdmissionReviewVersion(Predicate<String> predicate) {
    for (String item: admissionReviewVersions) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withAdmissionReviewVersions(List<String> admissionReviewVersions) {
    if (admissionReviewVersions != null) {this.admissionReviewVersions = new ArrayList(); for (String item : admissionReviewVersions){this.addToAdmissionReviewVersions(item);}} else { this.admissionReviewVersions = null;} return (A) this;
  }
  public A withAdmissionReviewVersions(java.lang.String... admissionReviewVersions) {
    if (this.admissionReviewVersions != null) {this.admissionReviewVersions.clear();}
    if (admissionReviewVersions != null) {for (String item :admissionReviewVersions){ this.addToAdmissionReviewVersions(item);}} return (A) this;
  }
  public Boolean hasAdmissionReviewVersions() {
    return admissionReviewVersions != null && !admissionReviewVersions.isEmpty();
  }
  
  /**
   * This method has been deprecated, please use method buildClientConfig instead.
   * @return The buildable object.
   */
  @Deprecated
  public AdmissionregistrationV1WebhookClientConfig getClientConfig() {
    return this.clientConfig!=null ?this.clientConfig.build():null;
  }
  public AdmissionregistrationV1WebhookClientConfig buildClientConfig() {
    return this.clientConfig!=null ?this.clientConfig.build():null;
  }
  public A withClientConfig(AdmissionregistrationV1WebhookClientConfig clientConfig) {
    _visitables.get("clientConfig").remove(this.clientConfig);
    if (clientConfig!=null){ this.clientConfig= new AdmissionregistrationV1WebhookClientConfigBuilder(clientConfig); _visitables.get("clientConfig").add(this.clientConfig);} else { this.clientConfig = null; _visitables.get("clientConfig").remove(this.clientConfig); } return (A) this;
  }
  public Boolean hasClientConfig() {
    return this.clientConfig != null;
  }
  public V1MutatingWebhookFluent.ClientConfigNested<A> withNewClientConfig() {
    return new V1MutatingWebhookFluentImpl.ClientConfigNestedImpl();
  }
  public V1MutatingWebhookFluent.ClientConfigNested<A> withNewClientConfigLike(AdmissionregistrationV1WebhookClientConfig item) {
    return new V1MutatingWebhookFluentImpl.ClientConfigNestedImpl(item);
  }
  public V1MutatingWebhookFluent.ClientConfigNested<A> editClientConfig() {
    return withNewClientConfigLike(getClientConfig());
  }
  public V1MutatingWebhookFluent.ClientConfigNested<A> editOrNewClientConfig() {
    return withNewClientConfigLike(getClientConfig() != null ? getClientConfig(): new AdmissionregistrationV1WebhookClientConfigBuilder().build());
  }
  public V1MutatingWebhookFluent.ClientConfigNested<A> editOrNewClientConfigLike(AdmissionregistrationV1WebhookClientConfig item) {
    return withNewClientConfigLike(getClientConfig() != null ? getClientConfig(): item);
  }
  public String getFailurePolicy() {
    return this.failurePolicy;
  }
  public A withFailurePolicy(String failurePolicy) {
    this.failurePolicy=failurePolicy; return (A) this;
  }
  public Boolean hasFailurePolicy() {
    return this.failurePolicy != null;
  }
  public String getMatchPolicy() {
    return this.matchPolicy;
  }
  public A withMatchPolicy(String matchPolicy) {
    this.matchPolicy=matchPolicy; return (A) this;
  }
  public Boolean hasMatchPolicy() {
    return this.matchPolicy != null;
  }
  public String getName() {
    return this.name;
  }
  public A withName(String name) {
    this.name=name; return (A) this;
  }
  public Boolean hasName() {
    return this.name != null;
  }
  
  /**
   * This method has been deprecated, please use method buildNamespaceSelector instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1LabelSelector getNamespaceSelector() {
    return this.namespaceSelector!=null ?this.namespaceSelector.build():null;
  }
  public V1LabelSelector buildNamespaceSelector() {
    return this.namespaceSelector!=null ?this.namespaceSelector.build():null;
  }
  public A withNamespaceSelector(V1LabelSelector namespaceSelector) {
    _visitables.get("namespaceSelector").remove(this.namespaceSelector);
    if (namespaceSelector!=null){ this.namespaceSelector= new V1LabelSelectorBuilder(namespaceSelector); _visitables.get("namespaceSelector").add(this.namespaceSelector);} else { this.namespaceSelector = null; _visitables.get("namespaceSelector").remove(this.namespaceSelector); } return (A) this;
  }
  public Boolean hasNamespaceSelector() {
    return this.namespaceSelector != null;
  }
  public V1MutatingWebhookFluent.NamespaceSelectorNested<A> withNewNamespaceSelector() {
    return new V1MutatingWebhookFluentImpl.NamespaceSelectorNestedImpl();
  }
  public V1MutatingWebhookFluent.NamespaceSelectorNested<A> withNewNamespaceSelectorLike(V1LabelSelector item) {
    return new V1MutatingWebhookFluentImpl.NamespaceSelectorNestedImpl(item);
  }
  public V1MutatingWebhookFluent.NamespaceSelectorNested<A> editNamespaceSelector() {
    return withNewNamespaceSelectorLike(getNamespaceSelector());
  }
  public V1MutatingWebhookFluent.NamespaceSelectorNested<A> editOrNewNamespaceSelector() {
    return withNewNamespaceSelectorLike(getNamespaceSelector() != null ? getNamespaceSelector(): new V1LabelSelectorBuilder().build());
  }
  public V1MutatingWebhookFluent.NamespaceSelectorNested<A> editOrNewNamespaceSelectorLike(V1LabelSelector item) {
    return withNewNamespaceSelectorLike(getNamespaceSelector() != null ? getNamespaceSelector(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildObjectSelector instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1LabelSelector getObjectSelector() {
    return this.objectSelector!=null ?this.objectSelector.build():null;
  }
  public V1LabelSelector buildObjectSelector() {
    return this.objectSelector!=null ?this.objectSelector.build():null;
  }
  public A withObjectSelector(V1LabelSelector objectSelector) {
    _visitables.get("objectSelector").remove(this.objectSelector);
    if (objectSelector!=null){ this.objectSelector= new V1LabelSelectorBuilder(objectSelector); _visitables.get("objectSelector").add(this.objectSelector);} else { this.objectSelector = null; _visitables.get("objectSelector").remove(this.objectSelector); } return (A) this;
  }
  public Boolean hasObjectSelector() {
    return this.objectSelector != null;
  }
  public V1MutatingWebhookFluent.ObjectSelectorNested<A> withNewObjectSelector() {
    return new V1MutatingWebhookFluentImpl.ObjectSelectorNestedImpl();
  }
  public V1MutatingWebhookFluent.ObjectSelectorNested<A> withNewObjectSelectorLike(V1LabelSelector item) {
    return new V1MutatingWebhookFluentImpl.ObjectSelectorNestedImpl(item);
  }
  public V1MutatingWebhookFluent.ObjectSelectorNested<A> editObjectSelector() {
    return withNewObjectSelectorLike(getObjectSelector());
  }
  public V1MutatingWebhookFluent.ObjectSelectorNested<A> editOrNewObjectSelector() {
    return withNewObjectSelectorLike(getObjectSelector() != null ? getObjectSelector(): new V1LabelSelectorBuilder().build());
  }
  public V1MutatingWebhookFluent.ObjectSelectorNested<A> editOrNewObjectSelectorLike(V1LabelSelector item) {
    return withNewObjectSelectorLike(getObjectSelector() != null ? getObjectSelector(): item);
  }
  public String getReinvocationPolicy() {
    return this.reinvocationPolicy;
  }
  public A withReinvocationPolicy(String reinvocationPolicy) {
    this.reinvocationPolicy=reinvocationPolicy; return (A) this;
  }
  public Boolean hasReinvocationPolicy() {
    return this.reinvocationPolicy != null;
  }
  public A addToRules(Integer index,V1RuleWithOperations item) {
    if (this.rules == null) {this.rules = new ArrayList<V1RuleWithOperationsBuilder>();}
    V1RuleWithOperationsBuilder builder = new V1RuleWithOperationsBuilder(item);_visitables.get("rules").add(index >= 0 ? index : _visitables.get("rules").size(), builder);this.rules.add(index >= 0 ? index : rules.size(), builder); return (A)this;
  }
  public A setToRules(Integer index,V1RuleWithOperations item) {
    if (this.rules == null) {this.rules = new ArrayList<V1RuleWithOperationsBuilder>();}
    V1RuleWithOperationsBuilder builder = new V1RuleWithOperationsBuilder(item);
    if (index < 0 || index >= _visitables.get("rules").size()) { _visitables.get("rules").add(builder); } else { _visitables.get("rules").set(index, builder);}
    if (index < 0 || index >= rules.size()) { rules.add(builder); } else { rules.set(index, builder);}
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
    for (V1RuleWithOperations item : items) {V1RuleWithOperationsBuilder builder = new V1RuleWithOperationsBuilder(item);_visitables.get("rules").remove(builder);if (this.rules != null) {this.rules.remove(builder);}} return (A)this;
  }
  public A removeAllFromRules(Collection<V1RuleWithOperations> items) {
    for (V1RuleWithOperations item : items) {V1RuleWithOperationsBuilder builder = new V1RuleWithOperationsBuilder(item);_visitables.get("rules").remove(builder);if (this.rules != null) {this.rules.remove(builder);}} return (A)this;
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
  
  /**
   * This method has been deprecated, please use method buildRules instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1RuleWithOperations> getRules() {
    return rules != null ? build(rules) : null;
  }
  public List<V1RuleWithOperations> buildRules() {
    return rules != null ? build(rules) : null;
  }
  public V1RuleWithOperations buildRule(Integer index) {
    return this.rules.get(index).build();
  }
  public V1RuleWithOperations buildFirstRule() {
    return this.rules.get(0).build();
  }
  public V1RuleWithOperations buildLastRule() {
    return this.rules.get(rules.size() - 1).build();
  }
  public V1RuleWithOperations buildMatchingRule(Predicate<V1RuleWithOperationsBuilder> predicate) {
    for (V1RuleWithOperationsBuilder item: rules) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingRule(Predicate<V1RuleWithOperationsBuilder> predicate) {
    for (V1RuleWithOperationsBuilder item: rules) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withRules(List<V1RuleWithOperations> rules) {
    if (this.rules != null) { _visitables.get("rules").removeAll(this.rules);}
    if (rules != null) {this.rules = new ArrayList(); for (V1RuleWithOperations item : rules){this.addToRules(item);}} else { this.rules = null;} return (A) this;
  }
  public A withRules(io.kubernetes.client.openapi.models.V1RuleWithOperations... rules) {
    if (this.rules != null) {this.rules.clear();}
    if (rules != null) {for (V1RuleWithOperations item :rules){ this.addToRules(item);}} return (A) this;
  }
  public Boolean hasRules() {
    return rules != null && !rules.isEmpty();
  }
  public V1MutatingWebhookFluent.RulesNested<A> addNewRule() {
    return new V1MutatingWebhookFluentImpl.RulesNestedImpl();
  }
  public V1MutatingWebhookFluent.RulesNested<A> addNewRuleLike(V1RuleWithOperations item) {
    return new V1MutatingWebhookFluentImpl.RulesNestedImpl(-1, item);
  }
  public V1MutatingWebhookFluent.RulesNested<A> setNewRuleLike(Integer index,V1RuleWithOperations item) {
    return new V1MutatingWebhookFluentImpl.RulesNestedImpl(index, item);
  }
  public V1MutatingWebhookFluent.RulesNested<A> editRule(Integer index) {
    if (rules.size() <= index) throw new RuntimeException("Can't edit rules. Index exceeds size.");
    return setNewRuleLike(index, buildRule(index));
  }
  public V1MutatingWebhookFluent.RulesNested<A> editFirstRule() {
    if (rules.size() == 0) throw new RuntimeException("Can't edit first rules. The list is empty.");
    return setNewRuleLike(0, buildRule(0));
  }
  public V1MutatingWebhookFluent.RulesNested<A> editLastRule() {
    int index = rules.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last rules. The list is empty.");
    return setNewRuleLike(index, buildRule(index));
  }
  public V1MutatingWebhookFluent.RulesNested<A> editMatchingRule(Predicate<V1RuleWithOperationsBuilder> predicate) {
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
    this.sideEffects=sideEffects; return (A) this;
  }
  public Boolean hasSideEffects() {
    return this.sideEffects != null;
  }
  public Integer getTimeoutSeconds() {
    return this.timeoutSeconds;
  }
  public A withTimeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds=timeoutSeconds; return (A) this;
  }
  public Boolean hasTimeoutSeconds() {
    return this.timeoutSeconds != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1MutatingWebhookFluentImpl that = (V1MutatingWebhookFluentImpl) o;
    if (admissionReviewVersions != null ? !admissionReviewVersions.equals(that.admissionReviewVersions) :that.admissionReviewVersions != null) return false;
    if (clientConfig != null ? !clientConfig.equals(that.clientConfig) :that.clientConfig != null) return false;
    if (failurePolicy != null ? !failurePolicy.equals(that.failurePolicy) :that.failurePolicy != null) return false;
    if (matchPolicy != null ? !matchPolicy.equals(that.matchPolicy) :that.matchPolicy != null) return false;
    if (name != null ? !name.equals(that.name) :that.name != null) return false;
    if (namespaceSelector != null ? !namespaceSelector.equals(that.namespaceSelector) :that.namespaceSelector != null) return false;
    if (objectSelector != null ? !objectSelector.equals(that.objectSelector) :that.objectSelector != null) return false;
    if (reinvocationPolicy != null ? !reinvocationPolicy.equals(that.reinvocationPolicy) :that.reinvocationPolicy != null) return false;
    if (rules != null ? !rules.equals(that.rules) :that.rules != null) return false;
    if (sideEffects != null ? !sideEffects.equals(that.sideEffects) :that.sideEffects != null) return false;
    if (timeoutSeconds != null ? !timeoutSeconds.equals(that.timeoutSeconds) :that.timeoutSeconds != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(admissionReviewVersions,  clientConfig,  failurePolicy,  matchPolicy,  name,  namespaceSelector,  objectSelector,  reinvocationPolicy,  rules,  sideEffects,  timeoutSeconds,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (admissionReviewVersions != null && !admissionReviewVersions.isEmpty()) { sb.append("admissionReviewVersions:"); sb.append(admissionReviewVersions + ","); }
    if (clientConfig != null) { sb.append("clientConfig:"); sb.append(clientConfig + ","); }
    if (failurePolicy != null) { sb.append("failurePolicy:"); sb.append(failurePolicy + ","); }
    if (matchPolicy != null) { sb.append("matchPolicy:"); sb.append(matchPolicy + ","); }
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (namespaceSelector != null) { sb.append("namespaceSelector:"); sb.append(namespaceSelector + ","); }
    if (objectSelector != null) { sb.append("objectSelector:"); sb.append(objectSelector + ","); }
    if (reinvocationPolicy != null) { sb.append("reinvocationPolicy:"); sb.append(reinvocationPolicy + ","); }
    if (rules != null && !rules.isEmpty()) { sb.append("rules:"); sb.append(rules + ","); }
    if (sideEffects != null) { sb.append("sideEffects:"); sb.append(sideEffects + ","); }
    if (timeoutSeconds != null) { sb.append("timeoutSeconds:"); sb.append(timeoutSeconds); }
    sb.append("}");
    return sb.toString();
  }
  class ClientConfigNestedImpl<N> extends AdmissionregistrationV1WebhookClientConfigFluentImpl<V1MutatingWebhookFluent.ClientConfigNested<N>> implements V1MutatingWebhookFluent.ClientConfigNested<N>,Nested<N>{
    ClientConfigNestedImpl(AdmissionregistrationV1WebhookClientConfig item) {
      this.builder = new AdmissionregistrationV1WebhookClientConfigBuilder(this, item);
    }
    ClientConfigNestedImpl() {
      this.builder = new AdmissionregistrationV1WebhookClientConfigBuilder(this);
    }
    AdmissionregistrationV1WebhookClientConfigBuilder builder;
    public N and() {
      return (N) V1MutatingWebhookFluentImpl.this.withClientConfig(builder.build());
    }
    public N endClientConfig() {
      return and();
    }
    
  }
  class NamespaceSelectorNestedImpl<N> extends V1LabelSelectorFluentImpl<V1MutatingWebhookFluent.NamespaceSelectorNested<N>> implements V1MutatingWebhookFluent.NamespaceSelectorNested<N>,Nested<N>{
    NamespaceSelectorNestedImpl(V1LabelSelector item) {
      this.builder = new V1LabelSelectorBuilder(this, item);
    }
    NamespaceSelectorNestedImpl() {
      this.builder = new V1LabelSelectorBuilder(this);
    }
    V1LabelSelectorBuilder builder;
    public N and() {
      return (N) V1MutatingWebhookFluentImpl.this.withNamespaceSelector(builder.build());
    }
    public N endNamespaceSelector() {
      return and();
    }
    
  }
  class ObjectSelectorNestedImpl<N> extends V1LabelSelectorFluentImpl<V1MutatingWebhookFluent.ObjectSelectorNested<N>> implements V1MutatingWebhookFluent.ObjectSelectorNested<N>,Nested<N>{
    ObjectSelectorNestedImpl(V1LabelSelector item) {
      this.builder = new V1LabelSelectorBuilder(this, item);
    }
    ObjectSelectorNestedImpl() {
      this.builder = new V1LabelSelectorBuilder(this);
    }
    V1LabelSelectorBuilder builder;
    public N and() {
      return (N) V1MutatingWebhookFluentImpl.this.withObjectSelector(builder.build());
    }
    public N endObjectSelector() {
      return and();
    }
    
  }
  class RulesNestedImpl<N> extends V1RuleWithOperationsFluentImpl<V1MutatingWebhookFluent.RulesNested<N>> implements V1MutatingWebhookFluent.RulesNested<N>,Nested<N>{
    RulesNestedImpl(Integer index,V1RuleWithOperations item) {
      this.index = index;
      this.builder = new V1RuleWithOperationsBuilder(this, item);
    }
    RulesNestedImpl() {
      this.index = -1;
      this.builder = new V1RuleWithOperationsBuilder(this);
    }
    V1RuleWithOperationsBuilder builder;
    Integer index;
    public N and() {
      return (N) V1MutatingWebhookFluentImpl.this.setToRules(index,builder.build());
    }
    public N endRule() {
      return and();
    }
    
  }
  
}