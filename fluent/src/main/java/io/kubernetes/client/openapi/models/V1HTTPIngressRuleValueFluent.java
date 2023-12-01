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
public class V1HTTPIngressRuleValueFluent<A extends V1HTTPIngressRuleValueFluent<A>> extends BaseFluent<A>{
  public V1HTTPIngressRuleValueFluent() {
  }
  
  public V1HTTPIngressRuleValueFluent(V1HTTPIngressRuleValue instance) {
    this.copyInstance(instance);
  }
  private ArrayList<V1HTTPIngressPathBuilder> paths;
  
  protected void copyInstance(V1HTTPIngressRuleValue instance) {
    instance = (instance != null ? instance : new V1HTTPIngressRuleValue());
    if (instance != null) {
          this.withPaths(instance.getPaths());
        }
  }
  
  public A addToPaths(int index,V1HTTPIngressPath item) {
    if (this.paths == null) {this.paths = new ArrayList<V1HTTPIngressPathBuilder>();}
    V1HTTPIngressPathBuilder builder = new V1HTTPIngressPathBuilder(item);
    if (index < 0 || index >= paths.size()) { _visitables.get("paths").add(builder); paths.add(builder); } else { _visitables.get("paths").add(index, builder); paths.add(index, builder);}
    return (A)this;
  }
  
  public A setToPaths(int index,V1HTTPIngressPath item) {
    if (this.paths == null) {this.paths = new ArrayList<V1HTTPIngressPathBuilder>();}
    V1HTTPIngressPathBuilder builder = new V1HTTPIngressPathBuilder(item);
    if (index < 0 || index >= paths.size()) { _visitables.get("paths").add(builder); paths.add(builder); } else { _visitables.get("paths").set(index, builder); paths.set(index, builder);}
    return (A)this;
  }
  
  public A addToPaths(io.kubernetes.client.openapi.models.V1HTTPIngressPath... items) {
    if (this.paths == null) {this.paths = new ArrayList<V1HTTPIngressPathBuilder>();}
    for (V1HTTPIngressPath item : items) {V1HTTPIngressPathBuilder builder = new V1HTTPIngressPathBuilder(item);_visitables.get("paths").add(builder);this.paths.add(builder);} return (A)this;
  }
  
  public A addAllToPaths(Collection<V1HTTPIngressPath> items) {
    if (this.paths == null) {this.paths = new ArrayList<V1HTTPIngressPathBuilder>();}
    for (V1HTTPIngressPath item : items) {V1HTTPIngressPathBuilder builder = new V1HTTPIngressPathBuilder(item);_visitables.get("paths").add(builder);this.paths.add(builder);} return (A)this;
  }
  
  public A removeFromPaths(io.kubernetes.client.openapi.models.V1HTTPIngressPath... items) {
    if (this.paths == null) return (A)this;
    for (V1HTTPIngressPath item : items) {V1HTTPIngressPathBuilder builder = new V1HTTPIngressPathBuilder(item);_visitables.get("paths").remove(builder); this.paths.remove(builder);} return (A)this;
  }
  
  public A removeAllFromPaths(Collection<V1HTTPIngressPath> items) {
    if (this.paths == null) return (A)this;
    for (V1HTTPIngressPath item : items) {V1HTTPIngressPathBuilder builder = new V1HTTPIngressPathBuilder(item);_visitables.get("paths").remove(builder); this.paths.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromPaths(Predicate<V1HTTPIngressPathBuilder> predicate) {
    if (paths == null) return (A) this;
    final Iterator<V1HTTPIngressPathBuilder> each = paths.iterator();
    final List visitables = _visitables.get("paths");
    while (each.hasNext()) {
      V1HTTPIngressPathBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1HTTPIngressPath> buildPaths() {
    return this.paths != null ? build(paths) : null;
  }
  
  public V1HTTPIngressPath buildPath(int index) {
    return this.paths.get(index).build();
  }
  
  public V1HTTPIngressPath buildFirstPath() {
    return this.paths.get(0).build();
  }
  
  public V1HTTPIngressPath buildLastPath() {
    return this.paths.get(paths.size() - 1).build();
  }
  
  public V1HTTPIngressPath buildMatchingPath(Predicate<V1HTTPIngressPathBuilder> predicate) {
      for (V1HTTPIngressPathBuilder item : paths) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingPath(Predicate<V1HTTPIngressPathBuilder> predicate) {
      for (V1HTTPIngressPathBuilder item : paths) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withPaths(List<V1HTTPIngressPath> paths) {
    if (this.paths != null) {
      this._visitables.get("paths").clear();
    }
    if (paths != null) {
        this.paths = new ArrayList();
        for (V1HTTPIngressPath item : paths) {
          this.addToPaths(item);
        }
    } else {
      this.paths = null;
    }
    return (A) this;
  }
  
  public A withPaths(io.kubernetes.client.openapi.models.V1HTTPIngressPath... paths) {
    if (this.paths != null) {
        this.paths.clear();
        _visitables.remove("paths");
    }
    if (paths != null) {
      for (V1HTTPIngressPath item : paths) {
        this.addToPaths(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasPaths() {
    return this.paths != null && !this.paths.isEmpty();
  }
  
  public PathsNested<A> addNewPath() {
    return new PathsNested(-1, null);
  }
  
  public PathsNested<A> addNewPathLike(V1HTTPIngressPath item) {
    return new PathsNested(-1, item);
  }
  
  public PathsNested<A> setNewPathLike(int index,V1HTTPIngressPath item) {
    return new PathsNested(index, item);
  }
  
  public PathsNested<A> editPath(int index) {
    if (paths.size() <= index) throw new RuntimeException("Can't edit paths. Index exceeds size.");
    return setNewPathLike(index, buildPath(index));
  }
  
  public PathsNested<A> editFirstPath() {
    if (paths.size() == 0) throw new RuntimeException("Can't edit first paths. The list is empty.");
    return setNewPathLike(0, buildPath(0));
  }
  
  public PathsNested<A> editLastPath() {
    int index = paths.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last paths. The list is empty.");
    return setNewPathLike(index, buildPath(index));
  }
  
  public PathsNested<A> editMatchingPath(Predicate<V1HTTPIngressPathBuilder> predicate) {
    int index = -1;
    for (int i=0;i<paths.size();i++) { 
    if (predicate.test(paths.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching paths. No match found.");
    return setNewPathLike(index, buildPath(index));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1HTTPIngressRuleValueFluent that = (V1HTTPIngressRuleValueFluent) o;
    if (!java.util.Objects.equals(paths, that.paths)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(paths,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (paths != null && !paths.isEmpty()) { sb.append("paths:"); sb.append(paths); }
    sb.append("}");
    return sb.toString();
  }
  public class PathsNested<N> extends V1HTTPIngressPathFluent<PathsNested<N>> implements Nested<N>{
    PathsNested(int index,V1HTTPIngressPath item) {
      this.index = index;
      this.builder = new V1HTTPIngressPathBuilder(this, item);
    }
    V1HTTPIngressPathBuilder builder;
    int index;
    
    public N and() {
      return (N) V1HTTPIngressRuleValueFluent.this.setToPaths(index,builder.build());
    }
    
    public N endPath() {
      return and();
    }
    
  
  }

}