package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1TopologySpreadConstraintFluent<A extends io.kubernetes.client.openapi.models.V1TopologySpreadConstraintFluent<A>> extends BaseFluent<A>{

  private V1LabelSelectorBuilder labelSelector;
  private List<String> matchLabelKeys;
  private Integer maxSkew;
  private Integer minDomains;
  private String nodeAffinityPolicy;
  private String nodeTaintsPolicy;
  private String topologyKey;
  private String whenUnsatisfiable;

  public V1TopologySpreadConstraintFluent() {
  }
  
  public V1TopologySpreadConstraintFluent(V1TopologySpreadConstraint instance) {
    this.copyInstance(instance);
  }

  public A addAllToMatchLabelKeys(Collection<String> items) {
    if (this.matchLabelKeys == null) {
      this.matchLabelKeys = new ArrayList();
    }
    for (String item : items) {
      this.matchLabelKeys.add(item);
    }
    return (A) this;
  }
  
  public A addToMatchLabelKeys(String... items) {
    if (this.matchLabelKeys == null) {
      this.matchLabelKeys = new ArrayList();
    }
    for (String item : items) {
      this.matchLabelKeys.add(item);
    }
    return (A) this;
  }
  
  public A addToMatchLabelKeys(int index,String item) {
    if (this.matchLabelKeys == null) {
      this.matchLabelKeys = new ArrayList();
    }
    this.matchLabelKeys.add(index, item);
    return (A) this;
  }
  
  public V1LabelSelector buildLabelSelector() {
    return this.labelSelector != null ? this.labelSelector.build() : null;
  }
  
  protected void copyInstance(V1TopologySpreadConstraint instance) {
    instance = instance != null ? instance : new V1TopologySpreadConstraint();
    if (instance != null) {
        this.withLabelSelector(instance.getLabelSelector());
        this.withMatchLabelKeys(instance.getMatchLabelKeys());
        this.withMaxSkew(instance.getMaxSkew());
        this.withMinDomains(instance.getMinDomains());
        this.withNodeAffinityPolicy(instance.getNodeAffinityPolicy());
        this.withNodeTaintsPolicy(instance.getNodeTaintsPolicy());
        this.withTopologyKey(instance.getTopologyKey());
        this.withWhenUnsatisfiable(instance.getWhenUnsatisfiable());
    }
  }
  
  public LabelSelectorNested<A> editLabelSelector() {
    return this.withNewLabelSelectorLike(Optional.ofNullable(this.buildLabelSelector()).orElse(null));
  }
  
  public LabelSelectorNested<A> editOrNewLabelSelector() {
    return this.withNewLabelSelectorLike(Optional.ofNullable(this.buildLabelSelector()).orElse(new V1LabelSelectorBuilder().build()));
  }
  
  public LabelSelectorNested<A> editOrNewLabelSelectorLike(V1LabelSelector item) {
    return this.withNewLabelSelectorLike(Optional.ofNullable(this.buildLabelSelector()).orElse(item));
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
    V1TopologySpreadConstraintFluent that = (V1TopologySpreadConstraintFluent) o;
    if (!(Objects.equals(labelSelector, that.labelSelector))) {
      return false;
    }
    if (!(Objects.equals(matchLabelKeys, that.matchLabelKeys))) {
      return false;
    }
    if (!(Objects.equals(maxSkew, that.maxSkew))) {
      return false;
    }
    if (!(Objects.equals(minDomains, that.minDomains))) {
      return false;
    }
    if (!(Objects.equals(nodeAffinityPolicy, that.nodeAffinityPolicy))) {
      return false;
    }
    if (!(Objects.equals(nodeTaintsPolicy, that.nodeTaintsPolicy))) {
      return false;
    }
    if (!(Objects.equals(topologyKey, that.topologyKey))) {
      return false;
    }
    if (!(Objects.equals(whenUnsatisfiable, that.whenUnsatisfiable))) {
      return false;
    }
    return true;
  }
  
  public String getFirstMatchLabelKey() {
    return this.matchLabelKeys.get(0);
  }
  
  public String getLastMatchLabelKey() {
    return this.matchLabelKeys.get(matchLabelKeys.size() - 1);
  }
  
  public String getMatchLabelKey(int index) {
    return this.matchLabelKeys.get(index);
  }
  
  public List<String> getMatchLabelKeys() {
    return this.matchLabelKeys;
  }
  
  public String getMatchingMatchLabelKey(Predicate<String> predicate) {
      for (String item : matchLabelKeys) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public Integer getMaxSkew() {
    return this.maxSkew;
  }
  
  public Integer getMinDomains() {
    return this.minDomains;
  }
  
  public String getNodeAffinityPolicy() {
    return this.nodeAffinityPolicy;
  }
  
  public String getNodeTaintsPolicy() {
    return this.nodeTaintsPolicy;
  }
  
  public String getTopologyKey() {
    return this.topologyKey;
  }
  
  public String getWhenUnsatisfiable() {
    return this.whenUnsatisfiable;
  }
  
  public boolean hasLabelSelector() {
    return this.labelSelector != null;
  }
  
  public boolean hasMatchLabelKeys() {
    return this.matchLabelKeys != null && !(this.matchLabelKeys.isEmpty());
  }
  
  public boolean hasMatchingMatchLabelKey(Predicate<String> predicate) {
      for (String item : matchLabelKeys) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasMaxSkew() {
    return this.maxSkew != null;
  }
  
  public boolean hasMinDomains() {
    return this.minDomains != null;
  }
  
  public boolean hasNodeAffinityPolicy() {
    return this.nodeAffinityPolicy != null;
  }
  
  public boolean hasNodeTaintsPolicy() {
    return this.nodeTaintsPolicy != null;
  }
  
  public boolean hasTopologyKey() {
    return this.topologyKey != null;
  }
  
  public boolean hasWhenUnsatisfiable() {
    return this.whenUnsatisfiable != null;
  }
  
  public int hashCode() {
    return Objects.hash(labelSelector, matchLabelKeys, maxSkew, minDomains, nodeAffinityPolicy, nodeTaintsPolicy, topologyKey, whenUnsatisfiable);
  }
  
  public A removeAllFromMatchLabelKeys(Collection<String> items) {
    if (this.matchLabelKeys == null) {
      return (A) this;
    }
    for (String item : items) {
      this.matchLabelKeys.remove(item);
    }
    return (A) this;
  }
  
  public A removeFromMatchLabelKeys(String... items) {
    if (this.matchLabelKeys == null) {
      return (A) this;
    }
    for (String item : items) {
      this.matchLabelKeys.remove(item);
    }
    return (A) this;
  }
  
  public A setToMatchLabelKeys(int index,String item) {
    if (this.matchLabelKeys == null) {
      this.matchLabelKeys = new ArrayList();
    }
    this.matchLabelKeys.set(index, item);
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(labelSelector == null)) {
        sb.append("labelSelector:");
        sb.append(labelSelector);
        sb.append(",");
    }
    if (!(matchLabelKeys == null) && !(matchLabelKeys.isEmpty())) {
        sb.append("matchLabelKeys:");
        sb.append(matchLabelKeys);
        sb.append(",");
    }
    if (!(maxSkew == null)) {
        sb.append("maxSkew:");
        sb.append(maxSkew);
        sb.append(",");
    }
    if (!(minDomains == null)) {
        sb.append("minDomains:");
        sb.append(minDomains);
        sb.append(",");
    }
    if (!(nodeAffinityPolicy == null)) {
        sb.append("nodeAffinityPolicy:");
        sb.append(nodeAffinityPolicy);
        sb.append(",");
    }
    if (!(nodeTaintsPolicy == null)) {
        sb.append("nodeTaintsPolicy:");
        sb.append(nodeTaintsPolicy);
        sb.append(",");
    }
    if (!(topologyKey == null)) {
        sb.append("topologyKey:");
        sb.append(topologyKey);
        sb.append(",");
    }
    if (!(whenUnsatisfiable == null)) {
        sb.append("whenUnsatisfiable:");
        sb.append(whenUnsatisfiable);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withLabelSelector(V1LabelSelector labelSelector) {
    this._visitables.remove("labelSelector");
    if (labelSelector != null) {
        this.labelSelector = new V1LabelSelectorBuilder(labelSelector);
        this._visitables.get("labelSelector").add(this.labelSelector);
    } else {
        this.labelSelector = null;
        this._visitables.get("labelSelector").remove(this.labelSelector);
    }
    return (A) this;
  }
  
  public A withMatchLabelKeys(List<String> matchLabelKeys) {
    if (matchLabelKeys != null) {
        this.matchLabelKeys = new ArrayList();
        for (String item : matchLabelKeys) {
          this.addToMatchLabelKeys(item);
        }
    } else {
      this.matchLabelKeys = null;
    }
    return (A) this;
  }
  
  public A withMatchLabelKeys(String... matchLabelKeys) {
    if (this.matchLabelKeys != null) {
        this.matchLabelKeys.clear();
        _visitables.remove("matchLabelKeys");
    }
    if (matchLabelKeys != null) {
      for (String item : matchLabelKeys) {
        this.addToMatchLabelKeys(item);
      }
    }
    return (A) this;
  }
  
  public A withMaxSkew(Integer maxSkew) {
    this.maxSkew = maxSkew;
    return (A) this;
  }
  
  public A withMinDomains(Integer minDomains) {
    this.minDomains = minDomains;
    return (A) this;
  }
  
  public LabelSelectorNested<A> withNewLabelSelector() {
    return new LabelSelectorNested(null);
  }
  
  public LabelSelectorNested<A> withNewLabelSelectorLike(V1LabelSelector item) {
    return new LabelSelectorNested(item);
  }
  
  public A withNodeAffinityPolicy(String nodeAffinityPolicy) {
    this.nodeAffinityPolicy = nodeAffinityPolicy;
    return (A) this;
  }
  
  public A withNodeTaintsPolicy(String nodeTaintsPolicy) {
    this.nodeTaintsPolicy = nodeTaintsPolicy;
    return (A) this;
  }
  
  public A withTopologyKey(String topologyKey) {
    this.topologyKey = topologyKey;
    return (A) this;
  }
  
  public A withWhenUnsatisfiable(String whenUnsatisfiable) {
    this.whenUnsatisfiable = whenUnsatisfiable;
    return (A) this;
  }
  public class LabelSelectorNested<N> extends V1LabelSelectorFluent<LabelSelectorNested<N>> implements Nested<N>{
  
    V1LabelSelectorBuilder builder;
  
    LabelSelectorNested(V1LabelSelector item) {
      this.builder = new V1LabelSelectorBuilder(this, item);
    }
  
    public N and() {
      return (N) V1TopologySpreadConstraintFluent.this.withLabelSelector(builder.build());
    }
    
    public N endLabelSelector() {
      return and();
    }
    
  }
}