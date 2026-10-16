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
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.processing.Generated;

/**
 * Generated
 */
@Generated("io.sundr:builder-annotations")
@SuppressWarnings({"unchecked"})
public class V1alpha3CompositePodGroupSpecFluent<A extends V1alpha3CompositePodGroupSpecFluent<A>> extends BaseFluent<A>{

  private V1alpha3CompositeDisruptionModeBuilder disruptionMode;
  private String parentCompositePodGroupName;
  private String preemptionPolicy;
  private Integer priority;
  private String priorityClassName;
  private V1alpha3CompositePodGroupSchedulingConstraintsBuilder schedulingConstraints;
  private V1alpha3CompositePodGroupSchedulingPolicyBuilder schedulingPolicy;
  private V1alpha3WorkloadReferenceBuilder workloadRef;

  public V1alpha3CompositePodGroupSpecFluent() {
  }
  
  public V1alpha3CompositePodGroupSpecFluent(V1alpha3CompositePodGroupSpec instance) {
    this.copyInstance(instance);
  }

  public V1alpha3CompositeDisruptionMode buildDisruptionMode() {
    return this.disruptionMode != null ? this.disruptionMode.build() : null;
  }
  
  public V1alpha3CompositePodGroupSchedulingConstraints buildSchedulingConstraints() {
    return this.schedulingConstraints != null ? this.schedulingConstraints.build() : null;
  }
  
  public V1alpha3CompositePodGroupSchedulingPolicy buildSchedulingPolicy() {
    return this.schedulingPolicy != null ? this.schedulingPolicy.build() : null;
  }
  
  public V1alpha3WorkloadReference buildWorkloadRef() {
    return this.workloadRef != null ? this.workloadRef.build() : null;
  }
  
  protected void copyInstance(V1alpha3CompositePodGroupSpec instance) {
    instance = instance != null ? instance : new V1alpha3CompositePodGroupSpec();
    if (instance != null) {
        this.withDisruptionMode(instance.getDisruptionMode());
        this.withParentCompositePodGroupName(instance.getParentCompositePodGroupName());
        this.withPreemptionPolicy(instance.getPreemptionPolicy());
        this.withPriority(instance.getPriority());
        this.withPriorityClassName(instance.getPriorityClassName());
        this.withSchedulingConstraints(instance.getSchedulingConstraints());
        this.withSchedulingPolicy(instance.getSchedulingPolicy());
        this.withWorkloadRef(instance.getWorkloadRef());
    }
  }
  
  public DisruptionModeNested<A> editDisruptionMode() {
    return this.withNewDisruptionModeLike(Optional.ofNullable(this.buildDisruptionMode()).orElse(null));
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
  
  public WorkloadRefNested<A> editOrNewWorkloadRef() {
    return this.withNewWorkloadRefLike(Optional.ofNullable(this.buildWorkloadRef()).orElse(new V1alpha3WorkloadReferenceBuilder().build()));
  }
  
  public WorkloadRefNested<A> editOrNewWorkloadRefLike(V1alpha3WorkloadReference item) {
    return this.withNewWorkloadRefLike(Optional.ofNullable(this.buildWorkloadRef()).orElse(item));
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
    V1alpha3CompositePodGroupSpecFluent<?> that = (V1alpha3CompositePodGroupSpecFluent<?>) o;
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
    return Objects.hash(disruptionMode, parentCompositePodGroupName, preemptionPolicy, priority, priorityClassName, schedulingConstraints, schedulingPolicy, workloadRef);
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
  
  public WorkloadRefNested<A> withNewWorkloadRef() {
    return new WorkloadRefNested<>(null);
  }
  
  public WorkloadRefNested<A> withNewWorkloadRefLike(V1alpha3WorkloadReference item) {
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
  
  public A withWorkloadRef(V1alpha3WorkloadReference workloadRef) {
    this._visitables.remove("workloadRef");
    if (workloadRef != null) {
        this.workloadRef = new V1alpha3WorkloadReferenceBuilder(workloadRef);
        this._visitables.get("workloadRef").add(this.workloadRef);
    } else {
        this._visitables.get("workloadRef").remove(this.workloadRef);
        this.workloadRef = null;
    }
    return (A) this;
  }
  public class DisruptionModeNested<N> extends V1alpha3CompositeDisruptionModeFluent<DisruptionModeNested<N>> implements Nested<N>{
  
    V1alpha3CompositeDisruptionModeBuilder builder;
  
    DisruptionModeNested(V1alpha3CompositeDisruptionMode item) {
      this.builder = new V1alpha3CompositeDisruptionModeBuilder(this, item);
    }
  
    public N and() {
      return (N) V1alpha3CompositePodGroupSpecFluent.this.withDisruptionMode(builder.build());
    }
    
    public N endDisruptionMode() {
      return and();
    }
    
  }
  public class SchedulingConstraintsNested<N> extends V1alpha3CompositePodGroupSchedulingConstraintsFluent<SchedulingConstraintsNested<N>> implements Nested<N>{
  
    V1alpha3CompositePodGroupSchedulingConstraintsBuilder builder;
  
    SchedulingConstraintsNested(V1alpha3CompositePodGroupSchedulingConstraints item) {
      this.builder = new V1alpha3CompositePodGroupSchedulingConstraintsBuilder(this, item);
    }
  
    public N and() {
      return (N) V1alpha3CompositePodGroupSpecFluent.this.withSchedulingConstraints(builder.build());
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
      return (N) V1alpha3CompositePodGroupSpecFluent.this.withSchedulingPolicy(builder.build());
    }
    
    public N endSchedulingPolicy() {
      return and();
    }
    
  }
  public class WorkloadRefNested<N> extends V1alpha3WorkloadReferenceFluent<WorkloadRefNested<N>> implements Nested<N>{
  
    V1alpha3WorkloadReferenceBuilder builder;
  
    WorkloadRefNested(V1alpha3WorkloadReference item) {
      this.builder = new V1alpha3WorkloadReferenceBuilder(this, item);
    }
  
    public N and() {
      return (N) V1alpha3CompositePodGroupSpecFluent.this.withWorkloadRef(builder.build());
    }
    
    public N endWorkloadRef() {
      return and();
    }
    
  }
}