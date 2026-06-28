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

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1alpha2PodGroupSpecFluent<A extends io.kubernetes.client.openapi.models.V1alpha2PodGroupSpecFluent<A>> extends BaseFluent<A>{

  private String disruptionMode;
  private V1alpha2PodGroupTemplateReferenceBuilder podGroupTemplateRef;
  private Integer priority;
  private String priorityClassName;
  private ArrayList<V1alpha2PodGroupResourceClaimBuilder> resourceClaims;
  private V1alpha2PodGroupSchedulingConstraintsBuilder schedulingConstraints;
  private V1alpha2PodGroupSchedulingPolicyBuilder schedulingPolicy;

  public V1alpha2PodGroupSpecFluent() {
  }
  
  public V1alpha2PodGroupSpecFluent(V1alpha2PodGroupSpec instance) {
    this.copyInstance(instance);
  }

  public A addAllToResourceClaims(Collection<V1alpha2PodGroupResourceClaim> items) {
    if (this.resourceClaims == null) {
      this.resourceClaims = new ArrayList();
    }
    for (V1alpha2PodGroupResourceClaim item : items) {
        V1alpha2PodGroupResourceClaimBuilder builder = new V1alpha2PodGroupResourceClaimBuilder(item);
        this._visitables.get("resourceClaims").add(builder);
        this.resourceClaims.add(builder);
    }
    return (A) this;
  }
  
  public ResourceClaimsNested<A> addNewResourceClaim() {
    return new ResourceClaimsNested(-1, null);
  }
  
  public ResourceClaimsNested<A> addNewResourceClaimLike(V1alpha2PodGroupResourceClaim item) {
    return new ResourceClaimsNested(-1, item);
  }
  
  public A addToResourceClaims(V1alpha2PodGroupResourceClaim... items) {
    if (this.resourceClaims == null) {
      this.resourceClaims = new ArrayList();
    }
    for (V1alpha2PodGroupResourceClaim item : items) {
        V1alpha2PodGroupResourceClaimBuilder builder = new V1alpha2PodGroupResourceClaimBuilder(item);
        this._visitables.get("resourceClaims").add(builder);
        this.resourceClaims.add(builder);
    }
    return (A) this;
  }
  
  public A addToResourceClaims(int index,V1alpha2PodGroupResourceClaim item) {
    if (this.resourceClaims == null) {
      this.resourceClaims = new ArrayList();
    }
    V1alpha2PodGroupResourceClaimBuilder builder = new V1alpha2PodGroupResourceClaimBuilder(item);
    if (index < 0 || index >= this.resourceClaims.size()) {
        this._visitables.get("resourceClaims").add(builder);
        this.resourceClaims.add(builder);
    } else {
        this._visitables.get("resourceClaims").add(builder);
        this.resourceClaims.add(index, builder);
    }
    return (A) this;
  }
  
  public V1alpha2PodGroupResourceClaim buildFirstResourceClaim() {
    return this.resourceClaims.get(0).build();
  }
  
  public V1alpha2PodGroupResourceClaim buildLastResourceClaim() {
    return this.resourceClaims.get(resourceClaims.size() - 1).build();
  }
  
  public V1alpha2PodGroupResourceClaim buildMatchingResourceClaim(Predicate<V1alpha2PodGroupResourceClaimBuilder> predicate) {
      for (V1alpha2PodGroupResourceClaimBuilder item : resourceClaims) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public V1alpha2PodGroupTemplateReference buildPodGroupTemplateRef() {
    return this.podGroupTemplateRef != null ? this.podGroupTemplateRef.build() : null;
  }
  
  public V1alpha2PodGroupResourceClaim buildResourceClaim(int index) {
    return this.resourceClaims.get(index).build();
  }
  
  public List<V1alpha2PodGroupResourceClaim> buildResourceClaims() {
    return this.resourceClaims != null ? build(resourceClaims) : null;
  }
  
  public V1alpha2PodGroupSchedulingConstraints buildSchedulingConstraints() {
    return this.schedulingConstraints != null ? this.schedulingConstraints.build() : null;
  }
  
  public V1alpha2PodGroupSchedulingPolicy buildSchedulingPolicy() {
    return this.schedulingPolicy != null ? this.schedulingPolicy.build() : null;
  }
  
  protected void copyInstance(V1alpha2PodGroupSpec instance) {
    instance = instance != null ? instance : new V1alpha2PodGroupSpec();
    if (instance != null) {
        this.withDisruptionMode(instance.getDisruptionMode());
        this.withPodGroupTemplateRef(instance.getPodGroupTemplateRef());
        this.withPriority(instance.getPriority());
        this.withPriorityClassName(instance.getPriorityClassName());
        this.withResourceClaims(instance.getResourceClaims());
        this.withSchedulingConstraints(instance.getSchedulingConstraints());
        this.withSchedulingPolicy(instance.getSchedulingPolicy());
    }
  }
  
  public ResourceClaimsNested<A> editFirstResourceClaim() {
    if (resourceClaims.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "resourceClaims"));
    }
    return this.setNewResourceClaimLike(0, this.buildResourceClaim(0));
  }
  
  public ResourceClaimsNested<A> editLastResourceClaim() {
    int index = resourceClaims.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "resourceClaims"));
    }
    return this.setNewResourceClaimLike(index, this.buildResourceClaim(index));
  }
  
  public ResourceClaimsNested<A> editMatchingResourceClaim(Predicate<V1alpha2PodGroupResourceClaimBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < resourceClaims.size();i++) {
      if (predicate.test(resourceClaims.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "resourceClaims"));
    }
    return this.setNewResourceClaimLike(index, this.buildResourceClaim(index));
  }
  
  public PodGroupTemplateRefNested<A> editOrNewPodGroupTemplateRef() {
    return this.withNewPodGroupTemplateRefLike(Optional.ofNullable(this.buildPodGroupTemplateRef()).orElse(new V1alpha2PodGroupTemplateReferenceBuilder().build()));
  }
  
  public PodGroupTemplateRefNested<A> editOrNewPodGroupTemplateRefLike(V1alpha2PodGroupTemplateReference item) {
    return this.withNewPodGroupTemplateRefLike(Optional.ofNullable(this.buildPodGroupTemplateRef()).orElse(item));
  }
  
  public SchedulingConstraintsNested<A> editOrNewSchedulingConstraints() {
    return this.withNewSchedulingConstraintsLike(Optional.ofNullable(this.buildSchedulingConstraints()).orElse(new V1alpha2PodGroupSchedulingConstraintsBuilder().build()));
  }
  
  public SchedulingConstraintsNested<A> editOrNewSchedulingConstraintsLike(V1alpha2PodGroupSchedulingConstraints item) {
    return this.withNewSchedulingConstraintsLike(Optional.ofNullable(this.buildSchedulingConstraints()).orElse(item));
  }
  
  public SchedulingPolicyNested<A> editOrNewSchedulingPolicy() {
    return this.withNewSchedulingPolicyLike(Optional.ofNullable(this.buildSchedulingPolicy()).orElse(new V1alpha2PodGroupSchedulingPolicyBuilder().build()));
  }
  
  public SchedulingPolicyNested<A> editOrNewSchedulingPolicyLike(V1alpha2PodGroupSchedulingPolicy item) {
    return this.withNewSchedulingPolicyLike(Optional.ofNullable(this.buildSchedulingPolicy()).orElse(item));
  }
  
  public PodGroupTemplateRefNested<A> editPodGroupTemplateRef() {
    return this.withNewPodGroupTemplateRefLike(Optional.ofNullable(this.buildPodGroupTemplateRef()).orElse(null));
  }
  
  public ResourceClaimsNested<A> editResourceClaim(int index) {
    if (resourceClaims.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "resourceClaims"));
    }
    return this.setNewResourceClaimLike(index, this.buildResourceClaim(index));
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
    V1alpha2PodGroupSpecFluent that = (V1alpha2PodGroupSpecFluent) o;
    if (!(Objects.equals(disruptionMode, that.disruptionMode))) {
      return false;
    }
    if (!(Objects.equals(podGroupTemplateRef, that.podGroupTemplateRef))) {
      return false;
    }
    if (!(Objects.equals(priority, that.priority))) {
      return false;
    }
    if (!(Objects.equals(priorityClassName, that.priorityClassName))) {
      return false;
    }
    if (!(Objects.equals(resourceClaims, that.resourceClaims))) {
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
  
  public String getDisruptionMode() {
    return this.disruptionMode;
  }
  
  public Integer getPriority() {
    return this.priority;
  }
  
  public String getPriorityClassName() {
    return this.priorityClassName;
  }
  
  public boolean hasDisruptionMode() {
    return this.disruptionMode != null;
  }
  
  public boolean hasMatchingResourceClaim(Predicate<V1alpha2PodGroupResourceClaimBuilder> predicate) {
      for (V1alpha2PodGroupResourceClaimBuilder item : resourceClaims) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasPodGroupTemplateRef() {
    return this.podGroupTemplateRef != null;
  }
  
  public boolean hasPriority() {
    return this.priority != null;
  }
  
  public boolean hasPriorityClassName() {
    return this.priorityClassName != null;
  }
  
  public boolean hasResourceClaims() {
    return this.resourceClaims != null && !(this.resourceClaims.isEmpty());
  }
  
  public boolean hasSchedulingConstraints() {
    return this.schedulingConstraints != null;
  }
  
  public boolean hasSchedulingPolicy() {
    return this.schedulingPolicy != null;
  }
  
  public int hashCode() {
    return Objects.hash(disruptionMode, podGroupTemplateRef, priority, priorityClassName, resourceClaims, schedulingConstraints, schedulingPolicy);
  }
  
  public A removeAllFromResourceClaims(Collection<V1alpha2PodGroupResourceClaim> items) {
    if (this.resourceClaims == null) {
      return (A) this;
    }
    for (V1alpha2PodGroupResourceClaim item : items) {
        V1alpha2PodGroupResourceClaimBuilder builder = new V1alpha2PodGroupResourceClaimBuilder(item);
        _visitables.get("resourceClaims").remove(builder);
        this.resourceClaims.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromResourceClaims(V1alpha2PodGroupResourceClaim... items) {
    if (this.resourceClaims == null) {
      return (A) this;
    }
    for (V1alpha2PodGroupResourceClaim item : items) {
        V1alpha2PodGroupResourceClaimBuilder builder = new V1alpha2PodGroupResourceClaimBuilder(item);
        _visitables.get("resourceClaims").remove(builder);
        this.resourceClaims.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromResourceClaims(Predicate<V1alpha2PodGroupResourceClaimBuilder> predicate) {
    if (resourceClaims == null) {
      return (A) this;
    }
    Iterator<V1alpha2PodGroupResourceClaimBuilder> each = resourceClaims.iterator();
    List visitables = this._visitables.get("resourceClaims");
    while (each.hasNext()) {
        V1alpha2PodGroupResourceClaimBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public ResourceClaimsNested<A> setNewResourceClaimLike(int index,V1alpha2PodGroupResourceClaim item) {
    return new ResourceClaimsNested(index, item);
  }
  
  public A setToResourceClaims(int index,V1alpha2PodGroupResourceClaim item) {
    if (this.resourceClaims == null) {
      this.resourceClaims = new ArrayList();
    }
    V1alpha2PodGroupResourceClaimBuilder builder = new V1alpha2PodGroupResourceClaimBuilder(item);
    if (index < 0 || index >= this.resourceClaims.size()) {
        this._visitables.get("resourceClaims").add(builder);
        this.resourceClaims.add(builder);
    } else {
        this._visitables.get("resourceClaims").add(builder);
        this.resourceClaims.set(index, builder);
    }
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(disruptionMode == null)) {
        sb.append("disruptionMode:");
        sb.append(disruptionMode);
        sb.append(",");
    }
    if (!(podGroupTemplateRef == null)) {
        sb.append("podGroupTemplateRef:");
        sb.append(podGroupTemplateRef);
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
    if (!(resourceClaims == null) && !(resourceClaims.isEmpty())) {
        sb.append("resourceClaims:");
        sb.append(resourceClaims);
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
  
  public A withDisruptionMode(String disruptionMode) {
    this.disruptionMode = disruptionMode;
    return (A) this;
  }
  
  public PodGroupTemplateRefNested<A> withNewPodGroupTemplateRef() {
    return new PodGroupTemplateRefNested(null);
  }
  
  public PodGroupTemplateRefNested<A> withNewPodGroupTemplateRefLike(V1alpha2PodGroupTemplateReference item) {
    return new PodGroupTemplateRefNested(item);
  }
  
  public SchedulingConstraintsNested<A> withNewSchedulingConstraints() {
    return new SchedulingConstraintsNested(null);
  }
  
  public SchedulingConstraintsNested<A> withNewSchedulingConstraintsLike(V1alpha2PodGroupSchedulingConstraints item) {
    return new SchedulingConstraintsNested(item);
  }
  
  public SchedulingPolicyNested<A> withNewSchedulingPolicy() {
    return new SchedulingPolicyNested(null);
  }
  
  public SchedulingPolicyNested<A> withNewSchedulingPolicyLike(V1alpha2PodGroupSchedulingPolicy item) {
    return new SchedulingPolicyNested(item);
  }
  
  public A withPodGroupTemplateRef(V1alpha2PodGroupTemplateReference podGroupTemplateRef) {
    this._visitables.remove("podGroupTemplateRef");
    if (podGroupTemplateRef != null) {
        this.podGroupTemplateRef = new V1alpha2PodGroupTemplateReferenceBuilder(podGroupTemplateRef);
        this._visitables.get("podGroupTemplateRef").add(this.podGroupTemplateRef);
    } else {
        this.podGroupTemplateRef = null;
        this._visitables.get("podGroupTemplateRef").remove(this.podGroupTemplateRef);
    }
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
  
  public A withResourceClaims(List<V1alpha2PodGroupResourceClaim> resourceClaims) {
    if (this.resourceClaims != null) {
      this._visitables.get("resourceClaims").clear();
    }
    if (resourceClaims != null) {
        this.resourceClaims = new ArrayList();
        for (V1alpha2PodGroupResourceClaim item : resourceClaims) {
          this.addToResourceClaims(item);
        }
    } else {
      this.resourceClaims = null;
    }
    return (A) this;
  }
  
  public A withResourceClaims(V1alpha2PodGroupResourceClaim... resourceClaims) {
    if (this.resourceClaims != null) {
        this.resourceClaims.clear();
        _visitables.remove("resourceClaims");
    }
    if (resourceClaims != null) {
      for (V1alpha2PodGroupResourceClaim item : resourceClaims) {
        this.addToResourceClaims(item);
      }
    }
    return (A) this;
  }
  
  public A withSchedulingConstraints(V1alpha2PodGroupSchedulingConstraints schedulingConstraints) {
    this._visitables.remove("schedulingConstraints");
    if (schedulingConstraints != null) {
        this.schedulingConstraints = new V1alpha2PodGroupSchedulingConstraintsBuilder(schedulingConstraints);
        this._visitables.get("schedulingConstraints").add(this.schedulingConstraints);
    } else {
        this.schedulingConstraints = null;
        this._visitables.get("schedulingConstraints").remove(this.schedulingConstraints);
    }
    return (A) this;
  }
  
  public A withSchedulingPolicy(V1alpha2PodGroupSchedulingPolicy schedulingPolicy) {
    this._visitables.remove("schedulingPolicy");
    if (schedulingPolicy != null) {
        this.schedulingPolicy = new V1alpha2PodGroupSchedulingPolicyBuilder(schedulingPolicy);
        this._visitables.get("schedulingPolicy").add(this.schedulingPolicy);
    } else {
        this.schedulingPolicy = null;
        this._visitables.get("schedulingPolicy").remove(this.schedulingPolicy);
    }
    return (A) this;
  }
  public class PodGroupTemplateRefNested<N> extends V1alpha2PodGroupTemplateReferenceFluent<PodGroupTemplateRefNested<N>> implements Nested<N>{
  
    V1alpha2PodGroupTemplateReferenceBuilder builder;
  
    PodGroupTemplateRefNested(V1alpha2PodGroupTemplateReference item) {
      this.builder = new V1alpha2PodGroupTemplateReferenceBuilder(this, item);
    }
  
    public N and() {
      return (N) V1alpha2PodGroupSpecFluent.this.withPodGroupTemplateRef(builder.build());
    }
    
    public N endPodGroupTemplateRef() {
      return and();
    }
    
  }
  public class ResourceClaimsNested<N> extends V1alpha2PodGroupResourceClaimFluent<ResourceClaimsNested<N>> implements Nested<N>{
  
    V1alpha2PodGroupResourceClaimBuilder builder;
    int index;
  
    ResourceClaimsNested(int index,V1alpha2PodGroupResourceClaim item) {
      this.index = index;
      this.builder = new V1alpha2PodGroupResourceClaimBuilder(this, item);
    }
  
    public N and() {
      return (N) V1alpha2PodGroupSpecFluent.this.setToResourceClaims(index, builder.build());
    }
    
    public N endResourceClaim() {
      return and();
    }
    
  }
  public class SchedulingConstraintsNested<N> extends V1alpha2PodGroupSchedulingConstraintsFluent<SchedulingConstraintsNested<N>> implements Nested<N>{
  
    V1alpha2PodGroupSchedulingConstraintsBuilder builder;
  
    SchedulingConstraintsNested(V1alpha2PodGroupSchedulingConstraints item) {
      this.builder = new V1alpha2PodGroupSchedulingConstraintsBuilder(this, item);
    }
  
    public N and() {
      return (N) V1alpha2PodGroupSpecFluent.this.withSchedulingConstraints(builder.build());
    }
    
    public N endSchedulingConstraints() {
      return and();
    }
    
  }
  public class SchedulingPolicyNested<N> extends V1alpha2PodGroupSchedulingPolicyFluent<SchedulingPolicyNested<N>> implements Nested<N>{
  
    V1alpha2PodGroupSchedulingPolicyBuilder builder;
  
    SchedulingPolicyNested(V1alpha2PodGroupSchedulingPolicy item) {
      this.builder = new V1alpha2PodGroupSchedulingPolicyBuilder(this, item);
    }
  
    public N and() {
      return (N) V1alpha2PodGroupSpecFluent.this.withSchedulingPolicy(builder.build());
    }
    
    public N endSchedulingPolicy() {
      return and();
    }
    
  }
}