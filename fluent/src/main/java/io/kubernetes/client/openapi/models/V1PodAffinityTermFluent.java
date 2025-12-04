package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
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
public class V1PodAffinityTermFluent<A extends io.kubernetes.client.openapi.models.V1PodAffinityTermFluent<A>> extends BaseFluent<A>{

  private V1LabelSelectorBuilder labelSelector;
  private List<String> matchLabelKeys;
  private List<String> mismatchLabelKeys;
  private V1LabelSelectorBuilder namespaceSelector;
  private List<String> namespaces;
  private String topologyKey;

  public V1PodAffinityTermFluent() {
  }
  
  public V1PodAffinityTermFluent(V1PodAffinityTerm instance) {
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
  
  public A addAllToMismatchLabelKeys(Collection<String> items) {
    if (this.mismatchLabelKeys == null) {
      this.mismatchLabelKeys = new ArrayList();
    }
    for (String item : items) {
      this.mismatchLabelKeys.add(item);
    }
    return (A) this;
  }
  
  public A addAllToNamespaces(Collection<String> items) {
    if (this.namespaces == null) {
      this.namespaces = new ArrayList();
    }
    for (String item : items) {
      this.namespaces.add(item);
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
  
  public A addToMismatchLabelKeys(String... items) {
    if (this.mismatchLabelKeys == null) {
      this.mismatchLabelKeys = new ArrayList();
    }
    for (String item : items) {
      this.mismatchLabelKeys.add(item);
    }
    return (A) this;
  }
  
  public A addToMismatchLabelKeys(int index,String item) {
    if (this.mismatchLabelKeys == null) {
      this.mismatchLabelKeys = new ArrayList();
    }
    this.mismatchLabelKeys.add(index, item);
    return (A) this;
  }
  
  public A addToNamespaces(String... items) {
    if (this.namespaces == null) {
      this.namespaces = new ArrayList();
    }
    for (String item : items) {
      this.namespaces.add(item);
    }
    return (A) this;
  }
  
  public A addToNamespaces(int index,String item) {
    if (this.namespaces == null) {
      this.namespaces = new ArrayList();
    }
    this.namespaces.add(index, item);
    return (A) this;
  }
  
  public V1LabelSelector buildLabelSelector() {
    return this.labelSelector != null ? this.labelSelector.build() : null;
  }
  
  public V1LabelSelector buildNamespaceSelector() {
    return this.namespaceSelector != null ? this.namespaceSelector.build() : null;
  }
  
  protected void copyInstance(V1PodAffinityTerm instance) {
    instance = instance != null ? instance : new V1PodAffinityTerm();
    if (instance != null) {
        this.withLabelSelector(instance.getLabelSelector());
        this.withMatchLabelKeys(instance.getMatchLabelKeys());
        this.withMismatchLabelKeys(instance.getMismatchLabelKeys());
        this.withNamespaceSelector(instance.getNamespaceSelector());
        this.withNamespaces(instance.getNamespaces());
        this.withTopologyKey(instance.getTopologyKey());
    }
  }
  
  public LabelSelectorNested<A> editLabelSelector() {
    return this.withNewLabelSelectorLike(Optional.ofNullable(this.buildLabelSelector()).orElse(null));
  }
  
  public NamespaceSelectorNested<A> editNamespaceSelector() {
    return this.withNewNamespaceSelectorLike(Optional.ofNullable(this.buildNamespaceSelector()).orElse(null));
  }
  
  public LabelSelectorNested<A> editOrNewLabelSelector() {
    return this.withNewLabelSelectorLike(Optional.ofNullable(this.buildLabelSelector()).orElse(new V1LabelSelectorBuilder().build()));
  }
  
  public LabelSelectorNested<A> editOrNewLabelSelectorLike(V1LabelSelector item) {
    return this.withNewLabelSelectorLike(Optional.ofNullable(this.buildLabelSelector()).orElse(item));
  }
  
  public NamespaceSelectorNested<A> editOrNewNamespaceSelector() {
    return this.withNewNamespaceSelectorLike(Optional.ofNullable(this.buildNamespaceSelector()).orElse(new V1LabelSelectorBuilder().build()));
  }
  
  public NamespaceSelectorNested<A> editOrNewNamespaceSelectorLike(V1LabelSelector item) {
    return this.withNewNamespaceSelectorLike(Optional.ofNullable(this.buildNamespaceSelector()).orElse(item));
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
    V1PodAffinityTermFluent that = (V1PodAffinityTermFluent) o;
    if (!(Objects.equals(labelSelector, that.labelSelector))) {
      return false;
    }
    if (!(Objects.equals(matchLabelKeys, that.matchLabelKeys))) {
      return false;
    }
    if (!(Objects.equals(mismatchLabelKeys, that.mismatchLabelKeys))) {
      return false;
    }
    if (!(Objects.equals(namespaceSelector, that.namespaceSelector))) {
      return false;
    }
    if (!(Objects.equals(namespaces, that.namespaces))) {
      return false;
    }
    if (!(Objects.equals(topologyKey, that.topologyKey))) {
      return false;
    }
    return true;
  }
  
  public String getFirstMatchLabelKey() {
    return this.matchLabelKeys.get(0);
  }
  
  public String getFirstMismatchLabelKey() {
    return this.mismatchLabelKeys.get(0);
  }
  
  public String getFirstNamespace() {
    return this.namespaces.get(0);
  }
  
  public String getLastMatchLabelKey() {
    return this.matchLabelKeys.get(matchLabelKeys.size() - 1);
  }
  
  public String getLastMismatchLabelKey() {
    return this.mismatchLabelKeys.get(mismatchLabelKeys.size() - 1);
  }
  
  public String getLastNamespace() {
    return this.namespaces.get(namespaces.size() - 1);
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
  
  public String getMatchingMismatchLabelKey(Predicate<String> predicate) {
      for (String item : mismatchLabelKeys) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public String getMatchingNamespace(Predicate<String> predicate) {
      for (String item : namespaces) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public String getMismatchLabelKey(int index) {
    return this.mismatchLabelKeys.get(index);
  }
  
  public List<String> getMismatchLabelKeys() {
    return this.mismatchLabelKeys;
  }
  
  public String getNamespace(int index) {
    return this.namespaces.get(index);
  }
  
  public List<String> getNamespaces() {
    return this.namespaces;
  }
  
  public String getTopologyKey() {
    return this.topologyKey;
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
  
  public boolean hasMatchingMismatchLabelKey(Predicate<String> predicate) {
      for (String item : mismatchLabelKeys) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasMatchingNamespace(Predicate<String> predicate) {
      for (String item : namespaces) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasMismatchLabelKeys() {
    return this.mismatchLabelKeys != null && !(this.mismatchLabelKeys.isEmpty());
  }
  
  public boolean hasNamespaceSelector() {
    return this.namespaceSelector != null;
  }
  
  public boolean hasNamespaces() {
    return this.namespaces != null && !(this.namespaces.isEmpty());
  }
  
  public boolean hasTopologyKey() {
    return this.topologyKey != null;
  }
  
  public int hashCode() {
    return Objects.hash(labelSelector, matchLabelKeys, mismatchLabelKeys, namespaceSelector, namespaces, topologyKey);
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
  
  public A removeAllFromMismatchLabelKeys(Collection<String> items) {
    if (this.mismatchLabelKeys == null) {
      return (A) this;
    }
    for (String item : items) {
      this.mismatchLabelKeys.remove(item);
    }
    return (A) this;
  }
  
  public A removeAllFromNamespaces(Collection<String> items) {
    if (this.namespaces == null) {
      return (A) this;
    }
    for (String item : items) {
      this.namespaces.remove(item);
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
  
  public A removeFromMismatchLabelKeys(String... items) {
    if (this.mismatchLabelKeys == null) {
      return (A) this;
    }
    for (String item : items) {
      this.mismatchLabelKeys.remove(item);
    }
    return (A) this;
  }
  
  public A removeFromNamespaces(String... items) {
    if (this.namespaces == null) {
      return (A) this;
    }
    for (String item : items) {
      this.namespaces.remove(item);
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
  
  public A setToMismatchLabelKeys(int index,String item) {
    if (this.mismatchLabelKeys == null) {
      this.mismatchLabelKeys = new ArrayList();
    }
    this.mismatchLabelKeys.set(index, item);
    return (A) this;
  }
  
  public A setToNamespaces(int index,String item) {
    if (this.namespaces == null) {
      this.namespaces = new ArrayList();
    }
    this.namespaces.set(index, item);
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
    if (!(mismatchLabelKeys == null) && !(mismatchLabelKeys.isEmpty())) {
        sb.append("mismatchLabelKeys:");
        sb.append(mismatchLabelKeys);
        sb.append(",");
    }
    if (!(namespaceSelector == null)) {
        sb.append("namespaceSelector:");
        sb.append(namespaceSelector);
        sb.append(",");
    }
    if (!(namespaces == null) && !(namespaces.isEmpty())) {
        sb.append("namespaces:");
        sb.append(namespaces);
        sb.append(",");
    }
    if (!(topologyKey == null)) {
        sb.append("topologyKey:");
        sb.append(topologyKey);
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
  
  public A withMismatchLabelKeys(List<String> mismatchLabelKeys) {
    if (mismatchLabelKeys != null) {
        this.mismatchLabelKeys = new ArrayList();
        for (String item : mismatchLabelKeys) {
          this.addToMismatchLabelKeys(item);
        }
    } else {
      this.mismatchLabelKeys = null;
    }
    return (A) this;
  }
  
  public A withMismatchLabelKeys(String... mismatchLabelKeys) {
    if (this.mismatchLabelKeys != null) {
        this.mismatchLabelKeys.clear();
        _visitables.remove("mismatchLabelKeys");
    }
    if (mismatchLabelKeys != null) {
      for (String item : mismatchLabelKeys) {
        this.addToMismatchLabelKeys(item);
      }
    }
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
  
  public A withNamespaces(List<String> namespaces) {
    if (namespaces != null) {
        this.namespaces = new ArrayList();
        for (String item : namespaces) {
          this.addToNamespaces(item);
        }
    } else {
      this.namespaces = null;
    }
    return (A) this;
  }
  
  public A withNamespaces(String... namespaces) {
    if (this.namespaces != null) {
        this.namespaces.clear();
        _visitables.remove("namespaces");
    }
    if (namespaces != null) {
      for (String item : namespaces) {
        this.addToNamespaces(item);
      }
    }
    return (A) this;
  }
  
  public LabelSelectorNested<A> withNewLabelSelector() {
    return new LabelSelectorNested(null);
  }
  
  public LabelSelectorNested<A> withNewLabelSelectorLike(V1LabelSelector item) {
    return new LabelSelectorNested(item);
  }
  
  public NamespaceSelectorNested<A> withNewNamespaceSelector() {
    return new NamespaceSelectorNested(null);
  }
  
  public NamespaceSelectorNested<A> withNewNamespaceSelectorLike(V1LabelSelector item) {
    return new NamespaceSelectorNested(item);
  }
  
  public A withTopologyKey(String topologyKey) {
    this.topologyKey = topologyKey;
    return (A) this;
  }
  public class LabelSelectorNested<N> extends V1LabelSelectorFluent<LabelSelectorNested<N>> implements Nested<N>{
  
    V1LabelSelectorBuilder builder;
  
    LabelSelectorNested(V1LabelSelector item) {
      this.builder = new V1LabelSelectorBuilder(this, item);
    }
  
    public N and() {
      return (N) V1PodAffinityTermFluent.this.withLabelSelector(builder.build());
    }
    
    public N endLabelSelector() {
      return and();
    }
    
  }
  public class NamespaceSelectorNested<N> extends V1LabelSelectorFluent<NamespaceSelectorNested<N>> implements Nested<N>{
  
    V1LabelSelectorBuilder builder;
  
    NamespaceSelectorNested(V1LabelSelector item) {
      this.builder = new V1LabelSelectorBuilder(this, item);
    }
  
    public N and() {
      return (N) V1PodAffinityTermFluent.this.withNamespaceSelector(builder.build());
    }
    
    public N endNamespaceSelector() {
      return and();
    }
    
  }
}