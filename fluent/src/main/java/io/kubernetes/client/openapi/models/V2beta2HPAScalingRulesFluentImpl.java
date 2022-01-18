/*
Copyright 2022 The Kubernetes Authors.
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

import java.util.Iterator;
import java.util.List;

/** Generated */
public class V2beta2HPAScalingRulesFluentImpl<
        A extends io.kubernetes.client.openapi.models.V2beta2HPAScalingRulesFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V2beta2HPAScalingRulesFluent<A> {
  public V2beta2HPAScalingRulesFluentImpl() {}

  public V2beta2HPAScalingRulesFluentImpl(
      io.kubernetes.client.openapi.models.V2beta2HPAScalingRules instance) {
    this.withPolicies(instance.getPolicies());

    this.withSelectPolicy(instance.getSelectPolicy());

    this.withStabilizationWindowSeconds(instance.getStabilizationWindowSeconds());
  }

  private java.util.ArrayList<io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicyBuilder>
      policies;
  private java.lang.String selectPolicy;
  private java.lang.Integer stabilizationWindowSeconds;

  public A addToPolicies(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicy item) {
    if (this.policies == null) {
      this.policies =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicyBuilder>();
    }
    io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicyBuilder builder =
        new io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicyBuilder(item);
    _visitables
        .get("policies")
        .add(index >= 0 ? index : _visitables.get("policies").size(), builder);
    this.policies.add(index >= 0 ? index : policies.size(), builder);
    return (A) this;
  }

  public A setToPolicies(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicy item) {
    if (this.policies == null) {
      this.policies =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicyBuilder>();
    }
    io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicyBuilder builder =
        new io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicyBuilder(item);
    if (index < 0 || index >= _visitables.get("policies").size()) {
      _visitables.get("policies").add(builder);
    } else {
      _visitables.get("policies").set(index, builder);
    }
    if (index < 0 || index >= policies.size()) {
      policies.add(builder);
    } else {
      policies.set(index, builder);
    }
    return (A) this;
  }

  public A addToPolicies(io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicy... items) {
    if (this.policies == null) {
      this.policies =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicyBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicy item : items) {
      io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicyBuilder builder =
          new io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicyBuilder(item);
      _visitables.get("policies").add(builder);
      this.policies.add(builder);
    }
    return (A) this;
  }

  public A addAllToPolicies(
      java.util.Collection<io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicy> items) {
    if (this.policies == null) {
      this.policies =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicyBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicy item : items) {
      io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicyBuilder builder =
          new io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicyBuilder(item);
      _visitables.get("policies").add(builder);
      this.policies.add(builder);
    }
    return (A) this;
  }

  public A removeFromPolicies(
      io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicy... items) {
    for (io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicy item : items) {
      io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicyBuilder builder =
          new io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicyBuilder(item);
      _visitables.get("policies").remove(builder);
      if (this.policies != null) {
        this.policies.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromPolicies(
      java.util.Collection<io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicy> items) {
    for (io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicy item : items) {
      io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicyBuilder builder =
          new io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicyBuilder(item);
      _visitables.get("policies").remove(builder);
      if (this.policies != null) {
        this.policies.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromPolicies(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicyBuilder>
          predicate) {
    if (policies == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicyBuilder> each =
        policies.iterator();
    final List visitables = _visitables.get("policies");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicyBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildPolicies instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicy> getPolicies() {
    return policies != null ? build(policies) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicy>
      buildPolicies() {
    return policies != null ? build(policies) : null;
  }

  public io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicy buildPolicy(
      java.lang.Integer index) {
    return this.policies.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicy buildFirstPolicy() {
    return this.policies.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicy buildLastPolicy() {
    return this.policies.get(policies.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicy buildMatchingPolicy(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicyBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicyBuilder item : policies) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingPolicy(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicyBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicyBuilder item : policies) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withPolicies(
      java.util.List<io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicy> policies) {
    if (this.policies != null) {
      _visitables.get("policies").removeAll(this.policies);
    }
    if (policies != null) {
      this.policies = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicy item : policies) {
        this.addToPolicies(item);
      }
    } else {
      this.policies = null;
    }
    return (A) this;
  }

  public A withPolicies(io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicy... policies) {
    if (this.policies != null) {
      this.policies.clear();
    }
    if (policies != null) {
      for (io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicy item : policies) {
        this.addToPolicies(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasPolicies() {
    return policies != null && !policies.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V2beta2HPAScalingRulesFluent.PoliciesNested<A>
      addNewPolicy() {
    return new io.kubernetes.client.openapi.models.V2beta2HPAScalingRulesFluentImpl
        .PoliciesNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V2beta2HPAScalingRulesFluent.PoliciesNested<A>
      addNewPolicyLike(io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicy item) {
    return new io.kubernetes.client.openapi.models.V2beta2HPAScalingRulesFluentImpl
        .PoliciesNestedImpl(-1, item);
  }

  public io.kubernetes.client.openapi.models.V2beta2HPAScalingRulesFluent.PoliciesNested<A>
      setNewPolicyLike(
          java.lang.Integer index,
          io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicy item) {
    return new io.kubernetes.client.openapi.models.V2beta2HPAScalingRulesFluentImpl
        .PoliciesNestedImpl(index, item);
  }

  public io.kubernetes.client.openapi.models.V2beta2HPAScalingRulesFluent.PoliciesNested<A>
      editPolicy(java.lang.Integer index) {
    if (policies.size() <= index)
      throw new RuntimeException("Can't edit policies. Index exceeds size.");
    return setNewPolicyLike(index, buildPolicy(index));
  }

  public io.kubernetes.client.openapi.models.V2beta2HPAScalingRulesFluent.PoliciesNested<A>
      editFirstPolicy() {
    if (policies.size() == 0)
      throw new RuntimeException("Can't edit first policies. The list is empty.");
    return setNewPolicyLike(0, buildPolicy(0));
  }

  public io.kubernetes.client.openapi.models.V2beta2HPAScalingRulesFluent.PoliciesNested<A>
      editLastPolicy() {
    int index = policies.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last policies. The list is empty.");
    return setNewPolicyLike(index, buildPolicy(index));
  }

  public io.kubernetes.client.openapi.models.V2beta2HPAScalingRulesFluent.PoliciesNested<A>
      editMatchingPolicy(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicyBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < policies.size(); i++) {
      if (predicate.test(policies.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0) throw new RuntimeException("Can't edit matching policies. No match found.");
    return setNewPolicyLike(index, buildPolicy(index));
  }

  public java.lang.String getSelectPolicy() {
    return this.selectPolicy;
  }

  public A withSelectPolicy(java.lang.String selectPolicy) {
    this.selectPolicy = selectPolicy;
    return (A) this;
  }

  public java.lang.Boolean hasSelectPolicy() {
    return this.selectPolicy != null;
  }

  /** Method is deprecated. use withSelectPolicy instead. */
  @java.lang.Deprecated
  public A withNewSelectPolicy(java.lang.String original) {
    return (A) withSelectPolicy(new String(original));
  }

  public java.lang.Integer getStabilizationWindowSeconds() {
    return this.stabilizationWindowSeconds;
  }

  public A withStabilizationWindowSeconds(java.lang.Integer stabilizationWindowSeconds) {
    this.stabilizationWindowSeconds = stabilizationWindowSeconds;
    return (A) this;
  }

  public java.lang.Boolean hasStabilizationWindowSeconds() {
    return this.stabilizationWindowSeconds != null;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V2beta2HPAScalingRulesFluentImpl that = (V2beta2HPAScalingRulesFluentImpl) o;
    if (policies != null ? !policies.equals(that.policies) : that.policies != null) return false;
    if (selectPolicy != null ? !selectPolicy.equals(that.selectPolicy) : that.selectPolicy != null)
      return false;
    if (stabilizationWindowSeconds != null
        ? !stabilizationWindowSeconds.equals(that.stabilizationWindowSeconds)
        : that.stabilizationWindowSeconds != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        policies, selectPolicy, stabilizationWindowSeconds, super.hashCode());
  }

  public class PoliciesNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicyFluentImpl<
          io.kubernetes.client.openapi.models.V2beta2HPAScalingRulesFluent.PoliciesNested<N>>
      implements io.kubernetes.client.openapi.models.V2beta2HPAScalingRulesFluent.PoliciesNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    PoliciesNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicy item) {
      this.index = index;
      this.builder =
          new io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicyBuilder(this, item);
    }

    PoliciesNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicyBuilder(this);
    }

    io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicyBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V2beta2HPAScalingRulesFluentImpl.this.setToPolicies(index, builder.build());
    }

    public N endPolicy() {
      return and();
    }
  }
}
