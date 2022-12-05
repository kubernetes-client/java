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
  public class V1PodAntiAffinityFluentImpl<A extends V1PodAntiAffinityFluent<A>> extends BaseFluent<A> implements V1PodAntiAffinityFluent<A>{
  public V1PodAntiAffinityFluentImpl() {
  }
  public V1PodAntiAffinityFluentImpl(V1PodAntiAffinity instance) {
    this.withPreferredDuringSchedulingIgnoredDuringExecution(instance.getPreferredDuringSchedulingIgnoredDuringExecution());

    this.withRequiredDuringSchedulingIgnoredDuringExecution(instance.getRequiredDuringSchedulingIgnoredDuringExecution());

  }
  private ArrayList<V1WeightedPodAffinityTermBuilder> preferredDuringSchedulingIgnoredDuringExecution;
  private ArrayList<V1PodAffinityTermBuilder> requiredDuringSchedulingIgnoredDuringExecution;
  public A addToPreferredDuringSchedulingIgnoredDuringExecution(Integer index,V1WeightedPodAffinityTerm item) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution == null) {this.preferredDuringSchedulingIgnoredDuringExecution = new ArrayList<V1WeightedPodAffinityTermBuilder>();}
    V1WeightedPodAffinityTermBuilder builder = new V1WeightedPodAffinityTermBuilder(item);_visitables.get("preferredDuringSchedulingIgnoredDuringExecution").add(index >= 0 ? index : _visitables.get("preferredDuringSchedulingIgnoredDuringExecution").size(), builder);this.preferredDuringSchedulingIgnoredDuringExecution.add(index >= 0 ? index : preferredDuringSchedulingIgnoredDuringExecution.size(), builder); return (A)this;
  }
  public A setToPreferredDuringSchedulingIgnoredDuringExecution(Integer index,V1WeightedPodAffinityTerm item) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution == null) {this.preferredDuringSchedulingIgnoredDuringExecution = new ArrayList<V1WeightedPodAffinityTermBuilder>();}
    V1WeightedPodAffinityTermBuilder builder = new V1WeightedPodAffinityTermBuilder(item);
    if (index < 0 || index >= _visitables.get("preferredDuringSchedulingIgnoredDuringExecution").size()) { _visitables.get("preferredDuringSchedulingIgnoredDuringExecution").add(builder); } else { _visitables.get("preferredDuringSchedulingIgnoredDuringExecution").set(index, builder);}
    if (index < 0 || index >= preferredDuringSchedulingIgnoredDuringExecution.size()) { preferredDuringSchedulingIgnoredDuringExecution.add(builder); } else { preferredDuringSchedulingIgnoredDuringExecution.set(index, builder);}
     return (A)this;
  }
  public A addToPreferredDuringSchedulingIgnoredDuringExecution(io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm... items) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution == null) {this.preferredDuringSchedulingIgnoredDuringExecution = new ArrayList<V1WeightedPodAffinityTermBuilder>();}
    for (V1WeightedPodAffinityTerm item : items) {V1WeightedPodAffinityTermBuilder builder = new V1WeightedPodAffinityTermBuilder(item);_visitables.get("preferredDuringSchedulingIgnoredDuringExecution").add(builder);this.preferredDuringSchedulingIgnoredDuringExecution.add(builder);} return (A)this;
  }
  public A addAllToPreferredDuringSchedulingIgnoredDuringExecution(Collection<V1WeightedPodAffinityTerm> items) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution == null) {this.preferredDuringSchedulingIgnoredDuringExecution = new ArrayList<V1WeightedPodAffinityTermBuilder>();}
    for (V1WeightedPodAffinityTerm item : items) {V1WeightedPodAffinityTermBuilder builder = new V1WeightedPodAffinityTermBuilder(item);_visitables.get("preferredDuringSchedulingIgnoredDuringExecution").add(builder);this.preferredDuringSchedulingIgnoredDuringExecution.add(builder);} return (A)this;
  }
  public A removeFromPreferredDuringSchedulingIgnoredDuringExecution(io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm... items) {
    for (V1WeightedPodAffinityTerm item : items) {V1WeightedPodAffinityTermBuilder builder = new V1WeightedPodAffinityTermBuilder(item);_visitables.get("preferredDuringSchedulingIgnoredDuringExecution").remove(builder);if (this.preferredDuringSchedulingIgnoredDuringExecution != null) {this.preferredDuringSchedulingIgnoredDuringExecution.remove(builder);}} return (A)this;
  }
  public A removeAllFromPreferredDuringSchedulingIgnoredDuringExecution(Collection<V1WeightedPodAffinityTerm> items) {
    for (V1WeightedPodAffinityTerm item : items) {V1WeightedPodAffinityTermBuilder builder = new V1WeightedPodAffinityTermBuilder(item);_visitables.get("preferredDuringSchedulingIgnoredDuringExecution").remove(builder);if (this.preferredDuringSchedulingIgnoredDuringExecution != null) {this.preferredDuringSchedulingIgnoredDuringExecution.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromPreferredDuringSchedulingIgnoredDuringExecution(Predicate<V1WeightedPodAffinityTermBuilder> predicate) {
    if (preferredDuringSchedulingIgnoredDuringExecution == null) return (A) this;
    final Iterator<V1WeightedPodAffinityTermBuilder> each = preferredDuringSchedulingIgnoredDuringExecution.iterator();
    final List visitables = _visitables.get("preferredDuringSchedulingIgnoredDuringExecution");
    while (each.hasNext()) {
      V1WeightedPodAffinityTermBuilder builder = each.next();
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
  public List<V1WeightedPodAffinityTerm> getPreferredDuringSchedulingIgnoredDuringExecution() {
    return preferredDuringSchedulingIgnoredDuringExecution != null ? build(preferredDuringSchedulingIgnoredDuringExecution) : null;
  }
  public List<V1WeightedPodAffinityTerm> buildPreferredDuringSchedulingIgnoredDuringExecution() {
    return preferredDuringSchedulingIgnoredDuringExecution != null ? build(preferredDuringSchedulingIgnoredDuringExecution) : null;
  }
  public V1WeightedPodAffinityTerm buildPreferredDuringSchedulingIgnoredDuringExecution(Integer index) {
    return this.preferredDuringSchedulingIgnoredDuringExecution.get(index).build();
  }
  public V1WeightedPodAffinityTerm buildFirstPreferredDuringSchedulingIgnoredDuringExecution() {
    return this.preferredDuringSchedulingIgnoredDuringExecution.get(0).build();
  }
  public V1WeightedPodAffinityTerm buildLastPreferredDuringSchedulingIgnoredDuringExecution() {
    return this.preferredDuringSchedulingIgnoredDuringExecution.get(preferredDuringSchedulingIgnoredDuringExecution.size() - 1).build();
  }
  public V1WeightedPodAffinityTerm buildMatchingPreferredDuringSchedulingIgnoredDuringExecution(Predicate<V1WeightedPodAffinityTermBuilder> predicate) {
    for (V1WeightedPodAffinityTermBuilder item: preferredDuringSchedulingIgnoredDuringExecution) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingPreferredDuringSchedulingIgnoredDuringExecution(Predicate<V1WeightedPodAffinityTermBuilder> predicate) {
    for (V1WeightedPodAffinityTermBuilder item: preferredDuringSchedulingIgnoredDuringExecution) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withPreferredDuringSchedulingIgnoredDuringExecution(List<V1WeightedPodAffinityTerm> preferredDuringSchedulingIgnoredDuringExecution) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution != null) { _visitables.get("preferredDuringSchedulingIgnoredDuringExecution").removeAll(this.preferredDuringSchedulingIgnoredDuringExecution);}
    if (preferredDuringSchedulingIgnoredDuringExecution != null) {this.preferredDuringSchedulingIgnoredDuringExecution = new ArrayList(); for (V1WeightedPodAffinityTerm item : preferredDuringSchedulingIgnoredDuringExecution){this.addToPreferredDuringSchedulingIgnoredDuringExecution(item);}} else { this.preferredDuringSchedulingIgnoredDuringExecution = null;} return (A) this;
  }
  public A withPreferredDuringSchedulingIgnoredDuringExecution(io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm... preferredDuringSchedulingIgnoredDuringExecution) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution != null) {this.preferredDuringSchedulingIgnoredDuringExecution.clear();}
    if (preferredDuringSchedulingIgnoredDuringExecution != null) {for (V1WeightedPodAffinityTerm item :preferredDuringSchedulingIgnoredDuringExecution){ this.addToPreferredDuringSchedulingIgnoredDuringExecution(item);}} return (A) this;
  }
  public Boolean hasPreferredDuringSchedulingIgnoredDuringExecution() {
    return preferredDuringSchedulingIgnoredDuringExecution != null && !preferredDuringSchedulingIgnoredDuringExecution.isEmpty();
  }
  public V1PodAntiAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> addNewPreferredDuringSchedulingIgnoredDuringExecution() {
    return new V1PodAntiAffinityFluentImpl.PreferredDuringSchedulingIgnoredDuringExecutionNestedImpl();
  }
  public V1PodAntiAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> addNewPreferredDuringSchedulingIgnoredDuringExecutionLike(V1WeightedPodAffinityTerm item) {
    return new V1PodAntiAffinityFluentImpl.PreferredDuringSchedulingIgnoredDuringExecutionNestedImpl(-1, item);
  }
  public V1PodAntiAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(Integer index,V1WeightedPodAffinityTerm item) {
    return new V1PodAntiAffinityFluentImpl.PreferredDuringSchedulingIgnoredDuringExecutionNestedImpl(index, item);
  }
  public V1PodAntiAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> editPreferredDuringSchedulingIgnoredDuringExecution(Integer index) {
    if (preferredDuringSchedulingIgnoredDuringExecution.size() <= index) throw new RuntimeException("Can't edit preferredDuringSchedulingIgnoredDuringExecution. Index exceeds size.");
    return setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(index, buildPreferredDuringSchedulingIgnoredDuringExecution(index));
  }
  public V1PodAntiAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> editFirstPreferredDuringSchedulingIgnoredDuringExecution() {
    if (preferredDuringSchedulingIgnoredDuringExecution.size() == 0) throw new RuntimeException("Can't edit first preferredDuringSchedulingIgnoredDuringExecution. The list is empty.");
    return setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(0, buildPreferredDuringSchedulingIgnoredDuringExecution(0));
  }
  public V1PodAntiAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> editLastPreferredDuringSchedulingIgnoredDuringExecution() {
    int index = preferredDuringSchedulingIgnoredDuringExecution.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last preferredDuringSchedulingIgnoredDuringExecution. The list is empty.");
    return setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(index, buildPreferredDuringSchedulingIgnoredDuringExecution(index));
  }
  public V1PodAntiAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<A> editMatchingPreferredDuringSchedulingIgnoredDuringExecution(Predicate<V1WeightedPodAffinityTermBuilder> predicate) {
    int index = -1;
    for (int i=0;i<preferredDuringSchedulingIgnoredDuringExecution.size();i++) { 
    if (predicate.test(preferredDuringSchedulingIgnoredDuringExecution.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching preferredDuringSchedulingIgnoredDuringExecution. No match found.");
    return setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(index, buildPreferredDuringSchedulingIgnoredDuringExecution(index));
  }
  public A addToRequiredDuringSchedulingIgnoredDuringExecution(Integer index,V1PodAffinityTerm item) {
    if (this.requiredDuringSchedulingIgnoredDuringExecution == null) {this.requiredDuringSchedulingIgnoredDuringExecution = new ArrayList<V1PodAffinityTermBuilder>();}
    V1PodAffinityTermBuilder builder = new V1PodAffinityTermBuilder(item);_visitables.get("requiredDuringSchedulingIgnoredDuringExecution").add(index >= 0 ? index : _visitables.get("requiredDuringSchedulingIgnoredDuringExecution").size(), builder);this.requiredDuringSchedulingIgnoredDuringExecution.add(index >= 0 ? index : requiredDuringSchedulingIgnoredDuringExecution.size(), builder); return (A)this;
  }
  public A setToRequiredDuringSchedulingIgnoredDuringExecution(Integer index,V1PodAffinityTerm item) {
    if (this.requiredDuringSchedulingIgnoredDuringExecution == null) {this.requiredDuringSchedulingIgnoredDuringExecution = new ArrayList<V1PodAffinityTermBuilder>();}
    V1PodAffinityTermBuilder builder = new V1PodAffinityTermBuilder(item);
    if (index < 0 || index >= _visitables.get("requiredDuringSchedulingIgnoredDuringExecution").size()) { _visitables.get("requiredDuringSchedulingIgnoredDuringExecution").add(builder); } else { _visitables.get("requiredDuringSchedulingIgnoredDuringExecution").set(index, builder);}
    if (index < 0 || index >= requiredDuringSchedulingIgnoredDuringExecution.size()) { requiredDuringSchedulingIgnoredDuringExecution.add(builder); } else { requiredDuringSchedulingIgnoredDuringExecution.set(index, builder);}
     return (A)this;
  }
  public A addToRequiredDuringSchedulingIgnoredDuringExecution(io.kubernetes.client.openapi.models.V1PodAffinityTerm... items) {
    if (this.requiredDuringSchedulingIgnoredDuringExecution == null) {this.requiredDuringSchedulingIgnoredDuringExecution = new ArrayList<V1PodAffinityTermBuilder>();}
    for (V1PodAffinityTerm item : items) {V1PodAffinityTermBuilder builder = new V1PodAffinityTermBuilder(item);_visitables.get("requiredDuringSchedulingIgnoredDuringExecution").add(builder);this.requiredDuringSchedulingIgnoredDuringExecution.add(builder);} return (A)this;
  }
  public A addAllToRequiredDuringSchedulingIgnoredDuringExecution(Collection<V1PodAffinityTerm> items) {
    if (this.requiredDuringSchedulingIgnoredDuringExecution == null) {this.requiredDuringSchedulingIgnoredDuringExecution = new ArrayList<V1PodAffinityTermBuilder>();}
    for (V1PodAffinityTerm item : items) {V1PodAffinityTermBuilder builder = new V1PodAffinityTermBuilder(item);_visitables.get("requiredDuringSchedulingIgnoredDuringExecution").add(builder);this.requiredDuringSchedulingIgnoredDuringExecution.add(builder);} return (A)this;
  }
  public A removeFromRequiredDuringSchedulingIgnoredDuringExecution(io.kubernetes.client.openapi.models.V1PodAffinityTerm... items) {
    for (V1PodAffinityTerm item : items) {V1PodAffinityTermBuilder builder = new V1PodAffinityTermBuilder(item);_visitables.get("requiredDuringSchedulingIgnoredDuringExecution").remove(builder);if (this.requiredDuringSchedulingIgnoredDuringExecution != null) {this.requiredDuringSchedulingIgnoredDuringExecution.remove(builder);}} return (A)this;
  }
  public A removeAllFromRequiredDuringSchedulingIgnoredDuringExecution(Collection<V1PodAffinityTerm> items) {
    for (V1PodAffinityTerm item : items) {V1PodAffinityTermBuilder builder = new V1PodAffinityTermBuilder(item);_visitables.get("requiredDuringSchedulingIgnoredDuringExecution").remove(builder);if (this.requiredDuringSchedulingIgnoredDuringExecution != null) {this.requiredDuringSchedulingIgnoredDuringExecution.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromRequiredDuringSchedulingIgnoredDuringExecution(Predicate<V1PodAffinityTermBuilder> predicate) {
    if (requiredDuringSchedulingIgnoredDuringExecution == null) return (A) this;
    final Iterator<V1PodAffinityTermBuilder> each = requiredDuringSchedulingIgnoredDuringExecution.iterator();
    final List visitables = _visitables.get("requiredDuringSchedulingIgnoredDuringExecution");
    while (each.hasNext()) {
      V1PodAffinityTermBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildRequiredDuringSchedulingIgnoredDuringExecution instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1PodAffinityTerm> getRequiredDuringSchedulingIgnoredDuringExecution() {
    return requiredDuringSchedulingIgnoredDuringExecution != null ? build(requiredDuringSchedulingIgnoredDuringExecution) : null;
  }
  public List<V1PodAffinityTerm> buildRequiredDuringSchedulingIgnoredDuringExecution() {
    return requiredDuringSchedulingIgnoredDuringExecution != null ? build(requiredDuringSchedulingIgnoredDuringExecution) : null;
  }
  public V1PodAffinityTerm buildRequiredDuringSchedulingIgnoredDuringExecution(Integer index) {
    return this.requiredDuringSchedulingIgnoredDuringExecution.get(index).build();
  }
  public V1PodAffinityTerm buildFirstRequiredDuringSchedulingIgnoredDuringExecution() {
    return this.requiredDuringSchedulingIgnoredDuringExecution.get(0).build();
  }
  public V1PodAffinityTerm buildLastRequiredDuringSchedulingIgnoredDuringExecution() {
    return this.requiredDuringSchedulingIgnoredDuringExecution.get(requiredDuringSchedulingIgnoredDuringExecution.size() - 1).build();
  }
  public V1PodAffinityTerm buildMatchingRequiredDuringSchedulingIgnoredDuringExecution(Predicate<V1PodAffinityTermBuilder> predicate) {
    for (V1PodAffinityTermBuilder item: requiredDuringSchedulingIgnoredDuringExecution) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingRequiredDuringSchedulingIgnoredDuringExecution(Predicate<V1PodAffinityTermBuilder> predicate) {
    for (V1PodAffinityTermBuilder item: requiredDuringSchedulingIgnoredDuringExecution) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withRequiredDuringSchedulingIgnoredDuringExecution(List<V1PodAffinityTerm> requiredDuringSchedulingIgnoredDuringExecution) {
    if (this.requiredDuringSchedulingIgnoredDuringExecution != null) { _visitables.get("requiredDuringSchedulingIgnoredDuringExecution").removeAll(this.requiredDuringSchedulingIgnoredDuringExecution);}
    if (requiredDuringSchedulingIgnoredDuringExecution != null) {this.requiredDuringSchedulingIgnoredDuringExecution = new ArrayList(); for (V1PodAffinityTerm item : requiredDuringSchedulingIgnoredDuringExecution){this.addToRequiredDuringSchedulingIgnoredDuringExecution(item);}} else { this.requiredDuringSchedulingIgnoredDuringExecution = null;} return (A) this;
  }
  public A withRequiredDuringSchedulingIgnoredDuringExecution(io.kubernetes.client.openapi.models.V1PodAffinityTerm... requiredDuringSchedulingIgnoredDuringExecution) {
    if (this.requiredDuringSchedulingIgnoredDuringExecution != null) {this.requiredDuringSchedulingIgnoredDuringExecution.clear();}
    if (requiredDuringSchedulingIgnoredDuringExecution != null) {for (V1PodAffinityTerm item :requiredDuringSchedulingIgnoredDuringExecution){ this.addToRequiredDuringSchedulingIgnoredDuringExecution(item);}} return (A) this;
  }
  public Boolean hasRequiredDuringSchedulingIgnoredDuringExecution() {
    return requiredDuringSchedulingIgnoredDuringExecution != null && !requiredDuringSchedulingIgnoredDuringExecution.isEmpty();
  }
  public V1PodAntiAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<A> addNewRequiredDuringSchedulingIgnoredDuringExecution() {
    return new V1PodAntiAffinityFluentImpl.RequiredDuringSchedulingIgnoredDuringExecutionNestedImpl();
  }
  public V1PodAntiAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<A> addNewRequiredDuringSchedulingIgnoredDuringExecutionLike(V1PodAffinityTerm item) {
    return new V1PodAntiAffinityFluentImpl.RequiredDuringSchedulingIgnoredDuringExecutionNestedImpl(-1, item);
  }
  public V1PodAntiAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<A> setNewRequiredDuringSchedulingIgnoredDuringExecutionLike(Integer index,V1PodAffinityTerm item) {
    return new V1PodAntiAffinityFluentImpl.RequiredDuringSchedulingIgnoredDuringExecutionNestedImpl(index, item);
  }
  public V1PodAntiAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<A> editRequiredDuringSchedulingIgnoredDuringExecution(Integer index) {
    if (requiredDuringSchedulingIgnoredDuringExecution.size() <= index) throw new RuntimeException("Can't edit requiredDuringSchedulingIgnoredDuringExecution. Index exceeds size.");
    return setNewRequiredDuringSchedulingIgnoredDuringExecutionLike(index, buildRequiredDuringSchedulingIgnoredDuringExecution(index));
  }
  public V1PodAntiAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<A> editFirstRequiredDuringSchedulingIgnoredDuringExecution() {
    if (requiredDuringSchedulingIgnoredDuringExecution.size() == 0) throw new RuntimeException("Can't edit first requiredDuringSchedulingIgnoredDuringExecution. The list is empty.");
    return setNewRequiredDuringSchedulingIgnoredDuringExecutionLike(0, buildRequiredDuringSchedulingIgnoredDuringExecution(0));
  }
  public V1PodAntiAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<A> editLastRequiredDuringSchedulingIgnoredDuringExecution() {
    int index = requiredDuringSchedulingIgnoredDuringExecution.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last requiredDuringSchedulingIgnoredDuringExecution. The list is empty.");
    return setNewRequiredDuringSchedulingIgnoredDuringExecutionLike(index, buildRequiredDuringSchedulingIgnoredDuringExecution(index));
  }
  public V1PodAntiAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<A> editMatchingRequiredDuringSchedulingIgnoredDuringExecution(Predicate<V1PodAffinityTermBuilder> predicate) {
    int index = -1;
    for (int i=0;i<requiredDuringSchedulingIgnoredDuringExecution.size();i++) { 
    if (predicate.test(requiredDuringSchedulingIgnoredDuringExecution.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching requiredDuringSchedulingIgnoredDuringExecution. No match found.");
    return setNewRequiredDuringSchedulingIgnoredDuringExecutionLike(index, buildRequiredDuringSchedulingIgnoredDuringExecution(index));
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1PodAntiAffinityFluentImpl that = (V1PodAntiAffinityFluentImpl) o;
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
    if (requiredDuringSchedulingIgnoredDuringExecution != null && !requiredDuringSchedulingIgnoredDuringExecution.isEmpty()) { sb.append("requiredDuringSchedulingIgnoredDuringExecution:"); sb.append(requiredDuringSchedulingIgnoredDuringExecution); }
    sb.append("}");
    return sb.toString();
  }
  class PreferredDuringSchedulingIgnoredDuringExecutionNestedImpl<N> extends V1WeightedPodAffinityTermFluentImpl<V1PodAntiAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<N>> implements V1PodAntiAffinityFluent.PreferredDuringSchedulingIgnoredDuringExecutionNested<N>,Nested<N>{
    PreferredDuringSchedulingIgnoredDuringExecutionNestedImpl(Integer index,V1WeightedPodAffinityTerm item) {
      this.index = index;
      this.builder = new V1WeightedPodAffinityTermBuilder(this, item);
    }
    PreferredDuringSchedulingIgnoredDuringExecutionNestedImpl() {
      this.index = -1;
      this.builder = new V1WeightedPodAffinityTermBuilder(this);
    }
    V1WeightedPodAffinityTermBuilder builder;
    Integer index;
    public N and() {
      return (N) V1PodAntiAffinityFluentImpl.this.setToPreferredDuringSchedulingIgnoredDuringExecution(index,builder.build());
    }
    public N endPreferredDuringSchedulingIgnoredDuringExecution() {
      return and();
    }
    
  }
  class RequiredDuringSchedulingIgnoredDuringExecutionNestedImpl<N> extends V1PodAffinityTermFluentImpl<V1PodAntiAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<N>> implements V1PodAntiAffinityFluent.RequiredDuringSchedulingIgnoredDuringExecutionNested<N>,Nested<N>{
    RequiredDuringSchedulingIgnoredDuringExecutionNestedImpl(Integer index,V1PodAffinityTerm item) {
      this.index = index;
      this.builder = new V1PodAffinityTermBuilder(this, item);
    }
    RequiredDuringSchedulingIgnoredDuringExecutionNestedImpl() {
      this.index = -1;
      this.builder = new V1PodAffinityTermBuilder(this);
    }
    V1PodAffinityTermBuilder builder;
    Integer index;
    public N and() {
      return (N) V1PodAntiAffinityFluentImpl.this.setToRequiredDuringSchedulingIgnoredDuringExecution(index,builder.build());
    }
    public N endRequiredDuringSchedulingIgnoredDuringExecution() {
      return and();
    }
    
  }
  
}