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
import java.util.Optional;
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1alpha1WorkloadSpecFluent<A extends io.kubernetes.client.openapi.models.V1alpha1WorkloadSpecFluent<A>> extends BaseFluent<A>{

  private V1alpha1TypedLocalObjectReferenceBuilder controllerRef;
  private ArrayList<V1alpha1PodGroupBuilder> podGroups;

  public V1alpha1WorkloadSpecFluent() {
  }
  
  public V1alpha1WorkloadSpecFluent(V1alpha1WorkloadSpec instance) {
    this.copyInstance(instance);
  }

  public A addAllToPodGroups(Collection<V1alpha1PodGroup> items) {
    if (this.podGroups == null) {
      this.podGroups = new ArrayList();
    }
    for (V1alpha1PodGroup item : items) {
        V1alpha1PodGroupBuilder builder = new V1alpha1PodGroupBuilder(item);
        _visitables.get("podGroups").add(builder);
        this.podGroups.add(builder);
    }
    return (A) this;
  }
  
  public PodGroupsNested<A> addNewPodGroup() {
    return new PodGroupsNested(-1, null);
  }
  
  public PodGroupsNested<A> addNewPodGroupLike(V1alpha1PodGroup item) {
    return new PodGroupsNested(-1, item);
  }
  
  public A addToPodGroups(V1alpha1PodGroup... items) {
    if (this.podGroups == null) {
      this.podGroups = new ArrayList();
    }
    for (V1alpha1PodGroup item : items) {
        V1alpha1PodGroupBuilder builder = new V1alpha1PodGroupBuilder(item);
        _visitables.get("podGroups").add(builder);
        this.podGroups.add(builder);
    }
    return (A) this;
  }
  
  public A addToPodGroups(int index,V1alpha1PodGroup item) {
    if (this.podGroups == null) {
      this.podGroups = new ArrayList();
    }
    V1alpha1PodGroupBuilder builder = new V1alpha1PodGroupBuilder(item);
    if (index < 0 || index >= podGroups.size()) {
        _visitables.get("podGroups").add(builder);
        podGroups.add(builder);
    } else {
        _visitables.get("podGroups").add(builder);
        podGroups.add(index, builder);
    }
    return (A) this;
  }
  
  public V1alpha1TypedLocalObjectReference buildControllerRef() {
    return this.controllerRef != null ? this.controllerRef.build() : null;
  }
  
  public V1alpha1PodGroup buildFirstPodGroup() {
    return this.podGroups.get(0).build();
  }
  
  public V1alpha1PodGroup buildLastPodGroup() {
    return this.podGroups.get(podGroups.size() - 1).build();
  }
  
  public V1alpha1PodGroup buildMatchingPodGroup(Predicate<V1alpha1PodGroupBuilder> predicate) {
      for (V1alpha1PodGroupBuilder item : podGroups) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public V1alpha1PodGroup buildPodGroup(int index) {
    return this.podGroups.get(index).build();
  }
  
  public List<V1alpha1PodGroup> buildPodGroups() {
    return this.podGroups != null ? build(podGroups) : null;
  }
  
  protected void copyInstance(V1alpha1WorkloadSpec instance) {
    instance = instance != null ? instance : new V1alpha1WorkloadSpec();
    if (instance != null) {
        this.withControllerRef(instance.getControllerRef());
        this.withPodGroups(instance.getPodGroups());
    }
  }
  
  public ControllerRefNested<A> editControllerRef() {
    return this.withNewControllerRefLike(Optional.ofNullable(this.buildControllerRef()).orElse(null));
  }
  
  public PodGroupsNested<A> editFirstPodGroup() {
    if (podGroups.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "podGroups"));
    }
    return this.setNewPodGroupLike(0, this.buildPodGroup(0));
  }
  
  public PodGroupsNested<A> editLastPodGroup() {
    int index = podGroups.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "podGroups"));
    }
    return this.setNewPodGroupLike(index, this.buildPodGroup(index));
  }
  
  public PodGroupsNested<A> editMatchingPodGroup(Predicate<V1alpha1PodGroupBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < podGroups.size();i++) {
      if (predicate.test(podGroups.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "podGroups"));
    }
    return this.setNewPodGroupLike(index, this.buildPodGroup(index));
  }
  
  public ControllerRefNested<A> editOrNewControllerRef() {
    return this.withNewControllerRefLike(Optional.ofNullable(this.buildControllerRef()).orElse(new V1alpha1TypedLocalObjectReferenceBuilder().build()));
  }
  
  public ControllerRefNested<A> editOrNewControllerRefLike(V1alpha1TypedLocalObjectReference item) {
    return this.withNewControllerRefLike(Optional.ofNullable(this.buildControllerRef()).orElse(item));
  }
  
  public PodGroupsNested<A> editPodGroup(int index) {
    if (podGroups.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "podGroups"));
    }
    return this.setNewPodGroupLike(index, this.buildPodGroup(index));
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
    V1alpha1WorkloadSpecFluent that = (V1alpha1WorkloadSpecFluent) o;
    if (!(Objects.equals(controllerRef, that.controllerRef))) {
      return false;
    }
    if (!(Objects.equals(podGroups, that.podGroups))) {
      return false;
    }
    return true;
  }
  
  public boolean hasControllerRef() {
    return this.controllerRef != null;
  }
  
  public boolean hasMatchingPodGroup(Predicate<V1alpha1PodGroupBuilder> predicate) {
      for (V1alpha1PodGroupBuilder item : podGroups) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasPodGroups() {
    return this.podGroups != null && !(this.podGroups.isEmpty());
  }
  
  public int hashCode() {
    return Objects.hash(controllerRef, podGroups);
  }
  
  public A removeAllFromPodGroups(Collection<V1alpha1PodGroup> items) {
    if (this.podGroups == null) {
      return (A) this;
    }
    for (V1alpha1PodGroup item : items) {
        V1alpha1PodGroupBuilder builder = new V1alpha1PodGroupBuilder(item);
        _visitables.get("podGroups").remove(builder);
        this.podGroups.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromPodGroups(V1alpha1PodGroup... items) {
    if (this.podGroups == null) {
      return (A) this;
    }
    for (V1alpha1PodGroup item : items) {
        V1alpha1PodGroupBuilder builder = new V1alpha1PodGroupBuilder(item);
        _visitables.get("podGroups").remove(builder);
        this.podGroups.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromPodGroups(Predicate<V1alpha1PodGroupBuilder> predicate) {
    if (podGroups == null) {
      return (A) this;
    }
    Iterator<V1alpha1PodGroupBuilder> each = podGroups.iterator();
    List visitables = _visitables.get("podGroups");
    while (each.hasNext()) {
        V1alpha1PodGroupBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public PodGroupsNested<A> setNewPodGroupLike(int index,V1alpha1PodGroup item) {
    return new PodGroupsNested(index, item);
  }
  
  public A setToPodGroups(int index,V1alpha1PodGroup item) {
    if (this.podGroups == null) {
      this.podGroups = new ArrayList();
    }
    V1alpha1PodGroupBuilder builder = new V1alpha1PodGroupBuilder(item);
    if (index < 0 || index >= podGroups.size()) {
        _visitables.get("podGroups").add(builder);
        podGroups.add(builder);
    } else {
        _visitables.get("podGroups").add(builder);
        podGroups.set(index, builder);
    }
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(controllerRef == null)) {
        sb.append("controllerRef:");
        sb.append(controllerRef);
        sb.append(",");
    }
    if (!(podGroups == null) && !(podGroups.isEmpty())) {
        sb.append("podGroups:");
        sb.append(podGroups);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withControllerRef(V1alpha1TypedLocalObjectReference controllerRef) {
    this._visitables.remove("controllerRef");
    if (controllerRef != null) {
        this.controllerRef = new V1alpha1TypedLocalObjectReferenceBuilder(controllerRef);
        this._visitables.get("controllerRef").add(this.controllerRef);
    } else {
        this.controllerRef = null;
        this._visitables.get("controllerRef").remove(this.controllerRef);
    }
    return (A) this;
  }
  
  public ControllerRefNested<A> withNewControllerRef() {
    return new ControllerRefNested(null);
  }
  
  public ControllerRefNested<A> withNewControllerRefLike(V1alpha1TypedLocalObjectReference item) {
    return new ControllerRefNested(item);
  }
  
  public A withPodGroups(List<V1alpha1PodGroup> podGroups) {
    if (this.podGroups != null) {
      this._visitables.get("podGroups").clear();
    }
    if (podGroups != null) {
        this.podGroups = new ArrayList();
        for (V1alpha1PodGroup item : podGroups) {
          this.addToPodGroups(item);
        }
    } else {
      this.podGroups = null;
    }
    return (A) this;
  }
  
  public A withPodGroups(V1alpha1PodGroup... podGroups) {
    if (this.podGroups != null) {
        this.podGroups.clear();
        _visitables.remove("podGroups");
    }
    if (podGroups != null) {
      for (V1alpha1PodGroup item : podGroups) {
        this.addToPodGroups(item);
      }
    }
    return (A) this;
  }
  public class ControllerRefNested<N> extends V1alpha1TypedLocalObjectReferenceFluent<ControllerRefNested<N>> implements Nested<N>{
  
    V1alpha1TypedLocalObjectReferenceBuilder builder;
  
    ControllerRefNested(V1alpha1TypedLocalObjectReference item) {
      this.builder = new V1alpha1TypedLocalObjectReferenceBuilder(this, item);
    }
  
    public N and() {
      return (N) V1alpha1WorkloadSpecFluent.this.withControllerRef(builder.build());
    }
    
    public N endControllerRef() {
      return and();
    }
    
  }
  public class PodGroupsNested<N> extends V1alpha1PodGroupFluent<PodGroupsNested<N>> implements Nested<N>{
  
    V1alpha1PodGroupBuilder builder;
    int index;
  
    PodGroupsNested(int index,V1alpha1PodGroup item) {
      this.index = index;
      this.builder = new V1alpha1PodGroupBuilder(this, item);
    }
  
    public N and() {
      return (N) V1alpha1WorkloadSpecFluent.this.setToPodGroups(index, builder.build());
    }
    
    public N endPodGroup() {
      return and();
    }
    
  }
}