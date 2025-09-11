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
import java.util.List;
import java.util.Objects;
import java.util.Collection;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1PodAntiAffinityFluent<A extends io.kubernetes.client.openapi.models.V1PodAntiAffinityFluent<A>> extends BaseFluent<A>{
  public V1PodAntiAffinityFluent() {
  }
  
  public V1PodAntiAffinityFluent(V1PodAntiAffinity instance) {
    this.copyInstance(instance);
  }
  private ArrayList<V1WeightedPodAffinityTermBuilder> preferredDuringSchedulingIgnoredDuringExecution;
  private ArrayList<V1PodAffinityTermBuilder> requiredDuringSchedulingIgnoredDuringExecution;
  
  protected void copyInstance(V1PodAntiAffinity instance) {
    instance = instance != null ? instance : new V1PodAntiAffinity();
    if (instance != null) {
        this.withPreferredDuringSchedulingIgnoredDuringExecution(instance.getPreferredDuringSchedulingIgnoredDuringExecution());
        this.withRequiredDuringSchedulingIgnoredDuringExecution(instance.getRequiredDuringSchedulingIgnoredDuringExecution());
    }
  }
  
  public A addToPreferredDuringSchedulingIgnoredDuringExecution(int index,V1WeightedPodAffinityTerm item) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution == null) {
      this.preferredDuringSchedulingIgnoredDuringExecution = new ArrayList();
    }
    V1WeightedPodAffinityTermBuilder builder = new V1WeightedPodAffinityTermBuilder(item);
    if (index < 0 || index >= preferredDuringSchedulingIgnoredDuringExecution.size()) {
        _visitables.get("preferredDuringSchedulingIgnoredDuringExecution").add(builder);
        preferredDuringSchedulingIgnoredDuringExecution.add(builder);
    } else {
        _visitables.get("preferredDuringSchedulingIgnoredDuringExecution").add(builder);
        preferredDuringSchedulingIgnoredDuringExecution.add(index, builder);
    }
    return (A) this;
  }
  
  public A setToPreferredDuringSchedulingIgnoredDuringExecution(int index,V1WeightedPodAffinityTerm item) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution == null) {
      this.preferredDuringSchedulingIgnoredDuringExecution = new ArrayList();
    }
    V1WeightedPodAffinityTermBuilder builder = new V1WeightedPodAffinityTermBuilder(item);
    if (index < 0 || index >= preferredDuringSchedulingIgnoredDuringExecution.size()) {
        _visitables.get("preferredDuringSchedulingIgnoredDuringExecution").add(builder);
        preferredDuringSchedulingIgnoredDuringExecution.add(builder);
    } else {
        _visitables.get("preferredDuringSchedulingIgnoredDuringExecution").add(builder);
        preferredDuringSchedulingIgnoredDuringExecution.set(index, builder);
    }
    return (A) this;
  }
  
  public A addToPreferredDuringSchedulingIgnoredDuringExecution(V1WeightedPodAffinityTerm... items) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution == null) {
      this.preferredDuringSchedulingIgnoredDuringExecution = new ArrayList();
    }
    for (V1WeightedPodAffinityTerm item : items) {
        V1WeightedPodAffinityTermBuilder builder = new V1WeightedPodAffinityTermBuilder(item);
        _visitables.get("preferredDuringSchedulingIgnoredDuringExecution").add(builder);
        this.preferredDuringSchedulingIgnoredDuringExecution.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToPreferredDuringSchedulingIgnoredDuringExecution(Collection<V1WeightedPodAffinityTerm> items) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution == null) {
      this.preferredDuringSchedulingIgnoredDuringExecution = new ArrayList();
    }
    for (V1WeightedPodAffinityTerm item : items) {
        V1WeightedPodAffinityTermBuilder builder = new V1WeightedPodAffinityTermBuilder(item);
        _visitables.get("preferredDuringSchedulingIgnoredDuringExecution").add(builder);
        this.preferredDuringSchedulingIgnoredDuringExecution.add(builder);
    }
    return (A) this;
  }
  
  public A removeFromPreferredDuringSchedulingIgnoredDuringExecution(V1WeightedPodAffinityTerm... items) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution == null) {
      return (A) this;
    }
    for (V1WeightedPodAffinityTerm item : items) {
        V1WeightedPodAffinityTermBuilder builder = new V1WeightedPodAffinityTermBuilder(item);
        _visitables.get("preferredDuringSchedulingIgnoredDuringExecution").remove(builder);
        this.preferredDuringSchedulingIgnoredDuringExecution.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromPreferredDuringSchedulingIgnoredDuringExecution(Collection<V1WeightedPodAffinityTerm> items) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution == null) {
      return (A) this;
    }
    for (V1WeightedPodAffinityTerm item : items) {
        V1WeightedPodAffinityTermBuilder builder = new V1WeightedPodAffinityTermBuilder(item);
        _visitables.get("preferredDuringSchedulingIgnoredDuringExecution").remove(builder);
        this.preferredDuringSchedulingIgnoredDuringExecution.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromPreferredDuringSchedulingIgnoredDuringExecution(Predicate<V1WeightedPodAffinityTermBuilder> predicate) {
    if (preferredDuringSchedulingIgnoredDuringExecution == null) {
      return (A) this;
    }
    Iterator<V1WeightedPodAffinityTermBuilder> each = preferredDuringSchedulingIgnoredDuringExecution.iterator();
    List visitables = _visitables.get("preferredDuringSchedulingIgnoredDuringExecution");
    while (each.hasNext()) {
        V1WeightedPodAffinityTermBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public List<V1WeightedPodAffinityTerm> buildPreferredDuringSchedulingIgnoredDuringExecution() {
    return this.preferredDuringSchedulingIgnoredDuringExecution != null ? build(preferredDuringSchedulingIgnoredDuringExecution) : null;
  }
  
  public V1WeightedPodAffinityTerm buildPreferredDuringSchedulingIgnoredDuringExecution(int index) {
    return this.preferredDuringSchedulingIgnoredDuringExecution.get(index).build();
  }
  
  public V1WeightedPodAffinityTerm buildFirstPreferredDuringSchedulingIgnoredDuringExecution() {
    return this.preferredDuringSchedulingIgnoredDuringExecution.get(0).build();
  }
  
  public V1WeightedPodAffinityTerm buildLastPreferredDuringSchedulingIgnoredDuringExecution() {
    return this.preferredDuringSchedulingIgnoredDuringExecution.get(preferredDuringSchedulingIgnoredDuringExecution.size() - 1).build();
  }
  
  public V1WeightedPodAffinityTerm buildMatchingPreferredDuringSchedulingIgnoredDuringExecution(Predicate<V1WeightedPodAffinityTermBuilder> predicate) {
      for (V1WeightedPodAffinityTermBuilder item : preferredDuringSchedulingIgnoredDuringExecution) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingPreferredDuringSchedulingIgnoredDuringExecution(Predicate<V1WeightedPodAffinityTermBuilder> predicate) {
      for (V1WeightedPodAffinityTermBuilder item : preferredDuringSchedulingIgnoredDuringExecution) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withPreferredDuringSchedulingIgnoredDuringExecution(List<V1WeightedPodAffinityTerm> preferredDuringSchedulingIgnoredDuringExecution) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution != null) {
      this._visitables.get("preferredDuringSchedulingIgnoredDuringExecution").clear();
    }
    if (preferredDuringSchedulingIgnoredDuringExecution != null) {
        this.preferredDuringSchedulingIgnoredDuringExecution = new ArrayList();
        for (V1WeightedPodAffinityTerm item : preferredDuringSchedulingIgnoredDuringExecution) {
          this.addToPreferredDuringSchedulingIgnoredDuringExecution(item);
        }
    } else {
      this.preferredDuringSchedulingIgnoredDuringExecution = null;
    }
    return (A) this;
  }
  
  public A withPreferredDuringSchedulingIgnoredDuringExecution(V1WeightedPodAffinityTerm... preferredDuringSchedulingIgnoredDuringExecution) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution != null) {
        this.preferredDuringSchedulingIgnoredDuringExecution.clear();
        _visitables.remove("preferredDuringSchedulingIgnoredDuringExecution");
    }
    if (preferredDuringSchedulingIgnoredDuringExecution != null) {
      for (V1WeightedPodAffinityTerm item : preferredDuringSchedulingIgnoredDuringExecution) {
        this.addToPreferredDuringSchedulingIgnoredDuringExecution(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasPreferredDuringSchedulingIgnoredDuringExecution() {
    return this.preferredDuringSchedulingIgnoredDuringExecution != null && !(this.preferredDuringSchedulingIgnoredDuringExecution.isEmpty());
  }
  
  public PreferredDuringSchedulingIgnoredDuringExecutionNested<A> addNewPreferredDuringSchedulingIgnoredDuringExecution() {
    return new PreferredDuringSchedulingIgnoredDuringExecutionNested(-1, null);
  }
  
  public PreferredDuringSchedulingIgnoredDuringExecutionNested<A> addNewPreferredDuringSchedulingIgnoredDuringExecutionLike(V1WeightedPodAffinityTerm item) {
    return new PreferredDuringSchedulingIgnoredDuringExecutionNested(-1, item);
  }
  
  public PreferredDuringSchedulingIgnoredDuringExecutionNested<A> setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(int index,V1WeightedPodAffinityTerm item) {
    return new PreferredDuringSchedulingIgnoredDuringExecutionNested(index, item);
  }
  
  public PreferredDuringSchedulingIgnoredDuringExecutionNested<A> editPreferredDuringSchedulingIgnoredDuringExecution(int index) {
    if (index <= preferredDuringSchedulingIgnoredDuringExecution.size()) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "preferredDuringSchedulingIgnoredDuringExecution"));
    }
    return this.setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(index, this.buildPreferredDuringSchedulingIgnoredDuringExecution(index));
  }
  
  public PreferredDuringSchedulingIgnoredDuringExecutionNested<A> editFirstPreferredDuringSchedulingIgnoredDuringExecution() {
    if (preferredDuringSchedulingIgnoredDuringExecution.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "preferredDuringSchedulingIgnoredDuringExecution"));
    }
    return this.setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(0, this.buildPreferredDuringSchedulingIgnoredDuringExecution(0));
  }
  
  public PreferredDuringSchedulingIgnoredDuringExecutionNested<A> editLastPreferredDuringSchedulingIgnoredDuringExecution() {
    int index = preferredDuringSchedulingIgnoredDuringExecution.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "preferredDuringSchedulingIgnoredDuringExecution"));
    }
    return this.setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(index, this.buildPreferredDuringSchedulingIgnoredDuringExecution(index));
  }
  
  public PreferredDuringSchedulingIgnoredDuringExecutionNested<A> editMatchingPreferredDuringSchedulingIgnoredDuringExecution(Predicate<V1WeightedPodAffinityTermBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < preferredDuringSchedulingIgnoredDuringExecution.size();i++) {
      if (predicate.test(preferredDuringSchedulingIgnoredDuringExecution.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "preferredDuringSchedulingIgnoredDuringExecution"));
    }
    return this.setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(index, this.buildPreferredDuringSchedulingIgnoredDuringExecution(index));
  }
  
  public A addToRequiredDuringSchedulingIgnoredDuringExecution(int index,V1PodAffinityTerm item) {
    if (this.requiredDuringSchedulingIgnoredDuringExecution == null) {
      this.requiredDuringSchedulingIgnoredDuringExecution = new ArrayList();
    }
    V1PodAffinityTermBuilder builder = new V1PodAffinityTermBuilder(item);
    if (index < 0 || index >= requiredDuringSchedulingIgnoredDuringExecution.size()) {
        _visitables.get("requiredDuringSchedulingIgnoredDuringExecution").add(builder);
        requiredDuringSchedulingIgnoredDuringExecution.add(builder);
    } else {
        _visitables.get("requiredDuringSchedulingIgnoredDuringExecution").add(builder);
        requiredDuringSchedulingIgnoredDuringExecution.add(index, builder);
    }
    return (A) this;
  }
  
  public A setToRequiredDuringSchedulingIgnoredDuringExecution(int index,V1PodAffinityTerm item) {
    if (this.requiredDuringSchedulingIgnoredDuringExecution == null) {
      this.requiredDuringSchedulingIgnoredDuringExecution = new ArrayList();
    }
    V1PodAffinityTermBuilder builder = new V1PodAffinityTermBuilder(item);
    if (index < 0 || index >= requiredDuringSchedulingIgnoredDuringExecution.size()) {
        _visitables.get("requiredDuringSchedulingIgnoredDuringExecution").add(builder);
        requiredDuringSchedulingIgnoredDuringExecution.add(builder);
    } else {
        _visitables.get("requiredDuringSchedulingIgnoredDuringExecution").add(builder);
        requiredDuringSchedulingIgnoredDuringExecution.set(index, builder);
    }
    return (A) this;
  }
  
  public A addToRequiredDuringSchedulingIgnoredDuringExecution(V1PodAffinityTerm... items) {
    if (this.requiredDuringSchedulingIgnoredDuringExecution == null) {
      this.requiredDuringSchedulingIgnoredDuringExecution = new ArrayList();
    }
    for (V1PodAffinityTerm item : items) {
        V1PodAffinityTermBuilder builder = new V1PodAffinityTermBuilder(item);
        _visitables.get("requiredDuringSchedulingIgnoredDuringExecution").add(builder);
        this.requiredDuringSchedulingIgnoredDuringExecution.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToRequiredDuringSchedulingIgnoredDuringExecution(Collection<V1PodAffinityTerm> items) {
    if (this.requiredDuringSchedulingIgnoredDuringExecution == null) {
      this.requiredDuringSchedulingIgnoredDuringExecution = new ArrayList();
    }
    for (V1PodAffinityTerm item : items) {
        V1PodAffinityTermBuilder builder = new V1PodAffinityTermBuilder(item);
        _visitables.get("requiredDuringSchedulingIgnoredDuringExecution").add(builder);
        this.requiredDuringSchedulingIgnoredDuringExecution.add(builder);
    }
    return (A) this;
  }
  
  public A removeFromRequiredDuringSchedulingIgnoredDuringExecution(V1PodAffinityTerm... items) {
    if (this.requiredDuringSchedulingIgnoredDuringExecution == null) {
      return (A) this;
    }
    for (V1PodAffinityTerm item : items) {
        V1PodAffinityTermBuilder builder = new V1PodAffinityTermBuilder(item);
        _visitables.get("requiredDuringSchedulingIgnoredDuringExecution").remove(builder);
        this.requiredDuringSchedulingIgnoredDuringExecution.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromRequiredDuringSchedulingIgnoredDuringExecution(Collection<V1PodAffinityTerm> items) {
    if (this.requiredDuringSchedulingIgnoredDuringExecution == null) {
      return (A) this;
    }
    for (V1PodAffinityTerm item : items) {
        V1PodAffinityTermBuilder builder = new V1PodAffinityTermBuilder(item);
        _visitables.get("requiredDuringSchedulingIgnoredDuringExecution").remove(builder);
        this.requiredDuringSchedulingIgnoredDuringExecution.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromRequiredDuringSchedulingIgnoredDuringExecution(Predicate<V1PodAffinityTermBuilder> predicate) {
    if (requiredDuringSchedulingIgnoredDuringExecution == null) {
      return (A) this;
    }
    Iterator<V1PodAffinityTermBuilder> each = requiredDuringSchedulingIgnoredDuringExecution.iterator();
    List visitables = _visitables.get("requiredDuringSchedulingIgnoredDuringExecution");
    while (each.hasNext()) {
        V1PodAffinityTermBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public List<V1PodAffinityTerm> buildRequiredDuringSchedulingIgnoredDuringExecution() {
    return this.requiredDuringSchedulingIgnoredDuringExecution != null ? build(requiredDuringSchedulingIgnoredDuringExecution) : null;
  }
  
  public V1PodAffinityTerm buildRequiredDuringSchedulingIgnoredDuringExecution(int index) {
    return this.requiredDuringSchedulingIgnoredDuringExecution.get(index).build();
  }
  
  public V1PodAffinityTerm buildFirstRequiredDuringSchedulingIgnoredDuringExecution() {
    return this.requiredDuringSchedulingIgnoredDuringExecution.get(0).build();
  }
  
  public V1PodAffinityTerm buildLastRequiredDuringSchedulingIgnoredDuringExecution() {
    return this.requiredDuringSchedulingIgnoredDuringExecution.get(requiredDuringSchedulingIgnoredDuringExecution.size() - 1).build();
  }
  
  public V1PodAffinityTerm buildMatchingRequiredDuringSchedulingIgnoredDuringExecution(Predicate<V1PodAffinityTermBuilder> predicate) {
      for (V1PodAffinityTermBuilder item : requiredDuringSchedulingIgnoredDuringExecution) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingRequiredDuringSchedulingIgnoredDuringExecution(Predicate<V1PodAffinityTermBuilder> predicate) {
      for (V1PodAffinityTermBuilder item : requiredDuringSchedulingIgnoredDuringExecution) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withRequiredDuringSchedulingIgnoredDuringExecution(List<V1PodAffinityTerm> requiredDuringSchedulingIgnoredDuringExecution) {
    if (this.requiredDuringSchedulingIgnoredDuringExecution != null) {
      this._visitables.get("requiredDuringSchedulingIgnoredDuringExecution").clear();
    }
    if (requiredDuringSchedulingIgnoredDuringExecution != null) {
        this.requiredDuringSchedulingIgnoredDuringExecution = new ArrayList();
        for (V1PodAffinityTerm item : requiredDuringSchedulingIgnoredDuringExecution) {
          this.addToRequiredDuringSchedulingIgnoredDuringExecution(item);
        }
    } else {
      this.requiredDuringSchedulingIgnoredDuringExecution = null;
    }
    return (A) this;
  }
  
  public A withRequiredDuringSchedulingIgnoredDuringExecution(V1PodAffinityTerm... requiredDuringSchedulingIgnoredDuringExecution) {
    if (this.requiredDuringSchedulingIgnoredDuringExecution != null) {
        this.requiredDuringSchedulingIgnoredDuringExecution.clear();
        _visitables.remove("requiredDuringSchedulingIgnoredDuringExecution");
    }
    if (requiredDuringSchedulingIgnoredDuringExecution != null) {
      for (V1PodAffinityTerm item : requiredDuringSchedulingIgnoredDuringExecution) {
        this.addToRequiredDuringSchedulingIgnoredDuringExecution(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasRequiredDuringSchedulingIgnoredDuringExecution() {
    return this.requiredDuringSchedulingIgnoredDuringExecution != null && !(this.requiredDuringSchedulingIgnoredDuringExecution.isEmpty());
  }
  
  public RequiredDuringSchedulingIgnoredDuringExecutionNested<A> addNewRequiredDuringSchedulingIgnoredDuringExecution() {
    return new RequiredDuringSchedulingIgnoredDuringExecutionNested(-1, null);
  }
  
  public RequiredDuringSchedulingIgnoredDuringExecutionNested<A> addNewRequiredDuringSchedulingIgnoredDuringExecutionLike(V1PodAffinityTerm item) {
    return new RequiredDuringSchedulingIgnoredDuringExecutionNested(-1, item);
  }
  
  public RequiredDuringSchedulingIgnoredDuringExecutionNested<A> setNewRequiredDuringSchedulingIgnoredDuringExecutionLike(int index,V1PodAffinityTerm item) {
    return new RequiredDuringSchedulingIgnoredDuringExecutionNested(index, item);
  }
  
  public RequiredDuringSchedulingIgnoredDuringExecutionNested<A> editRequiredDuringSchedulingIgnoredDuringExecution(int index) {
    if (index <= requiredDuringSchedulingIgnoredDuringExecution.size()) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "requiredDuringSchedulingIgnoredDuringExecution"));
    }
    return this.setNewRequiredDuringSchedulingIgnoredDuringExecutionLike(index, this.buildRequiredDuringSchedulingIgnoredDuringExecution(index));
  }
  
  public RequiredDuringSchedulingIgnoredDuringExecutionNested<A> editFirstRequiredDuringSchedulingIgnoredDuringExecution() {
    if (requiredDuringSchedulingIgnoredDuringExecution.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "requiredDuringSchedulingIgnoredDuringExecution"));
    }
    return this.setNewRequiredDuringSchedulingIgnoredDuringExecutionLike(0, this.buildRequiredDuringSchedulingIgnoredDuringExecution(0));
  }
  
  public RequiredDuringSchedulingIgnoredDuringExecutionNested<A> editLastRequiredDuringSchedulingIgnoredDuringExecution() {
    int index = requiredDuringSchedulingIgnoredDuringExecution.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "requiredDuringSchedulingIgnoredDuringExecution"));
    }
    return this.setNewRequiredDuringSchedulingIgnoredDuringExecutionLike(index, this.buildRequiredDuringSchedulingIgnoredDuringExecution(index));
  }
  
  public RequiredDuringSchedulingIgnoredDuringExecutionNested<A> editMatchingRequiredDuringSchedulingIgnoredDuringExecution(Predicate<V1PodAffinityTermBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < requiredDuringSchedulingIgnoredDuringExecution.size();i++) {
      if (predicate.test(requiredDuringSchedulingIgnoredDuringExecution.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "requiredDuringSchedulingIgnoredDuringExecution"));
    }
    return this.setNewRequiredDuringSchedulingIgnoredDuringExecutionLike(index, this.buildRequiredDuringSchedulingIgnoredDuringExecution(index));
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
    V1PodAntiAffinityFluent that = (V1PodAntiAffinityFluent) o;
    if (!(Objects.equals(preferredDuringSchedulingIgnoredDuringExecution, that.preferredDuringSchedulingIgnoredDuringExecution))) {
      return false;
    }
    if (!(Objects.equals(requiredDuringSchedulingIgnoredDuringExecution, that.requiredDuringSchedulingIgnoredDuringExecution))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(preferredDuringSchedulingIgnoredDuringExecution, requiredDuringSchedulingIgnoredDuringExecution);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(preferredDuringSchedulingIgnoredDuringExecution == null) && !(preferredDuringSchedulingIgnoredDuringExecution.isEmpty())) {
        sb.append("preferredDuringSchedulingIgnoredDuringExecution:");
        sb.append(preferredDuringSchedulingIgnoredDuringExecution);
        sb.append(",");
    }
    if (!(requiredDuringSchedulingIgnoredDuringExecution == null) && !(requiredDuringSchedulingIgnoredDuringExecution.isEmpty())) {
        sb.append("requiredDuringSchedulingIgnoredDuringExecution:");
        sb.append(requiredDuringSchedulingIgnoredDuringExecution);
    }
    sb.append("}");
    return sb.toString();
  }
  public class PreferredDuringSchedulingIgnoredDuringExecutionNested<N> extends V1WeightedPodAffinityTermFluent<PreferredDuringSchedulingIgnoredDuringExecutionNested<N>> implements Nested<N>{
    PreferredDuringSchedulingIgnoredDuringExecutionNested(int index,V1WeightedPodAffinityTerm item) {
      this.index = index;
      this.builder = new V1WeightedPodAffinityTermBuilder(this, item);
    }
    V1WeightedPodAffinityTermBuilder builder;
    int index;
    
    public N and() {
      return (N) V1PodAntiAffinityFluent.this.setToPreferredDuringSchedulingIgnoredDuringExecution(index, builder.build());
    }
    
    public N endPreferredDuringSchedulingIgnoredDuringExecution() {
      return and();
    }
    
  
  }
  public class RequiredDuringSchedulingIgnoredDuringExecutionNested<N> extends V1PodAffinityTermFluent<RequiredDuringSchedulingIgnoredDuringExecutionNested<N>> implements Nested<N>{
    RequiredDuringSchedulingIgnoredDuringExecutionNested(int index,V1PodAffinityTerm item) {
      this.index = index;
      this.builder = new V1PodAffinityTermBuilder(this, item);
    }
    V1PodAffinityTermBuilder builder;
    int index;
    
    public N and() {
      return (N) V1PodAntiAffinityFluent.this.setToRequiredDuringSchedulingIgnoredDuringExecution(index, builder.build());
    }
    
    public N endRequiredDuringSchedulingIgnoredDuringExecution() {
      return and();
    }
    
  
  }

}