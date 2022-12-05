package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Collection;
import java.lang.Object;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1NodeAffinityFluentImpl<A extends V1NodeAffinityFluent<A>> extends BaseFluent<A> implements V1NodeAffinityFluent<A>{
  public V1NodeAffinityFluentImpl() {
  }
  public V1NodeAffinityFluentImpl(V1NodeAffinity instance) {
    this.withPreferredDuringSchedulingIgnoredDuringExecution(instance.getPreferredDuringSchedulingIgnoredDuringExecution());

    this.withRequiredDuringSchedulingIgnoredDuringExecution(instance.getRequiredDuringSchedulingIgnoredDuringExecution());

  }
  private ArrayList<V1PreferredSchedulingTermBuilder> preferredDuringSchedulingIgnoredDuringExecution;
  private V1NodeSelectorBuilder requiredDuringSchedulingIgnoredDuringExecution;
  public A addToPreferredDuringSchedulingIgnoredDuringExecution(Integer index,V1PreferredSchedulingTerm item) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution == null) {this.preferredDuringSchedulingIgnoredDuringExecution = new ArrayList<V1PreferredSchedulingTermBuilder>();}
    V1PreferredSchedulingTermBuilder builder = new V1PreferredSchedulingTermBuilder(item);_visitables.get("preferredDuringSchedulingIgnoredDuringExecution").add(index >= 0 ? index : _visitables.get("preferredDuringSchedulingIgnoredDuringExecution").size(), builder);this.preferredDuringSchedulingIgnoredDuringExecution.add(index >= 0 ? index : preferredDuringSchedulingIgnoredDuringExecution.size(), builder); return (A)this;
  }
  public A setToPreferredDuringSchedulingIgnoredDuringExecution(Integer index,V1PreferredSchedulingTerm item) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution == null) {this.preferredDuringSchedulingIgnoredDuringExecution = new ArrayList<V1PreferredSchedulingTermBuilder>();}
    V1PreferredSchedulingTermBuilder builder = new V1PreferredSchedulingTermBuilder(item);
    if (index < 0 || index >= _visitables.get("preferredDuringSchedulingIgnoredDuringExecution").size()) { _visitables.get("preferredDuringSchedulingIgnoredDuringExecution").add(builder); } else { _visitables.get("preferredDuringSchedulingIgnoredDuringExecution").set(index, builder);}
    if (index < 0 || index >= preferredDuringSchedulingIgnoredDuringExecution.size()) { preferredDuringSchedulingIgnoredDuringExecution.add(builder); } else { preferredDuringSchedulingIgnoredDuringExecution.set(index, builder);}
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
    for (V1PreferredSchedulingTerm item : items) {V1PreferredSchedulingTermBuilder builder = new V1PreferredSchedulingTermBuilder(item);_visitables.get("preferredDuringSchedulingIgnoredDuringExecution").remove(builder);if (this.preferredDuringSchedulingIgnoredDuringExecution != null) {this.preferredDuringSchedulingIgnoredDuringExecution.remove(builder);}} return (A)this;
  }
  public A removeAllFromPreferredDuringSchedulingIgnoredDuringExecution(Collection<V1PreferredSchedulingTerm> items) {
    for (V1PreferredSchedulingTerm item : items) {V1PreferredSchedulingTermBuilder builder = new V1PreferredSchedulingTermBuilder(item);_visitables.get("preferredDuringSchedulingIgnoredDuringExecution").remove(builder);if (this.preferredDuringSchedulingIgnoredDuringExecution != null) {this.preferredDuringSchedulingIgnoredDuringExecution.remove(builder);}} return (A)this;
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
  
  /**
   * This method has been deprecated, please use method buildPreferredDuringSchedulingIgnoredDuringExecution instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1PreferredSchedulingTerm> getPreferredDuringSchedulingIgnoredDuringExecution() {
    return preferredDuringSchedulingIgnoredDuringExecution != null ? build(preferredDuringSchedulingIgnoredDuringExecution) : null;
  }
  public List<V1PreferredSchedulingTerm> buildPreferredDuringSchedulingIgnoredDuringExecution() {
    return preferredDuringSchedulingIgnoredDuringExecution != null ? build(preferredDuringSchedulingIgnoredDuringExecution) : null;
  }
  public V1PreferredSchedulingTerm buildPreferredDuringSchedulingIgnoredDuringExecution(Integer index) {
    return this.preferredDuringSchedulingIgnoredDuringExecution.get(index).build();
  }
  public V1PreferredSchedulingTerm buildFirstPreferredDuringSchedulingIgnoredDuringExecution() {
    return this.preferredDuringSchedulingIgnoredDuringExecution.get(0).build();
  }
  public V1PreferredSchedulingTerm buildLastPreferredDuringSchedulingIgnoredDuringExecution() {
    return this.preferredDuringSchedulingIgnoredDuringExecution.get(preferredDuringSchedulingIgnoredDuringExecution.size() - 1).build();
  }
  public V1PreferredSchedulingTerm buildMatchingPreferredDuringSchedulingIgnoredDuringExecution(Predicate<V1PreferredSchedulingTermBuilder> predicate) {
    for (V1PreferredSchedulingTermBuilder item: preferredDuringSchedulingIgnoredDuringExecution) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingPreferredDuringSchedulingIgnoredDuringExecution(Predicate<V1PreferredSchedulingTermBuilder> predicate) {
    for (V1PreferredSchedulingTermBuilder item: preferredDuringSchedulingIgnoredDuringExecution) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withPreferredDuringSchedulingIgnoredDuringExecution(List<V1PreferredSchedulingTerm> preferredDuringSchedulingIgnoredDuringExecution) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution != null) { _visitables.get("preferredDuringSchedulingIgnoredDuringExecution").removeAll(this.preferredDuringSchedulingIgnoredDuringExecution);}
    if (preferredDuringSchedulingIgnoredDuringExecution != null) {this.preferredDuringSchedulingIgnoredDuringExecution = new ArrayList(); for (V1PreferredSchedulingTerm item : preferredDuringSchedulingIgnoredDuringExecution){this.addToPreferredDuringSchedulingIgnoredDuringExecution(item);}} else { this.preferredDuringSchedulingIgnoredDuringExecution = null;} return (A) this;
  }
  public A withPreferredDuringSchedulingIgnoredDuringExecution(io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm... preferredDuringSchedulingIgnoredDuringExecution) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution != null) {this.preferredDuringSchedulingIgnoredDuringExecution.clear();}
    if (preferredDuringSchedulingIgnoredDuringExecution != null) {for (V1PreferredSchedulingTerm item :preferredDuringSchedulingIgnoredDuringExecution){ this.addToPreferredDuringSchedulingIgnoredDuringExecution(item);}} return (A) this;
  }
  public Boolean hasPreferredDuringSchedulingIgnoredDuringExecution() {
    return preferredDuringSchedulingIgnoredDuringExecution != null && !preferredDuringSchedulingIgnoredDuringExecution.isEmpty();
  }
  public V1NodeAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> addNewPreferredDuringSchedulingIgnoredDuringExecution() {
    return new V1NodeAffinityFluentImpl.PreferredDuringSchedulingIgnoredDuringExecutionNestedImpl();
  }
  public V1NodeAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> addNewPreferredDuringSchedulingIgnoredDuringExecutionLike(V1PreferredSchedulingTerm item) {
    return new V1NodeAffinityFluentImpl.PreferredDuringSchedulingIgnoredDuringExecutionNestedImpl(-1, item);
  }
  public V1NodeAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(Integer index,V1PreferredSchedulingTerm item) {
    return new V1NodeAffinityFluentImpl.PreferredDuringSchedulingIgnoredDuringExecutionNestedImpl(index, item);
  }
  public V1NodeAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> editPreferredDuringSchedulingIgnoredDuringExecution(Integer index) {
    if (preferredDuringSchedulingIgnoredDuringExecution.size() <= index) throw new RuntimeException("Can't edit preferredDuringSchedulingIgnoredDuringExecution. Index exceeds size.");
    return setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(index, buildPreferredDuringSchedulingIgnoredDuringExecution(index));
  }
  public V1NodeAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> editFirstPreferredDuringSchedulingIgnoredDuringExecution() {
    if (preferredDuringSchedulingIgnoredDuringExecution.size() == 0) throw new RuntimeException("Can't edit first preferredDuringSchedulingIgnoredDuringExecution. The list is empty.");
    return setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(0, buildPreferredDuringSchedulingIgnoredDuringExecution(0));
  }
  public V1NodeAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> editLastPreferredDuringSchedulingIgnoredDuringExecution() {
    int index = preferredDuringSchedulingIgnoredDuringExecution.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last preferredDuringSchedulingIgnoredDuringExecution. The list is empty.");
    return setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(index, buildPreferredDuringSchedulingIgnoredDuringExecution(index));
  }
  public V1NodeAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> editMatchingPreferredDuringSchedulingIgnoredDuringExecution(Predicate<V1PreferredSchedulingTermBuilder> predicate) {
    int index = -1;
    for (int i=0;i<preferredDuringSchedulingIgnoredDuringExecution.size();i++) { 
    if (predicate.test(preferredDuringSchedulingIgnoredDuringExecution.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching preferredDuringSchedulingIgnoredDuringExecution. No match found.");
    return setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(index, buildPreferredDuringSchedulingIgnoredDuringExecution(index));
  }
  
  /**
   * This method has been deprecated, please use method buildRequiredDuringSchedulingIgnoredDuringExecution instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1NodeSelector getRequiredDuringSchedulingIgnoredDuringExecution() {
    return this.requiredDuringSchedulingIgnoredDuringExecution!=null ?this.requiredDuringSchedulingIgnoredDuringExecution.build():null;
  }
  public V1NodeSelector buildRequiredDuringSchedulingIgnoredDuringExecution() {
    return this.requiredDuringSchedulingIgnoredDuringExecution!=null ?this.requiredDuringSchedulingIgnoredDuringExecution.build():null;
  }
  public A withRequiredDuringSchedulingIgnoredDuringExecution(V1NodeSelector requiredDuringSchedulingIgnoredDuringExecution) {
    _visitables.get("requiredDuringSchedulingIgnoredDuringExecution").remove(this.requiredDuringSchedulingIgnoredDuringExecution);
    if (requiredDuringSchedulingIgnoredDuringExecution!=null){ this.requiredDuringSchedulingIgnoredDuringExecution= new V1NodeSelectorBuilder(requiredDuringSchedulingIgnoredDuringExecution); _visitables.get("requiredDuringSchedulingIgnoredDuringExecution").add(this.requiredDuringSchedulingIgnoredDuringExecution);} else { this.requiredDuringSchedulingIgnoredDuringExecution = null; _visitables.get("requiredDuringSchedulingIgnoredDuringExecution").remove(this.requiredDuringSchedulingIgnoredDuringExecution); } return (A) this;
  }
  public Boolean hasRequiredDuringSchedulingIgnoredDuringExecution() {
    return this.requiredDuringSchedulingIgnoredDuringExecution != null;
  }
  public V1NodeAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<A> withNewRequiredDuringSchedulingIgnoredDuringExecution() {
    return new V1NodeAffinityFluentImpl.RequiredDuringSchedulingIgnoredDuringExecutionNestedImpl();
  }
  public V1NodeAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<A> withNewRequiredDuringSchedulingIgnoredDuringExecutionLike(V1NodeSelector item) {
    return new V1NodeAffinityFluentImpl.RequiredDuringSchedulingIgnoredDuringExecutionNestedImpl(item);
  }
  public V1NodeAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<A> editRequiredDuringSchedulingIgnoredDuringExecution() {
    return withNewRequiredDuringSchedulingIgnoredDuringExecutionLike(getRequiredDuringSchedulingIgnoredDuringExecution());
  }
  public V1NodeAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<A> editOrNewRequiredDuringSchedulingIgnoredDuringExecution() {
    return withNewRequiredDuringSchedulingIgnoredDuringExecutionLike(getRequiredDuringSchedulingIgnoredDuringExecution() != null ? getRequiredDuringSchedulingIgnoredDuringExecution(): new V1NodeSelectorBuilder().build());
  }
  public V1NodeAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<A> editOrNewRequiredDuringSchedulingIgnoredDuringExecutionLike(V1NodeSelector item) {
    return withNewRequiredDuringSchedulingIgnoredDuringExecutionLike(getRequiredDuringSchedulingIgnoredDuringExecution() != null ? getRequiredDuringSchedulingIgnoredDuringExecution(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1NodeAffinityFluentImpl that = (V1NodeAffinityFluentImpl) o;
    if (preferredDuringSchedulingIgnoredDuringExecution != null ? !preferredDuringSchedulingIgnoredDuringExecution.equals(that.preferredDuringSchedulingIgnoredDuringExecution) :that.preferredDuringSchedulingIgnoredDuringExecution != null) return false;
    if (requiredDuringSchedulingIgnoredDuringExecution != null ? !requiredDuringSchedulingIgnoredDuringExecution.equals(that.requiredDuringSchedulingIgnoredDuringExecution) :that.requiredDuringSchedulingIgnoredDuringExecution != null) return false;
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
  class PreferredDuringSchedulingIgnoredDuringExecutionNestedImpl<N> extends V1PreferredSchedulingTermFluentImpl<V1NodeAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<N>> implements V1NodeAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<N>,Nested<N>{
    PreferredDuringSchedulingIgnoredDuringExecutionNestedImpl(Integer index,V1PreferredSchedulingTerm item) {
      this.index = index;
      this.builder = new V1PreferredSchedulingTermBuilder(this, item);
    }
    PreferredDuringSchedulingIgnoredDuringExecutionNestedImpl() {
      this.index = -1;
      this.builder = new V1PreferredSchedulingTermBuilder(this);
    }
    V1PreferredSchedulingTermBuilder builder;
    Integer index;
    public N and() {
      return (N) V1NodeAffinityFluentImpl.this.setToPreferredDuringSchedulingIgnoredDuringExecution(index,builder.build());
    }
    public N endPreferredDuringSchedulingIgnoredDuringExecution() {
      return and();
    }
    
  }
  class RequiredDuringSchedulingIgnoredDuringExecutionNestedImpl<N> extends V1NodeSelectorFluentImpl<V1NodeAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<N>> implements V1NodeAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<N>,Nested<N>{
    RequiredDuringSchedulingIgnoredDuringExecutionNestedImpl(V1NodeSelector item) {
      this.builder = new V1NodeSelectorBuilder(this, item);
    }
    RequiredDuringSchedulingIgnoredDuringExecutionNestedImpl() {
      this.builder = new V1NodeSelectorBuilder(this);
    }
    V1NodeSelectorBuilder builder;
    public N and() {
      return (N) V1NodeAffinityFluentImpl.this.withRequiredDuringSchedulingIgnoredDuringExecution(builder.build());
    }
    public N endRequiredDuringSchedulingIgnoredDuringExecution() {
      return and();
    }
    
  }
  
}