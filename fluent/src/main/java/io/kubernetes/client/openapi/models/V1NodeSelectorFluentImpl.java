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
  public class V1NodeSelectorFluentImpl<A extends V1NodeSelectorFluent<A>> extends BaseFluent<A> implements V1NodeSelectorFluent<A>{
  public V1NodeSelectorFluentImpl() {
  }
  public V1NodeSelectorFluentImpl(V1NodeSelector instance) {
    this.withNodeSelectorTerms(instance.getNodeSelectorTerms());

  }
  private ArrayList<V1NodeSelectorTermBuilder> nodeSelectorTerms;
  public A addToNodeSelectorTerms(Integer index,V1NodeSelectorTerm item) {
    if (this.nodeSelectorTerms == null) {this.nodeSelectorTerms = new ArrayList<V1NodeSelectorTermBuilder>();}
    V1NodeSelectorTermBuilder builder = new V1NodeSelectorTermBuilder(item);_visitables.get("nodeSelectorTerms").add(index >= 0 ? index : _visitables.get("nodeSelectorTerms").size(), builder);this.nodeSelectorTerms.add(index >= 0 ? index : nodeSelectorTerms.size(), builder); return (A)this;
  }
  public A setToNodeSelectorTerms(Integer index,V1NodeSelectorTerm item) {
    if (this.nodeSelectorTerms == null) {this.nodeSelectorTerms = new ArrayList<V1NodeSelectorTermBuilder>();}
    V1NodeSelectorTermBuilder builder = new V1NodeSelectorTermBuilder(item);
    if (index < 0 || index >= _visitables.get("nodeSelectorTerms").size()) { _visitables.get("nodeSelectorTerms").add(builder); } else { _visitables.get("nodeSelectorTerms").set(index, builder);}
    if (index < 0 || index >= nodeSelectorTerms.size()) { nodeSelectorTerms.add(builder); } else { nodeSelectorTerms.set(index, builder);}
     return (A)this;
  }
  public A addToNodeSelectorTerms(io.kubernetes.client.openapi.models.V1NodeSelectorTerm... items) {
    if (this.nodeSelectorTerms == null) {this.nodeSelectorTerms = new ArrayList<V1NodeSelectorTermBuilder>();}
    for (V1NodeSelectorTerm item : items) {V1NodeSelectorTermBuilder builder = new V1NodeSelectorTermBuilder(item);_visitables.get("nodeSelectorTerms").add(builder);this.nodeSelectorTerms.add(builder);} return (A)this;
  }
  public A addAllToNodeSelectorTerms(Collection<V1NodeSelectorTerm> items) {
    if (this.nodeSelectorTerms == null) {this.nodeSelectorTerms = new ArrayList<V1NodeSelectorTermBuilder>();}
    for (V1NodeSelectorTerm item : items) {V1NodeSelectorTermBuilder builder = new V1NodeSelectorTermBuilder(item);_visitables.get("nodeSelectorTerms").add(builder);this.nodeSelectorTerms.add(builder);} return (A)this;
  }
  public A removeFromNodeSelectorTerms(io.kubernetes.client.openapi.models.V1NodeSelectorTerm... items) {
    for (V1NodeSelectorTerm item : items) {V1NodeSelectorTermBuilder builder = new V1NodeSelectorTermBuilder(item);_visitables.get("nodeSelectorTerms").remove(builder);if (this.nodeSelectorTerms != null) {this.nodeSelectorTerms.remove(builder);}} return (A)this;
  }
  public A removeAllFromNodeSelectorTerms(Collection<V1NodeSelectorTerm> items) {
    for (V1NodeSelectorTerm item : items) {V1NodeSelectorTermBuilder builder = new V1NodeSelectorTermBuilder(item);_visitables.get("nodeSelectorTerms").remove(builder);if (this.nodeSelectorTerms != null) {this.nodeSelectorTerms.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromNodeSelectorTerms(Predicate<V1NodeSelectorTermBuilder> predicate) {
    if (nodeSelectorTerms == null) return (A) this;
    final Iterator<V1NodeSelectorTermBuilder> each = nodeSelectorTerms.iterator();
    final List visitables = _visitables.get("nodeSelectorTerms");
    while (each.hasNext()) {
      V1NodeSelectorTermBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildNodeSelectorTerms instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1NodeSelectorTerm> getNodeSelectorTerms() {
    return nodeSelectorTerms != null ? build(nodeSelectorTerms) : null;
  }
  public List<V1NodeSelectorTerm> buildNodeSelectorTerms() {
    return nodeSelectorTerms != null ? build(nodeSelectorTerms) : null;
  }
  public V1NodeSelectorTerm buildNodeSelectorTerm(Integer index) {
    return this.nodeSelectorTerms.get(index).build();
  }
  public V1NodeSelectorTerm buildFirstNodeSelectorTerm() {
    return this.nodeSelectorTerms.get(0).build();
  }
  public V1NodeSelectorTerm buildLastNodeSelectorTerm() {
    return this.nodeSelectorTerms.get(nodeSelectorTerms.size() - 1).build();
  }
  public V1NodeSelectorTerm buildMatchingNodeSelectorTerm(Predicate<V1NodeSelectorTermBuilder> predicate) {
    for (V1NodeSelectorTermBuilder item: nodeSelectorTerms) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingNodeSelectorTerm(Predicate<V1NodeSelectorTermBuilder> predicate) {
    for (V1NodeSelectorTermBuilder item: nodeSelectorTerms) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withNodeSelectorTerms(List<V1NodeSelectorTerm> nodeSelectorTerms) {
    if (this.nodeSelectorTerms != null) { _visitables.get("nodeSelectorTerms").removeAll(this.nodeSelectorTerms);}
    if (nodeSelectorTerms != null) {this.nodeSelectorTerms = new ArrayList(); for (V1NodeSelectorTerm item : nodeSelectorTerms){this.addToNodeSelectorTerms(item);}} else { this.nodeSelectorTerms = null;} return (A) this;
  }
  public A withNodeSelectorTerms(io.kubernetes.client.openapi.models.V1NodeSelectorTerm... nodeSelectorTerms) {
    if (this.nodeSelectorTerms != null) {this.nodeSelectorTerms.clear();}
    if (nodeSelectorTerms != null) {for (V1NodeSelectorTerm item :nodeSelectorTerms){ this.addToNodeSelectorTerms(item);}} return (A) this;
  }
  public Boolean hasNodeSelectorTerms() {
    return nodeSelectorTerms != null && !nodeSelectorTerms.isEmpty();
  }
  public V1NodeSelectorFluent.NodeSelectorTermsNested<A> addNewNodeSelectorTerm() {
    return new V1NodeSelectorFluentImpl.NodeSelectorTermsNestedImpl();
  }
  public V1NodeSelectorFluent.NodeSelectorTermsNested<A> addNewNodeSelectorTermLike(V1NodeSelectorTerm item) {
    return new V1NodeSelectorFluentImpl.NodeSelectorTermsNestedImpl(-1, item);
  }
  public V1NodeSelectorFluent.NodeSelectorTermsNested<A> setNewNodeSelectorTermLike(Integer index,V1NodeSelectorTerm item) {
    return new V1NodeSelectorFluentImpl.NodeSelectorTermsNestedImpl(index, item);
  }
  public V1NodeSelectorFluent.NodeSelectorTermsNested<A> editNodeSelectorTerm(Integer index) {
    if (nodeSelectorTerms.size() <= index) throw new RuntimeException("Can't edit nodeSelectorTerms. Index exceeds size.");
    return setNewNodeSelectorTermLike(index, buildNodeSelectorTerm(index));
  }
  public V1NodeSelectorFluent.NodeSelectorTermsNested<A> editFirstNodeSelectorTerm() {
    if (nodeSelectorTerms.size() == 0) throw new RuntimeException("Can't edit first nodeSelectorTerms. The list is empty.");
    return setNewNodeSelectorTermLike(0, buildNodeSelectorTerm(0));
  }
  public V1NodeSelectorFluent.NodeSelectorTermsNested<A> editLastNodeSelectorTerm() {
    int index = nodeSelectorTerms.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last nodeSelectorTerms. The list is empty.");
    return setNewNodeSelectorTermLike(index, buildNodeSelectorTerm(index));
  }
  public V1NodeSelectorFluent.NodeSelectorTermsNested<A> editMatchingNodeSelectorTerm(Predicate<V1NodeSelectorTermBuilder> predicate) {
    int index = -1;
    for (int i=0;i<nodeSelectorTerms.size();i++) { 
    if (predicate.test(nodeSelectorTerms.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching nodeSelectorTerms. No match found.");
    return setNewNodeSelectorTermLike(index, buildNodeSelectorTerm(index));
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1NodeSelectorFluentImpl that = (V1NodeSelectorFluentImpl) o;
    if (nodeSelectorTerms != null ? !nodeSelectorTerms.equals(that.nodeSelectorTerms) :that.nodeSelectorTerms != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(nodeSelectorTerms,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (nodeSelectorTerms != null && !nodeSelectorTerms.isEmpty()) { sb.append("nodeSelectorTerms:"); sb.append(nodeSelectorTerms); }
    sb.append("}");
    return sb.toString();
  }
  class NodeSelectorTermsNestedImpl<N> extends V1NodeSelectorTermFluentImpl<V1NodeSelectorFluent.NodeSelectorTermsNested<N>> implements V1NodeSelectorFluent.NodeSelectorTermsNested<N>,Nested<N>{
    NodeSelectorTermsNestedImpl(Integer index,V1NodeSelectorTerm item) {
      this.index = index;
      this.builder = new V1NodeSelectorTermBuilder(this, item);
    }
    NodeSelectorTermsNestedImpl() {
      this.index = -1;
      this.builder = new V1NodeSelectorTermBuilder(this);
    }
    V1NodeSelectorTermBuilder builder;
    Integer index;
    public N and() {
      return (N) V1NodeSelectorFluentImpl.this.setToNodeSelectorTerms(index,builder.build());
    }
    public N endNodeSelectorTerm() {
      return and();
    }
    
  }
  
}