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
public class V1NodeAffinityFluent<A extends V1NodeAffinityFluent<A>> extends BaseFluent<A>{
  public V1NodeAffinityFluent() {
  }
  
  public V1NodeAffinityFluent(V1NodeAffinity instance) {
    this.copyInstance(instance);
  }
  private ArrayList<V1PreferredSchedulingTermBuilder> preferredDuringSchedulingIgnoredDuringExecution;
  private V1NodeSelectorBuilder requiredDuringSchedulingIgnoredDuringExecution;
  
  protected void copyInstance(V1NodeAffinity instance) {
    instance = (instance != null ? instance : new V1NodeAffinity());
    if (instance != null) {
          this.withPreferredDuringSchedulingIgnoredDuringExecution(instance.getPreferredDuringSchedulingIgnoredDuringExecution());
          this.withRequiredDuringSchedulingIgnoredDuringExecution(instance.getRequiredDuringSchedulingIgnoredDuringExecution());
        }
  }
  
  public A addToPreferredDuringSchedulingIgnoredDuringExecution(int index,V1PreferredSchedulingTerm item) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution == null) {this.preferredDuringSchedulingIgnoredDuringExecution = new ArrayList<V1PreferredSchedulingTermBuilder>();}
    V1PreferredSchedulingTermBuilder builder = new V1PreferredSchedulingTermBuilder(item);
    if (index < 0 || index >= preferredDuringSchedulingIgnoredDuringExecution.size()) { _visitables.get("preferredDuringSchedulingIgnoredDuringExecution").add(builder); preferredDuringSchedulingIgnoredDuringExecution.add(builder); } else { _visitables.get("preferredDuringSchedulingIgnoredDuringExecution").add(index, builder); preferredDuringSchedulingIgnoredDuringExecution.add(index, builder);}
    return (A)this;
  }
  
  public A setToPreferredDuringSchedulingIgnoredDuringExecution(int index,V1PreferredSchedulingTerm item) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution == null) {this.preferredDuringSchedulingIgnoredDuringExecution = new ArrayList<V1PreferredSchedulingTermBuilder>();}
    V1PreferredSchedulingTermBuilder builder = new V1PreferredSchedulingTermBuilder(item);
    if (index < 0 || index >= preferredDuringSchedulingIgnoredDuringExecution.size()) { _visitables.get("preferredDuringSchedulingIgnoredDuringExecution").add(builder); preferredDuringSchedulingIgnoredDuringExecution.add(builder); } else { _visitables.get("preferredDuringSchedulingIgnoredDuringExecution").set(index, builder); preferredDuringSchedulingIgnoredDuringExecution.set(index, builder);}
    return (A)this;
  }
  
  public A addToPreferredDuringSchedulingIgnoredDuringExecution(io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm... items) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution == null) {this.preferredDuringSchedulingIgnoredDuringExecution = new ArrayList<V1PreferredSchedulingTermBuilder>();}
    for (V1PreferredSchedulingTerm item : items) {V1PreferredSchedulingTermBuilder builder = new V1PreferredSchedulingTermBuilder(item);_visitables.get("preferredDuringSchedulingIgnoredDuringExecution").add(builder);this.preferredDuringSchedulingIgnoredDuringExecution.add(builder);} return (A)this;
  }
  
  public A addAllToPreferredDuringSchedulingIgnoredDuringExecution(Collection<V1PreferredSchedulingTerm> items) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution == null) {this.preferredDuringSchedulingIgnoredDuringExecution = new ArrayList<V1PreferredSchedulingTermBuilder>();}
    for (V1PreferredSchedulingTerm item : items) {V1PreferredSchedulingTermBuilder builder = new V1PreferredSchedulingTermBuilder(item);_visitables.get("preferredDuringSchedulingIgnoredDuringExecution").add(builder);this.preferredDuringSchedulingIgnoredDuringExecution.add(builder);} return (A)this;
  }
  
  public A removeFromPreferredDuringSchedulingIgnoredDuringExecution(io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm... items) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution == null) return (A)this;
    for (V1PreferredSchedulingTerm item : items) {V1PreferredSchedulingTermBuilder builder = new V1PreferredSchedulingTermBuilder(item);_visitables.get("preferredDuringSchedulingIgnoredDuringExecution").remove(builder); this.preferredDuringSchedulingIgnoredDuringExecution.remove(builder);} return (A)this;
  }
  
  public A removeAllFromPreferredDuringSchedulingIgnoredDuringExecution(Collection<V1PreferredSchedulingTerm> items) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution == null) return (A)this;
    for (V1PreferredSchedulingTerm item : items) {V1PreferredSchedulingTermBuilder builder = new V1PreferredSchedulingTermBuilder(item);_visitables.get("preferredDuringSchedulingIgnoredDuringExecution").remove(builder); this.preferredDuringSchedulingIgnoredDuringExecution.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromPreferredDuringSchedulingIgnoredDuringExecution(Predicate<V1PreferredSchedulingTermBuilder> predicate) {
    if (preferredDuringSchedulingIgnoredDuringExecution == null) return (A) this;
    final Iterator<V1PreferredSchedulingTermBuilder> each = preferredDuringSchedulingIgnoredDuringExecution.iterator();
    final List visitables = _visitables.get("preferredDuringSchedulingIgnoredDuringExecution");
    while (each.hasNext()) {
      V1PreferredSchedulingTermBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1PreferredSchedulingTerm> buildPreferredDuringSchedulingIgnoredDuringExecution() {
    return this.preferredDuringSchedulingIgnoredDuringExecution != null ? build(preferredDuringSchedulingIgnoredDuringExecution) : null;
  }
  
  public V1PreferredSchedulingTerm buildPreferredDuringSchedulingIgnoredDuringExecution(int index) {
    return this.preferredDuringSchedulingIgnoredDuringExecution.get(index).build();
  }
  
  public V1PreferredSchedulingTerm buildFirstPreferredDuringSchedulingIgnoredDuringExecution() {
    return this.preferredDuringSchedulingIgnoredDuringExecution.get(0).build();
  }
  
  public V1PreferredSchedulingTerm buildLastPreferredDuringSchedulingIgnoredDuringExecution() {
    return this.preferredDuringSchedulingIgnoredDuringExecution.get(preferredDuringSchedulingIgnoredDuringExecution.size() - 1).build();
  }
  
  public V1PreferredSchedulingTerm buildMatchingPreferredDuringSchedulingIgnoredDuringExecution(Predicate<V1PreferredSchedulingTermBuilder> predicate) {
      for (V1PreferredSchedulingTermBuilder item : preferredDuringSchedulingIgnoredDuringExecution) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingPreferredDuringSchedulingIgnoredDuringExecution(Predicate<V1PreferredSchedulingTermBuilder> predicate) {
      for (V1PreferredSchedulingTermBuilder item : preferredDuringSchedulingIgnoredDuringExecution) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withPreferredDuringSchedulingIgnoredDuringExecution(List<V1PreferredSchedulingTerm> preferredDuringSchedulingIgnoredDuringExecution) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution != null) {
      this._visitables.get("preferredDuringSchedulingIgnoredDuringExecution").clear();
    }
    if (preferredDuringSchedulingIgnoredDuringExecution != null) {
        this.preferredDuringSchedulingIgnoredDuringExecution = new ArrayList();
        for (V1PreferredSchedulingTerm item : preferredDuringSchedulingIgnoredDuringExecution) {
          this.addToPreferredDuringSchedulingIgnoredDuringExecution(item);
        }
    } else {
      this.preferredDuringSchedulingIgnoredDuringExecution = null;
    }
    return (A) this;
  }
  
  public A withPreferredDuringSchedulingIgnoredDuringExecution(io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm... preferredDuringSchedulingIgnoredDuringExecution) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution != null) {
        this.preferredDuringSchedulingIgnoredDuringExecution.clear();
        _visitables.remove("preferredDuringSchedulingIgnoredDuringExecution");
    }
    if (preferredDuringSchedulingIgnoredDuringExecution != null) {
      for (V1PreferredSchedulingTerm item : preferredDuringSchedulingIgnoredDuringExecution) {
        this.addToPreferredDuringSchedulingIgnoredDuringExecution(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasPreferredDuringSchedulingIgnoredDuringExecution() {
    return this.preferredDuringSchedulingIgnoredDuringExecution != null && !this.preferredDuringSchedulingIgnoredDuringExecution.isEmpty();
  }
  
  public PreferredDuringSchedulingIgnoredDuringExecutionNested<A> addNewPreferredDuringSchedulingIgnoredDuringExecution() {
    return new PreferredDuringSchedulingIgnoredDuringExecutionNested(-1, null);
  }
  
  public PreferredDuringSchedulingIgnoredDuringExecutionNested<A> addNewPreferredDuringSchedulingIgnoredDuringExecutionLike(V1PreferredSchedulingTerm item) {
    return new PreferredDuringSchedulingIgnoredDuringExecutionNested(-1, item);
  }
  
  public PreferredDuringSchedulingIgnoredDuringExecutionNested<A> setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(int index,V1PreferredSchedulingTerm item) {
    return new PreferredDuringSchedulingIgnoredDuringExecutionNested(index, item);
  }
  
  public PreferredDuringSchedulingIgnoredDuringExecutionNested<A> editPreferredDuringSchedulingIgnoredDuringExecution(int index) {
    if (preferredDuringSchedulingIgnoredDuringExecution.size() <= index) throw new RuntimeException("Can't edit preferredDuringSchedulingIgnoredDuringExecution. Index exceeds size.");
    return setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(index, buildPreferredDuringSchedulingIgnoredDuringExecution(index));
  }
  
  public PreferredDuringSchedulingIgnoredDuringExecutionNested<A> editFirstPreferredDuringSchedulingIgnoredDuringExecution() {
    if (preferredDuringSchedulingIgnoredDuringExecution.size() == 0) throw new RuntimeException("Can't edit first preferredDuringSchedulingIgnoredDuringExecution. The list is empty.");
    return setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(0, buildPreferredDuringSchedulingIgnoredDuringExecution(0));
  }
  
  public PreferredDuringSchedulingIgnoredDuringExecutionNested<A> editLastPreferredDuringSchedulingIgnoredDuringExecution() {
    int index = preferredDuringSchedulingIgnoredDuringExecution.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last preferredDuringSchedulingIgnoredDuringExecution. The list is empty.");
    return setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(index, buildPreferredDuringSchedulingIgnoredDuringExecution(index));
  }
  
  public PreferredDuringSchedulingIgnoredDuringExecutionNested<A> editMatchingPreferredDuringSchedulingIgnoredDuringExecution(Predicate<V1PreferredSchedulingTermBuilder> predicate) {
    int index = -1;
    for (int i=0;i<preferredDuringSchedulingIgnoredDuringExecution.size();i++) { 
    if (predicate.test(preferredDuringSchedulingIgnoredDuringExecution.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching preferredDuringSchedulingIgnoredDuringExecution. No match found.");
    return setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(index, buildPreferredDuringSchedulingIgnoredDuringExecution(index));
  }
  
  public V1NodeSelector buildRequiredDuringSchedulingIgnoredDuringExecution() {
    return this.requiredDuringSchedulingIgnoredDuringExecution != null ? this.requiredDuringSchedulingIgnoredDuringExecution.build() : null;
  }
  
  public A withRequiredDuringSchedulingIgnoredDuringExecution(V1NodeSelector requiredDuringSchedulingIgnoredDuringExecution) {
    this._visitables.remove("requiredDuringSchedulingIgnoredDuringExecution");
    if (requiredDuringSchedulingIgnoredDuringExecution != null) {
        this.requiredDuringSchedulingIgnoredDuringExecution = new V1NodeSelectorBuilder(requiredDuringSchedulingIgnoredDuringExecution);
        this._visitables.get("requiredDuringSchedulingIgnoredDuringExecution").add(this.requiredDuringSchedulingIgnoredDuringExecution);
    } else {
        this.requiredDuringSchedulingIgnoredDuringExecution = null;
        this._visitables.get("requiredDuringSchedulingIgnoredDuringExecution").remove(this.requiredDuringSchedulingIgnoredDuringExecution);
    }
    return (A) this;
  }
  
  public boolean hasRequiredDuringSchedulingIgnoredDuringExecution() {
    return this.requiredDuringSchedulingIgnoredDuringExecution != null;
  }
  
  public RequiredDuringSchedulingIgnoredDuringExecutionNested<A> withNewRequiredDuringSchedulingIgnoredDuringExecution() {
    return new RequiredDuringSchedulingIgnoredDuringExecutionNested(null);
  }
  
  public RequiredDuringSchedulingIgnoredDuringExecutionNested<A> withNewRequiredDuringSchedulingIgnoredDuringExecutionLike(V1NodeSelector item) {
    return new RequiredDuringSchedulingIgnoredDuringExecutionNested(item);
  }
  
  public RequiredDuringSchedulingIgnoredDuringExecutionNested<A> editRequiredDuringSchedulingIgnoredDuringExecution() {
    return withNewRequiredDuringSchedulingIgnoredDuringExecutionLike(java.util.Optional.ofNullable(buildRequiredDuringSchedulingIgnoredDuringExecution()).orElse(null));
  }
  
  public RequiredDuringSchedulingIgnoredDuringExecutionNested<A> editOrNewRequiredDuringSchedulingIgnoredDuringExecution() {
    return withNewRequiredDuringSchedulingIgnoredDuringExecutionLike(java.util.Optional.ofNullable(buildRequiredDuringSchedulingIgnoredDuringExecution()).orElse(new V1NodeSelectorBuilder().build()));
  }
  
  public RequiredDuringSchedulingIgnoredDuringExecutionNested<A> editOrNewRequiredDuringSchedulingIgnoredDuringExecutionLike(V1NodeSelector item) {
    return withNewRequiredDuringSchedulingIgnoredDuringExecutionLike(java.util.Optional.ofNullable(buildRequiredDuringSchedulingIgnoredDuringExecution()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1NodeAffinityFluent that = (V1NodeAffinityFluent) o;
    if (!java.util.Objects.equals(preferredDuringSchedulingIgnoredDuringExecution, that.preferredDuringSchedulingIgnoredDuringExecution)) return false;
    if (!java.util.Objects.equals(requiredDuringSchedulingIgnoredDuringExecution, that.requiredDuringSchedulingIgnoredDuringExecution)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(preferredDuringSchedulingIgnoredDuringExecution,  requiredDuringSchedulingIgnoredDuringExecution,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (preferredDuringSchedulingIgnoredDuringExecution != null && !preferredDuringSchedulingIgnoredDuringExecution.isEmpty()) { sb.append("preferredDuringSchedulingIgnoredDuringExecution:"); sb.append(preferredDuringSchedulingIgnoredDuringExecution + ","); }
    if (requiredDuringSchedulingIgnoredDuringExecution != null) { sb.append("requiredDuringSchedulingIgnoredDuringExecution:"); sb.append(requiredDuringSchedulingIgnoredDuringExecution); }
    sb.append("}");
    return sb.toString();
  }
  public class PreferredDuringSchedulingIgnoredDuringExecutionNested<N> extends V1PreferredSchedulingTermFluent<PreferredDuringSchedulingIgnoredDuringExecutionNested<N>> implements Nested<N>{
    PreferredDuringSchedulingIgnoredDuringExecutionNested(int index,V1PreferredSchedulingTerm item) {
      this.index = index;
      this.builder = new V1PreferredSchedulingTermBuilder(this, item);
    }
    V1PreferredSchedulingTermBuilder builder;
    int index;
    
    public N and() {
      return (N) V1NodeAffinityFluent.this.setToPreferredDuringSchedulingIgnoredDuringExecution(index,builder.build());
    }
    
    public N endPreferredDuringSchedulingIgnoredDuringExecution() {
      return and();
    }
    
  
  }
  public class RequiredDuringSchedulingIgnoredDuringExecutionNested<N> extends V1NodeSelectorFluent<RequiredDuringSchedulingIgnoredDuringExecutionNested<N>> implements Nested<N>{
    RequiredDuringSchedulingIgnoredDuringExecutionNested(V1NodeSelector item) {
      this.builder = new V1NodeSelectorBuilder(this, item);
    }
    V1NodeSelectorBuilder builder;
    
    public N and() {
      return (N) V1NodeAffinityFluent.this.withRequiredDuringSchedulingIgnoredDuringExecution(builder.build());
    }
    
    public N endRequiredDuringSchedulingIgnoredDuringExecution() {
      return and();
    }
    
  
  }

}