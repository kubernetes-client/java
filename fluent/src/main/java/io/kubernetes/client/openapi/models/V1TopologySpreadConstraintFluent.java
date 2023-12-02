package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1TopologySpreadConstraintFluent<A extends V1TopologySpreadConstraintFluent<A>> extends BaseFluent<A>{
  public V1TopologySpreadConstraintFluent() {
  }
  
  public V1TopologySpreadConstraintFluent(V1TopologySpreadConstraint instance) {
    this.copyInstance(instance);
  }
  private V1LabelSelectorBuilder labelSelector;
  private List<String> matchLabelKeys;
  private Integer maxSkew;
  private Integer minDomains;
  private String nodeAffinityPolicy;
  private String nodeTaintsPolicy;
  private String topologyKey;
  private String whenUnsatisfiable;
  
  protected void copyInstance(V1TopologySpreadConstraint instance) {
    instance = (instance != null ? instance : new V1TopologySpreadConstraint());
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
  
  public V1LabelSelector buildLabelSelector() {
    return this.labelSelector != null ? this.labelSelector.build() : null;
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
  
  public boolean hasLabelSelector() {
    return this.labelSelector != null;
  }
  
  public LabelSelectorNested<A> withNewLabelSelector() {
    return new LabelSelectorNested(null);
  }
  
  public LabelSelectorNested<A> withNewLabelSelectorLike(V1LabelSelector item) {
    return new LabelSelectorNested(item);
  }
  
  public LabelSelectorNested<A> editLabelSelector() {
    return withNewLabelSelectorLike(java.util.Optional.ofNullable(buildLabelSelector()).orElse(null));
  }
  
  public LabelSelectorNested<A> editOrNewLabelSelector() {
    return withNewLabelSelectorLike(java.util.Optional.ofNullable(buildLabelSelector()).orElse(new V1LabelSelectorBuilder().build()));
  }
  
  public LabelSelectorNested<A> editOrNewLabelSelectorLike(V1LabelSelector item) {
    return withNewLabelSelectorLike(java.util.Optional.ofNullable(buildLabelSelector()).orElse(item));
  }
  
  public A addToMatchLabelKeys(int index,String item) {
    if (this.matchLabelKeys == null) {this.matchLabelKeys = new ArrayList<String>();}
    this.matchLabelKeys.add(index, item);
    return (A)this;
  }
  
  public A setToMatchLabelKeys(int index,String item) {
    if (this.matchLabelKeys == null) {this.matchLabelKeys = new ArrayList<String>();}
    this.matchLabelKeys.set(index, item); return (A)this;
  }
  
  public A addToMatchLabelKeys(java.lang.String... items) {
    if (this.matchLabelKeys == null) {this.matchLabelKeys = new ArrayList<String>();}
    for (String item : items) {this.matchLabelKeys.add(item);} return (A)this;
  }
  
  public A addAllToMatchLabelKeys(Collection<String> items) {
    if (this.matchLabelKeys == null) {this.matchLabelKeys = new ArrayList<String>();}
    for (String item : items) {this.matchLabelKeys.add(item);} return (A)this;
  }
  
  public A removeFromMatchLabelKeys(java.lang.String... items) {
    if (this.matchLabelKeys == null) return (A)this;
    for (String item : items) { this.matchLabelKeys.remove(item);} return (A)this;
  }
  
  public A removeAllFromMatchLabelKeys(Collection<String> items) {
    if (this.matchLabelKeys == null) return (A)this;
    for (String item : items) { this.matchLabelKeys.remove(item);} return (A)this;
  }
  
  public List<String> getMatchLabelKeys() {
    return this.matchLabelKeys;
  }
  
  public String getMatchLabelKey(int index) {
    return this.matchLabelKeys.get(index);
  }
  
  public String getFirstMatchLabelKey() {
    return this.matchLabelKeys.get(0);
  }
  
  public String getLastMatchLabelKey() {
    return this.matchLabelKeys.get(matchLabelKeys.size() - 1);
  }
  
  public String getMatchingMatchLabelKey(Predicate<String> predicate) {
      for (String item : matchLabelKeys) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingMatchLabelKey(Predicate<String> predicate) {
      for (String item : matchLabelKeys) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
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
  
  public A withMatchLabelKeys(java.lang.String... matchLabelKeys) {
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
  
  public boolean hasMatchLabelKeys() {
    return this.matchLabelKeys != null && !this.matchLabelKeys.isEmpty();
  }
  
  public Integer getMaxSkew() {
    return this.maxSkew;
  }
  
  public A withMaxSkew(Integer maxSkew) {
    this.maxSkew = maxSkew;
    return (A) this;
  }
  
  public boolean hasMaxSkew() {
    return this.maxSkew != null;
  }
  
  public Integer getMinDomains() {
    return this.minDomains;
  }
  
  public A withMinDomains(Integer minDomains) {
    this.minDomains = minDomains;
    return (A) this;
  }
  
  public boolean hasMinDomains() {
    return this.minDomains != null;
  }
  
  public String getNodeAffinityPolicy() {
    return this.nodeAffinityPolicy;
  }
  
  public A withNodeAffinityPolicy(String nodeAffinityPolicy) {
    this.nodeAffinityPolicy = nodeAffinityPolicy;
    return (A) this;
  }
  
  public boolean hasNodeAffinityPolicy() {
    return this.nodeAffinityPolicy != null;
  }
  
  public String getNodeTaintsPolicy() {
    return this.nodeTaintsPolicy;
  }
  
  public A withNodeTaintsPolicy(String nodeTaintsPolicy) {
    this.nodeTaintsPolicy = nodeTaintsPolicy;
    return (A) this;
  }
  
  public boolean hasNodeTaintsPolicy() {
    return this.nodeTaintsPolicy != null;
  }
  
  public String getTopologyKey() {
    return this.topologyKey;
  }
  
  public A withTopologyKey(String topologyKey) {
    this.topologyKey = topologyKey;
    return (A) this;
  }
  
  public boolean hasTopologyKey() {
    return this.topologyKey != null;
  }
  
  public String getWhenUnsatisfiable() {
    return this.whenUnsatisfiable;
  }
  
  public A withWhenUnsatisfiable(String whenUnsatisfiable) {
    this.whenUnsatisfiable = whenUnsatisfiable;
    return (A) this;
  }
  
  public boolean hasWhenUnsatisfiable() {
    return this.whenUnsatisfiable != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1TopologySpreadConstraintFluent that = (V1TopologySpreadConstraintFluent) o;
    if (!java.util.Objects.equals(labelSelector, that.labelSelector)) return false;
    if (!java.util.Objects.equals(matchLabelKeys, that.matchLabelKeys)) return false;
    if (!java.util.Objects.equals(maxSkew, that.maxSkew)) return false;
    if (!java.util.Objects.equals(minDomains, that.minDomains)) return false;
    if (!java.util.Objects.equals(nodeAffinityPolicy, that.nodeAffinityPolicy)) return false;
    if (!java.util.Objects.equals(nodeTaintsPolicy, that.nodeTaintsPolicy)) return false;
    if (!java.util.Objects.equals(topologyKey, that.topologyKey)) return false;
    if (!java.util.Objects.equals(whenUnsatisfiable, that.whenUnsatisfiable)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(labelSelector,  matchLabelKeys,  maxSkew,  minDomains,  nodeAffinityPolicy,  nodeTaintsPolicy,  topologyKey,  whenUnsatisfiable,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (labelSelector != null) { sb.append("labelSelector:"); sb.append(labelSelector + ","); }
    if (matchLabelKeys != null && !matchLabelKeys.isEmpty()) { sb.append("matchLabelKeys:"); sb.append(matchLabelKeys + ","); }
    if (maxSkew != null) { sb.append("maxSkew:"); sb.append(maxSkew + ","); }
    if (minDomains != null) { sb.append("minDomains:"); sb.append(minDomains + ","); }
    if (nodeAffinityPolicy != null) { sb.append("nodeAffinityPolicy:"); sb.append(nodeAffinityPolicy + ","); }
    if (nodeTaintsPolicy != null) { sb.append("nodeTaintsPolicy:"); sb.append(nodeTaintsPolicy + ","); }
    if (topologyKey != null) { sb.append("topologyKey:"); sb.append(topologyKey + ","); }
    if (whenUnsatisfiable != null) { sb.append("whenUnsatisfiable:"); sb.append(whenUnsatisfiable); }
    sb.append("}");
    return sb.toString();
  }
  public class LabelSelectorNested<N> extends V1LabelSelectorFluent<LabelSelectorNested<N>> implements Nested<N>{
    LabelSelectorNested(V1LabelSelector item) {
      this.builder = new V1LabelSelectorBuilder(this, item);
    }
    V1LabelSelectorBuilder builder;
    
    public N and() {
      return (N) V1TopologySpreadConstraintFluent.this.withLabelSelector(builder.build());
    }
    
    public N endLabelSelector() {
      return and();
    }
    
  
  }

}