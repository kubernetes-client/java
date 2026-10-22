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
public class V1beta1PodGroupSpecFluent<A extends V1beta1PodGroupSpecFluent<A>> extends BaseFluent<A>{

  private V1beta1DisruptionModeBuilder disruptionMode;
  private String parentCompositePodGroupName;
  private String preemptionPolicy;
  private Integer priority;
  private String priorityClassName;
  private ArrayList<V1beta1PodGroupResourceClaimBuilder> resourceClaims;
  private V1beta1PodGroupSchedulingConstraintsBuilder schedulingConstraints;
  private V1beta1PodGroupSchedulingPolicyBuilder schedulingPolicy;
  private V1beta1WorkloadReferenceBuilder workloadRef;

  public V1beta1PodGroupSpecFluent() {
  }
  
  public V1beta1PodGroupSpecFluent(V1beta1PodGroupSpec instance) {
    this.copyInstance(instance);
  }

  public A addAllToResourceClaims(Collection<V1beta1PodGroupResourceClaim> items) {
    if (this.resourceClaims == null) {
      this.resourceClaims = new ArrayList<>();
    }
    for (V1beta1PodGroupResourceClaim item : items) {
        V1beta1PodGroupResourceClaimBuilder builder = new V1beta1PodGroupResourceClaimBuilder(item);
        this._visitables.get("resourceClaims").add(builder);
        this.resourceClaims.add(builder);
    }
    return (A) this;
  }
  
  public ResourceClaimsNested<A> addNewResourceClaim() {
    return new ResourceClaimsNested<>(-1, null);
  }
  
  public ResourceClaimsNested<A> addNewResourceClaimLike(V1beta1PodGroupResourceClaim item) {
    return new ResourceClaimsNested<>(-1, item);
  }
  
  public A addToResourceClaims(V1beta1PodGroupResourceClaim... items) {
    if (this.resourceClaims == null) {
      this.resourceClaims = new ArrayList<>();
    }
    for (V1beta1PodGroupResourceClaim item : items) {
        V1beta1PodGroupResourceClaimBuilder builder = new V1beta1PodGroupResourceClaimBuilder(item);
        this._visitables.get("resourceClaims").add(builder);
        this.resourceClaims.add(builder);
    }
    return (A) this;
  }
  
  public A addToResourceClaims(int index,V1beta1PodGroupResourceClaim item) {
    if (this.resourceClaims == null) {
      this.resourceClaims = new ArrayList<>();
    }
    V1beta1PodGroupResourceClaimBuilder builder = new V1beta1PodGroupResourceClaimBuilder(item);
    if (index < 0 || index >= this.resourceClaims.size()) {
        this._visitables.get("resourceClaims").add(builder);
        this.resourceClaims.add(builder);
    } else {
        this._visitables.get("resourceClaims").add(builder);
        this.resourceClaims.add(index, builder);
    }
    return (A) this;
  }
  
  public V1beta1DisruptionMode buildDisruptionMode() {
    return this.disruptionMode != null ? this.disruptionMode.build() : null;
  }
  
  public V1beta1PodGroupResourceClaim buildFirstResourceClaim() {
    return this.resourceClaims.get(0).build();
  }
  
  public V1beta1PodGroupResourceClaim buildLastResourceClaim() {
    return this.resourceClaims.get(resourceClaims.size() - 1).build();
  }
  
  public V1beta1PodGroupResourceClaim buildMatchingResourceClaim(Predicate<V1beta1PodGroupResourceClaimBuilder> predicate) {
      for (V1beta1PodGroupResourceClaimBuilder item : resourceClaims) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public V1beta1PodGroupResourceClaim buildResourceClaim(int index) {
    return this.resourceClaims.get(index).build();
  }
  
  public List<V1beta1PodGroupResourceClaim> buildResourceClaims() {
    return this.resourceClaims != null ? build(resourceClaims) : null;
  }
  
  public V1beta1PodGroupSchedulingConstraints buildSchedulingConstraints() {
    return this.schedulingConstraints != null ? this.schedulingConstraints.build() : null;
  }
  
  public V1beta1PodGroupSchedulingPolicy buildSchedulingPolicy() {
    return this.schedulingPolicy != null ? this.schedulingPolicy.build() : null;
  }
  
  public V1beta1WorkloadReference buildWorkloadRef() {
    return this.workloadRef != null ? this.workloadRef.build() : null;
  }
  
  protected void copyInstance(V1beta1PodGroupSpec instance) {
    instance = instance != null ? instance : new V1beta1PodGroupSpec();
    if (instance != null) {
        this.withDisruptionMode(instance.getDisruptionMode());
        this.withParentCompositePodGroupName(instance.getParentCompositePodGroupName());
        this.withPreemptionPolicy(instance.getPreemptionPolicy());
        this.withPriority(instance.getPriority());
        this.withPriorityClassName(instance.getPriorityClassName());
        this.withResourceClaims(instance.getResourceClaims());
        this.withSchedulingConstraints(instance.getSchedulingConstraints());
        this.withSchedulingPolicy(instance.getSchedulingPolicy());
        this.withWorkloadRef(instance.getWorkloadRef());
    }
  }
  
  public DisruptionModeNested<A> editDisruptionMode() {
    return this.withNewDisruptionModeLike(Optional.ofNullable(this.buildDisruptionMode()).orElse(null));
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
  
  public ResourceClaimsNested<A> editMatchingResourceClaim(Predicate<V1beta1PodGroupResourceClaimBuilder> predicate) {
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
  
  public DisruptionModeNested<A> editOrNewDisruptionMode() {
    return this.withNewDisruptionModeLike(Optional.ofNullable(this.buildDisruptionMode()).orElse(new V1beta1DisruptionModeBuilder().build()));
  }
  
  public DisruptionModeNested<A> editOrNewDisruptionModeLike(V1beta1DisruptionMode item) {
    return this.withNewDisruptionModeLike(Optional.ofNullable(this.buildDisruptionMode()).orElse(item));
  }
  
  public SchedulingConstraintsNested<A> editOrNewSchedulingConstraints() {
    return this.withNewSchedulingConstraintsLike(Optional.ofNullable(this.buildSchedulingConstraints()).orElse(new V1beta1PodGroupSchedulingConstraintsBuilder().build()));
  }
  
  public SchedulingConstraintsNested<A> editOrNewSchedulingConstraintsLike(V1beta1PodGroupSchedulingConstraints item) {
    return this.withNewSchedulingConstraintsLike(Optional.ofNullable(this.buildSchedulingConstraints()).orElse(item));
  }
  
  public SchedulingPolicyNested<A> editOrNewSchedulingPolicy() {
    return this.withNewSchedulingPolicyLike(Optional.ofNullable(this.buildSchedulingPolicy()).orElse(new V1beta1PodGroupSchedulingPolicyBuilder().build()));
  }
  
  public SchedulingPolicyNested<A> editOrNewSchedulingPolicyLike(V1beta1PodGroupSchedulingPolicy item) {
    return this.withNewSchedulingPolicyLike(Optional.ofNullable(this.buildSchedulingPolicy()).orElse(item));
  }
  
  public WorkloadRefNested<A> editOrNewWorkloadRef() {
    return this.withNewWorkloadRefLike(Optional.ofNullable(this.buildWorkloadRef()).orElse(new V1beta1WorkloadReferenceBuilder().build()));
  }
  
  public WorkloadRefNested<A> editOrNewWorkloadRefLike(V1beta1WorkloadReference item) {
    return this.withNewWorkloadRefLike(Optional.ofNullable(this.buildWorkloadRef()).orElse(item));
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
  
  public WorkloadRefNested<A> editWorkloadRef() {
    return this.withNewWorkloadRefLike(Optional.ofNullable(this.buildWorkloadRef()).orElse(null));
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
    V1beta1PodGroupSpecFluent<?> that = (V1beta1PodGroupSpecFluent<?>) o;
    if (!(Objects.equals(disruptionMode, that.disruptionMode))) {
      return false;
    }
    if (!(Objects.equals(parentCompositePodGroupName, that.parentCompositePodGroupName))) {
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
    if (!(Objects.equals(resourceClaims, that.resourceClaims))) {
      return false;
    }
    if (!(Objects.equals(schedulingConstraints, that.schedulingConstraints))) {
      return false;
    }
    if (!(Objects.equals(schedulingPolicy, that.schedulingPolicy))) {
      return false;
    }
    if (!(Objects.equals(workloadRef, that.workloadRef))) {
      return false;
    }
    return true;
  }
  
  public String getParentCompositePodGroupName() {
    return this.parentCompositePodGroupName;
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
  
  public boolean hasDisruptionMode() {
    return this.disruptionMode != null;
  }
  
  public boolean hasMatchingResourceClaim(Predicate<V1beta1PodGroupResourceClaimBuilder> predicate) {
      for (V1beta1PodGroupResourceClaimBuilder item : resourceClaims) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasParentCompositePodGroupName() {
    return this.parentCompositePodGroupName != null;
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
  
  public boolean hasResourceClaims() {
    return this.resourceClaims != null && !(this.resourceClaims.isEmpty());
  }
  
  public boolean hasSchedulingConstraints() {
    return this.schedulingConstraints != null;
  }
  
  public boolean hasSchedulingPolicy() {
    return this.schedulingPolicy != null;
  }
  
  public boolean hasWorkloadRef() {
    return this.workloadRef != null;
  }
  
  public int hashCode() {
    return Objects.hash(disruptionMode, parentCompositePodGroupName, preemptionPolicy, priority, priorityClassName, resourceClaims, schedulingConstraints, schedulingPolicy, workloadRef);
  }
  
  public A removeAllFromResourceClaims(Collection<V1beta1PodGroupResourceClaim> items) {
    if (this.resourceClaims == null) {
      return (A) this;
    }
    for (V1beta1PodGroupResourceClaim item : items) {
        V1beta1PodGroupResourceClaimBuilder builder = new V1beta1PodGroupResourceClaimBuilder(item);
        _visitables.get("resourceClaims").remove(builder);
        this.resourceClaims.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromResourceClaims(V1beta1PodGroupResourceClaim... items) {
    if (this.resourceClaims == null) {
      return (A) this;
    }
    for (V1beta1PodGroupResourceClaim item : items) {
        V1beta1PodGroupResourceClaimBuilder builder = new V1beta1PodGroupResourceClaimBuilder(item);
        _visitables.get("resourceClaims").remove(builder);
        this.resourceClaims.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromResourceClaims(Predicate<V1beta1PodGroupResourceClaimBuilder> predicate) {
    if (resourceClaims == null) {
      return (A) this;
    }
    Iterator<V1beta1PodGroupResourceClaimBuilder> each = resourceClaims.iterator();
    @SuppressWarnings({"rawtypes"})
    List visitables = this._visitables.get("resourceClaims");
    while (each.hasNext()) {
        V1beta1PodGroupResourceClaimBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public ResourceClaimsNested<A> setNewResourceClaimLike(int index,V1beta1PodGroupResourceClaim item) {
    return new ResourceClaimsNested<>(index, item);
  }
  
  public A setToResourceClaims(int index,V1beta1PodGroupResourceClaim item) {
    if (this.resourceClaims == null) {
      this.resourceClaims = new ArrayList<>();
    }
    V1beta1PodGroupResourceClaimBuilder builder = new V1beta1PodGroupResourceClaimBuilder(item);
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
    if (!(parentCompositePodGroupName == null)) {
        sb.append("parentCompositePodGroupName:");
        sb.append(parentCompositePodGroupName);
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
        sb.append(",");
    }
    if (!(workloadRef == null)) {
        sb.append("workloadRef:");
        sb.append(workloadRef);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withDisruptionMode(V1beta1DisruptionMode disruptionMode) {
    this._visitables.remove("disruptionMode");
    if (disruptionMode != null) {
        this.disruptionMode = new V1beta1DisruptionModeBuilder(disruptionMode);
        this._visitables.get("disruptionMode").add(this.disruptionMode);
    } else {
        this._visitables.get("disruptionMode").remove(this.disruptionMode);
        this.disruptionMode = null;
    }
    return (A) this;
  }
  
  public DisruptionModeNested<A> withNewDisruptionMode() {
    return new DisruptionModeNested<>(null);
  }
  
  public DisruptionModeNested<A> withNewDisruptionModeLike(V1beta1DisruptionMode item) {
    return new DisruptionModeNested<>(item);
  }
  
  public SchedulingConstraintsNested<A> withNewSchedulingConstraints() {
    return new SchedulingConstraintsNested<>(null);
  }
  
  public SchedulingConstraintsNested<A> withNewSchedulingConstraintsLike(V1beta1PodGroupSchedulingConstraints item) {
    return new SchedulingConstraintsNested<>(item);
  }
  
  public SchedulingPolicyNested<A> withNewSchedulingPolicy() {
    return new SchedulingPolicyNested<>(null);
  }
  
  public SchedulingPolicyNested<A> withNewSchedulingPolicyLike(V1beta1PodGroupSchedulingPolicy item) {
    return new SchedulingPolicyNested<>(item);
  }
  
  public WorkloadRefNested<A> withNewWorkloadRef() {
    return new WorkloadRefNested<>(null);
  }
  
  public WorkloadRefNested<A> withNewWorkloadRefLike(V1beta1WorkloadReference item) {
    return new WorkloadRefNested<>(item);
  }
  
  public A withParentCompositePodGroupName(String parentCompositePodGroupName) {
    this.parentCompositePodGroupName = parentCompositePodGroupName;
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
  
  public A withResourceClaims(List<V1beta1PodGroupResourceClaim> resourceClaims) {
    if (this.resourceClaims != null) {
      this._visitables.get("resourceClaims").clear();
    }
    if (resourceClaims != null) {
        this.resourceClaims = new ArrayList<>();
        for (V1beta1PodGroupResourceClaim item : resourceClaims) {
          this.addToResourceClaims(item);
        }
    } else {
      this.resourceClaims = null;
    }
    return (A) this;
  }
  
  public A withResourceClaims(V1beta1PodGroupResourceClaim... resourceClaims) {
    if (this.resourceClaims != null) {
        this.resourceClaims.clear();
        _visitables.remove("resourceClaims");
    }
    if (resourceClaims != null) {
      for (V1beta1PodGroupResourceClaim item : resourceClaims) {
        this.addToResourceClaims(item);
      }
    }
    return (A) this;
  }
  
  public A withSchedulingConstraints(V1beta1PodGroupSchedulingConstraints schedulingConstraints) {
    this._visitables.remove("schedulingConstraints");
    if (schedulingConstraints != null) {
        this.schedulingConstraints = new V1beta1PodGroupSchedulingConstraintsBuilder(schedulingConstraints);
        this._visitables.get("schedulingConstraints").add(this.schedulingConstraints);
    } else {
        this._visitables.get("schedulingConstraints").remove(this.schedulingConstraints);
        this.schedulingConstraints = null;
    }
    return (A) this;
  }
  
  public A withSchedulingPolicy(V1beta1PodGroupSchedulingPolicy schedulingPolicy) {
    this._visitables.remove("schedulingPolicy");
    if (schedulingPolicy != null) {
        this.schedulingPolicy = new V1beta1PodGroupSchedulingPolicyBuilder(schedulingPolicy);
        this._visitables.get("schedulingPolicy").add(this.schedulingPolicy);
    } else {
        this._visitables.get("schedulingPolicy").remove(this.schedulingPolicy);
        this.schedulingPolicy = null;
    }
    return (A) this;
  }
  
  public A withWorkloadRef(V1beta1WorkloadReference workloadRef) {
    this._visitables.remove("workloadRef");
    if (workloadRef != null) {
        this.workloadRef = new V1beta1WorkloadReferenceBuilder(workloadRef);
        this._visitables.get("workloadRef").add(this.workloadRef);
    } else {
        this._visitables.get("workloadRef").remove(this.workloadRef);
        this.workloadRef = null;
    }
    return (A) this;
  }
  public class DisruptionModeNested<N> extends V1beta1DisruptionModeFluent<DisruptionModeNested<N>> implements Nested<N>{
  
    V1beta1DisruptionModeBuilder builder;
  
    DisruptionModeNested(V1beta1DisruptionMode item) {
      this.builder = new V1beta1DisruptionModeBuilder(this, item);
    }
  
    public N and() {
      return (N) V1beta1PodGroupSpecFluent.this.withDisruptionMode(builder.build());
    }
    
    public N endDisruptionMode() {
      return and();
    }
    
  }
  public class ResourceClaimsNested<N> extends V1beta1PodGroupResourceClaimFluent<ResourceClaimsNested<N>> implements Nested<N>{
  
    V1beta1PodGroupResourceClaimBuilder builder;
    int index;
  
    ResourceClaimsNested(int index,V1beta1PodGroupResourceClaim item) {
      this.index = index;
      this.builder = new V1beta1PodGroupResourceClaimBuilder(this, item);
    }
  
    public N and() {
      return (N) V1beta1PodGroupSpecFluent.this.setToResourceClaims(index, builder.build());
    }
    
    public N endResourceClaim() {
      return and();
    }
    
  }
  public class SchedulingConstraintsNested<N> extends V1beta1PodGroupSchedulingConstraintsFluent<SchedulingConstraintsNested<N>> implements Nested<N>{
  
    V1beta1PodGroupSchedulingConstraintsBuilder builder;
  
    SchedulingConstraintsNested(V1beta1PodGroupSchedulingConstraints item) {
      this.builder = new V1beta1PodGroupSchedulingConstraintsBuilder(this, item);
    }
  
    public N and() {
      return (N) V1beta1PodGroupSpecFluent.this.withSchedulingConstraints(builder.build());
    }
    
    public N endSchedulingConstraints() {
      return and();
    }
    
  }
  public class SchedulingPolicyNested<N> extends V1beta1PodGroupSchedulingPolicyFluent<SchedulingPolicyNested<N>> implements Nested<N>{
  
    V1beta1PodGroupSchedulingPolicyBuilder builder;
  
    SchedulingPolicyNested(V1beta1PodGroupSchedulingPolicy item) {
      this.builder = new V1beta1PodGroupSchedulingPolicyBuilder(this, item);
    }
  
    public N and() {
      return (N) V1beta1PodGroupSpecFluent.this.withSchedulingPolicy(builder.build());
    }
    
    public N endSchedulingPolicy() {
      return and();
    }
    
  }
  public class WorkloadRefNested<N> extends V1beta1WorkloadReferenceFluent<WorkloadRefNested<N>> implements Nested<N>{
  
    V1beta1WorkloadReferenceBuilder builder;
  
    WorkloadRefNested(V1beta1WorkloadReference item) {
      this.builder = new V1beta1WorkloadReferenceBuilder(this, item);
    }
  
    public N and() {
      return (N) V1beta1PodGroupSpecFluent.this.withWorkloadRef(builder.build());
    }
    
    public N endWorkloadRef() {
      return and();
    }
    
  }
}