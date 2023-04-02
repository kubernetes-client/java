package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1AggregationRuleFluentImpl<A extends V1AggregationRuleFluent<A>> extends BaseFluent<A> implements V1AggregationRuleFluent<A>{
  public V1AggregationRuleFluentImpl() {
  }
  public V1AggregationRuleFluentImpl(V1AggregationRule instance) {
    this.withClusterRoleSelectors(instance.getClusterRoleSelectors());

  }
  private ArrayList<V1LabelSelectorBuilder> clusterRoleSelectors;
  public A addToClusterRoleSelectors(Integer index,V1LabelSelector item) {
    if (this.clusterRoleSelectors == null) {this.clusterRoleSelectors = new ArrayList<V1LabelSelectorBuilder>();}
    V1LabelSelectorBuilder builder = new V1LabelSelectorBuilder(item);_visitables.get("clusterRoleSelectors").add(index >= 0 ? index : _visitables.get("clusterRoleSelectors").size(), builder);this.clusterRoleSelectors.add(index >= 0 ? index : clusterRoleSelectors.size(), builder); return (A)this;
  }
  public A setToClusterRoleSelectors(Integer index,V1LabelSelector item) {
    if (this.clusterRoleSelectors == null) {this.clusterRoleSelectors = new ArrayList<V1LabelSelectorBuilder>();}
    V1LabelSelectorBuilder builder = new V1LabelSelectorBuilder(item);
    if (index < 0 || index >= _visitables.get("clusterRoleSelectors").size()) { _visitables.get("clusterRoleSelectors").add(builder); } else { _visitables.get("clusterRoleSelectors").set(index, builder);}
    if (index < 0 || index >= clusterRoleSelectors.size()) { clusterRoleSelectors.add(builder); } else { clusterRoleSelectors.set(index, builder);}
     return (A)this;
  }
  public A addToClusterRoleSelectors(io.kubernetes.client.openapi.models.V1LabelSelector... items) {
    if (this.clusterRoleSelectors == null) {this.clusterRoleSelectors = new ArrayList<V1LabelSelectorBuilder>();}
    for (V1LabelSelector item : items) {V1LabelSelectorBuilder builder = new V1LabelSelectorBuilder(item);_visitables.get("clusterRoleSelectors").add(builder);this.clusterRoleSelectors.add(builder);} return (A)this;
  }
  public A addAllToClusterRoleSelectors(Collection<V1LabelSelector> items) {
    if (this.clusterRoleSelectors == null) {this.clusterRoleSelectors = new ArrayList<V1LabelSelectorBuilder>();}
    for (V1LabelSelector item : items) {V1LabelSelectorBuilder builder = new V1LabelSelectorBuilder(item);_visitables.get("clusterRoleSelectors").add(builder);this.clusterRoleSelectors.add(builder);} return (A)this;
  }
  public A removeFromClusterRoleSelectors(io.kubernetes.client.openapi.models.V1LabelSelector... items) {
    for (V1LabelSelector item : items) {V1LabelSelectorBuilder builder = new V1LabelSelectorBuilder(item);_visitables.get("clusterRoleSelectors").remove(builder);if (this.clusterRoleSelectors != null) {this.clusterRoleSelectors.remove(builder);}} return (A)this;
  }
  public A removeAllFromClusterRoleSelectors(Collection<V1LabelSelector> items) {
    for (V1LabelSelector item : items) {V1LabelSelectorBuilder builder = new V1LabelSelectorBuilder(item);_visitables.get("clusterRoleSelectors").remove(builder);if (this.clusterRoleSelectors != null) {this.clusterRoleSelectors.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromClusterRoleSelectors(Predicate<V1LabelSelectorBuilder> predicate) {
    if (clusterRoleSelectors == null) return (A) this;
    final Iterator<V1LabelSelectorBuilder> each = clusterRoleSelectors.iterator();
    final List visitables = _visitables.get("clusterRoleSelectors");
    while (each.hasNext()) {
      V1LabelSelectorBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildClusterRoleSelectors instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1LabelSelector> getClusterRoleSelectors() {
    return clusterRoleSelectors != null ? build(clusterRoleSelectors) : null;
  }
  public List<V1LabelSelector> buildClusterRoleSelectors() {
    return clusterRoleSelectors != null ? build(clusterRoleSelectors) : null;
  }
  public V1LabelSelector buildClusterRoleSelector(Integer index) {
    return this.clusterRoleSelectors.get(index).build();
  }
  public V1LabelSelector buildFirstClusterRoleSelector() {
    return this.clusterRoleSelectors.get(0).build();
  }
  public V1LabelSelector buildLastClusterRoleSelector() {
    return this.clusterRoleSelectors.get(clusterRoleSelectors.size() - 1).build();
  }
  public V1LabelSelector buildMatchingClusterRoleSelector(Predicate<V1LabelSelectorBuilder> predicate) {
    for (V1LabelSelectorBuilder item: clusterRoleSelectors) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingClusterRoleSelector(Predicate<V1LabelSelectorBuilder> predicate) {
    for (V1LabelSelectorBuilder item: clusterRoleSelectors) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withClusterRoleSelectors(List<V1LabelSelector> clusterRoleSelectors) {
    if (this.clusterRoleSelectors != null) { _visitables.get("clusterRoleSelectors").removeAll(this.clusterRoleSelectors);}
    if (clusterRoleSelectors != null) {this.clusterRoleSelectors = new ArrayList(); for (V1LabelSelector item : clusterRoleSelectors){this.addToClusterRoleSelectors(item);}} else { this.clusterRoleSelectors = null;} return (A) this;
  }
  public A withClusterRoleSelectors(io.kubernetes.client.openapi.models.V1LabelSelector... clusterRoleSelectors) {
    if (this.clusterRoleSelectors != null) {this.clusterRoleSelectors.clear();}
    if (clusterRoleSelectors != null) {for (V1LabelSelector item :clusterRoleSelectors){ this.addToClusterRoleSelectors(item);}} return (A) this;
  }
  public Boolean hasClusterRoleSelectors() {
    return clusterRoleSelectors != null && !clusterRoleSelectors.isEmpty();
  }
  public V1AggregationRuleFluent.ClusterRoleSelectorsNested<A> addNewClusterRoleSelector() {
    return new V1AggregationRuleFluentImpl.ClusterRoleSelectorsNestedImpl();
  }
  public V1AggregationRuleFluent.ClusterRoleSelectorsNested<A> addNewClusterRoleSelectorLike(V1LabelSelector item) {
    return new V1AggregationRuleFluentImpl.ClusterRoleSelectorsNestedImpl(-1, item);
  }
  public V1AggregationRuleFluent.ClusterRoleSelectorsNested<A> setNewClusterRoleSelectorLike(Integer index,V1LabelSelector item) {
    return new V1AggregationRuleFluentImpl.ClusterRoleSelectorsNestedImpl(index, item);
  }
  public V1AggregationRuleFluent.ClusterRoleSelectorsNested<A> editClusterRoleSelector(Integer index) {
    if (clusterRoleSelectors.size() <= index) throw new RuntimeException("Can't edit clusterRoleSelectors. Index exceeds size.");
    return setNewClusterRoleSelectorLike(index, buildClusterRoleSelector(index));
  }
  public V1AggregationRuleFluent.ClusterRoleSelectorsNested<A> editFirstClusterRoleSelector() {
    if (clusterRoleSelectors.size() == 0) throw new RuntimeException("Can't edit first clusterRoleSelectors. The list is empty.");
    return setNewClusterRoleSelectorLike(0, buildClusterRoleSelector(0));
  }
  public V1AggregationRuleFluent.ClusterRoleSelectorsNested<A> editLastClusterRoleSelector() {
    int index = clusterRoleSelectors.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last clusterRoleSelectors. The list is empty.");
    return setNewClusterRoleSelectorLike(index, buildClusterRoleSelector(index));
  }
  public V1AggregationRuleFluent.ClusterRoleSelectorsNested<A> editMatchingClusterRoleSelector(Predicate<V1LabelSelectorBuilder> predicate) {
    int index = -1;
    for (int i=0;i<clusterRoleSelectors.size();i++) { 
    if (predicate.test(clusterRoleSelectors.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching clusterRoleSelectors. No match found.");
    return setNewClusterRoleSelectorLike(index, buildClusterRoleSelector(index));
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1AggregationRuleFluentImpl that = (V1AggregationRuleFluentImpl) o;
    if (clusterRoleSelectors != null ? !clusterRoleSelectors.equals(that.clusterRoleSelectors) :that.clusterRoleSelectors != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(clusterRoleSelectors,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (clusterRoleSelectors != null && !clusterRoleSelectors.isEmpty()) { sb.append("clusterRoleSelectors:"); sb.append(clusterRoleSelectors); }
    sb.append("}");
    return sb.toString();
  }
  class ClusterRoleSelectorsNestedImpl<N> extends V1LabelSelectorFluentImpl<V1AggregationRuleFluent.ClusterRoleSelectorsNested<N>> implements V1AggregationRuleFluent.ClusterRoleSelectorsNested<N>,Nested<N>{
    ClusterRoleSelectorsNestedImpl(Integer index,V1LabelSelector item) {
      this.index = index;
      this.builder = new V1LabelSelectorBuilder(this, item);
    }
    ClusterRoleSelectorsNestedImpl() {
      this.index = -1;
      this.builder = new V1LabelSelectorBuilder(this);
    }
    V1LabelSelectorBuilder builder;
    Integer index;
    public N and() {
      return (N) V1AggregationRuleFluentImpl.this.setToClusterRoleSelectors(index,builder.build());
    }
    public N endClusterRoleSelector() {
      return and();
    }
    
  }
  
}