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

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1alpha2WorkloadSpecFluent<A extends io.kubernetes.client.openapi.models.V1alpha2WorkloadSpecFluent<A>> extends BaseFluent<A>{

  private V1alpha2TypedLocalObjectReferenceBuilder controllerRef;
  private ArrayList<V1alpha2PodGroupTemplateBuilder> podGroupTemplates;

  public V1alpha2WorkloadSpecFluent() {
  }
  
  public V1alpha2WorkloadSpecFluent(V1alpha2WorkloadSpec instance) {
    this.copyInstance(instance);
  }

  public A addAllToPodGroupTemplates(Collection<V1alpha2PodGroupTemplate> items) {
    if (this.podGroupTemplates == null) {
      this.podGroupTemplates = new ArrayList();
    }
    for (V1alpha2PodGroupTemplate item : items) {
        V1alpha2PodGroupTemplateBuilder builder = new V1alpha2PodGroupTemplateBuilder(item);
        this._visitables.get("podGroupTemplates").add(builder);
        this.podGroupTemplates.add(builder);
    }
    return (A) this;
  }
  
  public PodGroupTemplatesNested<A> addNewPodGroupTemplate() {
    return new PodGroupTemplatesNested(-1, null);
  }
  
  public PodGroupTemplatesNested<A> addNewPodGroupTemplateLike(V1alpha2PodGroupTemplate item) {
    return new PodGroupTemplatesNested(-1, item);
  }
  
  public A addToPodGroupTemplates(V1alpha2PodGroupTemplate... items) {
    if (this.podGroupTemplates == null) {
      this.podGroupTemplates = new ArrayList();
    }
    for (V1alpha2PodGroupTemplate item : items) {
        V1alpha2PodGroupTemplateBuilder builder = new V1alpha2PodGroupTemplateBuilder(item);
        this._visitables.get("podGroupTemplates").add(builder);
        this.podGroupTemplates.add(builder);
    }
    return (A) this;
  }
  
  public A addToPodGroupTemplates(int index,V1alpha2PodGroupTemplate item) {
    if (this.podGroupTemplates == null) {
      this.podGroupTemplates = new ArrayList();
    }
    V1alpha2PodGroupTemplateBuilder builder = new V1alpha2PodGroupTemplateBuilder(item);
    if (index < 0 || index >= this.podGroupTemplates.size()) {
        this._visitables.get("podGroupTemplates").add(builder);
        this.podGroupTemplates.add(builder);
    } else {
        this._visitables.get("podGroupTemplates").add(builder);
        this.podGroupTemplates.add(index, builder);
    }
    return (A) this;
  }
  
  public V1alpha2TypedLocalObjectReference buildControllerRef() {
    return this.controllerRef != null ? this.controllerRef.build() : null;
  }
  
  public V1alpha2PodGroupTemplate buildFirstPodGroupTemplate() {
    return this.podGroupTemplates.get(0).build();
  }
  
  public V1alpha2PodGroupTemplate buildLastPodGroupTemplate() {
    return this.podGroupTemplates.get(podGroupTemplates.size() - 1).build();
  }
  
  public V1alpha2PodGroupTemplate buildMatchingPodGroupTemplate(Predicate<V1alpha2PodGroupTemplateBuilder> predicate) {
      for (V1alpha2PodGroupTemplateBuilder item : podGroupTemplates) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public V1alpha2PodGroupTemplate buildPodGroupTemplate(int index) {
    return this.podGroupTemplates.get(index).build();
  }
  
  public List<V1alpha2PodGroupTemplate> buildPodGroupTemplates() {
    return this.podGroupTemplates != null ? build(podGroupTemplates) : null;
  }
  
  protected void copyInstance(V1alpha2WorkloadSpec instance) {
    instance = instance != null ? instance : new V1alpha2WorkloadSpec();
    if (instance != null) {
        this.withControllerRef(instance.getControllerRef());
        this.withPodGroupTemplates(instance.getPodGroupTemplates());
    }
  }
  
  public ControllerRefNested<A> editControllerRef() {
    return this.withNewControllerRefLike(Optional.ofNullable(this.buildControllerRef()).orElse(null));
  }
  
  public PodGroupTemplatesNested<A> editFirstPodGroupTemplate() {
    if (podGroupTemplates.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "podGroupTemplates"));
    }
    return this.setNewPodGroupTemplateLike(0, this.buildPodGroupTemplate(0));
  }
  
  public PodGroupTemplatesNested<A> editLastPodGroupTemplate() {
    int index = podGroupTemplates.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "podGroupTemplates"));
    }
    return this.setNewPodGroupTemplateLike(index, this.buildPodGroupTemplate(index));
  }
  
  public PodGroupTemplatesNested<A> editMatchingPodGroupTemplate(Predicate<V1alpha2PodGroupTemplateBuilder> predicate) {
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
    return this.withNewControllerRefLike(Optional.ofNullable(this.buildControllerRef()).orElse(new V1alpha2TypedLocalObjectReferenceBuilder().build()));
  }
  
  public ControllerRefNested<A> editOrNewControllerRefLike(V1alpha2TypedLocalObjectReference item) {
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
    V1alpha2WorkloadSpecFluent that = (V1alpha2WorkloadSpecFluent) o;
    if (!(Objects.equals(controllerRef, that.controllerRef))) {
      return false;
    }
    if (!(Objects.equals(podGroupTemplates, that.podGroupTemplates))) {
      return false;
    }
    return true;
  }
  
  public boolean hasControllerRef() {
    return this.controllerRef != null;
  }
  
  public boolean hasMatchingPodGroupTemplate(Predicate<V1alpha2PodGroupTemplateBuilder> predicate) {
      for (V1alpha2PodGroupTemplateBuilder item : podGroupTemplates) {
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
    return Objects.hash(controllerRef, podGroupTemplates);
  }
  
  public A removeAllFromPodGroupTemplates(Collection<V1alpha2PodGroupTemplate> items) {
    if (this.podGroupTemplates == null) {
      return (A) this;
    }
    for (V1alpha2PodGroupTemplate item : items) {
        V1alpha2PodGroupTemplateBuilder builder = new V1alpha2PodGroupTemplateBuilder(item);
        _visitables.get("podGroupTemplates").remove(builder);
        this.podGroupTemplates.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromPodGroupTemplates(V1alpha2PodGroupTemplate... items) {
    if (this.podGroupTemplates == null) {
      return (A) this;
    }
    for (V1alpha2PodGroupTemplate item : items) {
        V1alpha2PodGroupTemplateBuilder builder = new V1alpha2PodGroupTemplateBuilder(item);
        _visitables.get("podGroupTemplates").remove(builder);
        this.podGroupTemplates.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromPodGroupTemplates(Predicate<V1alpha2PodGroupTemplateBuilder> predicate) {
    if (podGroupTemplates == null) {
      return (A) this;
    }
    Iterator<V1alpha2PodGroupTemplateBuilder> each = podGroupTemplates.iterator();
    List visitables = this._visitables.get("podGroupTemplates");
    while (each.hasNext()) {
        V1alpha2PodGroupTemplateBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public PodGroupTemplatesNested<A> setNewPodGroupTemplateLike(int index,V1alpha2PodGroupTemplate item) {
    return new PodGroupTemplatesNested(index, item);
  }
  
  public A setToPodGroupTemplates(int index,V1alpha2PodGroupTemplate item) {
    if (this.podGroupTemplates == null) {
      this.podGroupTemplates = new ArrayList();
    }
    V1alpha2PodGroupTemplateBuilder builder = new V1alpha2PodGroupTemplateBuilder(item);
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
  
  public A withControllerRef(V1alpha2TypedLocalObjectReference controllerRef) {
    this._visitables.remove("controllerRef");
    if (controllerRef != null) {
        this.controllerRef = new V1alpha2TypedLocalObjectReferenceBuilder(controllerRef);
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
  
  public ControllerRefNested<A> withNewControllerRefLike(V1alpha2TypedLocalObjectReference item) {
    return new ControllerRefNested(item);
  }
  
  public A withPodGroupTemplates(List<V1alpha2PodGroupTemplate> podGroupTemplates) {
    if (this.podGroupTemplates != null) {
      this._visitables.get("podGroupTemplates").clear();
    }
    if (podGroupTemplates != null) {
        this.podGroupTemplates = new ArrayList();
        for (V1alpha2PodGroupTemplate item : podGroupTemplates) {
          this.addToPodGroupTemplates(item);
        }
    } else {
      this.podGroupTemplates = null;
    }
    return (A) this;
  }
  
  public A withPodGroupTemplates(V1alpha2PodGroupTemplate... podGroupTemplates) {
    if (this.podGroupTemplates != null) {
        this.podGroupTemplates.clear();
        _visitables.remove("podGroupTemplates");
    }
    if (podGroupTemplates != null) {
      for (V1alpha2PodGroupTemplate item : podGroupTemplates) {
        this.addToPodGroupTemplates(item);
      }
    }
    return (A) this;
  }
  public class ControllerRefNested<N> extends V1alpha2TypedLocalObjectReferenceFluent<ControllerRefNested<N>> implements Nested<N>{
  
    V1alpha2TypedLocalObjectReferenceBuilder builder;
  
    ControllerRefNested(V1alpha2TypedLocalObjectReference item) {
      this.builder = new V1alpha2TypedLocalObjectReferenceBuilder(this, item);
    }
  
    public N and() {
      return (N) V1alpha2WorkloadSpecFluent.this.withControllerRef(builder.build());
    }
    
    public N endControllerRef() {
      return and();
    }
    
  }
  public class PodGroupTemplatesNested<N> extends V1alpha2PodGroupTemplateFluent<PodGroupTemplatesNested<N>> implements Nested<N>{
  
    V1alpha2PodGroupTemplateBuilder builder;
    int index;
  
    PodGroupTemplatesNested(int index,V1alpha2PodGroupTemplate item) {
      this.index = index;
      this.builder = new V1alpha2PodGroupTemplateBuilder(this, item);
    }
  
    public N and() {
      return (N) V1alpha2WorkloadSpecFluent.this.setToPodGroupTemplates(index, builder.build());
    }
    
    public N endPodGroupTemplate() {
      return and();
    }
    
  }
}