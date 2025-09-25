package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.RuntimeException;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.Objects;
import java.util.Collection;
import java.lang.Object;
import java.util.List;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1AggregationRuleFluent<A extends io.kubernetes.client.openapi.models.V1AggregationRuleFluent<A>> extends BaseFluent<A>{
  public V1AggregationRuleFluent() {
  }
  
  public V1AggregationRuleFluent(V1AggregationRule instance) {
    this.copyInstance(instance);
  }
  private ArrayList<V1LabelSelectorBuilder> clusterRoleSelectors;
  
  protected void copyInstance(V1AggregationRule instance) {
    instance = instance != null ? instance : new V1AggregationRule();
    if (instance != null) {
      this.withClusterRoleSelectors(instance.getClusterRoleSelectors());
    }
  }
  
  public A addToClusterRoleSelectors(int index,V1LabelSelector item) {
    if (this.clusterRoleSelectors == null) {
      this.clusterRoleSelectors = new ArrayList();
    }
    V1LabelSelectorBuilder builder = new V1LabelSelectorBuilder(item);
    if (index < 0 || index >= clusterRoleSelectors.size()) {
        _visitables.get("clusterRoleSelectors").add(builder);
        clusterRoleSelectors.add(builder);
    } else {
        _visitables.get("clusterRoleSelectors").add(builder);
        clusterRoleSelectors.add(index, builder);
    }
    return (A) this;
  }
  
  public A setToClusterRoleSelectors(int index,V1LabelSelector item) {
    if (this.clusterRoleSelectors == null) {
      this.clusterRoleSelectors = new ArrayList();
    }
    V1LabelSelectorBuilder builder = new V1LabelSelectorBuilder(item);
    if (index < 0 || index >= clusterRoleSelectors.size()) {
        _visitables.get("clusterRoleSelectors").add(builder);
        clusterRoleSelectors.add(builder);
    } else {
        _visitables.get("clusterRoleSelectors").add(builder);
        clusterRoleSelectors.set(index, builder);
    }
    return (A) this;
  }
  
  public A addToClusterRoleSelectors(V1LabelSelector... items) {
    if (this.clusterRoleSelectors == null) {
      this.clusterRoleSelectors = new ArrayList();
    }
    for (V1LabelSelector item : items) {
        V1LabelSelectorBuilder builder = new V1LabelSelectorBuilder(item);
        _visitables.get("clusterRoleSelectors").add(builder);
        this.clusterRoleSelectors.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToClusterRoleSelectors(Collection<V1LabelSelector> items) {
    if (this.clusterRoleSelectors == null) {
      this.clusterRoleSelectors = new ArrayList();
    }
    for (V1LabelSelector item : items) {
        V1LabelSelectorBuilder builder = new V1LabelSelectorBuilder(item);
        _visitables.get("clusterRoleSelectors").add(builder);
        this.clusterRoleSelectors.add(builder);
    }
    return (A) this;
  }
  
  public A removeFromClusterRoleSelectors(V1LabelSelector... items) {
    if (this.clusterRoleSelectors == null) {
      return (A) this;
    }
    for (V1LabelSelector item : items) {
        V1LabelSelectorBuilder builder = new V1LabelSelectorBuilder(item);
        _visitables.get("clusterRoleSelectors").remove(builder);
        this.clusterRoleSelectors.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromClusterRoleSelectors(Collection<V1LabelSelector> items) {
    if (this.clusterRoleSelectors == null) {
      return (A) this;
    }
    for (V1LabelSelector item : items) {
        V1LabelSelectorBuilder builder = new V1LabelSelectorBuilder(item);
        _visitables.get("clusterRoleSelectors").remove(builder);
        this.clusterRoleSelectors.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromClusterRoleSelectors(Predicate<V1LabelSelectorBuilder> predicate) {
    if (clusterRoleSelectors == null) {
      return (A) this;
    }
    Iterator<V1LabelSelectorBuilder> each = clusterRoleSelectors.iterator();
    List visitables = _visitables.get("clusterRoleSelectors");
    while (each.hasNext()) {
        V1LabelSelectorBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public List<V1LabelSelector> buildClusterRoleSelectors() {
    return this.clusterRoleSelectors != null ? build(clusterRoleSelectors) : null;
  }
  
  public V1LabelSelector buildClusterRoleSelector(int index) {
    return this.clusterRoleSelectors.get(index).build();
  }
  
  public V1LabelSelector buildFirstClusterRoleSelector() {
    return this.clusterRoleSelectors.get(0).build();
  }
  
  public V1LabelSelector buildLastClusterRoleSelector() {
    return this.clusterRoleSelectors.get(clusterRoleSelectors.size() - 1).build();
  }
  
  public V1LabelSelector buildMatchingClusterRoleSelector(Predicate<V1LabelSelectorBuilder> predicate) {
      for (V1LabelSelectorBuilder item : clusterRoleSelectors) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingClusterRoleSelector(Predicate<V1LabelSelectorBuilder> predicate) {
      for (V1LabelSelectorBuilder item : clusterRoleSelectors) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withClusterRoleSelectors(List<V1LabelSelector> clusterRoleSelectors) {
    if (this.clusterRoleSelectors != null) {
      this._visitables.get("clusterRoleSelectors").clear();
    }
    if (clusterRoleSelectors != null) {
        this.clusterRoleSelectors = new ArrayList();
        for (V1LabelSelector item : clusterRoleSelectors) {
          this.addToClusterRoleSelectors(item);
        }
    } else {
      this.clusterRoleSelectors = null;
    }
    return (A) this;
  }
  
  public A withClusterRoleSelectors(V1LabelSelector... clusterRoleSelectors) {
    if (this.clusterRoleSelectors != null) {
        this.clusterRoleSelectors.clear();
        _visitables.remove("clusterRoleSelectors");
    }
    if (clusterRoleSelectors != null) {
      for (V1LabelSelector item : clusterRoleSelectors) {
        this.addToClusterRoleSelectors(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasClusterRoleSelectors() {
    return this.clusterRoleSelectors != null && !(this.clusterRoleSelectors.isEmpty());
  }
  
  public ClusterRoleSelectorsNested<A> addNewClusterRoleSelector() {
    return new ClusterRoleSelectorsNested(-1, null);
  }
  
  public ClusterRoleSelectorsNested<A> addNewClusterRoleSelectorLike(V1LabelSelector item) {
    return new ClusterRoleSelectorsNested(-1, item);
  }
  
  public ClusterRoleSelectorsNested<A> setNewClusterRoleSelectorLike(int index,V1LabelSelector item) {
    return new ClusterRoleSelectorsNested(index, item);
  }
  
  public ClusterRoleSelectorsNested<A> editClusterRoleSelector(int index) {
    if (index <= clusterRoleSelectors.size()) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "clusterRoleSelectors"));
    }
    return this.setNewClusterRoleSelectorLike(index, this.buildClusterRoleSelector(index));
  }
  
  public ClusterRoleSelectorsNested<A> editFirstClusterRoleSelector() {
    if (clusterRoleSelectors.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "clusterRoleSelectors"));
    }
    return this.setNewClusterRoleSelectorLike(0, this.buildClusterRoleSelector(0));
  }
  
  public ClusterRoleSelectorsNested<A> editLastClusterRoleSelector() {
    int index = clusterRoleSelectors.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "clusterRoleSelectors"));
    }
    return this.setNewClusterRoleSelectorLike(index, this.buildClusterRoleSelector(index));
  }
  
  public ClusterRoleSelectorsNested<A> editMatchingClusterRoleSelector(Predicate<V1LabelSelectorBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < clusterRoleSelectors.size();i++) {
      if (predicate.test(clusterRoleSelectors.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "clusterRoleSelectors"));
    }
    return this.setNewClusterRoleSelectorLike(index, this.buildClusterRoleSelector(index));
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
    V1AggregationRuleFluent that = (V1AggregationRuleFluent) o;
    if (!(Objects.equals(clusterRoleSelectors, that.clusterRoleSelectors))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(clusterRoleSelectors);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(clusterRoleSelectors == null) && !(clusterRoleSelectors.isEmpty())) {
        sb.append("clusterRoleSelectors:");
        sb.append(clusterRoleSelectors);
    }
    sb.append("}");
    return sb.toString();
  }
  public class ClusterRoleSelectorsNested<N> extends V1LabelSelectorFluent<ClusterRoleSelectorsNested<N>> implements Nested<N>{
    ClusterRoleSelectorsNested(int index,V1LabelSelector item) {
      this.index = index;
      this.builder = new V1LabelSelectorBuilder(this, item);
    }
    V1LabelSelectorBuilder builder;
    int index;
    
    public N and() {
      return (N) V1AggregationRuleFluent.this.setToClusterRoleSelectors(index, builder.build());
    }
    
    public N endClusterRoleSelector() {
      return and();
    }
    
  
  }

}