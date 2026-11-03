/*
Copyright 2026 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Integer;
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
import javax.annotation.processing.Generated;

/**
 * Generated
 */
@Generated("io.sundr:builder-annotations")
@SuppressWarnings({"unchecked"})
public class V1alpha3CompositePodGroupTemplateFluent<A extends V1alpha3CompositePodGroupTemplateFluent<A>> extends BaseFluent<A>{

  private ArrayList<V1alpha3CompositePodGroupTemplateBuilder> compositePodGroupTemplates;
  private V1alpha3CompositeDisruptionModeBuilder disruptionMode;
  private String name;
  private ArrayList<V1alpha3PodGroupTemplateBuilder> podGroupTemplates;
  private String preemptionPolicy;
  private Integer priority;
  private String priorityClassName;
  private V1alpha3CompositePodGroupSchedulingConstraintsBuilder schedulingConstraints;
  private V1alpha3CompositePodGroupSchedulingPolicyBuilder schedulingPolicy;

  public V1alpha3CompositePodGroupTemplateFluent() {
  }
  
  public V1alpha3CompositePodGroupTemplateFluent(V1alpha3CompositePodGroupTemplate instance) {
    this.copyInstance(instance);
  }

  public A addAllToCompositePodGroupTemplates(Collection<V1alpha3CompositePodGroupTemplate> items) {
    if (this.compositePodGroupTemplates == null) {
      this.compositePodGroupTemplates = new ArrayList<>();
    }
    for (V1alpha3CompositePodGroupTemplate item : items) {
        V1alpha3CompositePodGroupTemplateBuilder builder = new V1alpha3CompositePodGroupTemplateBuilder(item);
        this._visitables.get("compositePodGroupTemplates").add(builder);
        this.compositePodGroupTemplates.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToPodGroupTemplates(Collection<V1alpha3PodGroupTemplate> items) {
    if (this.podGroupTemplates == null) {
      this.podGroupTemplates = new ArrayList<>();
    }
    for (V1alpha3PodGroupTemplate item : items) {
        V1alpha3PodGroupTemplateBuilder builder = new V1alpha3PodGroupTemplateBuilder(item);
        this._visitables.get("podGroupTemplates").add(builder);
        this.podGroupTemplates.add(builder);
    }
    return (A) this;
  }
  
  public CompositePodGroupTemplatesNested<A> addNewCompositePodGroupTemplate() {
    return new CompositePodGroupTemplatesNested<>(-1, null);
  }
  
  public CompositePodGroupTemplatesNested<A> addNewCompositePodGroupTemplateLike(V1alpha3CompositePodGroupTemplate item) {
    return new CompositePodGroupTemplatesNested<>(-1, item);
  }
  
  public PodGroupTemplatesNested<A> addNewPodGroupTemplate() {
    return new PodGroupTemplatesNested<>(-1, null);
  }
  
  public PodGroupTemplatesNested<A> addNewPodGroupTemplateLike(V1alpha3PodGroupTemplate item) {
    return new PodGroupTemplatesNested<>(-1, item);
  }
  
  public A addToCompositePodGroupTemplates(V1alpha3CompositePodGroupTemplate... items) {
    if (this.compositePodGroupTemplates == null) {
      this.compositePodGroupTemplates = new ArrayList<>();
    }
    for (V1alpha3CompositePodGroupTemplate item : items) {
        V1alpha3CompositePodGroupTemplateBuilder builder = new V1alpha3CompositePodGroupTemplateBuilder(item);
        this._visitables.get("compositePodGroupTemplates").add(builder);
        this.compositePodGroupTemplates.add(builder);
    }
    return (A) this;
  }
  
  public A addToCompositePodGroupTemplates(int index,V1alpha3CompositePodGroupTemplate item) {
    if (this.compositePodGroupTemplates == null) {
      this.compositePodGroupTemplates = new ArrayList<>();
    }
    V1alpha3CompositePodGroupTemplateBuilder builder = new V1alpha3CompositePodGroupTemplateBuilder(item);
    if (index < 0 || index >= this.compositePodGroupTemplates.size()) {
        this._visitables.get("compositePodGroupTemplates").add(builder);
        this.compositePodGroupTemplates.add(builder);
    } else {
        this._visitables.get("compositePodGroupTemplates").add(builder);
        this.compositePodGroupTemplates.add(index, builder);
    }
    return (A) this;
  }
  
  public A addToPodGroupTemplates(V1alpha3PodGroupTemplate... items) {
    if (this.podGroupTemplates == null) {
      this.podGroupTemplates = new ArrayList<>();
    }
    for (V1alpha3PodGroupTemplate item : items) {
        V1alpha3PodGroupTemplateBuilder builder = new V1alpha3PodGroupTemplateBuilder(item);
        this._visitables.get("podGroupTemplates").add(builder);
        this.podGroupTemplates.add(builder);
    }
    return (A) this;
  }
  
  public A addToPodGroupTemplates(int index,V1alpha3PodGroupTemplate item) {
    if (this.podGroupTemplates == null) {
      this.podGroupTemplates = new ArrayList<>();
    }
    V1alpha3PodGroupTemplateBuilder builder = new V1alpha3PodGroupTemplateBuilder(item);
    if (index < 0 || index >= this.podGroupTemplates.size()) {
        this._visitables.get("podGroupTemplates").add(builder);
        this.podGroupTemplates.add(builder);
    } else {
        this._visitables.get("podGroupTemplates").add(builder);
        this.podGroupTemplates.add(index, builder);
    }
    return (A) this;
  }
  
  public V1alpha3CompositePodGroupTemplate buildCompositePodGroupTemplate(int index) {
    return this.compositePodGroupTemplates.get(index).build();
  }
  
  public List<V1alpha3CompositePodGroupTemplate> buildCompositePodGroupTemplates() {
    return this.compositePodGroupTemplates != null ? build(compositePodGroupTemplates) : null;
  }
  
  public V1alpha3CompositeDisruptionMode buildDisruptionMode() {
    return this.disruptionMode != null ? this.disruptionMode.build() : null;
  }
  
  public V1alpha3CompositePodGroupTemplate buildFirstCompositePodGroupTemplate() {
    return this.compositePodGroupTemplates.get(0).build();
  }
  
  public V1alpha3PodGroupTemplate buildFirstPodGroupTemplate() {
    return this.podGroupTemplates.get(0).build();
  }
  
  public V1alpha3CompositePodGroupTemplate buildLastCompositePodGroupTemplate() {
    return this.compositePodGroupTemplates.get(compositePodGroupTemplates.size() - 1).build();
  }
  
  public V1alpha3PodGroupTemplate buildLastPodGroupTemplate() {
    return this.podGroupTemplates.get(podGroupTemplates.size() - 1).build();
  }
  
  public V1alpha3CompositePodGroupTemplate buildMatchingCompositePodGroupTemplate(Predicate<V1alpha3CompositePodGroupTemplateBuilder> predicate) {
      for (V1alpha3CompositePodGroupTemplateBuilder item : compositePodGroupTemplates) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public V1alpha3PodGroupTemplate buildMatchingPodGroupTemplate(Predicate<V1alpha3PodGroupTemplateBuilder> predicate) {
      for (V1alpha3PodGroupTemplateBuilder item : podGroupTemplates) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public V1alpha3PodGroupTemplate buildPodGroupTemplate(int index) {
    return this.podGroupTemplates.get(index).build();
  }
  
  public List<V1alpha3PodGroupTemplate> buildPodGroupTemplates() {
    return this.podGroupTemplates != null ? build(podGroupTemplates) : null;
  }
  
  public V1alpha3CompositePodGroupSchedulingConstraints buildSchedulingConstraints() {
    return this.schedulingConstraints != null ? this.schedulingConstraints.build() : null;
  }
  
  public V1alpha3CompositePodGroupSchedulingPolicy buildSchedulingPolicy() {
    return this.schedulingPolicy != null ? this.schedulingPolicy.build() : null;
  }
  
  protected void copyInstance(V1alpha3CompositePodGroupTemplate instance) {
    instance = instance != null ? instance : new V1alpha3CompositePodGroupTemplate();
    if (instance != null) {
        this.withCompositePodGroupTemplates(instance.getCompositePodGroupTemplates());
        this.withDisruptionMode(instance.getDisruptionMode());
        this.withName(instance.getName());
        this.withPodGroupTemplates(instance.getPodGroupTemplates());
        this.withPreemptionPolicy(instance.getPreemptionPolicy());
        this.withPriority(instance.getPriority());
        this.withPriorityClassName(instance.getPriorityClassName());
        this.withSchedulingConstraints(instance.getSchedulingConstraints());
        this.withSchedulingPolicy(instance.getSchedulingPolicy());
    }
  }
  
  public CompositePodGroupTemplatesNested<A> editCompositePodGroupTemplate(int index) {
    if (compositePodGroupTemplates.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "compositePodGroupTemplates"));
    }
    return this.setNewCompositePodGroupTemplateLike(index, this.buildCompositePodGroupTemplate(index));
  }
  
  public DisruptionModeNested<A> editDisruptionMode() {
    return this.withNewDisruptionModeLike(Optional.ofNullable(this.buildDisruptionMode()).orElse(null));
  }
  
  public CompositePodGroupTemplatesNested<A> editFirstCompositePodGroupTemplate() {
    if (compositePodGroupTemplates.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "compositePodGroupTemplates"));
    }
    return this.setNewCompositePodGroupTemplateLike(0, this.buildCompositePodGroupTemplate(0));
  }
  
  public PodGroupTemplatesNested<A> editFirstPodGroupTemplate() {
    if (podGroupTemplates.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "podGroupTemplates"));
    }
    return this.setNewPodGroupTemplateLike(0, this.buildPodGroupTemplate(0));
  }
  
  public CompositePodGroupTemplatesNested<A> editLastCompositePodGroupTemplate() {
    int index = compositePodGroupTemplates.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "compositePodGroupTemplates"));
    }
    return this.setNewCompositePodGroupTemplateLike(index, this.buildCompositePodGroupTemplate(index));
  }
  
  public PodGroupTemplatesNested<A> editLastPodGroupTemplate() {
    int index = podGroupTemplates.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "podGroupTemplates"));
    }
    return this.setNewPodGroupTemplateLike(index, this.buildPodGroupTemplate(index));
  }
  
  public CompositePodGroupTemplatesNested<A> editMatchingCompositePodGroupTemplate(Predicate<V1alpha3CompositePodGroupTemplateBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < compositePodGroupTemplates.size();i++) {
      if (predicate.test(compositePodGroupTemplates.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "compositePodGroupTemplates"));
    }
    return this.setNewCompositePodGroupTemplateLike(index, this.buildCompositePodGroupTemplate(index));
  }
  
  public PodGroupTemplatesNested<A> editMatchingPodGroupTemplate(Predicate<V1alpha3PodGroupTemplateBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < podGroupTemplates.size();i++) {
      if (predicate.test(podGroupTemplates.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "podGroupTemplates"));
    }
    return this.setNewPodGroupTemplateLike(index, this.buildPodGroupTemplate(index));
  }
  
  public DisruptionModeNested<A> editOrNewDisruptionMode() {
    return this.withNewDisruptionModeLike(Optional.ofNullable(this.buildDisruptionMode()).orElse(new V1alpha3CompositeDisruptionModeBuilder().build()));
  }
  
  public DisruptionModeNested<A> editOrNewDisruptionModeLike(V1alpha3CompositeDisruptionMode item) {
    return this.withNewDisruptionModeLike(Optional.ofNullable(this.buildDisruptionMode()).orElse(item));
  }
  
  public SchedulingConstraintsNested<A> editOrNewSchedulingConstraints() {
    return this.withNewSchedulingConstraintsLike(Optional.ofNullable(this.buildSchedulingConstraints()).orElse(new V1alpha3CompositePodGroupSchedulingConstraintsBuilder().build()));
  }
  
  public SchedulingConstraintsNested<A> editOrNewSchedulingConstraintsLike(V1alpha3CompositePodGroupSchedulingConstraints item) {
    return this.withNewSchedulingConstraintsLike(Optional.ofNullable(this.buildSchedulingConstraints()).orElse(item));
  }
  
  public SchedulingPolicyNested<A> editOrNewSchedulingPolicy() {
    return this.withNewSchedulingPolicyLike(Optional.ofNullable(this.buildSchedulingPolicy()).orElse(new V1alpha3CompositePodGroupSchedulingPolicyBuilder().build()));
  }
  
  public SchedulingPolicyNested<A> editOrNewSchedulingPolicyLike(V1alpha3CompositePodGroupSchedulingPolicy item) {
    return this.withNewSchedulingPolicyLike(Optional.ofNullable(this.buildSchedulingPolicy()).orElse(item));
  }
  
  public PodGroupTemplatesNested<A> editPodGroupTemplate(int index) {
    if (podGroupTemplates.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "podGroupTemplates"));
    }
    return this.setNewPodGroupTemplateLike(index, this.buildPodGroupTemplate(index));
  }
  
  public SchedulingConstraintsNested<A> editSchedulingConstraints() {
    return this.withNewSchedulingConstraintsLike(Optional.ofNullable(this.buildSchedulingConstraints()).orElse(null));
  }
  
  public SchedulingPolicyNested<A> editSchedulingPolicy() {
    return this.withNewSchedulingPolicyLike(Optional.ofNullable(this.buildSchedulingPolicy()).orElse(null));
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
    V1alpha3CompositePodGroupTemplateFluent<?> that = (V1alpha3CompositePodGroupTemplateFluent<?>) o;
    if (!(Objects.equals(compositePodGroupTemplates, that.compositePodGroupTemplates))) {
      return false;
    }
    if (!(Objects.equals(disruptionMode, that.disruptionMode))) {
      return false;
    }
    if (!(Objects.equals(name, that.name))) {
      return false;
    }
    if (!(Objects.equals(podGroupTemplates, that.podGroupTemplates))) {
      return false;
    }
    if (!(Objects.equals(preemptionPolicy, that.preemptionPolicy))) {
      return false;
    }
    if (!(Objects.equals(priority, that.priority))) {
      return false;
    }
    if (!(Objects.equals(priorityClassName, that.priorityClassName))) {
      return false;
    }
    if (!(Objects.equals(schedulingConstraints, that.schedulingConstraints))) {
      return false;
    }
    if (!(Objects.equals(schedulingPolicy, that.schedulingPolicy))) {
      return false;
    }
    return true;
  }
  
  public String getName() {
    return this.name;
  }
  
  public String getPreemptionPolicy() {
    return this.preemptionPolicy;
  }
  
  public Integer getPriority() {
    return this.priority;
  }
  
  public String getPriorityClassName() {
    return this.priorityClassName;
  }
  
  public boolean hasCompositePodGroupTemplates() {
    return this.compositePodGroupTemplates != null && !(this.compositePodGroupTemplates.isEmpty());
  }
  
  public boolean hasDisruptionMode() {
    return this.disruptionMode != null;
  }
  
  public boolean hasMatchingCompositePodGroupTemplate(Predicate<V1alpha3CompositePodGroupTemplateBuilder> predicate) {
      for (V1alpha3CompositePodGroupTemplateBuilder item : compositePodGroupTemplates) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasMatchingPodGroupTemplate(Predicate<V1alpha3PodGroupTemplateBuilder> predicate) {
      for (V1alpha3PodGroupTemplateBuilder item : podGroupTemplates) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public boolean hasPodGroupTemplates() {
    return this.podGroupTemplates != null && !(this.podGroupTemplates.isEmpty());
  }
  
  public boolean hasPreemptionPolicy() {
    return this.preemptionPolicy != null;
  }
  
  public boolean hasPriority() {
    return this.priority != null;
  }
  
  public boolean hasPriorityClassName() {
    return this.priorityClassName != null;
  }
  
  public boolean hasSchedulingConstraints() {
    return this.schedulingConstraints != null;
  }
  
  public boolean hasSchedulingPolicy() {
    return this.schedulingPolicy != null;
  }
  
  public int hashCode() {
    return Objects.hash(compositePodGroupTemplates, disruptionMode, name, podGroupTemplates, preemptionPolicy, priority, priorityClassName, schedulingConstraints, schedulingPolicy);
  }
  
  public A removeAllFromCompositePodGroupTemplates(Collection<V1alpha3CompositePodGroupTemplate> items) {
    if (this.compositePodGroupTemplates == null) {
      return (A) this;
    }
    for (V1alpha3CompositePodGroupTemplate item : items) {
        V1alpha3CompositePodGroupTemplateBuilder builder = new V1alpha3CompositePodGroupTemplateBuilder(item);
        _visitables.get("compositePodGroupTemplates").remove(builder);
        this.compositePodGroupTemplates.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromPodGroupTemplates(Collection<V1alpha3PodGroupTemplate> items) {
    if (this.podGroupTemplates == null) {
      return (A) this;
    }
    for (V1alpha3PodGroupTemplate item : items) {
        V1alpha3PodGroupTemplateBuilder builder = new V1alpha3PodGroupTemplateBuilder(item);
        _visitables.get("podGroupTemplates").remove(builder);
        this.podGroupTemplates.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromCompositePodGroupTemplates(V1alpha3CompositePodGroupTemplate... items) {
    if (this.compositePodGroupTemplates == null) {
      return (A) this;
    }
    for (V1alpha3CompositePodGroupTemplate item : items) {
        V1alpha3CompositePodGroupTemplateBuilder builder = new V1alpha3CompositePodGroupTemplateBuilder(item);
        _visitables.get("compositePodGroupTemplates").remove(builder);
        this.compositePodGroupTemplates.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromPodGroupTemplates(V1alpha3PodGroupTemplate... items) {
    if (this.podGroupTemplates == null) {
      return (A) this;
    }
    for (V1alpha3PodGroupTemplate item : items) {
        V1alpha3PodGroupTemplateBuilder builder = new V1alpha3PodGroupTemplateBuilder(item);
        _visitables.get("podGroupTemplates").remove(builder);
        this.podGroupTemplates.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromCompositePodGroupTemplates(Predicate<V1alpha3CompositePodGroupTemplateBuilder> predicate) {
    if (compositePodGroupTemplates == null) {
      return (A) this;
    }
    Iterator<V1alpha3CompositePodGroupTemplateBuilder> each = compositePodGroupTemplates.iterator();
    @SuppressWarnings({"rawtypes"})
    List visitables = this._visitables.get("compositePodGroupTemplates");
    while (each.hasNext()) {
        V1alpha3CompositePodGroupTemplateBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public A removeMatchingFromPodGroupTemplates(Predicate<V1alpha3PodGroupTemplateBuilder> predicate) {
    if (podGroupTemplates == null) {
      return (A) this;
    }
    Iterator<V1alpha3PodGroupTemplateBuilder> each = podGroupTemplates.iterator();
    @SuppressWarnings({"rawtypes"})
    List visitables = this._visitables.get("podGroupTemplates");
    while (each.hasNext()) {
        V1alpha3PodGroupTemplateBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public CompositePodGroupTemplatesNested<A> setNewCompositePodGroupTemplateLike(int index,V1alpha3CompositePodGroupTemplate item) {
    return new CompositePodGroupTemplatesNested<>(index, item);
  }
  
  public PodGroupTemplatesNested<A> setNewPodGroupTemplateLike(int index,V1alpha3PodGroupTemplate item) {
    return new PodGroupTemplatesNested<>(index, item);
  }
  
  public A setToCompositePodGroupTemplates(int index,V1alpha3CompositePodGroupTemplate item) {
    if (this.compositePodGroupTemplates == null) {
      this.compositePodGroupTemplates = new ArrayList<>();
    }
    V1alpha3CompositePodGroupTemplateBuilder builder = new V1alpha3CompositePodGroupTemplateBuilder(item);
    if (index < 0 || index >= this.compositePodGroupTemplates.size()) {
        this._visitables.get("compositePodGroupTemplates").add(builder);
        this.compositePodGroupTemplates.add(builder);
    } else {
        this._visitables.get("compositePodGroupTemplates").add(builder);
        this.compositePodGroupTemplates.set(index, builder);
    }
    return (A) this;
  }
  
  public A setToPodGroupTemplates(int index,V1alpha3PodGroupTemplate item) {
    if (this.podGroupTemplates == null) {
      this.podGroupTemplates = new ArrayList<>();
    }
    V1alpha3PodGroupTemplateBuilder builder = new V1alpha3PodGroupTemplateBuilder(item);
    if (index < 0 || index >= this.podGroupTemplates.size()) {
        this._visitables.get("podGroupTemplates").add(builder);
        this.podGroupTemplates.add(builder);
    } else {
        this._visitables.get("podGroupTemplates").add(builder);
        this.podGroupTemplates.set(index, builder);
    }
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(compositePodGroupTemplates == null) && !(compositePodGroupTemplates.isEmpty())) {
        sb.append("compositePodGroupTemplates:");
        sb.append(compositePodGroupTemplates);
        sb.append(",");
    }
    if (!(disruptionMode == null)) {
        sb.append("disruptionMode:");
        sb.append(disruptionMode);
        sb.append(",");
    }
    if (!(name == null)) {
        sb.append("name:");
        sb.append(name);
        sb.append(",");
    }
    if (!(podGroupTemplates == null) && !(podGroupTemplates.isEmpty())) {
        sb.append("podGroupTemplates:");
        sb.append(podGroupTemplates);
        sb.append(",");
    }
    if (!(preemptionPolicy == null)) {
        sb.append("preemptionPolicy:");
        sb.append(preemptionPolicy);
        sb.append(",");
    }
    if (!(priority == null)) {
        sb.append("priority:");
        sb.append(priority);
        sb.append(",");
    }
    if (!(priorityClassName == null)) {
        sb.append("priorityClassName:");
        sb.append(priorityClassName);
        sb.append(",");
    }
    if (!(schedulingConstraints == null)) {
        sb.append("schedulingConstraints:");
        sb.append(schedulingConstraints);
        sb.append(",");
    }
    if (!(schedulingPolicy == null)) {
        sb.append("schedulingPolicy:");
        sb.append(schedulingPolicy);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withCompositePodGroupTemplates(List<V1alpha3CompositePodGroupTemplate> compositePodGroupTemplates) {
    if (this.compositePodGroupTemplates != null) {
      this._visitables.get("compositePodGroupTemplates").clear();
    }
    if (compositePodGroupTemplates != null) {
        this.compositePodGroupTemplates = new ArrayList<>();
        for (V1alpha3CompositePodGroupTemplate item : compositePodGroupTemplates) {
          this.addToCompositePodGroupTemplates(item);
        }
    } else {
      this.compositePodGroupTemplates = null;
    }
    return (A) this;
  }
  
  public A withCompositePodGroupTemplates(V1alpha3CompositePodGroupTemplate... compositePodGroupTemplates) {
    if (this.compositePodGroupTemplates != null) {
        this.compositePodGroupTemplates.clear();
        _visitables.remove("compositePodGroupTemplates");
    }
    if (compositePodGroupTemplates != null) {
      for (V1alpha3CompositePodGroupTemplate item : compositePodGroupTemplates) {
        this.addToCompositePodGroupTemplates(item);
      }
    }
    return (A) this;
  }
  
  public A withDisruptionMode(V1alpha3CompositeDisruptionMode disruptionMode) {
    this._visitables.remove("disruptionMode");
    if (disruptionMode != null) {
        this.disruptionMode = new V1alpha3CompositeDisruptionModeBuilder(disruptionMode);
        this._visitables.get("disruptionMode").add(this.disruptionMode);
    } else {
        this._visitables.get("disruptionMode").remove(this.disruptionMode);
        this.disruptionMode = null;
    }
    return (A) this;
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public DisruptionModeNested<A> withNewDisruptionMode() {
    return new DisruptionModeNested<>(null);
  }
  
  public DisruptionModeNested<A> withNewDisruptionModeLike(V1alpha3CompositeDisruptionMode item) {
    return new DisruptionModeNested<>(item);
  }
  
  public SchedulingConstraintsNested<A> withNewSchedulingConstraints() {
    return new SchedulingConstraintsNested<>(null);
  }
  
  public SchedulingConstraintsNested<A> withNewSchedulingConstraintsLike(V1alpha3CompositePodGroupSchedulingConstraints item) {
    return new SchedulingConstraintsNested<>(item);
  }
  
  public SchedulingPolicyNested<A> withNewSchedulingPolicy() {
    return new SchedulingPolicyNested<>(null);
  }
  
  public SchedulingPolicyNested<A> withNewSchedulingPolicyLike(V1alpha3CompositePodGroupSchedulingPolicy item) {
    return new SchedulingPolicyNested<>(item);
  }
  
  public A withPodGroupTemplates(List<V1alpha3PodGroupTemplate> podGroupTemplates) {
    if (this.podGroupTemplates != null) {
      this._visitables.get("podGroupTemplates").clear();
    }
    if (podGroupTemplates != null) {
        this.podGroupTemplates = new ArrayList<>();
        for (V1alpha3PodGroupTemplate item : podGroupTemplates) {
          this.addToPodGroupTemplates(item);
        }
    } else {
      this.podGroupTemplates = null;
    }
    return (A) this;
  }
  
  public A withPodGroupTemplates(V1alpha3PodGroupTemplate... podGroupTemplates) {
    if (this.podGroupTemplates != null) {
        this.podGroupTemplates.clear();
        _visitables.remove("podGroupTemplates");
    }
    if (podGroupTemplates != null) {
      for (V1alpha3PodGroupTemplate item : podGroupTemplates) {
        this.addToPodGroupTemplates(item);
      }
    }
    return (A) this;
  }
  
  public A withPreemptionPolicy(String preemptionPolicy) {
    this.preemptionPolicy = preemptionPolicy;
    return (A) this;
  }
  
  public A withPriority(Integer priority) {
    this.priority = priority;
    return (A) this;
  }
  
  public A withPriorityClassName(String priorityClassName) {
    this.priorityClassName = priorityClassName;
    return (A) this;
  }
  
  public A withSchedulingConstraints(V1alpha3CompositePodGroupSchedulingConstraints schedulingConstraints) {
    this._visitables.remove("schedulingConstraints");
    if (schedulingConstraints != null) {
        this.schedulingConstraints = new V1alpha3CompositePodGroupSchedulingConstraintsBuilder(schedulingConstraints);
        this._visitables.get("schedulingConstraints").add(this.schedulingConstraints);
    } else {
        this._visitables.get("schedulingConstraints").remove(this.schedulingConstraints);
        this.schedulingConstraints = null;
    }
    return (A) this;
  }
  
  public A withSchedulingPolicy(V1alpha3CompositePodGroupSchedulingPolicy schedulingPolicy) {
    this._visitables.remove("schedulingPolicy");
    if (schedulingPolicy != null) {
        this.schedulingPolicy = new V1alpha3CompositePodGroupSchedulingPolicyBuilder(schedulingPolicy);
        this._visitables.get("schedulingPolicy").add(this.schedulingPolicy);
    } else {
        this._visitables.get("schedulingPolicy").remove(this.schedulingPolicy);
        this.schedulingPolicy = null;
    }
    return (A) this;
  }
  public class CompositePodGroupTemplatesNested<N> extends V1alpha3CompositePodGroupTemplateFluent<CompositePodGroupTemplatesNested<N>> implements Nested<N>{
  
    V1alpha3CompositePodGroupTemplateBuilder builder;
    int index;
  
    CompositePodGroupTemplatesNested(int index,V1alpha3CompositePodGroupTemplate item) {
      this.index = index;
      this.builder = new V1alpha3CompositePodGroupTemplateBuilder(this, item);
    }
  
    public N and() {
      return (N) V1alpha3CompositePodGroupTemplateFluent.this.setToCompositePodGroupTemplates(index, builder.build());
    }
    
    public N endCompositePodGroupTemplate() {
      return and();
    }
    
  }
  public class DisruptionModeNested<N> extends V1alpha3CompositeDisruptionModeFluent<DisruptionModeNested<N>> implements Nested<N>{
  
    V1alpha3CompositeDisruptionModeBuilder builder;
  
    DisruptionModeNested(V1alpha3CompositeDisruptionMode item) {
      this.builder = new V1alpha3CompositeDisruptionModeBuilder(this, item);
    }
  
    public N and() {
      return (N) V1alpha3CompositePodGroupTemplateFluent.this.withDisruptionMode(builder.build());
    }
    
    public N endDisruptionMode() {
      return and();
    }
    
  }
  public class PodGroupTemplatesNested<N> extends V1alpha3PodGroupTemplateFluent<PodGroupTemplatesNested<N>> implements Nested<N>{
  
    V1alpha3PodGroupTemplateBuilder builder;
    int index;
  
    PodGroupTemplatesNested(int index,V1alpha3PodGroupTemplate item) {
      this.index = index;
      this.builder = new V1alpha3PodGroupTemplateBuilder(this, item);
    }
  
    public N and() {
      return (N) V1alpha3CompositePodGroupTemplateFluent.this.setToPodGroupTemplates(index, builder.build());
    }
    
    public N endPodGroupTemplate() {
      return and();
    }
    
  }
  public class SchedulingConstraintsNested<N> extends V1alpha3CompositePodGroupSchedulingConstraintsFluent<SchedulingConstraintsNested<N>> implements Nested<N>{
  
    V1alpha3CompositePodGroupSchedulingConstraintsBuilder builder;
  
    SchedulingConstraintsNested(V1alpha3CompositePodGroupSchedulingConstraints item) {
      this.builder = new V1alpha3CompositePodGroupSchedulingConstraintsBuilder(this, item);
    }
  
    public N and() {
      return (N) V1alpha3CompositePodGroupTemplateFluent.this.withSchedulingConstraints(builder.build());
    }
    
    public N endSchedulingConstraints() {
      return and();
    }
    
  }
  public class SchedulingPolicyNested<N> extends V1alpha3CompositePodGroupSchedulingPolicyFluent<SchedulingPolicyNested<N>> implements Nested<N>{
  
    V1alpha3CompositePodGroupSchedulingPolicyBuilder builder;
  
    SchedulingPolicyNested(V1alpha3CompositePodGroupSchedulingPolicy item) {
      this.builder = new V1alpha3CompositePodGroupSchedulingPolicyBuilder(this, item);
    }
  
    public N and() {
      return (N) V1alpha3CompositePodGroupTemplateFluent.this.withSchedulingPolicy(builder.build());
    }
    
    public N endSchedulingPolicy() {
      return and();
    }
    
  }
}