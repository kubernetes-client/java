package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1NodeSelectorFluent<A extends V1NodeSelectorFluent<A>> extends BaseFluent<A>{
  public V1NodeSelectorFluent() {
  }
  
  public V1NodeSelectorFluent(V1NodeSelector instance) {
    this.copyInstance(instance);
  }
  private ArrayList<V1NodeSelectorTermBuilder> nodeSelectorTerms;
  
  protected void copyInstance(V1NodeSelector instance) {
    instance = (instance != null ? instance : new V1NodeSelector());
    if (instance != null) {
          this.withNodeSelectorTerms(instance.getNodeSelectorTerms());
        }
  }
  
  public A addToNodeSelectorTerms(int index,V1NodeSelectorTerm item) {
    if (this.nodeSelectorTerms == null) {this.nodeSelectorTerms = new ArrayList<V1NodeSelectorTermBuilder>();}
    V1NodeSelectorTermBuilder builder = new V1NodeSelectorTermBuilder(item);
    if (index < 0 || index >= nodeSelectorTerms.size()) { _visitables.get("nodeSelectorTerms").add(builder); nodeSelectorTerms.add(builder); } else { _visitables.get("nodeSelectorTerms").add(index, builder); nodeSelectorTerms.add(index, builder);}
    return (A)this;
  }
  
  public A setToNodeSelectorTerms(int index,V1NodeSelectorTerm item) {
    if (this.nodeSelectorTerms == null) {this.nodeSelectorTerms = new ArrayList<V1NodeSelectorTermBuilder>();}
    V1NodeSelectorTermBuilder builder = new V1NodeSelectorTermBuilder(item);
    if (index < 0 || index >= nodeSelectorTerms.size()) { _visitables.get("nodeSelectorTerms").add(builder); nodeSelectorTerms.add(builder); } else { _visitables.get("nodeSelectorTerms").set(index, builder); nodeSelectorTerms.set(index, builder);}
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
    if (this.nodeSelectorTerms == null) return (A)this;
    for (V1NodeSelectorTerm item : items) {V1NodeSelectorTermBuilder builder = new V1NodeSelectorTermBuilder(item);_visitables.get("nodeSelectorTerms").remove(builder); this.nodeSelectorTerms.remove(builder);} return (A)this;
  }
  
  public A removeAllFromNodeSelectorTerms(Collection<V1NodeSelectorTerm> items) {
    if (this.nodeSelectorTerms == null) return (A)this;
    for (V1NodeSelectorTerm item : items) {V1NodeSelectorTermBuilder builder = new V1NodeSelectorTermBuilder(item);_visitables.get("nodeSelectorTerms").remove(builder); this.nodeSelectorTerms.remove(builder);} return (A)this;
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
  
  public List<V1NodeSelectorTerm> buildNodeSelectorTerms() {
    return this.nodeSelectorTerms != null ? build(nodeSelectorTerms) : null;
  }
  
  public V1NodeSelectorTerm buildNodeSelectorTerm(int index) {
    return this.nodeSelectorTerms.get(index).build();
  }
  
  public V1NodeSelectorTerm buildFirstNodeSelectorTerm() {
    return this.nodeSelectorTerms.get(0).build();
  }
  
  public V1NodeSelectorTerm buildLastNodeSelectorTerm() {
    return this.nodeSelectorTerms.get(nodeSelectorTerms.size() - 1).build();
  }
  
  public V1NodeSelectorTerm buildMatchingNodeSelectorTerm(Predicate<V1NodeSelectorTermBuilder> predicate) {
      for (V1NodeSelectorTermBuilder item : nodeSelectorTerms) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingNodeSelectorTerm(Predicate<V1NodeSelectorTermBuilder> predicate) {
      for (V1NodeSelectorTermBuilder item : nodeSelectorTerms) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withNodeSelectorTerms(List<V1NodeSelectorTerm> nodeSelectorTerms) {
    if (this.nodeSelectorTerms != null) {
      this._visitables.get("nodeSelectorTerms").clear();
    }
    if (nodeSelectorTerms != null) {
        this.nodeSelectorTerms = new ArrayList();
        for (V1NodeSelectorTerm item : nodeSelectorTerms) {
          this.addToNodeSelectorTerms(item);
        }
    } else {
      this.nodeSelectorTerms = null;
    }
    return (A) this;
  }
  
  public A withNodeSelectorTerms(io.kubernetes.client.openapi.models.V1NodeSelectorTerm... nodeSelectorTerms) {
    if (this.nodeSelectorTerms != null) {
        this.nodeSelectorTerms.clear();
        _visitables.remove("nodeSelectorTerms");
    }
    if (nodeSelectorTerms != null) {
      for (V1NodeSelectorTerm item : nodeSelectorTerms) {
        this.addToNodeSelectorTerms(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasNodeSelectorTerms() {
    return this.nodeSelectorTerms != null && !this.nodeSelectorTerms.isEmpty();
  }
  
  public NodeSelectorTermsNested<A> addNewNodeSelectorTerm() {
    return new NodeSelectorTermsNested(-1, null);
  }
  
  public NodeSelectorTermsNested<A> addNewNodeSelectorTermLike(V1NodeSelectorTerm item) {
    return new NodeSelectorTermsNested(-1, item);
  }
  
  public NodeSelectorTermsNested<A> setNewNodeSelectorTermLike(int index,V1NodeSelectorTerm item) {
    return new NodeSelectorTermsNested(index, item);
  }
  
  public NodeSelectorTermsNested<A> editNodeSelectorTerm(int index) {
    if (nodeSelectorTerms.size() <= index) throw new RuntimeException("Can't edit nodeSelectorTerms. Index exceeds size.");
    return setNewNodeSelectorTermLike(index, buildNodeSelectorTerm(index));
  }
  
  public NodeSelectorTermsNested<A> editFirstNodeSelectorTerm() {
    if (nodeSelectorTerms.size() == 0) throw new RuntimeException("Can't edit first nodeSelectorTerms. The list is empty.");
    return setNewNodeSelectorTermLike(0, buildNodeSelectorTerm(0));
  }
  
  public NodeSelectorTermsNested<A> editLastNodeSelectorTerm() {
    int index = nodeSelectorTerms.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last nodeSelectorTerms. The list is empty.");
    return setNewNodeSelectorTermLike(index, buildNodeSelectorTerm(index));
  }
  
  public NodeSelectorTermsNested<A> editMatchingNodeSelectorTerm(Predicate<V1NodeSelectorTermBuilder> predicate) {
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
    if (!super.equals(o)) return false;
    V1NodeSelectorFluent that = (V1NodeSelectorFluent) o;
    if (!java.util.Objects.equals(nodeSelectorTerms, that.nodeSelectorTerms)) return false;
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
  public class NodeSelectorTermsNested<N> extends V1NodeSelectorTermFluent<NodeSelectorTermsNested<N>> implements Nested<N>{
    NodeSelectorTermsNested(int index,V1NodeSelectorTerm item) {
      this.index = index;
      this.builder = new V1NodeSelectorTermBuilder(this, item);
    }
    V1NodeSelectorTermBuilder builder;
    int index;
    
    public N and() {
      return (N) V1NodeSelectorFluent.this.setToNodeSelectorTerms(index,builder.build());
    }
    
    public N endNodeSelectorTerm() {
      return and();
    }
    
  
  }

}