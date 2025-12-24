package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
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
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1NodeSelectorFluent<A extends io.kubernetes.client.openapi.models.V1NodeSelectorFluent<A>> extends BaseFluent<A>{

  private ArrayList<V1NodeSelectorTermBuilder> nodeSelectorTerms;

  public V1NodeSelectorFluent() {
  }
  
  public V1NodeSelectorFluent(V1NodeSelector instance) {
    this.copyInstance(instance);
  }

  public A addAllToNodeSelectorTerms(Collection<V1NodeSelectorTerm> items) {
    if (this.nodeSelectorTerms == null) {
      this.nodeSelectorTerms = new ArrayList();
    }
    for (V1NodeSelectorTerm item : items) {
        V1NodeSelectorTermBuilder builder = new V1NodeSelectorTermBuilder(item);
        _visitables.get("nodeSelectorTerms").add(builder);
        this.nodeSelectorTerms.add(builder);
    }
    return (A) this;
  }
  
  public NodeSelectorTermsNested<A> addNewNodeSelectorTerm() {
    return new NodeSelectorTermsNested(-1, null);
  }
  
  public NodeSelectorTermsNested<A> addNewNodeSelectorTermLike(V1NodeSelectorTerm item) {
    return new NodeSelectorTermsNested(-1, item);
  }
  
  public A addToNodeSelectorTerms(V1NodeSelectorTerm... items) {
    if (this.nodeSelectorTerms == null) {
      this.nodeSelectorTerms = new ArrayList();
    }
    for (V1NodeSelectorTerm item : items) {
        V1NodeSelectorTermBuilder builder = new V1NodeSelectorTermBuilder(item);
        _visitables.get("nodeSelectorTerms").add(builder);
        this.nodeSelectorTerms.add(builder);
    }
    return (A) this;
  }
  
  public A addToNodeSelectorTerms(int index,V1NodeSelectorTerm item) {
    if (this.nodeSelectorTerms == null) {
      this.nodeSelectorTerms = new ArrayList();
    }
    V1NodeSelectorTermBuilder builder = new V1NodeSelectorTermBuilder(item);
    if (index < 0 || index >= nodeSelectorTerms.size()) {
        _visitables.get("nodeSelectorTerms").add(builder);
        nodeSelectorTerms.add(builder);
    } else {
        _visitables.get("nodeSelectorTerms").add(builder);
        nodeSelectorTerms.add(index, builder);
    }
    return (A) this;
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
  
  public V1NodeSelectorTerm buildNodeSelectorTerm(int index) {
    return this.nodeSelectorTerms.get(index).build();
  }
  
  public List<V1NodeSelectorTerm> buildNodeSelectorTerms() {
    return this.nodeSelectorTerms != null ? build(nodeSelectorTerms) : null;
  }
  
  protected void copyInstance(V1NodeSelector instance) {
    instance = instance != null ? instance : new V1NodeSelector();
    if (instance != null) {
      this.withNodeSelectorTerms(instance.getNodeSelectorTerms());
    }
  }
  
  public NodeSelectorTermsNested<A> editFirstNodeSelectorTerm() {
    if (nodeSelectorTerms.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "nodeSelectorTerms"));
    }
    return this.setNewNodeSelectorTermLike(0, this.buildNodeSelectorTerm(0));
  }
  
  public NodeSelectorTermsNested<A> editLastNodeSelectorTerm() {
    int index = nodeSelectorTerms.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "nodeSelectorTerms"));
    }
    return this.setNewNodeSelectorTermLike(index, this.buildNodeSelectorTerm(index));
  }
  
  public NodeSelectorTermsNested<A> editMatchingNodeSelectorTerm(Predicate<V1NodeSelectorTermBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < nodeSelectorTerms.size();i++) {
      if (predicate.test(nodeSelectorTerms.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "nodeSelectorTerms"));
    }
    return this.setNewNodeSelectorTermLike(index, this.buildNodeSelectorTerm(index));
  }
  
  public NodeSelectorTermsNested<A> editNodeSelectorTerm(int index) {
    if (nodeSelectorTerms.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "nodeSelectorTerms"));
    }
    return this.setNewNodeSelectorTermLike(index, this.buildNodeSelectorTerm(index));
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
    V1NodeSelectorFluent that = (V1NodeSelectorFluent) o;
    if (!(Objects.equals(nodeSelectorTerms, that.nodeSelectorTerms))) {
      return false;
    }
    return true;
  }
  
  public boolean hasMatchingNodeSelectorTerm(Predicate<V1NodeSelectorTermBuilder> predicate) {
      for (V1NodeSelectorTermBuilder item : nodeSelectorTerms) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasNodeSelectorTerms() {
    return this.nodeSelectorTerms != null && !(this.nodeSelectorTerms.isEmpty());
  }
  
  public int hashCode() {
    return Objects.hash(nodeSelectorTerms);
  }
  
  public A removeAllFromNodeSelectorTerms(Collection<V1NodeSelectorTerm> items) {
    if (this.nodeSelectorTerms == null) {
      return (A) this;
    }
    for (V1NodeSelectorTerm item : items) {
        V1NodeSelectorTermBuilder builder = new V1NodeSelectorTermBuilder(item);
        _visitables.get("nodeSelectorTerms").remove(builder);
        this.nodeSelectorTerms.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromNodeSelectorTerms(V1NodeSelectorTerm... items) {
    if (this.nodeSelectorTerms == null) {
      return (A) this;
    }
    for (V1NodeSelectorTerm item : items) {
        V1NodeSelectorTermBuilder builder = new V1NodeSelectorTermBuilder(item);
        _visitables.get("nodeSelectorTerms").remove(builder);
        this.nodeSelectorTerms.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromNodeSelectorTerms(Predicate<V1NodeSelectorTermBuilder> predicate) {
    if (nodeSelectorTerms == null) {
      return (A) this;
    }
    Iterator<V1NodeSelectorTermBuilder> each = nodeSelectorTerms.iterator();
    List visitables = _visitables.get("nodeSelectorTerms");
    while (each.hasNext()) {
        V1NodeSelectorTermBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public NodeSelectorTermsNested<A> setNewNodeSelectorTermLike(int index,V1NodeSelectorTerm item) {
    return new NodeSelectorTermsNested(index, item);
  }
  
  public A setToNodeSelectorTerms(int index,V1NodeSelectorTerm item) {
    if (this.nodeSelectorTerms == null) {
      this.nodeSelectorTerms = new ArrayList();
    }
    V1NodeSelectorTermBuilder builder = new V1NodeSelectorTermBuilder(item);
    if (index < 0 || index >= nodeSelectorTerms.size()) {
        _visitables.get("nodeSelectorTerms").add(builder);
        nodeSelectorTerms.add(builder);
    } else {
        _visitables.get("nodeSelectorTerms").add(builder);
        nodeSelectorTerms.set(index, builder);
    }
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(nodeSelectorTerms == null) && !(nodeSelectorTerms.isEmpty())) {
        sb.append("nodeSelectorTerms:");
        sb.append(nodeSelectorTerms);
    }
    sb.append("}");
    return sb.toString();
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
  
  public A withNodeSelectorTerms(V1NodeSelectorTerm... nodeSelectorTerms) {
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
  public class NodeSelectorTermsNested<N> extends V1NodeSelectorTermFluent<NodeSelectorTermsNested<N>> implements Nested<N>{
  
    V1NodeSelectorTermBuilder builder;
    int index;
  
    NodeSelectorTermsNested(int index,V1NodeSelectorTerm item) {
      this.index = index;
      this.builder = new V1NodeSelectorTermBuilder(this, item);
    }
  
    public N and() {
      return (N) V1NodeSelectorFluent.this.setToNodeSelectorTerms(index, builder.build());
    }
    
    public N endNodeSelectorTerm() {
      return and();
    }
    
  }
}