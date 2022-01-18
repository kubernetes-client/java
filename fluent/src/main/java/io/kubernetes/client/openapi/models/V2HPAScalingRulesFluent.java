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

/** Generated */
public interface V2HPAScalingRulesFluent<
        A extends io.kubernetes.client.openapi.models.V2HPAScalingRulesFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public A addToPolicies(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V2HPAScalingPolicy item);

  public A setToPolicies(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V2HPAScalingPolicy item);

  public A addToPolicies(io.kubernetes.client.openapi.models.V2HPAScalingPolicy... items);

  public A addAllToPolicies(
      java.util.Collection<io.kubernetes.client.openapi.models.V2HPAScalingPolicy> items);

  public A removeFromPolicies(io.kubernetes.client.openapi.models.V2HPAScalingPolicy... items);

  public A removeAllFromPolicies(
      java.util.Collection<io.kubernetes.client.openapi.models.V2HPAScalingPolicy> items);

  public A removeMatchingFromPolicies(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V2HPAScalingPolicyBuilder>
          predicate);

  /**
   * This method has been deprecated, please use method buildPolicies instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V2HPAScalingPolicy> getPolicies();

  public java.util.List<io.kubernetes.client.openapi.models.V2HPAScalingPolicy> buildPolicies();

  public io.kubernetes.client.openapi.models.V2HPAScalingPolicy buildPolicy(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V2HPAScalingPolicy buildFirstPolicy();

  public io.kubernetes.client.openapi.models.V2HPAScalingPolicy buildLastPolicy();

  public io.kubernetes.client.openapi.models.V2HPAScalingPolicy buildMatchingPolicy(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V2HPAScalingPolicyBuilder>
          predicate);

  public java.lang.Boolean hasMatchingPolicy(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V2HPAScalingPolicyBuilder>
          predicate);

  public A withPolicies(
      java.util.List<io.kubernetes.client.openapi.models.V2HPAScalingPolicy> policies);

  public A withPolicies(io.kubernetes.client.openapi.models.V2HPAScalingPolicy... policies);

  public java.lang.Boolean hasPolicies();

  public io.kubernetes.client.openapi.models.V2HPAScalingRulesFluent.PoliciesNested<A>
      addNewPolicy();

  public io.kubernetes.client.openapi.models.V2HPAScalingRulesFluent.PoliciesNested<A>
      addNewPolicyLike(io.kubernetes.client.openapi.models.V2HPAScalingPolicy item);

  public io.kubernetes.client.openapi.models.V2HPAScalingRulesFluent.PoliciesNested<A>
      setNewPolicyLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V2HPAScalingPolicy item);

  public io.kubernetes.client.openapi.models.V2HPAScalingRulesFluent.PoliciesNested<A> editPolicy(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V2HPAScalingRulesFluent.PoliciesNested<A>
      editFirstPolicy();

  public io.kubernetes.client.openapi.models.V2HPAScalingRulesFluent.PoliciesNested<A>
      editLastPolicy();

  public io.kubernetes.client.openapi.models.V2HPAScalingRulesFluent.PoliciesNested<A>
      editMatchingPolicy(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V2HPAScalingPolicyBuilder>
              predicate);

  public java.lang.String getSelectPolicy();

  public A withSelectPolicy(java.lang.String selectPolicy);

  public java.lang.Boolean hasSelectPolicy();

  /** Method is deprecated. use withSelectPolicy instead. */
  @java.lang.Deprecated
  public A withNewSelectPolicy(java.lang.String original);

  public java.lang.Integer getStabilizationWindowSeconds();

  public A withStabilizationWindowSeconds(java.lang.Integer stabilizationWindowSeconds);

  public java.lang.Boolean hasStabilizationWindowSeconds();

  public interface PoliciesNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V2HPAScalingPolicyFluent<
              io.kubernetes.client.openapi.models.V2HPAScalingRulesFluent.PoliciesNested<N>> {
    public N and();

    public N endPolicy();
  }
}
