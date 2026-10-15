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
public class V1alpha3WorkloadSpecFluent<A extends V1alpha3WorkloadSpecFluent<A>> extends BaseFluent<A>{

  private ArrayList<V1alpha3CompositePodGroupTemplateBuilder> compositePodGroupTemplates;
  private V1alpha3TypedLocalObjectReferenceBuilder controllerRef;
  private ArrayList<V1alpha3PodGroupTemplateBuilder> podGroupTemplates;

  public V1alpha3WorkloadSpecFluent() {
  }
  
  public V1alpha3WorkloadSpecFluent(V1alpha3WorkloadSpec instance) {
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
  
  public V1alpha3TypedLocalObjectReference buildControllerRef() {
    return this.controllerRef != null ? this.controllerRef.build() : null;
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
  
  protected void copyInstance(V1alpha3WorkloadSpec instance) {
    instance = instance != null ? instance : new V1alpha3WorkloadSpec();
    if (instance != null) {
        this.withCompositePodGroupTemplates(instance.getCompositePodGroupTemplates());
        this.withControllerRef(instance.getControllerRef());
        this.withPodGroupTemplates(instance.getPodGroupTemplates());
    }
  }
  
  public CompositePodGroupTemplatesNested<A> editCompositePodGroupTemplate(int index) {
    if (compositePodGroupTemplates.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "compositePodGroupTemplates"));
    }
    return this.setNewCompositePodGroupTemplateLike(index, this.buildCompositePodGroupTemplate(index));
  }
  
  public ControllerRefNested<A> editControllerRef() {
    return this.withNewControllerRefLike(Optional.ofNullable(this.buildControllerRef()).orElse(null));
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
  
  public ControllerRefNested<A> editOrNewControllerRef() {
    return this.withNewControllerRefLike(Optional.ofNullable(this.buildControllerRef()).orElse(new V1alpha3TypedLocalObjectReferenceBuilder().build()));
  }
  
  public ControllerRefNested<A> editOrNewControllerRefLike(V1alpha3TypedLocalObjectReference item) {
    return this.withNewControllerRefLike(Optional.ofNullable(this.buildControllerRef()).orElse(item));
  }
  
  public PodGroupTemplatesNested<A> editPodGroupTemplate(int index) {
    if (podGroupTemplates.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "podGroupTemplates"));
    }
    return this.setNewPodGroupTemplateLike(index, this.buildPodGroupTemplate(index));
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
    V1alpha3WorkloadSpecFluent<?> that = (V1alpha3WorkloadSpecFluent<?>) o;
    if (!(Objects.equals(compositePodGroupTemplates, that.compositePodGroupTemplates))) {
      return false;
    }
    if (!(Objects.equals(controllerRef, that.controllerRef))) {
      return false;
    }
    if (!(Objects.equals(podGroupTemplates, that.podGroupTemplates))) {
      return false;
    }
    return true;
  }
  
  public boolean hasCompositePodGroupTemplates() {
    return this.compositePodGroupTemplates != null && !(this.compositePodGroupTemplates.isEmpty());
  }
  
  public boolean hasControllerRef() {
    return this.controllerRef != null;
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
  
  public boolean hasPodGroupTemplates() {
    return this.podGroupTemplates != null && !(this.podGroupTemplates.isEmpty());
  }
  
  public int hashCode() {
    return Objects.hash(compositePodGroupTemplates, controllerRef, podGroupTemplates);
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
    if (!(controllerRef == null)) {
        sb.append("controllerRef:");
        sb.append(controllerRef);
        sb.append(",");
    }
    if (!(podGroupTemplates == null) && !(podGroupTemplates.isEmpty())) {
        sb.append("podGroupTemplates:");
        sb.append(podGroupTemplates);
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
  
  public A withControllerRef(V1alpha3TypedLocalObjectReference controllerRef) {
    this._visitables.remove("controllerRef");
    if (controllerRef != null) {
        this.controllerRef = new V1alpha3TypedLocalObjectReferenceBuilder(controllerRef);
        this._visitables.get("controllerRef").add(this.controllerRef);
    } else {
        this._visitables.get("controllerRef").remove(this.controllerRef);
        this.controllerRef = null;
    }
    return (A) this;
  }
  
  public ControllerRefNested<A> withNewControllerRef() {
    return new ControllerRefNested<>(null);
  }
  
  public ControllerRefNested<A> withNewControllerRefLike(V1alpha3TypedLocalObjectReference item) {
    return new ControllerRefNested<>(item);
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
  public class CompositePodGroupTemplatesNested<N> extends V1alpha3CompositePodGroupTemplateFluent<CompositePodGroupTemplatesNested<N>> implements Nested<N>{
  
    V1alpha3CompositePodGroupTemplateBuilder builder;
    int index;
  
    CompositePodGroupTemplatesNested(int index,V1alpha3CompositePodGroupTemplate item) {
      this.index = index;
      this.builder = new V1alpha3CompositePodGroupTemplateBuilder(this, item);
    }
  
    public N and() {
      return (N) V1alpha3WorkloadSpecFluent.this.setToCompositePodGroupTemplates(index, builder.build());
    }
    
    public N endCompositePodGroupTemplate() {
      return and();
    }
    
  }
  public class ControllerRefNested<N> extends V1alpha3TypedLocalObjectReferenceFluent<ControllerRefNested<N>> implements Nested<N>{
  
    V1alpha3TypedLocalObjectReferenceBuilder builder;
  
    ControllerRefNested(V1alpha3TypedLocalObjectReference item) {
      this.builder = new V1alpha3TypedLocalObjectReferenceBuilder(this, item);
    }
  
    public N and() {
      return (N) V1alpha3WorkloadSpecFluent.this.withControllerRef(builder.build());
    }
    
    public N endControllerRef() {
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
      return (N) V1alpha3WorkloadSpecFluent.this.setToPodGroupTemplates(index, builder.build());
    }
    
    public N endPodGroupTemplate() {
      return and();
    }
    
  }
}