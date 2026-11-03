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
public class V1JobSchedulingConfigurationFluent<A extends V1JobSchedulingConfigurationFluent<A>> extends BaseFluent<A>{

  private V1alpha3WorkloadPodGroupDisruptionModeBuilder disruptionMode;
  private ArrayList<V1alpha3WorkloadPodGroupResourceClaimBuilder> resourceClaims;
  private V1alpha3WorkloadPodGroupSchedulingConstraintsBuilder schedulingConstraints;
  private V1alpha3WorkloadPodGroupSchedulingPolicyBuilder schedulingPolicy;

  public V1JobSchedulingConfigurationFluent() {
  }
  
  public V1JobSchedulingConfigurationFluent(V1JobSchedulingConfiguration instance) {
    this.copyInstance(instance);
  }

  public A addAllToResourceClaims(Collection<V1alpha3WorkloadPodGroupResourceClaim> items) {
    if (this.resourceClaims == null) {
      this.resourceClaims = new ArrayList<>();
    }
    for (V1alpha3WorkloadPodGroupResourceClaim item : items) {
        V1alpha3WorkloadPodGroupResourceClaimBuilder builder = new V1alpha3WorkloadPodGroupResourceClaimBuilder(item);
        this._visitables.get("resourceClaims").add(builder);
        this.resourceClaims.add(builder);
    }
    return (A) this;
  }
  
  public ResourceClaimsNested<A> addNewResourceClaim() {
    return new ResourceClaimsNested<>(-1, null);
  }
  
  public ResourceClaimsNested<A> addNewResourceClaimLike(V1alpha3WorkloadPodGroupResourceClaim item) {
    return new ResourceClaimsNested<>(-1, item);
  }
  
  public A addToResourceClaims(V1alpha3WorkloadPodGroupResourceClaim... items) {
    if (this.resourceClaims == null) {
      this.resourceClaims = new ArrayList<>();
    }
    for (V1alpha3WorkloadPodGroupResourceClaim item : items) {
        V1alpha3WorkloadPodGroupResourceClaimBuilder builder = new V1alpha3WorkloadPodGroupResourceClaimBuilder(item);
        this._visitables.get("resourceClaims").add(builder);
        this.resourceClaims.add(builder);
    }
    return (A) this;
  }
  
  public A addToResourceClaims(int index,V1alpha3WorkloadPodGroupResourceClaim item) {
    if (this.resourceClaims == null) {
      this.resourceClaims = new ArrayList<>();
    }
    V1alpha3WorkloadPodGroupResourceClaimBuilder builder = new V1alpha3WorkloadPodGroupResourceClaimBuilder(item);
    if (index < 0 || index >= this.resourceClaims.size()) {
        this._visitables.get("resourceClaims").add(builder);
        this.resourceClaims.add(builder);
    } else {
        this._visitables.get("resourceClaims").add(builder);
        this.resourceClaims.add(index, builder);
    }
    return (A) this;
  }
  
  public V1alpha3WorkloadPodGroupDisruptionMode buildDisruptionMode() {
    return this.disruptionMode != null ? this.disruptionMode.build() : null;
  }
  
  public V1alpha3WorkloadPodGroupResourceClaim buildFirstResourceClaim() {
    return this.resourceClaims.get(0).build();
  }
  
  public V1alpha3WorkloadPodGroupResourceClaim buildLastResourceClaim() {
    return this.resourceClaims.get(resourceClaims.size() - 1).build();
  }
  
  public V1alpha3WorkloadPodGroupResourceClaim buildMatchingResourceClaim(Predicate<V1alpha3WorkloadPodGroupResourceClaimBuilder> predicate) {
      for (V1alpha3WorkloadPodGroupResourceClaimBuilder item : resourceClaims) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public V1alpha3WorkloadPodGroupResourceClaim buildResourceClaim(int index) {
    return this.resourceClaims.get(index).build();
  }
  
  public List<V1alpha3WorkloadPodGroupResourceClaim> buildResourceClaims() {
    return this.resourceClaims != null ? build(resourceClaims) : null;
  }
  
  public V1alpha3WorkloadPodGroupSchedulingConstraints buildSchedulingConstraints() {
    return this.schedulingConstraints != null ? this.schedulingConstraints.build() : null;
  }
  
  public V1alpha3WorkloadPodGroupSchedulingPolicy buildSchedulingPolicy() {
    return this.schedulingPolicy != null ? this.schedulingPolicy.build() : null;
  }
  
  protected void copyInstance(V1JobSchedulingConfiguration instance) {
    instance = instance != null ? instance : new V1JobSchedulingConfiguration();
    if (instance != null) {
        this.withDisruptionMode(instance.getDisruptionMode());
        this.withResourceClaims(instance.getResourceClaims());
        this.withSchedulingConstraints(instance.getSchedulingConstraints());
        this.withSchedulingPolicy(instance.getSchedulingPolicy());
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
  
  public ResourceClaimsNested<A> editMatchingResourceClaim(Predicate<V1alpha3WorkloadPodGroupResourceClaimBuilder> predicate) {
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
    return this.withNewDisruptionModeLike(Optional.ofNullable(this.buildDisruptionMode()).orElse(new V1alpha3WorkloadPodGroupDisruptionModeBuilder().build()));
  }
  
  public DisruptionModeNested<A> editOrNewDisruptionModeLike(V1alpha3WorkloadPodGroupDisruptionMode item) {
    return this.withNewDisruptionModeLike(Optional.ofNullable(this.buildDisruptionMode()).orElse(item));
  }
  
  public SchedulingConstraintsNested<A> editOrNewSchedulingConstraints() {
    return this.withNewSchedulingConstraintsLike(Optional.ofNullable(this.buildSchedulingConstraints()).orElse(new V1alpha3WorkloadPodGroupSchedulingConstraintsBuilder().build()));
  }
  
  public SchedulingConstraintsNested<A> editOrNewSchedulingConstraintsLike(V1alpha3WorkloadPodGroupSchedulingConstraints item) {
    return this.withNewSchedulingConstraintsLike(Optional.ofNullable(this.buildSchedulingConstraints()).orElse(item));
  }
  
  public SchedulingPolicyNested<A> editOrNewSchedulingPolicy() {
    return this.withNewSchedulingPolicyLike(Optional.ofNullable(this.buildSchedulingPolicy()).orElse(new V1alpha3WorkloadPodGroupSchedulingPolicyBuilder().build()));
  }
  
  public SchedulingPolicyNested<A> editOrNewSchedulingPolicyLike(V1alpha3WorkloadPodGroupSchedulingPolicy item) {
    return this.withNewSchedulingPolicyLike(Optional.ofNullable(this.buildSchedulingPolicy()).orElse(item));
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
    V1JobSchedulingConfigurationFluent<?> that = (V1JobSchedulingConfigurationFluent<?>) o;
    if (!(Objects.equals(disruptionMode, that.disruptionMode))) {
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
  
  public boolean hasDisruptionMode() {
    return this.disruptionMode != null;
  }
  
  public boolean hasMatchingResourceClaim(Predicate<V1alpha3WorkloadPodGroupResourceClaimBuilder> predicate) {
      for (V1alpha3WorkloadPodGroupResourceClaimBuilder item : resourceClaims) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
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
    return Objects.hash(disruptionMode, resourceClaims, schedulingConstraints, schedulingPolicy);
  }
  
  public A removeAllFromResourceClaims(Collection<V1alpha3WorkloadPodGroupResourceClaim> items) {
    if (this.resourceClaims == null) {
      return (A) this;
    }
    for (V1alpha3WorkloadPodGroupResourceClaim item : items) {
        V1alpha3WorkloadPodGroupResourceClaimBuilder builder = new V1alpha3WorkloadPodGroupResourceClaimBuilder(item);
        _visitables.get("resourceClaims").remove(builder);
        this.resourceClaims.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromResourceClaims(V1alpha3WorkloadPodGroupResourceClaim... items) {
    if (this.resourceClaims == null) {
      return (A) this;
    }
    for (V1alpha3WorkloadPodGroupResourceClaim item : items) {
        V1alpha3WorkloadPodGroupResourceClaimBuilder builder = new V1alpha3WorkloadPodGroupResourceClaimBuilder(item);
        _visitables.get("resourceClaims").remove(builder);
        this.resourceClaims.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromResourceClaims(Predicate<V1alpha3WorkloadPodGroupResourceClaimBuilder> predicate) {
    if (resourceClaims == null) {
      return (A) this;
    }
    Iterator<V1alpha3WorkloadPodGroupResourceClaimBuilder> each = resourceClaims.iterator();
    @SuppressWarnings({"rawtypes"})
    List visitables = this._visitables.get("resourceClaims");
    while (each.hasNext()) {
        V1alpha3WorkloadPodGroupResourceClaimBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public ResourceClaimsNested<A> setNewResourceClaimLike(int index,V1alpha3WorkloadPodGroupResourceClaim item) {
    return new ResourceClaimsNested<>(index, item);
  }
  
  public A setToResourceClaims(int index,V1alpha3WorkloadPodGroupResourceClaim item) {
    if (this.resourceClaims == null) {
      this.resourceClaims = new ArrayList<>();
    }
    V1alpha3WorkloadPodGroupResourceClaimBuilder builder = new V1alpha3WorkloadPodGroupResourceClaimBuilder(item);
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
  
  public A withDisruptionMode(V1alpha3WorkloadPodGroupDisruptionMode disruptionMode) {
    this._visitables.remove("disruptionMode");
    if (disruptionMode != null) {
        this.disruptionMode = new V1alpha3WorkloadPodGroupDisruptionModeBuilder(disruptionMode);
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
  
  public DisruptionModeNested<A> withNewDisruptionModeLike(V1alpha3WorkloadPodGroupDisruptionMode item) {
    return new DisruptionModeNested<>(item);
  }
  
  public SchedulingConstraintsNested<A> withNewSchedulingConstraints() {
    return new SchedulingConstraintsNested<>(null);
  }
  
  public SchedulingConstraintsNested<A> withNewSchedulingConstraintsLike(V1alpha3WorkloadPodGroupSchedulingConstraints item) {
    return new SchedulingConstraintsNested<>(item);
  }
  
  public SchedulingPolicyNested<A> withNewSchedulingPolicy() {
    return new SchedulingPolicyNested<>(null);
  }
  
  public SchedulingPolicyNested<A> withNewSchedulingPolicyLike(V1alpha3WorkloadPodGroupSchedulingPolicy item) {
    return new SchedulingPolicyNested<>(item);
  }
  
  public A withResourceClaims(List<V1alpha3WorkloadPodGroupResourceClaim> resourceClaims) {
    if (this.resourceClaims != null) {
      this._visitables.get("resourceClaims").clear();
    }
    if (resourceClaims != null) {
        this.resourceClaims = new ArrayList<>();
        for (V1alpha3WorkloadPodGroupResourceClaim item : resourceClaims) {
          this.addToResourceClaims(item);
        }
    } else {
      this.resourceClaims = null;
    }
    return (A) this;
  }
  
  public A withResourceClaims(V1alpha3WorkloadPodGroupResourceClaim... resourceClaims) {
    if (this.resourceClaims != null) {
        this.resourceClaims.clear();
        _visitables.remove("resourceClaims");
    }
    if (resourceClaims != null) {
      for (V1alpha3WorkloadPodGroupResourceClaim item : resourceClaims) {
        this.addToResourceClaims(item);
      }
    }
    return (A) this;
  }
  
  public A withSchedulingConstraints(V1alpha3WorkloadPodGroupSchedulingConstraints schedulingConstraints) {
    this._visitables.remove("schedulingConstraints");
    if (schedulingConstraints != null) {
        this.schedulingConstraints = new V1alpha3WorkloadPodGroupSchedulingConstraintsBuilder(schedulingConstraints);
        this._visitables.get("schedulingConstraints").add(this.schedulingConstraints);
    } else {
        this._visitables.get("schedulingConstraints").remove(this.schedulingConstraints);
        this.schedulingConstraints = null;
    }
    return (A) this;
  }
  
  public A withSchedulingPolicy(V1alpha3WorkloadPodGroupSchedulingPolicy schedulingPolicy) {
    this._visitables.remove("schedulingPolicy");
    if (schedulingPolicy != null) {
        this.schedulingPolicy = new V1alpha3WorkloadPodGroupSchedulingPolicyBuilder(schedulingPolicy);
        this._visitables.get("schedulingPolicy").add(this.schedulingPolicy);
    } else {
        this._visitables.get("schedulingPolicy").remove(this.schedulingPolicy);
        this.schedulingPolicy = null;
    }
    return (A) this;
  }
  public class DisruptionModeNested<N> extends V1alpha3WorkloadPodGroupDisruptionModeFluent<DisruptionModeNested<N>> implements Nested<N>{
  
    V1alpha3WorkloadPodGroupDisruptionModeBuilder builder;
  
    DisruptionModeNested(V1alpha3WorkloadPodGroupDisruptionMode item) {
      this.builder = new V1alpha3WorkloadPodGroupDisruptionModeBuilder(this, item);
    }
  
    public N and() {
      return (N) V1JobSchedulingConfigurationFluent.this.withDisruptionMode(builder.build());
    }
    
    public N endDisruptionMode() {
      return and();
    }
    
  }
  public class ResourceClaimsNested<N> extends V1alpha3WorkloadPodGroupResourceClaimFluent<ResourceClaimsNested<N>> implements Nested<N>{
  
    V1alpha3WorkloadPodGroupResourceClaimBuilder builder;
    int index;
  
    ResourceClaimsNested(int index,V1alpha3WorkloadPodGroupResourceClaim item) {
      this.index = index;
      this.builder = new V1alpha3WorkloadPodGroupResourceClaimBuilder(this, item);
    }
  
    public N and() {
      return (N) V1JobSchedulingConfigurationFluent.this.setToResourceClaims(index, builder.build());
    }
    
    public N endResourceClaim() {
      return and();
    }
    
  }
  public class SchedulingConstraintsNested<N> extends V1alpha3WorkloadPodGroupSchedulingConstraintsFluent<SchedulingConstraintsNested<N>> implements Nested<N>{
  
    V1alpha3WorkloadPodGroupSchedulingConstraintsBuilder builder;
  
    SchedulingConstraintsNested(V1alpha3WorkloadPodGroupSchedulingConstraints item) {
      this.builder = new V1alpha3WorkloadPodGroupSchedulingConstraintsBuilder(this, item);
    }
  
    public N and() {
      return (N) V1JobSchedulingConfigurationFluent.this.withSchedulingConstraints(builder.build());
    }
    
    public N endSchedulingConstraints() {
      return and();
    }
    
  }
  public class SchedulingPolicyNested<N> extends V1alpha3WorkloadPodGroupSchedulingPolicyFluent<SchedulingPolicyNested<N>> implements Nested<N>{
  
    V1alpha3WorkloadPodGroupSchedulingPolicyBuilder builder;
  
    SchedulingPolicyNested(V1alpha3WorkloadPodGroupSchedulingPolicy item) {
      this.builder = new V1alpha3WorkloadPodGroupSchedulingPolicyBuilder(this, item);
    }
  
    public N and() {
      return (N) V1JobSchedulingConfigurationFluent.this.withSchedulingPolicy(builder.build());
    }
    
    public N endSchedulingPolicy() {
      return and();
    }
    
  }
}