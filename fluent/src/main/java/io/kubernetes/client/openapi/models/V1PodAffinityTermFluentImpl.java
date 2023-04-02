package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1PodAffinityTermFluentImpl<A extends V1PodAffinityTermFluent<A>> extends BaseFluent<A> implements V1PodAffinityTermFluent<A>{
  public V1PodAffinityTermFluentImpl() {
  }
  public V1PodAffinityTermFluentImpl(V1PodAffinityTerm instance) {
    this.withLabelSelector(instance.getLabelSelector());

    this.withNamespaceSelector(instance.getNamespaceSelector());

    this.withNamespaces(instance.getNamespaces());

    this.withTopologyKey(instance.getTopologyKey());

  }
  private V1LabelSelectorBuilder labelSelector;
  private V1LabelSelectorBuilder namespaceSelector;
  private List<String> namespaces;
  private String topologyKey;
  
  /**
   * This method has been deprecated, please use method buildLabelSelector instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1LabelSelector getLabelSelector() {
    return this.labelSelector!=null ?this.labelSelector.build():null;
  }
  public V1LabelSelector buildLabelSelector() {
    return this.labelSelector!=null ?this.labelSelector.build():null;
  }
  public A withLabelSelector(V1LabelSelector labelSelector) {
    _visitables.get("labelSelector").remove(this.labelSelector);
    if (labelSelector!=null){ this.labelSelector= new V1LabelSelectorBuilder(labelSelector); _visitables.get("labelSelector").add(this.labelSelector);} else { this.labelSelector = null; _visitables.get("labelSelector").remove(this.labelSelector); } return (A) this;
  }
  public Boolean hasLabelSelector() {
    return this.labelSelector != null;
  }
  public V1PodAffinityTermFluent.LabelSelectorNested<A> withNewLabelSelector() {
    return new V1PodAffinityTermFluentImpl.LabelSelectorNestedImpl();
  }
  public V1PodAffinityTermFluent.LabelSelectorNested<A> withNewLabelSelectorLike(V1LabelSelector item) {
    return new V1PodAffinityTermFluentImpl.LabelSelectorNestedImpl(item);
  }
  public V1PodAffinityTermFluent.LabelSelectorNested<A> editLabelSelector() {
    return withNewLabelSelectorLike(getLabelSelector());
  }
  public V1PodAffinityTermFluent.LabelSelectorNested<A> editOrNewLabelSelector() {
    return withNewLabelSelectorLike(getLabelSelector() != null ? getLabelSelector(): new V1LabelSelectorBuilder().build());
  }
  public V1PodAffinityTermFluent.LabelSelectorNested<A> editOrNewLabelSelectorLike(V1LabelSelector item) {
    return withNewLabelSelectorLike(getLabelSelector() != null ? getLabelSelector(): item);
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
  public V1PodAffinityTermFluent.NamespaceSelectorNested<A> withNewNamespaceSelector() {
    return new V1PodAffinityTermFluentImpl.NamespaceSelectorNestedImpl();
  }
  public V1PodAffinityTermFluent.NamespaceSelectorNested<A> withNewNamespaceSelectorLike(V1LabelSelector item) {
    return new V1PodAffinityTermFluentImpl.NamespaceSelectorNestedImpl(item);
  }
  public V1PodAffinityTermFluent.NamespaceSelectorNested<A> editNamespaceSelector() {
    return withNewNamespaceSelectorLike(getNamespaceSelector());
  }
  public V1PodAffinityTermFluent.NamespaceSelectorNested<A> editOrNewNamespaceSelector() {
    return withNewNamespaceSelectorLike(getNamespaceSelector() != null ? getNamespaceSelector(): new V1LabelSelectorBuilder().build());
  }
  public V1PodAffinityTermFluent.NamespaceSelectorNested<A> editOrNewNamespaceSelectorLike(V1LabelSelector item) {
    return withNewNamespaceSelectorLike(getNamespaceSelector() != null ? getNamespaceSelector(): item);
  }
  public A addToNamespaces(Integer index,String item) {
    if (this.namespaces == null) {this.namespaces = new ArrayList<String>();}
    this.namespaces.add(index, item);
    return (A)this;
  }
  public A setToNamespaces(Integer index,String item) {
    if (this.namespaces == null) {this.namespaces = new ArrayList<String>();}
    this.namespaces.set(index, item); return (A)this;
  }
  public A addToNamespaces(java.lang.String... items) {
    if (this.namespaces == null) {this.namespaces = new ArrayList<String>();}
    for (String item : items) {this.namespaces.add(item);} return (A)this;
  }
  public A addAllToNamespaces(Collection<String> items) {
    if (this.namespaces == null) {this.namespaces = new ArrayList<String>();}
    for (String item : items) {this.namespaces.add(item);} return (A)this;
  }
  public A removeFromNamespaces(java.lang.String... items) {
    for (String item : items) {if (this.namespaces!= null){ this.namespaces.remove(item);}} return (A)this;
  }
  public A removeAllFromNamespaces(Collection<String> items) {
    for (String item : items) {if (this.namespaces!= null){ this.namespaces.remove(item);}} return (A)this;
  }
  public List<String> getNamespaces() {
    return this.namespaces;
  }
  public String getNamespace(Integer index) {
    return this.namespaces.get(index);
  }
  public String getFirstNamespace() {
    return this.namespaces.get(0);
  }
  public String getLastNamespace() {
    return this.namespaces.get(namespaces.size() - 1);
  }
  public String getMatchingNamespace(Predicate<String> predicate) {
    for (String item: namespaces) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingNamespace(Predicate<String> predicate) {
    for (String item: namespaces) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withNamespaces(List<String> namespaces) {
    if (namespaces != null) {this.namespaces = new ArrayList(); for (String item : namespaces){this.addToNamespaces(item);}} else { this.namespaces = null;} return (A) this;
  }
  public A withNamespaces(java.lang.String... namespaces) {
    if (this.namespaces != null) {this.namespaces.clear();}
    if (namespaces != null) {for (String item :namespaces){ this.addToNamespaces(item);}} return (A) this;
  }
  public Boolean hasNamespaces() {
    return namespaces != null && !namespaces.isEmpty();
  }
  public String getTopologyKey() {
    return this.topologyKey;
  }
  public A withTopologyKey(String topologyKey) {
    this.topologyKey=topologyKey; return (A) this;
  }
  public Boolean hasTopologyKey() {
    return this.topologyKey != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1PodAffinityTermFluentImpl that = (V1PodAffinityTermFluentImpl) o;
    if (labelSelector != null ? !labelSelector.equals(that.labelSelector) :that.labelSelector != null) return false;
    if (namespaceSelector != null ? !namespaceSelector.equals(that.namespaceSelector) :that.namespaceSelector != null) return false;
    if (namespaces != null ? !namespaces.equals(that.namespaces) :that.namespaces != null) return false;
    if (topologyKey != null ? !topologyKey.equals(that.topologyKey) :that.topologyKey != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(labelSelector,  namespaceSelector,  namespaces,  topologyKey,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (labelSelector != null) { sb.append("labelSelector:"); sb.append(labelSelector + ","); }
    if (namespaceSelector != null) { sb.append("namespaceSelector:"); sb.append(namespaceSelector + ","); }
    if (namespaces != null && !namespaces.isEmpty()) { sb.append("namespaces:"); sb.append(namespaces + ","); }
    if (topologyKey != null) { sb.append("topologyKey:"); sb.append(topologyKey); }
    sb.append("}");
    return sb.toString();
  }
  class LabelSelectorNestedImpl<N> extends V1LabelSelectorFluentImpl<V1PodAffinityTermFluent.LabelSelectorNested<N>> implements V1PodAffinityTermFluent.LabelSelectorNested<N>,Nested<N>{
    LabelSelectorNestedImpl(V1LabelSelector item) {
      this.builder = new V1LabelSelectorBuilder(this, item);
    }
    LabelSelectorNestedImpl() {
      this.builder = new V1LabelSelectorBuilder(this);
    }
    V1LabelSelectorBuilder builder;
    public N and() {
      return (N) V1PodAffinityTermFluentImpl.this.withLabelSelector(builder.build());
    }
    public N endLabelSelector() {
      return and();
    }
    
  }
  class NamespaceSelectorNestedImpl<N> extends V1LabelSelectorFluentImpl<V1PodAffinityTermFluent.NamespaceSelectorNested<N>> implements V1PodAffinityTermFluent.NamespaceSelectorNested<N>,Nested<N>{
    NamespaceSelectorNestedImpl(V1LabelSelector item) {
      this.builder = new V1LabelSelectorBuilder(this, item);
    }
    NamespaceSelectorNestedImpl() {
      this.builder = new V1LabelSelectorBuilder(this);
    }
    V1LabelSelectorBuilder builder;
    public N and() {
      return (N) V1PodAffinityTermFluentImpl.this.withNamespaceSelector(builder.build());
    }
    public N endNamespaceSelector() {
      return and();
    }
    
  }
  
}